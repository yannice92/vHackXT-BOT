// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b.a.a.d;
import com.bca.a.a;
import com.bca.a.c;
import com.bca.a.e;
import com.bca.a.f;
import com.bca.mobile.n;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Transfer_Service, g, dy, dz

public class M_Transfer_TA_Virtual_Account extends M_Transfer_Service
{

    private boolean T;
    ArrayList b;
    ArrayList c;
    private f d;
    private Hashtable e;
    private RelativeLayout f;
    private RelativeLayout g;
    private TextView h;
    private TextView i;
    private int j;
    private int k;
    private String l;
    private String m;
    private boolean n;

    public M_Transfer_TA_Virtual_Account()
    {
        l = "";
        n = true;
        T = false;
    }

    static f a(M_Transfer_TA_Virtual_Account m_transfer_ta_virtual_account)
    {
        return m_transfer_ta_virtual_account.d;
    }

    static void a(M_Transfer_TA_Virtual_Account m_transfer_ta_virtual_account, int i1)
    {
        m_transfer_ta_virtual_account.k = i1;
    }

    static void a(M_Transfer_TA_Virtual_Account m_transfer_ta_virtual_account, f f1)
    {
        m_transfer_ta_virtual_account.d = f1;
    }

    static void a(M_Transfer_TA_Virtual_Account m_transfer_ta_virtual_account, String s)
    {
        m_transfer_ta_virtual_account.l = s;
    }

    static void a(M_Transfer_TA_Virtual_Account m_transfer_ta_virtual_account, boolean flag)
    {
        m_transfer_ta_virtual_account.T = flag;
    }

    static int b(M_Transfer_TA_Virtual_Account m_transfer_ta_virtual_account)
    {
        return m_transfer_ta_virtual_account.k;
    }

    static void b(M_Transfer_TA_Virtual_Account m_transfer_ta_virtual_account, String s)
    {
        m_transfer_ta_virtual_account.j(s);
    }

    static void c(M_Transfer_TA_Virtual_Account m_transfer_ta_virtual_account)
    {
        m_transfer_ta_virtual_account.o();
    }

    static void d(M_Transfer_TA_Virtual_Account m_transfer_ta_virtual_account)
    {
        m_transfer_ta_virtual_account.p();
    }

    static int e(M_Transfer_TA_Virtual_Account m_transfer_ta_virtual_account)
    {
        return m_transfer_ta_virtual_account.j;
    }

    private void e(int i1)
    {
        String s = (String)c.get(i1);
        i.setText(s);
    }

    static TextView f(M_Transfer_TA_Virtual_Account m_transfer_ta_virtual_account)
    {
        return m_transfer_ta_virtual_account.h;
    }

    private void f(int i1)
    {
        ((ImageView)findViewById(0x7f0b01ce)).setVisibility(i1);
    }

    static void g(M_Transfer_TA_Virtual_Account m_transfer_ta_virtual_account)
    {
        m_transfer_ta_virtual_account.n = true;
    }

    private void j(String s)
    {
        m = s.split("-")[0].trim();
    }

    private void m()
    {
        e = new Hashtable();
        e.put(com.bca.mobile.transaction.g.c, "m-Transfer");
    }

    private void n()
    {
        if (B != null)
        {
            B.cancel();
            B = null;
        }
        B = new g(getParent(), e, this, this);
        B.show();
    }

    private void o()
    {
        Object obj = d.b();
        System.out.println((new StringBuilder("Current DIalog: ")).append(((a) (obj)).name()).toString());
        if (obj == a.e)
        {
            a("m-Transfer", d.e(), getParent(), "Ok", "Cancel");
            return;
        }
        if (obj == a.b)
        {
            if (d instanceof c)
            {
                obj = "Masukkan jumlah transfer";
            } else
            {
                obj = ((e)d).a();
            }
            m();
            e.put(g.t, obj);
            e.put(g.x, new Integer(0));
            e.put(g.y, new Integer(0));
            e.put(g.v, Integer.valueOf(1));
            e.put(g.w, Integer.valueOf(13));
            e.put(g.b, new Boolean(true));
            e.put(g.A, "");
            e.put(com.bca.mobile.transaction.g.d, "Rp");
            e.put(com.bca.mobile.transaction.g.f, getString(0x7f0c0086));
            n();
            return;
        }
        if (obj == a.c)
        {
            if (d.d().equals("OFF"))
            {
                m();
                e.put(g.b, new Boolean(true));
                e.put(g.B, new Boolean(true));
                e.put(g.t, "Berita");
                e.put(g.A, "");
                e.put(g.b, new Boolean(true));
                n();
                return;
            } else
            {
                p();
                return;
            }
        }
        if (obj == a.d)
        {
            f();
            return;
        } else
        {
            a("m-Transfer", com.utilities.c.c(d.g()[1]), getParent(), true, "Ok");
            return;
        }
    }

    private void p()
    {
        d.c();
        o();
    }

    protected final void a()
    {
        Log.i("Virtual Account", "onTitleRightButtonClicked");
        String s = i.getText().toString().trim();
        String s2 = h.getText().toString().trim();
        if (s2.equals(""))
        {
            a("m-Transfer", getString(0x7f0c0077).replace("#LABEL#", "No. Virtual Account"), getParent(), false, "Back");
        } else
        if (s.equals(s2))
        {
            a("m-Transfer", getString(0x7f0c0084), getParent(), false, "Back");
        } else
        {
            E = 1;
            String s3 = m;
            String s1;
            if (T)
            {
                s1 = "Y";
            } else
            {
                s1 = "N";
            }
            g(a(new String[] {
                "PGI", "TVA", s3, s1, i.getText().toString(), "2"
            }));
            d = null;
        }
        j = -1;
    }

    public final void a(int i1)
    {
        Log.i("Virtual Account", "onProgressButtonClicked");
    }

    public final void a(int i1, String as[])
    {
        Log.i("Virtual Account", "OnTaskFinish");
        a(((Runnable) (new dy(this, as))));
    }

    protected final void a(String s)
    {
        Log.i("Virtual Account", "onDialogPinSubmit");
        String s1 = (new StringBuilder(String.valueOf(s))).append(":-:").append(d.f()).toString();
        try
        {
            d.c(s1);
            s1 = d.i().replace("#MPIN#", n.af.a(s1));
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

    public final void a(String s, boolean flag, boolean flag1)
    {
        a(((Runnable) (new dz(this, flag, s))));
    }

    protected final void b()
    {
        Log.i("Virtual Account", "onTitleLeftButtonClicked");
    }

    public final void b(String s)
    {
        Log.i("Virtual Account", "onResultAmout");
    }

    public final void c()
    {
        Log.i("Virtual Account", "onResultBackButtonCancel");
    }

    protected final void d()
    {
        String as[] = (String[])n.m.get("data");
        b = com.utilities.c.a(as[2]);
        c = com.utilities.c.a(as[1]);
    }

    protected final void e()
    {
        h = (TextView)findViewById(0x7f0b020c);
        i = (TextView)findViewById(0x7f0b0209);
        f = (RelativeLayout)findViewById(0x7f0b020a);
        f.setOnClickListener(this);
        g = (RelativeLayout)findViewById(0x7f0b0207);
        g.setOnClickListener(this);
        Log.i("TEST", (new StringBuilder("Size ")).append(c.size()).toString());
        if (c.size() > 1)
        {
            f(0);
        } else
        {
            f(8);
            g.setEnabled(false);
        }
        e(0);
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
    }

    public void onClick(View view)
    {
        Log.i("Virtual Account", "onClick");
        m();
        if (n.y != null)
        {
            n.y.d();
        }
        if (view.equals(g))
        {
            if (c.size() != 1)
            {
                e.put(g.q, c);
                e.put(g.b, new Boolean(false));
            }
            n();
            j = 2;
            return;
        }
        if (view.equals(f))
        {
            e.put(g.t, getString(0x7f0c00ad));
            e.put(g.b, new Boolean(true));
            e.put(g.x, new Integer("0"));
            e.put(g.y, new Integer("0"));
            e.put(g.v, Integer.valueOf(1));
            e.put(g.w, Integer.valueOf(23));
            e.put(g.u, getString(0x7f0c00af));
            e.put(g.z, Boolean.valueOf(T));
            e.put(g.A, l);
            e.put(g.B, Boolean.valueOf(true));
            e.put(g.C, ".,");
            e.put("force_validation", Boolean.valueOf(true));
            if (b != null && b.size() != 0)
            {
                e.put(g.b, new Boolean(n));
                e.put(g.j, getString(0x7f0c00b0));
                e.put(g.k, getResources().getDrawable(0x7f020076));
                e.put(g.l, getResources().getDrawable(0x7f020075));
                e.put(g.m, getString(0x7f0c00b1));
                e.put(com.bca.mobile.transaction.g.n, getResources().getDrawable(0x7f020076));
                e.put(g.o, getResources().getDrawable(0x7f020075));
                e.put(g.q, b);
            }
            e.put(com.bca.mobile.transaction.g.f, getString(0x7f0c0077));
            e.put(g.g, getString(0x7f0c007b));
            e.put(g.h, getString(0x7f0c007c));
            e.put("input_dialog_error_input_contain_illegal_character", getString(0x7f0c00b2));
            j = 1;
            n();
            j = 1;
            return;
        } else
        {
            super.onClick(view);
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f030075);
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        Log.i("Virtual Account", (new StringBuilder("onItemClick ")).append(j).toString());
        if (j == 1)
        {
            adapterview = (String)b.get(i1);
            j(adapterview);
            h.setText(adapterview);
            n = false;
        } else
        if (j == 2)
        {
            e(i1);
            return;
        }
    }

    public void onResultButtonCancel(View view)
    {
        Log.i("Virtual Account", "onResultButtonCancel");
    }

    public void onResultButtonOK(View view)
    {
        Log.i("Virtual Account", "onResultButtonOK");
        if (d != null && d.b() != a.a)
        {
            p();
        }
    }
}
