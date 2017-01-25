// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;


// Referenced classes of package com.bca.mobile:
//            x, MainActivity, bn

final class y
    implements Runnable
{

    final x a;

    y(x x1)
    {
        a = x1;
        super();
    }

    public final void run()
    {
        x.a(a).e();
        bn.a("Transaction Time Out.", x.a(a));
    }
}
