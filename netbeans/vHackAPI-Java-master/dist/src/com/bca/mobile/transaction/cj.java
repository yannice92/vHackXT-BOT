// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.widget.DatePicker;
import android.widget.EditText;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Info_Mutasi_Rekening

final class cj
    implements android.app.DatePickerDialog.OnDateSetListener
{

    final M_Info_Mutasi_Rekening a;

    cj(M_Info_Mutasi_Rekening m_info_mutasi_rekening)
    {
        a = m_info_mutasi_rekening;
        super();
    }

    public final void onDateSet(DatePicker datepicker, int i, int j, int k)
    {
        switch (M_Info_Mutasi_Rekening.a(a))
        {
        default:
            return;

        case 1: // '\001'
            M_Info_Mutasi_Rekening.a(a, i);
            M_Info_Mutasi_Rekening.b(a, j);
            datepicker = a;
            M_Info_Mutasi_Rekening.b(datepicker, M_Info_Mutasi_Rekening.b(datepicker) + 1);
            M_Info_Mutasi_Rekening.c(a, k);
            String s;
            if (M_Info_Mutasi_Rekening.b(a) < 10)
            {
                datepicker = (new StringBuilder("0")).append(M_Info_Mutasi_Rekening.b(a)).toString();
            } else
            {
                datepicker = String.valueOf(M_Info_Mutasi_Rekening.b(a));
            }
            if (M_Info_Mutasi_Rekening.c(a) < 10)
            {
                s = (new StringBuilder("0")).append(M_Info_Mutasi_Rekening.c(a)).toString();
            } else
            {
                s = String.valueOf(M_Info_Mutasi_Rekening.c(a));
            }
            a.i.setText((new StringBuilder()).append(s).append(" - ").append(datepicker).append(" - ").append(M_Info_Mutasi_Rekening.d(a)));
            return;

        case 2: // '\002'
            M_Info_Mutasi_Rekening.d(a, i);
            M_Info_Mutasi_Rekening.e(a, j);
            datepicker = a;
            M_Info_Mutasi_Rekening.e(datepicker, M_Info_Mutasi_Rekening.e(datepicker) + 1);
            M_Info_Mutasi_Rekening.f(a, k);
            break;
        }
        String s1;
        if (M_Info_Mutasi_Rekening.e(a) < 10)
        {
            datepicker = (new StringBuilder("0")).append(M_Info_Mutasi_Rekening.e(a)).toString();
        } else
        {
            datepicker = String.valueOf(M_Info_Mutasi_Rekening.e(a));
        }
        if (M_Info_Mutasi_Rekening.f(a) < 10)
        {
            s1 = (new StringBuilder("0")).append(M_Info_Mutasi_Rekening.f(a)).toString();
        } else
        {
            s1 = String.valueOf(M_Info_Mutasi_Rekening.f(a));
        }
        a.j.setText((new StringBuilder()).append(s1).append(" - ").append(datepicker).append(" - ").append(M_Info_Mutasi_Rekening.g(a)));
    }
}
