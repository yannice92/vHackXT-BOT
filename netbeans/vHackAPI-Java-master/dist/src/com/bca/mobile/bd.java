// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.widget.ImageView;

// Referenced classes of package com.bca.mobile:
//            ShareActivity

final class bd
    implements Runnable
{

    final ShareActivity a;
    private final int b;

    bd(ShareActivity shareactivity, int i)
    {
        a = shareactivity;
        b = i;
        super();
    }

    public final void run()
    {
        if (ShareActivity.a(a))
        {
            if (ShareActivity.b(a) == null)
            {
                ShareActivity.a(a, (ImageView)a.findViewById(0x7f0b0248));
            }
            ShareActivity.b(a).setVisibility(0);
            ShareActivity.b(a).setBackgroundResource(b);
        }
    }
}
