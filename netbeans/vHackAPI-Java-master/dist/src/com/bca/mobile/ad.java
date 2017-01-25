// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import com.h.b;

// Referenced classes of package com.bca.mobile:
//            ProvisionCodeAccess

final class ad
    implements Runnable
{

    final ProvisionCodeAccess a;

    ad(ProvisionCodeAccess provisioncodeaccess)
    {
        a = provisioncodeaccess;
        super();
    }

    public final void run()
    {
        b.c = 1000;
        b.d = 0;
    }
}
