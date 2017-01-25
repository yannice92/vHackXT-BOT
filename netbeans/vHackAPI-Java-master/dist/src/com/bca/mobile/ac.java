// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import com.h.b;

// Referenced classes of package com.bca.mobile:
//            ProvisionCodeAccess, bn

final class ac
    implements Runnable
{

    final ProvisionCodeAccess a;
    private final int b;

    ac(ProvisionCodeAccess provisioncodeaccess, int i)
    {
        a = provisioncodeaccess;
        b = i;
        super();
    }

    public final void run()
    {
        a.g();
        switch (b)
        {
        case 1: // '\001'
        default:
            return;

        case 2: // '\002'
            a.g();
            com.h.b.a();
            a.a(bn.a(0x7f0c0060), "Sementara transaksi tidak dapat diproses, silakan ulangi beberapa saat lagi", a, false, "Close");
            return;

        case 3: // '\003'
            a.g();
            break;
        }
        com.h.b.a();
        a.finish();
    }
}
