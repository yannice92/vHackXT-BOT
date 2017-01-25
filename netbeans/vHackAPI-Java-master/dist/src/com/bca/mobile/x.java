// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import java.util.TimerTask;

// Referenced classes of package com.bca.mobile:
//            y, MainActivity

final class x extends TimerTask
{

    final MainActivity a;

    x(MainActivity mainactivity)
    {
        a = mainactivity;
        super();
    }

    static MainActivity a(x x1)
    {
        return x1.a;
    }

    public final void run()
    {
        a.a(new y(this));
    }
}
