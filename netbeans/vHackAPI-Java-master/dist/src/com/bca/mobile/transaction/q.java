// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;


// Referenced classes of package com.bca.mobile.transaction:
//            M_Admin_Aktivasi_KK

final class q
    implements Runnable
{

    final M_Admin_Aktivasi_KK a;
    private final String b[];

    q(M_Admin_Aktivasi_KK m_admin_aktivasi_kk, String as[])
    {
        a = m_admin_aktivasi_kk;
        b = as;
        super();
    }

    public final void run()
    {
        a.g();
        a.a("m-Admin", b[1].replace(":@:", "\n"), a.getParent(), "ok", "back");
    }
}
