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
//            M_Commerce, InboxActivity1

final class ah
    implements android.widget.AdapterView.OnItemClickListener
{

    final M_Commerce a;

    ah(M_Commerce m_commerce)
    {
        a = m_commerce;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = a;
        view = a;
        M_Commerce.a(adapterview, M_Commerce.d(5));
        M_Commerce.b(a)[i] = 1;
        M_Commerce.a(a).a(M_Commerce.b(a));
        M_Commerce.a(a).notifyDataSetChanged();
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            a.g("PGI:!:CVH3:!:1");
            return;

        case 1: // '\001'
            a.g("PGI:!:CPLN:!:1");
            return;

        case 2: // '\002'
            a.g("PGI:!:CPMA:!:1");
            return;

        case 3: // '\003'
            a.g("PGI:!:CLY2:!:1");
            return;

        case 4: // '\004'
            break;
        }
        if (n.m != null)
        {
            n.m = null;
        }
        adapterview = new Hashtable();
        n.m = adapterview;
        adapterview.put("inbox_service", "inbox_commerce");
        n.m.put("inbox", "inbox");
        adapterview = new Intent(a.getParent(), com/bca/mobile/transaction/InboxActivity1);
        ((TabGroupBaseActivity)a.getParent()).a("InboxActivity1", adapterview);
    }
}
