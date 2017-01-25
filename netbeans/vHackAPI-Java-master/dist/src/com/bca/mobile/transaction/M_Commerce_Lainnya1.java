// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.EditText;
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
//            i, am, an, ao, 
//            ar, ap, aq

public class M_Commerce_Lainnya1 extends ShareActivity
    implements c, i
{

    private ArrayList T;
    private ArrayList U;
    private String V;
    private int W;
    private String X;
    private String Y;
    private Integer Z;
    int a;
    private String aa;
    private RelativeLayout ab;
    private TextView ac;
    private TextView ad;
    private RelativeLayout ae;
    private TextView af;
    private TextView ag;
    private RelativeLayout ah;
    private TextView ai;
    private TextView aj;
    private RelativeLayout ak;
    private TextView al;
    private TextView am;
    private RelativeLayout an;
    private TextView ao;
    private TextView ap;
    private RelativeLayout aq;
    private TextView ar;
    private TextView as;
    private RelativeLayout at;
    private TextView au;
    private TextView av;
    private int aw;
    private int ax;
    private int ay;
    int b;
    android.widget.AdapterView.OnItemClickListener c;
    android.widget.AdapterView.OnItemClickListener d;
    android.widget.AdapterView.OnItemClickListener e;
    private int f;
    private final int g = 1;
    private final int h = 2;
    private ArrayList i;
    private ArrayList j;
    private ArrayList k;
    private String l;
    private String m;
    private ArrayList n;

    public M_Commerce_Lainnya1()
    {
        f = 0;
        ax = 0;
        ay = 0;
        c = new am(this);
        d = new an(this);
        e = new ao(this);
    }

    static TextView a(M_Commerce_Lainnya1 m_commerce_lainnya1)
    {
        return m_commerce_lainnya1.am;
    }

    static void a(M_Commerce_Lainnya1 m_commerce_lainnya1, int i1)
    {
        m_commerce_lainnya1.M = i1;
    }

    static void a(M_Commerce_Lainnya1 m_commerce_lainnya1, long l1)
    {
        m_commerce_lainnya1.N = l1;
    }

    static void a(M_Commerce_Lainnya1 m_commerce_lainnya1, Integer integer)
    {
        m_commerce_lainnya1.Z = integer;
    }

    static void a(M_Commerce_Lainnya1 m_commerce_lainnya1, String s)
    {
        m_commerce_lainnya1.X = s;
    }

    static void a(M_Commerce_Lainnya1 m_commerce_lainnya1, ArrayList arraylist)
    {
        m_commerce_lainnya1.n = arraylist;
    }

    static void a(M_Commerce_Lainnya1 m_commerce_lainnya1, boolean flag)
    {
        m_commerce_lainnya1.K = flag;
    }

    static ArrayList b(M_Commerce_Lainnya1 m_commerce_lainnya1)
    {
        return m_commerce_lainnya1.j;
    }

    static void b(M_Commerce_Lainnya1 m_commerce_lainnya1, String s)
    {
        m_commerce_lainnya1.Y = s;
    }

    static void b(M_Commerce_Lainnya1 m_commerce_lainnya1, ArrayList arraylist)
    {
        m_commerce_lainnya1.U = arraylist;
    }

    static int c(M_Commerce_Lainnya1 m_commerce_lainnya1)
    {
        return m_commerce_lainnya1.W;
    }

    static void c(M_Commerce_Lainnya1 m_commerce_lainnya1, String s)
    {
        m_commerce_lainnya1.aa = s;
    }

    static void c(M_Commerce_Lainnya1 m_commerce_lainnya1, ArrayList arraylist)
    {
        m_commerce_lainnya1.T = arraylist;
    }

    static int d(M_Commerce_Lainnya1 m_commerce_lainnya1)
    {
        return m_commerce_lainnya1.f;
    }

    private void d()
    {
        String as1[] = r.a(l, ":@:");
        int j1 = as1.length;
        int i1 = 0;
        do
        {
            if (i1 >= j1)
            {
                return;
            }
            String as2[] = r.a(as1[i1], ":#:");
            ar ar1 = new ar(this, as2[0], as2[1], as2[2], as2[3], as2[4], as2[5], as2[6], as2[7]);
            j.add(ar1);
            i.add(ar1.a());
            i1++;
        } while (true);
    }

    static void d(M_Commerce_Lainnya1 m_commerce_lainnya1, String s)
    {
        m_commerce_lainnya1.V = s;
    }

    static String e(M_Commerce_Lainnya1 m_commerce_lainnya1)
    {
        return m_commerce_lainnya1.X;
    }

    private void e()
    {
        if (ac != null && y.isActive())
        {
            y.hideSoftInputFromWindow(ac.getWindowToken(), 0);
        }
    }

    static void e(M_Commerce_Lainnya1 m_commerce_lainnya1, String s)
    {
        m_commerce_lainnya1.G = s;
    }

    static TextView f(M_Commerce_Lainnya1 m_commerce_lainnya1)
    {
        return m_commerce_lainnya1.aj;
    }

    static ArrayList g(M_Commerce_Lainnya1 m_commerce_lainnya1)
    {
        return m_commerce_lainnya1.n;
    }

    static ArrayList h(M_Commerce_Lainnya1 m_commerce_lainnya1)
    {
        return m_commerce_lainnya1.U;
    }

    static ArrayList i(M_Commerce_Lainnya1 m_commerce_lainnya1)
    {
        return m_commerce_lainnya1.T;
    }

    static EditText j(M_Commerce_Lainnya1 m_commerce_lainnya1)
    {
        return m_commerce_lainnya1.L;
    }

    public static ArrayList j(String s)
    {
        ArrayList arraylist = new ArrayList();
        s = s.split(":@:");
        int j1 = s.length;
        int i1 = 0;
        do
        {
            if (i1 >= j1)
            {
                return arraylist;
            }
            arraylist.add((new StringBuilder("Rp. ")).append(r.d(s[i1])).append(".00").toString());
            i1++;
        } while (true);
    }

    protected final void a()
    {
        String s;
        int i1;
        i1 = Integer.parseInt(((ar)j.get(W)).b());
        f = 1;
        if (i1 != 5 && i1 != 6 && i1 != 7 && ag.getText().toString().equals(""))
        {
            a(null, getString(0x7f0c0080).replace("#LABEL#", af.getText().toString()).replace(":", ""), getParent(), false, "Back");
            return;
        }
        if (i1 == 3 && aj.getText().toString().equals(""))
        {
            a(null, getString(0x7f0c0080).replace("#LABEL#", ai.getText().toString()).replace(":", ""), getParent(), false, "Back");
            return;
        }
        if (i1 == 6 && as.getText().toString().equals(""))
        {
            a(null, getString(0x7f0c0080).replace("#LABEL#", ar.getText().toString()).replace(":", ""), getParent(), false, "Back");
            return;
        }
        if (i1 == 7)
        {
            if (av.getText().toString().equals(""))
            {
                a(null, getString(0x7f0c0080).replace("#LABEL#", au.getText().toString()).replace(":", ""), getParent(), false, "Back");
                return;
            }
            if (ap.getText().toString().equals(""))
            {
                a(null, getString(0x7f0c0080).replace("#LABEL#", getString(0x7f0c007f)).replace(":", ""), getParent(), false, "Back");
                return;
            } else
            {
                f();
                e();
                return;
            }
        }
        s = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(""))).append("PGI").toString()))).append(":!:").toString()))).append("CLY2").toString()))).append(":!:").toString()))).append(ad.getText().toString()).toString()))).append(":!:").toString()))).append(((ar)j.get(W)).b()).toString()))).append(":!:").toString();
        i1;
        JVM INSTR tableswitch 1 6: default 612
    //                   1 710
    //                   2 794
    //                   3 878
    //                   4 977
    //                   5 1076
    //                   6 1160;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        s = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s))).append(ap.getText().toString()).toString()))).append(":!:").toString()))).append("2").toString();
        System.out.println((new StringBuilder("==== send :")).append(s).toString());
        g(s);
        return;
_L2:
        s = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s))).append(ag.getText().toString()).toString()))).append(":!:").toString()))).toString()))).append(":!:").toString();
        continue; /* Loop/switch isn't completed */
_L3:
        s = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s))).append(ag.getText().toString()).toString()))).append(":!:").toString()))).toString()))).append(":!:").toString();
        continue; /* Loop/switch isn't completed */
_L4:
        s = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s))).append(ag.getText().toString()).toString()))).append(":!:").toString()))).append(aj.getText().toString()).toString()))).append(":!:").toString();
        continue; /* Loop/switch isn't completed */
_L5:
        s = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s))).append(ag.getText().toString()).toString()))).append(":!:").toString()))).append(am.getText().toString()).toString()))).append(":!:").toString();
        continue; /* Loop/switch isn't completed */
_L6:
        s = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s))).toString()))).append(":!:").toString()))).append(am.getText().toString()).toString()))).append(":!:").toString();
        continue; /* Loop/switch isn't completed */
_L7:
        s = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s))).append(as.getText().toString()).toString()))).append(":!:").toString()))).toString()))).append(":!:").toString();
        if (true) goto _L1; else goto _L8
_L8:
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
        Object obj1;
        int j1;
        int k1;
        obj = (HashMap)obj;
        i1 = ((Integer)((HashMap) (obj)).get("MIN")).intValue();
        j1 = ((Integer)((HashMap) (obj)).get("MAX")).intValue();
        obj1 = (String)((HashMap) (obj)).get("TEXT");
        k1 = ((String) (obj1)).length();
        obj = "";
        if (k1 != 0) goto _L6; else goto _L5
_L5:
        obj = getString(0x7f0c0080).replace("#LABEL#", af.getText().toString()).replace(":", "");
_L22:
        if (((String) (obj)).equals("")) goto _L8; else goto _L7
_L7:
        bn.a(((String) (obj)), getParent());
_L4:
        return;
_L6:
        if (i1 == j1 && k1 != i1)
        {
            obj = getString(0x7f0c0081).replace("#SD.MIN#", (new StringBuilder()).append(i1).toString()).replace("#SD.MAX#", (new StringBuilder()).append(j1).toString()).replace("#LABEL#", af.getText().toString()).replace(":", "");
        } else
        if (k1 < i1 || k1 > j1)
        {
            obj = getString(0x7f0c0082).replace("#SD.MIN#", (new StringBuilder()).append(i1).toString()).replace("#SD.MAX#", (new StringBuilder()).append(j1).toString()).replace("#LABEL#", af.getText().toString()).replace(":", "");
        }
        continue; /* Loop/switch isn't completed */
_L8:
        ag.setText(((CharSequence) (obj1)));
        com.d.b.a();
        return;
_L2:
        if (i1 != 4099) goto _L10; else goto _L9
_L9:
        obj = (HashMap)obj;
        j1 = ((Integer)((HashMap) (obj)).get("MIN")).intValue();
        k1 = ((Integer)((HashMap) (obj)).get("MAX")).intValue();
        obj = (String)((HashMap) (obj)).get("TEXT");
        if (((String) (obj)).length() != 0) goto _L12; else goto _L11
_L11:
        obj = getString(0x7f0c009b).replace("#SD.LABEL2#", ai.getText().toString()).replace(":", "");
        i1 = 0;
_L13:
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
            obj1 = getString(0x7f0c009a).replace("#SD.LABEL2#", ai.getText().toString()).replace("#SD.MIN_AMOUNT#", (new StringBuilder(String.valueOf(j1))).toString()).replace("#SD.MAX_AMOUNT#", (new StringBuilder(String.valueOf(k1))).toString()).replace(":", "");
        }
        if (!((String) (obj1)).equals(""))
        {
            bn.a(((String) (obj1)), getParent());
            return;
        } else
        {
            aj.setText((new StringBuilder(String.valueOf(i1))).toString());
            com.d.b.a();
            return;
        }
_L12:
        i1 = (new Integer(((String) (obj)))).intValue();
        obj = "";
        continue; /* Loop/switch isn't completed */
        obj;
        System.out.println((new StringBuilder("Error - ")).append(((Exception) (obj)).toString()).toString());
        i1 = 0;
        obj = "";
        if (true) goto _L13; else goto _L10
_L10:
        if (i1 != 4102)
        {
            break; /* Loop/switch isn't completed */
        }
        if (obj instanceof HashMap)
        {
            obj = (HashMap)obj;
            i1 = ((Integer)((HashMap) (obj)).get("MIN")).intValue();
            j1 = ((Integer)((HashMap) (obj)).get("MAX")).intValue();
            obj1 = (String)((HashMap) (obj)).get("TEXT");
            k1 = ((String) (obj1)).length();
            obj = "";
            if (k1 == 0)
            {
                obj = getString(0x7f0c0080).replace("#LABEL#", ar.getText().toString()).replace(":", "");
            } else
            if (i1 == j1 && k1 != i1)
            {
                obj = getString(0x7f0c0081).replace("#SD.MIN#", (new StringBuilder()).append(i1).toString()).replace("#SD.MAX#", (new StringBuilder()).append(j1).toString()).replace("#LABEL#", ar.getText().toString()).replace(":", "");
            } else
            if (k1 < i1 || k1 > j1)
            {
                obj = getString(0x7f0c0082).replace("#SD.MIN#", (new StringBuilder()).append(i1).toString()).replace("#SD.MAX#", (new StringBuilder()).append(j1).toString()).replace("#LABEL#", ar.getText().toString()).replace(":", "");
            }
            if (!((String) (obj)).equals(""))
            {
                bn.a(((String) (obj)), getParent());
                return;
            } else
            {
                as.setText(((CharSequence) (obj1)));
                com.d.b.a();
                return;
            }
        }
        if (true) goto _L4; else goto _L14
_L14:
        if (i1 != 4105)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!(obj instanceof HashMap)) goto _L4; else goto _L15
_L15:
        obj = (HashMap)obj;
        i1 = ((Integer)((HashMap) (obj)).get("MIN")).intValue();
        j1 = ((Integer)((HashMap) (obj)).get("MAX")).intValue();
        obj1 = (String)((HashMap) (obj)).get("TEXT");
        k1 = ((String) (obj1)).length();
        obj = "";
        if (k1 == 0)
        {
            obj = getString(0x7f0c0080).replace("#LABEL#", au.getText().toString()).replace(":", "");
        } else
        if (i1 == j1 && k1 != i1)
        {
            obj = getString(0x7f0c0081).replace("#SD.MIN#", (new StringBuilder()).append(i1).toString()).replace("#SD.MAX#", (new StringBuilder()).append(j1).toString()).replace("#LABEL#", au.getText().toString()).replace(":", "");
        } else
        if (k1 < i1 || k1 > j1)
        {
            obj = getString(0x7f0c0082).replace("#SD.MIN#", (new StringBuilder()).append(i1).toString()).replace("#SD.MAX#", (new StringBuilder()).append(j1).toString()).replace("#LABEL#", au.getText().toString()).replace(":", "");
        }
        if (!((String) (obj)).equals(""))
        {
            bn.a(((String) (obj)), getParent());
            return;
        } else
        {
            av.setText(((CharSequence) (obj1)));
            com.d.b.a();
            return;
        }
        if (i1 != 4112 || !(obj instanceof HashMap)) goto _L4; else goto _L16
_L16:
        obj = (HashMap)obj;
        i1 = ((Integer)((HashMap) (obj)).get("MIN")).intValue();
        j1 = ((Integer)((HashMap) (obj)).get("MAX")).intValue();
        obj1 = (String)((HashMap) (obj)).get("TEXT");
        k1 = ((String) (obj1)).length();
        obj = "";
        if (k1 != 0) goto _L18; else goto _L17
_L17:
        obj = getString(0x7f0c0080).replace("#LABEL#", getString(0x7f0c007f)).replace(":", "");
_L20:
        if (!((String) (obj)).equals(""))
        {
            bn.a(((String) (obj)), getParent());
            return;
        }
        break; /* Loop/switch isn't completed */
_L18:
        if (i1 == j1 && k1 != i1)
        {
            obj = getString(0x7f0c0081).replace("#SD.MIN#", (new StringBuilder()).append(i1).toString()).replace("#SD.MAX#", (new StringBuilder()).append(j1).toString()).replace("#LABEL#", getString(0x7f0c007f)).replace(":", "");
        } else
        if (k1 < i1 || k1 > j1)
        {
            obj = getString(0x7f0c0082).replace("#SD.MIN#", (new StringBuilder()).append(i1).toString()).replace("#SD.MAX#", (new StringBuilder()).append(j1).toString()).replace("#LABEL#", getString(0x7f0c007f)).replace(":", "");
        }
        if (true) goto _L20; else goto _L19
_L19:
        ap.setText(((CharSequence) (obj1)));
        com.d.b.a();
        return;
        if (true) goto _L22; else goto _L21
_L21:
    }

    public final void a(int i1, String as1[])
    {
        a(((Runnable) (new ap(this, as1))));
    }

    protected final void a(String s)
    {
        H = "";
        String s1;
        int i1;
        i1 = Integer.parseInt(((ar)j.get(W)).b());
        s1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(""))).append("PGI").toString()))).append(":!:").toString()))).append("CLY2").toString()))).append(":!:").toString()))).append(ad.getText().toString()).toString()))).append(":!:").toString()))).append(i1).toString()))).append(":!:").toString();
        i1;
        JVM INSTR tableswitch 1 6: default 1232
    //                   1 572
    //                   2 663
    //                   3 754
    //                   4 845
    //                   5 936
    //                   6 1012;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (i1 != 7) goto _L9; else goto _L8
_L8:
        s1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s1))).append(av.getText().toString()).toString()))).append(":!:").toString()))).toString()))).append(":!:").toString()))).toString()))).append(":!:").toString()))).toString()))).append(":!:").toString()))).append(ap.getText().toString()).toString()))).append(":!:").toString();
_L10:
        s1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s1))).append(Y).toString()))).append(":!:").toString()))).append(n.af.a((new StringBuilder(String.valueOf(s))).append(":-:").append(Y).toString())).toString()))).append(":!:").toString()))).append("3").toString();
        f = 2;
        getParent();
        a(s, s1);
        return;
_L2:
        try
        {
            s1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s1))).append(ag.getText().toString()).toString()))).append(":!:").toString()))).append(aa).toString()))).append(":!:").toString();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return;
        }
          goto _L1
_L3:
        s1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s1))).append(ag.getText().toString()).toString()))).append(":!:").toString()))).append(aa).toString()))).append(":!:").toString();
          goto _L1
_L4:
        s1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s1))).append(ag.getText().toString()).toString()))).append(":!:").toString()))).append(aa).toString()))).append(":!:").toString();
          goto _L1
_L5:
        s1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s1))).append(ag.getText().toString()).toString()))).append(":!:").toString()))).append(aa).toString()))).append(":!:").toString();
          goto _L1
_L6:
        s1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s1))).toString()))).append(":!:").toString()))).append(aa).toString()))).append(":!:").toString();
          goto _L1
_L7:
        s1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s1))).append(as.getText().toString()).toString()))).append(":!:").toString()))).append(I).toString()))).append(":!:").toString();
          goto _L1
_L9:
        s1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s1))).append(ap.getText().toString()).toString()))).append(":!:").toString()))).append(a).toString()))).append(":!:").toString()))).toString()))).append(":!:").toString();
          goto _L10
    }

    public final void a(String s, String s1, int i1)
    {
        E = 1;
        a(s, s1, getParent(), i1, U);
    }

    public final void a(String s, String s1, boolean flag)
    {
        if (Integer.parseInt(((ar)j.get(W)).b()) == 6)
        {
            E = 3;
        } else
        {
            E = 1;
        }
        a(s, s1, getParent(), flag, 16);
    }

    public final void a(String s, boolean flag, boolean flag1)
    {
        a(((Runnable) (new aq(this, s))));
    }

    protected final void b()
    {
    }

    public final void b(String s)
    {
        if (E == 1)
        {
            ay = 0;
            aa = s;
        }
    }

    public final void c()
    {
        ay = 0;
        H = "";
        if (E == 1)
        {
            e();
        } else
        if (E == 2)
        {
            G = "";
            a("m-Commerce", X, true);
            return;
        }
        E = 0;
    }

    final void e(int i1)
    {
        W = i1;
        ae.setVisibility(8);
        ah.setVisibility(8);
        ak.setVisibility(8);
        aq.setVisibility(8);
        at.setVisibility(8);
        ad.setText(((ar)j.get(i1)).a());
        ag.setText("");
        aj.setText("");
        am.setText("");
        as.setText("");
        av.setText("");
        String s = ((ar)j.get(i1)).b();
        aw = Integer.parseInt(s);
        String as1[] = ((ar)j.get(i1)).g();
        String as2[] = ((ar)j.get(i1)).h();
        if (Integer.parseInt(s) != 7)
        {
            ao.setText(getString(0x7f0c00a2));
            ap.setText((CharSequence)k.get(ax));
        }
        switch (Integer.parseInt(s))
        {
        default:
            return;

        case 1: // '\001'
            ae.setVisibility(0);
            af.setText(as1[0]);
            return;

        case 2: // '\002'
            ae.setVisibility(0);
            af.setText(as1[0]);
            return;

        case 3: // '\003'
            ae.setVisibility(0);
            ah.setVisibility(0);
            af.setText(as1[0]);
            ai.setText(as1[1]);
            return;

        case 4: // '\004'
            ae.setVisibility(0);
            ak.setVisibility(0);
            af.setText(as1[0]);
            al.setText(as1[1]);
            am.setText(as2[0]);
            return;

        case 5: // '\005'
            ak.setVisibility(0);
            al.setText(as1[0]);
            am.setText(as2[0]);
            return;

        case 6: // '\006'
            aq.setVisibility(0);
            ar.setText(as1[0]);
            return;

        case 7: // '\007'
            at.setVisibility(0);
            break;
        }
        au.setText(as1[0]);
        ao.setText(as1[1]);
        ap.setText("");
    }

    final void f(int i1)
    {
        ax = i1;
        if (aw != 7)
        {
            ap.setText((CharSequence)k.get(i1));
        }
    }

    public void onClick(View view)
    {
        if (ab.equals(view) && l.length() > 0)
        {
            com.d.b.a(getParent(), i, c);
            return;
        }
        if (ae.equals(view))
        {
            int i1 = Integer.parseInt(((ar)j.get(W)).c());
            int j2 = Integer.parseInt(((ar)j.get(W)).d());
            com.d.b.a(getParent(), 4098, af.getText().toString(), ag.getText().toString(), i1, j2, this);
            return;
        }
        if (ah.equals(view))
        {
            int j1 = Integer.parseInt(((ar)j.get(W)).e());
            int k2 = Integer.parseInt(((ar)j.get(W)).f());
            com.d.b.a(getParent(), 4099, ai.getText().toString(), aj.getText().toString(), j1, k2, this);
            return;
        }
        if (ak.equals(view))
        {
            view = new ArrayList(Arrays.asList(((ar)j.get(W)).h()));
            com.d.b.a(getParent(), view, d);
            return;
        }
        if (an.equals(view))
        {
            if (aw == 7)
            {
                int k1 = Integer.parseInt(((ar)j.get(W)).c());
                int l2 = Integer.parseInt(((ar)j.get(W)).d());
                com.d.b.a(getParent(), 4112, ao.getText().toString(), ap.getText().toString(), k1, l2, this);
                return;
            } else
            {
                com.d.b.a(getParent(), k, e);
                return;
            }
        }
        if (aq.equals(view))
        {
            int l1 = Integer.parseInt(((ar)j.get(W)).c());
            int i3 = Integer.parseInt(((ar)j.get(W)).d());
            com.d.b.a(getParent(), 4102, ar.getText().toString(), as.getText().toString(), l1, i3, this);
            return;
        }
        if (at.equals(view))
        {
            int i2 = Integer.parseInt(((ar)j.get(W)).c());
            int j3 = Integer.parseInt(((ar)j.get(W)).d());
            com.d.b.a(getParent(), 4105, au.getText().toString(), av.getText().toString(), i2, j3, this);
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
        i = new ArrayList();
        j = new ArrayList();
        k = new ArrayList();
        bundle = (String[])n.m.get("data");
        l = bundle[1];
        m = bundle[2];
        d();
        k = new ArrayList(Arrays.asList(r.a(m, ":@:")));
        ab = (RelativeLayout)findViewById(0x7f0b0057);
        ac = (TextView)findViewById(0x7f0b0058);
        ad = (TextView)findViewById(0x7f0b0059);
        ae = (RelativeLayout)findViewById(0x7f0b005b);
        af = (TextView)findViewById(0x7f0b005c);
        ag = (TextView)findViewById(0x7f0b005d);
        ah = (RelativeLayout)findViewById(0x7f0b0067);
        ai = (TextView)findViewById(0x7f0b0068);
        aj = (TextView)findViewById(0x7f0b0069);
        ak = (RelativeLayout)findViewById(0x7f0b006b);
        al = (TextView)findViewById(0x7f0b006c);
        am = (TextView)findViewById(0x7f0b006d);
        an = (RelativeLayout)findViewById(0x7f0b006f);
        ao = (TextView)findViewById(0x7f0b0070);
        ap = (TextView)findViewById(0x7f0b0071);
        aq = (RelativeLayout)findViewById(0x7f0b005f);
        ar = (TextView)findViewById(0x7f0b0060);
        as = (TextView)findViewById(0x7f0b0061);
        at = (RelativeLayout)findViewById(0x7f0b0063);
        au = (TextView)findViewById(0x7f0b0064);
        av = (TextView)findViewById(0x7f0b0065);
        ab.setOnClickListener(this);
        ae.setOnClickListener(this);
        ah.setOnClickListener(this);
        ak.setOnClickListener(this);
        an.setOnClickListener(this);
        aq.setOnClickListener(this);
        at.setOnClickListener(this);
        ab.setVisibility(0);
        an.setVisibility(0);
        ac.setText(getString(0x7f0c00a0));
        ao.setText(getString(0x7f0c00a2));
        e(0);
        f(0);
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        K = false;
        L.setText((CharSequence)U.get(i1));
        aa = (String)U.get(i1);
        if (T != null)
        {
            int k1 = T.size();
            int j1 = 0;
            do
            {
                if (j1 >= k1)
                {
                    return;
                }
                if (((String)U.get(i1)).equalsIgnoreCase((String)T.get(j1)))
                {
                    a = 1;
                }
                j1++;
            } while (true);
        } else
        {
            a = 0;
            return;
        }
    }

    public void onResultButtonCancel(View view)
    {
        H = "";
        if (E == 3)
        {
            E = 1;
            ay = 0;
            a("m-Commerce", X, b);
            return;
        } else
        {
            G = "";
            E = 0;
            ay = 0;
            return;
        }
    }

    public void onResultButtonOK(View view)
    {
        if (E != 1 && E != 3) goto _L2; else goto _L1
_L1:
        String s1;
        int i1;
        s1 = aa;
        i1 = Integer.parseInt(((ar)j.get(W)).b());
        if (i1 != 1 && i1 != 6 || ay != 0) goto _L4; else goto _L3
_L3:
        String s = "";
        if (i1 != 6 || !L.getText().toString().equalsIgnoreCase("") && !L.getText().toString().equals(null)) goto _L6; else goto _L5
_L5:
        view = "142 - Anda belum menginput Jumlah Bayar.";
_L11:
        if (view == "") goto _L4; else goto _L7
_L7:
        E = 2;
        a(null, view, getParent(), false, "Back");
        aa = s1;
        i1 = 0;
_L9:
        if (i1 != 0)
        {
            if (aw != 6 || ay != 0)
            {
                break; /* Loop/switch isn't completed */
            }
            ay = 1;
            E = 3;
            G = L.getText().toString();
            if (G.contains("Rp."))
            {
                G = G.replaceFirst("Rp.", "");
            }
            i1 = Integer.valueOf(G.substring(0, G.length() - 3).replaceAll(",", "").trim()).intValue();
            int j1 = Z.intValue();
            a("m-Commerce", V.replaceAll("#AMOUNT#", G).replaceAll("#ADMIN#", (new StringBuilder(String.valueOf(r.d(Z.toString())))).append(".00").toString()).replaceAll("#BAYAR#", (new StringBuilder(String.valueOf(r.d(Integer.valueOf(i1 + j1).toString())))).append(".00").toString()).replaceAll(":@:", "\n"), false);
        }
        return;
_L6:
        if (i1 == 1 && (aa.equalsIgnoreCase("") || aa.equals(null)))
        {
            view = "140 - Anda belum menginput Jumlah Uang.";
            continue; /* Loop/switch isn't completed */
        }
        int k1 = Integer.parseInt(((ar)j.get(W)).e());
        long l2 = Long.parseLong(((ar)j.get(W)).f());
        long l1;
        if (i1 == 6)
        {
            Object obj = L.getText().toString();
            view = ((View) (obj));
            if (((String) (obj)).contains("Rp."))
            {
                view = ((String) (obj)).replaceFirst("Rp.", "");
            }
            obj = view;
            if (view.contains(" "))
            {
                obj = view.replaceAll(" ", "");
            }
            view = ((View) (obj));
            if (((String) (obj)).contains(","))
            {
                view = ((String) (obj)).replaceAll(",", "");
            }
            obj = view;
            if (view.contains(".00"))
            {
                obj = view.replace(".00", "");
            }
            I = ((String) (obj));
            l1 = Long.parseLong(((String) (obj)));
        } else
        {
            l1 = Long.parseLong(aa);
        }
        view = s;
        if (!"".equals(""))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (l1 >= (long)k1)
        {
            view = s;
            if (l1 <= l2)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        if (i1 == 6)
        {
            view = (new StringBuilder("142 - Pembelian minimal Rp ")).append(k1).append(".").toString();
            G = "";
        } else
        {
            view = (new StringBuilder("142 - Jumlah pembayaran harus diisi antara Rp ")).append(k1).append(" - Rp ").append(l2).append(".").toString();
        }
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = 1;
        if (true) goto _L9; else goto _L8
_L8:
        f();
        e();
        return;
_L2:
        if (E == 2)
        {
            if (aw == 6)
            {
                a("m-Commerce", X, 16);
                return;
            } else
            {
                a("m-Commerce", X, true);
                return;
            }
        }
        E = 0;
        return;
        if (true) goto _L11; else goto _L10
_L10:
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
