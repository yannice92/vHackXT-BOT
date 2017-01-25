// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            bi, bz, bb, aw, 
//            bc, by, ax, cc

class bm extends bi
{

    bm()
    {
    }

    public Notification a(bb bb1, bc bc1)
    {
        bz bz1 = new bz(bb1.mContext, bb1.mNotification, bb1.mContentTitle, bb1.mContentText, bb1.mContentInfo, bb1.mTickerView, bb1.mNumber, bb1.mContentIntent, bb1.mFullScreenIntent, bb1.mLargeIcon, bb1.mProgressMax, bb1.mProgress, bb1.mProgressIndeterminate, bb1.mUseChronometer, bb1.mPriority, bb1.mSubText, bb1.mLocalOnly, bb1.mExtras, bb1.mGroupKey, bb1.mGroupSummary, bb1.mSortKey);
        aw.access$000(bz1, bb1.mActions);
        aw.access$100(bz1, bb1.mStyle);
        return bc1.build(bb1, bz1);
    }

    public Bundle a(Notification notification)
    {
        return by.a(notification);
    }

    public ax a(Notification notification, int i)
    {
        return (ax)by.a(notification, i, ax.d, cc.a);
    }

    public int b(Notification notification)
    {
        return by.b(notification);
    }

    public boolean d(Notification notification)
    {
        return by.c(notification);
    }

    public String e(Notification notification)
    {
        return by.d(notification);
    }

    public boolean f(Notification notification)
    {
        return by.e(notification);
    }

    public String g(Notification notification)
    {
        return by.f(notification);
    }
}
