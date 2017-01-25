// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import b.a.a.d;
import com.bca.c.g;
import com.bca.mobile.ShareActivity;
import com.bca.mobile.TabSample;
import com.bca.mobile.n;
import com.utilities.c;
import com.utilities.e;
import java.util.ArrayList;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile.transaction:
//            dl, dk

public class M_Transfer_Detail_Status_Sakuku extends ShareActivity
{

    String a[];
    ArrayList b;
    String c[];
    String d;
    int e;
    ListView f;
    dl g;
    String h[];
    String i[];
    String j[];
    String k[];
    String l;
    boolean m;
    private boolean n;

    public M_Transfer_Detail_Status_Sakuku()
    {
        n = false;
        f = null;
        m = true;
    }

    private int d()
    {
        int j1 = b.size() - 1;
        h = new String[j1];
        i = new String[j1];
        j = new String[j1];
        k = new String[j1];
        int i1 = 0;
        do
        {
            if (i1 >= j1)
            {
                g.a(h);
                g.notifyDataSetInvalidated();
                return j1;
            }
            c = ((String)b.get(i1)).split(":\\$:");
            h[i1] = c[0].toString().replaceAll(":@:", "\n");
            i[i1] = c[1].toString();
            j[i1] = c[2].toString().replaceAll(":@:", "\n");
            k[i1] = c[3].toString();
            i1++;
        } while (true);
    }

    protected final void a()
    {
    }

    public final void a(int i1)
    {
        g();
    }

    public final void a(int i1, String as[])
    {
        super.a(new dk(this, as));
    }

    protected final void a(String s)
    {
        try
        {
            a(s, (new StringBuilder("PGI:!:TST:!:")).append(d.toString()).append(":!:").append(n.af.a((new StringBuilder(String.valueOf(s))).append(":-:").append(n.ak[13]).toString())).append(":!:3").toString());
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
        try
        {
            d();
            g.notifyDataSetInvalidated();
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f03005f);
        m = false;
        a = (String[])n.m.get("data_2");
        b = new ArrayList();
        b = com.utilities.c.b(a[1]);
        n.am.a("Send", false);
        try
        {
            f = (ListView)findViewById(0x7f0b01f0);
            g = new dl(this, this);
            d();
            f.setAdapter(g);
            f.invalidate();
            f.setChoiceMode(2);
            f.setOnItemClickListener(this);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.printStackTrace();
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        if (f == adapterview)
        {
            f.getCheckedItemPosition();
            if (i[i1].equals("Y"))
            {
                a(n.x, j[i1], getParent(), "Delete", "Back", new String[0]);
                d = k[i1];
                e = i1;
            } else
            if (i[i1].equals("N"))
            {
                a(n.x, j[i1], getParent(), false, "Back");
                d = k[i1];
                e = i1;
                return;
            }
        }
    }

    public void onResultButtonCancel(View view)
    {
    }

    public void onResultButtonDelete(View view)
    {
        if (i[e].equals("Y"))
        {
            f();
        }
    }

    public void onResultButtonOK(View view)
    {
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
