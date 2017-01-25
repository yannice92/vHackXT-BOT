// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.widget.EditText;
import com.utilities.r;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Commerce_Lainnya1

final class aq
    implements Runnable
{

    final M_Commerce_Lainnya1 a;
    private final String b;

    aq(M_Commerce_Lainnya1 m_commerce_lainnya1, String s)
    {
        a = m_commerce_lainnya1;
        b = s;
        super();
    }

    public final void run()
    {
        M_Commerce_Lainnya1.a(a, true);
        if (!b.equals(""))
        {
            M_Commerce_Lainnya1.j(a).setText((new StringBuilder("Rp. ")).append(r.d(b)).append(".00").toString());
        }
        a.H = b;
        M_Commerce_Lainnya1.c(a, b);
    }
}
