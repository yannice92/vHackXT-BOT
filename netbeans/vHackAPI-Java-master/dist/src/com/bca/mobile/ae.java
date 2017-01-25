// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.content.Context;
import android.widget.Toast;
import com.bca.b.a;
import com.bca.b.b;
import com.f.e;
import com.utilities.r;
import java.io.PrintStream;

// Referenced classes of package com.bca.mobile:
//            n

public final class ae
    implements a, Runnable
{

    private e a;
    private Context b;
    private Thread c;
    private String d;

    public ae(Context context)
    {
        b = context;
        c = new Thread(this);
    }

    public final void a()
    {
        c.start();
    }

    public final void a(String s, e e)
    {
        a = e;
        d = s;
    }

    public final void b()
    {
        r.a(b, "mbca_prov_smsent", 100);
        System.out.println("SMS Sent");
        Toast.makeText(b, "SMS Sent", 0).show();
        if (n.y != null)
        {
            n.y.c();
            n.y = null;
        }
        com.f.a a1 = new com.f.a(b, n.D, Integer.parseInt(n.E));
        n.y = a1;
        a1.a(a);
        n.aw = true;
        n.y.start();
    }

    public final void run()
    {
        com.bca.b.b.a(b, n.C, d, this);
    }
}
