// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.view.View;
import android.widget.AdapterView;
import com.bca.mobile.bm;
import java.io.PrintStream;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Info_Lainnya

final class ca
    implements android.widget.AdapterView.OnItemClickListener
{

    final M_Info_Lainnya a;

    ca(M_Info_Lainnya m_info_lainnya)
    {
        a = m_info_lainnya;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        M_Info_Lainnya.a(a, i);
        System.out.println(i);
        adapterview = a;
        view = a;
        M_Info_Lainnya.a(adapterview, M_Info_Lainnya.d(4));
        M_Info_Lainnya.a(a)[i] = 1;
        M_Info_Lainnya.b(a).a(M_Info_Lainnya.a(a));
        M_Info_Lainnya.b(a).notifyDataSetChanged();
        switch (i)
        {
        default:
            return;

        case 1: // '\001'
            a.g("PGI:!:ISBT");
            return;

        case 2: // '\002'
            a.g("PGI:!:ISBD");
            return;

        case 3: // '\003'
            a.g("PGI:!:ISBDV");
            break;
        }
    }
}
