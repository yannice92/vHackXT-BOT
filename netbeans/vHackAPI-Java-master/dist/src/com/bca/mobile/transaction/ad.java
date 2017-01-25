// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.view.View;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Admin_Reg_KK_all

final class ad
    implements android.view.View.OnClickListener
{

    final M_Admin_Reg_KK_all a;

    ad(M_Admin_Reg_KK_all m_admin_reg_kk_all)
    {
        a = m_admin_reg_kk_all;
        super();
    }

    public final void onClick(View view)
    {
        a.a(a.getParent(), a.f, a);
    }
}
