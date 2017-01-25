// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import com.d.b;
import java.util.ArrayList;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Info_Mutasi_RDN

final class cd
    implements android.widget.AdapterView.OnItemClickListener
{

    final M_Info_Mutasi_RDN a;

    cd(M_Info_Mutasi_RDN m_info_mutasi_rdn)
    {
        a = m_info_mutasi_rdn;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        M_Info_Mutasi_RDN.a(a, i);
        a.a.setText((CharSequence)a.j.get(i));
        com.bca.mobile.transaction.M_Info_Mutasi_RDN.b(a, 0);
        a.e(i);
        b.a();
    }
}
