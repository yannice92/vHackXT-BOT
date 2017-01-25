// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.c;

import android.content.Context;
import b.a.a.d;
import com.bca.mobile.bn;
import com.bca.mobile.n;
import com.f.e;
import com.utilities.r;

// Referenced classes of package com.bca.c:
//            c

public final class a
    implements e, Runnable
{

    private Context a;
    private int b;
    private c c;
    private Thread d;

    public a(Context context)
    {
        a = context;
        b = 5;
        d = new Thread(this);
    }

    public final void a()
    {
        d = new Thread(this);
    }

    public final void a(c c1)
    {
        c = c1;
        if (n.y != null && c1 != null)
        {
            n.y.a(this);
        }
    }

    public final void a(String s, String as[])
    {
        if (!s.equals(n.o)) goto _L2; else goto _L1
_L1:
        if (c != null)
        {
            c.a(a, 10, "", "");
        }
_L4:
        return;
_L2:
        if (!s.equals("UNF"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (c != null)
        {
            c.a(a, 2001, r.a(as, ":!:"), "");
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!s.equals("UF"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (c != null)
        {
            c.a(a, 2002, r.a(as, ":!:"), "");
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (!s.equals("NLGIAErrorXML"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (c != null)
        {
            c.a(a, 1000, as[0], "");
            return;
        }
        if (true) goto _L4; else goto _L6
_L6:
        if (s.equals("ERROR"))
        {
            c.a(a, 12, as[1], as[2]);
            return;
        }
        if (!s.equals(n.n))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (n.y != null)
        {
            n.y.c();
            n.y = null;
        }
        if (c == null) goto _L4; else goto _L7
_L7:
        c.a(a, 8, "", "");
        return;
        if (!s.equals("NLGIAOk")) goto _L4; else goto _L8
_L8:
        Object obj = null;
        s = new com.c.a(a);
        obj = new com.utilities.e(n.ak[10]);
        n.af = ((com.utilities.e) (obj));
        obj = ((com.utilities.e) (obj)).b(as[0]);
        if (!n.ak[15].equals(obj)) goto _L10; else goto _L9
_L9:
        obj = n.ak[13];
        obj = n.af.a(((String) (obj)));
        s.a(as[2], ((String) (obj)));
        n.ak[15] = n.ak[13];
        n.ak[13] = n.af.b(as[2]);
        if (c != null)
        {
            obj = c;
            Context context = a;
            ((c) (obj)).a(5, as);
        }
_L14:
        n.ag = new com.utilities.e(n.af.b(as[1]));
        n.W = false;
        if (!bn.b("isLogin", "0").equals("1") || n.h || n.y == null) goto _L12; else goto _L11
_L11:
        n.y.a(n.v);
_L15:
        s.b();
        return;
_L10:
        if (c == null) goto _L14; else goto _L13
_L13:
        c.a(a, 5, "", "");
          goto _L14
        as;
_L20:
        s.b();
        return;
_L12:
        obj = c;
        Context context1 = a;
        ((c) (obj)).a(5, as);
          goto _L15
        as;
_L19:
        s.b();
        return;
        as;
        s = ((String) (obj));
_L17:
        s.b();
        throw as;
        as;
        if (true) goto _L17; else goto _L16
_L16:
        s;
        s = null;
        if (true) goto _L19; else goto _L18
_L18:
        s;
        s = null;
          goto _L20
    }

    public final void b()
    {
        d.start();
    }

    public final void run()
    {
        if (n.y != null)
        {
            n.y.c();
            n.y = null;
        }
        com.f.a a1 = new com.f.a(a, n.ak[3], Integer.parseInt(n.ak[4]));
        n.y = a1;
        a1.a(this);
        if (n.h)
        {
            n.y.a(n.al);
        } else
        {
            n.y.a(n.am);
        }
        n.y.start();
    }
}
