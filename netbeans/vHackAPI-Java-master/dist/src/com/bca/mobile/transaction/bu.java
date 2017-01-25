// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.app.Dialog;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Info_KK_Transaksi, bv

final class bu
    implements Runnable
{

    final M_Info_KK_Transaksi a;
    private final String b[];

    bu(M_Info_KK_Transaksi m_info_kk_transaksi, String as[])
    {
        a = m_info_kk_transaksi;
        b = as;
        super();
    }

    static M_Info_KK_Transaksi a(bu bu1)
    {
        return bu1.a;
    }

    public final void run()
    {
        a.g();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        a.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int i = displaymetrics.heightPixels;
        i = displaymetrics.widthPixels;
        (new bv(this, a.getParent(), b[1], "m-Info")).show();
    }
}
