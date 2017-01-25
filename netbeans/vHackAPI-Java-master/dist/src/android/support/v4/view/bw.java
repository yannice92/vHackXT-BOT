// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            bv

class bw extends bv
{

    bw()
    {
    }

    public final int a(int l, int i1, int j1)
    {
        return View.resolveSizeAndState(l, i1, j1);
    }

    final long a()
    {
        return ValueAnimator.getFrameDelay();
    }

    public final void a(View view, float f)
    {
        view.setTranslationX(f);
    }

    public final void a(View view, int l, Paint paint)
    {
        view.setLayerType(l, paint);
    }

    public void a(View view, Paint paint)
    {
        view.setLayerType(view.getLayerType(), paint);
        view.invalidate();
    }

    public final void a(View view, boolean flag)
    {
        view.setActivated(flag);
    }

    public final void b(View view, float f)
    {
        view.setTranslationY(f);
    }

    public final void c(View view, float f)
    {
        view.setAlpha(f);
    }

    public final int d(View view)
    {
        return view.getLayerType();
    }

    public final void d(View view, float f)
    {
        view.setScaleX(f);
    }

    public final void e(View view, float f)
    {
        view.setScaleY(f);
    }

    public final int h(View view)
    {
        return view.getMeasuredWidthAndState();
    }

    public final int i(View view)
    {
        return view.getMeasuredState();
    }

    public final float j(View view)
    {
        return view.getTranslationY();
    }

    public final float k(View view)
    {
        return view.getScaleX();
    }

    public final void r(View view)
    {
        view.jumpDrawablesToCurrentState();
    }

    public final void s(View view)
    {
        view.setSaveFromParentEnabled(false);
    }
}
