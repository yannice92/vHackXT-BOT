// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.app.Dialog;
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
import com.bca.mobile.n;
import com.f.a;
import com.utilities.e;
import java.util.ArrayList;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile.transaction:
//            i, bf, be, g

public class M_Commerce_Voucher extends ShareActivity
    implements android.widget.AdapterView.OnItemClickListener, c, i
{

    ImageView T;
    TextView U;
    TextView V;
    RelativeLayout W;
    String X;
    String Y[][];
    int Z[];
    TextView a;
    int aa;
    ImageView ab;
    TextView ac;
    TextView ad;
    RelativeLayout ae;
    String af;
    String ag[];
    int ah;
    String ai;
    String aj;
    String ak;
    String al;
    String am;
    String an;
    private int ao;
    private final int ap = 1;
    private final int aq = 2;
    private int ar;
    private String as;
    private int at;
    TextView b;
    ImageView c;
    RelativeLayout d;
    String e;
    String f[];
    String g[];
    int h;
    TextView i;
    TextView j;
    RelativeLayout k;
    String l;
    int m[];
    int n[];

    public M_Commerce_Voucher()
    {
        ao = 0;
        at = 0;
        e = "Jenis Voucher:";
        l = "No. Handphone:";
        X = "Nominal Voucher:";
        af = "Dari Rekening:";
        ai = "";
        aj = "";
        ak = "";
        al = "";
        am = "";
        an = "";
    }

    static int a(M_Commerce_Voucher m_commerce_voucher)
    {
        return m_commerce_voucher.ao;
    }

    private static ArrayList a(String as1[])
    {
        ArrayList arraylist = new ArrayList();
        int j1 = as1.length;
        int i1 = 0;
        do
        {
            if (i1 >= j1)
            {
                return arraylist;
            }
            arraylist.add(as1[i1]);
            i1++;
        } while (true);
    }

    private void d()
    {
        ak = ag[ah];
        ad.setText(ak);
    }

    private void e()
    {
        aj = f[h];
        am = g[h];
        b.setText(aj);
    }

    private void j()
    {
        al = Y[h][aa];
        V.setText(al);
    }

    private void j(String s)
    {
        ai = s;
        j.setText(ai);
    }

    private void k()
    {
        if (a != null)
        {
            a.setOnClickListener(new bf(this));
        }
    }

    private void l()
    {
        aa = Z[h];
        j();
        if (Y[h].length == 1)
        {
            T.setVisibility(8);
            return;
        } else
        {
            T.setVisibility(0);
            return;
        }
    }

    protected final void a()
    {
        if (ai.equals(""))
        {
            a(null, getString(0x7f0c0080).replace("#LABEL#", l.replace(":", "")), getParent(), false, "Back");
            return;
        }
        String as1[] = new String[11];
        as1[0] = "PGI";
        as1[1] = "CVH";
        as1[2] = aj;
        as1[4] = ai;
        as1[5] = al;
        as1[7] = ak;
        as1[9] = am;
        as1[10] = "2";
        String s = "";
        int j1 = as1.length;
        int i1 = 0;
        do
        {
            if (i1 >= j1)
            {
                s = s.substring(0, s.length() - 3);
                ao = 1;
                g(s);
                return;
            }
            String s1 = as1[i1];
            if (s1 != null)
            {
                s = (new StringBuilder(String.valueOf(s))).append(s1).append(":!:").toString();
            } else
            {
                s = (new StringBuilder(String.valueOf(s))).append(":!:").toString();
            }
            i1++;
        } while (true);
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
        a(((Runnable) (new be(this, as1))));
    }

    protected final void a(String s)
    {
        try
        {
            String s1 = (new StringBuilder("PGI:!:CVH:!:")).append(aj).append(":!:").append(ak).append(":!:").append(al).append(":!:").append(am).append(":!:").append(an).append(":!:").append(n.af.a((new StringBuilder(String.valueOf(s))).append(":-:").append(an).toString())).toString();
            ao = 2;
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

    public final void a(String s, String s1, boolean flag)
    {
        E = 1;
        a(s, s1, getParent(), flag, 16);
    }

    public final void a(String s, boolean flag, boolean flag1)
    {
        j(s);
    }

    protected final void b()
    {
    }

    public final void b(String s)
    {
        if (E == 1)
        {
            al = s;
        }
    }

    public final void c()
    {
        if (E == 1)
        {
            k();
        } else
        if (E == 2)
        {
            a("m-Commaerce", as, true);
            return;
        }
        E = 0;
    }

    public void onClick(View view)
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put(com.bca.mobile.transaction.g.c, "m-Commerce");
        if (n.y != null)
        {
            n.y.d();
        }
        if (view.equals(d))
        {
            if (f.length > 1)
            {
                hashtable.put(g.q, a(f));
                hashtable.put(g.b, new Boolean(false));
                at = 0;
                if (B != null)
                {
                    B.cancel();
                    B = null;
                }
                B = new com.bca.mobile.transaction.g(getParent(), hashtable, this, this);
                B.show();
            }
        } else
        if (view.equals(k))
        {
            hashtable.put(g.t, l);
            hashtable.put(g.b, new Boolean(true));
            hashtable.put(g.x, new Integer(0));
            hashtable.put(g.y, new Integer(0));
            hashtable.put(g.v, new Integer(m[h]));
            hashtable.put(g.w, new Integer(n[h]));
            hashtable.put(g.A, ai);
            hashtable.put(g.f, getString(0x7f0c0080));
            hashtable.put(com.bca.mobile.transaction.g.g, getString(0x7f0c0081));
            hashtable.put(g.h, getString(0x7f0c0082));
            if (B != null)
            {
                B.cancel();
                B = null;
            }
            B = new com.bca.mobile.transaction.g(getParent(), hashtable, this, this);
            B.show();
        }
        if (view.equals(W) && Y[h].length > 1)
        {
            hashtable.put(g.q, a(Y[h]));
            hashtable.put(g.b, new Boolean(false));
            at = 1;
            if (B != null)
            {
                B.cancel();
                B = null;
            }
            B = new com.bca.mobile.transaction.g(getParent(), hashtable, this, this);
            B.show();
        }
        if (view.equals(ae))
        {
            if (ag.length > 1)
            {
                hashtable.put(g.q, a(ag));
                hashtable.put(g.b, new Boolean(false));
                at = 2;
                if (B != null)
                {
                    B.cancel();
                    B = null;
                }
                B = new com.bca.mobile.transaction.g(getParent(), hashtable, this, this);
                B.show();
            }
            return;
        } else
        {
            super.onClick(view);
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        String as1[];
        int i1;
        int j1;
        super.a(bundle, 0x7f03004c);
        bundle = (String[])n.m.get("data");
        as1 = bundle[1].split(":@:");
        j1 = as1.length - 1;
        f = new String[j1];
        g = new String[j1];
        h = Integer.parseInt(as1[j1]);
        i1 = 0;
_L7:
        if (i1 < j1) goto _L2; else goto _L1
_L1:
        as1 = bundle[2].split(":@:");
        j1 = as1.length;
        m = new int[j1];
        n = new int[j1];
        i1 = 0;
_L8:
        if (i1 < j1) goto _L4; else goto _L3
_L3:
        int k1;
        as1 = bundle[3].split(":@:");
        k1 = as1.length;
        Y = new String[k1][];
        Z = new int[k1];
        i1 = 0;
_L9:
        if (i1 < k1) goto _L6; else goto _L5
_L5:
        bundle = bundle[4].split(":@:");
        j1 = bundle.length - 1;
        ah = Integer.parseInt(bundle[j1]);
        ag = new String[j1];
        i1 = 0;
_L11:
        if (i1 >= j1)
        {
            a = (TextView)findViewById(0x7f0b014a);
            b = (TextView)findViewById(0x7f0b014b);
            d = (RelativeLayout)findViewById(0x7f0b0149);
            i = (TextView)findViewById(0x7f0b014d);
            j = (TextView)findViewById(0x7f0b014e);
            k = (RelativeLayout)findViewById(0x7f0b014c);
            U = (TextView)findViewById(0x7f0b0154);
            V = (TextView)findViewById(0x7f0b0155);
            W = (RelativeLayout)findViewById(0x7f0b0153);
            ac = (TextView)findViewById(0x7f0b0158);
            ad = (TextView)findViewById(0x7f0b0159);
            ae = (RelativeLayout)findViewById(0x7f0b0157);
            c = (ImageView)findViewById(0x7f0b0114);
            T = (ImageView)findViewById(0x7f0b0156);
            ab = (ImageView)findViewById(0x7f0b015a);
            if (f.length == 1)
            {
                c.setVisibility(8);
            }
            a.setText(e);
            e();
            d.setOnClickListener(this);
            d.setVisibility(0);
            i.setText(l);
            j("");
            k.setOnClickListener(this);
            k.setVisibility(0);
            U.setText(X);
            l();
            W.setOnClickListener(this);
            W.setVisibility(0);
            if (ag.length == 1)
            {
                ab.setVisibility(8);
            }
            ac.setText(af);
            d();
            ae.setOnClickListener(this);
            ae.setVisibility(0);
            return;
        }
        break MISSING_BLOCK_LABEL_746;
_L2:
        String as2[] = as1[i1].split(":#:");
        f[i1] = as2[0];
        g[i1] = as2[1];
        i1++;
          goto _L7
_L4:
        String as3[] = as1[i1].split(":#:");
        m[i1] = Integer.parseInt(as3[0]);
        n[i1] = Integer.parseInt(as3[1]);
        i1++;
          goto _L8
_L6:
        String as4[];
        String as5[];
        int l1;
        as4 = as1[i1].split(":#:");
        l1 = as4.length - 1;
        Z[i1] = Integer.parseInt(as4[l1]);
        as5 = new String[l1];
        j1 = 0;
_L10:
label0:
        {
            if (j1 < l1)
            {
                break label0;
            }
            Y[i1] = as5;
            i1++;
        }
          goto _L9
        as5[j1] = as4[j1];
        j1++;
          goto _L10
        ag[i1] = bundle[i1];
        i1++;
          goto _L11
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        at;
        JVM INSTR tableswitch 0 2: default 32
    //                   0 33
    //                   1 61
    //                   2 79;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        if (h != i1)
        {
            h = i1;
            e();
            j("");
            l();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (aa != i1)
        {
            aa = i1;
            j();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (ah != i1)
        {
            ah = i1;
            d();
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void onResultButtonCancel(View view)
    {
        E = 0;
    }

    public void onResultButtonOK(View view)
    {
        if (E == 1)
        {
            view = al;
            f();
            k();
        } else
        if (E == 2 && ar == 2)
        {
            a("m-Commerce", as, true);
            return;
        }
        E = 0;
    }

    protected void onResume()
    {
        super.onResume();
        if (n.am != null)
        {
            n.am.a("Send", true);
        }
        if (n.v == null)
        {
            n.v = new g(this);
        }
        n.v.a(this);
    }
}
