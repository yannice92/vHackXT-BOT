// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.widget.TextView;
import com.bca.mobile.bn;
import com.utilities.r;
import java.util.ArrayList;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Commerce_Voucher1, bk

final class bj
    implements Runnable
{

    final M_Commerce_Voucher1 a;
    private final String b[];

    bj(M_Commerce_Voucher1 m_commerce_voucher1, String as[])
    {
        a = m_commerce_voucher1;
        b = as;
        super();
    }

    public final void run()
    {
        a.g();
        if (M_Commerce_Voucher1.d(a) != 1) goto _L2; else goto _L1
_L1:
        M_Commerce_Voucher1.a(a, bn.a(b));
        Integer.parseInt(((bk)M_Commerce_Voucher1.b(a).get(M_Commerce_Voucher1.c(a))).b());
        JVM INSTR tableswitch 1 5: default 92
    //                   1 93
    //                   2 133
    //                   3 177
    //                   4 230
    //                   5 230;
           goto _L3 _L4 _L5 _L6 _L7 _L7
_L3:
        return;
_L4:
        M_Commerce_Voucher1.b(a, b[3]);
        M_Commerce_Voucher1.c(a, "");
        a.a("m-Commerce", M_Commerce_Voucher1.e(a), true);
        return;
_L5:
        M_Commerce_Voucher1.b(a, b[3]);
        M_Commerce_Voucher1.c(a, b[2]);
        a.a("m-Commerce", M_Commerce_Voucher1.e(a), false);
        return;
_L6:
        M_Commerce_Voucher1.b(a, b[3]);
        M_Commerce_Voucher1.c(a, M_Commerce_Voucher1.f(a).getText().toString());
        a.a("m-Commerce", M_Commerce_Voucher1.e(a), false);
        return;
_L7:
        M_Commerce_Voucher1.b(a, b[3]);
        M_Commerce_Voucher1.c(a, M_Commerce_Voucher1.a(a).getText().toString());
        a.a("m-Commerce", M_Commerce_Voucher1.e(a), false);
        return;
_L2:
        if (M_Commerce_Voucher1.d(a) == 2)
        {
            a.E = 0;
            if (b[1].contains(":@:BERHASIL:@:"))
            {
                r.a(a.getApplicationContext(), "mbca_mcomm_vouc_done", 60);
            }
            a.a("m-Commerce", bn.a(b), a.getParent(), true, "Ok");
            return;
        }
        if (true) goto _L3; else goto _L8
_L8:
    }
}
