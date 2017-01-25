// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.widget.DatePicker;
import android.widget.EditText;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Transfer_TA_Sakuku

final class dv
    implements android.app.DatePickerDialog.OnDateSetListener
{

    final M_Transfer_TA_Sakuku a;

    dv(M_Transfer_TA_Sakuku m_transfer_ta_sakuku)
    {
        a = m_transfer_ta_sakuku;
        super();
    }

    public final void onDateSet(DatePicker datepicker, int i, int j, int k)
    {
        switch (M_Transfer_TA_Sakuku.a(a))
        {
        default:
            return;

        case 1: // '\001'
            M_Transfer_TA_Sakuku.a(a, i);
            M_Transfer_TA_Sakuku.b(a, j);
            datepicker = a;
            M_Transfer_TA_Sakuku.b(datepicker, M_Transfer_TA_Sakuku.b(datepicker) + 1);
            M_Transfer_TA_Sakuku.c(a, k);
            String s;
            if (M_Transfer_TA_Sakuku.b(a) < 10)
            {
                datepicker = (new StringBuilder("0")).append(M_Transfer_TA_Sakuku.b(a)).toString();
            } else
            {
                datepicker = String.valueOf(M_Transfer_TA_Sakuku.b(a));
            }
            if (M_Transfer_TA_Sakuku.c(a) < 10)
            {
                s = (new StringBuilder("0")).append(M_Transfer_TA_Sakuku.c(a)).toString();
            } else
            {
                s = String.valueOf(M_Transfer_TA_Sakuku.c(a));
            }
            M_Transfer_TA_Sakuku.d(a).setText((new StringBuilder()).append(s).append(" - ").append(datepicker).append(" - ").append(M_Transfer_TA_Sakuku.e(a)));
            return;

        case 2: // '\002'
            M_Transfer_TA_Sakuku.d(a, i);
            M_Transfer_TA_Sakuku.e(a, j);
            datepicker = a;
            M_Transfer_TA_Sakuku.e(datepicker, M_Transfer_TA_Sakuku.f(datepicker) + 1);
            M_Transfer_TA_Sakuku.f(a, k);
            break;
        }
        String s1;
        if (M_Transfer_TA_Sakuku.f(a) < 10)
        {
            datepicker = (new StringBuilder("0")).append(M_Transfer_TA_Sakuku.f(a)).toString();
        } else
        {
            datepicker = String.valueOf(M_Transfer_TA_Sakuku.f(a));
        }
        if (M_Transfer_TA_Sakuku.g(a) < 10)
        {
            s1 = (new StringBuilder("0")).append(M_Transfer_TA_Sakuku.g(a)).toString();
        } else
        {
            s1 = String.valueOf(M_Transfer_TA_Sakuku.g(a));
        }
        M_Transfer_TA_Sakuku.h(a).setText((new StringBuilder()).append(s1).append(" - ").append(datepicker).append(" - ").append(M_Transfer_TA_Sakuku.i(a)));
    }
}
