// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b.a.a.d;
import com.bca.mobile.n;
import com.f.a;
import com.utilities.e;
import java.util.ArrayList;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Transfer_Service, dr, ds, g

public class M_Transfer_TA_Bank extends M_Transfer_Service
{

    TextView T;
    RelativeLayout U;
    String V;
    int W;
    TextView X;
    TextView Y;
    RelativeLayout Z;
    String aa;
    ArrayList ab;
    String ac;
    String ad;
    String ae;
    String af;
    String ag;
    String ah;
    String ai;
    String aj;
    private int ak;
    TextView b;
    TextView c;
    RelativeLayout d;
    String e;
    ArrayList f;
    int g;
    TextView h;
    TextView i;
    RelativeLayout j;
    String k;
    ArrayList l;
    ArrayList m;
    TextView n;

    public M_Transfer_TA_Bank()
    {
        e = "Bank:";
        g = 0;
        k = "Ke Rekening Tujuan:";
        V = "Jumlah Uang:";
        W = 0;
        aa = "Dari Rekening:";
        ac = "";
        ad = "";
        ae = "";
        af = "";
        ag = "";
        ah = "";
        ai = "";
        aj = "";
    }

    static void a(M_Transfer_TA_Bank m_transfer_ta_bank, String s)
    {
        m_transfer_ta_bank.j(s);
    }

    private void j(String s)
    {
        ah = s;
        T.setText(ah);
    }

    private void k(String s)
    {
        c.setText(s);
    }

    private void l(String s)
    {
        ag = s;
        Y.setText(s);
    }

    private void m()
    {
        i.setText("- PILIH -");
    }

    private void n()
    {
        if (o())
        {
            ((ImageView)findViewById(0x7f0b01ce)).setVisibility(0);
            return;
        } else
        {
            ((ImageView)findViewById(0x7f0b01ce)).setVisibility(8);
            return;
        }
    }

    private boolean o()
    {
        int i1 = ((ArrayList)l.get(g)).size();
        return !"- PILIH -".equals(c.getText()) && (i1 > 1 || i1 == 1 && "- PILIH -".equals(i.getText()));
    }

    protected final void a()
    {
        String s = "";
        boolean flag;
        if ("- PILIH -".equals(c.getText()))
        {
            s = getString(0x7f0c009e);
        } else
        if ("- PILIH -".equals(i.getText()))
        {
            s = getString(0x7f0c009d);
        } else
        if (ah.equals(""))
        {
            s = getString(0x7f0c0086);
        } else
        if ("- PILIH -".equals(Y.getText()))
        {
            s = getString(0x7f0c009c);
        }
        if (s.length() != 0)
        {
            a("m-Transfer", s, getParent(), false, "Back");
            flag = false;
        } else
        {
            flag = true;
        }
        if (flag)
        {
            E = 1;
            g(a(new String[] {
                "PGI", "TAB", "", c.getText().toString(), "", i.getText().toString(), ah, "", ag, "1", 
                "1"
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

    public final void a(int i1, String as[])
    {
        a(((Runnable) (new dr(this, as))));
    }

    protected final void a(String s)
    {
        String s1 = (new StringBuilder(String.valueOf(s))).append(":-:").append(aj).toString();
        String as[];
        E = 2;
        as = c.getText().toString().split(" - ");
        String s2 = as[0];
        String s3 = as[1];
        try
        {
            String as1[] = i.getText().toString().split(" - ");
            s1 = a(new String[] {
                "PGI", "TAB", s2, s3, as1[0], as1[1], ag, ai, aj, "#MPIN#"
            }).replace("#MPIN#", n.af.a(s1));
            getParent();
            a(s, s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        return;
    }

    public final void a(String s, boolean flag, boolean flag1)
    {
        a(((Runnable) (new ds(this, s))));
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
        String as[];
        String as1[];
        int i1;
        int j1;
        boolean flag;
        flag = false;
        as = (String[])n.m.get("data");
        f = new ArrayList();
        as1 = as[1].split(":@:");
        j1 = as1.length - 1;
        g = Integer.parseInt(as1[j1]);
        i1 = 0;
_L5:
        if (i1 < j1) goto _L2; else goto _L1
_L1:
        int k1;
        l = new ArrayList();
        m = new ArrayList();
        as1 = as[2].split(":@:");
        k1 = as1.length;
        i1 = 0;
_L6:
        if (i1 < k1) goto _L4; else goto _L3
_L3:
        ab = new ArrayList();
        as1 = as[3].split(":@:");
        j1 = as1.length;
        i1 = ((flag) ? 1 : 0);
_L8:
        if (i1 >= j1 - 1)
        {
            W = Integer.parseInt(as[4]);
            return;
        }
        break MISSING_BLOCK_LABEL_278;
_L2:
        f.add(as1[i1]);
        i1++;
          goto _L5
_L4:
        ArrayList arraylist;
        String as2[];
        int l1;
        String s = as1[i1];
        arraylist = new ArrayList();
        as2 = s.split(":#:");
        l1 = as2.length - 1;
        m.add(new Integer(as2[l1]));
        j1 = 0;
_L7:
label0:
        {
            if (j1 < l1)
            {
                break label0;
            }
            l.add(arraylist);
            i1++;
        }
          goto _L6
        arraylist.add(as2[j1]);
        j1++;
          goto _L7
        ab.add(as1[i1]);
        i1++;
          goto _L8
    }

    protected final void e()
    {
        View aview[] = j();
        View aview1[] = k();
        View aview2[] = new View[3];
        TextView textview = (TextView)findViewById(0x7f0b01d9);
        TextView textview1 = (TextView)findViewById(0x7f0b01da);
        RelativeLayout relativelayout = (RelativeLayout)findViewById(0x7f0b01d8);
        relativelayout.setOnClickListener(this);
        aview2[0] = textview;
        aview2[1] = textview1;
        aview2[2] = relativelayout;
        View aview3[] = l();
        b = (TextView)aview[0];
        c = (TextView)aview[1];
        d = (RelativeLayout)aview[2];
        h = (TextView)aview1[0];
        i = (TextView)aview1[1];
        j = (RelativeLayout)aview1[2];
        n = (TextView)aview2[0];
        T = (TextView)aview2[1];
        U = (RelativeLayout)aview2[2];
        X = (TextView)aview3[0];
        Y = (TextView)aview3[1];
        Z = (RelativeLayout)aview3[2];
        b.setText(e);
        d.setVisibility(0);
        h.setText(k);
        m();
        j.setVisibility(0);
        n.setText(V);
        j("");
        U.setVisibility(0);
        X.setText(aa);
        Z.setVisibility(0);
        if (f.size() <= 1)
        {
            k((String)f.get(g));
            ((ImageView)findViewById(0x7f0b0121)).setVisibility(8);
        } else
        {
            k("- PILIH -");
            ((ImageView)findViewById(0x7f0b0121)).setVisibility(0);
        }
        if (ab.size() <= 1)
        {
            l((String)ab.get(0));
            ((ImageView)findViewById(0x7f0b01df)).setVisibility(8);
        } else
        {
            l("- PILIH -");
            ((ImageView)findViewById(0x7f0b01df)).setVisibility(0);
        }
        n();
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
    }

    public void onClick(View view)
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put(g.c, "m-Transfer");
        if (n.y != null)
        {
            n.y.d();
        }
        if (view.equals(d) && f.size() > 1)
        {
            ak = 0;
            hashtable.put(g.p, f);
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
        if (view.equals(j) && o())
        {
            ak = 1;
            hashtable.put(g.p, l.get(g));
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
        if (view.equals(Z) && ab.size() > 1)
        {
            ak = 2;
            hashtable.put(g.p, ab);
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
        if (view.equals(U))
        {
            hashtable.put(g.t, V);
            hashtable.put(g.A, ah);
            hashtable.put(g.x, Integer.valueOf(W));
            hashtable.put(g.y, Integer.valueOf(0));
            hashtable.put(g.v, Integer.valueOf(0));
            hashtable.put(g.w, Integer.valueOf(0));
            hashtable.put(g.b, new Boolean(true));
            hashtable.put(com.bca.mobile.transaction.g.d, "Rp");
            hashtable.put(g.f, getString(0x7f0c0086));
            hashtable.put(g.i, getString(0x7f0c0087));
            if (B != null)
            {
                B.cancel();
                B = null;
            }
            B = new g(getParent(), hashtable, this, this);
            B.show();
            return;
        } else
        {
            super.onClick(view);
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        switch (ak)
        {
        default:
            return;

        case 0: // '\0'
            if (g != i1 || c.getText().equals("- PILIH -"))
            {
                g = i1;
                k((String)f.get(i1));
                m();
            }
            n();
            return;

        case 1: // '\001'
            adapterview = (String)((ArrayList)l.get(g)).get(i1);
            i.setText(adapterview);
            n();
            return;

        case 2: // '\002'
            l((String)ab.get(i1));
            return;
        }
    }

    public void onResultButtonCancel(View view)
    {
    }

    public void onResultButtonOK(View view)
    {
        switch (E)
        {
        default:
            return;

        case 1: // '\001'
            f();
            break;
        }
        E = 0;
    }
}
