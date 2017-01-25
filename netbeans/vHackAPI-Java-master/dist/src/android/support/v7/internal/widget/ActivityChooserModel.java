// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class ActivityChooserModel extends DataSetObservable
{

    private static final String ATTRIBUTE_ACTIVITY = "activity";
    private static final String ATTRIBUTE_TIME = "time";
    private static final String ATTRIBUTE_WEIGHT = "weight";
    private static final boolean DEBUG = false;
    private static final int DEFAULT_ACTIVITY_INFLATION = 5;
    private static final float DEFAULT_HISTORICAL_RECORD_WEIGHT = 1F;
    public static final String DEFAULT_HISTORY_FILE_NAME = "activity_choser_model_history.xml";
    public static final int DEFAULT_HISTORY_MAX_LENGTH = 50;
    private static final String HISTORY_FILE_EXTENSION = ".xml";
    private static final int INVALID_INDEX = -1;
    private static final String LOG_TAG = android/support/v7/internal/widget/ActivityChooserModel.getSimpleName();
    private static final String TAG_HISTORICAL_RECORD = "historical-record";
    private static final String TAG_HISTORICAL_RECORDS = "historical-records";
    private static final Map sDataModelRegistry = new HashMap();
    private static final Object sRegistryLock = new Object();
    private final List mActivities = new ArrayList();
    private OnChooseActivityListener mActivityChoserModelPolicy;
    private ActivitySorter mActivitySorter;
    private boolean mCanReadHistoricalData;
    private final Context mContext;
    private final List mHistoricalRecords = new ArrayList();
    private boolean mHistoricalRecordsChanged;
    private final String mHistoryFileName;
    private int mHistoryMaxSize;
    private final Object mInstanceLock = new Object();
    private Intent mIntent;
    private boolean mReadShareHistoryCalled;
    private boolean mReloadActivities;

    private ActivityChooserModel(Context context, String s)
    {
        mActivitySorter = new DefaultSorter(null);
        mHistoryMaxSize = 50;
        mCanReadHistoricalData = true;
        mReadShareHistoryCalled = false;
        mHistoricalRecordsChanged = true;
        mReloadActivities = false;
        mContext = context.getApplicationContext();
        if (!TextUtils.isEmpty(s) && !s.endsWith(".xml"))
        {
            mHistoryFileName = (new StringBuilder()).append(s).append(".xml").toString();
            return;
        } else
        {
            mHistoryFileName = s;
            return;
        }
    }

    private boolean addHisoricalRecord(HistoricalRecord historicalrecord)
    {
        boolean flag = mHistoricalRecords.add(historicalrecord);
        if (flag)
        {
            mHistoricalRecordsChanged = true;
            pruneExcessiveHistoricalRecordsIfNeeded();
            persistHistoricalDataIfNeeded();
            sortActivitiesIfNeeded();
            notifyChanged();
        }
        return flag;
    }

    private void ensureConsistentState()
    {
        boolean flag = loadActivitiesIfNeeded();
        boolean flag1 = readHistoricalDataIfNeeded();
        pruneExcessiveHistoricalRecordsIfNeeded();
        if (flag | flag1)
        {
            sortActivitiesIfNeeded();
            notifyChanged();
        }
    }

    public static ActivityChooserModel get(Context context, String s)
    {
        Object obj = sRegistryLock;
        obj;
        JVM INSTR monitorenter ;
        ActivityChooserModel activitychoosermodel1 = (ActivityChooserModel)sDataModelRegistry.get(s);
        ActivityChooserModel activitychoosermodel;
        activitychoosermodel = activitychoosermodel1;
        if (activitychoosermodel1 != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        activitychoosermodel = new ActivityChooserModel(context, s);
        sDataModelRegistry.put(s, activitychoosermodel);
        obj;
        JVM INSTR monitorexit ;
        return activitychoosermodel;
        context;
        throw context;
    }

    private boolean loadActivitiesIfNeeded()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (mReloadActivities)
        {
            flag = flag1;
            if (mIntent != null)
            {
                mReloadActivities = false;
                mActivities.clear();
                List list = mContext.getPackageManager().queryIntentActivities(mIntent, 0);
                int j = list.size();
                for (int i = 0; i < j; i++)
                {
                    ResolveInfo resolveinfo = (ResolveInfo)list.get(i);
                    mActivities.add(new ActivityResolveInfo(resolveinfo));
                }

                flag = true;
            }
        }
        return flag;
    }

    private void persistHistoricalDataIfNeeded()
    {
        if (!mReadShareHistoryCalled)
        {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
        if (mHistoricalRecordsChanged)
        {
            mHistoricalRecordsChanged = false;
            if (!TextUtils.isEmpty(mHistoryFileName))
            {
                PersistHistoryAsyncTask persisthistoryasynctask = new PersistHistoryAsyncTask(null);
                Object aobj[] = new Object[2];
                aobj[0] = mHistoricalRecords;
                aobj[1] = mHistoryFileName;
                if (android.os.Build.VERSION.SDK_INT >= 11)
                {
                    persisthistoryasynctask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, aobj);
                    return;
                } else
                {
                    persisthistoryasynctask.execute(aobj);
                    return;
                }
            }
        }
    }

    private void pruneExcessiveHistoricalRecordsIfNeeded()
    {
        int j = mHistoricalRecords.size() - mHistoryMaxSize;
        if (j > 0)
        {
            mHistoricalRecordsChanged = true;
            int i = 0;
            while (i < j) 
            {
                mHistoricalRecords.remove(0);
                i++;
            }
        }
    }

    private boolean readHistoricalDataIfNeeded()
    {
        if (mCanReadHistoricalData && mHistoricalRecordsChanged && !TextUtils.isEmpty(mHistoryFileName))
        {
            mCanReadHistoricalData = false;
            mReadShareHistoryCalled = true;
            readHistoricalDataImpl();
            return true;
        } else
        {
            return false;
        }
    }

    private void readHistoricalDataImpl()
    {
        Object obj;
        Object obj1;
        Exception exception;
        List list;
        int i;
        try
        {
            obj = mContext.openFileInput(mHistoryFileName);
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            return;
        }
        obj1 = Xml.newPullParser();
        ((XmlPullParser) (obj1)).setInput(((java.io.InputStream) (obj)), null);
        i = 0;
_L1:
        if (i == 1 || i == 2)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        i = ((XmlPullParser) (obj1)).next();
          goto _L1
        if (!"historical-records".equals(((XmlPullParser) (obj1)).getName()))
        {
            throw new XmlPullParserException("Share records file does not start with historical-records tag.");
        }
          goto _L2
        obj1;
        Log.e(LOG_TAG, (new StringBuilder("Error reading historical recrod file: ")).append(mHistoryFileName).toString(), ((Throwable) (obj1)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        ((FileInputStream) (obj)).close();
_L6:
        return;
_L2:
        list = mHistoricalRecords;
        list.clear();
_L4:
        i = ((XmlPullParser) (obj1)).next();
        if (i == 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i == 3 || i == 4) goto _L4; else goto _L3
_L3:
        if (!"historical-record".equals(((XmlPullParser) (obj1)).getName()))
        {
            throw new XmlPullParserException("Share records file not well-formed.");
        }
        break MISSING_BLOCK_LABEL_215;
        obj1;
        Log.e(LOG_TAG, (new StringBuilder("Error reading historical recrod file: ")).append(mHistoryFileName).toString(), ((Throwable) (obj1)));
        if (obj == null) goto _L6; else goto _L5
_L5:
        try
        {
            ((FileInputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        list.add(new HistoricalRecord(((XmlPullParser) (obj1)).getAttributeValue(null, "activity"), Long.parseLong(((XmlPullParser) (obj1)).getAttributeValue(null, "time")), Float.parseFloat(((XmlPullParser) (obj1)).getAttributeValue(null, "weight"))));
          goto _L4
        exception;
        IOException ioexception;
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            catch (IOException ioexception1) { }
        }
        throw exception;
        if (obj == null) goto _L6; else goto _L7
_L7:
        try
        {
            ((FileInputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            return;
        }
        ioexception;
    }

    private boolean sortActivitiesIfNeeded()
    {
        if (mActivitySorter != null && mIntent != null && !mActivities.isEmpty() && !mHistoricalRecords.isEmpty())
        {
            mActivitySorter.sort(mIntent, mActivities, Collections.unmodifiableList(mHistoricalRecords));
            return true;
        } else
        {
            return false;
        }
    }

    public Intent chooseActivity(int i)
    {
label0:
        {
            synchronized (mInstanceLock)
            {
                if (mIntent != null)
                {
                    break label0;
                }
            }
            return null;
        }
        Object obj1;
        Intent intent;
        ensureConsistentState();
        obj1 = (ActivityResolveInfo)mActivities.get(i);
        obj1 = new ComponentName(((ActivityResolveInfo) (obj1)).resolveInfo.activityInfo.packageName, ((ActivityResolveInfo) (obj1)).resolveInfo.activityInfo.name);
        intent = new Intent(mIntent);
        intent.setComponent(((ComponentName) (obj1)));
        if (mActivityChoserModelPolicy == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        Intent intent1 = new Intent(intent);
        if (!mActivityChoserModelPolicy.onChooseActivity(this, intent1))
        {
            break MISSING_BLOCK_LABEL_121;
        }
        obj;
        JVM INSTR monitorexit ;
        return null;
        addHisoricalRecord(new HistoricalRecord(((ComponentName) (obj1)), System.currentTimeMillis(), 1.0F));
        obj;
        JVM INSTR monitorexit ;
        return intent;
        exception;
        throw exception;
    }

    public ResolveInfo getActivity(int i)
    {
        ResolveInfo resolveinfo;
        synchronized (mInstanceLock)
        {
            ensureConsistentState();
            resolveinfo = ((ActivityResolveInfo)mActivities.get(i)).resolveInfo;
        }
        return resolveinfo;
    }

    public int getActivityCount()
    {
        int i;
        synchronized (mInstanceLock)
        {
            ensureConsistentState();
            i = mActivities.size();
        }
        return i;
    }

    public int getActivityIndex(ResolveInfo resolveinfo)
    {
        Object obj = mInstanceLock;
        obj;
        JVM INSTR monitorenter ;
        List list;
        int j;
        ensureConsistentState();
        list = mActivities;
        j = list.size();
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((ActivityResolveInfo)list.get(i)).resolveInfo != resolveinfo)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        obj;
        JVM INSTR monitorexit ;
        return i;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return -1;
        resolveinfo;
        throw resolveinfo;
    }

    public ResolveInfo getDefaultActivity()
    {
        Object obj = mInstanceLock;
        obj;
        JVM INSTR monitorenter ;
        ResolveInfo resolveinfo;
        ensureConsistentState();
        if (mActivities.isEmpty())
        {
            break MISSING_BLOCK_LABEL_44;
        }
        resolveinfo = ((ActivityResolveInfo)mActivities.get(0)).resolveInfo;
        return resolveinfo;
        obj;
        JVM INSTR monitorexit ;
        return null;
        Exception exception;
        exception;
        throw exception;
    }

    public int getHistoryMaxSize()
    {
        int i;
        synchronized (mInstanceLock)
        {
            i = mHistoryMaxSize;
        }
        return i;
    }

    public int getHistorySize()
    {
        int i;
        synchronized (mInstanceLock)
        {
            ensureConsistentState();
            i = mHistoricalRecords.size();
        }
        return i;
    }

    public Intent getIntent()
    {
        Intent intent;
        synchronized (mInstanceLock)
        {
            intent = mIntent;
        }
        return intent;
    }

    public void setActivitySorter(ActivitySorter activitysorter)
    {
label0:
        {
            synchronized (mInstanceLock)
            {
                if (mActivitySorter != activitysorter)
                {
                    break label0;
                }
            }
            return;
        }
        mActivitySorter = activitysorter;
        if (sortActivitiesIfNeeded())
        {
            notifyChanged();
        }
        obj;
        JVM INSTR monitorexit ;
    }

    public void setDefaultActivity(int i)
    {
        Object obj = mInstanceLock;
        obj;
        JVM INSTR monitorenter ;
        ActivityResolveInfo activityresolveinfo;
        ActivityResolveInfo activityresolveinfo1;
        ensureConsistentState();
        activityresolveinfo = (ActivityResolveInfo)mActivities.get(i);
        activityresolveinfo1 = (ActivityResolveInfo)mActivities.get(0);
        if (activityresolveinfo1 == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        float f = (activityresolveinfo1.weight - activityresolveinfo.weight) + 5F;
_L1:
        addHisoricalRecord(new HistoricalRecord(new ComponentName(activityresolveinfo.resolveInfo.activityInfo.packageName, activityresolveinfo.resolveInfo.activityInfo.name), System.currentTimeMillis(), f));
        obj;
        JVM INSTR monitorexit ;
        return;
        f = 1.0F;
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    public void setHistoryMaxSize(int i)
    {
label0:
        {
            synchronized (mInstanceLock)
            {
                if (mHistoryMaxSize != i)
                {
                    break label0;
                }
            }
            return;
        }
        mHistoryMaxSize = i;
        pruneExcessiveHistoricalRecordsIfNeeded();
        if (sortActivitiesIfNeeded())
        {
            notifyChanged();
        }
        obj;
        JVM INSTR monitorexit ;
    }

    public void setIntent(Intent intent)
    {
label0:
        {
            synchronized (mInstanceLock)
            {
                if (mIntent != intent)
                {
                    break label0;
                }
            }
            return;
        }
        mIntent = intent;
        mReloadActivities = true;
        ensureConsistentState();
        obj;
        JVM INSTR monitorexit ;
    }

    public void setOnChooseActivityListener(OnChooseActivityListener onchooseactivitylistener)
    {
        synchronized (mInstanceLock)
        {
            mActivityChoserModelPolicy = onchooseactivitylistener;
        }
    }






/*
    static boolean access$502(ActivityChooserModel activitychoosermodel, boolean flag)
    {
        activitychoosermodel.mCanReadHistoricalData = flag;
        return flag;
    }

*/

    private class DefaultSorter
        implements ActivitySorter
    {

        private static final float WEIGHT_DECAY_COEFFICIENT = 0.95F;
        private final Map mPackageNameToActivityMap;
        final ActivityChooserModel this$0;

        public final void sort(Intent intent, List list, List list1)
        {
            intent = mPackageNameToActivityMap;
            intent.clear();
            int k = list.size();
            for (int i = 0; i < k; i++)
            {
                ActivityResolveInfo activityresolveinfo = (ActivityResolveInfo)list.get(i);
                activityresolveinfo.weight = 0.0F;
                intent.put(activityresolveinfo.resolveInfo.activityInfo.packageName, activityresolveinfo);
            }

            int j = list1.size();
            float f = 1.0F;
            for (j--; j >= 0; j--)
            {
                HistoricalRecord historicalrecord = (HistoricalRecord)list1.get(j);
                ActivityResolveInfo activityresolveinfo1 = (ActivityResolveInfo)intent.get(historicalrecord.activity.getPackageName());
                if (activityresolveinfo1 != null)
                {
                    float f1 = activityresolveinfo1.weight;
                    activityresolveinfo1.weight = historicalrecord.weight * f + f1;
                    f = 0.95F * f;
                }
            }

            Collections.sort(list);
        }

        private DefaultSorter()
        {
            this$0 = ActivityChooserModel.this;
            super();
            mPackageNameToActivityMap = new HashMap();
        }

        DefaultSorter(_cls1 _pcls1)
        {
            this();
        }
    }


    private class ActivityResolveInfo
        implements Comparable
    {

        public final ResolveInfo resolveInfo;
        final ActivityChooserModel this$0;
        public float weight;

        public final int compareTo(ActivityResolveInfo activityresolveinfo)
        {
            return Float.floatToIntBits(activityresolveinfo.weight) - Float.floatToIntBits(weight);
        }

        public final volatile int compareTo(Object obj)
        {
            return compareTo((ActivityResolveInfo)obj);
        }

        public final boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null)
                {
                    return false;
                }
                if (getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (ActivityResolveInfo)obj;
                if (Float.floatToIntBits(weight) != Float.floatToIntBits(((ActivityResolveInfo) (obj)).weight))
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return Float.floatToIntBits(weight) + 31;
        }

        public final String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("[");
            stringbuilder.append("resolveInfo:").append(resolveInfo.toString());
            stringbuilder.append("; weight:").append(new BigDecimal(weight));
            stringbuilder.append("]");
            return stringbuilder.toString();
        }

        public ActivityResolveInfo(ResolveInfo resolveinfo)
        {
            this$0 = ActivityChooserModel.this;
            super();
            resolveInfo = resolveinfo;
        }
    }


    private class PersistHistoryAsyncTask extends AsyncTask
    {

        final ActivityChooserModel this$0;

        public final volatile Object doInBackground(Object aobj[])
        {
            return doInBackground(aobj);
        }

        public final transient Void doInBackground(Object aobj[])
        {
            List list;
            Object obj1;
            int i;
            i = 0;
            list = (List)aobj[0];
            obj1 = (String)aobj[1];
            aobj = mContext.openFileOutput(((String) (obj1)), 0);
            obj1 = Xml.newSerializer();
            int j;
            ((XmlSerializer) (obj1)).setOutput(((java.io.OutputStream) (aobj)), null);
            ((XmlSerializer) (obj1)).startDocument("UTF-8", Boolean.valueOf(true));
            ((XmlSerializer) (obj1)).startTag(null, "historical-records");
            j = list.size();
_L2:
            if (i >= j)
            {
                break; /* Loop/switch isn't completed */
            }
            HistoricalRecord historicalrecord = (HistoricalRecord)list.remove(0);
            ((XmlSerializer) (obj1)).startTag(null, "historical-record");
            ((XmlSerializer) (obj1)).attribute(null, "activity", historicalrecord.activity.flattenToString());
            ((XmlSerializer) (obj1)).attribute(null, "time", String.valueOf(historicalrecord.time));
            ((XmlSerializer) (obj1)).attribute(null, "weight", String.valueOf(historicalrecord.weight));
            ((XmlSerializer) (obj1)).endTag(null, "historical-record");
            i++;
            if (true) goto _L2; else goto _L1
            aobj;
            Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder("Error writing historical recrod file: ")).append(((String) (obj1))).toString(), ((Throwable) (aobj)));
_L3:
            return null;
_L1:
            ((XmlSerializer) (obj1)).endTag(null, "historical-records");
            ((XmlSerializer) (obj1)).endDocument();
            mCanReadHistoricalData = true;
            if (aobj != null)
            {
                try
                {
                    ((FileOutputStream) (aobj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object aobj[])
                {
                    return null;
                }
                return null;
            }
              goto _L3
            Object obj;
            obj;
            Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder("Error writing historical recrod file: ")).append(mHistoryFileName).toString(), ((Throwable) (obj)));
            mCanReadHistoricalData = true;
            if (aobj != null)
            {
                try
                {
                    ((FileOutputStream) (aobj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object aobj[])
                {
                    return null;
                }
                return null;
            }
              goto _L3
            obj;
            Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder("Error writing historical recrod file: ")).append(mHistoryFileName).toString(), ((Throwable) (obj)));
            mCanReadHistoricalData = true;
            if (aobj != null)
            {
                try
                {
                    ((FileOutputStream) (aobj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object aobj[])
                {
                    return null;
                }
                return null;
            }
              goto _L3
            obj;
            Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder("Error writing historical recrod file: ")).append(mHistoryFileName).toString(), ((Throwable) (obj)));
            mCanReadHistoricalData = true;
            if (aobj == null) goto _L3; else goto _L4
_L4:
            try
            {
                ((FileOutputStream) (aobj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[])
            {
                return null;
            }
            return null;
            obj;
            mCanReadHistoricalData = true;
            if (aobj != null)
            {
                try
                {
                    ((FileOutputStream) (aobj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object aobj[]) { }
            }
            throw obj;
        }

        private PersistHistoryAsyncTask()
        {
            this$0 = ActivityChooserModel.this;
            super();
        }

        PersistHistoryAsyncTask(_cls1 _pcls1)
        {
            this();
        }
    }


    private class HistoricalRecord
    {

        public final ComponentName activity;
        public final long time;
        public final float weight;

        public final boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null)
                {
                    return false;
                }
                if (getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (HistoricalRecord)obj;
                if (activity == null)
                {
                    if (((HistoricalRecord) (obj)).activity != null)
                    {
                        return false;
                    }
                } else
                if (!activity.equals(((HistoricalRecord) (obj)).activity))
                {
                    return false;
                }
                if (time != ((HistoricalRecord) (obj)).time)
                {
                    return false;
                }
                if (Float.floatToIntBits(weight) != Float.floatToIntBits(((HistoricalRecord) (obj)).weight))
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            int i;
            if (activity == null)
            {
                i = 0;
            } else
            {
                i = activity.hashCode();
            }
            return ((i + 31) * 31 + (int)(time ^ time >>> 32)) * 31 + Float.floatToIntBits(weight);
        }

        public final String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("[");
            stringbuilder.append("; activity:").append(activity);
            stringbuilder.append("; time:").append(time);
            stringbuilder.append("; weight:").append(new BigDecimal(weight));
            stringbuilder.append("]");
            return stringbuilder.toString();
        }

        public HistoricalRecord(ComponentName componentname, long l, float f)
        {
            activity = componentname;
            time = l;
            weight = f;
        }

        public HistoricalRecord(String s, long l, float f)
        {
            this(ComponentName.unflattenFromString(s), l, f);
        }
    }


    private class ActivitySorter
    {

        public abstract void sort(Intent intent, List list, List list1);
    }


    private class OnChooseActivityListener
    {

        public abstract boolean onChooseActivity(ActivityChooserModel activitychoosermodel, Intent intent);
    }

}