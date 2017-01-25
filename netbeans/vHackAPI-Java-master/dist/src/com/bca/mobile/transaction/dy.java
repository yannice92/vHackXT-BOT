// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import com.bca.a.a;
import com.bca.a.d;
import com.bca.a.f;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Transfer_TA_Virtual_Account

final class dy
    implements Runnable
{

    final M_Transfer_TA_Virtual_Account a;
    private final String b[];

    dy(M_Transfer_TA_Virtual_Account m_transfer_ta_virtual_account, String as[])
    {
        a = m_transfer_ta_virtual_account;
        b = as;
        super();
    }

    public final void run()
    {
        a.g();
        if (com.bca.mobile.transaction.M_Transfer_TA_Virtual_Account.a(a) == null)
        {
            com.bca.mobile.transaction.M_Transfer_TA_Virtual_Account.a(a, Integer.parseInt(b[1]));
            com.bca.mobile.transaction.M_Transfer_TA_Virtual_Account.a(a, d.a(b, M_Transfer_TA_Virtual_Account.b(a)));
            M_Transfer_TA_Virtual_Account.c(a);
        } else
        if (com.bca.mobile.transaction.M_Transfer_TA_Virtual_Account.a(a).b() != a.e)
        {
            com.bca.mobile.transaction.M_Transfer_TA_Virtual_Account.a(a).a(b);
            com.bca.mobile.transaction.M_Transfer_TA_Virtual_Account.d(a);
            return;
        }
    }
}
