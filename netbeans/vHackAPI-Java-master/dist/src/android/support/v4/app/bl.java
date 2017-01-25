// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;

// Referenced classes of package android.support.v4.app:
//            bi, bx, bb, bc

final class bl extends bi
{

    bl()
    {
    }

    public final Notification a(bb bb1, bc bc1)
    {
        return bc1.build(bb1, new bx(bb1.mContext, bb1.mNotification, bb1.mContentTitle, bb1.mContentText, bb1.mContentInfo, bb1.mTickerView, bb1.mNumber, bb1.mContentIntent, bb1.mFullScreenIntent, bb1.mLargeIcon, bb1.mProgressMax, bb1.mProgress, bb1.mProgressIndeterminate));
    }
}
