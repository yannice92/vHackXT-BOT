// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.h;

import com.bca.mobile.n;
import java.util.TimerTask;

// Referenced classes of package com.h:
//            b, a

final class d extends TimerTask
{

    d()
    {
    }

    public final void run()
    {
        if (n.l == 0x7f0200a9)
        {
            int i = b.k + 1;
            b.k = i;
            if (i == 60)
            {
                b.f.b(11);
            }
            return;
        } else
        {
            b.k = 0;
            return;
        }
    }
}
