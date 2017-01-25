// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.widget.DatePicker;
import android.widget.EditText;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Admin_Aktivasi_KK

final class p
    implements android.app.DatePickerDialog.OnDateSetListener
{

    final M_Admin_Aktivasi_KK a;

    p(M_Admin_Aktivasi_KK m_admin_aktivasi_kk)
    {
        a = m_admin_aktivasi_kk;
        super();
    }

    public final void onDateSet(DatePicker datepicker, int i, int j, int k)
    {
        switch (M_Admin_Aktivasi_KK.a(a))
        {
        default:
            return;

        case 1: // '\001'
            M_Admin_Aktivasi_KK.a(a, i);
            break;
        }
        M_Admin_Aktivasi_KK.b(a, j);
        datepicker = a;
        M_Admin_Aktivasi_KK.b(datepicker, M_Admin_Aktivasi_KK.b(datepicker) + 1);
        M_Admin_Aktivasi_KK.c(a, k);
        String s;
        if (M_Admin_Aktivasi_KK.b(a) < 10)
        {
            datepicker = (new StringBuilder("0")).append(M_Admin_Aktivasi_KK.b(a)).toString();
        } else
        {
            datepicker = String.valueOf(M_Admin_Aktivasi_KK.b(a));
        }
        if (M_Admin_Aktivasi_KK.c(a) < 10)
        {
            s = (new StringBuilder("0")).append(M_Admin_Aktivasi_KK.c(a)).toString();
        } else
        {
            s = String.valueOf(M_Admin_Aktivasi_KK.c(a));
        }
        a.g.setText((new StringBuilder()).append(s).append(" - ").append(datepicker).append(" - ").append(M_Admin_Aktivasi_KK.d(a)));
    }
}
