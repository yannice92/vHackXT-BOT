// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import java.util.TimerTask;

// Referenced classes of package com.bca.mobile:
//            u, MainActivity

final class t extends TimerTask
{

    final MainActivity a;

    t(MainActivity mainactivity)
    {
        a = mainactivity;
        super();
    }

    static MainActivity a(t t1)
    {
        return t1.a;
    }

    public final void run()
    {
        a.runOnUiThread(new u(this));
    }
}
