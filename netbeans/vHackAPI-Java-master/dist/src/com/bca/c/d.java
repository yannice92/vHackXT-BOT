// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.c;

import android.content.Context;
import android.view.View;
import com.b.b;
import com.bca.mobile.ae;
import com.bca.mobile.bn;
import com.bca.mobile.n;
import com.f.e;

// Referenced classes of package com.bca.c:
//            c

public final class d
    implements android.view.View.OnClickListener, e, Runnable
{

    private c a;
    private Context b;
    private int c;
    private String d;
    private Thread e;
    private boolean f;
    private ae g;

    public d(Context context)
    {
        b = context;
        c = 1;
        e = new Thread(this);
        f = false;
        g = new ae(b);
        bn.a("nextAct", "0");
    }

    public final void a()
    {
        e.start();
    }

    public final void a(c c1)
    {
        a = c1;
    }

    public final void a(String s)
    {
        d = s;
    }

    public final void a(String s, String as[])
    {
        if (s.equals("ERRORPIN"))
        {
            s = new StringBuilder();
            s.append(as[1]);
            a.a(b, 9, s.toString(), as[2]);
        } else
        {
            if (s.equals("ERROR"))
            {
                a.a(b, 12, as[1], as[2]);
                return;
            }
            if (s.equals(n.n))
            {
                a.a(b, 8, "", "");
                return;
            }
            if (s.equals("ACTOk"))
            {
                s = a;
                Context context = b;
                s.a(1, as);
                return;
            }
            if (s.equals("NPROVISOk"))
            {
                n.af = new com.utilities.e(as[12]);
                n.ai = as;
                s = a;
                as = b;
                s.a(c, null);
                return;
            }
        }
    }

    public final void onClick(View view)
    {
    }

    public final void run()
    {
        switch (com.b.b.a(b))
        {
        default:
            g.a(d, this);
            g.a();
            return;

        case 0: // '\0'
            a.a(b, 1001, "", "");
            com.h.b.a();
            return;

        case 1: // '\001'
            a.a(b, 1001, "", "");
            break;
        }
        com.h.b.a();
    }
}
