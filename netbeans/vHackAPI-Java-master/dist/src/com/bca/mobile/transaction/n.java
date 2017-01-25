// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.content.Intent;
import com.bca.mobile.bn;
import com.bca.mobile.tab.TabGroupBaseActivity;
import java.util.ArrayList;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Admin, M_Admin_BlokirATM, M_Admin_Blokir_KK, M_Admin_Reg_KK_all, 
//            M_Admin_Aktivasi_Pin_KK, M_Admin_Hapus_Trans_Ant_Rek

final class n
    implements Runnable
{

    final M_Admin a;
    private final String b[];

    n(M_Admin m_admin, String as[])
    {
        a = m_admin;
        b = as;
        super();
    }

    public final void run()
    {
        a.g();
        M_Admin.c(a);
        JVM INSTR tableswitch 0 14: default 88
    //                   0 88
    //                   1 89
    //                   2 181
    //                   3 88
    //                   4 88
    //                   5 381
    //                   6 88
    //                   7 88
    //                   8 499
    //                   9 88
    //                   10 699
    //                   11 699
    //                   12 699
    //                   13 699
    //                   14 699;
           goto _L1 _L1 _L2 _L3 _L1 _L1 _L4 _L1 _L1 _L5 _L1 _L6 _L6 _L6 _L6 _L6
_L1:
        return;
_L2:
        if (b[0].equals("ABKA"))
        {
            if (com.bca.mobile.n.m != null)
            {
                com.bca.mobile.n.m = null;
            }
            Object obj = new Hashtable();
            com.bca.mobile.n.m = ((Hashtable) (obj));
            ((Hashtable) (obj)).put("data", b);
            com.bca.mobile.n.m.put("send_keyword", "ABKA");
            obj = new Intent(a.getParent(), com/bca/mobile/transaction/M_Admin_BlokirATM);
            ((TabGroupBaseActivity)a.getParent()).a("M_Admin_BlokirATM", ((Intent) (obj)));
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (b[0].equals("ABKK"))
        {
            Object obj5 = b[1].split(":@:");
            Object obj1 = new ArrayList();
            ArrayList arraylist = new ArrayList();
            int i = 0;
            do
            {
                if (i >= obj5.length)
                {
                    if (com.bca.mobile.n.m != null)
                    {
                        com.bca.mobile.n.m = null;
                    }
                    obj5 = new Hashtable();
                    com.bca.mobile.n.m = ((Hashtable) (obj5));
                    ((Hashtable) (obj5)).put("nomorkk", obj1);
                    com.bca.mobile.n.m.put("jeniskk", arraylist);
                    com.bca.mobile.n.m.put("data", b);
                    com.bca.mobile.n.m.put("send_keyword", "ABKK");
                    obj1 = new Intent(a.getParent(), com/bca/mobile/transaction/M_Admin_Blokir_KK);
                    ((TabGroupBaseActivity)a.getParent()).a("M_Admin_Blokir_KK", ((Intent) (obj1)));
                    return;
                }
                ((ArrayList) (obj1)).add(obj5[i].split(":#:")[0]);
                if (i < obj5.length - 1)
                {
                    arraylist.add(obj5[i].split(":#:")[1]);
                }
                i++;
            } while (true);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (b[0].equals("AHIK"))
        {
            if (com.bca.mobile.n.m != null)
            {
                com.bca.mobile.n.m = null;
            }
            com.bca.mobile.n.m = new Hashtable();
            Object obj2 = bn.b(b[1]);
            com.bca.mobile.n.m.put("defaultindex", ((ArrayList) (obj2)).remove(((ArrayList) (obj2)).size() - 1));
            com.bca.mobile.n.m.put("data", obj2);
            com.bca.mobile.n.m.put("send_keyword", "AHIK");
            obj2 = new Intent(a.getParent(), com/bca/mobile/transaction/M_Admin_Reg_KK_all);
            ((TabGroupBaseActivity)a.getParent()).a("M_Admin_Reg_KK_all", ((Intent) (obj2)));
            return;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (b[0].equals("AAPK"))
        {
            Object obj6 = b[1].split(":@:");
            Object obj3 = new ArrayList();
            ArrayList arraylist1 = new ArrayList();
            int j = 0;
            do
            {
                if (j >= obj6.length)
                {
                    if (com.bca.mobile.n.m != null)
                    {
                        com.bca.mobile.n.m = null;
                    }
                    obj6 = new Hashtable();
                    com.bca.mobile.n.m = ((Hashtable) (obj6));
                    ((Hashtable) (obj6)).put("nomorkk", obj3);
                    com.bca.mobile.n.m.put("jeniskk", arraylist1);
                    com.bca.mobile.n.m.put("data", b);
                    com.bca.mobile.n.m.put("send_keyword", "AAPK");
                    obj3 = new Intent(a.getParent(), com/bca/mobile/transaction/M_Admin_Aktivasi_Pin_KK);
                    ((TabGroupBaseActivity)a.getParent()).a("M_Admin_Aktivasi_Pin_KK", ((Intent) (obj3)));
                    return;
                }
                ((ArrayList) (obj3)).add(obj6[j].split(":#:")[0]);
                if (j < obj6.length - 1)
                {
                    arraylist1.add(obj6[j].split(":#:")[1]);
                }
                j++;
            } while (true);
        }
        if (true) goto _L1; else goto _L6
_L6:
        if (com.bca.mobile.n.m != null)
        {
            com.bca.mobile.n.m = null;
        }
        com.bca.mobile.n.m = new Hashtable();
        Object obj4 = b[1].split(":@:");
        ArrayList arraylist2 = new ArrayList();
        int l = obj4.length;
        int k = 0;
        do
        {
            if (k >= l)
            {
                com.bca.mobile.n.m.put("admin_list_data", arraylist2);
                if (b[0].equals("AHDTR"))
                {
                    com.bca.mobile.n.m.put("send_keyword", "AHDTR");
                } else
                if (b[0].equals("AHDTB"))
                {
                    com.bca.mobile.n.m.put("send_keyword", "AHDTB");
                } else
                if (b[0].equals("AHVP"))
                {
                    com.bca.mobile.n.m.put("send_keyword", "AHVP");
                } else
                if (b[0].equals("AHDS"))
                {
                    com.bca.mobile.n.m.put("send_keyword", "AHDS");
                } else
                if (b[0].equals("AHDP"))
                {
                    com.bca.mobile.n.m.put("send_keyword", "AHDP");
                }
                obj4 = new Intent(a.getParent(), com/bca/mobile/transaction/M_Admin_Hapus_Trans_Ant_Rek);
                ((TabGroupBaseActivity)a.getParent()).a("M_Admin_Hapus_Trans_Ant_Rek", ((Intent) (obj4)));
                return;
            }
            arraylist2.add(obj4[k]);
            k++;
        } while (true);
    }
}
