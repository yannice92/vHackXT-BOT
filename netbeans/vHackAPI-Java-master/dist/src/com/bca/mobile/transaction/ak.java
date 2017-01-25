// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import com.bca.mobile.bn;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Commerce_Lainnya

final class ak
    implements Runnable
{

    final M_Commerce_Lainnya a;
    private final String b[];

    ak(M_Commerce_Lainnya m_commerce_lainnya, String as[])
    {
        a = m_commerce_lainnya;
        b = as;
        super();
    }

    public final void run()
    {
        a.g();
        if (M_Commerce_Lainnya.a(a) != 1) goto _L2; else goto _L1
_L1:
        M_Commerce_Lainnya.a(a, bn.a(b));
        if (!a.an.equals("1")) goto _L4; else goto _L3
_L3:
        if (b.length >= 3)
        {
            a.ao = b[2];
        }
        if (b.length >= 4)
        {
            a.am = b[3];
        }
        a.a("m-Commerce", M_Commerce_Lainnya.b(a), true);
_L6:
        return;
_L4:
        if (a.an.equals("2"))
        {
            if (b.length >= 3)
            {
                a.ao = b[2];
            }
            if (b.length >= 4)
            {
                a.am = b[3];
            }
            a.a("m-Commerce", M_Commerce_Lainnya.b(a), false);
            return;
        }
        if (a.an.equals("3"))
        {
            if (b.length >= 3)
            {
                a.ao = b[2];
            }
            if (b.length >= 4)
            {
                a.am = b[3];
            }
            a.a("m-Commerce", M_Commerce_Lainnya.b(a), false);
            return;
        }
        if (b.length >= 3)
        {
            a.ao = b[2];
        }
        if (b.length >= 4)
        {
            a.am = b[3];
        }
        a.a("m-Commerce", M_Commerce_Lainnya.b(a), false);
        return;
_L2:
        if (M_Commerce_Lainnya.a(a) == 2)
        {
            a.a("m-Commerce", bn.a(b), a.getParent(), true, "Ok");
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
