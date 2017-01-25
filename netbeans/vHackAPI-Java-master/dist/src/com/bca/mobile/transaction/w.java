// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import com.bca.mobile.bn;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Admin_Blokir_KK

final class w
    implements Runnable
{

    final M_Admin_Blokir_KK a;
    private final String b[];

    w(M_Admin_Blokir_KK m_admin_blokir_kk, String as[])
    {
        a = m_admin_blokir_kk;
        b = as;
        super();
    }

    public final void run()
    {
        a.g();
        if (b[0].equals("ABKK_ERR"))
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
