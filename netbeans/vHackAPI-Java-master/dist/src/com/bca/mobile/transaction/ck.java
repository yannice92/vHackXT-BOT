// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.app.Dialog;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Info_Mutasi_Rekening, cl

final class ck
    implements Runnable
{

    final M_Info_Mutasi_Rekening a;
    private final String b[];

    ck(M_Info_Mutasi_Rekening m_info_mutasi_rekening, String as[])
    {
        a = m_info_mutasi_rekening;
        b = as;
        super();
    }

    static M_Info_Mutasi_Rekening a(ck ck1)
    {
        return ck1.a;
    }

    public final void run()
    {
        a.g();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        a.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int i = displaymetrics.heightPixels;
        i = displaymetrics.widthPixels;
        (new cl(this, a.getParent(), b[1], "m-Info")).show();
    }
}
