// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.h;

import com.bca.mobile.n;
import java.util.TimerTask;

// Referenced classes of package com.h:
//            b, a

final class c extends TimerTask
{

    c()
    {
    }

    public final void run()
    {
        b.a++;
        if (!b.e)
        {
            b.b++;
            b.c++;
            b.d++;
            if (b.b == 180)
            {
                b.f.b(1);
            } else
            {
                if (b.c == 120)
                {
                    b.f.b(2);
                    return;
                }
                if (b.d == n.q / 1000)
                {
                    b.f.b(3);
                    return;
                }
            }
        }
    }
}
