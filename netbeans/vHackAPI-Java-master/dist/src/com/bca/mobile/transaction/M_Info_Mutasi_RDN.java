// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.app.DatePickerDialog;
import android.app.Dialog;
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
import com.d.b;
import com.f.a;
import com.utilities.e;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile.transaction:
//            cd, ce, cf, cg, 
//            ci

public class M_Info_Mutasi_RDN extends ShareActivity
    implements android.view.View.OnClickListener, c
{

    EditText T;
    android.widget.AdapterView.OnItemClickListener U;
    android.widget.AdapterView.OnItemClickListener V;
    private int W;
    private int X;
    private int Y;
    private int Z;
    TextView a;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private android.app.DatePickerDialog.OnDateSetListener ah;
    TextView b;
    TextView c;
    TextView d;
    RelativeLayout e;
    RelativeLayout f;
    ImageView g;
    ImageView h;
    ArrayList i;
    ArrayList j;
    ArrayList k;
    ArrayList l;
    ci m;
    EditText n;

    public M_Info_Mutasi_RDN()
    {
        W = 0;
        ad = 7;
        ae = 31;
        af = 0;
        ag = 0;
        U = new cd(this);
        V = new ce(this);
        ah = new cf(this);
    }

    static int a(M_Info_Mutasi_RDN m_info_mutasi_rdn)
    {
        return m_info_mutasi_rdn.W;
    }

    static void a(M_Info_Mutasi_RDN m_info_mutasi_rdn, int i1)
    {
        m_info_mutasi_rdn.af = i1;
    }

    static int b(M_Info_Mutasi_RDN m_info_mutasi_rdn)
    {
        return m_info_mutasi_rdn.Y;
    }

    static void b(M_Info_Mutasi_RDN m_info_mutasi_rdn, int i1)
    {
        m_info_mutasi_rdn.ag = i1;
    }

    static int c(M_Info_Mutasi_RDN m_info_mutasi_rdn)
    {
        return m_info_mutasi_rdn.Z;
    }

    private String c(String s, String s1)
    {
        Object obj;
        Object obj1;
        String s2;
        obj = new Date();
        obj1 = new SimpleDateFormat("dd/MM/yyyy");
        s2 = ((SimpleDateFormat) (obj1)).format(((Date) (obj)));
        obj = "";
        s = ((SimpleDateFormat) (obj1)).parse(s);
        s1 = ((SimpleDateFormat) (obj1)).parse(s1);
        obj1 = ((SimpleDateFormat) (obj1)).parse(s2);
        long l1 = (s1.getTime() - s.getTime()) / 0x5265c00L;
        if ((((Date) (obj1)).getTime() - s.getTime()) / 0x5265c00L > (long)ae)
        {
            return getString(0x7f0c00a7).replace("#MINDATE#", (new StringBuilder(String.valueOf(ae))).toString());
        }
        if (l1 > (long)ad)
        {
            return getString(0x7f0c00a8).replace("#RANGE#", (new StringBuilder(String.valueOf(ad))).toString());
        }
        if (s1.compareTo(s) < 0)
        {
            return getString(0x7f0c00a9);
        }
        s = ((String) (obj));
        if (s1.compareTo(((Date) (obj1))) <= 0)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        s = getString(0x7f0c00aa);
        return s;
        s;
        s.printStackTrace();
        s = getString(0x7f0c00ab);
        return s;
    }

    static void c(M_Info_Mutasi_RDN m_info_mutasi_rdn, int i1)
    {
        m_info_mutasi_rdn.X = i1;
    }

    static int d(M_Info_Mutasi_RDN m_info_mutasi_rdn)
    {
        return m_info_mutasi_rdn.X;
    }

    static void d(M_Info_Mutasi_RDN m_info_mutasi_rdn, int i1)
    {
        m_info_mutasi_rdn.Y = i1;
    }

    static int e(M_Info_Mutasi_RDN m_info_mutasi_rdn)
    {
        return m_info_mutasi_rdn.ab;
    }

    static void e(M_Info_Mutasi_RDN m_info_mutasi_rdn, int i1)
    {
        m_info_mutasi_rdn.Z = i1;
    }

    static int f(M_Info_Mutasi_RDN m_info_mutasi_rdn)
    {
        return m_info_mutasi_rdn.ac;
    }

    static void f(M_Info_Mutasi_RDN m_info_mutasi_rdn, int i1)
    {
        m_info_mutasi_rdn.aa = i1;
    }

    static int g(M_Info_Mutasi_RDN m_info_mutasi_rdn)
    {
        return m_info_mutasi_rdn.aa;
    }

    static void g(M_Info_Mutasi_RDN m_info_mutasi_rdn, int i1)
    {
        m_info_mutasi_rdn.ab = i1;
    }

    static int h(M_Info_Mutasi_RDN m_info_mutasi_rdn)
    {
        return m_info_mutasi_rdn.af;
    }

    static void h(M_Info_Mutasi_RDN m_info_mutasi_rdn, int i1)
    {
        m_info_mutasi_rdn.ac = i1;
    }

    protected final void a()
    {
        if (n.getText().toString().equals(""))
        {
            bn.a("Tanggal awal harus diisi.", getParent());
            return;
        }
        if (T.getText().toString().equals(""))
        {
            bn.a("Tanggal akhir harus diisi.", getParent());
            return;
        }
        String s = c(n.getText().toString().replaceAll(" - ", "/"), T.getText().toString().replaceAll(" - ", "/"));
        if (!s.equals(""))
        {
            bn.a(s, getParent());
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
        super.a(new cg(this, as));
    }

    protected final void a(String s)
    {
        try
        {
            String s1 = (new StringBuilder("PGI:!:IMD:!:")).append(n.af.a((new StringBuilder(String.valueOf(s))).append(":-:").append(n.ak[13]).toString())).append(":!:").append(c.getText().toString()).append(":!:").append(n.getText().toString().replace(" - ", "")).append(":!:").append(T.getText().toString().replace(" - ", "")).toString();
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

    final void e(int i1)
    {
        l = new ArrayList();
        String as[] = ((String)i.get(i1)).split(":\\$:");
        i1 = 0;
        do
        {
            if (i1 >= as.length)
            {
                if (l.size() < 2)
                {
                    h.setVisibility(8);
                } else
                {
                    h.setVisibility(0);
                }
                c.setText((CharSequence)l.get(ag));
                return;
            }
            l.add(as[i1]);
            i1++;
        } while (true);
    }

    public void onCancel(DialogInterface dialoginterface)
    {
    }

    public void onClick(View view)
    {
        super.onClick(view);
        if (!e.equals(view)) goto _L2; else goto _L1
_L1:
        if (j.size() > 1)
        {
            com.d.b.a(getParent(), j, U);
        }
_L4:
        return;
_L2:
        if (f != view)
        {
            break; /* Loop/switch isn't completed */
        }
        if (l.size() > 1)
        {
            h.setVisibility(0);
            com.d.b.a(getParent(), l, V);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (view == n)
        {
            W = 1;
            showDialog(1);
            return;
        }
        if (view == T)
        {
            W = 2;
            showDialog(2);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f030053);
        bundle = Calendar.getInstance();
        X = bundle.get(1);
        Y = bundle.get(2);
        Z = bundle.get(5);
        aa = bundle.get(1);
        ab = bundle.get(2);
        ac = bundle.get(5);
        k = new ArrayList();
        j = new ArrayList();
        i = new ArrayList();
        k = (ArrayList)n.m.get("investor_acc_list");
        int j1 = k.size();
        int i1 = 0;
        do
        {
            if (i1 >= j1)
            {
                e = (RelativeLayout)findViewById(0x7f0b017e);
                g = (ImageView)findViewById(0x7f0b0181);
                g.setVisibility(8);
                if (j.size() > 1)
                {
                    g.setVisibility(0);
                }
                a = (TextView)findViewById(0x7f0b0180);
                b = (TextView)findViewById(0x7f0b017f);
                f = (RelativeLayout)findViewById(0x7f0b0182);
                c = (TextView)findViewById(0x7f0b0184);
                d = (TextView)findViewById(0x7f0b0183);
                h = (ImageView)findViewById(0x7f0b0185);
                ag = 0;
                e(0);
                a.setText((CharSequence)j.get(0));
                m = new ci(this, this);
                m.a(j);
                m.notifyDataSetChanged();
                f.setOnClickListener(this);
                e.setOnClickListener(this);
                n = (EditText)findViewById(0x7f0b0189);
                T = (EditText)findViewById(0x7f0b018c);
                n.setOnClickListener(this);
                T.setOnClickListener(this);
                return;
            }
            bundle = ((String)k.get(i1)).split(":#:");
            j.add(bundle[0]);
            i.add(bundle[1]);
            i1++;
        } while (true);
    }

    protected Dialog onCreateDialog(int i1)
    {
        switch (i1)
        {
        default:
            return null;

        case 1: // '\001'
            return new DatePickerDialog(getParent(), ah, X, Y, Z);

        case 2: // '\002'
            return new DatePickerDialog(getParent(), ah, aa, ab, ac);
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
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
        n.am.a("Send", true);
        super.onResume();
        if (n.v == null)
        {
            n.v = new g(this);
        }
        n.v.a(this);
    }
}
