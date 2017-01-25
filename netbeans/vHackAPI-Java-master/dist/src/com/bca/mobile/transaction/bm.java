// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.bca.mobile.n;
import com.bca.mobile.tab.TabGroupBaseActivity;
import java.io.PrintStream;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Info, M_Info_Lainnya, InboxActivity1

final class bm
    implements android.widget.AdapterView.OnItemClickListener
{

    final M_Info a;

    bm(M_Info m_info)
    {
        a = m_info;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        M_Info.a(a, i);
        System.out.println(i);
        adapterview = a;
        view = a;
        M_Info.a(adapterview, M_Info.d(17));
        M_Info.b(a)[i] = 1;
        M_Info.a(a).a(M_Info.b(a));
        M_Info.a(a).notifyDataSetChanged();
        switch (i)
        {
        case 3: // '\003'
        case 7: // '\007'
        case 10: // '\n'
        case 12: // '\f'
        default:
            return;

        case 0: // '\0'
            M_Info.c(a);
            return;

        case 1: // '\001'
            a.g("PGI:!:IMR2");
            return;

        case 2: // '\002'
            a.g("PGI:!:IRD");
            return;

        case 4: // '\004'
            a.g("PGI:!:INABR");
            return;

        case 5: // '\005'
            a.g("PGI:!:ISDR");
            return;

        case 6: // '\006'
            a.g("PGI:!:IFK");
            return;

        case 8: // '\b'
            M_Info.c(a);
            return;

        case 9: // '\t'
            a.g("PGI:!:IMD");
            return;

        case 11: // '\013'
            a.g("PGI:!:IPK:!:1");
            return;

        case 13: // '\r'
            a.g("PGI:!:IKS");
            return;

        case 14: // '\016'
            a.g("PGI:!:IKT");
            return;

        case 15: // '\017'
            if (n.m != null)
            {
                n.m = null;
            }
            n.m = new Hashtable();
            adapterview = new Intent(a.getParent(), com/bca/mobile/transaction/M_Info_Lainnya);
            ((TabGroupBaseActivity)a.getParent()).a("M_Info_Lainnya", adapterview);
            n.m.put("inbox", "lainnya");
            return;

        case 16: // '\020'
            break;
        }
        if (n.m != null)
        {
            n.m = null;
        }
        adapterview = new Hashtable();
        n.m = adapterview;
        adapterview.put("inbox_service", "inbox_info");
        n.m.put("inbox", "inbox");
        adapterview = new Intent(a.getParent(), com/bca/mobile/transaction/InboxActivity1);
        ((TabGroupBaseActivity)a.getParent()).a("InboxActivity1", adapterview);
    }
}
