// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.content.Intent;
import com.bca.mobile.bm;
import com.bca.mobile.n;
import com.bca.mobile.tab.TabGroupBaseActivity;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Commerce, M_Commerce_Voucher1, M_Commerce_Lainnya1, M_Commerce_PLN, 
//            M_Commerce_PMA

final class aj
    implements Runnable
{

    final M_Commerce a;
    private final String b[];

    aj(M_Commerce m_commerce, String as[])
    {
        a = m_commerce;
        b = as;
        super();
    }

    public final void run()
    {
        if (M_Commerce.a(a) != null)
        {
            bm bm1 = M_Commerce.a(a);
            M_Commerce m_commerce = a;
            bm1.a(M_Commerce.d(5));
            M_Commerce.a(a).notifyDataSetChanged();
        }
        Object obj = b[0];
        if (n.m != null)
        {
            n.m = null;
        }
        Hashtable hashtable = new Hashtable();
        n.m = hashtable;
        hashtable.put("data", b);
        a.g();
        if (((String) (obj)).equals("CVH3"))
        {
            obj = new Intent(a.getParent(), com/bca/mobile/transaction/M_Commerce_Voucher1);
            ((TabGroupBaseActivity)a.getParent()).a("M_Commerce_Voucher1", ((Intent) (obj)));
        } else
        {
            if (((String) (obj)).equals("CLY2"))
            {
                obj = new Intent(a.getParent(), com/bca/mobile/transaction/M_Commerce_Lainnya1);
                ((TabGroupBaseActivity)a.getParent()).a("M_Commerce_Lainnya1", ((Intent) (obj)));
                return;
            }
            if (((String) (obj)).equals("CPLN"))
            {
                obj = new Intent(a.getParent(), com/bca/mobile/transaction/M_Commerce_PLN);
                ((TabGroupBaseActivity)a.getParent()).a("M_Commerce_PLN", ((Intent) (obj)));
                return;
            }
            if (((String) (obj)).equals("CPMA"))
            {
                Intent intent = new Intent(a.getParent(), com/bca/mobile/transaction/M_Commerce_PMA);
                ((TabGroupBaseActivity)a.getParent()).a("M_Commerce_PMA", intent);
                return;
            }
        }
    }
}
