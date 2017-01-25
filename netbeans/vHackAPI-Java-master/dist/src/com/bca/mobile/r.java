// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import com.f.a;
import com.h.b;

// Referenced classes of package com.bca.mobile:
//            n, InputATMActivity

final class r
    implements Runnable
{

    final InputATMActivity a;
    private final int b;

    r(InputATMActivity inputatmactivity, int i)
    {
        a = inputatmactivity;
        b = i;
        super();
    }

    public final void run()
    {
        if (b == 1)
        {
            com.h.b.a();
            if (n.y != null)
            {
                n.y.c();
            }
        }
    }
}
