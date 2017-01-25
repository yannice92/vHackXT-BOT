// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer;

import android.util.Log;

// Referenced classes of package com.appsflyer:
//            i, q

public final class b
{

    public static final String a;

    public static void a(String s)
    {
        if (q.a().g())
        {
            Log.i(a, s);
        }
    }

    public static void a(String s, Throwable throwable)
    {
        if (q.a().g())
        {
            Log.e(a, s, throwable);
        }
    }

    public static void b(String s)
    {
        if (q.a().g())
        {
            Log.d(a, s);
        }
    }

    public static void c(String s)
    {
        if (q.a().g())
        {
            Log.w(a, s);
        }
    }

    public static void d(String s)
    {
        if (!q.a().h())
        {
            Log.d(a, s);
        }
    }

    static 
    {
        a = (new StringBuilder("AppsFlyer_")).append(i.a).append(".").append(i.b).toString();
    }
}
