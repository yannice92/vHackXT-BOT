// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.view.View;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Admin_Hapus_Trans_Ant_Rek

final class z
    implements android.view.View.OnClickListener
{

    final M_Admin_Hapus_Trans_Ant_Rek a;

    z(M_Admin_Hapus_Trans_Ant_Rek m_admin_hapus_trans_ant_rek)
    {
        a = m_admin_hapus_trans_ant_rek;
        super();
    }

    public final void onClick(View view)
    {
        a.finish();
    }
}
