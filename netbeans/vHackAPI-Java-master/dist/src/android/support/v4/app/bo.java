// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;

// Referenced classes of package android.support.v4.app:
//            bb

public abstract class bo
{

    CharSequence mBigContentTitle;
    bb mBuilder;
    CharSequence mSummaryText;
    boolean mSummaryTextSet;

    public bo()
    {
        mSummaryTextSet = false;
    }

    public Notification build()
    {
        Notification notification = null;
        if (mBuilder != null)
        {
            notification = mBuilder.build();
        }
        return notification;
    }

    public void setBuilder(bb bb1)
    {
        if (mBuilder != bb1)
        {
            mBuilder = bb1;
            if (mBuilder != null)
            {
                mBuilder.setStyle(this);
            }
        }
    }
}
