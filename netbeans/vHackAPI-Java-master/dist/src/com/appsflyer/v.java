// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.appsflyer:
//            w, x, b

public final class v
    implements android.app.Application.ActivityLifecycleCallbacks
{

    private static v a;
    private boolean b;
    private boolean c;
    private Handler d;
    private List e;
    private Runnable f;

    public v()
    {
        b = false;
        c = true;
        d = new Handler();
        e = new CopyOnWriteArrayList();
    }

    public static v a()
    {
        if (a == null)
        {
            throw new IllegalStateException("Foreground is not initialised - invoke at least once with parameter init/get");
        } else
        {
            return a;
        }
    }

    public static v a(Application application)
    {
        if (a == null)
        {
            a = new v();
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                application.registerActivityLifecycleCallbacks(a);
            }
        }
        return a;
    }

    static boolean a(v v1)
    {
        return v1.b;
    }

    static boolean b(v v1)
    {
        return v1.c;
    }

    static boolean c(v v1)
    {
        v1.b = false;
        return false;
    }

    static List d(v v1)
    {
        return v1.e;
    }

    public final void a(x x1)
    {
        e.add(x1);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle)
    {
    }

    public final void onActivityDestroyed(Activity activity)
    {
    }

    public final void onActivityPaused(Activity activity)
    {
        c = true;
        if (f != null)
        {
            d.removeCallbacks(f);
        }
        activity = new w(this, activity);
        (new Timer()).schedule(activity, 500L);
    }

    public final void onActivityResumed(Activity activity)
    {
        boolean flag = false;
        c = false;
        if (!b)
        {
            flag = true;
        }
        b = true;
        if (f != null)
        {
            d.removeCallbacks(f);
        }
        if (flag)
        {
            for (Iterator iterator = e.iterator(); iterator.hasNext();)
            {
                x x1 = (x)iterator.next();
                try
                {
                    x1.a(activity);
                }
                catch (Exception exception)
                {
                    com.appsflyer.b.a("Listener threw exception! ", exception);
                }
            }

        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public final void onActivityStarted(Activity activity)
    {
    }

    public final void onActivityStopped(Activity activity)
    {
    }
}
