// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.app.Dialog;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Info_KK_Saldo, bs

final class br
    implements Runnable
{

    final M_Info_KK_Saldo a;
    private final String b[];

    br(M_Info_KK_Saldo m_info_kk_saldo, String as[])
    {
        a = m_info_kk_saldo;
        b = as;
        super();
    }

    static M_Info_KK_Saldo a(br br1)
    {
        return br1.a;
    }

    public final void run()
    {
        a.g();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        a.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int i = displaymetrics.heightPixels;
        i = displaymetrics.widthPixels;
        (new bs(this, a.getParent(), b[1], "m-Info")).show();
    }
}
