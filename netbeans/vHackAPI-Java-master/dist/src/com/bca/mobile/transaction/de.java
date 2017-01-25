// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.content.Intent;
import com.bca.mobile.n;
import com.bca.mobile.tab.TabGroupBaseActivity;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Transfer, M_Transfer_Dafter_Bank, M_Transfer_TA_Rekening, M_Transfer_TA_Bank, 
//            M_Transfer_TA_Virtual_Account, M_Transfer_TA_Sakuku, M_Transfer_Status_Sakuku

final class de
    implements Runnable
{

    final M_Transfer a;
    private final String b[];

    de(M_Transfer m_transfer, String as[])
    {
        a = m_transfer;
        b = as;
        super();
    }

    public final void run()
    {
        if (n.m != null)
        {
            n.m = null;
        }
        n.m = new Hashtable();
        a.g();
        switch (M_Transfer.c(a))
        {
        case 1: // '\001'
        case 3: // '\003'
        default:
            return;

        case 2: // '\002'
            Object obj = b[1].split(":@:");
            String as[] = new String[obj.length - 1];
            int i = 0;
            do
            {
                if (i >= as.length)
                {
                    n.m.put("bank_name", as);
                    n.m.put("default", Integer.valueOf(0));
                    obj = new Intent(a.getParent(), com/bca/mobile/transaction/M_Transfer_Dafter_Bank);
                    ((TabGroupBaseActivity)a.getParent()).a("M_Transfer_Dafter_Bank", ((Intent) (obj)));
                    return;
                }
                as[i] = obj[i];
                i++;
            } while (true);

        case 4: // '\004'
            n.m.put("data", b);
            Intent intent = new Intent(a.getParent(), com/bca/mobile/transaction/M_Transfer_TA_Rekening);
            ((TabGroupBaseActivity)a.getParent()).a("M_Transfer_TA_Rekening", intent);
            return;

        case 5: // '\005'
            n.m.put("data", b);
            Intent intent1 = new Intent(a.getParent(), com/bca/mobile/transaction/M_Transfer_TA_Bank);
            ((TabGroupBaseActivity)a.getParent()).a("M_Transfer_TA_Rekening", intent1);
            return;

        case 6: // '\006'
            n.m.put("data", b);
            Intent intent2 = new Intent(a, com/bca/mobile/transaction/M_Transfer_TA_Virtual_Account);
            ((TabGroupBaseActivity)a.getParent()).a("M_Transfer_TA_Rekening", intent2);
            return;

        case 7: // '\007'
            n.m.put("data", b);
            Intent intent3 = new Intent(a.getParent(), com/bca/mobile/transaction/M_Transfer_TA_Sakuku);
            ((TabGroupBaseActivity)a.getParent()).a("M_Transfer_TA_Rekening", intent3);
            return;

        case 8: // '\b'
            n.m.put("data", b);
            Intent intent4 = new Intent(a.getParent(), com/bca/mobile/transaction/M_Transfer_Status_Sakuku);
            ((TabGroupBaseActivity)a.getParent()).a("M_Transfer_TA_Rekening", intent4);
            return;
        }
    }
}
