// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bca.c.g;
import com.bca.mobile.ShareActivity;
import com.bca.mobile.TabSample;
import com.bca.mobile.af;
import com.bca.mobile.n;
import com.f.a;
import com.utilities.d;
import com.utilities.e;
import com.utilities.k;
import com.utilities.l;
import java.util.Date;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile.transaction:
//            df, dg, dh

public class M_Transfer_Dafter_Bank extends ShareActivity
{

    public android.widget.AdapterView.OnItemClickListener a;
    private final int b = 0;
    private final int c = 1;
    private int d;
    private dh e;
    private RelativeLayout f;
    private TextView g;
    private EditText h;
    private String i[];
    private int j;
    private String k[];

    public M_Transfer_Dafter_Bank()
    {
        d = 0;
        a = new df(this);
    }

    static dh a(M_Transfer_Dafter_Bank m_transfer_dafter_bank)
    {
        return m_transfer_dafter_bank.e;
    }

    static void a(M_Transfer_Dafter_Bank m_transfer_dafter_bank, String as[])
    {
        m_transfer_dafter_bank.k = as;
    }

    static TextView b(M_Transfer_Dafter_Bank m_transfer_dafter_bank)
    {
        return m_transfer_dafter_bank.g;
    }

    static int c(M_Transfer_Dafter_Bank m_transfer_dafter_bank)
    {
        return m_transfer_dafter_bank.d;
    }

    protected final void a()
    {
        if (h.getText().length() == 0)
        {
            a(null, "110 - Anda belum menginput No. Rekening Tujuan yang akan didaftarkan.", getParent(), false, "Back");
            return;
        } else
        {
            super.f();
            return;
        }
    }

    public final void a(int i1)
    {
        g();
        if (n.l == 0x7f0200a7 && n.y != null)
        {
            n.y.c();
            n.y = null;
        }
    }

    public final void a(int i1, String as[])
    {
        a(((Runnable) (new dg(this, as))));
    }

    protected final void a(String s)
    {
        String s1 = h.getText().toString();
        String s2 = g.getText().toString();
        try
        {
            if (f(s))
            {
                Object obj = new Date();
                String s3 = com.utilities.d.a(((Date) (obj)));
                obj = com.utilities.d.b(((Date) (obj)));
                l l1 = com.utilities.k.b(this, com.utilities.n.a(s1, (new StringBuilder(String.valueOf(s3))).append(((String) (obj))).toString()), s3, ((String) (obj)));
                (new af(getParent(), l1.a())).a();
                s = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(""))).append("PGI").toString()))).append(":!:").toString()))).append("TDAB").toString()))).append(":!:").toString()))).append(s1).toString()))).append(":!:").toString()))).toString()))).append(":!:").toString()))).append(s2).toString()))).append(":!:").toString()))).append(n.af.a((new StringBuilder(String.valueOf(s))).append(":-:").append(n.ak[13]).toString())).toString()))).append(":!:").toString()))).append(l1.b()).toString()))).append(":!:").toString()))).append(s3).append(((String) (obj))).toString();
                d = 0;
                g(s);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

    protected final void b()
    {
    }

    public final void b(String s)
    {
    }

    public final void c()
    {
    }

    public void onCancel(DialogInterface dialoginterface)
    {
    }

    public void onClick(View view)
    {
        super.onClick(view);
        if (f == view)
        {
            a(getParent(), e, a);
            y.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f03005d);
        if (n.am != null)
        {
            n.am.a("Send", true);
        }
        f = (RelativeLayout)findViewById(0x7f0b01e3);
        i = (String[])n.m.get("bank_name");
        j = ((Integer)n.m.get("default")).intValue();
        if (i.length > 1)
        {
            f.setOnClickListener(this);
        }
        e = new dh(this, getParent());
        e.a(i);
        e.notifyDataSetChanged();
        g = (TextView)findViewById(0x7f0b01e5);
        g.setText(i[j]);
        h = (EditText)findViewById(0x7f0b01e2);
        h.setFilters(new InputFilter[] {
            new android.text.InputFilter.LengthFilter(19)
        });
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
    }

    public void onResultButtonCancel(View view)
    {
    }

    public void onResultButtonOK(View view)
    {
        E;
        JVM INSTR tableswitch 1 1: default 24
    //                   1 30;
           goto _L1 _L2
_L1:
        E = 0;
        return;
_L2:
        d = 1;
        g((new StringBuilder("PGI:!:TDAB:!:")).append(k[1].split(" - ")[1]).append(":!:").append(k[1].split(" - ")[0]).toString());
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void onResume()
    {
        super.onResume();
        if (n.v == null)
        {
            n.v = new g(this);
        }
        n.v.a(this);
    }
}
