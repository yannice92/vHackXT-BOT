// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            ee

final class dz extends AnimatorListenerAdapter
{

    final ee a;
    final View b;

    dz(ee ee1, View view)
    {
        a = ee1;
        b = view;
        super();
    }

    public final void onAnimationCancel(Animator animator)
    {
        a.onAnimationCancel(b);
    }

    public final void onAnimationEnd(Animator animator)
    {
        a.onAnimationEnd(b);
    }

    public final void onAnimationStart(Animator animator)
    {
        a.onAnimationStart(b);
    }
}
