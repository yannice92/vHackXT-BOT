// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.database.sqlite.SQLiteDatabase;
import com.c.a;
import com.utilities.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Transfer_TA_Rekening

final class dt
    implements Runnable
{

    final M_Transfer_TA_Rekening a;
    private final String b[];

    dt(M_Transfer_TA_Rekening m_transfer_ta_rekening, String as[])
    {
        a = m_transfer_ta_rekening;
        b = as;
        super();
    }

    public final void run()
    {
        com.bca.mobile.transaction.M_Transfer_TA_Rekening.a(a, new a(a.getParent()));
        if (!b[b.length - 2].trim().toUpperCase().equals("V")) goto _L2; else goto _L1
_L1:
        Object obj;
        com.bca.mobile.transaction.M_Transfer_TA_Rekening.a(a, Boolean.valueOf(true));
        boolean flag;
        try
        {
            obj = Double.valueOf(com.bca.mobile.transaction.M_Transfer_TA_Rekening.a(a).c("TUJUAN_VALAS"));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = Double.valueOf(0.0D);
        }
        if (obj == Double.valueOf(b[b.length - 1].trim()))
        {
            break MISSING_BLOCK_LABEL_461;
        }
        obj = Double.valueOf(b[b.length - 1].trim());
        com.bca.mobile.transaction.M_Transfer_TA_Rekening.a(a, b[2].toString());
        com.bca.mobile.transaction.M_Transfer_TA_Rekening.a(a, new ArrayList(Arrays.asList(r.a(b[3], ":@:"))));
        M_Transfer_TA_Rekening.b(a).remove(M_Transfer_TA_Rekening.b(a).size() - 1);
        com.bca.mobile.transaction.M_Transfer_TA_Rekening.a(a).b("TUJUAN_VALAS", ((Double) (obj)).toString());
        com.bca.mobile.transaction.M_Transfer_TA_Rekening.a(a).b("LABEL_VALAS", M_Transfer_TA_Rekening.c(a));
        com.bca.mobile.transaction.M_Transfer_TA_Rekening.a(a).a.delete("tujuan_valas", null, null);
        obj = M_Transfer_TA_Rekening.b(a).iterator();
_L4:
        flag = ((Iterator) (obj)).hasNext();
        if (flag) goto _L3; else goto _L2
_L2:
        a.g();
        if (a.E == 1)
        {
            a.ax = b[4];
            obj = r.a(b[5], ":@:");
            Exception exception;
            String s1;
            if (obj.length > 0)
            {
                a.at = obj[0];
                a.au = obj[1];
            } else
            {
                a.at = "";
                a.au = "";
            }
            a.aq = b[6];
            a.E = 1;
            if (!M_Transfer_TA_Rekening.d(a).booleanValue())
            {
                a.a("m-Transfer", b[1].replace(":@:", "\n"), a.getParent(), "Ok", "Cancel");
            } else
            {
                M_Transfer_TA_Rekening m_transfer_ta_rekening = a;
                StringBuilder stringbuilder = new StringBuilder(String.valueOf(b[1]));
                String s;
                if (b[1].substring(b[1].length() - 3, b[1].length()).equals(":@:"))
                {
                    s = "";
                } else
                {
                    s = ":@:";
                }
                M_Transfer_TA_Rekening.b(m_transfer_ta_rekening, stringbuilder.append(s).append(":@:").append(M_Transfer_TA_Rekening.c(a)).append(":@:").toString());
                a.a("m-Transfer", M_Transfer_TA_Rekening.e(a).replace(":@:", "\n"), a.getParent(), "Ok", "Cancel", M_Transfer_TA_Rekening.d(a).booleanValue(), (ArrayList)M_Transfer_TA_Rekening.b(a));
            }
        } else
        if (a.E == 2)
        {
            a.a("m-Transfer", b[1].replace(":@:", "\n"), a.getParent(), true, "Ok");
        }
        if (com.bca.mobile.transaction.M_Transfer_TA_Rekening.a(a) != null)
        {
            com.bca.mobile.transaction.M_Transfer_TA_Rekening.a(a).b();
        }
        return;
_L3:
        s1 = (String)((Iterator) (obj)).next();
        com.bca.mobile.transaction.M_Transfer_TA_Rekening.a(a).d(s1);
          goto _L4
        exception;
          goto _L2
        try
        {
            com.bca.mobile.transaction.M_Transfer_TA_Rekening.a(a, com.bca.mobile.transaction.M_Transfer_TA_Rekening.a(a).c("LABEL_VALAS"));
            com.bca.mobile.transaction.M_Transfer_TA_Rekening.a(a, new ArrayList(Arrays.asList(com.bca.mobile.transaction.M_Transfer_TA_Rekening.a(a).c())));
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception) { }
          goto _L2
    }
}
