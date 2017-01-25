// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.app.Dialog;
import android.content.res.Resources;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b.a.a.d;
import com.bca.mobile.bn;
import com.bca.mobile.n;
import com.f.a;
import com.utilities.e;
import com.utilities.r;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Transfer_Service, dt, du, g

public class M_Transfer_TA_Rekening extends M_Transfer_Service
{

    String T;
    ArrayList U;
    int V;
    int W;
    RelativeLayout X;
    TextView Y;
    LinearLayout Z;
    private List aA;
    private String aB;
    private String aC;
    private String aD;
    private com.c.a aE;
    TextView aa;
    RelativeLayout ab;
    String ac;
    ArrayList ad;
    int ae;
    TextView af;
    RelativeLayout ag;
    String ah;
    String ai;
    ArrayList aj;
    TextView ak;
    TextView al;
    RelativeLayout am;
    String an;
    String ao;
    String ap;
    String aq;
    String ar;
    String as;
    String at;
    String au;
    String av;
    String aw;
    String ax;
    private int ay;
    private Boolean az;
    boolean b;
    TextView c;
    TextView d;
    RelativeLayout e;
    String f;
    ArrayList g;
    TextView h;
    TextView i;
    RelativeLayout j;
    String k;
    String l;
    ArrayList m;
    int n;

    public M_Transfer_TA_Rekening()
    {
        b = true;
        ay = 0;
        f = "Dari Rekening:";
        k = "Ke Rekening:";
        l = "Ke Rekening Sendiri:";
        T = "Pilih Daftar Transfer:";
        U = null;
        ac = "Mata Uang:";
        ah = "Jumlah Uang";
        ai = "Jumlah Uang:";
        an = "Berita:";
        az = Boolean.valueOf(false);
        aA = null;
        aB = null;
        aC = null;
        aD = null;
        aE = null;
    }

    static com.c.a a(M_Transfer_TA_Rekening m_transfer_ta_rekening)
    {
        return m_transfer_ta_rekening.aE;
    }

    static void a(M_Transfer_TA_Rekening m_transfer_ta_rekening, com.c.a a1)
    {
        m_transfer_ta_rekening.aE = a1;
    }

    static void a(M_Transfer_TA_Rekening m_transfer_ta_rekening, Boolean boolean1)
    {
        m_transfer_ta_rekening.az = boolean1;
    }

    static void a(M_Transfer_TA_Rekening m_transfer_ta_rekening, String s)
    {
        m_transfer_ta_rekening.aB = s;
    }

    static void a(M_Transfer_TA_Rekening m_transfer_ta_rekening, List list)
    {
        m_transfer_ta_rekening.aA = list;
    }

    static List b(M_Transfer_TA_Rekening m_transfer_ta_rekening)
    {
        return m_transfer_ta_rekening.aA;
    }

    static void b(M_Transfer_TA_Rekening m_transfer_ta_rekening, String s)
    {
        m_transfer_ta_rekening.aD = s;
    }

    static String c(M_Transfer_TA_Rekening m_transfer_ta_rekening)
    {
        return m_transfer_ta_rekening.aB;
    }

    static void c(M_Transfer_TA_Rekening m_transfer_ta_rekening, String s)
    {
        m_transfer_ta_rekening.l(s);
    }

    static Boolean d(M_Transfer_TA_Rekening m_transfer_ta_rekening)
    {
        return m_transfer_ta_rekening.az;
    }

    static void d(M_Transfer_TA_Rekening m_transfer_ta_rekening, String s)
    {
        m_transfer_ta_rekening.k(s);
    }

    static String e(M_Transfer_TA_Rekening m_transfer_ta_rekening)
    {
        return m_transfer_ta_rekening.aD;
    }

    static int f(M_Transfer_TA_Rekening m_transfer_ta_rekening)
    {
        return m_transfer_ta_rekening.ay;
    }

    static EditText g(M_Transfer_TA_Rekening m_transfer_ta_rekening)
    {
        return m_transfer_ta_rekening.L;
    }

    private void j(String s)
    {
        ao = s;
        d.setText(s);
    }

    private void k(String s)
    {
        as = s;
        af.setText(as);
    }

    private void l(String s)
    {
        av = s;
        al.setText(av);
    }

    private boolean m()
    {
        return m != null || U == null || U.size() >= 2 && m.size() >= 2;
    }

    private boolean n()
    {
        boolean flag;
label0:
        {
            boolean flag1 = true;
            flag = flag1;
            if ("- PILIH -".equals(i.getText()))
            {
                break label0;
            }
            if (m != null)
            {
                flag = flag1;
                if (m.size() > 1)
                {
                    break label0;
                }
            }
            if (U != null)
            {
                flag = flag1;
                if (U.size() > 1)
                {
                    break label0;
                }
            }
            flag = false;
        }
        return flag;
    }

    private void o()
    {
        if (n())
        {
            findViewById(0x7f0b01ce).setVisibility(0);
            return;
        } else
        {
            findViewById(0x7f0b01ce).setVisibility(8);
            return;
        }
    }

    private void p()
    {
        ar = (String)ad.get(ae);
        aa.setText(ar);
    }

    private void q()
    {
        if (b)
        {
            ap = (String)m.get(W);
            aq = "";
            i.setText(ap);
            return;
        } else
        {
            String s = (String)U.get(W);
            ap = s.split(" - ")[0];
            i.setText(s);
            return;
        }
    }

    protected final void a()
    {
        String s = "";
        boolean flag;
        if ("- PILIH -".equals(ao))
        {
            s = getString(0x7f0c009c);
        } else
        if ("- PILIH -".equals(i.getText()))
        {
            s = getString(0x7f0c009d);
        } else
        if (as.equals(""))
        {
            s = getString(0x7f0c0086);
        } else
        if (ap.equals(ao))
        {
            s = getString(0x7f0c0084);
        }
        if (s.length() != 0)
        {
            bn.a(s, getParent());
            flag = false;
        } else
        {
            flag = true;
        }
        if (flag)
        {
            E = 1;
            aw = "0";
            g(a(new String[] {
                "PGI", "TAR2", "", ao, ap, "", ar, as, av, aw, 
                "2"
            }));
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

    public final void a(int i1, String as1[])
    {
        a(((Runnable) (new dt(this, as1))));
    }

    protected final void a(String s)
    {
        String s2 = (new StringBuilder(String.valueOf(s))).append(":-:").append(ax).toString();
        String s3;
        String s4;
        String s5;
        String s6;
        String s7;
        String s8;
        String s9;
        String s10;
        E = 2;
        s3 = ao;
        s4 = ap;
        s5 = aq;
        s6 = ar;
        s7 = as;
        s8 = at;
        s9 = au;
        s10 = av;
        if (aC != null)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        String s1 = "";
_L1:
        try
        {
            s1 = a(new String[] {
                "PGI", "TAR2", s3, s4, s5, s6, s7, s8, s9, s10, 
                s1, "#MPIN#", ax
            }).replace("#MPIN#", n.af.a(s2));
            getParent();
            a(s, s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        s1 = aC;
          goto _L1
    }

    public final void a(String s, boolean flag, boolean flag1)
    {
        a(((Runnable) (new du(this, s))));
    }

    protected final void b()
    {
    }

    public final void b(String s)
    {
        aC = L.getText().toString();
    }

    public final void c()
    {
    }

    protected final void d()
    {
        String as1[];
        String as2[];
        int i1;
        int j1;
        as1 = (String[])n.m.get("data");
        as2 = r.a(as1[1], ":@:");
        j1 = as2.length;
        g = new ArrayList();
        m = new ArrayList();
        i1 = 0;
_L11:
        if (i1 < j1 - 1) goto _L2; else goto _L1
_L1:
        if (as1[2].equals("")) goto _L4; else goto _L3
_L3:
        as2 = r.a(as1[2], ":@:");
        j1 = as2.length - 1;
        n = Integer.parseInt(as2[j1]);
        i1 = 0;
_L12:
        if (i1 < j1) goto _L6; else goto _L5
_L5:
        if (as1[3].equals("")) goto _L8; else goto _L7
_L7:
        U = new ArrayList();
        as2 = as1[3].split(":@:");
        j1 = as2.length - 1;
        V = Integer.parseInt(as2[j1]);
        i1 = 0;
_L13:
        if (i1 < j1) goto _L10; else goto _L9
_L9:
        b = false;
_L14:
        as1 = as1[4].split(":@:");
        j1 = as1.length - 1;
        ae = Integer.parseInt(as1[j1]);
        ad = new ArrayList();
        aj = new ArrayList();
        i1 = 0;
_L15:
        if (i1 >= j1)
        {
            return;
        }
        break MISSING_BLOCK_LABEL_295;
_L2:
        g.add(as2[i1]);
        i1++;
          goto _L11
_L6:
        m.add(as2[i1]);
        i1++;
          goto _L12
_L4:
        b = false;
          goto _L5
_L10:
        U.add(as2[i1]);
        i1++;
          goto _L13
_L8:
        b = true;
          goto _L14
        String as3[] = as1[i1].split(":#:");
        ad.add(as3[0]);
        aj.add(new Integer(as3[1]));
        i1++;
          goto _L15
    }

    protected final void e()
    {
        View aview[] = j();
        View aview1[] = k();
        View aview2[] = new View[6];
        TextView textview = (TextView)findViewById(0x7f0b01d3);
        TextView textview1 = (TextView)findViewById(0x7f0b01d6);
        Object obj = (RelativeLayout)findViewById(0x7f0b01d2);
        RelativeLayout relativelayout = (RelativeLayout)findViewById(0x7f0b01d5);
        LinearLayout linearlayout = (LinearLayout)findViewById(0x7f0b01d1);
        ((RelativeLayout) (obj)).setOnClickListener(this);
        relativelayout.setOnClickListener(this);
        aview2[0] = textview;
        aview2[2] = textview1;
        aview2[3] = ((View) (obj));
        aview2[4] = relativelayout;
        aview2[5] = linearlayout;
        View aview3[] = l();
        View aview4[] = new View[2];
        obj = (TextView)findViewById(0x7f0b01d0);
        relativelayout = (RelativeLayout)findViewById(0x7f0b01cf);
        aview4[0] = ((View) (obj));
        aview4[1] = relativelayout;
        c = (TextView)aview[0];
        d = (TextView)aview[1];
        e = (RelativeLayout)aview[2];
        h = (TextView)aview1[0];
        i = (TextView)aview1[1];
        j = (RelativeLayout)aview1[2];
        X = (RelativeLayout)aview4[1];
        Y = (TextView)aview4[0];
        aa = (TextView)aview2[0];
        af = (TextView)aview2[2];
        ab = (RelativeLayout)aview2[3];
        ag = (RelativeLayout)aview2[4];
        Z = (LinearLayout)aview2[5];
        ak = (TextView)aview3[0];
        al = (TextView)aview3[1];
        am = (RelativeLayout)aview3[2];
        c.setText(f);
        int i1;
        boolean flag;
        if (g.size() > 1)
        {
            j("- PILIH -");
        } else
        {
            j((String)g.get(0));
        }
        e.setVisibility(0);
        h.setText(k);
        if (b)
        {
            i1 = n;
        } else
        {
            i1 = V;
        }
        W = i1;
        if (m())
        {
            ap = "- PILIH -";
            i.setText("- PILIH -");
        } else
        {
            q();
        }
        j.setVisibility(0);
        Y.setText(ah);
        X.setVisibility(0);
        p();
        ab.setVisibility(0);
        k("");
        ag.setVisibility(0);
        Z.setVisibility(0);
        ak.setText(an);
        l("");
        am.setVisibility(0);
        if (g == null || g.size() < 2)
        {
            findViewById(0x7f0b0121).setVisibility(8);
        }
        if (m())
        {
            flag = false;
        } else
        {
            flag = true;
        }
        a = flag;
        o();
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        q();
    }

    public void onClick(View view)
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put(g.c, "m-Transfer");
        if (n.y != null)
        {
            n.y.d();
        }
        if (view.equals(e))
        {
            if (g.size() > 1)
            {
                ay = 0;
                hashtable.put(g.p, g);
                hashtable.put(g.b, new Boolean(true));
                if (B != null)
                {
                    B.cancel();
                    B = null;
                }
                B = new g(getParent(), hashtable, this, this);
                B.show();
            }
            return;
        }
        if (view.equals(j) && n())
        {
            ay = 1;
            hashtable.put(g.j, "Rekening Sendiri");
            hashtable.put(g.k, getResources().getDrawable(0x7f020076));
            hashtable.put(g.l, getResources().getDrawable(0x7f020075));
            hashtable.put(g.m, "Daftar Transfer");
            hashtable.put(com.bca.mobile.transaction.g.n, getResources().getDrawable(0x7f020076));
            hashtable.put(g.o, getResources().getDrawable(0x7f020075));
            if (U == null)
            {
                hashtable.put(com.bca.mobile.transaction.g.r, new Boolean(true));
                hashtable.put(g.s, new Boolean(false));
                hashtable.put(g.p, m);
                hashtable.put(g.q, new ArrayList());
            } else
            if (m == null || m.size() < 2)
            {
                hashtable.put(com.bca.mobile.transaction.g.r, new Boolean(false));
                hashtable.put(g.s, new Boolean(true));
                hashtable.put(g.p, new ArrayList());
                hashtable.put(g.q, U);
            } else
            {
                hashtable.put(g.p, m);
                hashtable.put(g.q, U);
            }
            hashtable.put(g.b, new Boolean(b));
            if (B != null)
            {
                B.cancel();
                B = null;
            }
            B = new g(getParent(), hashtable, this, this);
            B.show();
            return;
        }
        if (view.equals(am))
        {
            ay = 3;
            hashtable.put(g.b, new Boolean(true));
            hashtable.put(g.B, new Boolean(true));
            hashtable.put(g.t, an);
            hashtable.put(g.A, av);
            hashtable.put(g.b, new Boolean(true));
            if (B != null)
            {
                B.cancel();
                B = null;
            }
            B = new g(getParent(), hashtable, this, this);
            B.show();
            return;
        }
        if (view.equals(ab) && ad.size() > 1)
        {
            ay = 2;
            hashtable.put(g.p, ad);
            hashtable.put(g.b, new Boolean(true));
            if (B != null)
            {
                B.cancel();
                B = null;
            }
            B = new g(getParent(), hashtable, this, this);
            B.show();
            return;
        }
        if (view.equals(ag))
        {
            ay = 4;
            hashtable.put(g.A, as);
            hashtable.put(g.t, ai);
            hashtable.put(g.x, new Integer(((Integer)aj.get(ae)).intValue()));
            hashtable.put(g.y, new Integer(0));
            hashtable.put(g.v, new Integer(0));
            hashtable.put(g.w, new Integer(0));
            hashtable.put(g.b, new Boolean(true));
            hashtable.put(com.bca.mobile.transaction.g.d, ar);
            hashtable.put(g.f, getString(0x7f0c0086));
            hashtable.put(g.i, getString(0x7f0c0087));
            hashtable.put(com.bca.mobile.transaction.g.e, "TRSFAR");
            (new g(getParent(), hashtable, this, this)).show();
            return;
        } else
        {
            super.onClick(view);
            return;
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        if (az.booleanValue()) goto _L2; else goto _L1
_L1:
        ay;
        JVM INSTR tableswitch 0 2: default 40
    //                   0 41
    //                   1 57
    //                   2 132;
           goto _L3 _L4 _L5 _L6
_L3:
        return;
_L4:
        j((String)g.get(i1));
        return;
_L5:
        W = i1;
        boolean flag;
        if (l1 == 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        q();
        o();
        adapterview = i.getText().toString();
        if (adapterview.contains("NEW! "))
        {
            i.setText(adapterview.replace("NEW! ", ""));
            return;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (ae != i1)
        {
            ae = i1;
            p();
            k("");
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (az.booleanValue() && aA.size() > 0)
        {
            L.setText((CharSequence)aA.get(i1));
            return;
        }
        if (true) goto _L3; else goto _L7
_L7:
    }

    public void onResultButtonCancel(View view)
    {
    }

    public void onResultButtonOK(View view)
    {
        if (E == 1)
        {
            if (az.booleanValue())
            {
                view = aC;
                if (view == null || view.equals(""))
                {
                    view = "m-Transfer ke rekening valuta asing wajib memilih tujuan transaksi.\nSilakan pilih tujuan transaksi terlebih dahulu.";
                } else
                if (!aA.contains(view))
                {
                    view = "m-Transfer ke rekening valuta asing wajib memilih tujuan transaksi.\nSilakan pilih tujuan transaksi terlebih dahulu.";
                } else
                {
                    view = null;
                }
                if (view != null && view != "")
                {
                    a(null, view, getParent(), false, "Back");
                    view = Boolean.valueOf(false);
                } else
                {
                    view = Boolean.valueOf(true);
                }
                if (!view.booleanValue())
                {
                    E = 3;
                    return;
                }
            }
            f();
            return;
        }
        if (E == 3)
        {
            E = 1;
            a("m-Transfer", aD.replace(":@:", "\n"), getParent(), "Ok", "Cancel", az.booleanValue(), (ArrayList)aA);
            return;
        } else
        {
            E = 0;
            return;
        }
    }
}
