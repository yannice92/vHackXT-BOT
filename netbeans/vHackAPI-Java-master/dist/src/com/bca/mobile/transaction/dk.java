// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import com.bca.mobile.n;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Transfer_Detail_Status_Sakuku

final class dk
    implements Runnable
{

    final M_Transfer_Detail_Status_Sakuku a;
    private final String b[];

    dk(M_Transfer_Detail_Status_Sakuku m_transfer_detail_status_sakuku, String as[])
    {
        a = m_transfer_detail_status_sakuku;
        b = as;
        super();
    }

    public final void run()
    {
        a.g();
        a.l = b[1].toString().replaceAll(":@:", "\n");
        a.a(n.x, a.l, a.getParent(), true, "OK");
    }
}
