// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import java.util.TimerTask;

// Referenced classes of package com.bca.mobile.transaction:
//            TransactionListActivity

final class ea extends TimerTask
{

    final TransactionListActivity a;

    ea(TransactionListActivity transactionlistactivity)
    {
        a = transactionlistactivity;
        super();
    }

    public final void run()
    {
        try
        {
            TransactionListActivity.a(a);
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }
}
