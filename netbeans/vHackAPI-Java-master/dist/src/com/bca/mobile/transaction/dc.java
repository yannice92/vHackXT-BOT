// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.bca.mobile.bm;
import com.bca.mobile.n;
import com.bca.mobile.tab.TabGroupBaseActivity;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Transfer, M_Transfer_Dafter_Rekening, InboxActivity1

final class dc
    implements android.widget.AdapterView.OnItemClickListener
{

    final M_Transfer a;

    dc(M_Transfer m_transfer)
    {
        a = m_transfer;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = a;
        view = a;
        M_Transfer.a(adapterview, M_Transfer.d(10));
        M_Transfer.b(a)[i] = 1;
        M_Transfer.a(a).a(M_Transfer.b(a));
        M_Transfer.a(a).notifyDataSetChanged();
        M_Transfer.a(a, i);
        switch (i)
        {
        case 3: // '\003'
        default:
            return;

        case 1: // '\001'
            M_Transfer_Dafter_Rekening.a = "";
            M_Transfer_Dafter_Rekening.b = "";
            M_Transfer_Dafter_Rekening.c = "";
            adapterview = new Intent(a.getParent(), com/bca/mobile/transaction/M_Transfer_Dafter_Rekening);
            ((TabGroupBaseActivity)a.getParent()).a("M_Transfer_Dafter_Rekening", adapterview);
            return;

        case 2: // '\002'
            a.g("PGI:!:TDAB");
            return;

        case 4: // '\004'
            a.g("PGI:!:TAR2");
            return;

        case 5: // '\005'
            a.g("PGI:!:TAB");
            return;

        case 6: // '\006'
            a.g("PGI:!:TVA:!:1");
            return;

        case 7: // '\007'
            a.g("PGI:!:TSK2:!:1");
            return;

        case 8: // '\b'
            a.g("PGI:!:TST:!:1");
            return;

        case 9: // '\t'
            break;
        }
        if (n.m != null)
        {
            n.m = null;
        }
        adapterview = new Hashtable();
        n.m = adapterview;
        adapterview.put("inbox_service", "inbox_transfer");
        n.m.put("inbox", "inbox");
        adapterview = new Intent(a.getParent(), com/bca/mobile/transaction/InboxActivity1);
        ((TabGroupBaseActivity)a.getParent()).a("InboxActivity1", adapterview);
    }
}
