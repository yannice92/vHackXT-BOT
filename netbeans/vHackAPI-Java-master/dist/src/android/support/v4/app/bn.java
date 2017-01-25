// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.SparseArray;

// Referenced classes of package android.support.v4.app:
//            bm, cb, bb, aw, 
//            bc, ax, cc, by

class bn extends bm
{

    bn()
    {
    }

    public Notification a(bb bb1, bc bc1)
    {
        cb cb1 = new cb(bb1.mContext, bb1.mNotification, bb1.mContentTitle, bb1.mContentText, bb1.mContentInfo, bb1.mTickerView, bb1.mNumber, bb1.mContentIntent, bb1.mFullScreenIntent, bb1.mLargeIcon, bb1.mProgressMax, bb1.mProgress, bb1.mProgressIndeterminate, bb1.mShowWhen, bb1.mUseChronometer, bb1.mPriority, bb1.mSubText, bb1.mLocalOnly, bb1.mPeople, bb1.mExtras, bb1.mGroupKey, bb1.mGroupSummary, bb1.mSortKey);
        aw.access$000(cb1, bb1.mActions);
        aw.access$100(cb1, bb1.mStyle);
        return bc1.build(bb1, cb1);
    }

    public final Bundle a(Notification notification)
    {
        return notification.extras;
    }

    public ax a(Notification notification, int i)
    {
        bv bv = ax.d;
        cl cl = cc.a;
        android.app.Notification.Action action = notification.actions[i];
        Object obj = null;
        SparseArray sparsearray = notification.extras.getSparseParcelableArray("android.support.actionExtras");
        notification = obj;
        if (sparsearray != null)
        {
            notification = (Bundle)sparsearray.get(i);
        }
        return (ax)by.a(bv, cl, action.icon, action.title, action.actionIntent, notification);
    }

    public final int b(Notification notification)
    {
        if (notification.actions != null)
        {
            return notification.actions.length;
        } else
        {
            return 0;
        }
    }

    public boolean d(Notification notification)
    {
        return notification.extras.getBoolean("android.support.localOnly");
    }

    public String e(Notification notification)
    {
        return notification.extras.getString("android.support.groupKey");
    }

    public boolean f(Notification notification)
    {
        return notification.extras.getBoolean("android.support.isGroupSummary");
    }

    public String g(Notification notification)
    {
        return notification.extras.getString("android.support.sortKey");
    }
}
