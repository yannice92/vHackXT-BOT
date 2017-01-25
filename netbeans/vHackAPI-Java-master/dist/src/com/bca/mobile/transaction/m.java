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
//            M_Admin, ChangePinActivity, M_Admin_Reg_KK_all, M_Admin_Aktivasi_KK

final class m
    implements android.widget.AdapterView.OnItemClickListener
{

    final M_Admin a;

    m(M_Admin m_admin)
    {
        a = m_admin;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = a;
        view = a;
        M_Admin.a(adapterview, M_Admin.d(15));
        M_Admin.a(a)[i] = 1;
        M_Admin.b(a).a(M_Admin.a(a));
        M_Admin.b(a).notifyDataSetChanged();
        M_Admin.a(a, i);
        if (n.m != null)
        {
            n.m = null;
        }
        n.m = new Hashtable();
        switch (i)
        {
        case 3: // '\003'
        case 6: // '\006'
        case 9: // '\t'
        default:
            return;

        case 0: // '\0'
            adapterview = new Intent(a.getParent(), com/bca/mobile/transaction/ChangePinActivity);
            ((TabGroupBaseActivity)a.getParent()).a("ChangePinActivity", adapterview);
            return;

        case 1: // '\001'
            a.g("PGI:!:ABKA:!:1");
            return;

        case 2: // '\002'
            a.g("PGI:!:ABKK:!:1");
            return;

        case 4: // '\004'
            n.m.put("send_keyword", "ARIK");
            adapterview = new Intent(a.getParent(), com/bca/mobile/transaction/M_Admin_Reg_KK_all);
            ((TabGroupBaseActivity)a.getParent()).a("M_Admin_Reg_KK_all", adapterview);
            return;

        case 5: // '\005'
            a.g("PGI:!:AHIK");
            return;

        case 7: // '\007'
            n.m = new Hashtable();
            adapterview = new Intent(a.getParent(), com/bca/mobile/transaction/M_Admin_Aktivasi_KK);
            ((TabGroupBaseActivity)a.getParent()).a("M_Admin_Aktivasi_KK", adapterview);
            return;

        case 8: // '\b'
            a.g("PGI:!:AAPK:!:1");
            return;

        case 10: // '\n'
            a.g("PGI:!:AHDTR");
            return;

        case 11: // '\013'
            a.g("PGI:!:AHDTB");
            return;

        case 12: // '\f'
            a.g("PGI:!:AHVP");
            return;

        case 13: // '\r'
            a.g("PGI:!:AHDS");
            return;

        case 14: // '\016'
            a.g("PGI:!:AHDP");
            break;
        }
    }
}
