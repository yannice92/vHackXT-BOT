// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.v4.app:
//            bu, cm, bv, cl, 
//            av

final class by
{

    private static final Object a = new Object();
    private static Field b;
    private static boolean c;
    private static final Object d = new Object();
    private static Class e;
    private static Field f;
    private static Field g;
    private static Field h;
    private static Field i;
    private static boolean j;

    public static Bundle a(android.app.Notification.Builder builder, bu bu1)
    {
        builder.addAction(bu1.a(), bu1.b(), bu1.c());
        builder = new Bundle(bu1.d());
        if (bu1.e() != null)
        {
            builder.putParcelableArray("android.support.remoteInputs", cm.a(bu1.e()));
        }
        return builder;
    }

    public static Bundle a(Notification notification)
    {
label0:
        {
            synchronized (a)
            {
                if (!c)
                {
                    break label0;
                }
            }
            return null;
        }
        Object obj;
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        obj = android/app/Notification.getDeclaredField("extras");
        if (android/os/Bundle.isAssignableFrom(((Field) (obj)).getType()))
        {
            break MISSING_BLOCK_LABEL_58;
        }
        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
        c = true;
        obj1;
        JVM INSTR monitorexit ;
        return null;
        ((Field) (obj)).setAccessible(true);
        b = ((Field) (obj));
        Bundle bundle = (Bundle)b.get(notification);
        obj = bundle;
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        obj = new Bundle();
        b.set(notification, obj);
        obj1;
        JVM INSTR monitorexit ;
        return ((Bundle) (obj));
        notification;
        throw notification;
        notification;
        Log.e("NotificationCompat", "Unable to access notification extras", notification);
_L1:
        c = true;
        obj1;
        JVM INSTR monitorexit ;
        return null;
        notification;
        Log.e("NotificationCompat", "Unable to access notification extras", notification);
          goto _L1
    }

    public static bu a(Notification notification, int k, bv bv1, cl cl1)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        obj1 = g(notification)[k];
        notification = a(notification);
        if (notification == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        notification = notification.getSparseParcelableArray("android.support.actionExtras");
        if (notification == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        notification = (Bundle)notification.get(k);
_L1:
        notification = a(bv1, cl1, g.getInt(obj1), (CharSequence)h.get(obj1), (PendingIntent)i.get(obj1), ((Bundle) (notification)));
        obj;
        JVM INSTR monitorexit ;
        return notification;
        notification;
        Log.e("NotificationCompat", "Unable to access notification actions", notification);
        j = true;
        obj;
        JVM INSTR monitorexit ;
        return null;
        notification;
        throw notification;
        notification = null;
          goto _L1
    }

    public static bu a(bv bv1, cl cl1, int k, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle)
    {
        if (bundle != null)
        {
            Object aobj[] = bundle.getParcelableArray("android.support.remoteInputs");
            if ((aobj instanceof Bundle[]) || aobj == null)
            {
                aobj = (Bundle[])aobj;
            } else
            {
                aobj = (Bundle[])Arrays.copyOf(aobj, aobj.length, [Landroid/os/Bundle;);
                bundle.putParcelableArray("android.support.remoteInputs", ((android.os.Parcelable []) (aobj)));
            }
            if (aobj == null)
            {
                cl1 = null;
            } else
            {
                ck ack[] = cl1.a(aobj.length);
                for (int l = 0; l < aobj.length; l++)
                {
                    Object obj = aobj[l];
                    ack[l] = cl1.a(((Bundle) (obj)).getString("resultKey"), ((Bundle) (obj)).getCharSequence("label"), ((Bundle) (obj)).getCharSequenceArray("choices"), ((Bundle) (obj)).getBoolean("allowFreeFormInput"), ((Bundle) (obj)).getBundle("extras"));
                }

                cl1 = ack;
            }
        } else
        {
            cl1 = null;
        }
        return bv1.a(k, charsequence, pendingintent, bundle, cl1);
    }

    public static SparseArray a(List list)
    {
        SparseArray sparsearray = null;
        int l = list.size();
        for (int k = 0; k < l;)
        {
            Bundle bundle = (Bundle)list.get(k);
            SparseArray sparsearray1 = sparsearray;
            if (bundle != null)
            {
                sparsearray1 = sparsearray;
                if (sparsearray == null)
                {
                    sparsearray1 = new SparseArray();
                }
                sparsearray1.put(k, bundle);
            }
            k++;
            sparsearray = sparsearray1;
        }

        return sparsearray;
    }

    public static void a(av av1, CharSequence charsequence, boolean flag, CharSequence charsequence1, Bitmap bitmap, Bitmap bitmap1, boolean flag1)
    {
        av1 = (new android.app.Notification.BigPictureStyle(av1.a())).setBigContentTitle(charsequence).bigPicture(bitmap);
        if (flag1)
        {
            av1.bigLargeIcon(bitmap1);
        }
        if (flag)
        {
            av1.setSummaryText(charsequence1);
        }
    }

    public static void a(av av1, CharSequence charsequence, boolean flag, CharSequence charsequence1, CharSequence charsequence2)
    {
        av1 = (new android.app.Notification.BigTextStyle(av1.a())).setBigContentTitle(charsequence).bigText(charsequence2);
        if (flag)
        {
            av1.setSummaryText(charsequence1);
        }
    }

    public static void a(av av1, CharSequence charsequence, boolean flag, CharSequence charsequence1, ArrayList arraylist)
    {
        av1 = (new android.app.Notification.InboxStyle(av1.a())).setBigContentTitle(charsequence);
        if (flag)
        {
            av1.setSummaryText(charsequence1);
        }
        for (charsequence = arraylist.iterator(); charsequence.hasNext(); av1.addLine((CharSequence)charsequence.next())) { }
    }

    private static boolean a()
    {
        if (!j)
        {
            try
            {
                if (f == null)
                {
                    Object obj = Class.forName("android.app.Notification$Action");
                    e = ((Class) (obj));
                    g = ((Class) (obj)).getDeclaredField("icon");
                    h = e.getDeclaredField("title");
                    i = e.getDeclaredField("actionIntent");
                    obj = android/app/Notification.getDeclaredField("actions");
                    f = ((Field) (obj));
                    ((Field) (obj)).setAccessible(true);
                }
            }
            catch (ClassNotFoundException classnotfoundexception)
            {
                Log.e("NotificationCompat", "Unable to access notification actions", classnotfoundexception);
                j = true;
            }
            catch (NoSuchFieldException nosuchfieldexception)
            {
                Log.e("NotificationCompat", "Unable to access notification actions", nosuchfieldexception);
                j = true;
            }
            if (!j)
            {
                return true;
            }
        }
        return false;
    }

    public static int b(Notification notification)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        notification = ((Notification) (g(notification)));
        if (notification == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        int k = notification.length;
_L1:
        obj;
        JVM INSTR monitorexit ;
        return k;
        k = 0;
          goto _L1
        notification;
        throw notification;
    }

    public static boolean c(Notification notification)
    {
        return a(notification).getBoolean("android.support.localOnly");
    }

    public static String d(Notification notification)
    {
        return a(notification).getString("android.support.groupKey");
    }

    public static boolean e(Notification notification)
    {
        return a(notification).getBoolean("android.support.isGroupSummary");
    }

    public static String f(Notification notification)
    {
        return a(notification).getString("android.support.sortKey");
    }

    private static Object[] g(Notification notification)
    {
label0:
        {
            synchronized (d)
            {
                if (a())
                {
                    break label0;
                }
            }
            return null;
        }
        notification = ((Notification) ((Object[])f.get(notification)));
        obj;
        JVM INSTR monitorexit ;
        return notification;
        notification;
        throw notification;
        notification;
        Log.e("NotificationCompat", "Unable to access notification actions", notification);
        j = true;
        obj;
        JVM INSTR monitorexit ;
        return null;
    }

}
