// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.widget.TextView;
import com.bca.a.a;
import com.bca.a.f;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Transfer_TA_Virtual_Account

final class dz
    implements Runnable
{

    final M_Transfer_TA_Virtual_Account a;
    private final boolean b;
    private final String c;

    dz(M_Transfer_TA_Virtual_Account m_transfer_ta_virtual_account, boolean flag, String s)
    {
        a = m_transfer_ta_virtual_account;
        b = flag;
        c = s;
        super();
    }

    public final void run()
    {
        a a1;
        if (M_Transfer_TA_Virtual_Account.e(a) == 1)
        {
            com.bca.mobile.transaction.M_Transfer_TA_Virtual_Account.a(a, b);
            com.bca.mobile.transaction.M_Transfer_TA_Virtual_Account.f(a).setText(c);
            com.bca.mobile.transaction.M_Transfer_TA_Virtual_Account.a(a, c);
            M_Transfer_TA_Virtual_Account.b(a, c);
            M_Transfer_TA_Virtual_Account.g(a);
            return;
        }
        a1 = com.bca.mobile.transaction.M_Transfer_TA_Virtual_Account.a(a).b();
        if (a1 != a.b) goto _L2; else goto _L1
_L1:
        com.bca.mobile.transaction.M_Transfer_TA_Virtual_Account.a(a).d(c);
_L4:
        M_Transfer_TA_Virtual_Account.d(a);
        return;
_L2:
        if (a1 == a.c)
        {
            com.bca.mobile.transaction.M_Transfer_TA_Virtual_Account.a(a).a(c);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
