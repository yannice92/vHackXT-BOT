// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;

// Referenced classes of package android.support.v4.app:
//            bg, bs, bb, aw, 
//            bc

final class bh extends bg
{

    bh()
    {
    }

    public final Notification a(bb bb1, bc bc1)
    {
        bs bs1 = new bs(bb1.mContext, bb1.mNotification, bb1.mContentTitle, bb1.mContentText, bb1.mContentInfo, bb1.mTickerView, bb1.mNumber, bb1.mContentIntent, bb1.mFullScreenIntent, bb1.mLargeIcon, bb1.mProgressMax, bb1.mProgress, bb1.mProgressIndeterminate, bb1.mShowWhen, bb1.mUseChronometer, bb1.mPriority, bb1.mSubText, bb1.mLocalOnly, bb1.mCategory, bb1.mPeople, bb1.mExtras, bb1.mColor, bb1.mVisibility, bb1.mPublicVersion, bb1.mGroupKey, bb1.mGroupSummary, bb1.mSortKey);
        aw.access$000(bs1, bb1.mActions);
        aw.access$100(bs1, bb1.mStyle);
        return bc1.build(bb1, bs1);
    }

    public final String c(Notification notification)
    {
        return notification.category;
    }
}
