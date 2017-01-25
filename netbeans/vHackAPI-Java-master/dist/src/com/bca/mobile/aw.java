// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import java.util.TimerTask;

// Referenced classes of package com.bca.mobile:
//            ax, ShareActivity

final class aw extends TimerTask
{

    final ShareActivity a;

    aw(ShareActivity shareactivity)
    {
        a = shareactivity;
        super();
    }

    static ShareActivity a(aw aw1)
    {
        return aw1.a;
    }

    public final void run()
    {
        a.a(new ax(this));
    }
}
