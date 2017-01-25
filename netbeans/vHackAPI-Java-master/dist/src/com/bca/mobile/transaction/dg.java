// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import com.bca.mobile.bn;
import java.io.PrintStream;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Transfer_Dafter_Bank

final class dg
    implements Runnable
{

    final M_Transfer_Dafter_Bank a;
    private final String b[];

    dg(M_Transfer_Dafter_Bank m_transfer_dafter_bank, String as[])
    {
        a = m_transfer_dafter_bank;
        b = as;
        super();
    }

    public final void run()
    {
        a.g();
        if (M_Transfer_Dafter_Bank.c(a) == 0)
        {
            a.E = 1;
            System.out.println((new StringBuilder("p_arryStrData[2]:")).append(b[2]).toString());
            if (b[2].equals("INVALID"))
            {
                a.E = 0;
                a.a("m-Transfer", bn.a(b), a.getParent(), false, "Back");
            } else
            {
                a.a("m-Transfer", bn.a(b), a.getParent(), "Ok", "Cancel");
            }
            M_Transfer_Dafter_Bank.a(a, b);
        } else
        if (M_Transfer_Dafter_Bank.c(a) == 1)
        {
            a.a("m-Transfer", bn.a(b), a.getParent(), true, "Ok");
            return;
        }
    }
}
