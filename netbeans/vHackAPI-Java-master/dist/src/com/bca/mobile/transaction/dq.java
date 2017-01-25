// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import com.bca.a.f;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Transfer_Status_Sakuku

final class dq
    implements Runnable
{

    final M_Transfer_Status_Sakuku a;

    dq(M_Transfer_Status_Sakuku m_transfer_status_sakuku)
    {
        a = m_transfer_status_sakuku;
        super();
    }

    public final void run()
    {
        M_Transfer_Status_Sakuku.j(a).b();
        M_Transfer_Status_Sakuku.k(a);
    }
}
