// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Admin_Aktivasi_KK

final class o extends Handler
{

    final M_Admin_Aktivasi_KK a;

    o(M_Admin_Aktivasi_KK m_admin_aktivasi_kk)
    {
        a = m_admin_aktivasi_kk;
        super();
    }

    public final void handleMessage(Message message)
    {
        a.getParent().finish();
    }
}
