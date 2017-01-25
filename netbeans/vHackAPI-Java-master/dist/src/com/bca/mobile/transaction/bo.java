// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.app.Dialog;
import android.content.Intent;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bca.mobile.bm;
import com.bca.mobile.bn;
import com.bca.mobile.n;
import com.bca.mobile.tab.TabGroupBaseActivity;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Info, M_Info_Mutasi_Rekening, M_Info_Mutasi_RDN, M_Info_Rek_Deposito, 
//            M_Info_Saldo_Reksadana, M_Info_KK_Saldo, M_Info_KK_Transaksi, M_Info_KPR_Pinjaman, 
//            bp, bq

final class bo
    implements Runnable
{

    final M_Info a;
    private final String b[];

    bo(M_Info m_info, String as[])
    {
        a = m_info;
        b = as;
        super();
    }

    static M_Info a(bo bo1)
    {
        return bo1.a;
    }

    public final void run()
    {
        int i = 2;
        if (M_Info.a(a) != null)
        {
            bm bm1 = M_Info.a(a);
            M_Info m_info = a;
            bm1.a(M_Info.d(17));
            M_Info.a(a).notifyDataSetChanged();
        }
        a.g();
        int j;
        int k;
        switch (M_Info.d(a))
        {
        case 3: // '\003'
        case 7: // '\007'
        case 10: // '\n'
        case 12: // '\f'
        default:
            return;

        case 1: // '\001'
            String as[] = b[1].split(":@:");
            Hashtable hashtable = new Hashtable();
            n.m = hashtable;
            hashtable.put("nomor_rek", as);
            Intent intent = new Intent(a.getParent(), com/bca/mobile/transaction/M_Info_Mutasi_Rekening);
            ((TabGroupBaseActivity)a.getParent()).a("M_Info_Mutasi_Rekening", intent);
            return;

        case 9: // '\t'
            Object obj = new Hashtable();
            n.m = ((Hashtable) (obj));
            ((Hashtable) (obj)).put("investor_acc_list", bn.b(b[1]));
            obj = new Intent(a.getParent(), com/bca/mobile/transaction/M_Info_Mutasi_RDN);
            ((TabGroupBaseActivity)a.getParent()).a("M_Info_Mutasi_RDN", ((Intent) (obj)));
            return;

        case 2: // '\002'
            n.m = null;
            Object obj1 = new Hashtable();
            n.m = ((Hashtable) (obj1));
            ((Hashtable) (obj1)).put("RekDep", bn.b(b[1]));
            n.m.put("NoBilyet", bn.b(b[2]));
            obj1 = new Intent(a.getParent(), com/bca/mobile/transaction/M_Info_Rek_Deposito);
            ((TabGroupBaseActivity)a.getParent()).a("M_Info_Rek_Deposito", ((Intent) (obj1)));
            return;

        case 5: // '\005'
            n.m = null;
            Object obj2 = new Hashtable();
            n.m = ((Hashtable) (obj2));
            ((Hashtable) (obj2)).put("Reksadana", bn.b(b[1]));
            obj2 = new Intent(a.getParent(), com/bca/mobile/transaction/M_Info_Saldo_Reksadana);
            ((TabGroupBaseActivity)a.getParent()).a("M_Info_Saldo_Reksadana", ((Intent) (obj2)));
            return;

        case 13: // '\r'
            n.m = null;
            Object obj3 = new Hashtable();
            n.m = ((Hashtable) (obj3));
            ((Hashtable) (obj3)).put("no_customer", bn.b(b[1]));
            obj3 = new Intent(a.getParent(), com/bca/mobile/transaction/M_Info_KK_Saldo);
            ((TabGroupBaseActivity)a.getParent()).a("M_Info_KK_Saldo", ((Intent) (obj3)));
            return;

        case 14: // '\016'
            n.m = null;
            Object obj4 = new Hashtable();
            n.m = ((Hashtable) (obj4));
            ((Hashtable) (obj4)).put("no_customer", bn.b(b[1]));
            n.m.put("no_kartu_kredit", bn.b(b[2]));
            obj4 = new Intent(a.getParent(), com/bca/mobile/transaction/M_Info_KK_Transaksi);
            ((TabGroupBaseActivity)a.getParent()).a("M_Info_KK_Transaksi", ((Intent) (obj4)));
            return;

        case 11: // '\013'
            n.m = null;
            Object obj5 = new Hashtable();
            n.m = ((Hashtable) (obj5));
            ((Hashtable) (obj5)).put("no_rek_pinjaman", bn.b(b[1]));
            n.m.put("no_pinjaman", bn.b(b[2]));
            obj5 = new Intent(a.getParent(), com/bca/mobile/transaction/M_Info_KPR_Pinjaman);
            ((TabGroupBaseActivity)a.getParent()).a("M_Info_KPR_Pinjaman", ((Intent) (obj5)));
            return;

        case 0: // '\0'
        case 4: // '\004'
        case 6: // '\006'
            DisplayMetrics displaymetrics = new DisplayMetrics();
            a.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
            i = displaymetrics.heightPixels;
            i = displaymetrics.widthPixels;
            a.B = new bp(this, a.getParent(), b[1], "m-Info");
            a.B.show();
            return;

        case 8: // '\b'
            DisplayMetrics displaymetrics1 = new DisplayMetrics();
            a.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics1);
            j = displaymetrics1.heightPixels;
            j = displaymetrics1.widthPixels;
            j = Integer.parseInt(b[2]);
            k = Integer.parseInt(b[1]);
            break;
        }
        if (k < j)
        {
            M_Info.b(a, k + 1);
        } else
        {
            i = 1;
        }
        a.B = new bq(this, a.getParent(), b[3], i, "m-Info", i);
        a.B.show();
    }
}
