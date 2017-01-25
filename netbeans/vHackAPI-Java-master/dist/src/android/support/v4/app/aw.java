// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//            bh, bg, bn, bm, 
//            bl, bk, bj, bi, 
//            ax, au, ba, by, 
//            be, az, bf, av, 
//            bo

public class aw
{

    public static final String CATEGORY_ALARM = "alarm";
    public static final String CATEGORY_CALL = "call";
    public static final String CATEGORY_EMAIL = "email";
    public static final String CATEGORY_ERROR = "err";
    public static final String CATEGORY_EVENT = "event";
    public static final String CATEGORY_MESSAGE = "msg";
    public static final String CATEGORY_PROGRESS = "progress";
    public static final String CATEGORY_PROMO = "promo";
    public static final String CATEGORY_RECOMMENDATION = "recommendation";
    public static final String CATEGORY_SERVICE = "service";
    public static final String CATEGORY_SOCIAL = "social";
    public static final String CATEGORY_STATUS = "status";
    public static final String CATEGORY_SYSTEM = "sys";
    public static final String CATEGORY_TRANSPORT = "transport";
    public static final int COLOR_DEFAULT = 0;
    public static final int DEFAULT_ALL = -1;
    public static final int DEFAULT_LIGHTS = 4;
    public static final int DEFAULT_SOUND = 1;
    public static final int DEFAULT_VIBRATE = 2;
    public static final String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";
    public static final String EXTRA_BIG_TEXT = "android.bigText";
    public static final String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    public static final String EXTRA_INFO_TEXT = "android.infoText";
    public static final String EXTRA_LARGE_ICON = "android.largeIcon";
    public static final String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";
    public static final String EXTRA_MEDIA_SESSION = "android.mediaSession";
    public static final String EXTRA_PEOPLE = "android.people";
    public static final String EXTRA_PICTURE = "android.picture";
    public static final String EXTRA_PROGRESS = "android.progress";
    public static final String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";
    public static final String EXTRA_PROGRESS_MAX = "android.progressMax";
    public static final String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";
    public static final String EXTRA_SHOW_WHEN = "android.showWhen";
    public static final String EXTRA_SMALL_ICON = "android.icon";
    public static final String EXTRA_SUB_TEXT = "android.subText";
    public static final String EXTRA_SUMMARY_TEXT = "android.summaryText";
    public static final String EXTRA_TEMPLATE = "android.template";
    public static final String EXTRA_TEXT = "android.text";
    public static final String EXTRA_TEXT_LINES = "android.textLines";
    public static final String EXTRA_TITLE = "android.title";
    public static final String EXTRA_TITLE_BIG = "android.title.big";
    public static final int FLAG_AUTO_CANCEL = 16;
    public static final int FLAG_FOREGROUND_SERVICE = 64;
    public static final int FLAG_GROUP_SUMMARY = 512;
    public static final int FLAG_HIGH_PRIORITY = 128;
    public static final int FLAG_INSISTENT = 4;
    public static final int FLAG_LOCAL_ONLY = 256;
    public static final int FLAG_NO_CLEAR = 32;
    public static final int FLAG_ONGOING_EVENT = 2;
    public static final int FLAG_ONLY_ALERT_ONCE = 8;
    public static final int FLAG_SHOW_LIGHTS = 1;
    private static final bf IMPL;
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;
    public static final int PRIORITY_MIN = -2;
    public static final int STREAM_DEFAULT = -1;
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_SECRET = -1;

    public aw()
    {
    }

    private static void addActionsToBuilder(au au1, ArrayList arraylist)
    {
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); au1.a((ax)arraylist.next())) { }
    }

    private static void addStyleToBuilderJellybean(av av, bo bo)
    {
        if (bo != null)
        {
            if (bo instanceof ba)
            {
                bo = (ba)bo;
                by.a(av, ((ba) (bo)).mBigContentTitle, ((ba) (bo)).mSummaryTextSet, ((ba) (bo)).mSummaryText, ((ba) (bo)).a);
            } else
            {
                if (bo instanceof be)
                {
                    bo = (be)bo;
                    by.a(av, ((be) (bo)).mBigContentTitle, ((be) (bo)).mSummaryTextSet, ((be) (bo)).mSummaryText, ((be) (bo)).a);
                    return;
                }
                if (bo instanceof az)
                {
                    bo = (az)bo;
                    by.a(av, ((az) (bo)).mBigContentTitle, ((az) (bo)).mSummaryTextSet, ((az) (bo)).mSummaryText, ((az) (bo)).a, ((az) (bo)).b, ((az) (bo)).c);
                    return;
                }
            }
        }
    }

    public static ax getAction(Notification notification, int i)
    {
        return IMPL.a(notification, i);
    }

    public static int getActionCount(Notification notification)
    {
        return IMPL.b(notification);
    }

    public static String getCategory(Notification notification)
    {
        return IMPL.c(notification);
    }

    public static Bundle getExtras(Notification notification)
    {
        return IMPL.a(notification);
    }

    public static String getGroup(Notification notification)
    {
        return IMPL.e(notification);
    }

    public static boolean getLocalOnly(Notification notification)
    {
        return IMPL.d(notification);
    }

    private static Notification[] getNotificationArrayFromBundle(Bundle bundle, String s)
    {
        android.os.Parcelable aparcelable[] = bundle.getParcelableArray(s);
        if ((aparcelable instanceof Notification[]) || aparcelable == null)
        {
            return (Notification[])aparcelable;
        }
        Notification anotification[] = new Notification[aparcelable.length];
        for (int i = 0; i < aparcelable.length; i++)
        {
            anotification[i] = (Notification)aparcelable[i];
        }

        bundle.putParcelableArray(s, anotification);
        return anotification;
    }

    public static String getSortKey(Notification notification)
    {
        return IMPL.g(notification);
    }

    public static boolean isGroupSummary(Notification notification)
    {
        return IMPL.f(notification);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            IMPL = new bh();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 20)
        {
            IMPL = new bg();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            IMPL = new bn();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            IMPL = new bm();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            IMPL = new bl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            IMPL = new bk();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            IMPL = new bj();
        } else
        {
            IMPL = new bi();
        }
    }




}
