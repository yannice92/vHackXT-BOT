// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.view.View;

// Referenced classes of package com.bca.mobile:
//            n, TabSample

final class bv
    implements android.view.View.OnClickListener
{

    final TabSample a;

    bv(TabSample tabsample)
    {
        a = tabsample;
        super();
    }

    public final void onClick(View view)
    {
        n.am = null;
        a.finish();
    }
}
