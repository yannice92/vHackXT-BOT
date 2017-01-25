// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            dp, ds, dz, do, 
//            ee

class dr extends dp
{

    WeakHashMap b;

    dr()
    {
        b = null;
    }

    public final void a(do do1, View view)
    {
        view.animate().scaleY(1.0F);
    }

    public final void a(do do1, View view, float f)
    {
        view.animate().alpha(f);
    }

    public void a(do do1, View view, ee ee)
    {
        view.setTag(0x7e000000, ee);
        do1 = new ds(do1);
        view.animate().setListener(new dz(do1, view));
    }

    public final void a(View view, long l)
    {
        view.animate().setDuration(l);
    }

    public final void a(View view, Interpolator interpolator)
    {
        view.animate().setInterpolator(interpolator);
    }

    public final void b(do do1, View view)
    {
        view.animate().cancel();
    }

    public final void b(do do1, View view, float f)
    {
        view.animate().translationX(f);
    }

    public final void c(do do1, View view)
    {
        view.animate().start();
    }

    public final void c(do do1, View view, float f)
    {
        view.animate().translationY(f);
    }
}
