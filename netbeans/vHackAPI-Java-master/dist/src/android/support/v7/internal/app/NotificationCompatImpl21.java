// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.support.v4.app.av;

public class NotificationCompatImpl21
{

    public NotificationCompatImpl21()
    {
    }

    public static void addMediaStyle(av av1, int ai[], Object obj)
    {
        av1 = new android.app.Notification.MediaStyle(av1.a());
        if (ai != null)
        {
            av1.setShowActionsInCompactView(ai);
        }
        if (obj != null)
        {
            av1.setMediaSession((android.media.session.MediaSession.Token)obj);
        }
    }
}
