// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.bca.c.g;
import com.bca.mobile.ShareActivity;
import com.bca.mobile.TabSample;
import com.bca.mobile.bm;
import com.bca.mobile.n;
import com.f.a;
import java.util.List;

// Referenced classes of package com.bca.mobile.transaction:
//            m, n

public class M_Admin extends ShareActivity
{

    public android.widget.AdapterView.OnItemClickListener a;
    private ListView b;
    private int c[];
    private int d;
    private bm e;

    public M_Admin()
    {
        a = new m(this);
    }

    static void a(M_Admin m_admin, int j)
    {
        m_admin.d = j;
    }

    static void a(M_Admin m_admin, int ai[])
    {
        m_admin.c = ai;
    }

    static int[] a(M_Admin m_admin)
    {
        return m_admin.c;
    }

    static bm b(M_Admin m_admin)
    {
        return m_admin.e;
    }

    static int c(M_Admin m_admin)
    {
        return m_admin.d;
    }

    protected final void a()
    {
    }

    public final void a(int j)
    {
        g();
        if (n.l == 0x7f0200a7 && n.y != null)
        {
            n.y.c();
            n.y = null;
        }
    }

    public final void a(int j, String as[])
    {
        a(((Runnable) (new com.bca.mobile.transaction.n(this, as))));
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

    public final void i()
    {
        if (e != null)
        {
            e.a(d(15));
            e.notifyDataSetChanged();
        }
    }

    public void onCancel(DialogInterface dialoginterface)
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f030044);
        q.add("Ganti PIN");
        q.add("Blokir Kartu ATM");
        q.add("Blokir Kartu Kredit");
        q.add("Koneksi Kartu Kredit");
        r.add("Koneksi Kartu Kredit");
        q.add("Daftar");
        q.add("Hapus");
        q.add("Aktivasi Kartu Kredit");
        r.add("Aktivasi Kartu Kredit");
        q.add("Aktivasi Kartu");
        q.add("Buat/Ubah PIN");
        q.add("Hapus Daftar");
        r.add("Hapus Daftar");
        q.add("Transfer Antar Rekening");
        q.add("Transfer Antar Bank");
        q.add("Transfer BCA Virtual Account");
        q.add("Transfer Sakuku");
        q.add("Pembayaran");
        b = (ListView)findViewById(0x7f0b0110);
        e = new bm(this, getParent(), q, r);
        e.a(d(15));
        b.setAdapter(e);
        e.notifyDataSetChanged();
        b.invalidate();
        b.setOnItemClickListener(a);
    }

    public void onItemClick(AdapterView adapterview, View view, int j, long l)
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
        if (n.am != null)
        {
            n.am.a("Send", false);
        }
        if (e != null)
        {
            e.a(d(15));
            e.notifyDataSetChanged();
        }
        if (n.v == null)
        {
            n.v = new g(this);
        }
        n.v.a(this);
    }
}
