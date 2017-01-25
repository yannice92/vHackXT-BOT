// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import com.bca.mobile.bn;

// Referenced classes of package com.bca.mobile.transaction:
//            ChangePinActivity_Trans

final class b
    implements Runnable
{

    final ChangePinActivity_Trans a;
    private final String b[];

    b(ChangePinActivity_Trans changepinactivity_trans, String as[])
    {
        a = changepinactivity_trans;
        b = as;
        super();
    }

    public final void run()
    {
        a.g();
        a.a("m-BCA", bn.a(b), a, true, "Ok");
    }
}
