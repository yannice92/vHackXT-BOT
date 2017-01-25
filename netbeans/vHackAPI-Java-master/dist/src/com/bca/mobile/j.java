// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.support.v4.app.ad;
import android.support.v4.view.ViewPager;

// Referenced classes of package com.bca.mobile:
//            FlazzMainTabActivity

final class j
    implements android.support.v7.app.ActionBar.TabListener
{

    final FlazzMainTabActivity a;

    j(FlazzMainTabActivity flazzmaintabactivity)
    {
        a = flazzmaintabactivity;
        super();
    }

    public final void onTabReselected(android.support.v7.app.ActionBar.Tab tab, ad ad)
    {
    }

    public final void onTabSelected(android.support.v7.app.ActionBar.Tab tab, ad ad)
    {
        a.a.a(tab.getPosition());
    }

    public final void onTabUnselected(android.support.v7.app.ActionBar.Tab tab, ad ad)
    {
    }
}
