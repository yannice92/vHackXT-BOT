// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.os.Handler;
import android.os.Message;
import java.util.TimerTask;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Info

final class bn extends TimerTask
{

    final M_Info a;

    bn(M_Info m_info)
    {
        a = m_info;
        super();
    }

    public final void run()
    {
        a.e.obtainMessage(0).sendToTarget();
    }
}
