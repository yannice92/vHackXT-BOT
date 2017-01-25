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
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile.transaction:
//            i, al, ak, g

public class M_Commerce_Lainnya extends ShareActivity
    implements android.widget.AdapterView.OnItemClickListener, c, i
{

    int T[];
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
    ImageView ae;
    RelativeLayout af;
    String ag;
    String ah[];
    int ai;
    String aj;
    String ak;
    String al;
    String am;
    String an;
    String ao;
    private int ap;
    private final int aq = 1;
    private final int ar = 2;
    private int as;
    private String at;
    private int au;
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
    String m;
    int n[];

    public M_Commerce_Lainnya()
    {
        ap = 0;
        e = "Nama Perusahaan:";
        l = "No. Kartu:";
        m = "Kode Pembayaran:";
        X = "Nominal (sdh termasuk PPN):";
        ag = "Dari Rekening:";
    }

    static int a(M_Commerce_Lainnya m_commerce_lainnya)
    {
        return m_commerce_lainnya.ap;
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

    static void a(M_Commerce_Lainnya m_commerce_lainnya, String s)
    {
        m_commerce_lainnya.at = s;
    }

    static String b(M_Commerce_Lainnya m_commerce_lainnya)
    {
        return m_commerce_lainnya.at;
    }

    private void d()
    {
        al = ah[ai];
        ad.setText(al);
    }

    private void e()
    {
        ak = f[h];
        an = g[h];
        b.setText(ak);
    }

    private void j()
    {
        if (an.equals("4"))
        {
            aa = Z[h];
            k(Y[h][aa]);
            W.setVisibility(0);
            if (Y[h].length == 1)
            {
                ab.setVisibility(8);
                return;
            } else
            {
                ab.setVisibility(0);
                return;
            }
        } else
        {
            k("");
            W.setVisibility(8);
            return;
        }
    }

    private void j(String s)
    {
        aj = s;
        j.setText(aj);
    }

    private void k()
    {
        if (!ak.equalsIgnoreCase("Blitz")) goto _L2; else goto _L1
_L1:
        System.out.println("AAAAAAAAAAA");
        i.setText(l);
_L4:
        j("");
        return;
_L2:
        if (ak.equalsIgnoreCase("GA"))
        {
            System.out.println("BBBBBBBBBBB");
            i.setText(m);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void k(String s)
    {
        am = s;
        V.setText(am);
    }

    private void l()
    {
        if (a != null)
        {
            a.setOnClickListener(new al(this));
        }
    }

    protected final void a()
    {
        if (aj.equals(""))
        {
            String s2 = getString(0x7f0c0080);
            String s;
            if (ak.equalsIgnoreCase("Blitz"))
            {
                s = l;
            } else
            if (ak.equalsIgnoreCase("GA"))
            {
                s = m;
            } else
            {
                s = "";
            }
            a(null, s2.replace("#LABEL#", s.replace(":", "").replace("Input ", "")), getParent(), false, "Back");
            return;
        }
        String as1[] = new String[11];
        as1[0] = "PGI";
        as1[1] = "CLY";
        as1[2] = ak;
        as1[4] = aj;
        as1[5] = am;
        as1[7] = al;
        as1[9] = an;
        as1[10] = "2";
        String s1 = "";
        int j1 = as1.length;
        int i1 = 0;
        do
        {
            if (i1 >= j1)
            {
                s1 = s1.substring(0, s1.length() - 3);
                ap = 1;
                g(s1);
                return;
            }
            String s3 = as1[i1];
            if (s3 != null)
            {
                s1 = (new StringBuilder(String.valueOf(s1))).append(s3).append(":!:").toString();
            } else
            {
                s1 = (new StringBuilder(String.valueOf(s1))).append(":!:").toString();
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
        a(((Runnable) (new ak(this, as1))));
    }

    protected final void a(String s)
    {
        try
        {
            String s1 = (new StringBuilder("PGI:!:CLY:!:")).append(ak).append(":!:").append(al).append(":!:").append(am).append(":!:").append(an).append(":!:").append(ao).append(":!:").append(n.af.a((new StringBuilder(String.valueOf(s))).append(":-:").append(ao).toString())).toString();
            ap = 2;
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
        switch (au)
        {
        default:
            return;

        case 1: // '\001'
            j(s);
            break;
        }
    }

    protected final void b()
    {
    }

    public final void b(String s)
    {
        if (E == 1)
        {
            am = s;
        }
    }

    public final void c()
    {
        if (E == 1)
        {
            l();
        } else
        if (E == 2)
        {
            a("m-Commaerce", at, true);
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
        if (view.equals(d) && f.length > 1)
        {
            hashtable.put(g.p, a(f));
            hashtable.put(g.b, new Boolean(true));
            au = 0;
            if (B != null)
            {
                B.cancel();
                B = null;
            }
            B = new com.bca.mobile.transaction.g(getParent(), hashtable, this, this);
            B.show();
            return;
        }
        if (view.equals(k))
        {
            hashtable.put(g.t, i.getText());
            hashtable.put(g.b, new Boolean(true));
            hashtable.put(g.x, new Integer(0));
            hashtable.put(g.y, new Integer(0));
            hashtable.put(g.v, new Integer(n[h]));
            hashtable.put(g.w, new Integer(T[h]));
            hashtable.put(g.A, aj);
            hashtable.put(g.f, getString(0x7f0c0080));
            hashtable.put(com.bca.mobile.transaction.g.g, getString(0x7f0c0081));
            hashtable.put(g.h, getString(0x7f0c0082));
            au = 1;
            if (B != null)
            {
                B.cancel();
                B = null;
            }
            B = new com.bca.mobile.transaction.g(getParent(), hashtable, this, this);
            B.show();
            return;
        }
        if (view.equals(W) && Y[h].length > 1)
        {
            hashtable.put(g.p, a(Y[h]));
            hashtable.put(g.b, new Boolean(true));
            au = 2;
            if (B != null)
            {
                B.cancel();
                B = null;
            }
            B = new com.bca.mobile.transaction.g(getParent(), hashtable, this, this);
            B.show();
            return;
        }
        if (view.equals(af) && ah.length > 1)
        {
            hashtable.put(g.p, a(ah));
            hashtable.put(g.b, new Boolean(true));
            au = 3;
            if (B != null)
            {
                B.cancel();
                B = null;
            }
            B = new com.bca.mobile.transaction.g(getParent(), hashtable, this, this);
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
        String as1[];
        int i1;
        int j1;
        super.a(bundle, 0x7f03004c);
        bundle = (String[])n.m.get("data");
        System.out.println((new StringBuilder("l_aryStrMainData :")).append(bundle).toString());
        as1 = bundle[1].split(":@:");
        j1 = as1.length - 1;
        h = Integer.parseInt(as1[j1]);
        f = new String[j1];
        g = new String[j1];
        i1 = 0;
_L7:
        if (i1 < j1) goto _L2; else goto _L1
_L1:
        as1 = bundle[2].split(":@:");
        j1 = as1.length;
        n = new int[j1];
        T = new int[j1];
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
_L11:
        if (i1 < k1) goto _L6; else goto _L5
_L5:
        bundle = bundle[4].split(":@:");
        j1 = bundle.length - 1;
        ai = Integer.parseInt(bundle[j1]);
        ah = new String[j1];
        i1 = 0;
_L13:
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
            af = (RelativeLayout)findViewById(0x7f0b0157);
            c = (ImageView)findViewById(0x7f0b0114);
            ab = (ImageView)findViewById(0x7f0b0156);
            ae = (ImageView)findViewById(0x7f0b015a);
            if (f.length == 1)
            {
                c.setVisibility(8);
            }
            a.setText(e);
            e();
            d.setOnClickListener(this);
            d.setVisibility(0);
            k();
            j("");
            k.setOnClickListener(this);
            k.setVisibility(0);
            U.setText(X);
            j();
            W.setOnClickListener(this);
            if (ah.length == 1)
            {
                ae.setVisibility(8);
            }
            ac.setText(ag);
            d();
            af.setOnClickListener(this);
            af.setVisibility(0);
            return;
        }
        break MISSING_BLOCK_LABEL_765;
_L2:
        String as2[] = as1[i1].split(":#:");
        f[i1] = as2[0];
        g[i1] = as2[1];
        i1++;
          goto _L7
_L4:
        String as3[] = as1[i1].split(":#:");
        n[i1] = Integer.parseInt(as3[0]);
        T[i1] = Integer.parseInt(as3[1]);
        i1++;
          goto _L8
_L6:
        String s = as1[i1];
        if (s.equals("")) goto _L10; else goto _L9
_L9:
        String as4[];
        String as5[];
        int l1;
        as4 = s.split(":#:");
        l1 = as4.length - 1;
        Z[i1] = Integer.parseInt(as4[l1]);
        as5 = new String[l1];
        j1 = 0;
_L12:
        if (j1 < l1)
        {
            break MISSING_BLOCK_LABEL_747;
        }
        Y[i1] = as5;
_L10:
        i1++;
          goto _L11
        as5[j1] = as4[j1];
        j1++;
          goto _L12
        ah[i1] = bundle[i1];
        i1++;
          goto _L13
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        au;
        JVM INSTR tableswitch 0 3: default 36
    //                   0 37
    //                   1 36
    //                   2 63
    //                   3 95;
           goto _L1 _L2 _L1 _L3 _L4
_L1:
        return;
_L2:
        if (h != i1)
        {
            h = i1;
            e();
            k();
            j();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (aa != i1)
        {
            aa = i1;
            k(Y[h][aa]);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (ai != i1)
        {
            ai = i1;
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
            view = am;
            f();
            l();
        } else
        if (E == 2 && as == 2)
        {
            a("m-Commaerce", at, true);
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
