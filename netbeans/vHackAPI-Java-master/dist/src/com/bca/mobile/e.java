// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;


// Referenced classes of package com.bca.mobile:
//            ActivateActivity_Trans, bn

final class e
    implements Runnable
{

    final ActivateActivity_Trans a;
    private final String b[];

    e(ActivateActivity_Trans activateactivity_trans, String as[])
    {
        a = activateactivity_trans;
        b = as;
        super();
    }

    public final void run()
    {
        a.g();
        a.a("m-BCA", b[1].replace(":@:", "\n"), a, true, bn.a(0x7f0c002b));
    }
}
