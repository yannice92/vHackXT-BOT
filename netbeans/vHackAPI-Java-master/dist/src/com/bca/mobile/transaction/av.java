// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.widget.TextView;
import com.bca.mobile.bn;
import com.utilities.r;
import java.util.ArrayList;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Commerce_PLN, ax

final class av
    implements Runnable
{

    final M_Commerce_PLN a;
    private final String b[];

    av(M_Commerce_PLN m_commerce_pln, String as[])
    {
        a = m_commerce_pln;
        b = as;
        super();
    }

    public final void run()
    {
        a.g();
        if (M_Commerce_PLN.d(a) != 1) goto _L2; else goto _L1
_L1:
        M_Commerce_PLN.a(a, bn.a(b));
        Integer.parseInt(((ax)M_Commerce_PLN.b(a).get(M_Commerce_PLN.c(a))).b());
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
        M_Commerce_PLN.b(a, b[3]);
        M_Commerce_PLN.c(a, "");
        a.a("m-Commerce", M_Commerce_PLN.e(a), true);
        return;
_L5:
        M_Commerce_PLN.b(a, b[3]);
        M_Commerce_PLN.c(a, b[2]);
        a.a("m-Commerce", M_Commerce_PLN.e(a), false);
        return;
_L6:
        M_Commerce_PLN.b(a, b[3]);
        M_Commerce_PLN.c(a, M_Commerce_PLN.f(a).getText().toString());
        a.a("m-Commerce", M_Commerce_PLN.e(a), false);
        return;
_L7:
        M_Commerce_PLN.b(a, b[3]);
        M_Commerce_PLN.c(a, M_Commerce_PLN.a(a).getText().toString());
        a.a("m-Commerce", M_Commerce_PLN.e(a), false);
        return;
_L8:
        M_Commerce_PLN.b(a, b[6]);
        M_Commerce_PLN.a(a, Integer.valueOf(b[3]));
        M_Commerce_PLN.c(a, "");
        M_Commerce_PLN.d(a, b[2]);
        M_Commerce_PLN m_commerce_pln = a;
        M_Commerce_PLN m_commerce_pln2 = a;
        M_Commerce_PLN.a(m_commerce_pln, M_Commerce_PLN.j(b[4]));
        M_Commerce_PLN.b(a, new ArrayList(M_Commerce_PLN.g(a)));
        if (!b[5].equalsIgnoreCase(""))
        {
            M_Commerce_PLN m_commerce_pln1 = a;
            M_Commerce_PLN m_commerce_pln3 = a;
            M_Commerce_PLN.c(m_commerce_pln1, M_Commerce_PLN.j(b[5]));
            M_Commerce_PLN.h(a).addAll(M_Commerce_PLN.i(a));
        }
        a.b = ((ax)M_Commerce_PLN.b(a).get(M_Commerce_PLN.c(a))).f().length();
        M_Commerce_PLN.a(a, Integer.parseInt(((ax)M_Commerce_PLN.b(a).get(M_Commerce_PLN.c(a))).e()));
        M_Commerce_PLN.a(a, Long.parseLong(((ax)M_Commerce_PLN.b(a).get(M_Commerce_PLN.c(a))).f()));
        M_Commerce_PLN.a(a, false);
        a.H = "";
        M_Commerce_PLN.e(a, "");
        a.a("m-Commerce", M_Commerce_PLN.e(a), a.b);
        return;
_L2:
        if (M_Commerce_PLN.d(a) == 2)
        {
            a.E = 0;
            M_Commerce_PLN.e(a, "");
            if (b[1].contains(":@:STROOM/TOKEN :@:"))
            {
                r.a(a.getApplicationContext(), "mbca_mcomm_pln_done", 60);
            }
            a.a("m-Commerce", bn.a(b), a.getParent(), true, "Ok");
            return;
        }
        if (true) goto _L3; else goto _L9
_L9:
    }
}
