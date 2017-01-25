// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Notification;
import android.support.v4.app.av;
import android.support.v4.app.aw;
import android.support.v4.app.bb;
import android.support.v4.app.bo;
import android.support.v7.internal.app.NotificationCompatImpl21;
import android.support.v7.internal.app.NotificationCompatImplBase;

public class NotificationCompat extends aw
{

    public NotificationCompat()
    {
    }

    private static void addBigMediaStyleToBuilderJellybean(Notification notification, bb bb1)
    {
        if (bb1.mStyle instanceof MediaStyle)
        {
            MediaStyle mediastyle = (MediaStyle)bb1.mStyle;
            NotificationCompatImplBase.overrideBigContentView(notification, bb1.mContext, bb1.mContentTitle, bb1.mContentText, bb1.mContentInfo, bb1.mNumber, bb1.mLargeIcon, bb1.mSubText, bb1.mUseChronometer, bb1.mNotification.when, bb1.mActions, mediastyle.mShowCancelButton, mediastyle.mCancelButtonIntent);
        }
    }

    private static void addMediaStyleToBuilderIcs(av av, bb bb1)
    {
        if (bb1.mStyle instanceof MediaStyle)
        {
            MediaStyle mediastyle = (MediaStyle)bb1.mStyle;
            NotificationCompatImplBase.overrideContentView(av, bb1.mContext, bb1.mContentTitle, bb1.mContentText, bb1.mContentInfo, bb1.mNumber, bb1.mLargeIcon, bb1.mSubText, bb1.mUseChronometer, bb1.mNotification.when, bb1.mActions, mediastyle.mActionsToShowInCompact, mediastyle.mShowCancelButton, mediastyle.mCancelButtonIntent);
        }
    }

    private static void addMediaStyleToBuilderLollipop(av av, bo bo)
    {
        if (bo instanceof MediaStyle)
        {
            bo = (MediaStyle)bo;
            int ai[] = ((MediaStyle) (bo)).mActionsToShowInCompact;
            if (((MediaStyle) (bo)).mToken != null)
            {
                bo = ((bo) (((MediaStyle) (bo)).mToken.a()));
            } else
            {
                bo = null;
            }
            NotificationCompatImpl21.addMediaStyle(av, ai, bo);
        }
    }




    private class MediaStyle extends bo
    {

        int mActionsToShowInCompact[];
        PendingIntent mCancelButtonIntent;
        boolean mShowCancelButton;
        android.support.v4.media.session.MediaSessionCompat.Token mToken;

        public MediaStyle setCancelButtonIntent(PendingIntent pendingintent)
        {
            mCancelButtonIntent = pendingintent;
            return this;
        }

        public MediaStyle setMediaSession(android.support.v4.media.session.MediaSessionCompat.Token token)
        {
            mToken = token;
            return this;
        }

        public transient MediaStyle setShowActionsInCompactView(int ai[])
        {
            mActionsToShowInCompact = ai;
            return this;
        }

        public MediaStyle setShowCancelButton(boolean flag)
        {
            mShowCancelButton = flag;
            return this;
        }

        public MediaStyle()
        {
            mActionsToShowInCompact = null;
        }

        public MediaStyle(bb bb1)
        {
            mActionsToShowInCompact = null;
            setBuilder(bb1);
        }
    }

}
