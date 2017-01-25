// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;

// Referenced classes of package android.support.v4.widget:
//            af, aj

final class ag extends Animation
{

    final aj a;
    final af b;

    ag(af af1, aj aj1)
    {
        b = af1;
        a = aj1;
        super();
    }

    public final void applyTransformation(float f, Transformation transformation)
    {
        if (b.a)
        {
            transformation = b;
            af.a(f, a);
            return;
        }
        transformation = b;
        float f1 = af.a(a);
        float f2 = a.h();
        float f4 = a.g();
        float f3 = a.l();
        transformation = b;
        af.b(f, a);
        if (f <= 0.5F)
        {
            float f6 = f / 0.5F;
            f6 = af.b().getInterpolation(f6);
            a.b(f4 + f6 * (0.8F - f1));
        }
        if (f > 0.5F)
        {
            float f5 = (f - 0.5F) / 0.5F;
            f5 = af.b().getInterpolation(f5);
            a.c((0.8F - f1) * f5 + f2);
        }
        a.d(0.25F * f + f3);
        f1 = af.a(b) / 5F;
        b.d(216F * f + 1080F * f1);
    }
}
