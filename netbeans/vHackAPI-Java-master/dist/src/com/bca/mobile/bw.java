// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.widget.ImageView;

// Referenced classes of package com.bca.mobile:
//            TabSample

final class bw
    implements Runnable
{

    final TabSample a;
    private final int b;

    bw(TabSample tabsample, int i)
    {
        a = tabsample;
        b = i;
        super();
    }

    public final void run()
    {
        if (TabSample.a(a))
        {
            if (TabSample.b(a) == null)
            {
                TabSample.a(a, (ImageView)a.findViewById(0x7f0b0248));
            }
            TabSample.b(a).setVisibility(0);
            TabSample.b(a).setBackgroundResource(b);
        }
    }
}
