// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.bca.c.g;
import com.bca.mobile.ShareActivity;
import com.bca.mobile.TabSample;
import com.bca.mobile.bm;
import com.bca.mobile.n;
import com.f.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.bca.mobile.transaction:
//            db, dc, de, dd

public class M_Transfer extends ShareActivity
{

    private final int T = 10;
    private ListView U;
    private int V[];
    private bm W;
    private int X;
    com.c.a a;
    int b;
    Timer c;
    TimerTask d;
    public Handler e;
    public android.widget.AdapterView.OnItemClickListener f;
    private final int g = 1;
    private final int h = 2;
    private final int i = 4;
    private final int j = 5;
    private final int k = 6;
    private final int l = 7;
    private final int m = 8;
    private final int n = 9;

    public M_Transfer()
    {
        c = null;
        d = null;
        e = new db(this);
        f = new dc(this);
    }

    static bm a(M_Transfer m_transfer)
    {
        return m_transfer.W;
    }

    static void a(M_Transfer m_transfer, int i1)
    {
        m_transfer.X = i1;
    }

    static void a(M_Transfer m_transfer, int ai[])
    {
        m_transfer.V = ai;
    }

    static int[] b(M_Transfer m_transfer)
    {
        return m_transfer.V;
    }

    static int c(M_Transfer m_transfer)
    {
        return m_transfer.X;
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
        if (W != null)
        {
            W.a(d(10));
            W.notifyDataSetChanged();
        }
        if (n.l == 0x7f0200a7 && n.y != null)
        {
            n.y.c();
            n.y = null;
        }
    }

    public final void a(int i1, String as[])
    {
        a(((Runnable) (new de(this, as))));
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
        a = new com.c.a(this);
        b = a.b("inbox_transfer").size();
        a.b();
    }

    public final void i()
    {
        if (W != null)
        {
            W.a(d(10));
            W.notifyDataSetChanged();
        }
    }

    public void onCancel(DialogInterface dialoginterface)
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f03005b);
        d();
        q.add("Daftar Transfer");
        r.add("Daftar Transfer");
        q.add("Antar Rekening");
        q.add("Antar Bank");
        q.add("Transfer");
        r.add("Transfer");
        q.add("Antar Rekening");
        q.add("Antar Bank");
        q.add("BCA Virtual Account");
        q.add("Sakuku");
        q.add("Status Transaksi Sakuku");
        if (b == 0)
        {
            q.add("Inbox");
        } else
        {
            q.add((new StringBuilder("Inbox (")).append(b).append(")").toString());
        }
        U = (ListView)findViewById(0x7f0b01c5);
        W = new bm(this, this, q, r);
        W.a(d(10));
        U.setAdapter(W);
        U.setSoundEffectsEnabled(false);
        W.notifyDataSetChanged();
        U.invalidate();
        U.setOnItemClickListener(f);
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
        if (W != null)
        {
            W.a(d(10));
            W.notifyDataSetChanged();
        }
        if (n.v == null)
        {
            n.v = new g(this);
        }
        n.v.a(this);
        e();
        d = new dd(this);
        c = new Timer();
        c.scheduleAtFixedRate(d, 1000L, 1000L);
    }
}
