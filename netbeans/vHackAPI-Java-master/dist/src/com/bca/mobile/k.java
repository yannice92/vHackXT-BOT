// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import java.util.TimerTask;

// Referenced classes of package com.bca.mobile:
//            FlazzMainTabActivity, l

final class k extends TimerTask
{

    final FlazzMainTabActivity a;

    k(FlazzMainTabActivity flazzmaintabactivity)
    {
        a = flazzmaintabactivity;
        super();
    }

    static FlazzMainTabActivity a(k k1)
    {
        return k1.a;
    }

    public final void run()
    {
        FlazzMainTabActivity.a(FlazzMainTabActivity.a() + 1);
        if (FlazzMainTabActivity.a() == FlazzMainTabActivity.b())
        {
            a.runOnUiThread(new l(this));
        }
    }
}
