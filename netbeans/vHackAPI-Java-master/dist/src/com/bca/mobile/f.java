// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;


// Referenced classes of package com.bca.mobile:
//            ActivateActivity_Trans, n

final class f
    implements Runnable
{

    final ActivateActivity_Trans a;
    private final int b;
    private final String c;
    private final String d;

    f(ActivateActivity_Trans activateactivity_trans, int i, String s, String s1)
    {
        a = activateactivity_trans;
        b = i;
        c = s;
        d = s1;
        super();
    }

    public final void run()
    {
        a.g();
        if (b == 1000)
        {
            if (c.contains("<Rsp "))
            {
                n.ar = c;
                ActivateActivity_Trans activateactivity_trans = a;
                String as[] = ActivateActivity_Trans.h(n.ar);
                a.a(as[2], a, false, as[1], true, false);
            }
        } else
        {
            if (b == 9)
            {
                a.a(c, a, false, d, false, true);
                return;
            }
            if (b == 12)
            {
                a.a(c, a, false, d, false, false);
                return;
            }
        }
    }
}
