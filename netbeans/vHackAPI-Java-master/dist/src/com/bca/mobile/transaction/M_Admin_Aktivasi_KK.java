// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import b.a.a.d;
import com.bca.c.c;
import com.bca.c.g;
import com.bca.mobile.ShareActivity;
import com.bca.mobile.TabSample;
import com.bca.mobile.bn;
import com.bca.mobile.n;
import com.f.a;
import com.utilities.e;
import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// Referenced classes of package com.bca.mobile.transaction:
//            o, p, q

public class M_Admin_Aktivasi_KK extends ShareActivity
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener, c
{

    Handler a;
    String b;
    String c;
    AlertDialog d;
    EditText e;
    int f;
    EditText g;
    private int h;
    private int i;
    private int j;
    private int k;
    private android.app.DatePickerDialog.OnDateSetListener l;

    public M_Admin_Aktivasi_KK()
    {
        a = new o(this);
        f = 0;
        h = -1;
        l = new p(this);
    }

    static int a(M_Admin_Aktivasi_KK m_admin_aktivasi_kk)
    {
        return m_admin_aktivasi_kk.h;
    }

    static void a(M_Admin_Aktivasi_KK m_admin_aktivasi_kk, int i1)
    {
        m_admin_aktivasi_kk.i = i1;
    }

    static int b(M_Admin_Aktivasi_KK m_admin_aktivasi_kk)
    {
        return m_admin_aktivasi_kk.j;
    }

    static void b(M_Admin_Aktivasi_KK m_admin_aktivasi_kk, int i1)
    {
        m_admin_aktivasi_kk.j = i1;
    }

    static int c(M_Admin_Aktivasi_KK m_admin_aktivasi_kk)
    {
        return m_admin_aktivasi_kk.k;
    }

    static void c(M_Admin_Aktivasi_KK m_admin_aktivasi_kk, int i1)
    {
        m_admin_aktivasi_kk.k = i1;
    }

    static int d(M_Admin_Aktivasi_KK m_admin_aktivasi_kk)
    {
        return m_admin_aktivasi_kk.i;
    }

    private String j(String s)
    {
        Object obj = new Date();
        SimpleDateFormat simpledateformat = new SimpleDateFormat("dd/MM/yyyy");
        String s1 = simpledateformat.format(((Date) (obj)));
        obj = "";
        try
        {
            if (simpledateformat.parse(s).compareTo(simpledateformat.parse(s1)) > 0)
            {
                obj = getString(0x7f0c00c3);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return getString(0x7f0c00ab);
        }
        return ((String) (obj));
    }

    protected final void a()
    {
        String s = e.getText().toString();
        String s1 = g.getText().toString();
        if (e.getText().length() == 0)
        {
            f = 1;
            a(null, getString(0x7f0c0072), getParent(), false, "Back");
            return;
        }
        if (e.getText().length() < 16)
        {
            f = 2;
            a(null, getString(0x7f0c0073), getParent(), false, "Back");
            return;
        }
        if (g.getText().toString().equals(""))
        {
            bn.a(getString(0x7f0c0074), getParent());
            return;
        }
        String s2 = j(g.getText().toString().replaceAll(" - ", "/"));
        String s3 = getString(0x7f0c00bf);
        if (!s2.equals(""))
        {
            bn.a(s2, getParent());
            return;
        } else
        {
            a("m-Admin", s3.replaceAll("#cardnum#", (new StringBuilder()).append(s.subSequence(0, 4)).append(" ").append(s.subSequence(4, 8)).append(" ").append(s.subSequence(8, 12)).append(" ").append(s.subSequence(12, 16)).toString()).replaceAll("#tanggallahir#", s1), getParent());
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
        a(((Runnable) (new q(this, as))));
    }

    protected final void a(String s)
    {
        try
        {
            b = e.getText().toString();
            c = g.getText().toString().replaceAll(" - ", "");
            Object obj = (new SimpleDateFormat("ddMMyyyy")).parse(c);
            c = (new SimpleDateFormat("ddMMyy")).format(((Date) (obj)));
            System.out.println((new StringBuilder("FORMATDOBSEND")).append(c).toString());
            obj = (new StringBuilder("PGI:!:AAKK:!:")).append(b).append(":!:").append(c).append(":!:").append(n.af.a((new StringBuilder(String.valueOf(s))).append(":-:").append(n.ak[13]).toString())).toString();
            getParent();
            a(s, ((String) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
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
        if (view == g)
        {
            h = 1;
            showDialog(1);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f030045);
        if (n.am != null)
        {
            n.am.a("Send", true);
        }
        bundle = Calendar.getInstance();
        i = bundle.get(1);
        j = bundle.get(2);
        k = bundle.get(5);
        g = (EditText)findViewById(0x7f0b0117);
        g.setOnClickListener(this);
        e = (EditText)findViewById(0x7f0b0113);
        a(e, 0);
        e.setFilters(new InputFilter[] {
            new android.text.InputFilter.LengthFilter(16)
        });
    }

    protected Dialog onCreateDialog(int i1)
    {
        switch (i1)
        {
        default:
            return null;

        case 1: // '\001'
            return new DatePickerDialog(getParent(), l, i, j, k);
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        d.dismiss();
    }

    public void onResultButtonCancel(View view)
    {
    }

    public void onResultButtonOK(View view)
    {
        if (E != 1) goto _L2; else goto _L1
_L1:
        f();
_L4:
        E = 0;
        f = 0;
        return;
_L2:
        if (f != 1 && f != 2)
        {
            finish();
        }
        if (true) goto _L4; else goto _L3
_L3:
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
