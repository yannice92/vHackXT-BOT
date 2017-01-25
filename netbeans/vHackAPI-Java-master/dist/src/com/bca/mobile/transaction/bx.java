// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.app.Dialog;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Info_KPR_Pinjaman, by

final class bx
    implements Runnable
{

    final M_Info_KPR_Pinjaman a;
    private final String b[];

    bx(M_Info_KPR_Pinjaman m_info_kpr_pinjaman, String as[])
    {
        a = m_info_kpr_pinjaman;
        b = as;
        super();
    }

    static M_Info_KPR_Pinjaman a(bx bx1)
    {
        return bx1.a;
    }

    public final void run()
    {
        a.g();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        a.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int i = displaymetrics.heightPixels;
        i = displaymetrics.widthPixels;
        (new by(this, a.getParent(), b[1], "m-Info")).show();
    }
}
