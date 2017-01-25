// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import com.bca.mobile.bn;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Admin_BlokirATM

final class u
    implements Runnable
{

    final M_Admin_BlokirATM a;
    private final String b[];

    u(M_Admin_BlokirATM m_admin_blokiratm, String as[])
    {
        a = m_admin_blokiratm;
        b = as;
        super();
    }

    public final void run()
    {
        a.g();
        if (b[0].equals("ABKA_ERR"))
        {
            a.a("m-Admin", bn.a(b), a.getParent(), true, "Back");
            return;
        } else
        {
            a.a("m-Admin", bn.a(b), a.getParent(), true, "Ok");
            return;
        }
    }
}
