// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.c;

import android.content.Context;
import b.a.a.d;
import com.bca.mobile.bn;
import com.bca.mobile.n;
import com.f.a;
import com.f.e;
import com.utilities.r;

// Referenced classes of package com.bca.c:
//            c

public final class g
    implements e
{

    Context a;
    int b;
    c c;

    public g(Context context)
    {
        a = context;
        if (n.y != null)
        {
            n.y.a(this);
        }
    }

    public final void a(c c1)
    {
        c = c1;
        if (n.y != null)
        {
            n.y.a(this);
        }
    }

    public final void a(String s, String as[])
    {
        if (!s.equals("ACTS")) goto _L2; else goto _L1
_L1:
        c.b(s, as[1]);
_L4:
        return;
_L2:
        if (s.equals("FPCS"))
        {
            c.b(s, "");
            return;
        }
        if (s.equals("NLGIAErrorXML"))
        {
            c.a(a, 1000, as[0], "");
            return;
        }
        if (s.equals(n.o))
        {
            c.a(a, 10, "", "");
            return;
        }
        if (s.equals(n.n))
        {
            c.a(a, 8, "", "");
            return;
        }
        if (s.equals("ERRORPIN"))
        {
            s = new StringBuilder();
            s.append(as[1]);
            c.a(a, 9, s.toString(), as[2]);
            return;
        }
        if (s.equals("ERROR"))
        {
            c.a(a, 12, as[1], as[2]);
            return;
        }
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
        if (!s.equals("NLGIAOk")) goto _L7; else goto _L6
_L6:
        Object obj = new com.c.a(a);
        s = ((String) (obj));
        Object obj1 = new com.utilities.e(n.ak[10]);
        s = ((String) (obj));
        n.af = ((com.utilities.e) (obj1));
        s = ((String) (obj));
        obj1 = ((com.utilities.e) (obj1)).b(as[0]);
        s = ((String) (obj));
        if (!n.ak[15].equals(obj1)) goto _L9; else goto _L8
_L8:
        s = ((String) (obj));
        obj1 = n.ak[13];
        s = ((String) (obj));
        obj1 = n.af.a(((String) (obj1)));
        s = ((String) (obj));
        ((com.c.a) (obj)).a(as[2], ((String) (obj1)));
        s = ((String) (obj));
        n.ak[15] = n.ak[13];
        s = ((String) (obj));
        n.ak[13] = n.af.b(as[2]);
_L11:
        s = ((String) (obj));
        n.ag = new com.utilities.e(n.af.b(as[1]));
        s = ((String) (obj));
        n.W = false;
        s = ((String) (obj));
        if (!bn.b("isLogin", "0").equals("1"))
        {
            break MISSING_BLOCK_LABEL_504;
        }
        s = ((String) (obj));
        if (n.h)
        {
            break MISSING_BLOCK_LABEL_504;
        }
        s = ((String) (obj));
        if (n.y == null)
        {
            break MISSING_BLOCK_LABEL_504;
        }
        s = ((String) (obj));
        n.y.a(this);
        ((com.c.a) (obj)).b();
        return;
_L9:
        s = ((String) (obj));
        if (c == null) goto _L11; else goto _L10
_L10:
        s = ((String) (obj));
        c.a(a, 5, "", "");
          goto _L11
        as;
_L17:
        s = ((String) (obj));
        as.printStackTrace();
        ((com.c.a) (obj)).b();
        return;
        as;
        obj = null;
_L15:
        s = ((String) (obj));
        as.printStackTrace();
        ((com.c.a) (obj)).b();
        return;
        as;
        s = null;
_L13:
        s.b();
        throw as;
_L7:
        s = c;
        obj = a;
        s.a(b, as);
        return;
        as;
        if (true) goto _L13; else goto _L12
_L12:
        as;
        if (true) goto _L15; else goto _L14
_L14:
        as;
        obj = null;
        if (true) goto _L17; else goto _L16
_L16:
    }
}
