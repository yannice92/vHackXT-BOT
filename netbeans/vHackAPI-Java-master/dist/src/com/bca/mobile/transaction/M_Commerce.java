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
import com.bca.c.c;
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
//            ag, ah, aj, ai

public class M_Commerce extends ShareActivity
    implements c
{

    private bm T;
    com.c.a a;
    int b;
    Timer c;
    TimerTask d;
    public Handler e;
    public android.widget.AdapterView.OnItemClickListener f;
    private final int g = 0;
    private final int h = 1;
    private final int i = 2;
    private final int j = 3;
    private final int k = 4;
    private final int l = 5;
    private ListView m;
    private int n[];

    public M_Commerce()
    {
        c = null;
        d = null;
        e = new ag(this);
        f = new ah(this);
    }

    static bm a(M_Commerce m_commerce)
    {
        return m_commerce.T;
    }

    static void a(M_Commerce m_commerce, int ai1[])
    {
        m_commerce.n = ai1;
    }

    static int[] b(M_Commerce m_commerce)
    {
        return m_commerce.n;
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
        if (n.l == 0x7f0200a7 && n.y != null)
        {
            n.y.c();
            n.y = null;
        }
    }

    public final void a(int i1, String as[])
    {
        super.a(new aj(this, as));
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
        b = a.b("inbox_commerce").size();
        a.b();
    }

    public final void i()
    {
        if (T != null)
        {
            T.a(d(5));
            T.notifyDataSetChanged();
        }
    }

    public void onCancel(DialogInterface dialoginterface)
    {
    }

    public void onClick(View view)
    {
        super.onClick(view);
        if (x == view && T != null)
        {
            T.a(d(5));
            T.notifyDataSetChanged();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f03004b);
        d();
        q.add("Voucher Isi Ulang");
        q.add("PLN Prabayar");
        q.add("PLN Manual Advice");
        q.add("Lainnya");
        if (b == 0)
        {
            q.add("Inbox");
        } else
        {
            q.add((new StringBuilder("Inbox (")).append(b).append(")").toString());
        }
        m = (ListView)findViewById(0x7f0b0146);
        T = new bm(this, getParent(), q, r);
        T.a(d(5));
        m.setAdapter(T);
        T.notifyDataSetChanged();
        m.invalidate();
        m.setOnItemClickListener(f);
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
        if (T != null)
        {
            T.a(d(5));
            T.notifyDataSetChanged();
        }
        if (n.v == null)
        {
            n.v = new g(this);
        }
        n.v.a(this);
        e();
        d = new ai(this);
        c = new Timer();
        c.scheduleAtFixedRate(d, 1000L, 1000L);
    }
}
