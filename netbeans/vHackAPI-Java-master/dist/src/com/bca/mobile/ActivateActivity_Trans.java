// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import b.a.a.d;
import com.bca.c.g;
import com.f.a;
import com.utilities.e;
import java.io.PrintStream;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile:
//            ShareActivity, n, e, f, 
//            bn

public class ActivateActivity_Trans extends ShareActivity
{

    TextView a;
    int b;
    private String c;

    public ActivateActivity_Trans()
    {
        b = 0;
    }

    protected final void a()
    {
        f();
    }

    public final void a(int i)
    {
        if (n.l == 0x7f0200a7 && n.y != null)
        {
            n.y.c();
            n.y = null;
        }
    }

    public final void a(int i, String as[])
    {
        super.a(new com.bca.mobile.e(this, as));
    }

    public final void a(Context context, int i, String s, String s1)
    {
        a(((Runnable) (new f(this, i, s, s1))));
    }

    protected final void a(String s)
    {
        try
        {
            b = 1;
            String s1 = (new StringBuilder("PGI:!:ACT:!:")).append(n.af.a((new StringBuilder(String.valueOf(s))).append(":-:").append(n.af.a(n.ak[13])).toString())).append(":!:").append(a.getText()).toString();
            System.out.println(s1);
            a(s, s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

    protected final void b()
    {
        n.ao = true;
        com.bca.mobile.bn.a(this, true);
    }

    public final void b(String s)
    {
    }

    public final void c()
    {
        if (b == 1)
        {
            finish();
        }
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        n.ao = true;
        com.bca.mobile.bn.a(this, true);
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f03001f, this);
        super.d("Send");
        super.e("Close");
        super.c("m-BCA");
        c = (String)n.m.get("atm_num");
        a = (TextView)findViewById(0x7f0b0078);
        a.setText(c);
        com.bca.mobile.n.g = true;
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
    }

    public void onResultButtonCancel(View view)
    {
    }

    public void onResultButtonOK(View view)
    {
        if (b == 1)
        {
            finish();
        }
        b = 0;
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
