// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.os.Handler;
import android.os.Message;
import java.util.TimerTask;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Payment

final class cx extends TimerTask
{

    final M_Payment a;

    cx(M_Payment m_payment)
    {
        a = m_payment;
        super();
    }

    public final void run()
    {
        a.n.obtainMessage(0).sendToTarget();
    }
}
