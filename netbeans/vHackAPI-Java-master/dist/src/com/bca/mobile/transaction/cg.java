// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.app.Dialog;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Info_Mutasi_RDN, ch

final class cg
    implements Runnable
{

    final M_Info_Mutasi_RDN a;
    private final String b[];

    cg(M_Info_Mutasi_RDN m_info_mutasi_rdn, String as[])
    {
        a = m_info_mutasi_rdn;
        b = as;
        super();
    }

    static M_Info_Mutasi_RDN a(cg cg1)
    {
        return cg1.a;
    }

    public final void run()
    {
        a.g();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        a.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int i = displaymetrics.heightPixels;
        i = displaymetrics.widthPixels;
        (new ch(this, a.getParent(), b[1], "m-Info")).show();
    }
}
