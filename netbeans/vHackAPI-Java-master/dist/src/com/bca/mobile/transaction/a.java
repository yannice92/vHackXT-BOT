// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import com.bca.mobile.bn;

// Referenced classes of package com.bca.mobile.transaction:
//            ChangePinActivity

final class a
    implements Runnable
{

    final ChangePinActivity a;
    private final String b[];

    a(ChangePinActivity changepinactivity, String as[])
    {
        a = changepinactivity;
        b = as;
        super();
    }

    public final void run()
    {
        a.g();
        a.a("m-Admin", bn.a(b), a.getParent(), true, "Ok");
    }
}
