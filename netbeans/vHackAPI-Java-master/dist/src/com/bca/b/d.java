// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.bca.b:
//            a

final class d extends BroadcastReceiver
{

    private final a a;

    d(a a1)
    {
        a = a1;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        intent = a;
        getResultCode();
        intent.b();
        context.unregisterReceiver(this);
    }
}
