// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer;

import android.app.Activity;
import java.util.Iterator;
import java.util.List;
import java.util.TimerTask;

// Referenced classes of package com.appsflyer:
//            v, x, b

final class w extends TimerTask
{

    final Activity a;
    final v b;

    w(v v1, Activity activity)
    {
        b = v1;
        a = activity;
        super();
    }

    public final void run()
    {
        if (v.a(b) && v.b(b))
        {
            v.c(b);
            for (Iterator iterator = v.d(b).iterator(); iterator.hasNext();)
            {
                x x1 = (x)iterator.next();
                try
                {
                    x1.b(a);
                }
                catch (Exception exception)
                {
                    com.appsflyer.b.a("Listener threw exception! ", exception);
                }
            }

        }
    }
}
