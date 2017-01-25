// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import com.bca.mobile.TabSample;
import com.bca.mobile.n;

// Referenced classes of package com.bca.mobile.transaction:
//            eb, TransactionListActivity

final class ec
    implements android.view.View.OnClickListener
{

    final eb a;
    private final int b;

    ec(eb eb1, int i)
    {
        a = eb1;
        b = i;
        super();
    }

    public final void onClick(View view)
    {
        switch (b)
        {
        default:
            return;

        case 0: // '\0'
            n.h = false;
            n.x = eb.a(a).getResources().getString(0x7f0c001e);
            view = new Intent(eb.a(a), com/bca/mobile/TabSample);
            view.putExtra("tab seleted", 0);
            eb.a(a).startActivity(view);
            return;

        case 1: // '\001'
            n.x = eb.a(a).getResources().getString(0x7f0c001f);
            n.h = false;
            view = new Intent(eb.a(a), com/bca/mobile/TabSample);
            view.putExtra("tab seleted", 1);
            eb.a(a).startActivity(view);
            return;

        case 2: // '\002'
            n.x = eb.a(a).getResources().getString(0x7f0c0021);
            n.h = false;
            view = new Intent(eb.a(a), com/bca/mobile/TabSample);
            view.putExtra("tab seleted", 2);
            eb.a(a).startActivity(view);
            return;

        case 3: // '\003'
            n.x = eb.a(a).getResources().getString(0x7f0c0022);
            n.h = false;
            view = new Intent(eb.a(a), com/bca/mobile/TabSample);
            view.putExtra("tab seleted", 3);
            eb.a(a).startActivity(view);
            return;

        case 4: // '\004'
            n.x = eb.a(a).getResources().getString(0x7f0c0020);
            break;
        }
        n.h = false;
        view = new Intent(eb.a(a), com/bca/mobile/TabSample);
        view.putExtra("tab seleted", 4);
        eb.a(a).startActivity(view);
    }
}
