// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import b.a.a.d;
import com.bca.c.g;
import com.bca.mobile.ShareActivity;
import com.bca.mobile.TabSample;
import com.bca.mobile.n;
import com.f.a;
import com.utilities.e;
import java.util.ArrayList;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile.transaction:
//            y, ab, aa, z

public class M_Admin_Hapus_Trans_Ant_Rek extends ShareActivity
{

    ArrayList a;
    ArrayList b;
    ArrayList c;
    Button d;
    boolean e;
    public android.widget.CompoundButton.OnCheckedChangeListener f;
    private String g;
    private int h;
    private final int i = 1;
    private final int j = 2;
    private int k;
    private String l;
    private ListView m;
    private ab n;

    public M_Admin_Hapus_Trans_Ant_Rek()
    {
        g = "";
        h = 0;
        d = null;
        f = new y(this);
    }

    static int a(M_Admin_Hapus_Trans_Ant_Rek m_admin_hapus_trans_ant_rek)
    {
        return m_admin_hapus_trans_ant_rek.k;
    }

    static void a(M_Admin_Hapus_Trans_Ant_Rek m_admin_hapus_trans_ant_rek, int i1)
    {
        m_admin_hapus_trans_ant_rek.k = i1;
    }

    static void a(M_Admin_Hapus_Trans_Ant_Rek m_admin_hapus_trans_ant_rek, String s)
    {
        m_admin_hapus_trans_ant_rek.g = s;
    }

    static int b(M_Admin_Hapus_Trans_Ant_Rek m_admin_hapus_trans_ant_rek)
    {
        return m_admin_hapus_trans_ant_rek.h;
    }

    protected final void a()
    {
    }

    public final void a(int i1)
    {
        g();
        a.clear();
        k = 0;
        n.notifyDataSetInvalidated();
        c.clear();
        if (n.l == 0x7f0200a7 && n.y != null)
        {
            n.y.c();
            n.y = null;
        }
    }

    public final void a(int i1, String as[])
    {
        a(((Runnable) (new aa(this, as))));
    }

    protected final void a(String s)
    {
        int i1;
        boolean flag;
        flag = false;
        c.clear();
        i1 = 0;
_L9:
        if (i1 < a.size()) goto _L2; else goto _L1
_L1:
        Object obj;
        n.notifyDataSetInvalidated();
        obj = new StringBuilder();
        i1 = ((flag) ? 1 : 0);
_L7:
        if (i1 < c.size()) goto _L4; else goto _L3
_L3:
        c.clear();
        h = 2;
        if (g.equals(""))
        {
            obj = (new StringBuilder("PGI:!:")).append(l).append(":!:").append(((StringBuilder) (obj)).toString()).append(":!:").append(n.af.a((new StringBuilder(String.valueOf(s))).append(":-:").append(n.ak[13]).toString())).toString();
            getParent();
            a(s, ((String) (obj)));
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        int j1 = ((Integer)a.get(i1)).intValue();
        c.add((String)b.get(j1));
        i1++;
        continue; /* Loop/switch isn't completed */
_L4:
        ((StringBuilder) (obj)).append((String)c.get(i1));
        if (c.size() - 1 == i1) goto _L3; else goto _L5
_L5:
        ((StringBuilder) (obj)).append(":");
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
        try
        {
            String s1 = (new StringBuilder("PGI:!:")).append(l).append(":!:").append(g).append(":!:").append(n.af.a((new StringBuilder(String.valueOf(s))).append(":-:").append(n.ak[13]).toString())).toString();
            getParent();
            a(s, s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    protected final void b()
    {
    }

    public final void b(String s)
    {
    }

    public final void c()
    {
        E = 0;
    }

    public void onCancel(DialogInterface dialoginterface)
    {
    }

    public void onClick(View view)
    {
        super.onClick(view);
        if (view != d) goto _L2; else goto _L1
_L1:
        if (k != 0)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        if (!l.equals("AHDTR") && !l.equals("AHDTB") && !l.equals("AHVP")) goto _L4; else goto _L3
_L3:
        a(null, "150 - Anda belum memilih no rekening tujuan yang akan dihapus.", getParent(), false, "Back");
_L6:
        return;
_L4:
        if (l.equals("AHDS"))
        {
            a(null, "Anda belum memilih No. Sakuku tujuan yang akan dihapus", getParent(), false, "Back");
            return;
        }
        if (!l.equals("AHDP")) goto _L6; else goto _L5
_L5:
        a(null, "150 - Anda belum memilih no. pembayaran yang akan dihapus.", getParent(), false, "Back");
        return;
        int i1;
        e = true;
        view = new StringBuilder();
        c.clear();
        i1 = 0;
_L10:
        if (i1 < a.size()) goto _L8; else goto _L7
_L7:
        h = 1;
        g((new StringBuilder("PGI:!:")).append(l).append(":!::!:").append(view.toString()).append(":!:1").toString());
        e = false;
        return;
_L8:
        int j1 = ((Integer)a.get(i1)).intValue();
        c.add((String)b.get(j1));
        view.append((String)c.get(i1));
        if (i1 == a.size() - 1) goto _L7; else goto _L9
_L9:
        view.append(":");
        i1++;
        if (true) goto _L10; else goto _L2
_L2:
        view = super.x;
        return;
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f030049);
        if (n.am != null)
        {
            n.am.a("Send", false);
        }
        a = new ArrayList();
        c = new ArrayList();
        b = (ArrayList)n.m.get("admin_list_data");
        l = (String)n.m.get("send_keyword");
        bundle = (TextView)findViewById(0x7f0b0138);
        if (!l.equals("AHDTR")) goto _L2; else goto _L1
_L1:
        bundle.setText("Daftar Transfer:");
_L4:
        m = (ListView)findViewById(0x7f0b013c);
        n = new ab(this, getParent());
        n.a(b);
        m.setAdapter(n);
        n.notifyDataSetChanged();
        m.invalidate();
        d = (Button)findViewById(0x7f0b013a);
        d.setOnClickListener(this);
        d.setText("Delete");
        ((Button)findViewById(0x7f0b0139)).setOnClickListener(new z(this));
        return;
_L2:
        if (l.equals("AHDTB"))
        {
            bundle.setText("Daftar Transfer:");
        } else
        if (l.equals("AHVP"))
        {
            bundle.setText("Daftar Transfer:");
        } else
        if (l.equals("AHDS"))
        {
            bundle.setText("Daftar Transfer:");
        } else
        if (l.equals("AHDP"))
        {
            bundle.setText("Daftar Pembayaran:");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
    }

    public void onResultButtonCancel(View view)
    {
        E = 0;
    }

    public void onResultButtonOK(View view)
    {
        E;
        JVM INSTR tableswitch 1 1: default 24
    //                   1 30;
           goto _L1 _L2
_L1:
        E = 0;
        return;
_L2:
        f();
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void onResume()
    {
        super.onResume();
        if (n.v == null)
        {
            n.v = new g(this);
        }
        n.v.a(this);
    }
}
