// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b.a.a.d;
import com.bca.c.c;
import com.bca.c.g;
import com.bca.mobile.ShareActivity;
import com.bca.mobile.TabSample;
import com.bca.mobile.n;
import com.f.a;
import com.utilities.e;
import java.util.ArrayList;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile.transaction:
//            bx, bz

public class M_Info_KPR_Pinjaman extends ShareActivity
    implements android.widget.AdapterView.OnItemClickListener, c
{

    String T;
    String U;
    RelativeLayout a;
    TextView b;
    TextView c;
    RelativeLayout d;
    TextView e;
    TextView f;
    bz g;
    String h;
    String i;
    int j;
    int k;
    ArrayList l;
    ArrayList m;
    ArrayList n;

    public M_Info_KPR_Pinjaman()
    {
    }

    protected final void a()
    {
        f();
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
        super.a(new bx(this, as));
    }

    protected final void a(String s)
    {
        try
        {
            a(s, (new StringBuilder("PGI:!:IPK:!:")).append(c.getText().toString()).append(":!:").append(f.getText().toString()).append(":!:").append(n.af.a((new StringBuilder(String.valueOf(s))).append(":-:").append(n.ak[13]).toString())).append(":!:2").toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            g();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            g();
        }
        s.printStackTrace();
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
        if (view != a) goto _L2; else goto _L1
_L1:
        if (l.size() > 2)
        {
            super.a(getParent(), g, this);
            g.a(l.subList(0, l.size() - 1));
            g.notifyDataSetChanged();
            j = 1;
        }
_L4:
        super.onClick(view);
        return;
_L2:
        String as[];
        int i1;
        int j1;
        if (d != view)
        {
            continue; /* Loop/switch isn't completed */
        }
        as = ((String)m.get(k)).split(":#:");
        if (as.length <= 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        super.a(getParent(), g, this);
        n.clear();
        j1 = as.length;
        i1 = 0;
_L5:
label0:
        {
            if (i1 < j1)
            {
                break label0;
            }
            g.a(n.subList(0, n.size() - 1));
            g.notifyDataSetChanged();
            j = 2;
        }
        if (true) goto _L4; else goto _L3
_L3:
        String s = as[i1];
        n.add(s);
        i1++;
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f030052);
        l = new ArrayList();
        m = new ArrayList();
        n = new ArrayList();
        a = (RelativeLayout)findViewById(0x7f0b0177);
        b = (TextView)findViewById(0x7f0b0178);
        c = (TextView)findViewById(0x7f0b0179);
        d = (RelativeLayout)findViewById(0x7f0b017a);
        e = (TextView)findViewById(0x7f0b017b);
        f = (TextView)findViewById(0x7f0b017c);
        g = new bz(this, this);
        g.a(l);
        g.notifyDataSetChanged();
        a.setOnClickListener(this);
        d.setOnClickListener(this);
        l = (ArrayList)n.m.get("no_rek_pinjaman");
        T = (String)l.get(0);
        c.setText(T);
        m = (ArrayList)n.m.get("no_pinjaman");
        U = ((String)m.get(0)).split(":#:")[0];
        f.setText(U);
        if (l.size() <= 2)
        {
            ((ImageView)findViewById(0x7f0b011c)).setVisibility(8);
        }
        if (((String)m.get(k)).split(":#:").length <= 2)
        {
            ((ImageView)findViewById(0x7f0b0121)).setVisibility(8);
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        if (j == 1)
        {
            F.dismiss();
            k = (int)g.getItemId(i1);
            h = (String)g.getItem(i1);
            c.setText(h);
            adapterview = ((String)m.get(k)).split(":#:");
            if (adapterview.length <= 2)
            {
                ((ImageView)findViewById(0x7f0b0121)).setVisibility(8);
            } else
            {
                ((ImageView)findViewById(0x7f0b0121)).setVisibility(0);
            }
            f.setText(adapterview[0]);
        } else
        if (j == 2)
        {
            F.dismiss();
            i = (String)g.getItem(i1);
            f.setText(i);
            return;
        }
    }

    public void onResultButtonCancel(View view)
    {
    }

    public void onResultButtonOK(View view)
    {
    }

    protected void onResume()
    {
        n.am.a("Send", true);
        super.onResume();
        if (n.v == null)
        {
            n.v = new g(this);
        }
        n.v.a(this);
    }
}
