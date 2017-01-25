// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.app.AlertDialog;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b.a.a.d;
import com.bca.c.g;
import com.bca.mobile.ShareActivity;
import com.bca.mobile.TabSample;
import com.bca.mobile.bt;
import com.bca.mobile.n;
import com.f.a;
import com.utilities.e;
import java.util.ArrayList;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile.transaction:
//            ac, ae, af, ad

public class M_Admin_Reg_KK_all extends ShareActivity
    implements android.widget.AdapterView.OnItemClickListener
{

    int T;
    Handler a;
    String b;
    RelativeLayout c;
    TextView d;
    TextView e;
    bt f;
    int g;
    RelativeLayout h;
    TextView i;
    EditText j;
    String k;
    String l;
    int m;
    ArrayList n;

    public M_Admin_Reg_KK_all()
    {
        a = new ac(this);
        m = 0;
    }

    protected final void a()
    {
        if (b.equals("ARIK"))
        {
            if (j.getText().length() == 0)
            {
                m = 1;
                a(null, "145 - Anda belum menginput No. Kartu Kredit.", getParent(), false, "Back");
                return;
            } else
            {
                f();
                return;
            }
        } else
        {
            f();
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
        a(((Runnable) (new ae(this, as))));
    }

    protected final void a(String s)
    {
        try
        {
            if (b.equals("ARIK"))
            {
                k = j.getText().toString();
            }
            String s1 = (new StringBuilder("PGI:!:")).append(b).append(":!:").append(k).append(":!:").append(n.af.a((new StringBuilder(String.valueOf(s))).append(":-:").append(n.ak[13]).toString())).toString();
            getParent();
            a(s, s1);
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
        if (b.equals("AHIK"))
        {
            k = (String)f.getItem(0);
            e.setText(k);
        } else
        if (b.equals("ARIK"))
        {
            j.setText("");
            return;
        }
    }

    public final boolean e(int i1)
    {
        n.remove(i1);
        if (n.size() == 0)
        {
            return false;
        }
        if (n.size() <= 1)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        c.setOnClickListener(new af(this));
_L1:
        f.a(n);
        f.notifyDataSetChanged();
        e.setText((CharSequence)n.get(0));
        return true;
        try
        {
            c.setOnClickListener(null);
        }
        catch (Exception exception)
        {
            return false;
        }
          goto _L1
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f03004a);
        b = (String)n.m.get("send_keyword");
        if (n.am != null)
        {
            n.am.a("Send", true);
        }
        if (b.equals("AHIK"))
        {
            n = (ArrayList)n.m.get("data");
            g = Integer.parseInt((String)n.m.get("defaultindex"));
            bundle = n;
            c = (RelativeLayout)findViewById(0x7f0b013d);
            d = (TextView)findViewById(0x7f0b013e);
            e = (TextView)findViewById(0x7f0b013f);
            l = (String)bundle.get(g);
            e.setText(l);
            k = e.getText().toString();
            c.setVisibility(0);
            f = new bt(getParent());
            f.a(bundle);
            if (bundle.size() > 1)
            {
                c.setOnClickListener(new ad(this));
            }
            if (n.size() == 1)
            {
                findViewById(0x7f0b0114).setVisibility(8);
            }
        } else
        if (b.equals("ARIK"))
        {
            h = (RelativeLayout)findViewById(0x7f0b0140);
            i = (TextView)findViewById(0x7f0b0141);
            j = (EditText)findViewById(0x7f0b0142);
            a(j, 0);
            j.setFilters(new InputFilter[] {
                new android.text.InputFilter.LengthFilter(16)
            });
            h.setVisibility(0);
            return;
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        F.dismiss();
        T = i1;
        k = (String)f.getItem(i1);
        e.setText(k);
    }

    public void onResultButtonCancel(View view)
    {
        if (b.equals("AHIK"))
        {
            k = (String)f.getItem(0);
            e.setText(k);
        } else
        if (b.equals("ARIK"))
        {
            j.setText("");
            return;
        }
    }

    public void onResultButtonOK(View view)
    {
        if (m != 1)
        {
            finish();
        }
        m = 0;
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
