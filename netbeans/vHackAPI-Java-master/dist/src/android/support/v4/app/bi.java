// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            bf, bb, bc, ax

class bi
    implements bf
{

    bi()
    {
    }

    public Notification a(bb bb1, bc bc)
    {
        bc = bb1.mNotification;
        bc.setLatestEventInfo(bb1.mContext, bb1.mContentTitle, bb1.mContentText, bb1.mContentIntent);
        if (bb1.mPriority > 0)
        {
            bc.flags = ((Notification) (bc)).flags | 0x80;
        }
        return bc;
    }

    public Bundle a(Notification notification)
    {
        return null;
    }

    public ax a(Notification notification, int i)
    {
        return null;
    }

    public int b(Notification notification)
    {
        return 0;
    }

    public String c(Notification notification)
    {
        return null;
    }

    public boolean d(Notification notification)
    {
        return false;
    }

    public String e(Notification notification)
    {
        return null;
    }

    public boolean f(Notification notification)
    {
        return false;
    }

    public String g(Notification notification)
    {
        return null;
    }
}
