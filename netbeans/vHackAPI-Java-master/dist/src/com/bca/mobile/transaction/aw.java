// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.widget.EditText;
import com.utilities.r;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Commerce_PLN

final class aw
    implements Runnable
{

    final M_Commerce_PLN a;
    private final String b;

    aw(M_Commerce_PLN m_commerce_pln, String s)
    {
        a = m_commerce_pln;
        b = s;
        super();
    }

    public final void run()
    {
        M_Commerce_PLN.a(a, true);
        if (!b.equals(""))
        {
            M_Commerce_PLN.j(a).setText((new StringBuilder("Rp. ")).append(r.d(b)).append(".00").toString());
        }
        a.H = b;
        M_Commerce_PLN.c(a, b);
    }
}
