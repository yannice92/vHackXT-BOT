// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import com.bca.a.a;
import com.bca.a.d;
import com.bca.a.f;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Transfer_TA_Sakuku

final class dw
    implements Runnable
{

    final M_Transfer_TA_Sakuku a;
    private final String b[];

    dw(M_Transfer_TA_Sakuku m_transfer_ta_sakuku, String as[])
    {
        a = m_transfer_ta_sakuku;
        b = as;
        super();
    }

    public final void run()
    {
        a.g();
        if (M_Transfer_TA_Sakuku.j(a) == null)
        {
            M_Transfer_TA_Sakuku.k(a);
            com.bca.mobile.transaction.M_Transfer_TA_Sakuku.a(a, d.a(b, M_Transfer_TA_Sakuku.l(a)));
            M_Transfer_TA_Sakuku.j(a).h();
            M_Transfer_TA_Sakuku.j(a).b(b[7]);
            M_Transfer_TA_Sakuku.m(a);
        } else
        if (M_Transfer_TA_Sakuku.j(a).b() != a.e)
        {
            M_Transfer_TA_Sakuku.j(a).a(b);
            M_Transfer_TA_Sakuku.n(a);
            return;
        }
    }
}
