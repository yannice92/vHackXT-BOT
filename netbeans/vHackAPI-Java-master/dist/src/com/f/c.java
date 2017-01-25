// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.f;

import com.utilities.d;
import java.util.TimerTask;

// Referenced classes of package com.f:
//            a

final class c extends TimerTask
{

    final a a;

    c(a a1)
    {
        a = a1;
        super();
    }

    public final void run()
    {
        if (Long.parseLong(d.a()) - com.f.a.b(a) > 2L)
        {
            a.c();
            return;
        } else
        {
            a.b();
            return;
        }
    }
}
