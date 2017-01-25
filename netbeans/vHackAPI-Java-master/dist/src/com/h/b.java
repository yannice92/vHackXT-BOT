// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.h;

import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.h:
//            c, d, a

public final class b
{

    public static int a;
    public static int b;
    public static int c;
    public static int d;
    public static boolean e;
    public static a f;
    public static Timer g;
    public static TimerTask h;
    public static TimerTask i = null;
    public static Timer j = null;
    public static int k = 0;

    public static void a()
    {
        if (g != null)
        {
            g.cancel();
            g = null;
        }
    }

    public static void a(a a1)
    {
        f = a1;
    }

    public static void b()
    {
        c = 1000;
        b = 1000;
        d = 1000;
        g = new Timer();
        h = new c();
        g.schedule(h, 1000L, 1000L);
    }

    public static void c()
    {
        if (j != null)
        {
            j.cancel();
            j = null;
        }
    }

    public static void d()
    {
        c();
        k = 0;
        i = new d();
        Timer timer = new Timer();
        j = timer;
        timer.schedule(i, 1000L, 1000L);
    }

}
