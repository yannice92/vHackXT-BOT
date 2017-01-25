// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;

// Referenced classes of package android.support.v4.app:
//            bi, bb, bc

final class bj extends bi
{

    bj()
    {
    }

    public final Notification a(bb bb1, bc bc)
    {
        bc = bb1.mNotification;
        bc.setLatestEventInfo(bb1.mContext, bb1.mContentTitle, bb1.mContentText, bb1.mContentIntent);
        android.content.Context context = bb1.mContext;
        CharSequence charsequence = bb1.mContentTitle;
        CharSequence charsequence1 = bb1.mContentText;
        android.app.PendingIntent pendingintent = bb1.mContentIntent;
        android.app.PendingIntent pendingintent1 = bb1.mFullScreenIntent;
        bc.setLatestEventInfo(context, charsequence, charsequence1, pendingintent);
        bc.fullScreenIntent = pendingintent1;
        if (bb1.mPriority > 0)
        {
            bc.flags = ((Notification) (bc)).flags | 0x80;
        }
        return bc;
    }
}
