// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            ax, aw, bf, bc, 
//            bo, bd

public class bb
{

    private static final int MAX_CHARSEQUENCE_LENGTH = 5120;
    public ArrayList mActions;
    String mCategory;
    int mColor;
    public CharSequence mContentInfo;
    PendingIntent mContentIntent;
    public CharSequence mContentText;
    public CharSequence mContentTitle;
    public Context mContext;
    Bundle mExtras;
    PendingIntent mFullScreenIntent;
    String mGroupKey;
    boolean mGroupSummary;
    public Bitmap mLargeIcon;
    boolean mLocalOnly;
    public Notification mNotification;
    public int mNumber;
    public ArrayList mPeople;
    int mPriority;
    int mProgress;
    boolean mProgressIndeterminate;
    int mProgressMax;
    Notification mPublicVersion;
    boolean mShowWhen;
    String mSortKey;
    public bo mStyle;
    public CharSequence mSubText;
    RemoteViews mTickerView;
    public boolean mUseChronometer;
    int mVisibility;

    public bb(Context context)
    {
        mShowWhen = true;
        mActions = new ArrayList();
        mLocalOnly = false;
        mColor = 0;
        mVisibility = 0;
        mNotification = new Notification();
        mContext = context;
        mNotification.when = System.currentTimeMillis();
        mNotification.audioStreamType = -1;
        mPriority = 0;
        mPeople = new ArrayList();
    }

    protected static CharSequence limitCharSequenceLength(CharSequence charsequence)
    {
        while (charsequence == null || charsequence.length() <= 5120) 
        {
            return charsequence;
        }
        return charsequence.subSequence(0, 5120);
    }

    private void setFlag(int i, boolean flag)
    {
        if (flag)
        {
            Notification notification = mNotification;
            notification.flags = notification.flags | i;
            return;
        } else
        {
            Notification notification1 = mNotification;
            notification1.flags = notification1.flags & ~i;
            return;
        }
    }

    public bb addAction(int i, CharSequence charsequence, PendingIntent pendingintent)
    {
        mActions.add(new ax(i, charsequence, pendingintent));
        return this;
    }

    public bb addAction(ax ax1)
    {
        mActions.add(ax1);
        return this;
    }

    public bb addExtras(Bundle bundle)
    {
label0:
        {
            if (bundle != null)
            {
                if (mExtras != null)
                {
                    break label0;
                }
                mExtras = new Bundle(bundle);
            }
            return this;
        }
        mExtras.putAll(bundle);
        return this;
    }

    public bb addPerson(String s)
    {
        mPeople.add(s);
        return this;
    }

    public Notification build()
    {
        return aw.access$200().a(this, getExtender());
    }

    public bb extend(bd bd)
    {
        return this;
    }

    protected bc getExtender()
    {
        return new bc();
    }

    public Bundle getExtras()
    {
        if (mExtras == null)
        {
            mExtras = new Bundle();
        }
        return mExtras;
    }

    public Notification getNotification()
    {
        return build();
    }

    public bb setAutoCancel(boolean flag)
    {
        setFlag(16, flag);
        return this;
    }

    public bb setCategory(String s)
    {
        mCategory = s;
        return this;
    }

    public bb setColor(int i)
    {
        mColor = i;
        return this;
    }

    public bb setContent(RemoteViews remoteviews)
    {
        mNotification.contentView = remoteviews;
        return this;
    }

    public bb setContentInfo(CharSequence charsequence)
    {
        mContentInfo = limitCharSequenceLength(charsequence);
        return this;
    }

    public bb setContentIntent(PendingIntent pendingintent)
    {
        mContentIntent = pendingintent;
        return this;
    }

    public bb setContentText(CharSequence charsequence)
    {
        mContentText = limitCharSequenceLength(charsequence);
        return this;
    }

    public bb setContentTitle(CharSequence charsequence)
    {
        mContentTitle = limitCharSequenceLength(charsequence);
        return this;
    }

    public bb setDefaults(int i)
    {
        mNotification.defaults = i;
        if ((i & 4) != 0)
        {
            Notification notification = mNotification;
            notification.flags = notification.flags | 1;
        }
        return this;
    }

    public bb setDeleteIntent(PendingIntent pendingintent)
    {
        mNotification.deleteIntent = pendingintent;
        return this;
    }

    public bb setExtras(Bundle bundle)
    {
        mExtras = bundle;
        return this;
    }

    public bb setFullScreenIntent(PendingIntent pendingintent, boolean flag)
    {
        mFullScreenIntent = pendingintent;
        setFlag(128, flag);
        return this;
    }

    public bb setGroup(String s)
    {
        mGroupKey = s;
        return this;
    }

    public bb setGroupSummary(boolean flag)
    {
        mGroupSummary = flag;
        return this;
    }

    public bb setLargeIcon(Bitmap bitmap)
    {
        mLargeIcon = bitmap;
        return this;
    }

    public bb setLights(int i, int j, int k)
    {
        boolean flag = true;
        mNotification.ledARGB = i;
        mNotification.ledOnMS = j;
        mNotification.ledOffMS = k;
        Notification notification;
        if (mNotification.ledOnMS != 0 && mNotification.ledOffMS != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        notification = mNotification;
        j = mNotification.flags;
        if (i != 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        notification.flags = j & -2 | i;
        return this;
    }

    public bb setLocalOnly(boolean flag)
    {
        mLocalOnly = flag;
        return this;
    }

    public bb setNumber(int i)
    {
        mNumber = i;
        return this;
    }

    public bb setOngoing(boolean flag)
    {
        setFlag(2, flag);
        return this;
    }

    public bb setOnlyAlertOnce(boolean flag)
    {
        setFlag(8, flag);
        return this;
    }

    public bb setPriority(int i)
    {
        mPriority = i;
        return this;
    }

    public bb setProgress(int i, int j, boolean flag)
    {
        mProgressMax = i;
        mProgress = j;
        mProgressIndeterminate = flag;
        return this;
    }

    public bb setPublicVersion(Notification notification)
    {
        mPublicVersion = notification;
        return this;
    }

    public bb setShowWhen(boolean flag)
    {
        mShowWhen = flag;
        return this;
    }

    public bb setSmallIcon(int i)
    {
        mNotification.icon = i;
        return this;
    }

    public bb setSmallIcon(int i, int j)
    {
        mNotification.icon = i;
        mNotification.iconLevel = j;
        return this;
    }

    public bb setSortKey(String s)
    {
        mSortKey = s;
        return this;
    }

    public bb setSound(Uri uri)
    {
        mNotification.sound = uri;
        mNotification.audioStreamType = -1;
        return this;
    }

    public bb setSound(Uri uri, int i)
    {
        mNotification.sound = uri;
        mNotification.audioStreamType = i;
        return this;
    }

    public bb setStyle(bo bo1)
    {
        if (mStyle != bo1)
        {
            mStyle = bo1;
            if (mStyle != null)
            {
                mStyle.setBuilder(this);
            }
        }
        return this;
    }

    public bb setSubText(CharSequence charsequence)
    {
        mSubText = limitCharSequenceLength(charsequence);
        return this;
    }

    public bb setTicker(CharSequence charsequence)
    {
        mNotification.tickerText = limitCharSequenceLength(charsequence);
        return this;
    }

    public bb setTicker(CharSequence charsequence, RemoteViews remoteviews)
    {
        mNotification.tickerText = limitCharSequenceLength(charsequence);
        mTickerView = remoteviews;
        return this;
    }

    public bb setUsesChronometer(boolean flag)
    {
        mUseChronometer = flag;
        return this;
    }

    public bb setVibrate(long al[])
    {
        mNotification.vibrate = al;
        return this;
    }

    public bb setVisibility(int i)
    {
        mVisibility = i;
        return this;
    }

    public bb setWhen(long l)
    {
        mNotification.when = l;
        return this;
    }
}
