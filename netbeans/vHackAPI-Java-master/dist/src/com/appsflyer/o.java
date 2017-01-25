// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.appsflyer:
//            l, i

final class o extends l
{

    final i c;

    public o(i j, Context context, String s, ScheduledExecutorService scheduledexecutorservice)
    {
        c = j;
        super(j, context, s, scheduledexecutorservice);
    }

    protected final void a()
    {
        i.c();
        ((Context)a.get()).getSharedPreferences("appsflyer-data", 0);
        i j = c;
        i.a((Context)a.get(), "appsflyerConversionDataRequestRetries", 0);
    }

    protected final void a(int j)
    {
        i.c();
        if (j >= 400 && j < 500)
        {
            j = ((Context)a.get()).getSharedPreferences("appsflyer-data", 0).getInt("appsflyerConversionDataRequestRetries", 0);
            i k = c;
            i.a((Context)a.get(), "appsflyerConversionDataRequestRetries", j + 1);
        }
    }

    public final String b()
    {
        return "https://api.appsflyer.com/install_data/v3/";
    }
}
