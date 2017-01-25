// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.content.Intent;
import android.content.res.Resources;
import com.bca.mobile.n;
import com.bca.mobile.tab.TabGroupBaseActivity;
import java.util.ArrayList;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Payment, M_Payment_All

final class cy
    implements Runnable
{

    final M_Payment a;
    private final String b[];

    cy(M_Payment m_payment, String as[])
    {
        a = m_payment;
        b = as;
        super();
    }

    public final void run()
    {
        Object obj;
        boolean flag;
        flag = false;
        a.g();
        if (n.m != null)
        {
            n.m = null;
        }
        n.m = new Hashtable();
        obj = new ArrayList();
        String s = "";
        if (M_Payment.b(a) == 0)
        {
            s = "kk";
        }
        n.m.put("track_transaction", s);
        M_Payment.b(a);
        JVM INSTR tableswitch 0 7: default 116
    //                   0 117
    //                   1 764
    //                   2 764
    //                   3 764
    //                   4 117
    //                   5 117
    //                   6 117
    //                   7 117;
           goto _L1 _L2 _L3 _L3 _L3 _L2 _L2 _L2 _L2
_L1:
        return;
_L2:
        int i = 0;
_L16:
        if (i < b.length) goto _L5; else goto _L4
_L4:
        Object obj2 = new ArrayList();
        if (M_Payment.b(a) != 0) goto _L7; else goto _L6
_L6:
        String as[];
        int k;
        as = a.getResources().getStringArray(0x7f0e0009);
        k = as.length;
        i = ((flag) ? 1 : 0);
_L17:
        if (i < k) goto _L9; else goto _L8
_L8:
        n.m.put("pass_data_1_to_2", a.a);
        n.m.put("pass_data_2_to_3", a.i.replace("~~", "PKK"));
_L18:
        n.m.put("payment", obj);
        n.m.put("activity_now", "kartu_kredit");
        n.m.put("label", obj2);
        obj = new Intent(a.getParent(), com/bca/mobile/transaction/M_Payment_All);
        ((TabGroupBaseActivity)a.getParent()).a("M_Payment_All", ((Intent) (obj)));
        return;
_L5:
        i;
        JVM INSTR tableswitch 1 5: default 316
    //                   1 325
    //                   2 344
    //                   3 363
    //                   4 382
    //                   5 401;
           goto _L10 _L11 _L12 _L13 _L14 _L15
_L10:
        i++;
          goto _L16
_L11:
        obj2 = a;
        obj = M_Payment.a(b, i, ((ArrayList) (obj)));
          goto _L10
_L12:
        obj2 = a;
        obj = M_Payment.b(b, i, ((ArrayList) (obj)));
          goto _L10
_L13:
        obj2 = a;
        obj = M_Payment.c(b, i, ((ArrayList) (obj)));
          goto _L10
_L14:
        obj2 = a;
        obj = M_Payment.d(b, i, ((ArrayList) (obj)));
          goto _L10
_L15:
        obj2 = a;
        obj = M_Payment.e(b, i, ((ArrayList) (obj)));
          goto _L10
_L9:
        ((ArrayList) (obj2)).add(as[i]);
        i++;
          goto _L17
_L7:
        if (4 == M_Payment.b(a))
        {
            ((ArrayList) (obj2)).add("Nama Perusahaan:");
            ((ArrayList) (obj2)).add("Input No. Polis:");
            ((ArrayList) (obj2)).add("Jumlah Uang (Rp):");
            ((ArrayList) (obj2)).add("Dari Rekening:");
            n.m.put("pass_data_1_to_2", a.g);
            n.m.put("pass_data_2_to_3", a.i.replace("~~", "PAS"));
        } else
        if (6 == M_Payment.b(a))
        {
            ((ArrayList) (obj2)).add("Nama Perusahaan:");
            ((ArrayList) (obj2)).add("Input No. Pelanggan:");
            ((ArrayList) (obj2)).add("Jumlah Uang (Rp):");
            ((ArrayList) (obj2)).add("Dari Rekening:");
            n.m.put("pass_data_1_to_2", a.c);
            n.m.put("pass_data_2_to_3", a.i.replace("~~", "PPJ"));
        } else
        if (M_Payment.b(a) == 7)
        {
            ((ArrayList) (obj2)).add("Nama Perusahaan:");
            ((ArrayList) (obj2)).add("Input No. Pelanggan:");
            ((ArrayList) (obj2)).add("Jumlah Uang (Rp):");
            ((ArrayList) (obj2)).add("Dari Rekening:");
            n.m.put("pass_data_1_to_2", a.d);
            n.m.put("pass_data_2_to_3", a.i.replace("~~", "PLY"));
        } else
        if (5 == M_Payment.b(a))
        {
            ((ArrayList) (obj2)).add("Nama Perusahaan:");
            ((ArrayList) (obj2)).add("Input No. Pelanggan:");
            ((ArrayList) (obj2)).add("Jumlah Uang (Rp):");
            ((ArrayList) (obj2)).add("Dari Rekening:");
            n.m.put("pass_data_1_to_2", a.e);
            n.m.put("pass_data_2_to_3", a.i.replace("~~", "PIN"));
        }
          goto _L18
_L3:
        i = 0;
        obj2 = obj;
_L26:
        if (i >= b.length)
        {
            Object obj1 = new ArrayList();
            M_Payment m_payment;
            String as1[];
            int j;
            if (1 == M_Payment.b(a))
            {
                ((ArrayList) (obj1)).add("Operator Handphone:");
                ((ArrayList) (obj1)).add("Input No. HP:");
                ((ArrayList) (obj1)).add("");
                ((ArrayList) (obj1)).add("Dari Rekening:");
                n.m.put("pass_data_1_to_2", a.f);
                n.m.put("pass_data_2_to_3", a.i.replace("~~", "PHP"));
            } else
            if (2 == M_Payment.b(a))
            {
                ((ArrayList) (obj1)).add("Operator Telepon:");
                ((ArrayList) (obj1)).add("Input Kode Area & No. Telepon:");
                ((ArrayList) (obj1)).add("");
                ((ArrayList) (obj1)).add("Dari Rekening:");
                n.m.put("pass_data_1_to_2", a.h);
                n.m.put("pass_data_2_to_3", a.i.replace("~~", "PTP"));
            } else
            if (3 == M_Payment.b(a))
            {
                ((ArrayList) (obj1)).add("Nama Perusahaan:");
                ((ArrayList) (obj1)).add("Input No. Pelanggan:");
                ((ArrayList) (obj1)).add("");
                ((ArrayList) (obj1)).add("Dari Rekening:");
                n.m.put("pass_data_1_to_2", a.b);
                n.m.put("pass_data_2_to_3", a.i.replace("~~", "PPU"));
            }
            n.m.put("payment", obj2);
            n.m.put("activity_now", "kartu_kredit");
            n.m.put("label", obj1);
            obj1 = new Intent(a.getParent(), com/bca/mobile/transaction/M_Payment_All);
            ((TabGroupBaseActivity)a.getParent()).a("M_Payment_All", ((Intent) (obj1)));
            return;
        }
        i;
        JVM INSTR tableswitch 1 6: default 972
    //                   1 985
    //                   2 1004
    //                   3 1023
    //                   4 1042
    //                   5 1061
    //                   6 1151;
           goto _L19 _L20 _L21 _L22 _L23 _L24 _L25
_L19:
        obj1 = obj2;
_L27:
        i++;
        obj2 = obj1;
          goto _L26
_L20:
        obj1 = a;
        obj1 = M_Payment.a(b, i, ((ArrayList) (obj2)));
          goto _L27
_L21:
        obj1 = a;
        obj1 = M_Payment.b(b, i, ((ArrayList) (obj2)));
          goto _L27
_L22:
        obj1 = a;
        obj1 = M_Payment.c(b, i, ((ArrayList) (obj2)));
          goto _L27
_L23:
        obj1 = a;
        obj1 = M_Payment.e(b, i, ((ArrayList) (obj2)));
          goto _L27
_L24:
        obj1 = obj2;
        if (M_Payment.b(a) != 3) goto _L27; else goto _L28
_L28:
        obj1 = new ArrayList();
        m_payment = a;
        as1 = M_Payment.a(b, i);
        if (as1 == null || as1.length <= 0) goto _L30; else goto _L29
_L29:
        j = 0;
_L32:
        if (j < as1.length - 1) goto _L31; else goto _L30
_L30:
        n.m.put("region_copart", obj1);
        obj1 = obj2;
          goto _L27
_L31:
        ((ArrayList) (obj1)).add(as1[j]);
        j++;
          goto _L32
_L25:
        obj1 = obj2;
        if (M_Payment.b(a) != 3) goto _L27; else goto _L33
_L33:
        obj1 = new ArrayList();
        as1 = a;
        as1 = M_Payment.b(b, i);
        if (as1 == null || as1.length <= 0) goto _L35; else goto _L34
_L34:
        j = 0;
_L37:
        if (j < as1.length) goto _L36; else goto _L35
_L35:
        n.m.put("label_pam", obj1);
        obj1 = obj2;
          goto _L27
_L36:
        ((ArrayList) (obj1)).add(as1[j]);
        j++;
          goto _L37
    }
}
