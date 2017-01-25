// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.app.Dialog;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Info_Rek_Deposito, co

final class cn
    implements Runnable
{

    final M_Info_Rek_Deposito a;
    private final String b[];

    cn(M_Info_Rek_Deposito m_info_rek_deposito, String as[])
    {
        a = m_info_rek_deposito;
        b = as;
        super();
    }

    static M_Info_Rek_Deposito a(cn cn1)
    {
        return cn1.a;
    }

    public final void run()
    {
        a.g();
        if (b.length >= 2)
        {
            DisplayMetrics displaymetrics = new DisplayMetrics();
            a.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
            int i = displaymetrics.heightPixels;
            i = displaymetrics.widthPixels;
            (new co(this, a.getParent(), b[1], "m-Info")).show();
        }
    }
}
