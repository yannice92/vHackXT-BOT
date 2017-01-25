// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import java.util.TimerTask;

// Referenced classes of package com.bca.mobile:
//            az, ShareActivity

final class ay extends TimerTask
{

    final ShareActivity a;
    private final int b;

    ay(ShareActivity shareactivity, int i)
    {
        a = shareactivity;
        b = i;
        super();
    }

    static ShareActivity a(ay ay1)
    {
        return ay1.a;
    }

    public final void run()
    {
        a.a(new az(this, b));
    }
}
