// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import com.bca.mobile.bn;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Admin_Aktivasi_Pin_KK

final class r
    implements Runnable
{

    final M_Admin_Aktivasi_Pin_KK a;
    private final String b[];

    r(M_Admin_Aktivasi_Pin_KK m_admin_aktivasi_pin_kk, String as[])
    {
        a = m_admin_aktivasi_pin_kk;
        b = as;
        super();
    }

    public final void run()
    {
        a.g();
        a.a("m-Admin", bn.a(b), a.getParent(), true, "Ok");
    }
}