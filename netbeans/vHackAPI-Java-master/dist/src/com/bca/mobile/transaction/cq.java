// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.app.Dialog;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Info_Saldo_Reksadana, cr

final class cq
    implements Runnable
{

    final M_Info_Saldo_Reksadana a;
    private final String b[];

    cq(M_Info_Saldo_Reksadana m_info_saldo_reksadana, String as[])
    {
        a = m_info_saldo_reksadana;
        b = as;
        super();
    }

    static M_Info_Saldo_Reksadana a(cq cq1)
    {
        return cq1.a;
    }

    public final void run()
    {
        a.g();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        a.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int i = displaymetrics.heightPixels;
        i = displaymetrics.widthPixels;
        (new cr(this, a.getParent(), b[1], "m-Info")).show();
    }
}
