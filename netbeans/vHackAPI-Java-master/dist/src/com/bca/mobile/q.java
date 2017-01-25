// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.content.Intent;
import com.h.b;

// Referenced classes of package com.bca.mobile:
//            bn, InputATMActivity, ProvisionCodeAccess

final class q
    implements Runnable
{

    final InputATMActivity a;
    private final int b;

    q(InputATMActivity inputatmactivity, int i)
    {
        a = inputatmactivity;
        b = i;
        super();
    }

    public final void run()
    {
        if (b == 1)
        {
            com.bca.mobile.bn.b(a);
            a.g();
            b.b = 1000;
            Intent intent = new Intent(a, com/bca/mobile/ProvisionCodeAccess);
            a.startActivity(intent);
            a.finish();
        }
    }
}
