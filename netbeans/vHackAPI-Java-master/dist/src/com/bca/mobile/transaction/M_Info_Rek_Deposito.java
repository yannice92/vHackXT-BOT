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
//            cn, cp

public class M_Info_Rek_Deposito extends ShareActivity
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
    cp g;
    String h;
    String i;
    int j;
    int k;
    ArrayList l;
    ArrayList m;
    ArrayList n;

    public M_Info_Rek_Deposito()
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
        super.a(new cn(this, as));
    }

    protected final void a(String s)
    {
        try
        {
            String s1 = (new StringBuilder("PGI:!:IRD:!:")).append(n.af.a((new StringBuilder(String.valueOf(s))).append(":-:").append(n.ak[13]).toString())).append(":!:").append(c.getText().toString()).append(":!:").append(f.getText().toString()).append(":!::!::!:2").toString();
            getParent();
            a(s, s1);
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
        if (view == a)
        {
            if (l.size() > 2)
            {
                super.a(getParent(), g, this);
                g.a(l.subList(0, l.size() - 1));
                g.notifyDataSetChanged();
                j = 1;
            }
        } else
        if (d == view)
        {
            view = ((String)m.get(k)).split(":#:");
            if (view.length > 2)
            {
                super.a(getParent(), g, this);
                n.clear();
                int j1 = view.length;
                int i1 = 0;
                do
                {
                    if (i1 >= j1)
                    {
                        g.a(n.subList(0, n.size() - 1));
                        g.notifyDataSetChanged();
                        j = 2;
                        return;
                    }
                    Object obj = view[i1];
                    n.add(obj);
                    i1++;
                } while (true);
            }
        } else
        {
            super.onClick(view);
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f030055);
        l = new ArrayList();
        m = new ArrayList();
        n = new ArrayList();
        a = (RelativeLayout)findViewById(0x7f0b019a);
        b = (TextView)findViewById(0x7f0b019b);
        c = (TextView)findViewById(0x7f0b019c);
        d = (RelativeLayout)findViewById(0x7f0b019d);
        e = (TextView)findViewById(0x7f0b019e);
        f = (TextView)findViewById(0x7f0b019f);
        g = new cp(this, this);
        g.a(n);
        g.notifyDataSetChanged();
        a.setOnClickListener(this);
        d.setOnClickListener(this);
        l = (ArrayList)n.m.get("RekDep");
        int i1 = Integer.parseInt((String)l.get(l.size() - 1));
        T = (String)l.get(i1);
        c.setText(T);
        m = (ArrayList)n.m.get("NoBilyet");
        bundle = ((String)m.get(i1)).split(":#:");
        U = bundle[Integer.parseInt(bundle[bundle.length - 1])];
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
