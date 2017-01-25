// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.widget.TextView;
import com.bca.mobile.bn;
import java.util.ArrayList;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Commerce_PMA, bd

final class bb
    implements Runnable
{

    final M_Commerce_PMA a;
    private final String b[];

    bb(M_Commerce_PMA m_commerce_pma, String as[])
    {
        a = m_commerce_pma;
        b = as;
        super();
    }

    public final void run()
    {
        a.g();
        if (M_Commerce_PMA.d(a) != 1) goto _L2; else goto _L1
_L1:
        M_Commerce_PMA.a(a, bn.a(b));
        Integer.parseInt(((bd)M_Commerce_PMA.b(a).get(M_Commerce_PMA.c(a))).b());
        JVM INSTR tableswitch 1 6: default 96
    //                   1 97
    //                   2 137
    //                   3 181
    //                   4 234
    //                   5 234
    //                   6 287;
           goto _L3 _L4 _L5 _L6 _L7 _L7 _L8
_L3:
        return;
_L4:
        M_Commerce_PMA.b(a, b[3]);
        M_Commerce_PMA.c(a, "");
        a.a("m-Commerce", M_Commerce_PMA.e(a), true);
        return;
_L5:
        M_Commerce_PMA.b(a, b[3]);
        M_Commerce_PMA.c(a, b[2]);
        a.a("m-Commerce", M_Commerce_PMA.e(a), false);
        return;
_L6:
        M_Commerce_PMA.b(a, b[3]);
        M_Commerce_PMA.c(a, M_Commerce_PMA.f(a).getText().toString());
        a.a("m-Commerce", M_Commerce_PMA.e(a), false);
        return;
_L7:
        M_Commerce_PMA.b(a, b[3]);
        M_Commerce_PMA.c(a, M_Commerce_PMA.a(a).getText().toString());
        a.a("m-Commerce", M_Commerce_PMA.e(a), false);
        return;
_L8:
        M_Commerce_PMA.b(a, b[6]);
        M_Commerce_PMA.a(a, Integer.valueOf(b[3]));
        M_Commerce_PMA.c(a, "");
        M_Commerce_PMA.d(a, b[2]);
        M_Commerce_PMA m_commerce_pma = a;
        M_Commerce_PMA m_commerce_pma2 = a;
        M_Commerce_PMA.a(m_commerce_pma, M_Commerce_PMA.j(b[4]));
        M_Commerce_PMA.b(a, new ArrayList(M_Commerce_PMA.g(a)));
        if (!b[5].equalsIgnoreCase(""))
        {
            M_Commerce_PMA m_commerce_pma1 = a;
            M_Commerce_PMA m_commerce_pma3 = a;
            M_Commerce_PMA.c(m_commerce_pma1, M_Commerce_PMA.j(b[5]));
            M_Commerce_PMA.h(a).addAll(M_Commerce_PMA.i(a));
        }
        a.b = ((bd)M_Commerce_PMA.b(a).get(M_Commerce_PMA.c(a))).f().length();
        M_Commerce_PMA.a(a, Integer.parseInt(((bd)M_Commerce_PMA.b(a).get(M_Commerce_PMA.c(a))).e()));
        M_Commerce_PMA.a(a, Long.parseLong(((bd)M_Commerce_PMA.b(a).get(M_Commerce_PMA.c(a))).f()));
        M_Commerce_PMA.a(a, false);
        a.H = "";
        M_Commerce_PMA.e(a, "");
        a.a("m-Commerce", M_Commerce_PMA.e(a), a.b);
        return;
_L2:
        if (M_Commerce_PMA.d(a) == 2)
        {
            a.E = 0;
            M_Commerce_PMA.e(a, "");
            a.a("m-Commerce", bn.a(b), a.getParent(), true, "Ok");
            return;
        }
        if (true) goto _L3; else goto _L9
_L9:
    }
}
