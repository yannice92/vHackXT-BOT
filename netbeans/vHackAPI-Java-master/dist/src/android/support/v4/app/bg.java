// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.app.RemoteInput;

// Referenced classes of package android.support.v4.app:
//            bn, bq, bb, aw, 
//            bc, ax, cc, bv, 
//            cl

class bg extends bn
{

    bg()
    {
    }

    public Notification a(bb bb1, bc bc1)
    {
        bq bq1 = new bq(bb1.mContext, bb1.mNotification, bb1.mContentTitle, bb1.mContentText, bb1.mContentInfo, bb1.mTickerView, bb1.mNumber, bb1.mContentIntent, bb1.mFullScreenIntent, bb1.mLargeIcon, bb1.mProgressMax, bb1.mProgress, bb1.mProgressIndeterminate, bb1.mShowWhen, bb1.mUseChronometer, bb1.mPriority, bb1.mSubText, bb1.mLocalOnly, bb1.mPeople, bb1.mExtras, bb1.mGroupKey, bb1.mGroupSummary, bb1.mSortKey);
        aw.access$000(bq1, bb1.mActions);
        aw.access$100(bq1, bb1.mStyle);
        return bc1.build(bb1, bq1);
    }

    public final ax a(Notification notification, int i)
    {
        bv bv1 = ax.d;
        cl cl1 = cc.a;
        android.app.Notification.Action action = notification.actions[i];
        RemoteInput aremoteinput[] = action.getRemoteInputs();
        if (aremoteinput == null)
        {
            notification = null;
        } else
        {
            notification = cl1.a(aremoteinput.length);
            i = 0;
            while (i < aremoteinput.length) 
            {
                RemoteInput remoteinput = aremoteinput[i];
                notification[i] = cl1.a(remoteinput.getResultKey(), remoteinput.getLabel(), remoteinput.getChoices(), remoteinput.getAllowFreeFormInput(), remoteinput.getExtras());
                i++;
            }
        }
        return (ax)bv1.a(action.icon, action.title, action.actionIntent, action.getExtras(), notification);
    }

    public final boolean d(Notification notification)
    {
        return (notification.flags & 0x100) != 0;
    }

    public final String e(Notification notification)
    {
        return notification.getGroup();
    }

    public final boolean f(Notification notification)
    {
        return (notification.flags & 0x200) != 0;
    }

    public final String g(Notification notification)
    {
        return notification.getSortKey();
    }
}
