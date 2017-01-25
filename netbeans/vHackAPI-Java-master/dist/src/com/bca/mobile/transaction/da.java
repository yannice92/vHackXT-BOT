// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.widget.RelativeLayout;
import android.widget.TextView;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Payment_All

final class da
    implements Runnable
{

    final M_Payment_All a;
    private final boolean b;
    private final boolean c;
    private final String d;

    da(M_Payment_All m_payment_all, boolean flag, boolean flag1, String s)
    {
        a = m_payment_all;
        b = flag;
        c = flag1;
        d = s;
        super();
    }

    public final void run()
    {
        a.j;
        JVM INSTR tableswitch 0 2: default 32
    //                   0 32
    //                   1 33
    //                   2 222;
           goto _L1 _L1 _L2 _L3
_L1:
        return;
_L2:
        M_Payment_All.a(a, b);
        M_Payment_All m_payment_all = a;
        String s;
        if (c)
        {
            s = "1";
        } else
        {
            s = "";
        }
        m_payment_all.aB = s;
        M_Payment_All.b(a, c);
        M_Payment_All.b(a, d);
        a.ay = d;
        a.aa.setText(a.ay);
        if (a.aG.equals("8"))
        {
            if (!a.ao.getText().equals("- PILIH -"))
            {
                M_Payment_All.c(a);
            }
            a.ap.setVisibility(0);
            M_Payment_All.d(a);
            if (!a.at.getText().equals("- PILIH -"))
            {
                M_Payment_All.e(a);
            }
            a.au.setVisibility(0);
            M_Payment_All.f(a);
            return;
        }
          goto _L1
_L3:
        a.aF = (new StringBuilder(String.valueOf((new Integer(d)).intValue()))).toString();
        a.af.setText(a.aF);
        return;
    }
}
