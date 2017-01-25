// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import com.h.b;

// Referenced classes of package com.bca.mobile:
//            InputATMActivity, bn

final class p
    implements Runnable
{

    final InputATMActivity a;
    private final int b;

    p(InputATMActivity inputatmactivity, int i)
    {
        a = inputatmactivity;
        b = i;
        super();
    }

    public final void run()
    {
        a.g();
        switch (b)
        {
        default:
            return;

        case 1: // '\001'
            com.h.b.a();
            break;
        }
        a.a(bn.a(0x7f0c0060), bn.a(0x7f0c0066), a, false, "Ok");
    }
}
