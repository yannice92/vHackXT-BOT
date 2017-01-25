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
import android.widget.ImageView;
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
//            i, ay, az, ba, 
//            bd, bb, bc

public class M_Commerce_PMA extends ShareActivity
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
    private ImageView ae;
    private RelativeLayout af;
    private TextView ag;
    private TextView ah;
    private RelativeLayout ai;
    private TextView aj;
    private TextView ak;
    private RelativeLayout al;
    private TextView am;
    private TextView an;
    private RelativeLayout ao;
    private TextView ap;
    private TextView aq;
    private RelativeLayout ar;
    private TextView as;
    private TextView at;
    private RelativeLayout au;
    private TextView av;
    private TextView aw;
    private int ax;
    private int ay;
    private int az;
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

    public M_Commerce_PMA()
    {
        f = 0;
        ay = 0;
        az = 0;
        c = new ay(this);
        d = new az(this);
        e = new ba(this);
    }

    static TextView a(M_Commerce_PMA m_commerce_pma)
    {
        return m_commerce_pma.an;
    }

    static void a(M_Commerce_PMA m_commerce_pma, int i1)
    {
        m_commerce_pma.M = i1;
    }

    static void a(M_Commerce_PMA m_commerce_pma, long l1)
    {
        m_commerce_pma.N = l1;
    }

    static void a(M_Commerce_PMA m_commerce_pma, Integer integer)
    {
        m_commerce_pma.Z = integer;
    }

    static void a(M_Commerce_PMA m_commerce_pma, String s)
    {
        m_commerce_pma.X = s;
    }

    static void a(M_Commerce_PMA m_commerce_pma, ArrayList arraylist)
    {
        m_commerce_pma.n = arraylist;
    }

    static void a(M_Commerce_PMA m_commerce_pma, boolean flag)
    {
        m_commerce_pma.K = flag;
    }

    static ArrayList b(M_Commerce_PMA m_commerce_pma)
    {
        return m_commerce_pma.j;
    }

    static void b(M_Commerce_PMA m_commerce_pma, String s)
    {
        m_commerce_pma.Y = s;
    }

    static void b(M_Commerce_PMA m_commerce_pma, ArrayList arraylist)
    {
        m_commerce_pma.U = arraylist;
    }

    static int c(M_Commerce_PMA m_commerce_pma)
    {
        return m_commerce_pma.W;
    }

    static void c(M_Commerce_PMA m_commerce_pma, String s)
    {
        m_commerce_pma.aa = s;
    }

    static void c(M_Commerce_PMA m_commerce_pma, ArrayList arraylist)
    {
        m_commerce_pma.T = arraylist;
    }

    static int d(M_Commerce_PMA m_commerce_pma)
    {
        return m_commerce_pma.f;
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
            bd bd1 = new bd(this, as2[0], as2[1], as2[2], as2[3], as2[4], as2[5], as2[6], as2[7]);
            if (as2[0] != null && as2[0].equals("PMA"))
            {
                j.add(bd1);
                i.add(bd1.a());
            }
            i1++;
        } while (true);
    }

    static void d(M_Commerce_PMA m_commerce_pma, String s)
    {
        m_commerce_pma.V = s;
    }

    static String e(M_Commerce_PMA m_commerce_pma)
    {
        return m_commerce_pma.X;
    }

    private void e()
    {
        if (ac != null && y.isActive())
        {
            y.hideSoftInputFromWindow(ac.getWindowToken(), 0);
        }
    }

    static void e(M_Commerce_PMA m_commerce_pma, String s)
    {
        m_commerce_pma.G = s;
    }

    static TextView f(M_Commerce_PMA m_commerce_pma)
    {
        return m_commerce_pma.ak;
    }

    static ArrayList g(M_Commerce_PMA m_commerce_pma)
    {
        return m_commerce_pma.n;
    }

    static ArrayList h(M_Commerce_PMA m_commerce_pma)
    {
        return m_commerce_pma.U;
    }

    static ArrayList i(M_Commerce_PMA m_commerce_pma)
    {
        return m_commerce_pma.T;
    }

    static EditText j(M_Commerce_PMA m_commerce_pma)
    {
        return m_commerce_pma.L;
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
        i1 = Integer.parseInt(((bd)j.get(W)).b());
        f = 1;
        if (i1 != 5 && i1 != 6 && i1 != 7 && ah.getText().toString().equals(""))
        {
            a(null, getString(0x7f0c0080).replace("#LABEL#", ag.getText().toString()).replace(":", ""), getParent(), false, "Back");
            return;
        }
        if (i1 == 3 && ak.getText().toString().equals(""))
        {
            a(null, getString(0x7f0c0080).replace("#LABEL#", aj.getText().toString()).replace(":", ""), getParent(), false, "Back");
            return;
        }
        if (i1 == 6 && at.getText().toString().equals(""))
        {
            a(null, getString(0x7f0c0080).replace("#LABEL#", as.getText().toString()).replace(":", ""), getParent(), false, "Back");
            return;
        }
        if (i1 == 7)
        {
            if (aw.getText().toString().equals(""))
            {
                a(null, getString(0x7f0c0080).replace("#LABEL#", av.getText().toString()).replace(":", ""), getParent(), false, "Back");
                return;
            }
            if (aq.getText().toString().equals(""))
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
        s = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(""))).append("PGI").toString()))).append(":!:").toString()))).append("CPMA").toString()))).append(":!:").toString()))).append("PMA").toString()))).append(":!:").toString()))).append(((bd)j.get(W)).b()).toString()))).append(":!:").toString();
        i1;
        JVM INSTR tableswitch 1 6: default 608
    //                   1 706
    //                   2 790
    //                   3 874
    //                   4 973
    //                   5 1072
    //                   6 1156;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        s = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s))).append(aq.getText().toString()).toString()))).append(":!:").toString()))).append("2").toString();
        System.out.println((new StringBuilder("==== send :")).append(s).toString());
        g(s);
        return;
_L2:
        s = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s))).append(ah.getText().toString()).toString()))).append(":!:").toString()))).toString()))).append(":!:").toString();
        continue; /* Loop/switch isn't completed */
_L3:
        s = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s))).append(ah.getText().toString()).toString()))).append(":!:").toString()))).toString()))).append(":!:").toString();
        continue; /* Loop/switch isn't completed */
_L4:
        s = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s))).append(ah.getText().toString()).toString()))).append(":!:").toString()))).append(ak.getText().toString()).toString()))).append(":!:").toString();
        continue; /* Loop/switch isn't completed */
_L5:
        s = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s))).append(ah.getText().toString()).toString()))).append(":!:").toString()))).append(an.getText().toString()).toString()))).append(":!:").toString();
        continue; /* Loop/switch isn't completed */
_L6:
        s = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s))).toString()))).append(":!:").toString()))).append(an.getText().toString()).toString()))).append(":!:").toString();
        continue; /* Loop/switch isn't completed */
_L7:
        s = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s))).append(at.getText().toString()).toString()))).append(":!:").toString()))).toString()))).append(":!:").toString();
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
        obj = getString(0x7f0c0080).replace("#LABEL#", ag.getText().toString()).replace(":", "");
_L22:
        if (((String) (obj)).equals("")) goto _L8; else goto _L7
_L7:
        bn.a(((String) (obj)), getParent());
_L4:
        return;
_L6:
        if (i1 == j1 && k1 != i1)
        {
            obj = getString(0x7f0c0081).replace("#SD.MIN#", (new StringBuilder()).append(i1).toString()).replace("#SD.MAX#", (new StringBuilder()).append(j1).toString()).replace("#LABEL#", ag.getText().toString()).replace(":", "");
        } else
        if (k1 < i1 || k1 > j1)
        {
            obj = getString(0x7f0c0082).replace("#SD.MIN#", (new StringBuilder()).append(i1).toString()).replace("#SD.MAX#", (new StringBuilder()).append(j1).toString()).replace("#LABEL#", ag.getText().toString()).replace(":", "");
        }
        continue; /* Loop/switch isn't completed */
_L8:
        ah.setText(((CharSequence) (obj1)));
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
        obj = getString(0x7f0c009b).replace("#SD.LABEL2#", aj.getText().toString()).replace(":", "");
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
            obj1 = getString(0x7f0c009a).replace("#SD.LABEL2#", aj.getText().toString()).replace("#SD.MIN_AMOUNT#", (new StringBuilder(String.valueOf(j1))).toString()).replace("#SD.MAX_AMOUNT#", (new StringBuilder(String.valueOf(k1))).toString()).replace(":", "");
        }
        if (!((String) (obj1)).equals(""))
        {
            bn.a(((String) (obj1)), getParent());
            return;
        } else
        {
            ak.setText((new StringBuilder(String.valueOf(i1))).toString());
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
                obj = getString(0x7f0c0080).replace("#LABEL#", as.getText().toString()).replace(":", "");
            } else
            if (i1 == j1 && k1 != i1)
            {
                obj = getString(0x7f0c0081).replace("#SD.MIN#", (new StringBuilder()).append(i1).toString()).replace("#SD.MAX#", (new StringBuilder()).append(j1).toString()).replace("#LABEL#", as.getText().toString()).replace(":", "");
            } else
            if (k1 < i1 || k1 > j1)
            {
                obj = getString(0x7f0c0082).replace("#SD.MIN#", (new StringBuilder()).append(i1).toString()).replace("#SD.MAX#", (new StringBuilder()).append(j1).toString()).replace("#LABEL#", as.getText().toString()).replace(":", "");
            }
            if (!((String) (obj)).equals(""))
            {
                bn.a(((String) (obj)), getParent());
                return;
            } else
            {
                at.setText(((CharSequence) (obj1)));
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
            obj = getString(0x7f0c0080).replace("#LABEL#", av.getText().toString()).replace(":", "");
        } else
        if (i1 == j1 && k1 != i1)
        {
            obj = getString(0x7f0c0081).replace("#SD.MIN#", (new StringBuilder()).append(i1).toString()).replace("#SD.MAX#", (new StringBuilder()).append(j1).toString()).replace("#LABEL#", av.getText().toString()).replace(":", "");
        } else
        if (k1 < i1 || k1 > j1)
        {
            obj = getString(0x7f0c0082).replace("#SD.MIN#", (new StringBuilder()).append(i1).toString()).replace("#SD.MAX#", (new StringBuilder()).append(j1).toString()).replace("#LABEL#", av.getText().toString()).replace(":", "");
        }
        if (!((String) (obj)).equals(""))
        {
            bn.a(((String) (obj)), getParent());
            return;
        } else
        {
            aw.setText(((CharSequence) (obj1)));
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
        aq.setText(((CharSequence) (obj1)));
        com.d.b.a();
        return;
        if (true) goto _L22; else goto _L21
_L21:
    }

    public final void a(int i1, String as1[])
    {
        a(((Runnable) (new bb(this, as1))));
    }

    protected final void a(String s)
    {
        H = "";
        String s1;
        int i1;
        i1 = Integer.parseInt(((bd)j.get(W)).b());
        s1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(""))).append("PGI").toString()))).append(":!:").toString()))).append("CPMA").toString()))).append(":!:").toString()))).append("PMA").toString()))).append(":!:").toString()))).append(i1).toString()))).append(":!:").toString();
        i1;
        JVM INSTR tableswitch 1 6: default 1224
    //                   1 564
    //                   2 655
    //                   3 746
    //                   4 837
    //                   5 928
    //                   6 1004;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (i1 != 7) goto _L9; else goto _L8
_L8:
        s1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s1))).append(aw.getText().toString()).toString()))).append(":!:").toString()))).toString()))).append(":!:").toString()))).toString()))).append(":!:").toString()))).toString()))).append(":!:").toString()))).append(aq.getText().toString()).toString()))).append(":!:").toString();
_L10:
        s1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s1))).append(Y).toString()))).append(":!:").toString()))).append(n.af.a((new StringBuilder(String.valueOf(s))).append(":-:").append(Y).toString())).toString()))).append(":!:").toString()))).append("3").toString();
        f = 2;
        getParent();
        a(s, s1);
        return;
_L2:
        try
        {
            s1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s1))).append(ah.getText().toString()).toString()))).append(":!:").toString()))).append(aa).toString()))).append(":!:").toString();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return;
        }
          goto _L1
_L3:
        s1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s1))).append(ah.getText().toString()).toString()))).append(":!:").toString()))).append(aa).toString()))).append(":!:").toString();
          goto _L1
_L4:
        s1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s1))).append(ah.getText().toString()).toString()))).append(":!:").toString()))).append(aa).toString()))).append(":!:").toString();
          goto _L1
_L5:
        s1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s1))).append(ah.getText().toString()).toString()))).append(":!:").toString()))).append(aa).toString()))).append(":!:").toString();
          goto _L1
_L6:
        s1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s1))).toString()))).append(":!:").toString()))).append(aa).toString()))).append(":!:").toString();
          goto _L1
_L7:
        s1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s1))).append(at.getText().toString()).toString()))).append(":!:").toString()))).append(I).toString()))).append(":!:").toString();
          goto _L1
_L9:
        s1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s1))).append(aq.getText().toString()).toString()))).append(":!:").toString()))).append(a).toString()))).append(":!:").toString()))).toString()))).append(":!:").toString();
          goto _L10
    }

    public final void a(String s, String s1, int i1)
    {
        E = 1;
        a(s, s1, getParent(), i1, U);
    }

    public final void a(String s, String s1, boolean flag)
    {
        if (Integer.parseInt(((bd)j.get(W)).b()) == 6)
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
        a(((Runnable) (new bc(this, s))));
    }

    protected final void b()
    {
    }

    public final void b(String s)
    {
        if (E == 1)
        {
            az = 0;
            aa = s;
        }
    }

    public final void c()
    {
        az = 0;
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
        af.setVisibility(8);
        ai.setVisibility(8);
        al.setVisibility(8);
        ar.setVisibility(8);
        au.setVisibility(8);
        String s1 = ((bd)j.get(i1)).a();
        String s = s1;
        if (s1.equals("PMA"))
        {
            s = getString(0x7f0c00a6);
        }
        ad.setText(s);
        ah.setText("");
        ak.setText("");
        an.setText("");
        at.setText("");
        aw.setText("");
        s = ((bd)j.get(i1)).b();
        ax = Integer.parseInt(s);
        String as1[] = ((bd)j.get(i1)).g();
        String as2[] = ((bd)j.get(i1)).h();
        if (Integer.parseInt(s) != 7)
        {
            ap.setText(getString(0x7f0c00a2));
            aq.setText((CharSequence)k.get(ay));
        }
        switch (Integer.parseInt(s))
        {
        default:
            return;

        case 1: // '\001'
            af.setVisibility(0);
            ag.setText(as1[0]);
            return;

        case 2: // '\002'
            af.setVisibility(0);
            ag.setText(as1[0]);
            return;

        case 3: // '\003'
            af.setVisibility(0);
            ai.setVisibility(0);
            ag.setText(as1[0]);
            aj.setText(as1[1]);
            return;

        case 4: // '\004'
            af.setVisibility(0);
            al.setVisibility(0);
            ag.setText(as1[0]);
            am.setText(as1[1]);
            an.setText(as2[0]);
            return;

        case 5: // '\005'
            al.setVisibility(0);
            am.setText(as1[0]);
            an.setText(as2[0]);
            return;

        case 6: // '\006'
            ar.setVisibility(0);
            as.setText(as1[0]);
            return;

        case 7: // '\007'
            au.setVisibility(0);
            break;
        }
        av.setText(as1[0]);
        ap.setText(as1[1]);
        aq.setText("");
    }

    final void f(int i1)
    {
        ay = i1;
        if (ax != 7)
        {
            aq.setText((CharSequence)k.get(i1));
        }
    }

    public void onClick(View view)
    {
        if (ab.equals(view) && j.size() > 1)
        {
            com.d.b.a(getParent(), i, c);
            return;
        }
        if (af.equals(view))
        {
            int i1 = Integer.parseInt(((bd)j.get(W)).c());
            int j2 = Integer.parseInt(((bd)j.get(W)).d());
            com.d.b.a(getParent(), 4098, ag.getText().toString(), ah.getText().toString(), i1, j2, this);
            return;
        }
        if (ai.equals(view))
        {
            int j1 = Integer.parseInt(((bd)j.get(W)).e());
            int k2 = Integer.parseInt(((bd)j.get(W)).f());
            com.d.b.a(getParent(), 4099, aj.getText().toString(), ak.getText().toString(), j1, k2, this);
            return;
        }
        if (al.equals(view))
        {
            view = new ArrayList(Arrays.asList(((bd)j.get(W)).h()));
            com.d.b.a(getParent(), view, d);
            return;
        }
        if (ao.equals(view))
        {
            if (ax == 7)
            {
                int k1 = Integer.parseInt(((bd)j.get(W)).c());
                int l2 = Integer.parseInt(((bd)j.get(W)).d());
                com.d.b.a(getParent(), 4112, ap.getText().toString(), aq.getText().toString(), k1, l2, this);
                return;
            } else
            {
                com.d.b.a(getParent(), k, e);
                return;
            }
        }
        if (ar.equals(view))
        {
            int l1 = Integer.parseInt(((bd)j.get(W)).c());
            int i3 = Integer.parseInt(((bd)j.get(W)).d());
            com.d.b.a(getParent(), 4102, as.getText().toString(), at.getText().toString(), l1, i3, this);
            return;
        }
        if (au.equals(view))
        {
            int i2 = Integer.parseInt(((bd)j.get(W)).c());
            int j3 = Integer.parseInt(((bd)j.get(W)).d());
            com.d.b.a(getParent(), 4105, av.getText().toString(), aw.getText().toString(), i2, j3, this);
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
        ae = (ImageView)findViewById(0x7f0b005a);
        af = (RelativeLayout)findViewById(0x7f0b005b);
        ag = (TextView)findViewById(0x7f0b005c);
        ah = (TextView)findViewById(0x7f0b005d);
        ai = (RelativeLayout)findViewById(0x7f0b0067);
        aj = (TextView)findViewById(0x7f0b0068);
        ak = (TextView)findViewById(0x7f0b0069);
        al = (RelativeLayout)findViewById(0x7f0b006b);
        am = (TextView)findViewById(0x7f0b006c);
        an = (TextView)findViewById(0x7f0b006d);
        ao = (RelativeLayout)findViewById(0x7f0b006f);
        ap = (TextView)findViewById(0x7f0b0070);
        aq = (TextView)findViewById(0x7f0b0071);
        ar = (RelativeLayout)findViewById(0x7f0b005f);
        as = (TextView)findViewById(0x7f0b0060);
        at = (TextView)findViewById(0x7f0b0061);
        au = (RelativeLayout)findViewById(0x7f0b0063);
        av = (TextView)findViewById(0x7f0b0064);
        aw = (TextView)findViewById(0x7f0b0065);
        ab.setOnClickListener(this);
        af.setOnClickListener(this);
        ai.setOnClickListener(this);
        al.setOnClickListener(this);
        ao.setOnClickListener(this);
        ar.setOnClickListener(this);
        au.setOnClickListener(this);
        ab.setVisibility(0);
        ao.setVisibility(0);
        ac.setText(getString(0x7f0c00a4));
        ap.setText(getString(0x7f0c00a2));
        if (j.size() == 1)
        {
            ae.setVisibility(8);
        }
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
            az = 0;
            a("m-Commerce", X, b);
            return;
        } else
        {
            G = "";
            E = 0;
            az = 0;
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
        i1 = Integer.parseInt(((bd)j.get(W)).b());
        if (i1 != 1 && i1 != 6 || az != 0) goto _L4; else goto _L3
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
            if (ax != 6 || az != 0)
            {
                break; /* Loop/switch isn't completed */
            }
            az = 1;
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
        int k1 = Integer.parseInt(((bd)j.get(W)).e());
        long l2 = Long.parseLong(((bd)j.get(W)).f());
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
            if (ax == 6)
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
