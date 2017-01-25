// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.app.Activity;
import com.f.a;

// Referenced classes of package com.bca.mobile:
//            ShareActivity, n, bn

final class bb
    implements Runnable
{

    final ShareActivity a;
    private final int b;

    bb(ShareActivity shareactivity, int i)
    {
        a = shareactivity;
        b = i;
        super();
    }

    public final void run()
    {
        if (b == 11)
        {
            a.i();
            Object obj;
            if (a.getParent() != null)
            {
                obj = a.getParent();
            } else
            {
                obj = n.al;
            }
            if (n.l != 0x7f0200a8)
            {
                n.aw = true;
                if (n.y != null)
                {
                    n.y.c();
                }
                a.h();
                a.b(com.bca.mobile.bn.a(0x7f0c005b), (Activity)obj, "yes", "no");
            }
        }
    }
}
