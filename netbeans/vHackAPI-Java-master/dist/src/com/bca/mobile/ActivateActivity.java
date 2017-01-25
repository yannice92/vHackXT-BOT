// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import b.a.a.d;
import com.bca.c.f;
import com.bca.mobile.transaction.TransactionListActivity;
import com.h.b;
import com.utilities.e;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile:
//            ShareActivity, b, d, n, 
//            bn, c

public class ActivateActivity extends ShareActivity
{

    TextView a;
    private String b;

    public ActivateActivity()
    {
    }

    protected final void a()
    {
        f();
    }

    public final void a(int i)
    {
        b.d = 0;
        b.c = 1000;
    }

    public final void a(int i, String as[])
    {
        super.a(new com.bca.mobile.b(this));
    }

    public final void a(Context context, int i, String s, String s1)
    {
        a(((Runnable) (new com.bca.mobile.d(this, i, s, s1))));
    }

    protected final void a(String s)
    {
        try
        {
            Object obj = new e(n.ai[12]);
            n.af = ((e) (obj));
            obj = ((e) (obj)).b(n.ai[15]);
            if (a(s, (new StringBuilder("ACT:!:")).append(n.af.a((new StringBuilder(String.valueOf(s))).append(":-:").append(((String) (obj))).toString())).append(":!:").append(a.getText()).toString()))
            {
                b.c = 0;
            }
            b.d = 1000;
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
        bn.a(this, true);
    }

    public final void b(int i)
    {
        super.a(new c(this, i));
    }

    public final void b(String s)
    {
    }

    public final void c()
    {
        if (E == 1)
        {
            bn.a(this, true);
        }
        E = 0;
    }

    public final boolean d()
    {
        return (new f(b, this)).a();
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        n.ao = true;
        bn.a(this, true);
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f03001f, this);
        super.d("Send");
        super.e("Close");
        super.c("m-BCA");
        b = (String)n.m.get("pw");
        if (b != null && b.length() != 6)
        {
            n.l = 0x7f0200a8;
        }
        a = (TextView)findViewById(0x7f0b0078);
        try
        {
            a.setText(n.ai[18]);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            a.setText("");
        }
        b.d = 0;
        com.h.b.a(this);
        if (n.s != null)
        {
            n.s.a(this);
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
    }

    public void onResultButtonCancel(View view)
    {
    }

    public void onResultButtonOK(View view)
    {
        if (E == 1)
        {
            startActivity(new Intent(this, com/bca/mobile/transaction/TransactionListActivity));
            finish();
        }
        E = 0;
    }
}
