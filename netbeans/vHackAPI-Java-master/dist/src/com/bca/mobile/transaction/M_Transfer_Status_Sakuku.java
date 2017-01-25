// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b.a.a.d;
import com.bca.a.a;
import com.bca.a.f;
import com.bca.mobile.bn;
import com.bca.mobile.n;
import com.utilities.c;
import com.utilities.e;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Transfer_Service, do, g, dp, 
//            dq

public class M_Transfer_Status_Sakuku extends M_Transfer_Service
{

    private TextView T;
    private TextView U;
    private RelativeLayout V;
    private TextView W;
    private EditText X;
    private RelativeLayout Y;
    private TextView Z;
    private EditText aa;
    private int ab;
    private String ac;
    private boolean ad;
    private boolean ae;
    private String af;
    private String ag;
    private boolean ah;
    private boolean ai;
    private int aj;
    private int ak;
    private int al;
    private int am;
    private int an;
    private int ao;
    private int ap;
    private int aq;
    private int ar;
    private int as;
    private android.app.DatePickerDialog.OnDateSetListener at;
    ArrayList b;
    ArrayList c;
    ArrayList d;
    ArrayList e;
    private f f;
    private Hashtable g;
    private RelativeLayout h;
    private TextView i;
    private TextView j;
    private RelativeLayout k;
    private TextView l;
    private TextView m;
    private RelativeLayout n;

    public M_Transfer_Status_Sakuku()
    {
        ac = "";
        ad = true;
        ae = false;
        af = "";
        ag = "";
        ah = true;
        ai = false;
        aj = -1;
        aq = 7;
        ar = 31;
        as = 365;
        at = new do(this);
    }

    static int a(M_Transfer_Status_Sakuku m_transfer_status_sakuku)
    {
        return m_transfer_status_sakuku.aj;
    }

    static void a(M_Transfer_Status_Sakuku m_transfer_status_sakuku, int i1)
    {
        m_transfer_status_sakuku.ak = i1;
    }

    static int b(M_Transfer_Status_Sakuku m_transfer_status_sakuku)
    {
        return m_transfer_status_sakuku.al;
    }

    static void b(M_Transfer_Status_Sakuku m_transfer_status_sakuku, int i1)
    {
        m_transfer_status_sakuku.al = i1;
    }

    static int c(M_Transfer_Status_Sakuku m_transfer_status_sakuku)
    {
        return m_transfer_status_sakuku.am;
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
        long l1;
        s = ((SimpleDateFormat) (obj1)).parse(s);
        s1 = ((SimpleDateFormat) (obj1)).parse(s1);
        obj1 = ((SimpleDateFormat) (obj1)).parse(s2);
        l1 = (s1.getTime() - s.getTime()) / 0x5265c00L;
        ((Date) (obj1)).getTime();
        s.getTime();
        long l2 = (((Date) (obj1)).getTime() - s.getTime()) / 0x5265c00L;
        long l3 = (s1.getTime() - ((Date) (obj1)).getTime()) / 0x5265c00L;
        if (l2 > (long)as)
        {
            return getString(0x7f0c0093);
        }
        if (l3 > (long)as)
        {
            return getString(0x7f0c0093);
        }
        if (s1.compareTo(s) < 0)
        {
            return getString(0x7f0c0095);
        }
        s = ((String) (obj));
        if (l1 <= (long)aq)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        s = getString(0x7f0c0094).replace("#RANGE#", (new StringBuilder(String.valueOf(aq))).toString());
        return s;
        s;
        s.printStackTrace();
        s = getString(0x7f0c0097);
        return s;
    }

    static void c(M_Transfer_Status_Sakuku m_transfer_status_sakuku, int i1)
    {
        m_transfer_status_sakuku.am = i1;
    }

    static EditText d(M_Transfer_Status_Sakuku m_transfer_status_sakuku)
    {
        return m_transfer_status_sakuku.X;
    }

    static void d(M_Transfer_Status_Sakuku m_transfer_status_sakuku, int i1)
    {
        m_transfer_status_sakuku.an = i1;
    }

    static int e(M_Transfer_Status_Sakuku m_transfer_status_sakuku)
    {
        return m_transfer_status_sakuku.ak;
    }

    private void e(int i1)
    {
        String s = (String)b.get(i1);
        j.setText(s);
    }

    static void e(M_Transfer_Status_Sakuku m_transfer_status_sakuku, int i1)
    {
        m_transfer_status_sakuku.ao = i1;
    }

    static int f(M_Transfer_Status_Sakuku m_transfer_status_sakuku)
    {
        return m_transfer_status_sakuku.ao;
    }

    private void f(int i1)
    {
        String s = (String)c.get(i1);
        m.setText(s);
    }

    static void f(M_Transfer_Status_Sakuku m_transfer_status_sakuku, int i1)
    {
        m_transfer_status_sakuku.ap = i1;
    }

    static int g(M_Transfer_Status_Sakuku m_transfer_status_sakuku)
    {
        return m_transfer_status_sakuku.ap;
    }

    private void g(int i1)
    {
        String s = (String)d.get(i1);
        U.setText(s);
    }

    static EditText h(M_Transfer_Status_Sakuku m_transfer_status_sakuku)
    {
        return m_transfer_status_sakuku.aa;
    }

    private void h(int i1)
    {
        ((ImageView)findViewById(0x7f0b020d)).setVisibility(i1);
    }

    static int i(M_Transfer_Status_Sakuku m_transfer_status_sakuku)
    {
        return m_transfer_status_sakuku.an;
    }

    private void i(int i1)
    {
        ((ImageView)findViewById(0x7f0b0121)).setVisibility(i1);
    }

    static f j(M_Transfer_Status_Sakuku m_transfer_status_sakuku)
    {
        return m_transfer_status_sakuku.f;
    }

    private void j(int i1)
    {
        ((ImageView)findViewById(0x7f0b01ce)).setVisibility(i1);
    }

    static void k(M_Transfer_Status_Sakuku m_transfer_status_sakuku)
    {
        m_transfer_status_sakuku.o();
    }

    private void m()
    {
        g = new Hashtable();
        g.put(com.bca.mobile.transaction.g.c, "m-Transfer");
    }

    private void n()
    {
        if (B != null)
        {
            B.cancel();
            B = null;
        }
        B = new g(getParent(), g, this, this);
        B.show();
    }

    private void o()
    {
        do
        {
            f.c();
            a a1 = f.b();
            if (a1 == a.e)
            {
                a("m-Transfer", f.e(), getParent(), "Ok", "Cancel");
                return;
            }
            if (a1 == a.c)
            {
                if (f.d().equals("OFF"))
                {
                    m();
                    g.put(g.b, new Boolean(true));
                    g.put(g.B, new Boolean(true));
                    g.put(g.t, "Berita");
                    g.put(g.A, "");
                    g.put(g.b, new Boolean(true));
                    n();
                    return;
                }
            } else
            if (a1 == a.d)
            {
                f();
                return;
            } else
            {
                a("m-Transfer", com.utilities.c.c(f.g()[1]), getParent(), true, "Ok");
                return;
            }
        } while (true);
    }

    protected final void a()
    {
        String s = j.getText().toString().trim();
        String s2 = m.getText().toString().trim();
        String s3 = U.getText().toString().trim();
        String s4 = X.getText().toString().trim();
        String s5 = aa.getText().toString().trim();
        if (s.equals(""))
        {
            a("m-Transfer", getString(0x7f0c008e).replace("#LABEL#", (CharSequence)e.get(0)), getParent(), false, "Back");
        } else
        if (s2.equals(""))
        {
            a("m-Transfer", getString(0x7f0c008e).replace("#LABEL#", (CharSequence)e.get(1)), getParent(), false, "Back");
        } else
        if (s3.equals(""))
        {
            a("m-Transfer", getString(0x7f0c008e).replace("#LABEL#", (CharSequence)e.get(2)), getParent(), false, "Back");
        } else
        if (s4.equals(""))
        {
            a("m-Transfer", getString(0x7f0c0091), getParent(), false, "Back");
        } else
        if (s5.equals(""))
        {
            a("m-Transfer", getString(0x7f0c0092), getParent(), false, "Back");
        } else
        {
            String s1 = c(X.getText().toString().replaceAll(" - ", "/"), aa.getText().toString().replaceAll(" - ", "/"));
            if (!s1.equals(""))
            {
                bn.a(s1, getParent());
            } else
            {
                E = 1;
                g(a(new String[] {
                    "PGI", "TST", j.getText().toString(), m.getText().toString(), U.getText().toString(), X.getText().toString().replace("-", "").replace(" ", ""), aa.getText().toString().replace("-", "").replace(" ", ""), "2"
                }));
                f = null;
            }
        }
        ab = -1;
    }

    public final void a(int i1)
    {
    }

    public final void a(int i1, String as1[])
    {
        a(((Runnable) (new dp(this, as1))));
    }

    protected final void a(String s)
    {
        String s1 = (new StringBuilder(String.valueOf(s))).append(":-:").append(f.f()).toString();
        try
        {
            f.c(s1);
            s1 = f.i().replace("#MPIN#", n.af.a(s1));
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
        a(((Runnable) (new dq(this))));
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

    protected final void d()
    {
        Calendar calendar = Calendar.getInstance();
        ak = calendar.get(1);
        al = calendar.get(2);
        am = calendar.get(5);
        an = calendar.get(1);
        ao = calendar.get(2);
        ap = calendar.get(5);
        String as1[] = (String[])n.m.get("data");
        b = com.utilities.c.a(as1[1]);
        c = com.utilities.c.a(as1[2]);
        d = com.utilities.c.a(as1[3]);
        e = com.utilities.c.a(as1[4]);
    }

    protected final void e()
    {
        i = (TextView)findViewById(0x7f0b0212);
        j = (TextView)findViewById(0x7f0b0213);
        h = (RelativeLayout)findViewById(0x7f0b0211);
        h.setOnClickListener(this);
        i.setText((CharSequence)e.get(0));
        l = (TextView)findViewById(0x7f0b0215);
        m = (TextView)findViewById(0x7f0b0216);
        k = (RelativeLayout)findViewById(0x7f0b0214);
        k.setOnClickListener(this);
        l.setText((CharSequence)e.get(1));
        T = (TextView)findViewById(0x7f0b0218);
        U = (TextView)findViewById(0x7f0b0219);
        n = (RelativeLayout)findViewById(0x7f0b0217);
        n.setOnClickListener(this);
        T.setText((CharSequence)e.get(2));
        W = (TextView)findViewById(0x7f0b021b);
        X = (EditText)findViewById(0x7f0b021c);
        V = (RelativeLayout)findViewById(0x7f0b021a);
        X.setOnClickListener(this);
        W.setText((CharSequence)e.get(3));
        Z = (TextView)findViewById(0x7f0b021e);
        aa = (EditText)findViewById(0x7f0b021f);
        Y = (RelativeLayout)findViewById(0x7f0b021d);
        aa.setOnClickListener(this);
        Z.setText((CharSequence)e.get(4));
        if (b.size() > 1)
        {
            h(0);
        } else
        {
            h(8);
            h.setEnabled(false);
        }
        e(0);
        if (c.size() > 1)
        {
            i(0);
        } else
        {
            i(8);
            k.setEnabled(false);
        }
        f(0);
        if (d.size() > 1)
        {
            j(0);
        } else
        {
            j(8);
            n.setEnabled(false);
        }
        g(0);
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
    }

    public void onClick(View view)
    {
        m();
        if (n.y != null)
        {
            n.y.d();
        }
        if (view.equals(h))
        {
            if (b.size() != 0)
            {
                g.put(g.q, b);
                g.put(g.b, new Boolean(false));
            }
            n();
            ab = 1;
            return;
        }
        if (view.equals(k))
        {
            if (c.size() != 0)
            {
                g.put(g.q, c);
                g.put(g.b, new Boolean(false));
            }
            n();
            ab = 2;
            return;
        }
        if (view.equals(n))
        {
            if (d.size() != 0)
            {
                g.put(g.q, d);
                g.put(g.b, new Boolean(false));
            }
            n();
            ab = 3;
            return;
        }
        if (view.equals(X))
        {
            aj = 1;
            showDialog(1);
            ab = 4;
            return;
        }
        if (view.equals(aa))
        {
            aj = 2;
            showDialog(2);
            ab = 5;
            return;
        } else
        {
            super.onClick(view);
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f030061);
    }

    protected Dialog onCreateDialog(int i1)
    {
        switch (i1)
        {
        default:
            return null;

        case 1: // '\001'
            return new DatePickerDialog(getParent(), at, ak, al, am);

        case 2: // '\002'
            return new DatePickerDialog(getParent(), at, an, ao, ap);
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        if (ab == 1)
        {
            e(i1);
        } else
        {
            if (ab == 2)
            {
                f(i1);
                return;
            }
            if (ab == 3)
            {
                g(i1);
                return;
            }
        }
    }

    public void onResultButtonCancel(View view)
    {
    }

    public void onResultButtonOK(View view)
    {
        if (f != null && f.b() != a.a)
        {
            o();
        }
    }
}
