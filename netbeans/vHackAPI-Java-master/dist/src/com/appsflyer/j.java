// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer;

import android.app.Activity;

// Referenced classes of package com.appsflyer:
//            x, b, i

final class j
    implements x
{

    final i a;

    j(i k)
    {
        a = k;
        super();
    }

    public final void a(Activity activity)
    {
        com.appsflyer.b.a("onBecameForeground");
        i.a(System.currentTimeMillis());
        a.a(activity, null, null);
    }

    public final void b(Activity activity)
    {
        com.appsflyer.b.a("onBecameBackground");
        com.appsflyer.b.a("callStatsBackground background call");
        i k = a;
        i.b(activity.getApplicationContext());
    }
}
