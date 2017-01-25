// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import b.a.a.d;
import com.bca.c.c;
import com.bca.c.g;
import com.bca.mobile.ShareActivity;
import com.bca.mobile.TabSample;
import com.bca.mobile.bm;
import com.bca.mobile.n;
import com.f.a;
import com.utilities.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.bca.mobile.transaction:
//            bl, bm, bo, bn

public class M_Info extends ShareActivity
    implements c
{

    private final int T = 11;
    private final int U = 13;
    private final int V = 14;
    private final int W = 15;
    private final int X = 16;
    private int Y;
    private int Z;
    com.c.a a;
    private ListView aa;
    private bm ab;
    private int ac[];
    int b;
    Timer c;
    TimerTask d;
    public Handler e;
    public android.widget.AdapterView.OnItemClickListener f;
    private final int g = 0;
    private final int h = 1;
    private final int i = 2;
    private final int j = 4;
    private final int k = 5;
    private final int l = 6;
    private final int m = 8;
    private final int n = 9;

    public M_Info()
    {
        c = null;
        d = null;
        e = new bl(this);
        f = new com.bca.mobile.transaction.bm(this);
    }

    static bm a(M_Info m_info)
    {
        return m_info.ab;
    }

    static void a(M_Info m_info, int i1)
    {
        m_info.Z = i1;
    }

    static void a(M_Info m_info, int ai[])
    {
        m_info.ac = ai;
    }

    static void b(M_Info m_info, int i1)
    {
        m_info.Y = i1;
    }

    static int[] b(M_Info m_info)
    {
        return m_info.ac;
    }

    static void c(M_Info m_info)
    {
        m_info.f();
    }

    static int d(M_Info m_info)
    {
        return m_info.Z;
    }

    static int e(M_Info m_info)
    {
        return m_info.Y;
    }

    private void e()
    {
        if (c != null)
        {
            c.cancel();
            c = null;
        }
    }

    protected final void a()
    {
    }

    public final void a(int i1)
    {
        g();
        if (ab != null)
        {
            ab.a(d(19));
            ab.notifyDataSetChanged();
        }
        if (n.l == 0x7f0200a7 && n.y != null)
        {
            n.y.c();
            n.y = null;
        }
    }

    public final void a(int i1, String as[])
    {
        super.a(new bo(this, as));
    }

    protected final void a(String s)
    {
        if (ab != null)
        {
            ab.a(d(17));
            ab.notifyDataSetChanged();
        }
        switch (Z)
        {
        case 1: // '\001'
        default:
            return;

        case 0: // '\0'
            try
            {
                String s1 = (new StringBuilder("PGI:!:IFS:!:")).append(n.af.a((new StringBuilder(String.valueOf(s))).append(":-:").append(n.ak[13]).toString())).toString();
                getParent();
                a(s, s1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                g();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                g();
            }
            s.printStackTrace();
            return;

        case 8: // '\b'
            break;
        }
        try
        {
            String s2 = (new StringBuilder("PGI:!:ISDN:!:")).append(n.af.a((new StringBuilder(String.valueOf(s))).append(":-:").append(n.ak[13]).toString())).append(":!:1").toString();
            getParent();
            a(s, s2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            g();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            g();
        }
        s.printStackTrace();
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
        a = new com.c.a(this);
        b = a.b("inbox_info").size();
        a.b();
    }

    public final void i()
    {
        if (ab != null)
        {
            ab.a(d(19));
            ab.notifyDataSetChanged();
        }
    }

    public void onClick(View view)
    {
        super.onClick(view);
        if (x == view && ab != null)
        {
            ab.a(d(17));
            ab.notifyDataSetChanged();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f03004e);
        d();
        q.add("Info Saldo");
        q.add("Mutasi Rekening");
        q.add("Rekening Deposito");
        q.add("Info Reksadana");
        r.add("Info Reksadana");
        q.add("\t\t  NAB Reksadana");
        q.add("\t\t  Saldo Reksadana");
        q.add("Info Kurs");
        q.add("Info RDN");
        r.add("Info RDN");
        q.add("\t\t  Info Saldo");
        q.add("\t\t  Mutasi Rekening");
        q.add("Info KPR");
        r.add("Info KPR");
        q.add("\t\t  Inquiry Pinjaman");
        q.add("Info Kartu Kredit");
        r.add("Info Kartu Kredit");
        q.add("\t\t  Saldo");
        q.add("\t\t  Transaksi");
        q.add("Lainnya");
        if (b == 0)
        {
            q.add("Inbox");
        } else
        {
            q.add((new StringBuilder("Inbox (")).append(b).append(")").toString());
        }
        aa = (ListView)findViewById(0x7f0b0169);
        ab = new bm(this, this, q, r);
        ab.a(d(17));
        aa.setAdapter(ab);
        ab.notifyDataSetChanged();
        aa.invalidate();
        aa.setOnItemClickListener(f);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        e();
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
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
        if (ab != null)
        {
            ab.a(d(17));
            ab.notifyDataSetChanged();
        }
        n.i = 1;
        if (n.v == null)
        {
            n.v = new g(this);
        }
        n.v.a(this);
        e();
        d = new bn(this);
        c = new Timer();
        c.scheduleAtFixedRate(d, 1000L, 1000L);
    }
}
