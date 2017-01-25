// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.support.v4.view.df;
import android.support.v7.app.ActionBar;
import com.g.f;

// Referenced classes of package com.bca.mobile:
//            FlazzMainTabActivity

final class i extends df
{

    final FlazzMainTabActivity a;

    i(FlazzMainTabActivity flazzmaintabactivity)
    {
        a = flazzmaintabactivity;
        super();
    }

    public final void a(int j)
    {
        a.c = a.getSupportActionBar();
        a.c.setSelectedNavigationItem(j);
        if (j != 1)
        {
            a.b.a(null);
        }
    }
}
