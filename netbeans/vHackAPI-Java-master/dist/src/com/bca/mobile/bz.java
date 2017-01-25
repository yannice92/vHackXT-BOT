// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.view.View;

// Referenced classes of package com.bca.mobile:
//            by, TermAndConditionActivity

final class bz
    implements Runnable
{

    final by a;

    bz(by by1)
    {
        a = by1;
        super();
    }

    public final void run()
    {
        by.a(a).findViewById(0x7f0b0251).setVisibility(0);
        by.a(a).findViewById(0x7f0b024e).setVisibility(0);
    }
}
