// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.content.Intent;
import com.bca.mobile.n;
import com.bca.mobile.tab.TabGroupBaseActivity;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Transfer_Status_Sakuku, M_Transfer_Detail_Status_Sakuku

final class dp
    implements Runnable
{

    final M_Transfer_Status_Sakuku a;
    private final String b[];

    dp(M_Transfer_Status_Sakuku m_transfer_status_sakuku, String as[])
    {
        a = m_transfer_status_sakuku;
        b = as;
        super();
    }

    public final void run()
    {
        n.m.put("data_2", b);
        a.g();
        Intent intent = new Intent(a.getParent(), com/bca/mobile/transaction/M_Transfer_Detail_Status_Sakuku);
        ((TabGroupBaseActivity)a.getParent()).a("Test", intent);
    }
}
