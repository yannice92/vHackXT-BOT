// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package android.support.v4.widget:
//            SwipeRefreshLayout

final class bl extends Animation
{

    final SwipeRefreshLayout a;

    bl(SwipeRefreshLayout swiperefreshlayout)
    {
        a = swiperefreshlayout;
        super();
    }

    public final void applyTransformation(float f, Transformation transformation)
    {
        float f1 = SwipeRefreshLayout.l(a);
        float f2 = -SwipeRefreshLayout.l(a);
        SwipeRefreshLayout.a(a, f1 + f2 * f);
        SwipeRefreshLayout.b(a, f);
    }
}
