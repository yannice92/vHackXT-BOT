// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
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
import com.utilities.r;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile.transaction:
//            bg, bh, bi, bk, 
//            bj

public class M_Commerce_Voucher1 extends ShareActivity
    implements c
{

    private String T;
    private RelativeLayout U;
    private TextView V;
    private TextView W;
    private RelativeLayout X;
    private TextView Y;
    private TextView Z;
    android.widget.AdapterView.OnItemClickListener a;
    private RelativeLayout aa;
    private TextView ab;
    private TextView ac;
    private RelativeLayout ad;
    private TextView ae;
    private TextView af;
    private RelativeLayout ag;
    private TextView ah;
    private TextView ai;
    android.widget.AdapterView.OnItemClickListener b;
    android.widget.AdapterView.OnItemClickListener c;
    private int d;
    private final int e = 1;
    private final int f = 2;
    private ArrayList g;
    private ArrayList h;
    private ArrayList i;
    private String j;
    private String k;
    private int l;
    private String m;
    private String n;

    public M_Commerce_Voucher1()
    {
        d = 0;
        a = new bg(this);
        b = new bh(this);
        c = new bi(this);
    }

    static TextView a(M_Commerce_Voucher1 m_commerce_voucher1)
    {
        return m_commerce_voucher1.af;
    }

    static void a(M_Commerce_Voucher1 m_commerce_voucher1, String s)
    {
        m_commerce_voucher1.m = s;
    }

    static ArrayList b(M_Commerce_Voucher1 m_commerce_voucher1)
    {
        return m_commerce_voucher1.h;
    }

    static void b(M_Commerce_Voucher1 m_commerce_voucher1, String s)
    {
        m_commerce_voucher1.n = s;
    }

    static int c(M_Commerce_Voucher1 m_commerce_voucher1)
    {
        return m_commerce_voucher1.l;
    }

    static void c(M_Commerce_Voucher1 m_commerce_voucher1, String s)
    {
        m_commerce_voucher1.T = s;
    }

    static int d(M_Commerce_Voucher1 m_commerce_voucher1)
    {
        return m_commerce_voucher1.d;
    }

    private void d()
    {
        String as[] = r.a(j, ":@:");
        int j1 = as.length;
        int i1 = 0;
        do
        {
            if (i1 >= j1)
            {
                return;
            }
            String as1[] = r.a(as[i1], ":#:");
            bk bk1 = new bk(this, as1[0], as1[1], as1[2], as1[3], as1[4], as1[5], as1[6], as1[7]);
            h.add(bk1);
            g.add(bk1.a());
            i1++;
        } while (true);
    }

    static String e(M_Commerce_Voucher1 m_commerce_voucher1)
    {
        return m_commerce_voucher1.m;
    }

    private void e()
    {
        if (V != null && y.isActive())
        {
            y.hideSoftInputFromWindow(V.getWindowToken(), 0);
        }
    }

    static TextView f(M_Commerce_Voucher1 m_commerce_voucher1)
    {
        return m_commerce_voucher1.ac;
    }

    protected final void a()
    {
        String s;
        int i1;
        i1 = Integer.parseInt(((bk)h.get(l)).b());
        d = 1;
        if (i1 != 5 && Z.getText().toString().equals(""))
        {
            a(null, getString(0x7f0c0080).replace("#LABEL#", Y.getText().toString()).replace(":", ""), getParent(), false, "Back");
            return;
        }
        if (i1 == 3 && ac.getText().toString().equals(""))
        {
            a(null, getString(0x7f0c0080).replace("#LABEL#", ab.getText().toString()).replace(":", ""), getParent(), false, "Back");
            return;
        }
        s = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(""))).append("PGI").toString()))).append(":!:").toString()))).append("CVH3").toString()))).append(":!:").toString()))).append(W.getText().toString()).toString()))).append(":!:").toString()))).append(((bk)h.get(l)).b()).toString()))).append(":!:").toString();
        i1;
        JVM INSTR tableswitch 1 5: default 372
    //                   1 467
    //                   2 549
    //                   3 631
    //                   4 728
    //                   5 825;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        s = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s))).append(ai.getText().toString()).toString()))).append(":!:").toString()))).append("2").toString();
        System.out.println((new StringBuilder("==== send :")).append(s).toString());
        g(s);
        return;
_L2:
        s = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s))).append(Z.getText().toString()).toString()))).append(":!:").toString()))).toString()))).append(":!:").toString();
        continue; /* Loop/switch isn't completed */
_L3:
        s = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s))).append(Z.getText().toString()).toString()))).append(":!:").toString()))).toString()))).append(":!:").toString();
        continue; /* Loop/switch isn't completed */
_L4:
        s = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s))).append(Z.getText().toString()).toString()))).append(":!:").toString()))).append(ac.getText().toString()).toString()))).append(":!:").toString();
        continue; /* Loop/switch isn't completed */
_L5:
        s = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s))).append(Z.getText().toString()).toString()))).append(":!:").toString()))).append(af.getText().toString()).toString()))).append(":!:").toString();
        continue; /* Loop/switch isn't completed */
_L6:
        s = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s))).toString()))).append(":!:").toString()))).append(af.getText().toString()).toString()))).append(":!:").toString();
        if (true) goto _L1; else goto _L7
_L7:
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

    public final void a(int i1, Object obj)
    {
        if (i1 != 4098) goto _L2; else goto _L1
_L1:
        if (!(obj instanceof HashMap)) goto _L4; else goto _L3
_L3:
        String s;
        int j1;
        int k1;
        obj = (HashMap)obj;
        i1 = ((Integer)((HashMap) (obj)).get("MIN")).intValue();
        j1 = ((Integer)((HashMap) (obj)).get("MAX")).intValue();
        s = (String)((HashMap) (obj)).get("TEXT");
        k1 = s.length();
        obj = "";
        if (k1 != 0) goto _L6; else goto _L5
_L5:
        obj = getString(0x7f0c0080).replace("#LABEL#", Y.getText().toString()).replace(":", "");
_L15:
        if (((String) (obj)).equals("")) goto _L8; else goto _L7
_L7:
        bn.a(((String) (obj)), getParent());
_L4:
        return;
_L6:
        if (i1 == j1 && k1 != i1)
        {
            obj = getString(0x7f0c0081).replace("#SD.MIN#", (new StringBuilder()).append(i1).toString()).replace("#SD.MAX#", (new StringBuilder()).append(j1).toString()).replace("#LABEL#", Y.getText().toString()).replace(":", "");
        } else
        if (k1 < i1 || k1 > j1)
        {
            obj = getString(0x7f0c0082).replace("#SD.MIN#", (new StringBuilder()).append(i1).toString()).replace("#SD.MAX#", (new StringBuilder()).append(j1).toString()).replace("#LABEL#", Y.getText().toString()).replace(":", "");
        }
        continue; /* Loop/switch isn't completed */
_L8:
        Z.setText(s);
        com.d.b.a();
        return;
_L2:
        if (i1 != 4099) goto _L4; else goto _L9
_L9:
        obj = (HashMap)obj;
        j1 = ((Integer)((HashMap) (obj)).get("MIN")).intValue();
        k1 = ((Integer)((HashMap) (obj)).get("MAX")).intValue();
        obj = (String)((HashMap) (obj)).get("TEXT");
        if (((String) (obj)).length() != 0) goto _L11; else goto _L10
_L10:
        obj = getString(0x7f0c009b).replace("#SD.LABEL2#", ab.getText().toString()).replace(":", "");
        i1 = 0;
_L13:
        Object obj1;
label0:
        {
            obj1 = obj;
            if (!((String) (obj)).equals(""))
            {
                break label0;
            }
            if (i1 >= j1)
            {
                obj1 = obj;
                if (i1 <= k1)
                {
                    break label0;
                }
            }
            obj1 = getString(0x7f0c009a).replace("#SD.LABEL2#", ab.getText().toString()).replace("#SD.MIN_AMOUNT#", (new StringBuilder(String.valueOf(j1))).toString()).replace("#SD.MAX_AMOUNT#", (new StringBuilder(String.valueOf(k1))).toString()).replace(":", "");
        }
        if (!((String) (obj1)).equals(""))
        {
            bn.a(((String) (obj1)), getParent());
            return;
        }
        break; /* Loop/switch isn't completed */
_L11:
        i1 = (new Integer(((String) (obj)))).intValue();
        obj = "";
        continue; /* Loop/switch isn't completed */
        obj;
        System.out.println((new StringBuilder("Error - ")).append(((Exception) (obj)).toString()).toString());
        i1 = 0;
        obj = "";
        if (true) goto _L13; else goto _L12
_L12:
        ac.setText((new StringBuilder(String.valueOf(i1))).toString());
        com.d.b.a();
        return;
        if (true) goto _L15; else goto _L14
_L14:
    }

    public final void a(int i1, String as[])
    {
        a(((Runnable) (new bj(this, as))));
    }

    protected final void a(String s)
    {
        String s1;
        int i1;
        i1 = Integer.parseInt(((bk)h.get(l)).b());
        s1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(""))).append("PGI").toString()))).append(":!:").toString()))).append("CVH3").toString()))).append(":!:").toString()))).append(W.getText().toString()).toString()))).append(":!:").toString()))).append(i1).toString()))).append(":!:").toString();
        i1;
        JVM INSTR tableswitch 1 5: default 533
    //                   1 440
    //                   2 440
    //                   3 440
    //                   4 440
    //                   5 491;
           goto _L1 _L2 _L2 _L2 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_491;
_L4:
        try
        {
            s1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s1))).append(T).toString()))).append(":!:").toString()))).append(ai.getText().toString()).toString()))).append(":!:").toString()))).append(n).toString()))).append(":!:").toString()))).append(n.af.a((new StringBuilder(String.valueOf(s))).append(":-:").append(n).toString())).toString()))).append(":!:").toString()))).append("3").toString();
            d = 2;
            getParent();
            a(s, s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_532;
_L2:
        s1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s1))).append(Z.getText().toString()).toString()))).append(":!:").toString();
          goto _L4
        s1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s1))).toString()))).append(":!:").toString();
          goto _L4
    }

    public final void a(String s, String s1, boolean flag)
    {
        E = 1;
        a(s, s1, getParent(), flag, 16);
    }

    protected final void b()
    {
    }

    public final void b(String s)
    {
        if (E == 1)
        {
            T = s;
        }
    }

    public final void c()
    {
        if (E == 1)
        {
            e();
        } else
        if (E == 2)
        {
            a("m-Commerce", m, true);
            return;
        }
        E = 0;
    }

    final void e(int i1)
    {
        l = i1;
        X.setVisibility(8);
        aa.setVisibility(8);
        ad.setVisibility(8);
        W.setText(((bk)h.get(i1)).a());
        Z.setText("");
        ac.setText("");
        af.setText("");
        String s = ((bk)h.get(i1)).b();
        String as[] = ((bk)h.get(i1)).g();
        String as1[] = ((bk)h.get(i1)).h();
        switch (Integer.parseInt(s))
        {
        default:
            return;

        case 1: // '\001'
            X.setVisibility(0);
            Y.setText(as[0]);
            return;

        case 2: // '\002'
            X.setVisibility(0);
            Y.setText(as[0]);
            return;

        case 3: // '\003'
            X.setVisibility(0);
            aa.setVisibility(0);
            Y.setText(as[0]);
            ab.setText(as[1]);
            return;

        case 4: // '\004'
            X.setVisibility(0);
            ad.setVisibility(0);
            Y.setText(as[0]);
            ae.setText(as[1]);
            af.setText(as1[0]);
            return;

        case 5: // '\005'
            ad.setVisibility(0);
            break;
        }
        ae.setText(as[0]);
        af.setText(as1[0]);
    }

    final void f(int i1)
    {
        ai.setText((CharSequence)i.get(i1));
    }

    public void onClick(View view)
    {
        if (U.equals(view) && j.length() > 0)
        {
            com.d.b.a(getParent(), g, a);
            return;
        }
        if (X.equals(view))
        {
            int i1 = Integer.parseInt(((bk)h.get(l)).c());
            int k1 = Integer.parseInt(((bk)h.get(l)).d());
            com.d.b.a(getParent(), 4098, Y.getText().toString(), Z.getText().toString(), i1, k1, this);
            return;
        }
        if (aa.equals(view))
        {
            int j1 = Integer.parseInt(((bk)h.get(l)).e());
            int l1 = Integer.parseInt(((bk)h.get(l)).f());
            com.d.b.a(getParent(), 4099, ab.getText().toString(), ac.getText().toString(), j1, l1, this);
            return;
        }
        if (ad.equals(view))
        {
            view = new ArrayList(Arrays.asList(((bk)h.get(l)).h()));
            com.d.b.a(getParent(), view, b);
            return;
        }
        if (ag.equals(view))
        {
            com.d.b.a(getParent(), i, c);
            return;
        } else
        {
            super.onClick(view);
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f03001b);
        g = new ArrayList();
        h = new ArrayList();
        i = new ArrayList();
        bundle = (String[])n.m.get("data");
        j = bundle[1];
        k = bundle[2];
        d();
        i = new ArrayList(Arrays.asList(r.a(k, ":@:")));
        U = (RelativeLayout)findViewById(0x7f0b0057);
        V = (TextView)findViewById(0x7f0b0058);
        W = (TextView)findViewById(0x7f0b0059);
        X = (RelativeLayout)findViewById(0x7f0b005b);
        Y = (TextView)findViewById(0x7f0b005c);
        Z = (TextView)findViewById(0x7f0b005d);
        aa = (RelativeLayout)findViewById(0x7f0b0067);
        ab = (TextView)findViewById(0x7f0b0068);
        ac = (TextView)findViewById(0x7f0b0069);
        ad = (RelativeLayout)findViewById(0x7f0b006b);
        ae = (TextView)findViewById(0x7f0b006c);
        af = (TextView)findViewById(0x7f0b006d);
        ag = (RelativeLayout)findViewById(0x7f0b006f);
        ah = (TextView)findViewById(0x7f0b0070);
        ai = (TextView)findViewById(0x7f0b0071);
        U.setOnClickListener(this);
        X.setOnClickListener(this);
        aa.setOnClickListener(this);
        ad.setOnClickListener(this);
        ag.setOnClickListener(this);
        U.setVisibility(0);
        ag.setVisibility(0);
        V.setText(getString(0x7f0c009f));
        ah.setText(getString(0x7f0c00a2));
        e(0);
        f(0);
        r.a(getApplicationContext(), "mbca_mcomm_vouc_open", 40);
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
    }

    public void onResultButtonCancel(View view)
    {
        E = 0;
    }

    public void onResultButtonOK(View view)
    {
        boolean flag = false;
        if (E != 1) goto _L2; else goto _L1
_L1:
        String s = T;
        if (Integer.parseInt(((bk)h.get(l)).b()) != 1) goto _L4; else goto _L3
_L3:
        int i1;
        int j1 = Integer.parseInt(((bk)h.get(l)).e());
        int k1 = Integer.parseInt(((bk)h.get(l)).f());
        view = "";
        if (s.equals(""))
        {
            view = "140 - Anda belum menginput Jumlah Uang.";
            i1 = 0;
        } else
        {
            i1 = (new Integer(s)).intValue();
        }
        if (view.equals("") && (i1 < j1 || i1 > k1))
        {
            view = (new StringBuilder("142 - Jumlah pembayaran harus diisi antara Rp ")).append(j1).append(" - Rp ").append(k1).append(".").toString();
        }
        if (view == "") goto _L4; else goto _L5
_L5:
        E = 2;
        a(null, view, getParent(), false, "Back");
        T = s;
        i1 = ((flag) ? 1 : 0);
_L6:
        if (i1 != 0)
        {
            f();
            e();
        }
        return;
_L4:
        i1 = 1;
        if (true) goto _L6; else goto _L2
_L2:
        if (E == 2)
        {
            a("m-Commerce", m, true);
            return;
        } else
        {
            E = 0;
            return;
        }
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
