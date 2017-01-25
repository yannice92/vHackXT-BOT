// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.bca.mobile:
//            MainActivity

final class s extends Handler
{

    final MainActivity a;

    s(MainActivity mainactivity)
    {
        a = mainactivity;
        super();
    }

    public final void handleMessage(Message message)
    {
        a.finish();
    }
}
