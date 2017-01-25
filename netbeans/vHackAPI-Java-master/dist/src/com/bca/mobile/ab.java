// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import com.f.a;
import com.h.b;

// Referenced classes of package com.bca.mobile:
//            ProvisionCodeAccess, n, bn

final class ab
    implements Runnable
{

    final ProvisionCodeAccess a;
    private final int b;

    ab(ProvisionCodeAccess provisioncodeaccess, int i)
    {
        a = provisioncodeaccess;
        b = i;
        super();
    }

    public final void run()
    {
        a.g();
        com.h.b.a();
        if (b == 8)
        {
            if (n.y != null)
            {
                n.y.c();
            }
            a.a(com.bca.mobile.bn.a(0x7f0c0060), com.bca.mobile.bn.a(0x7f0c0066), a, true, com.bca.mobile.bn.a(0x7f0c0028));
        }
    }
}
