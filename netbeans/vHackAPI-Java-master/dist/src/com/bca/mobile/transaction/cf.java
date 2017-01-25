// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.widget.DatePicker;
import android.widget.EditText;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Info_Mutasi_RDN

final class cf
    implements android.app.DatePickerDialog.OnDateSetListener
{

    final M_Info_Mutasi_RDN a;

    cf(M_Info_Mutasi_RDN m_info_mutasi_rdn)
    {
        a = m_info_mutasi_rdn;
        super();
    }

    public final void onDateSet(DatePicker datepicker, int i, int j, int k)
    {
        switch (M_Info_Mutasi_RDN.a(a))
        {
        default:
            return;

        case 1: // '\001'
            M_Info_Mutasi_RDN.c(a, i);
            M_Info_Mutasi_RDN.d(a, j);
            datepicker = a;
            M_Info_Mutasi_RDN.d(datepicker, M_Info_Mutasi_RDN.b(datepicker) + 1);
            M_Info_Mutasi_RDN.e(a, k);
            String s;
            if (M_Info_Mutasi_RDN.b(a) < 10)
            {
                datepicker = (new StringBuilder("0")).append(M_Info_Mutasi_RDN.b(a)).toString();
            } else
            {
                datepicker = String.valueOf(M_Info_Mutasi_RDN.b(a));
            }
            if (M_Info_Mutasi_RDN.c(a) < 10)
            {
                s = (new StringBuilder("0")).append(M_Info_Mutasi_RDN.c(a)).toString();
            } else
            {
                s = String.valueOf(M_Info_Mutasi_RDN.c(a));
            }
            a.n.setText((new StringBuilder()).append(s).append(" - ").append(datepicker).append(" - ").append(M_Info_Mutasi_RDN.d(a)));
            return;

        case 2: // '\002'
            M_Info_Mutasi_RDN.f(a, i);
            M_Info_Mutasi_RDN.g(a, j);
            datepicker = a;
            M_Info_Mutasi_RDN.g(datepicker, M_Info_Mutasi_RDN.e(datepicker) + 1);
            M_Info_Mutasi_RDN.h(a, k);
            break;
        }
        String s1;
        if (M_Info_Mutasi_RDN.e(a) < 10)
        {
            datepicker = (new StringBuilder("0")).append(M_Info_Mutasi_RDN.e(a)).toString();
        } else
        {
            datepicker = String.valueOf(M_Info_Mutasi_RDN.e(a));
        }
        if (M_Info_Mutasi_RDN.f(a) < 10)
        {
            s1 = (new StringBuilder("0")).append(M_Info_Mutasi_RDN.f(a)).toString();
        } else
        {
            s1 = String.valueOf(M_Info_Mutasi_RDN.f(a));
        }
        a.T.setText((new StringBuilder()).append(s1).append(" - ").append(datepicker).append(" - ").append(M_Info_Mutasi_RDN.g(a)));
    }
}
