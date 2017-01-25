// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;


// Referenced classes of package com.bca.mobile.transaction:
//            M_Transfer_TA_Bank

final class dr
    implements Runnable
{

    final M_Transfer_TA_Bank a;
    private final String b[];

    dr(M_Transfer_TA_Bank m_transfer_ta_bank, String as[])
    {
        a = m_transfer_ta_bank;
        b = as;
        super();
    }

    public final void run()
    {
        a.g();
        if (a.E == 1)
        {
            a.E = 1;
            a.aj = b[2];
            a.ai = b[3];
            a.a("m-Transfer", b[1].replace(":@:", "\n"), a.getParent(), "Ok", "Cancel");
        } else
        if (a.E == 2)
        {
            a.a("m-Transfer", b[1].replace(":@:", "\n"), a.getParent(), true, "Ok");
            return;
        }
    }
}
