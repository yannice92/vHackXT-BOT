// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;

// Referenced classes of package com.bca.mobile:
//            n, TabSample

final class bx extends LinearLayout
{

    ImageView a;
    final TabSample b;

    public bx(TabSample tabsample, Context context, Drawable drawable, Drawable drawable1)
    {
        b = tabsample;
        super(context);
        a = new ImageView(context);
        tabsample = new StateListDrawable();
        tabsample.addState(SELECTED_STATE_SET, drawable1);
        tabsample.addState(ENABLED_STATE_SET, drawable);
        a.setBackgroundDrawable(tabsample);
        int i = n.c / 6;
        int j = (int)(1.1100000000000001D * (double)i);
        a.setLayoutParams(new android.widget.LinearLayout.LayoutParams(i, j));
        a.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        setGravity(17);
        addView(a);
    }
}
