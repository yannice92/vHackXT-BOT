// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.c;

import android.content.Context;
import com.b.b;
import com.bca.mobile.n;
import com.f.a;

// Referenced classes of package com.bca.c:
//            c

public final class e
    implements com.f.e, Runnable
{

    private c a;
    private Context b;
    private int c;

    public final void a(String s, String as[])
    {
        if (!s.equals("PROVISErrorXML") && !s.equals("ACTErrorXML")) goto _L2; else goto _L1
_L1:
        a.a(b, 1000, as[0], "");
_L4:
        return;
_L2:
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
        if (s.equals("ERRORPIN"))
        {
            s = new StringBuilder();
            s.append(as[1]);
            a.a(b, 9, s.toString(), as[2]);
            return;
        }
        if (!s.equals("TMIOk"))
        {
            break; /* Loop/switch isn't completed */
        }
        com.b.b.a(b);
        if (n.y != null)
        {
            n.y.a(this);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (s.equals("ProfileOk"))
        {
            n.af = new com.utilities.e(as[12]);
            n.ai = as;
            s = a;
            as = b;
            s.a(c, null);
            return;
        }
        if (s.equals("EMLOk"))
        {
            s = a;
            Context context1 = b;
            s.a(c, new String[] {
                as[0]
            });
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final void run()
    {
    }
}
