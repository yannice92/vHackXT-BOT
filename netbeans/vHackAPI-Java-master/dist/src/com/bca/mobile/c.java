// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import com.h.b;

// Referenced classes of package com.bca.mobile:
//            ActivateActivity, bn

final class c
    implements Runnable
{

    final ActivateActivity a;
    private final int b;

    c(ActivateActivity activateactivity, int i)
    {
        a = activateactivity;
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
            a.a(null, "Koneksi internet Anda terputus. Silakan ulangi beberapa saat lagi", a, false, "Close");
            return;

        case 3: // '\003'
            a.g();
            break;
        }
        com.h.b.a();
        bn.a(a, true);
        a.finish();
    }
}
