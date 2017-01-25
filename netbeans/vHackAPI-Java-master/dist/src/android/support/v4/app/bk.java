// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;

// Referenced classes of package android.support.v4.app:
//            bi, bb, bc

final class bk extends bi
{

    bk()
    {
    }

    public final Notification a(bb bb1, bc bc)
    {
        Object obj1 = bb1.mContext;
        bc = bb1.mNotification;
        Object obj = bb1.mContentTitle;
        CharSequence charsequence = bb1.mContentText;
        CharSequence charsequence1 = bb1.mContentInfo;
        android.widget.RemoteViews remoteviews = bb1.mTickerView;
        int i = bb1.mNumber;
        android.app.PendingIntent pendingintent1 = bb1.mContentIntent;
        android.app.PendingIntent pendingintent = bb1.mFullScreenIntent;
        bb1 = bb1.mLargeIcon;
        obj1 = (new android.app.Notification.Builder(((android.content.Context) (obj1)))).setWhen(((Notification) (bc)).when).setSmallIcon(((Notification) (bc)).icon, ((Notification) (bc)).iconLevel).setContent(((Notification) (bc)).contentView).setTicker(((Notification) (bc)).tickerText, remoteviews).setSound(((Notification) (bc)).sound, ((Notification) (bc)).audioStreamType).setVibrate(((Notification) (bc)).vibrate).setLights(((Notification) (bc)).ledARGB, ((Notification) (bc)).ledOnMS, ((Notification) (bc)).ledOffMS);
        boolean flag;
        if ((((Notification) (bc)).flags & 2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj1 = ((android.app.Notification.Builder) (obj1)).setOngoing(flag);
        if ((((Notification) (bc)).flags & 8) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj1 = ((android.app.Notification.Builder) (obj1)).setOnlyAlertOnce(flag);
        if ((((Notification) (bc)).flags & 0x10) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = ((android.app.Notification.Builder) (obj1)).setAutoCancel(flag).setDefaults(((Notification) (bc)).defaults).setContentTitle(((CharSequence) (obj))).setContentText(charsequence).setContentInfo(charsequence1).setContentIntent(pendingintent1).setDeleteIntent(((Notification) (bc)).deleteIntent);
        if ((((Notification) (bc)).flags & 0x80) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return ((android.app.Notification.Builder) (obj)).setFullScreenIntent(pendingintent, flag).setLargeIcon(bb1).setNumber(i).getNotification();
    }
}
