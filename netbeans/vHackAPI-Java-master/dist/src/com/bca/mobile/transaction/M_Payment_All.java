// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b.a.a.d;
import com.bca.mobile.bn;
import com.bca.mobile.n;
import com.f.a;
import com.utilities.e;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Payment_Service, i, g, cz, 
//            da

public class M_Payment_All extends M_Payment_Service
    implements i
{

    ArrayList a;
    private int aL;
    private final int aM = 1;
    private final int aN = 2;
    private String aO;
    private String aP;
    private boolean aQ;
    private boolean aR;
    private int aS;
    private boolean aT;
    ArrayList b;
    String c[];
    ArrayList d;

    public M_Payment_All()
    {
        aL = 0;
        aO = "";
        aP = "";
        aQ = true;
        aR = false;
        a = null;
        b = null;
        c = null;
        d = null;
    }

    static int a(M_Payment_All m_payment_all)
    {
        return m_payment_all.aL;
    }

    static void a(M_Payment_All m_payment_all, String s1)
    {
        m_payment_all.aO = s1;
    }

    static void a(M_Payment_All m_payment_all, boolean flag)
    {
        m_payment_all.aQ = flag;
    }

    static String b(M_Payment_All m_payment_all)
    {
        return m_payment_all.aO;
    }

    static void b(M_Payment_All m_payment_all, String s1)
    {
        m_payment_all.aP = s1;
    }

    static void b(M_Payment_All m_payment_all, boolean flag)
    {
        m_payment_all.aR = flag;
    }

    static void c(M_Payment_All m_payment_all)
    {
        m_payment_all.s();
    }

    static void d(M_Payment_All m_payment_all)
    {
        m_payment_all.u();
    }

    static void e(M_Payment_All m_payment_all)
    {
        m_payment_all.t();
    }

    static void f(M_Payment_All m_payment_all)
    {
        m_payment_all.w();
    }

    private String j(String s1)
    {
        String s2;
label0:
        {
            (new Hashtable()).put(g.c, "m-Payment");
            s2 = s1.replace("#2_2#", ay).replace("#5_5#", az).replace("#6_6#", aA).replace("#8_8#", aB).replace("#1_1#", aD).replace("#3_3#", aE).replace("#4_4#", aF).replace("#7_7#", aG).replace("#9_9#", aH);
            s1 = s2;
            if (aG.equals("8"))
            {
                if (aQ)
                {
                    break label0;
                }
                s1 = s2.replace("#10_10#", "- LIST -").replace("#11_11#", "- LIST -");
            }
            return s1;
        }
        return s2.replace("#10_10#", aI).replace("#11_11#", aJ);
    }

    private boolean k(String s1)
    {
        int j1;
        int k1;
        int l1;
        if (!aT)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        j1 = s1.length();
        k1 = Integer.parseInt((String)i.get("amout_min"));
        l1 = Integer.parseInt((String)i.get("amout_max"));
        if (s1.equals(""))
        {
            break MISSING_BLOCK_LABEL_133;
        }
        int i1 = Integer.valueOf(s1).intValue();
_L1:
        Object obj;
        if (j1 == 0)
        {
            obj = "140 - Anda belum menginput Jumlah Uang.";
        } else
        if (i1 < k1 || i1 > l1)
        {
            obj = (new StringBuilder("142 - Jumlah pembayaran harus diisi antara Rp ")).append(k1).append(" - Rp ").append(l1).append(".").toString();
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            E = 2;
            aS = 2;
            a(null, ((String) (obj)), getParent(), false, "Back");
            aF = s1;
            return false;
        }
        break MISSING_BLOCK_LABEL_186;
        obj;
        System.out.println((new StringBuilder("Error - ")).append(((Exception) (obj)).toString()).toString());
        i1 = 0;
          goto _L1
        return true;
    }

    private void o()
    {
        if (U != null && y.isActive())
        {
            y.hideSoftInputFromWindow(U.getWindowToken(), 0);
        }
    }

    private void p()
    {
        ap.setVisibility(8);
        n.setVisibility(8);
        au.setVisibility(8);
        T.setVisibility(8);
    }

    private void q()
    {
        i = (Hashtable)e.get(Y);
        aD = (String)X.get(Y);
        aG = (String)i.get("payee_code");
        if (aG.equals("8"))
        {
            if (g.get(0) == "")
            {
                U.setText("Nama Perusahaan:");
            } else
            {
                U.setText((new StringBuilder(String.valueOf(((String)g.get(0)).trim()))).append(":").toString());
            }
        } else
        {
            U.setText((CharSequence)f.get(0));
        }
        if (aG.equals("8"))
        {
            if (g.get(1) == "")
            {
                Z.setText("Input No. Bayar:");
            } else
            {
                Z.setText((new StringBuilder(String.valueOf(((String)g.get(1)).trim()))).append(":").toString());
            }
        } else
        {
            Z.setText((CharSequence)f.get(1));
        }
        V.setText(aD);
    }

    private void r()
    {
        aE = (String)al.get(am);
        aj.setText(aE);
    }

    private void s()
    {
        aI = (String)aq.get(ar);
        ao.setText(aI);
    }

    private void t()
    {
        aJ = (String)av.get(aw);
        at.setText(aJ);
    }

    private void u()
    {
        if (v())
        {
            n.setVisibility(0);
            return;
        } else
        {
            n.setVisibility(8);
            return;
        }
    }

    private boolean v()
    {
        boolean flag1 = true;
        int i1 = a.size();
        boolean flag = flag1;
        if (!"- PILIH -".equals(ao.getText()))
        {
            flag = flag1;
            if (i1 <= 1)
            {
                flag = false;
            }
        }
        return flag;
    }

    private void w()
    {
        if (x())
        {
            T.setVisibility(0);
            return;
        } else
        {
            T.setVisibility(8);
            return;
        }
    }

    private boolean x()
    {
        int i1 = c.length;
        return !"- PILIH -".equals(ao.getText()) && (i1 > 1 || i1 == 1 && "- PILIH -".equals(at.getText()));
    }

    protected final void a()
    {
        Object obj = null;
        String s1;
        if (ay.equals(""))
        {
            if (aG.equals("8"))
            {
                s1 = getString(0x7f0c0078).replace("#LABEL#", ((String)g.get(1)).replace(":", "").replace("Input ", ""));
            } else
            {
                s1 = getString(0x7f0c0077).replace("#LABEL#", ((String)f.get(1)).replace(":", "").replace("Input ", ""));
            }
        } else
        if (aG.equals("8") && aQ)
        {
            if (ao.getText().equals("- PILIH -"))
            {
                s1 = getString(0x7f0c0079).replace("#LABEL#", ((String)g.get(2)).replace(":", "").replace("Input ", ""));
            } else
            {
                s1 = obj;
                if (at.getText().equals("- PILIH -"))
                {
                    s1 = getString(0x7f0c007a).replace("#LABEL#", ((String)g.get(3)).replace(":", "").replace("Input ", ""));
                }
            }
        } else
        {
            s1 = obj;
            if (aG.equals("3"))
            {
                s1 = obj;
                if (aF.equals(""))
                {
                    s1 = getString(0x7f0c007d);
                }
            }
        }
        if (s1 != null)
        {
            bn.a(s1, getParent());
            return;
        } else
        {
            aL = 1;
            g(j(ax));
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
        a(((Runnable) (new cz(this, as))));
    }

    protected final void a(String s1)
    {
        String s2 = j(aC);
        String s3 = (new StringBuilder(String.valueOf(s1))).append(":-:").append(aH).toString();
        try
        {
            aL = 2;
            s2 = s2.replace("#0_0#", n.af.a(s3));
            getParent();
            a(s1, s2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return;
        }
    }

    public final void a(String s1, String s2, boolean flag, int i1)
    {
        E = 1;
        aT = flag;
        C = a(s1, s2, getParent(), flag, i1);
        if (flag)
        {
            C.getWindow().setSoftInputMode(5);
        }
    }

    public final void a(String s1, boolean flag, boolean flag1)
    {
        a(((Runnable) (new da(this, flag1, flag, s1))));
    }

    protected final void b()
    {
    }

    public final void b(String s1)
    {
        if (E == 1)
        {
            aF = s1;
        }
    }

    public final void c()
    {
        if (E == 1)
        {
            o();
        } else
        if (E == 2)
        {
            a("m-Payment", aO, true, 0);
            return;
        }
        E = 0;
    }

    protected final void d()
    {
        o();
    }

    protected final void e()
    {
        int j1 = e.size() - 2;
        X = new ArrayList();
        int i1 = 0;
        do
        {
            if (i1 >= j1)
            {
                U.setText((CharSequence)f.get(0));
                Hashtable hashtable;
                if (X.size() == 1)
                {
                    Y = 0;
                    k.setVisibility(8);
                } else
                {
                    Y = Integer.parseInt((String)((Hashtable)e.get(j1)).get("default_bank"));
                }
                i = (Hashtable)e.get(Y);
                aG = (String)i.get("payee_code");
                if (aG.equals("8"))
                {
                    if (g.get(0) == "")
                    {
                        U.setText("Nama Perusahaan:");
                    } else
                    {
                        Z.setText((new StringBuilder(String.valueOf(((String)g.get(0)).trim()))).append(":").toString());
                    }
                } else
                {
                    U.setText((CharSequence)f.get(0));
                }
                if (aG.equals("8"))
                {
                    m();
                    n();
                }
                q();
                W.setVisibility(0);
                return;
            }
            hashtable = (Hashtable)e.get(i1);
            X.add((String)hashtable.get("bank_name"));
            i1++;
        } while (true);
    }

    protected final void j()
    {
        ac = (ArrayList)i.get("dafter_transfer_list");
        ay = "";
        aP = "";
        aB = "";
        aR = false;
        if (aG.equals("8"))
        {
            if (g.get(1) == "")
            {
                Z.setText("Input No. Bayar:");
            } else
            {
                Z.setText((new StringBuilder(String.valueOf(((String)g.get(1)).trim()))).append(":").toString());
            }
        } else
        {
            Z.setText((CharSequence)f.get(1));
        }
        aa.setText(ay);
        ab.setVisibility(0);
    }

    protected final void k()
    {
        String s1 = (String)i.get("payee_code");
        if (s1.equals("3"))
        {
            aF = "";
            ae.setText((CharSequence)f.get(2));
            af.setText(aF);
            ag.setVisibility(0);
            return;
        } else
        {
            s1.equals("4");
            ag.setVisibility(8);
            return;
        }
    }

    protected final void l()
    {
        Hashtable hashtable = (Hashtable)e.get(e.size() - 1);
        al = (ArrayList)hashtable.get("dari_rekening");
        ai.setText((CharSequence)f.get(3));
        if (al.size() != 1)
        {
            am = Integer.parseInt((String)hashtable.get("dari_rek_default"));
        } else
        {
            m.setVisibility(8);
            am = 0;
        }
        r();
        ak.setVisibility(0);
    }

    protected final void m()
    {
        int i1;
        a = new ArrayList();
        b = new ArrayList();
        aq = new ArrayList();
        i1 = 0;
_L3:
        if (i1 < h.size()) goto _L2; else goto _L1
_L1:
        i1 = 0;
_L4:
        if (i1 >= a.size())
        {
            String as[];
            if (aG.equals("8"))
            {
                if (g.get(2) == "")
                {
                    an.setText("Wilayah:");
                } else
                {
                    an.setText((new StringBuilder(String.valueOf(((String)g.get(2)).trim()))).append(":").toString());
                }
            }
            if (aq.size() == 1)
            {
                ar = 0;
                n.setVisibility(8);
            }
            i = (Hashtable)e.get(ar);
            s();
            ao.setText("- PILIH -");
            ap.setVisibility(0);
            n.setVisibility(0);
            return;
        }
        break MISSING_BLOCK_LABEL_246;
_L2:
        as = ((String)h.get(i1)).split(":\\$:");
        if (as.length != 1)
        {
            a.add(as[0]);
            b.add(as[1]);
        } else
        {
            a.add(as[0]);
            b.add("- PILIH -");
        }
        i1++;
          goto _L3
        aq.add((String)a.get(i1));
        i1++;
          goto _L4
    }

    protected final void n()
    {
        int i1;
        av = new ArrayList();
        d = new ArrayList();
        i1 = 0;
_L5:
        if (i1 < aq.size()) goto _L2; else goto _L1
_L1:
        if (c.equals("- PILIH -"))
        {
            break MISSING_BLOCK_LABEL_277;
        }
        i1 = 0;
_L6:
        if (i1 < c.length) goto _L4; else goto _L3
_L3:
        if (aG.equals("8"))
        {
            if (g.get(3) == "")
            {
                as.setText("PAM:");
            } else
            {
                as.setText((new StringBuilder(String.valueOf(((String)g.get(3)).trim()))).append(":").toString());
            }
        }
        if (av.size() == 1)
        {
            aw = 0;
            T.setVisibility(8);
        }
        i = (Hashtable)e.get(aw);
        t();
        at.setText("- PILIH -");
        au.setVisibility(0);
        T.setVisibility(4);
        if (!ao.getText().equals("- PILIH -"))
        {
            T.setVisibility(0);
        }
        return;
_L2:
        if (((String)aq.get(i1)).equals(aq.get(ar)))
        {
            c = null;
            c = ((String)b.get(ar)).split(":%:");
        }
        i1++;
          goto _L5
_L4:
        av.add(c[i1]);
        i1++;
          goto _L6
        av.add("- PILIH -");
          goto _L3
    }

    public void onCancel(DialogInterface dialoginterface)
    {
    }

    public void onClick(View view)
    {
        Hashtable hashtable;
        hashtable = new Hashtable();
        hashtable.put(g.c, "m-Payment");
        if (n.y != null)
        {
            n.y.d();
        }
        if (!view.equals(ap)) goto _L2; else goto _L1
_L1:
        if (aq.size() != 0 && v())
        {
            hashtable.put(g.q, aq);
            hashtable.put(g.b, new Boolean(false));
            j = 4;
            if (B != null)
            {
                B.cancel();
                B = null;
            }
            B = new g(getParent(), hashtable, this, this);
            B.show();
        }
_L4:
        return;
_L2:
        if (!view.equals(au))
        {
            break; /* Loop/switch isn't completed */
        }
        if (av.size() != 0 && !ao.getText().equals("- PILIH -") && x() && !av.contains("- PILIH -"))
        {
            hashtable.put(g.q, av);
            hashtable.put(g.b, new Boolean(false));
            j = 5;
            if (B != null)
            {
                B.cancel();
                B = null;
            }
            B = new g(getParent(), hashtable, this, this);
            B.show();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!view.equals(W))
        {
            break; /* Loop/switch isn't completed */
        }
        if (X.size() != 1)
        {
            hashtable.put(g.q, X);
            hashtable.put(g.b, new Boolean(false));
            j = 0;
            if (B != null)
            {
                B.cancel();
                B = null;
            }
            B = new g(getParent(), hashtable, this, this);
            B.show();
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (view.equals(ak))
        {
            if (al.size() != 1)
            {
                hashtable.put(g.q, al);
                hashtable.put(g.b, new Boolean(false));
                j = 3;
                if (B != null)
                {
                    B.cancel();
                    B = null;
                }
                B = new g(getParent(), hashtable, this, this);
                B.show();
                return;
            }
        } else
        {
            if (view.equals(ag))
            {
                if (aG.equals("3"))
                {
                    az = (String)i.get("amout_min");
                    aA = (String)i.get("amout_max");
                    hashtable.put(g.t, f.get(2));
                    hashtable.put(g.b, new Boolean(true));
                    hashtable.put(g.x, new Integer(az));
                    hashtable.put(g.y, new Integer(aA));
                    hashtable.put(g.v, new Integer("0"));
                    hashtable.put(g.w, new Integer("0"));
                    hashtable.put(g.A, aF);
                    hashtable.put(g.f, getString(0x7f0c007d));
                    hashtable.put(g.h, getString(0x7f0c007e));
                    j = 2;
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
                    aG.equals("4");
                    return;
                }
            }
            if (view.equals(ab))
            {
                if (ac != null)
                {
                    if (ac.size() != 0)
                    {
                        if (aG.equals("8"))
                        {
                            hashtable.put(g.t, g.get(1));
                        } else
                        {
                            hashtable.put(g.t, f.get(1));
                        }
                        hashtable.put(g.b, new Boolean(aQ));
                        hashtable.put(g.x, new Integer("0"));
                        hashtable.put(g.y, new Integer("0"));
                        hashtable.put(g.v, new Integer((String)i.get("input_min")));
                        hashtable.put(g.w, new Integer((String)i.get("input_max")));
                        hashtable.put(g.j, "Input");
                        hashtable.put(g.k, getResources().getDrawable(0x7f020076));
                        hashtable.put(g.l, getResources().getDrawable(0x7f020075));
                        hashtable.put(g.m, "Daftar Pembayaran");
                        hashtable.put(com.bca.mobile.transaction.g.n, getResources().getDrawable(0x7f020076));
                        hashtable.put(g.o, getResources().getDrawable(0x7f020075));
                        hashtable.put(g.q, ac);
                        hashtable.put(g.u, "Simpan ke Daftar Pembayaran");
                        hashtable.put(g.z, new Boolean(aR));
                        hashtable.put(g.A, aP);
                    } else
                    {
                        if (aG.equals("8"))
                        {
                            hashtable.put(g.t, g.get(1));
                        } else
                        {
                            hashtable.put(g.t, f.get(1));
                        }
                        hashtable.put(g.b, new Boolean(true));
                        hashtable.put(g.x, new Integer("0"));
                        hashtable.put(g.y, new Integer("0"));
                        hashtable.put(g.v, new Integer((String)i.get("input_min")));
                        hashtable.put(g.w, new Integer((String)i.get("input_max")));
                        hashtable.put(g.A, aP);
                        hashtable.put(g.u, "Simpan ke Daftar Pembayaran");
                        hashtable.put(g.z, new Boolean(aR));
                    }
                } else
                {
                    if (aG.equals("8"))
                    {
                        hashtable.put(g.t, g.get(1));
                    } else
                    {
                        hashtable.put(g.t, f.get(1));
                    }
                    hashtable.put(g.b, new Boolean(true));
                    hashtable.put(g.x, new Integer("0"));
                    hashtable.put(g.y, new Integer("0"));
                    hashtable.put(g.v, new Integer((String)i.get("input_min")));
                    hashtable.put(g.w, new Integer((String)i.get("input_max")));
                    hashtable.put(g.A, aP);
                    hashtable.put(g.u, "Simpan ke Daftar Pembayaran");
                    hashtable.put(g.z, new Boolean(aR));
                }
                hashtable.put(g.f, getString(0x7f0c0077));
                hashtable.put(g.g, getString(0x7f0c007b));
                hashtable.put(g.h, getString(0x7f0c007c));
                j = 1;
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
        if (true) goto _L4; else goto _L6
_L6:
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        super.onItemClick(adapterview, view, i1, l1);
        j;
        JVM INSTR tableswitch 0 5: default 52
    //                   0 53
    //                   1 74
    //                   2 52
    //                   3 149
    //                   4 154
    //                   5 173;
           goto _L1 _L2 _L3 _L1 _L4 _L5 _L6
_L1:
        return;
_L2:
        q();
        if (!aG.equals("8"))
        {
            p();
            return;
        }
          goto _L1
_L3:
        boolean flag;
        if (l1 == 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aQ = flag;
        if (aG.equals("8") && !aQ)
        {
            p();
        }
        ay = (String)ac.get(ad);
        aa.setText(ay);
        return;
_L4:
        r();
        return;
_L5:
        s();
        n();
        try
        {
            u();
            w();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AdapterView adapterview)
        {
            return;
        }
_L6:
        t();
        try
        {
            w();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AdapterView adapterview)
        {
            return;
        }
    }

    public void onResultButtonCancel(View view)
    {
        E = 0;
    }

    public void onResultButtonOK(View view)
    {
        if (E != 1) goto _L2; else goto _L1
_L1:
        if (!k(aF)) goto _L4; else goto _L3
_L3:
        f();
        o();
_L6:
        E = 0;
        return;
_L4:
        E = 2;
        return;
_L2:
        if (E == 2 && aS == 2)
        {
            a("m-Payment", aO, true, aA.length());
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
