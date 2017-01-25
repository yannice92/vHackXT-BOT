// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import com.bca.mobile.bn;
import com.utilities.r;
import java.io.PrintStream;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Payment_All

final class cz
    implements Runnable
{

    final M_Payment_All a;
    private final String b[];

    cz(M_Payment_All m_payment_all, String as[])
    {
        a = m_payment_all;
        b = as;
        super();
    }

    public final void run()
    {
        a.g();
        if (M_Payment_All.a(a) != 1) goto _L2; else goto _L1
_L1:
        String s;
        s = (String)a.i.get("payee_code");
        a.aH = b[2];
        M_Payment_All.a(a, bn.a(b));
        if (!s.equals("1")) goto _L4; else goto _L3
_L3:
        a.az = (String)a.i.get("amout_min");
        a.aA = (String)a.i.get("amout_max");
        System.out.println((new StringBuilder("lengInput 1:")).append(a.aA.length()).toString());
        if (b.length >= 3)
        {
            a.aH = b[2];
        }
        if (b.length >= 4)
        {
            a.aF = b[3];
        }
        a.a("m-Payment", M_Payment_All.b(a), true, a.aA.length());
_L6:
        return;
_L4:
        if (s.equals("2"))
        {
            if (b.length >= 3)
            {
                a.aH = b[2];
            }
            if (b.length >= 4)
            {
                a.aF = b[3];
            }
            a.a("m-Payment", M_Payment_All.b(a), false, 0);
            return;
        }
        if (s.equals("3"))
        {
            if (b.length >= 3)
            {
                a.aH = b[2];
            }
            if (b.length >= 4)
            {
                a.aF = b[3];
            }
            a.a("m-Payment", M_Payment_All.b(a), false, 0);
            return;
        }
        if (s.equals("8"))
        {
            if (b.length >= 3)
            {
                a.aH = b[2];
            }
            if (b.length >= 4)
            {
                a.aF = b[3];
            }
            a.a("m-Payment", M_Payment_All.b(a), false, 0);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (M_Payment_All.a(a) == 2)
        {
            if (!a.aK.equals(""))
            {
                r.a(a.getApplicationContext(), (new StringBuilder("mbca_mpaym_")).append(a.aK).append("_done").toString(), 60);
            }
            a.a("m-Payment", bn.a(b), a.getParent(), true, bn.a(0x7f0c002b));
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
