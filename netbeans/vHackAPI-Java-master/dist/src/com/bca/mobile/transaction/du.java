// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.widget.EditText;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Transfer_TA_Rekening

final class du
    implements Runnable
{

    final M_Transfer_TA_Rekening a;
    private final String b;

    du(M_Transfer_TA_Rekening m_transfer_ta_rekening, String s)
    {
        a = m_transfer_ta_rekening;
        b = s;
        super();
    }

    public final void run()
    {
        if (!M_Transfer_TA_Rekening.d(a).booleanValue())
        {
            switch (M_Transfer_TA_Rekening.f(a))
            {
            default:
                return;

            case 3: // '\003'
                M_Transfer_TA_Rekening.c(a, b);
                return;

            case 4: // '\004'
                M_Transfer_TA_Rekening.d(a, (new StringBuilder(String.valueOf((new Integer(b)).intValue()))).toString());
                break;
            }
            return;
        } else
        {
            M_Transfer_TA_Rekening.g(a).setText(b);
            M_Transfer_TA_Rekening.a(a, Boolean.valueOf(false));
            return;
        }
    }
}
