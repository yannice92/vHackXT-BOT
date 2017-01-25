// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.widget.Toast;

// Referenced classes of package com.bca.mobile:
//            FlazzMainTabActivity

final class m
    implements Runnable
{

    final FlazzMainTabActivity a;

    m(FlazzMainTabActivity flazzmaintabactivity)
    {
        a = flazzmaintabactivity;
        super();
    }

    public final void run()
    {
        a.l.cancel();
    }
}
