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
import com.bca.mobile.bn;
import com.bca.mobile.n;
import com.f.a;
import com.utilities.e;
import java.util.ArrayList;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile.transaction:
//            br, bt

public class M_Info_KK_Saldo extends ShareActivity
    implements android.widget.AdapterView.OnItemClickListener, c
{

    private RelativeLayout a;
    private TextView b;
    private bt c;
    private ArrayList d;
    private String e;

    public M_Info_KK_Saldo()
    {
    }

    static TextView a(M_Info_KK_Saldo m_info_kk_saldo)
    {
        return m_info_kk_saldo.b;
    }

    static String b(M_Info_KK_Saldo m_info_kk_saldo)
    {
        return m_info_kk_saldo.e;
    }

    protected final void a()
    {
        super.f();
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
        super.a(new br(this, as));
    }

    protected final void a(String s)
    {
        try
        {
            a(s, (new StringBuilder("PGI:!:IKS:!:")).append(n.af.a((new StringBuilder(String.valueOf(s))).append(":-:").append(n.ak[13]).toString())).append(":!:").append(b.getText().toString()).toString());
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
        super.onClick(view);
        if (a == view)
        {
            super.a(getParent(), c, this);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f030050);
        d = (ArrayList)n.m.get("no_customer");
        a = (RelativeLayout)findViewById(0x7f0b016d);
        if (d.size() > 2)
        {
            a.setOnClickListener(this);
        } else
        {
            ((ImageView)findViewById(0x7f0b011c)).setVisibility(8);
        }
        b = (TextView)findViewById(0x7f0b016f);
        c = new bt(this, this);
        c.a(d.subList(0, d.size() - 1));
        c.notifyDataSetChanged();
        e = bn.a(d);
        b.setText(e);
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        F.dismiss();
        b.setText((String)c.getItem(i));
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
