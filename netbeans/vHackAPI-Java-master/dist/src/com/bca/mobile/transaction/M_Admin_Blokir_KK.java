// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
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
//            w, x, v

public class M_Admin_Blokir_KK extends ShareActivity
    implements android.widget.AdapterView.OnItemClickListener, c
{

    String T;
    String U;
    WebView V;
    WebSettings W;
    ProgressBar X;
    private String Y;
    private Button Z;
    RelativeLayout a;
    private Button aa;
    TextView b;
    TextView c;
    RelativeLayout d;
    TextView e;
    TextView f;
    x g;
    String h;
    String i;
    int j;
    int k;
    ArrayList l;
    ArrayList m;
    ArrayList n;

    public M_Admin_Blokir_KK()
    {
    }

    static Button a(M_Admin_Blokir_KK m_admin_blokir_kk)
    {
        return m_admin_blokir_kk.Z;
    }

    static Button b(M_Admin_Blokir_KK m_admin_blokir_kk)
    {
        return m_admin_blokir_kk.aa;
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
        a(((Runnable) (new w(this, as))));
    }

    protected final void a(String s)
    {
        try
        {
            String s1 = (new StringBuilder("PGI:!:ABKK:!:")).append(c.getText().toString()).append(":!:").append(n.af.a((new StringBuilder(String.valueOf(s))).append(":-:").append(n.ak[13]).toString())).append(":!:").append(Y).append(":!:2").toString();
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
            if (view == aa)
            {
                f();
                return;
            }
            if (view == Z)
            {
                finish();
                return;
            } else
            {
                super.onClick(view);
                return;
            }
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f030048);
        l = new ArrayList();
        m = new ArrayList();
        n = new ArrayList();
        a = (RelativeLayout)findViewById(0x7f0b0119);
        b = (TextView)findViewById(0x7f0b011a);
        c = (TextView)findViewById(0x7f0b011b);
        d = (RelativeLayout)findViewById(0x7f0b011e);
        e = (TextView)findViewById(0x7f0b012e);
        f = (TextView)findViewById(0x7f0b012f);
        g = new x(this, this);
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
        Y = ((String[])n.m.get("data"))[2];
        Z = (Button)findViewById(0x7f0b0135);
        aa = (Button)findViewById(0x7f0b0136);
        Z.setOnClickListener(this);
        aa.setOnClickListener(this);
        Z.setVisibility(4);
        aa.setVisibility(4);
        V = (WebView)findViewById(0x7f0b0126);
        X = (ProgressBar)findViewById(0x7f0b0131);
        V.setWebViewClient(new v(this));
        V.loadUrl("file:///android_asset/txt/tncBlokirKK.html");
        W = V.getSettings();
        if (n.aM >= 7.0999999999999996D)
        {
            W.setTextSize(android.webkit.WebSettings.TextSize.LARGER);
        } else
        if (n.aM >= 4.9000000000000004D)
        {
            W.setTextSize(android.webkit.WebSettings.TextSize.NORMAL);
            return;
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
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
    }

    protected void onResume()
    {
        n.am.a("Send", false);
        super.onResume();
        if (n.v == null)
        {
            n.v = new g(this);
        }
        n.v.a(this);
    }
}
