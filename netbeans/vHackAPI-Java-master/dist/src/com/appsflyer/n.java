// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer;

import android.content.Context;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.appsflyer:
//            i

final class n
    implements Runnable
{

    final i a;
    private Context b;
    private String c;
    private String d;
    private String e;
    private String f;
    private ExecutorService g;
    private boolean h;

    private n(i j, Context context, String s, String s1, String s2, boolean flag, ExecutorService executorservice)
    {
        a = j;
        super();
        b = context;
        c = null;
        d = s;
        e = s1;
        f = s2;
        h = flag;
        g = executorservice;
    }

    n(i j, Context context, String s, String s1, String s2, boolean flag, ExecutorService executorservice, 
            byte byte0)
    {
        this(j, context, s, s1, s2, flag, executorservice);
    }

    public final void run()
    {
        i.a(a, b, c, d, e, f, h);
        g.shutdown();
    }
}
