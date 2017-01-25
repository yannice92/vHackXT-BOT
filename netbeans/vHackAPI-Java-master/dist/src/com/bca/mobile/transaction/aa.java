// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import java.util.ArrayList;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Admin_Hapus_Trans_Ant_Rek

final class aa
    implements Runnable
{

    final M_Admin_Hapus_Trans_Ant_Rek a;
    private final String b[];

    aa(M_Admin_Hapus_Trans_Ant_Rek m_admin_hapus_trans_ant_rek, String as[])
    {
        a = m_admin_hapus_trans_ant_rek;
        b = as;
        super();
    }

    public final void run()
    {
        a.g();
        if (M_Admin_Hapus_Trans_Ant_Rek.b(a) == 1)
        {
            a.E = 1;
            a.a("m-Admin", b[1].replace(":@:", "\n"), a.getParent(), "Ok", "Cancel");
            if (b.length >= 3)
            {
                M_Admin_Hapus_Trans_Ant_Rek.a(a, b[2]);
            }
        } else
        if (M_Admin_Hapus_Trans_Ant_Rek.b(a) == 2)
        {
            a.a.clear();
            a.E = 2;
            a.a("m-Admin", b[1].replace(":@:", "\n"), a.getParent(), true, "Ok");
            return;
        }
    }
}
