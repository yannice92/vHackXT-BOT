// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import com.bca.mobile.bn;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Commerce_Voucher

final class be
    implements Runnable
{

    final M_Commerce_Voucher a;
    private final String b[];

    be(M_Commerce_Voucher m_commerce_voucher, String as[])
    {
        a = m_commerce_voucher;
        b = as;
        super();
    }

    public final void run()
    {
        a.g();
        if (M_Commerce_Voucher.a(a) != 1) goto _L2; else goto _L1
_L1:
        if (!a.am.equals("1")) goto _L4; else goto _L3
_L3:
        if (b.length >= 3)
        {
            a.an = b[2];
        }
        if (b.length >= 4)
        {
            a.al = b[3];
        }
        a.a("m-Commerce", bn.a(b), true);
_L6:
        return;
_L4:
        if (a.am.equals("2"))
        {
            if (b.length >= 3)
            {
                a.an = b[2];
            }
            if (b.length >= 4)
            {
                a.al = b[3];
            }
            a.a("m-Commerce", bn.a(b), false);
            return;
        }
        if (b.length >= 3)
        {
            a.an = b[2];
        }
        if (b.length >= 4)
        {
            a.al = b[3];
        }
        a.a("m-Commerce", bn.a(b), false);
        return;
_L2:
        if (M_Commerce_Voucher.a(a) == 2)
        {
            a.a("m-Commerce", bn.a(b), a.getParent(), true, "ok");
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
