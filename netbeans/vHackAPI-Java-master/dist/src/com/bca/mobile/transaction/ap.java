// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.widget.TextView;
import com.bca.mobile.bn;
import java.util.ArrayList;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Commerce_Lainnya1, ar

final class ap
    implements Runnable
{

    final M_Commerce_Lainnya1 a;
    private final String b[];

    ap(M_Commerce_Lainnya1 m_commerce_lainnya1, String as[])
    {
        a = m_commerce_lainnya1;
        b = as;
        super();
    }

    public final void run()
    {
        a.g();
        if (M_Commerce_Lainnya1.d(a) != 1) goto _L2; else goto _L1
_L1:
        M_Commerce_Lainnya1.a(a, bn.a(b));
        Integer.parseInt(((ar)M_Commerce_Lainnya1.b(a).get(M_Commerce_Lainnya1.c(a))).b());
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
        M_Commerce_Lainnya1.b(a, b[3]);
        M_Commerce_Lainnya1.c(a, "");
        a.a("m-Commerce", M_Commerce_Lainnya1.e(a), true);
        return;
_L5:
        M_Commerce_Lainnya1.b(a, b[3]);
        M_Commerce_Lainnya1.c(a, b[2]);
        a.a("m-Commerce", M_Commerce_Lainnya1.e(a), false);
        return;
_L6:
        M_Commerce_Lainnya1.b(a, b[3]);
        M_Commerce_Lainnya1.c(a, M_Commerce_Lainnya1.f(a).getText().toString());
        a.a("m-Commerce", M_Commerce_Lainnya1.e(a), false);
        return;
_L7:
        M_Commerce_Lainnya1.b(a, b[3]);
        M_Commerce_Lainnya1.c(a, M_Commerce_Lainnya1.a(a).getText().toString());
        a.a("m-Commerce", M_Commerce_Lainnya1.e(a), false);
        return;
_L8:
        M_Commerce_Lainnya1.b(a, b[6]);
        M_Commerce_Lainnya1.a(a, Integer.valueOf(b[3]));
        M_Commerce_Lainnya1.c(a, "");
        M_Commerce_Lainnya1.d(a, b[2]);
        M_Commerce_Lainnya1 m_commerce_lainnya1 = a;
        M_Commerce_Lainnya1 m_commerce_lainnya1_2 = a;
        M_Commerce_Lainnya1.a(m_commerce_lainnya1, M_Commerce_Lainnya1.j(b[4]));
        M_Commerce_Lainnya1.b(a, new ArrayList(M_Commerce_Lainnya1.g(a)));
        if (!b[5].equalsIgnoreCase(""))
        {
            M_Commerce_Lainnya1 m_commerce_lainnya1_1 = a;
            M_Commerce_Lainnya1 m_commerce_lainnya1_3 = a;
            M_Commerce_Lainnya1.c(m_commerce_lainnya1_1, M_Commerce_Lainnya1.j(b[5]));
            M_Commerce_Lainnya1.h(a).addAll(M_Commerce_Lainnya1.i(a));
        }
        a.b = ((ar)M_Commerce_Lainnya1.b(a).get(M_Commerce_Lainnya1.c(a))).f().length();
        M_Commerce_Lainnya1.a(a, Integer.parseInt(((ar)M_Commerce_Lainnya1.b(a).get(M_Commerce_Lainnya1.c(a))).e()));
        M_Commerce_Lainnya1.a(a, Long.parseLong(((ar)M_Commerce_Lainnya1.b(a).get(M_Commerce_Lainnya1.c(a))).f()));
        M_Commerce_Lainnya1.a(a, false);
        a.H = "";
        M_Commerce_Lainnya1.e(a, "");
        a.a("m-Commerce", M_Commerce_Lainnya1.e(a), a.b);
        return;
_L2:
        if (M_Commerce_Lainnya1.d(a) == 2)
        {
            a.E = 0;
            M_Commerce_Lainnya1.e(a, "");
            a.a("m-Commerce", bn.a(b), a.getParent(), true, "Ok");
            return;
        }
        if (true) goto _L3; else goto _L9
_L9:
    }
}
