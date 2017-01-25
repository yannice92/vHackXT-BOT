// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.widget.EditText;
import com.utilities.r;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Commerce_PMA

final class bc
    implements Runnable
{

    final M_Commerce_PMA a;
    private final String b;

    bc(M_Commerce_PMA m_commerce_pma, String s)
    {
        a = m_commerce_pma;
        b = s;
        super();
    }

    public final void run()
    {
        M_Commerce_PMA.a(a, true);
        if (!b.equals(""))
        {
            M_Commerce_PMA.j(a).setText((new StringBuilder("Rp. ")).append(r.d(b)).append(".00").toString());
        }
        a.H = b;
        M_Commerce_PMA.c(a, b);
    }
}
