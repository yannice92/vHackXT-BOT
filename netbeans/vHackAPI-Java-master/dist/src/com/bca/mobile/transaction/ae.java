// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;


// Referenced classes of package com.bca.mobile.transaction:
//            M_Admin_Reg_KK_all

final class ae
    implements Runnable
{

    final M_Admin_Reg_KK_all a;
    private final String b[];

    ae(M_Admin_Reg_KK_all m_admin_reg_kk_all, String as[])
    {
        a = m_admin_reg_kk_all;
        b = as;
        super();
    }

    public final void run()
    {
        a.g();
        if (a.e(a.T))
        {
            a.a("m-Admin", b[1].replace(":@:", "\n"), a.getParent(), "ok", "back");
            return;
        } else
        {
            a.a("m-Admin", b[1].replace(":@:", "\n"), a.getParent(), "ok", "back");
            return;
        }
    }
}
