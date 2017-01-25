// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Info_Suku_Bunga

final class ct
    implements android.widget.AdapterView.OnItemClickListener
{

    final M_Info_Suku_Bunga a;

    ct(M_Info_Suku_Bunga m_info_suku_bunga)
    {
        a = m_info_suku_bunga;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            a.g("PGI:!:ISBT");
            return;

        case 1: // '\001'
            a.g("PGI:!:ISBD");
            return;

        case 2: // '\002'
            a.g("PGI:!:ISBDV");
            break;
        }
    }
}
