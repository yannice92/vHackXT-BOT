// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.content.Intent;
import android.text.Editable;
import android.widget.EditText;
import com.bca.mobile.n;
import com.bca.mobile.tab.TabGroupBaseActivity;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Transfer_Dafter_Rekening, M_Transfer_Dafter_Rekening_ConfirmScreen

final class di
    implements Runnable
{

    final M_Transfer_Dafter_Rekening a;
    private final String b[];

    di(M_Transfer_Dafter_Rekening m_transfer_dafter_rekening, String as[])
    {
        a = m_transfer_dafter_rekening;
        b = as;
        super();
    }

    public final void run()
    {
        a.g();
        if (n.m != null)
        {
            n.m = null;
        }
        n.m = new Hashtable();
        if (b[1].trim().equals("")) goto _L2; else goto _L1
_L1:
        Object obj;
        String as[];
        String as1[];
        int i;
        int j;
        obj = b[1].split(":@:");
        j = obj.length;
        as = new String[j];
        as1 = new String[j];
        i = 0;
_L9:
        if (i < j) goto _L4; else goto _L3
_L3:
        n.m.put("valid_rek", as);
        n.m.put("valid_name", as1);
        n.m.put("valid", obj);
        n.m.put("invisible", new Boolean(false));
_L10:
        if (b.length != 3)
        {
            break MISSING_BLOCK_LABEL_453;
        }
        if (b[2].trim().equals("")) goto _L6; else goto _L5
_L5:
        obj = b[2].split(":@:");
        j = obj.length;
        as = new String[j];
        as1 = new String[j];
        i = 0;
_L11:
        if (i < j) goto _L8; else goto _L7
_L7:
        n.m.put("invalid_rek", as);
        n.m.put("invalid_name", as1);
        n.m.put("invalid", obj);
        if (n.m.get("invisible") == null)
        {
            n.m.put("invisible", new Boolean(true));
        }
_L12:
        M_Transfer_Dafter_Rekening.a = a.d.getText().toString();
        M_Transfer_Dafter_Rekening.b = a.e.getText().toString();
        M_Transfer_Dafter_Rekening.c = a.f.getText().toString();
        obj = new Intent(a.getParent(), com/bca/mobile/transaction/M_Transfer_Dafter_Rekening_ConfirmScreen);
        ((TabGroupBaseActivity)a.getParent()).a("M_Transfer_Dafter_Rekening_ConfirmScreen", ((Intent) (obj)));
        return;
_L4:
        String as2[] = obj[i].split(" - ");
        as[i] = as2[0];
        as1[i] = as2[1];
        i++;
          goto _L9
_L2:
        n.m.put("valid", new String[] {
            ""
        });
          goto _L10
_L8:
        String as3[] = obj[i].split(" - ");
        as[i] = as3[0];
        as1[i] = as3[1];
        i++;
          goto _L11
_L6:
        n.m.put("invalid", new String[] {
            ""
        });
          goto _L12
        n.m.put("invalid", new String[] {
            ""
        });
          goto _L12
    }
}
