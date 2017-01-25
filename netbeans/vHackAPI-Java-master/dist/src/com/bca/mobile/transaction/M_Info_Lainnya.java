// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.bca.c.c;
import com.bca.c.g;
import com.bca.mobile.ShareActivity;
import com.bca.mobile.bm;
import com.bca.mobile.n;
import com.f.a;
import java.util.List;

// Referenced classes of package com.bca.mobile.transaction:
//            ca, cb

public class M_Info_Lainnya extends ShareActivity
    implements c
{

    public android.widget.AdapterView.OnItemClickListener a;
    private final int b = 1;
    private final int c = 2;
    private final int d = 3;
    private int e;
    private ListView f;
    private bm g;
    private int h[];

    public M_Info_Lainnya()
    {
        a = new ca(this);
    }

    static void a(M_Info_Lainnya m_info_lainnya, int i)
    {
        m_info_lainnya.e = i;
    }

    static void a(M_Info_Lainnya m_info_lainnya, int ai[])
    {
        m_info_lainnya.h = ai;
    }

    static int[] a(M_Info_Lainnya m_info_lainnya)
    {
        return m_info_lainnya.h;
    }

    static bm b(M_Info_Lainnya m_info_lainnya)
    {
        return m_info_lainnya.g;
    }

    static int c(M_Info_Lainnya m_info_lainnya)
    {
        return m_info_lainnya.e;
    }

    protected final void a()
    {
    }

    public final void a(int i)
    {
        g();
        if (g != null)
        {
            g.a(d(4));
            g.notifyDataSetChanged();
        }
        if (n.l == 0x7f0200a7 && n.y != null)
        {
            n.y.c();
            n.y = null;
        }
    }

    public final void a(int i, String as[])
    {
        super.a(new cb(this, as));
    }

    protected final void a(String s)
    {
        if (g != null)
        {
            g.a(d(4));
            g.notifyDataSetChanged();
        }
        int i = e;
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

    public void onClick(View view)
    {
        super.onClick(view);
        if (x == view && g != null)
        {
            g.a(d(4));
            g.notifyDataSetChanged();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f03004e);
        q.add("Suku Bunga");
        r.add("Suku Bunga");
        q.add("Tabungan");
        q.add("Deposito Rupiah");
        q.add("Deposito Valas");
        f = (ListView)findViewById(0x7f0b0169);
        g = new bm(this, this, q, r);
        g.a(d(4));
        f.setAdapter(g);
        g.notifyDataSetChanged();
        f.invalidate();
        f.setOnItemClickListener(a);
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
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
        if (g != null)
        {
            g.a(d(4));
            g.notifyDataSetChanged();
        }
        n.i = 1;
        if (n.v == null)
        {
            n.v = new g(this);
        }
        n.v.a(this);
    }
}
