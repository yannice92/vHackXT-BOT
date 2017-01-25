// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b.a.a.d;
import com.bca.a.a;
import com.bca.a.c;
import com.bca.a.e;
import com.bca.a.f;
import com.bca.mobile.bn;
import com.bca.mobile.n;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Transfer_Service, dv, g, dw, 
//            dx

public class M_Transfer_TA_Sakuku extends M_Transfer_Service
{

    ArrayList T;
    String U[];
    ArrayList V;
    String W[];
    ArrayList X;
    ArrayList Y;
    ArrayList Z;
    private TextView aA;
    private RelativeLayout aB;
    private TextView aC;
    private TextView aD;
    private RelativeLayout aE;
    private TextView aF;
    private EditText aG;
    private int aH;
    private int aI;
    private String aJ;
    private String aK;
    private boolean aL;
    private boolean aM;
    private String aN;
    private String aO;
    private boolean aP;
    private boolean aQ;
    private int aR;
    private int aS;
    private int aT;
    private int aU;
    private int aV;
    private int aW;
    private int aX;
    private int aY;
    private int aZ;
    ArrayList aa;
    String ab;
    String ac;
    private f ad;
    private Hashtable ae;
    private RelativeLayout af;
    private RelativeLayout ag;
    private RelativeLayout ah;
    private TextView ai;
    private TextView aj;
    private TextView ak;
    private TextView al;
    private RelativeLayout am;
    private TextView an;
    private TextView ao;
    private RelativeLayout ap;
    private TextView aq;
    private EditText ar;
    private RelativeLayout as;
    private TextView at;
    private TextView au;
    private RelativeLayout av;
    private TextView aw;
    private TextView ax;
    private RelativeLayout ay;
    private TextView az;
    ArrayList b;
    private android.app.DatePickerDialog.OnDateSetListener ba;
    ArrayList c;
    ArrayList d;
    String e[];
    ArrayList f;
    ArrayList g;
    int h;
    ArrayList i;
    String j[];
    ArrayList k;
    ArrayList l;
    int m;
    String n;

    public M_Transfer_TA_Sakuku()
    {
        aJ = "";
        aL = true;
        aM = false;
        ab = "";
        ac = "";
        aN = "";
        aO = "";
        aP = true;
        aQ = false;
        aR = -1;
        aY = 7;
        aZ = 365;
        ba = new dv(this);
    }

    static int a(M_Transfer_TA_Sakuku m_transfer_ta_sakuku)
    {
        return m_transfer_ta_sakuku.aR;
    }

    static void a(M_Transfer_TA_Sakuku m_transfer_ta_sakuku, int i1)
    {
        m_transfer_ta_sakuku.aS = i1;
    }

    static void a(M_Transfer_TA_Sakuku m_transfer_ta_sakuku, f f1)
    {
        m_transfer_ta_sakuku.ad = f1;
    }

    static void a(M_Transfer_TA_Sakuku m_transfer_ta_sakuku, String s1)
    {
        m_transfer_ta_sakuku.aJ = s1;
    }

    static void a(M_Transfer_TA_Sakuku m_transfer_ta_sakuku, boolean flag)
    {
        m_transfer_ta_sakuku.aM = flag;
    }

    static int b(M_Transfer_TA_Sakuku m_transfer_ta_sakuku)
    {
        return m_transfer_ta_sakuku.aT;
    }

    static void b(M_Transfer_TA_Sakuku m_transfer_ta_sakuku, int i1)
    {
        m_transfer_ta_sakuku.aT = i1;
    }

    static void b(M_Transfer_TA_Sakuku m_transfer_ta_sakuku, String s1)
    {
        m_transfer_ta_sakuku.j(s1);
    }

    static int c(M_Transfer_TA_Sakuku m_transfer_ta_sakuku)
    {
        return m_transfer_ta_sakuku.aU;
    }

    static void c(M_Transfer_TA_Sakuku m_transfer_ta_sakuku, int i1)
    {
        m_transfer_ta_sakuku.aU = i1;
    }

    static EditText d(M_Transfer_TA_Sakuku m_transfer_ta_sakuku)
    {
        return m_transfer_ta_sakuku.ar;
    }

    static void d(M_Transfer_TA_Sakuku m_transfer_ta_sakuku, int i1)
    {
        m_transfer_ta_sakuku.aV = i1;
    }

    static int e(M_Transfer_TA_Sakuku m_transfer_ta_sakuku)
    {
        return m_transfer_ta_sakuku.aS;
    }

    private void e(int i1)
    {
        String s1 = (String)c.get(i1);
        aj.setText(s1);
    }

    static void e(M_Transfer_TA_Sakuku m_transfer_ta_sakuku, int i1)
    {
        m_transfer_ta_sakuku.aW = i1;
    }

    static int f(M_Transfer_TA_Sakuku m_transfer_ta_sakuku)
    {
        return m_transfer_ta_sakuku.aW;
    }

    private void f(int i1)
    {
        String s1 = (String)f.get(i1);
        String s2 = (String)g.get(i1);
        ao.setText(s1);
        ab = ((String)g.get(i1)).toString();
        if (s2.equals("1"))
        {
            ap.setVisibility(8);
            as.setVisibility(8);
            av.setVisibility(8);
            ay.setVisibility(8);
            aB.setVisibility(8);
            aE.setVisibility(8);
            am.setBackgroundResource(0x7f020106);
        } else
        {
            if (s2.equals("2"))
            {
                ap.setVisibility(0);
                as.setVisibility(8);
                av.setVisibility(8);
                ay.setVisibility(8);
                aB.setVisibility(8);
                aE.setVisibility(8);
                am.setBackgroundResource(0x7f0200ea);
                return;
            }
            if (s2.equals("3"))
            {
                ap.setVisibility(8);
                as.setVisibility(0);
                aE.setVisibility(0);
                am.setBackgroundResource(0x7f0200ea);
                return;
            }
        }
    }

    static void f(M_Transfer_TA_Sakuku m_transfer_ta_sakuku, int i1)
    {
        m_transfer_ta_sakuku.aX = i1;
    }

    static int g(M_Transfer_TA_Sakuku m_transfer_ta_sakuku)
    {
        return m_transfer_ta_sakuku.aX;
    }

    private void g(int i1)
    {
        String s1 = (String)k.get(i1);
        String s2 = (String)l.get(i1);
        au.setText(s1);
        ac = ((String)l.get(i1)).toString();
        if (s2.equals("1"))
        {
            Log.d("Sakuku", "chooseJumlahHariIfMoreThanOne");
            if (Y.size() > 1)
            {
                l(0);
            } else
            {
                l(8);
                av.setEnabled(false);
            }
            av.setVisibility(0);
            ay.setVisibility(8);
            aB.setVisibility(8);
        } else
        {
            if (s2.equals("2"))
            {
                Log.d("Sakuku", "chooseNamaHariIfMoreThanOne");
                if (Z.size() > 1)
                {
                    k(0);
                } else
                {
                    k(8);
                    ay.setEnabled(false);
                }
                av.setVisibility(8);
                ay.setVisibility(0);
                aB.setVisibility(8);
                return;
            }
            if (s2.equals("3"))
            {
                if (aa.size() > 1)
                {
                    m(0);
                } else
                {
                    m(8);
                    aB.setEnabled(false);
                }
                av.setVisibility(8);
                ay.setVisibility(8);
                aB.setVisibility(0);
                return;
            }
        }
    }

    static EditText h(M_Transfer_TA_Sakuku m_transfer_ta_sakuku)
    {
        return m_transfer_ta_sakuku.aG;
    }

    private void h(int i1)
    {
        ((ImageView)findViewById(0x7f0b01ce)).setVisibility(i1);
    }

    static int i(M_Transfer_TA_Sakuku m_transfer_ta_sakuku)
    {
        return m_transfer_ta_sakuku.aV;
    }

    private void i(int i1)
    {
        ((ImageView)findViewById(0x7f0b01d7)).setVisibility(i1);
    }

    static f j(M_Transfer_TA_Sakuku m_transfer_ta_sakuku)
    {
        return m_transfer_ta_sakuku.ad;
    }

    private void j(int i1)
    {
        ((ImageView)findViewById(0x7f0b01db)).setVisibility(i1);
    }

    private void j(String s1)
    {
        aK = s1.split("-")[0].trim();
    }

    private String k(String s1)
    {
        Object obj;
        Object obj1;
        String s2;
        obj = new Date();
        obj1 = new SimpleDateFormat("dd/MM/yyyy");
        s2 = ((SimpleDateFormat) (obj1)).format(((Date) (obj)));
        obj = "";
        long l1;
        s1 = ((SimpleDateFormat) (obj1)).parse(s1);
        obj1 = ((SimpleDateFormat) (obj1)).parse(s2);
        l1 = (s1.getTime() - ((Date) (obj1)).getTime()) / 0x5265c00L;
        if (s1.compareTo(((Date) (obj1))) <= 0)
        {
            return getString(0x7f0c008d);
        }
        s1 = ((String) (obj));
        if (l1 <= (long)aZ)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        s1 = getString(0x7f0c0098);
        return s1;
        s1;
        s1.printStackTrace();
        s1 = getString(0x7f0c0097);
        return s1;
    }

    private void k(int i1)
    {
        ((ImageView)findViewById(0x7f0b01d4)).setVisibility(i1);
    }

    static void k(M_Transfer_TA_Sakuku m_transfer_ta_sakuku)
    {
        m_transfer_ta_sakuku.aI = 2;
    }

    static int l(M_Transfer_TA_Sakuku m_transfer_ta_sakuku)
    {
        return m_transfer_ta_sakuku.aI;
    }

    private String l(String s1)
    {
        Object obj;
        Object obj1;
        String s2;
        obj = new Date();
        obj1 = new SimpleDateFormat("dd/MM/yyyy");
        s2 = ((SimpleDateFormat) (obj1)).format(((Date) (obj)));
        obj = "";
        long l1;
        s1 = ((SimpleDateFormat) (obj1)).parse(s1);
        obj1 = ((SimpleDateFormat) (obj1)).parse(s2);
        l1 = (s1.getTime() - ((Date) (obj1)).getTime()) / 0x5265c00L;
        if (s1.compareTo(((Date) (obj1))) <= 0)
        {
            return getString(0x7f0c0090);
        }
        s1 = ((String) (obj));
        if (l1 <= (long)aZ)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        s1 = getString(0x7f0c0099);
        return s1;
        s1;
        s1.printStackTrace();
        s1 = getString(0x7f0c00ab);
        return s1;
    }

    private void l(int i1)
    {
        ((ImageView)findViewById(0x7f0b01df)).setVisibility(i1);
    }

    private void m()
    {
        int i1 = 1;
        do
        {
            if (i1 >= 100)
            {
                return;
            }
            Y.add((new StringBuilder(String.valueOf(Integer.toString(i1)))).append(" hari").toString());
            i1++;
        } while (true);
    }

    private void m(int i1)
    {
        ((ImageView)findViewById(0x7f0b0203)).setVisibility(i1);
    }

    static void m(M_Transfer_TA_Sakuku m_transfer_ta_sakuku)
    {
        m_transfer_ta_sakuku.r();
    }

    private void n()
    {
        int i1 = 1;
        do
        {
            if (i1 >= 29)
            {
                aa.add("akhir");
                return;
            }
            aa.add(Integer.toString(i1));
            i1++;
        } while (true);
    }

    static void n(M_Transfer_TA_Sakuku m_transfer_ta_sakuku)
    {
        m_transfer_ta_sakuku.s();
    }

    static int o(M_Transfer_TA_Sakuku m_transfer_ta_sakuku)
    {
        return m_transfer_ta_sakuku.aH;
    }

    private void o()
    {
        Log.d("Sakuku", "chooseJenisTransferBerkalaIfMoreThanOne");
        if (k.size() > 1)
        {
            j(0);
        } else
        {
            j(8);
            as.setEnabled(false);
        }
        g(0);
        ax.setText("");
        aA.setText("");
        aD.setText("");
        aG.setText("");
        ai.setText("");
        aM = false;
        aL = true;
        aJ = "";
        al.setText("");
        ar.setText("");
    }

    static TextView p(M_Transfer_TA_Sakuku m_transfer_ta_sakuku)
    {
        return m_transfer_ta_sakuku.ai;
    }

    private void p()
    {
        ae = new Hashtable();
        ae.put(com.bca.mobile.transaction.g.c, "m-Transfer");
    }

    private void q()
    {
        if (B != null)
        {
            B.cancel();
            B = null;
        }
        B = new g(getParent(), ae, this, this);
        B.show();
    }

    static void q(M_Transfer_TA_Sakuku m_transfer_ta_sakuku)
    {
        m_transfer_ta_sakuku.aL = true;
    }

    static TextView r(M_Transfer_TA_Sakuku m_transfer_ta_sakuku)
    {
        return m_transfer_ta_sakuku.al;
    }

    private void r()
    {
        Object obj = ad.b();
        if (obj == a.e)
        {
            a("m-Transfer", ad.e(), getParent(), "Ok", "Cancel");
            return;
        }
        if (obj == a.b)
        {
            if (ad instanceof c)
            {
                obj = "Masukkan jumlah transfer";
            } else
            {
                obj = ((e)ad).a();
            }
            Log.d("Sakuku", "showAmountDialog");
            p();
            ae.put(g.t, obj);
            ae.put(g.x, new Integer(0));
            ae.put(g.y, new Integer(0));
            ae.put(g.v, Integer.valueOf(1));
            ae.put(g.w, Integer.valueOf(7));
            ae.put(g.b, new Boolean(true));
            ae.put(g.A, "");
            ae.put(com.bca.mobile.transaction.g.d, "Rp");
            ae.put(com.bca.mobile.transaction.g.f, getString(0x7f0c0088));
            ae.put(g.i, getString(0x7f0c0089));
            q();
            return;
        }
        if (obj == a.c)
        {
            if (ad.d().equals("OFF"))
            {
                p();
                ae.put(g.b, new Boolean(true));
                ae.put(g.B, new Boolean(true));
                ae.put(g.t, "Berita");
                ae.put(g.A, "");
                ae.put(g.b, new Boolean(true));
                q();
                return;
            } else
            {
                s();
                return;
            }
        }
        if (obj == a.d)
        {
            f();
            return;
        } else
        {
            a("m-Transfer", com.utilities.c.c(ad.g()[1]), getParent(), true, "Ok");
            return;
        }
    }

    private void s()
    {
        ad.c();
        r();
    }

    protected final void a()
    {
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        String s6;
        String s7;
        String s8;
        String s9;
        String s10;
        String s11;
        Log.i("Virtual Account", "onTitleRightButtonClicked");
        s1 = aj.getText().toString().trim();
        s2 = ai.getText().toString().trim();
        s3 = al.getText().toString().trim();
        s4 = ar.getText().toString().trim();
        s5 = au.getText().toString().trim();
        s6 = ax.getText().toString().trim();
        s7 = aA.getText().toString().trim();
        s8 = aD.getText().toString().trim();
        s9 = aG.getText().toString().trim();
        s10 = k(ar.getText().toString().replaceAll(" - ", "/"));
        s11 = l(aG.getText().toString().replaceAll(" - ", "/"));
        if (!ab.equals("2") || !s4.equals("")) goto _L2; else goto _L1
_L1:
        a("m-Transfer", getString(0x7f0c008c), getParent(), false, "Back");
_L4:
        aH = -1;
        return;
_L2:
        if (ab.equals("2") && !s4.equals("") && !s10.equals(""))
        {
            bn.a(s10, getParent());
            continue; /* Loop/switch isn't completed */
        }
        if (ab.equals("3") && s5.equals(""))
        {
            a("m-Transfer", getString(0x7f0c008e).replace("#LABEL#", ((String)V.get(0)).replace(":", "")), getParent(), false, "Back");
            continue; /* Loop/switch isn't completed */
        }
        if (ab.equals("3") && ac.equals("1") && s6.equals(""))
        {
            a("m-Transfer", getString(0x7f0c008e).replace("#LABEL#", ((String)X.get(0)).replace(":", "")), getParent(), false, "Back");
            continue; /* Loop/switch isn't completed */
        }
        if (ab.equals("3") && ac.equals("2") && s7.equals(""))
        {
            a("m-Transfer", getString(0x7f0c008e).replace("#LABEL#", ((String)X.get(1)).replace(":", "")), getParent(), false, "Back");
            continue; /* Loop/switch isn't completed */
        }
        if (ab.equals("3") && ac.equals("3") && s8.equals(""))
        {
            a("m-Transfer", getString(0x7f0c008e).replace("#LABEL#", ((String)X.get(2)).replace(":", "")), getParent(), false, "Back");
            continue; /* Loop/switch isn't completed */
        }
        if (ab.equals("3") && s9.equals(""))
        {
            a("m-Transfer", getString(0x7f0c008f), getParent(), false, "Back");
            continue; /* Loop/switch isn't completed */
        }
        if (ab.equals("3") && !s9.equals("") && !s11.equals(""))
        {
            bn.a(s11, getParent());
            continue; /* Loop/switch isn't completed */
        }
        if (s2.equals(""))
        {
            a("m-Transfer", getString(0x7f0c008a).replace("#LABEL#", "No. Sakuku"), getParent(), false, "Back");
            continue; /* Loop/switch isn't completed */
        }
        if (s3.equals(""))
        {
            a("m-Transfer", getString(0x7f0c008b).replace("#LABEL#", "Jumlah Uang"), getParent(), false, "Back");
            continue; /* Loop/switch isn't completed */
        }
        if (s1.equals(s2))
        {
            a("m-Transfer", getString(0x7f0c0084), getParent(), false, "Back");
            continue; /* Loop/switch isn't completed */
        }
        E = 1;
        String as1[];
        if (aA.getText().toString().equals("Senin"))
        {
            s1 = "1";
        } else
        if (aA.getText().toString().equals("Selasa"))
        {
            s1 = "2";
        } else
        if (aA.getText().toString().equals("Rabu"))
        {
            s1 = "3";
        } else
        if (aA.getText().toString().equals("Kamis"))
        {
            s1 = "4";
        } else
        if (aA.getText().toString().equals("Jumat"))
        {
            s1 = "5";
        } else
        if (aA.getText().toString().equals("Sabtu"))
        {
            s1 = "6";
        } else
        if (aA.getText().toString().equals("Minggu"))
        {
            s1 = "7";
        } else
        {
            s1 = "";
        }
        as1 = new String[11];
        as1[0] = "PGI";
        as1[1] = "TSK2";
        as1[2] = aK;
        if (aM)
        {
            s2 = "Y";
        } else
        {
            s2 = "N";
        }
        as1[3] = s2;
        as1[4] = al.getText().toString();
        as1[5] = aj.getText().toString();
        if (!ab.equals("1"))
        {
            break; /* Loop/switch isn't completed */
        }
        as1[6] = ((String)g.get(0)).toString();
        as1[7] = "";
        as1[8] = "";
        as1[9] = "";
        as1[10] = "2";
        g(a(as1));
        ad = null;
        if (true) goto _L4; else goto _L3
_L3:
        if (ab.equals("2"))
        {
            as1[6] = ((String)g.get(1)).toString();
            as1[7] = "";
            as1[8] = ar.getText().toString().replace("-", "").replace(" ", "");
            as1[9] = "";
        } else
        if (ab.equals("3"))
        {
            as1[6] = ((String)g.get(2)).toString();
            if (ac.equals("1"))
            {
                as1[7] = ((String)l.get(0)).toString();
                as1[8] = ax.getText().toString().replace(" hari", "").trim();
            } else
            if (ac.equals("2"))
            {
                as1[7] = ((String)l.get(1)).toString();
                as1[8] = s1;
            } else
            if (ac.equals("3"))
            {
                as1[7] = ((String)l.get(2)).toString();
                as1[8] = aD.getText().toString();
            }
            as1[9] = aG.getText().toString().replace("-", "").replace(" ", "");
        }
        break MISSING_BLOCK_LABEL_1000;
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final void a(int i1)
    {
        Log.i("Virtual Account", "onProgressButtonClicked");
    }

    public final void a(int i1, String as1[])
    {
        Log.i("Virtual Account", "OnTaskFinish");
        a(((Runnable) (new dw(this, as1))));
    }

    protected final void a(String s1)
    {
        Log.i("Virtual Account", "onDialogPinSubmit");
        String s2 = (new StringBuilder(String.valueOf(s1))).append(":-:").append(ad.f()).toString();
        try
        {
            ad.c(s2);
            s2 = ad.i().replace("#MPIN#", n.af.a(s2));
            getParent();
            a(s1, s2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
        }
    }

    public final void a(String s1, boolean flag, boolean flag1)
    {
        a(((Runnable) (new dx(this, flag, s1))));
    }

    protected final void b()
    {
        Log.i("Virtual Account", "onTitleLeftButtonClicked");
    }

    public final void b(String s1)
    {
        Log.i("Virtual Account", "onResultAmout");
    }

    public final void c()
    {
        Log.i("Virtual Account", "onResultBackButtonCancel");
    }

    protected final void d()
    {
        String as1[];
        int i1;
        f = new ArrayList();
        g = new ArrayList();
        k = new ArrayList();
        l = new ArrayList();
        V = new ArrayList();
        X = new ArrayList();
        Y = new ArrayList();
        Z = new ArrayList();
        aa = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        aS = calendar.get(1);
        aT = calendar.get(2);
        aU = calendar.get(5);
        aV = calendar.get(1);
        aW = calendar.get(2);
        aX = calendar.get(5);
        as1 = (String[])n.m.get("data");
        b = com.utilities.c.a(as1[2]);
        c = com.utilities.c.a(as1[1]);
        d = com.utilities.c.a(as1[3]);
        i1 = 0;
_L8:
        if (i1 < d.size()) goto _L2; else goto _L1
_L1:
        i = com.utilities.c.a(as1[4]);
        i1 = 0;
_L9:
        if (i1 < i.size()) goto _L4; else goto _L3
_L3:
        n = as1[5];
        T = com.utilities.c.a(as1[6]);
        if (T.get(1) == "") goto _L6; else goto _L5
_L5:
        U = ((String)T.get(1)).split(":#:");
        i1 = 0;
_L13:
        if (i1 < U.length - 1) goto _L7; else goto _L6
_L6:
        m();
        Z.add("Senin");
        Z.add("Selasa");
        Z.add("Rabu");
        Z.add("Kamis");
        Z.add("Jumat");
        Z.add("Sabtu");
        Z.add("Minggu");
        n();
        return;
_L2:
        if (d.get(i1) != "")
        {
            e = ((String)d.get(i1)).split(":#:");
            f.add(e[0]);
            g.add(e[1]);
        }
        i1++;
          goto _L8
_L4:
        if (i.get(i1) != "")
        {
            j = ((String)i.get(i1)).split(":#:");
            k.add(j[0]);
            l.add(j[1]);
        }
        i1++;
          goto _L9
_L7:
        if (U[i1] == null) goto _L11; else goto _L10
_L10:
        int j1;
        if (!U[i1].contains(":$:"))
        {
            break MISSING_BLOCK_LABEL_604;
        }
        W = U[i1].split(":\\$:");
        j1 = 0;
_L14:
        if (j1 < W.length) goto _L12; else goto _L11
_L11:
        i1++;
          goto _L13
_L12:
        X.add(W[j1]);
        j1++;
          goto _L14
        V.add(U[i1]);
          goto _L11
    }

    protected final void e()
    {
        ai = (TextView)findViewById(0x7f0b020c);
        af = (RelativeLayout)findViewById(0x7f0b020a);
        af.setOnClickListener(this);
        aj = (TextView)findViewById(0x7f0b0209);
        ag = (RelativeLayout)findViewById(0x7f0b0207);
        ag.setOnClickListener(this);
        ak = (TextView)findViewById(0x7f0b020f);
        al = (TextView)findViewById(0x7f0b0210);
        ah = (RelativeLayout)findViewById(0x7f0b020e);
        ah.setOnClickListener(this);
        ah.setVisibility(0);
        ak.setText(bn.a(0x7f0c00b4));
        an = (TextView)findViewById(0x7f0b01f2);
        ao = (TextView)findViewById(0x7f0b01f3);
        am = (RelativeLayout)findViewById(0x7f0b01f1);
        am.setOnClickListener(this);
        an.setText(n);
        aq = (TextView)findViewById(0x7f0b01f5);
        ar = (EditText)findViewById(0x7f0b01f6);
        ap = (RelativeLayout)findViewById(0x7f0b01f4);
        ar.setOnClickListener(this);
        aq.setText((CharSequence)T.get(0));
        at = (TextView)findViewById(0x7f0b01f8);
        au = (TextView)findViewById(0x7f0b01f9);
        as = (RelativeLayout)findViewById(0x7f0b01f7);
        as.setOnClickListener(this);
        at.setText((CharSequence)V.get(0));
        aw = (TextView)findViewById(0x7f0b01fb);
        ax = (TextView)findViewById(0x7f0b01fc);
        av = (RelativeLayout)findViewById(0x7f0b01fa);
        av.setOnClickListener(this);
        aw.setText((CharSequence)X.get(0));
        az = (TextView)findViewById(0x7f0b01fe);
        aA = (TextView)findViewById(0x7f0b01ff);
        ay = (RelativeLayout)findViewById(0x7f0b01fd);
        ay.setOnClickListener(this);
        az.setText((CharSequence)X.get(1));
        aC = (TextView)findViewById(0x7f0b0201);
        aD = (TextView)findViewById(0x7f0b0202);
        aB = (RelativeLayout)findViewById(0x7f0b0200);
        aB.setOnClickListener(this);
        aC.setText((CharSequence)X.get(2));
        aF = (TextView)findViewById(0x7f0b0205);
        aG = (EditText)findViewById(0x7f0b0206);
        aE = (RelativeLayout)findViewById(0x7f0b0204);
        aG.setOnClickListener(this);
        aF.setText((CharSequence)V.get(1));
        Log.i("TEST", (new StringBuilder("Size ")).append(c.size()).toString());
        if (c.size() > 1)
        {
            h(0);
        } else
        {
            h(8);
            ag.setEnabled(false);
        }
        e(0);
        if (f.size() > 1)
        {
            i(0);
        } else
        {
            i(8);
            am.setEnabled(false);
        }
        f(0);
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
    }

    public void onClick(View view)
    {
        Log.i("Virtual Account", "onClick");
        p();
        if (n.y != null)
        {
            n.y.d();
        }
        if (!view.equals(ag)) goto _L2; else goto _L1
_L1:
        if (c.size() != 1)
        {
            ae.put(g.q, c);
            ae.put(g.b, new Boolean(false));
        }
        q();
        aH = 2;
_L4:
        return;
_L2:
        if (view.equals(af))
        {
            ae.put(g.t, (new StringBuilder(String.valueOf(getString(0x7f0c00b3)))).append(":").toString());
            ae.put(g.b, new Boolean(true));
            ae.put(g.x, new Integer("0"));
            ae.put(g.y, new Integer("0"));
            ae.put(g.v, Integer.valueOf(1));
            ae.put(g.w, Integer.valueOf(15));
            ae.put(g.u, getString(0x7f0c00af));
            ae.put(g.z, Boolean.valueOf(aM));
            ae.put(g.A, aJ);
            ae.put(g.C, ".,");
            ae.put("force_validation", Boolean.valueOf(true));
            if (b != null && b.size() != 0)
            {
                ae.put(g.b, new Boolean(aL));
                ae.put(g.j, getString(0x7f0c00b0));
                ae.put(g.k, getResources().getDrawable(0x7f020076));
                ae.put(g.l, getResources().getDrawable(0x7f020075));
                ae.put(g.m, getString(0x7f0c00b1));
                ae.put(com.bca.mobile.transaction.g.n, getResources().getDrawable(0x7f020076));
                ae.put(g.o, getResources().getDrawable(0x7f020075));
                ae.put(g.q, b);
            }
            ae.put(com.bca.mobile.transaction.g.f, getString(0x7f0c0077));
            ae.put(g.g, getString(0x7f0c007b));
            ae.put(g.h, getString(0x7f0c007c));
            ae.put("input_dialog_error_input_contain_illegal_character", getString(0x7f0c00b2));
            aH = 1;
            q();
            aH = 1;
            return;
        }
        if (view.equals(ah))
        {
            view = (new StringBuilder(String.valueOf(bn.a(0x7f0c00b4)))).append(":").toString();
            p();
            ae.put(g.A, al.getText());
            ae.put(g.t, view);
            ae.put(g.x, Integer.valueOf(10000));
            ae.put(g.y, new Integer(0));
            ae.put(g.v, Integer.valueOf(1));
            ae.put(g.w, Integer.valueOf(7));
            ae.put(g.b, new Boolean(true));
            ae.put(com.bca.mobile.transaction.g.d, "Rp");
            ae.put(com.bca.mobile.transaction.g.f, getString(0x7f0c0088));
            ae.put(g.i, getString(0x7f0c0089));
            q();
            aH = 3;
            return;
        }
        if (view.equals(am))
        {
            if (f.size() != 0)
            {
                ae.put(g.q, f);
                ae.put(g.b, new Boolean(false));
            }
            q();
            aH = 4;
            return;
        }
        if (view.equals(ar))
        {
            aR = 1;
            showDialog(1);
            return;
        }
        if (view.equals(as))
        {
            if (k.size() != 0)
            {
                ae.put(g.q, k);
                ae.put(g.b, new Boolean(false));
            }
            q();
            aH = 6;
            return;
        }
        if (!view.equals(av))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!au.getText().equals(""))
        {
            if (Y.size() != 0)
            {
                ae.put(g.q, Y);
                ae.put(g.b, new Boolean(false));
            }
            q();
            aH = 7;
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!view.equals(ay))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!au.getText().equals(""))
        {
            if (Z.size() != 0)
            {
                ae.put(g.q, Z);
                ae.put(g.b, new Boolean(false));
            }
            q();
            aH = 8;
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (view.equals(aB))
        {
            if (!au.getText().equals(""))
            {
                if (aa.size() != 0)
                {
                    ae.put(g.q, aa);
                    ae.put(g.b, new Boolean(false));
                }
                q();
                aH = 9;
                return;
            }
        } else
        if (view.equals(aG))
        {
            aR = 2;
            showDialog(2);
            return;
        } else
        {
            super.onClick(view);
            return;
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f030060);
    }

    protected Dialog onCreateDialog(int i1)
    {
        switch (i1)
        {
        default:
            return null;

        case 1: // '\001'
            return new DatePickerDialog(getParent(), ba, aS, aT, aU);

        case 2: // '\002'
            return new DatePickerDialog(getParent(), ba, aV, aW, aX);
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        Log.i("Virtual Account", (new StringBuilder("onItemClick ")).append(aH).toString());
        if (aH != 1) goto _L2; else goto _L1
_L1:
        adapterview = (String)b.get(i1);
        j(adapterview);
        ai.setText(adapterview);
        aL = false;
_L4:
        return;
_L2:
        if (aH == 2)
        {
            e(i1);
            return;
        }
        if (aH == 3)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (aH == 4)
        {
            if (h != i1)
            {
                h = i1;
                o();
            }
            f(i1);
            return;
        }
        if (aH == 6)
        {
            if (m != i1)
            {
                m = i1;
                o();
            }
            g(i1);
            return;
        }
        if (aH != 7)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((String)Y.get(i1)).contains("hari"))
        {
            adapterview = (String)Y.get(i1);
            ax.setText(adapterview);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (aH == 8)
        {
            adapterview = (String)Z.get(i1);
            aA.setText(adapterview);
            return;
        }
        if (aH == 9)
        {
            adapterview = (String)aa.get(i1);
            aD.setText(adapterview);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public void onResultButtonCancel(View view)
    {
        Log.i("Virtual Account", "onResultButtonCancel");
    }

    public void onResultButtonOK(View view)
    {
        Log.i("Virtual Account", "onResultButtonOK");
        if (ad != null && ad.b() != a.a)
        {
            s();
        }
    }
}
