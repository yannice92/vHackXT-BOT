// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.widget.TextView;
import com.bca.a.a;
import com.bca.a.f;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Transfer_TA_Sakuku

final class dx
    implements Runnable
{

    final M_Transfer_TA_Sakuku a;
    private final boolean b;
    private final String c;

    dx(M_Transfer_TA_Sakuku m_transfer_ta_sakuku, boolean flag, String s)
    {
        a = m_transfer_ta_sakuku;
        b = flag;
        c = s;
        super();
    }

    public final void run()
    {
        a a1;
        if (M_Transfer_TA_Sakuku.o(a) == 1)
        {
            com.bca.mobile.transaction.M_Transfer_TA_Sakuku.a(a, b);
            M_Transfer_TA_Sakuku.p(a).setText(c);
            com.bca.mobile.transaction.M_Transfer_TA_Sakuku.a(a, c);
            M_Transfer_TA_Sakuku.b(a, c);
            M_Transfer_TA_Sakuku.q(a);
            return;
        }
        if (M_Transfer_TA_Sakuku.o(a) == 3)
        {
            M_Transfer_TA_Sakuku.r(a).setText(c);
            return;
        }
        a1 = M_Transfer_TA_Sakuku.j(a).b();
        if (a1 != a.b) goto _L2; else goto _L1
_L1:
        M_Transfer_TA_Sakuku.j(a).d(c);
_L4:
        M_Transfer_TA_Sakuku.n(a);
        return;
_L2:
        if (a1 == a.c)
        {
            M_Transfer_TA_Sakuku.j(a).a(c);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
