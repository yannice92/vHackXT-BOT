// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.app.Dialog;
import android.os.Handler;
import com.bca.mobile.bn;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Transfer_Dafter_Rekening_ConfirmScreen

final class dj
    implements Runnable
{

    final M_Transfer_Dafter_Rekening_ConfirmScreen a;
    private final String b[];

    dj(M_Transfer_Dafter_Rekening_ConfirmScreen m_transfer_dafter_rekening_confirmscreen, String as[])
    {
        a = m_transfer_dafter_rekening_confirmscreen;
        b = as;
        super();
    }

    public final void run()
    {
        a.g();
        a.a("m-Transfer", bn.a(b), a.getParent(), true, "Ok").setCancelMessage(a.u.obtainMessage());
    }
}
