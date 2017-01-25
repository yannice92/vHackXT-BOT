// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile.transaction:
//            cj, ck, cm

public class M_Info_Mutasi_Rekening extends ShareActivity
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener, c
{

    private int T;
    private int U;
    private int V;
    private int W;
    private int X;
    private int Y;
    private android.app.DatePickerDialog.OnDateSetListener Z;
    TextView a;
    TextView b;
    ListView c;
    RelativeLayout d;
    cm e;
    String f[];
    String g[];
    AlertDialog h;
    EditText i;
    EditText j;
    String k;
    private int l;
    private int m;
    private int n;

    public M_Info_Mutasi_Rekening()
    {
        l = -1;
        X = 7;
        Y = 31;
        Z = new cj(this);
    }

    static int a(M_Info_Mutasi_Rekening m_info_mutasi_rekening)
    {
        return m_info_mutasi_rekening.l;
    }

    static void a(M_Info_Mutasi_Rekening m_info_mutasi_rekening, int i1)
    {
        m_info_mutasi_rekening.m = i1;
    }

    static int b(M_Info_Mutasi_Rekening m_info_mutasi_rekening)
    {
        return m_info_mutasi_rekening.n;
    }

    static void b(M_Info_Mutasi_Rekening m_info_mutasi_rekening, int i1)
    {
        m_info_mutasi_rekening.n = i1;
    }

    static int c(M_Info_Mutasi_Rekening m_info_mutasi_rekening)
    {
        return m_info_mutasi_rekening.T;
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
        if ((((Date) (obj1)).getTime() - s.getTime()) / 0x5265c00L > (long)Y)
        {
            return getString(0x7f0c00a7).replace("#MINDATE#", (new StringBuilder(String.valueOf(Y))).toString());
        }
        if (l1 > (long)X)
        {
            return getString(0x7f0c00a8).replace("#RANGE#", (new StringBuilder(String.valueOf(X))).toString());
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

    static void c(M_Info_Mutasi_Rekening m_info_mutasi_rekening, int i1)
    {
        m_info_mutasi_rekening.T = i1;
    }

    static int d(M_Info_Mutasi_Rekening m_info_mutasi_rekening)
    {
        return m_info_mutasi_rekening.m;
    }

    static void d(M_Info_Mutasi_Rekening m_info_mutasi_rekening, int i1)
    {
        m_info_mutasi_rekening.U = i1;
    }

    static int e(M_Info_Mutasi_Rekening m_info_mutasi_rekening)
    {
        return m_info_mutasi_rekening.V;
    }

    static void e(M_Info_Mutasi_Rekening m_info_mutasi_rekening, int i1)
    {
        m_info_mutasi_rekening.V = i1;
    }

    static int f(M_Info_Mutasi_Rekening m_info_mutasi_rekening)
    {
        return m_info_mutasi_rekening.W;
    }

    static void f(M_Info_Mutasi_Rekening m_info_mutasi_rekening, int i1)
    {
        m_info_mutasi_rekening.W = i1;
    }

    static int g(M_Info_Mutasi_Rekening m_info_mutasi_rekening)
    {
        return m_info_mutasi_rekening.U;
    }

    protected final void a()
    {
        if (i.getText().toString().equals(""))
        {
            bn.a("Tanggal awal harus diisi.", getParent());
            return;
        }
        if (j.getText().toString().equals(""))
        {
            bn.a("Tanggal akhir harus diisi.", getParent());
            return;
        }
        String s = c(i.getText().toString().replaceAll(" - ", "/"), j.getText().toString().replaceAll(" - ", "/"));
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
        super.a(new ck(this, as));
    }

    protected final void a(String s)
    {
        try
        {
            String s1 = (new StringBuilder("PGI:!:IMR2:!:")).append(n.af.a((new StringBuilder(String.valueOf(s))).append(":-:").append(n.ak[13]).toString())).append(":!:").append(a.getText().toString()).append(":!:").append(i.getText().toString().replaceAll(" - ", "")).append(":!:").append(j.getText().toString().replaceAll(" - ", "")).toString();
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
        super.onClick(view);
        if (d == view)
        {
            view = (ListView)LayoutInflater.from(getParent()).inflate(0x7f030042, null).findViewById(0x7f0b0107);
            view.setAdapter(e);
            view.setOnItemClickListener(this);
            h = (new android.app.AlertDialog.Builder(getParent())).create();
            h.setView(view);
            h.show();
        } else
        {
            if (view == i)
            {
                l = 1;
                showDialog(1);
                return;
            }
            if (view == j)
            {
                l = 2;
                showDialog(2);
                return;
            }
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f030054);
        bundle = Calendar.getInstance();
        m = bundle.get(1);
        n = bundle.get(2);
        T = bundle.get(5);
        U = bundle.get(1);
        V = bundle.get(2);
        W = bundle.get(5);
        g = (String[])n.m.get("nomor_rek");
        int i1 = g.length;
        f = new String[i1];
        System.arraycopy(g, 0, f, 0, i1);
        d = (RelativeLayout)findViewById(0x7f0b018f);
        if (f.length > 1)
        {
            d.setOnClickListener(this);
        } else
        {
            ((ImageView)findViewById(0x7f0b011c)).setVisibility(8);
        }
        a = (TextView)findViewById(0x7f0b0191);
        b = (TextView)findViewById(0x7f0b0190);
        c = (ListView)findViewById(0x7f0b0198);
        i = (EditText)findViewById(0x7f0b0195);
        j = (EditText)findViewById(0x7f0b0197);
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        k = f[0];
        a.setText(k);
        e = new cm(this, this);
        e.a(f);
        c.setAdapter(e);
        e.notifyDataSetChanged();
        c.invalidate();
        c.setOnItemClickListener(this);
    }

    protected Dialog onCreateDialog(int i1)
    {
        switch (i1)
        {
        default:
            return null;

        case 1: // '\001'
            return new DatePickerDialog(getParent(), Z, m, n, T);

        case 2: // '\002'
            return new DatePickerDialog(getParent(), Z, U, V, W);
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        adapterview = (String)e.getItem(i1);
        k = f[i1];
        a.setText(adapterview);
        h.dismiss();
        e.notifyDataSetChanged();
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
