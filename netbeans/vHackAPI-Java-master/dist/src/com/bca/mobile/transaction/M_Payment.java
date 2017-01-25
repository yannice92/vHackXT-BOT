// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.bca.c.c;
import com.bca.c.g;
import com.bca.mobile.ShareActivity;
import com.bca.mobile.TabSample;
import com.bca.mobile.bm;
import com.bca.mobile.n;
import com.bca.mobile.tab.TabGroupBaseActivity;
import com.f.a;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.bca.mobile.transaction:
//            cw, cy, InboxActivity1, cx

public class M_Payment extends ShareActivity
    implements android.widget.AdapterView.OnItemClickListener, c
{

    private final int T = 0;
    private final int U = 1;
    private final int V = 2;
    private final int W = 3;
    private final int X = 4;
    private final int Y = 5;
    private final int Z = 6;
    String a;
    private final int aa = 7;
    private final int ab = 8;
    private int ac;
    private ListView ad;
    private bm ae;
    private int af[];
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    String i;
    com.c.a j;
    int k;
    Timer l;
    TimerTask m;
    public Handler n;

    public M_Payment()
    {
        a = "PGI:!:PKK:!:#1_1#:!::!:#2_2#:!::!::!:#3_3#:!::!:#4_4#:!:#5_5#:!:#6_6#:!:#7_7#:!:#8_8#:!:2";
        b = "PGI:!:PPU2:!:#1_1#:!::!:#2_2#:!::!::!:#3_3#:!::!:#7_7#:!:#8_8#:!:#10_10#:!:#11_11#:!:2";
        c = "PGI:!:PPJ:!:#1_1#:!::!:#2_2#:!::!::!:#3_3#:!::!:#4_4#:!:#5_5#:!:#6_6#:!:#7_7#:!:#8_8#:!:2";
        d = "PGI:!:PLY:!:#1_1#:!::!:#2_2#:!::!::!:#3_3#:!::!:#4_4#:!:#5_5#:!:#6_6#:!:#7_7#:!:#8_8#:!:2";
        e = "PGI:!:PIN:!:#1_1#:!::!:#2_2#:!::!::!:#3_3#:!::!:#4_4#:!:#5_5#:!:#6_6#:!:#7_7#:!:#8_8#:!:2";
        f = "PGI:!:PHP:!:#1_1#:!::!:#2_2#:!::!::!:#3_3#:!::!:#7_7#:!:#8_8#:!:2";
        g = "PGI:!:PAS:!:#1_1#:!::!:#2_2#:!::!::!:#3_3#:!::!:#4_4#:!:#5_5#:!:#6_6#:!:#7_7#:!:#8_8#:!:2";
        h = "PGI:!:PTP:!:#1_1#:!::!:#2_2#:!::!::!:#3_3#:!::!:#7_7#:!:#8_8#:!:2";
        i = "PGI:!:~~:!:#1_1#:!:#3_3#:!:#4_4#:!:#7_7#:!:#9_9#:!:#0_0#";
        k = 0;
        l = null;
        m = null;
        n = new cw(this);
    }

    static bm a(M_Payment m_payment)
    {
        return m_payment.ae;
    }

    public static ArrayList a(String as[], int i1, ArrayList arraylist)
    {
        as = as[i1].split(":@:");
        i1 = 0;
        do
        {
            if (i1 >= as.length)
            {
                return arraylist;
            }
            Hashtable hashtable = new Hashtable();
            if (i1 == as.length - 1)
            {
                hashtable.put("default_bank", as[i1]);
            } else
            {
                String as1[] = as[i1].split(":#:");
                hashtable.put("bank_name", as1[0]);
                hashtable.put("payee_code", as1[1]);
            }
            arraylist.add(hashtable);
            i1++;
        } while (true);
    }

    public static String[] a(String as[], int i1)
    {
        Object obj = null;
        String as1[] = as[i1].split(":@:");
        i1 = 0;
        as = obj;
        do
        {
            if (i1 >= as1.length)
            {
                return as;
            }
            if (as1[i1] != "")
            {
                as = as1[i1].split(":#:");
            }
            i1++;
        } while (true);
    }

    static int b(M_Payment m_payment)
    {
        return m_payment.ac;
    }

    public static ArrayList b(String as[], int i1, ArrayList arraylist)
    {
        as = as[i1].split(":@:");
        i1 = 0;
        do
        {
            if (i1 >= as.length)
            {
                return arraylist;
            }
            String as1[] = as[i1].split(":#:");
            if (as1.length == 1)
            {
                ((Hashtable)arraylist.get(i1)).put("input_min", "0");
                ((Hashtable)arraylist.get(i1)).put("input_max", "16");
            } else
            {
                ((Hashtable)arraylist.get(i1)).put("input_min", as1[0]);
                ((Hashtable)arraylist.get(i1)).put("input_max", as1[1]);
            }
            i1++;
        } while (true);
    }

    public static String[] b(String as[], int i1)
    {
        Object obj = null;
        String as1[] = as[i1].split(":@:", -1);
        i1 = 0;
        as = obj;
        do
        {
            if (i1 >= as1.length)
            {
                return as;
            }
            if (as1[i1].contains(":$:"))
            {
                as = as1[i1].split(":\\$:");
            }
            i1++;
        } while (true);
    }

    public static ArrayList c(String as[], int i1, ArrayList arraylist)
    {
        as = as[i1].split(":@:");
        i1 = 0;
_L2:
        ArrayList arraylist1;
        if (i1 >= as.length)
        {
            return arraylist;
        }
        arraylist1 = new ArrayList();
        if (!as[i1].equals(""))
        {
            break; /* Loop/switch isn't completed */
        }
        ((Hashtable)arraylist.get(i1)).put("dafter_transfer_list", new ArrayList());
        ((Hashtable)arraylist.get(i1)).put("dafter_transfer_default", "");
_L3:
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        String as1[];
        int j1;
        as1 = as[i1].split(":#:");
        j1 = 0;
_L4:
label0:
        {
            if (j1 < as1.length)
            {
                break label0;
            }
            ((Hashtable)arraylist.get(i1)).put("dafter_transfer_list", arraylist1);
        }
          goto _L3
        if (j1 == as1.length - 1)
        {
            ((Hashtable)arraylist.get(i1)).put("dafter_transfer_default", as1[j1]);
        } else
        {
            arraylist1.add(as1[j1]);
        }
        j1++;
          goto _L4
    }

    public static ArrayList d(String as[], int i1, ArrayList arraylist)
    {
        as = as[i1].split(":@:");
        i1 = 0;
        do
        {
            if (i1 >= as.length)
            {
                return arraylist;
            }
            String as1[] = as[i1].split(":#:");
            if (as1.length == 1)
            {
                ((Hashtable)arraylist.get(i1)).put("amout_min", "");
                ((Hashtable)arraylist.get(i1)).put("amout_min", "");
            } else
            {
                ((Hashtable)arraylist.get(i1)).put("amout_min", as1[0]);
                ((Hashtable)arraylist.get(i1)).put("amout_max", as1[1]);
            }
            i1++;
        } while (true);
    }

    public static ArrayList e(String as[], int i1, ArrayList arraylist)
    {
        as = as[i1].split(":@:");
        Hashtable hashtable = new Hashtable();
        ArrayList arraylist1 = new ArrayList();
        i1 = 0;
        do
        {
            if (i1 >= as.length)
            {
                hashtable.put("dari_rekening", arraylist1);
                arraylist.add(hashtable);
                return arraylist;
            }
            if (i1 == as.length - 1)
            {
                hashtable.put("dari_rek_default", as[i1]);
            } else
            {
                arraylist1.add(as[i1]);
            }
            i1++;
        } while (true);
    }

    private void e()
    {
        if (l != null)
        {
            l.cancel();
            l = null;
        }
    }

    protected final void a()
    {
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
        super.a(new cy(this, as));
    }

    protected final void a(String s)
    {
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

    public final void d()
    {
        j = new com.c.a(this);
        k = j.b("inbox_payment").size();
        j.b();
    }

    public final void i()
    {
        if (ae != null)
        {
            ae.a(d(9));
            ae.notifyDataSetChanged();
        }
    }

    public void onCancel(DialogInterface dialoginterface)
    {
    }

    public void onClick(View view)
    {
        super.onClick(view);
        if (x == view && ae != null)
        {
            ae.a(d(9));
            ae.notifyDataSetChanged();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f030058);
        d();
        Log.d("setData", "setData");
        bundle = getResources().getStringArray(0x7f0e0007);
        int j1 = bundle.length;
        int i1 = 0;
        do
        {
            if (i1 >= j1)
            {
                Object obj;
                if (k == 0)
                {
                    q.add("Inbox");
                } else
                {
                    q.add((new StringBuilder("Inbox (")).append(k).append(")").toString());
                }
                ad = (ListView)findViewById(0x7f0b01aa);
                ae = new bm(this, getParent(), q, new ArrayList());
                ae.a(d(9));
                ad.setAdapter(ae);
                ae.notifyDataSetChanged();
                ad.invalidate();
                ad.setOnItemClickListener(this);
                return;
            }
            obj = bundle[i1];
            q.add(obj);
            i1++;
        } while (true);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        e();
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        ac = i1;
        af = d(9);
        af[i1] = 1;
        ae.a(af);
        ae.notifyDataSetChanged();
        switch (i1)
        {
        default:
            return;

        case 0: // '\0'
            g("PGI:!:PKK");
            return;

        case 1: // '\001'
            g("PGI:!:PHP");
            return;

        case 2: // '\002'
            g("PGI:!:PTP");
            return;

        case 3: // '\003'
            g("PGI:!:PPU2");
            return;

        case 4: // '\004'
            g("PGI:!:PAS");
            return;

        case 5: // '\005'
            g("PGI:!:PIN");
            return;

        case 6: // '\006'
            g("PGI:!:PPJ");
            return;

        case 7: // '\007'
            g("PGI:!:PLY");
            return;

        case 8: // '\b'
            break;
        }
        if (n.m != null)
        {
            n.m = null;
        }
        adapterview = new Hashtable();
        n.m = adapterview;
        adapterview.put("inbox_service", "inbox_payment");
        n.m.put("inbox", "inbox");
        adapterview = new Intent(getParent(), com/bca/mobile/transaction/InboxActivity1);
        ((TabGroupBaseActivity)getParent()).a("InboxActivity1", adapterview);
    }

    protected void onPause()
    {
        super.onPause();
        e();
    }

    public void onResultButtonCancel(View view)
    {
    }

    public void onResultButtonOK(View view)
    {
    }

    protected void onResume()
    {
        super.onResume();
        if (n.am != null)
        {
            n.am.a("Send", false);
        }
        if (ae != null)
        {
            ae.a(d(9));
            ae.notifyDataSetChanged();
        }
        if (n.v == null)
        {
            n.v = new g(this);
        }
        n.v.a(this);
        e();
        m = new cx(this);
        l = new Timer();
        l.scheduleAtFixedRate(m, 1000L, 1000L);
    }
}
