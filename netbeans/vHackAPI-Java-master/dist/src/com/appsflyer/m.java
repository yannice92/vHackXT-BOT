// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer;

import android.content.Context;
import com.appsflyer.a.a;
import com.appsflyer.a.b;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.appsflyer:
//            i, b

final class m
    implements Runnable
{

    final i a;
    private WeakReference b;

    public m(i j, Context context)
    {
        a = j;
        super();
        b = null;
        b = new WeakReference(context);
    }

    public final void run()
    {
        if (!i.d()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        com.appsflyer.i.b(System.currentTimeMillis());
        if (b == null) goto _L1; else goto _L3
_L3:
        com.appsflyer.i.a(true);
        String s;
        i j = a;
        s = com.appsflyer.i.a("AppsFlyerKey");
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator;
        com.appsflyer.a.a.a();
        iterator = com.appsflyer.a.a.b((Context)b.get()).iterator();
_L6:
        if (!iterator.hasNext()) goto _L5; else goto _L4
_L4:
        b b1;
        b1 = (b)iterator.next();
        com.appsflyer.b.a((new StringBuilder("resending request: ")).append(b1.c()).toString());
        long l = System.currentTimeMillis();
        long l1 = Long.parseLong(b1.d(), 10);
        com.appsflyer.i.a(a, (new StringBuilder()).append(b1.c()).append("&isCachedRequest=true&timeincache=").append(Long.toString((l - l1) / 1000L)).toString(), b1.b(), s, b, b1.d(), false);
          goto _L6
        Exception exception2;
        exception2;
        com.appsflyer.b.a("Failed to resend cached request");
          goto _L6
        Exception exception1;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        obj;
        com.appsflyer.b.a("failed to check cache.");
        com.appsflyer.i.a(false);
_L8:
        i.e().shutdown();
        i.f();
        return;
_L5:
        obj;
        JVM INSTR monitorexit ;
        com.appsflyer.i.a(false);
        if (true) goto _L8; else goto _L7
_L7:
        Exception exception;
        exception;
        com.appsflyer.i.a(false);
        throw exception;
    }
}
