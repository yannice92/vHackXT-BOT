// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b.a.a.d;
import com.bca.c.c;
import com.bca.c.g;
import com.bca.mobile.ShareActivity;
import com.bca.mobile.TabSample;
import com.bca.mobile.bn;
import com.bca.mobile.n;
import com.f.a;
import com.utilities.e;
import java.util.ArrayList;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile.transaction:
//            r, s

public class M_Admin_Aktivasi_Pin_KK extends ShareActivity
    implements android.widget.AdapterView.OnItemClickListener, c
{

    String T;
    String U;
    EditText V;
    EditText W;
    private String X;
    RelativeLayout a;
    TextView b;
    TextView c;
    RelativeLayout d;
    TextView e;
    TextView f;
    s g;
    String h;
    String i;
    int j;
    int k;
    ArrayList l;
    ArrayList m;
    ArrayList n;

    public M_Admin_Aktivasi_Pin_KK()
    {
    }

    protected final void a()
    {
        String s1 = V.getText().toString();
        String s2 = W.getText().toString();
        String s3 = c.getText().toString();
        String s4 = f.getText().toString();
        int i1 = s1.length();
        int j1 = s2.length();
        if (i1 != 6)
        {
            a(null, "PIN Kartu Kredit harus 6 digit angka.", getParent(), false, "Back");
            return;
        }
        if (j1 != 6)
        {
            a(null, "PIN Kartu Kredit harus 6 digit angka.", getParent(), false, "Back");
            return;
        }
        if (!s1.equals(s2))
        {
            a(null, "PIN yang dimasukkan tidak sesuai.", getParent(), false, "Back");
            return;
        } else
        {
            a("m-Admin", getString(0x7f0c00c0).replaceAll("#cardnum#", (new StringBuilder(String.valueOf(s3.substring(0, 4)))).append(" ").append(s3.substring(4, 8)).append(" ").append(s3.substring(8, 12)).append(" ").append(s3.substring(12, 16)).toString()).replaceAll("#cardtype#", s4), getParent());
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
        a(((Runnable) (new r(this, as))));
    }

    protected final void a(String s1)
    {
        String s2 = V.getText().toString();
        try
        {
            s2 = n.af.a((new StringBuilder(String.valueOf(s2))).append(":-:").append(n.ak[13]).toString());
            s2 = (new StringBuilder("PGI:!:AAPK:!:")).append(c.getText().toString()).append(":!:").append(s2).append(":!:").append(n.af.a((new StringBuilder(String.valueOf(s1))).append(":-:").append(n.ak[13]).toString())).append(":!:").append(X).append(":!:2").toString();
            getParent();
            a(s1, s2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            g();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            g();
        }
        s1.printStackTrace();
    }

    protected final void b()
    {
    }

    public final void b(String s1)
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
        super.a(bundle, 0x7f030046);
        l = new ArrayList();
        m = new ArrayList();
        n = new ArrayList();
        a = (RelativeLayout)findViewById(0x7f0b0119);
        b = (TextView)findViewById(0x7f0b011a);
        c = (TextView)findViewById(0x7f0b011b);
        d = (RelativeLayout)findViewById(0x7f0b011e);
        e = (TextView)findViewById(0x7f0b011f);
        f = (TextView)findViewById(0x7f0b0120);
        g = new s(this, this);
        g.a(n);
        g.notifyDataSetChanged();
        a.setOnClickListener(this);
        d.setOnClickListener(this);
        l = (ArrayList)n.m.get("nomorkk");
        int i1 = Integer.parseInt((String)l.get(l.size() - 1));
        T = (String)l.get(i1);
        c.setText(T);
        m = (ArrayList)n.m.get("jeniskk");
        U = (String)m.get(i1);
        f.setText(U);
        if (l.size() <= 2)
        {
            ((ImageView)findViewById(0x7f0b011c)).setVisibility(8);
        }
        ((String)m.get(k)).split(":#:");
        bundle = (TextView)findViewById(0x7f0b0091);
        TextView textview = (TextView)findViewById(0x7f0b0094);
        V = (EditText)findViewById(0x7f0b0092);
        W = (EditText)findViewById(0x7f0b0095);
        V.setKeyListener(bn.b());
        W.setKeyListener(bn.b());
        bundle.setText("PIN Kartu Kredit:");
        textview.setText("Ulangi PIN Kartu Kredit:");
        n.f = true;
        X = ((String[])n.m.get("data"))[2];
    }

    protected void onDestroy()
    {
        super.onDestroy();
        n.f = false;
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
        if (E == 1)
        {
            f();
        }
        E = 0;
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
