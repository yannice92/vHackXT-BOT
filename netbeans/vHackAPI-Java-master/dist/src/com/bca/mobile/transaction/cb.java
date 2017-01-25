// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.app.Dialog;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bca.mobile.bm;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Info_Lainnya, cc

final class cb
    implements Runnable
{

    final M_Info_Lainnya a;
    private final String b[];

    cb(M_Info_Lainnya m_info_lainnya, String as[])
    {
        a = m_info_lainnya;
        b = as;
        super();
    }

    public final void run()
    {
        if (M_Info_Lainnya.b(a) != null)
        {
            bm bm1 = M_Info_Lainnya.b(a);
            M_Info_Lainnya m_info_lainnya = a;
            bm1.a(M_Info_Lainnya.d(4));
            M_Info_Lainnya.b(a).notifyDataSetChanged();
        }
        a.g();
        DisplayMetrics displaymetrics;
        switch (M_Info_Lainnya.c(a))
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            displaymetrics = new DisplayMetrics();
            break;
        }
        a.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int i = displaymetrics.heightPixels;
        i = displaymetrics.widthPixels;
        a.B = new cc(this, a.getParent(), b[1], "m-Info");
        a.B.show();
    }
}
