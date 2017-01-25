// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.bca.c.c;
import com.bca.c.g;
import com.bca.mobile.ShareActivity;
import com.bca.mobile.n;
import com.f.a;

// Referenced classes of package com.bca.mobile.transaction:
//            ct, cu, cv

public class M_Info_Suku_Bunga extends ShareActivity
    implements c
{

    public android.widget.AdapterView.OnItemClickListener a;
    private final int b = 0;
    private final int c = 1;
    private final int d = 2;
    private ListView e;
    private cv f;

    public M_Info_Suku_Bunga()
    {
        a = new ct(this);
    }

    protected final void a()
    {
    }

    public final void a(int i)
    {
        g();
        if (n.l == 0x7f0200a7 && n.y != null)
        {
            n.y.c();
            n.y = null;
        }
    }

    public final void a(int i, String as[])
    {
        super.a(new cu(this, as));
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

    public void onCancel(DialogInterface dialoginterface)
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f030057);
        e = (ListView)findViewById(0x7f0b01a7);
        f = new cv(this, this);
        f.a(getResources().getStringArray(0x7f0e0003));
        e.setAdapter(f);
        f.notifyDataSetChanged();
        e.invalidate();
        e.setOnItemClickListener(a);
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
        if (n.v == null)
        {
            n.v = new g(this);
        }
        n.v.a(this);
    }
}
