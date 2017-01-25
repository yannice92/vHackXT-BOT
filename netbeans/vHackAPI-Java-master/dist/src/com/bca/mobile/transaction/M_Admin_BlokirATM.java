// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import b.a.a.d;
import com.bca.c.g;
import com.bca.mobile.ShareActivity;
import com.bca.mobile.TabSample;
import com.bca.mobile.bn;
import com.bca.mobile.n;
import com.f.a;
import com.utilities.e;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile.transaction:
//            u, t

public class M_Admin_BlokirATM extends ShareActivity
{

    WebView a;
    WebSettings b;
    ProgressBar c;
    private Button d;
    private Button e;
    private String f;
    private String g;

    public M_Admin_BlokirATM()
    {
    }

    static Button a(M_Admin_BlokirATM m_admin_blokiratm)
    {
        return m_admin_blokiratm.d;
    }

    static Button b(M_Admin_BlokirATM m_admin_blokiratm)
    {
        return m_admin_blokiratm.e;
    }

    protected final void a()
    {
    }

    public final void a(int i)
    {
        g();
        if (n.l == 0x7f0200a7 && n.y != null)
        {
            n.y.c();
            n.y = null;
        }
    }

    public final void a(int i, String as[])
    {
        a(((Runnable) (new u(this, as))));
    }

    protected final void a(String s)
    {
        try
        {
            String s1 = (new StringBuilder("PGI:!:ABKA:!:")).append(f).append(":!:").append(n.af.a((new StringBuilder(String.valueOf(s))).append(":-:").append(n.ak[13]).toString())).append(":!:").append(g).append(":!:2").toString();
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

    public void onClick(View view)
    {
        super.onClick(view);
        if (view == e)
        {
            f();
        } else
        if (view == d)
        {
            finish();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        TextView textview;
        TextView textview1;
        String s;
        Object obj;
        StringBuilder stringbuilder;
        int j;
        super.a(bundle, 0x7f030047);
        obj = (TextView)findViewById(0x7f0b012a);
        bundle = (TextView)findViewById(0x7f0b012b);
        textview = (TextView)findViewById(0x7f0b012e);
        textview1 = (TextView)findViewById(0x7f0b012f);
        String as[] = (String[])n.m.get("data");
        f = as[1];
        s = as[2];
        g = as[3];
        d = (Button)findViewById(0x7f0b0135);
        e = (Button)findViewById(0x7f0b0136);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        d.setVisibility(4);
        e.setVisibility(4);
        ((TextView) (obj)).setText(bn.a(0x7f0c00b9));
        obj = f;
        stringbuilder = new StringBuilder();
        j = ((String) (obj)).length();
        if (j <= 4) goto _L2; else goto _L1
_L1:
        int i = 0;
_L9:
        if (i < j) goto _L3; else goto _L2
_L2:
        bundle.setText(stringbuilder.toString());
        textview.setText(bn.a(0x7f0c00ba));
        textview1.setText(s);
        a = (WebView)findViewById(0x7f0b0126);
        c = (ProgressBar)findViewById(0x7f0b0131);
        a.setWebViewClient(new t(this));
        a.loadUrl("file:///android_asset/txt/tncBlokirATM.html");
        b = a.getSettings();
        if (n.aM < 7.0999999999999996D) goto _L5; else goto _L4
_L4:
        b.setTextSize(android.webkit.WebSettings.TextSize.LARGER);
_L7:
        return;
_L3:
        if (i % 4 == 0 && i != 0)
        {
            stringbuilder.append(" ");
        }
        stringbuilder.append(((String) (obj)).charAt(i));
        i++;
        continue; /* Loop/switch isn't completed */
_L5:
        if (n.aM < 4.9000000000000004D) goto _L7; else goto _L6
_L6:
        b.setTextSize(android.webkit.WebSettings.TextSize.NORMAL);
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    protected void onDestroy()
    {
        super.onDestroy();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
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
