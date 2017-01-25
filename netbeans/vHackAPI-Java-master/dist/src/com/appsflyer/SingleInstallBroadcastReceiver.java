// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.appsflyer:
//            q, b, i

public class SingleInstallBroadcastReceiver extends BroadcastReceiver
{

    public SingleInstallBroadcastReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        String s = q.a().a("referrer_timestamp");
        long l = System.currentTimeMillis();
        if (s != null && l - Long.valueOf(s).longValue() < 2000L)
        {
            return;
        } else
        {
            b.a("SingleInstallBroadcastReceiver called");
            i.a().a(context, intent);
            q.a().a("referrer_timestamp", String.valueOf(System.currentTimeMillis()));
            return;
        }
    }
}
