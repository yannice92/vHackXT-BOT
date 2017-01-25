// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.app.AlertDialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Transfer_Dafter_Bank, dh

final class df
    implements android.widget.AdapterView.OnItemClickListener
{

    final M_Transfer_Dafter_Bank a;

    df(M_Transfer_Dafter_Bank m_transfer_dafter_bank)
    {
        a = m_transfer_dafter_bank;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (String)M_Transfer_Dafter_Bank.a(a).getItem(i);
        M_Transfer_Dafter_Bank.b(a).setText(adapterview);
        M_Transfer_Dafter_Bank.a(a).notifyDataSetChanged();
        a.F.dismiss();
    }
}
