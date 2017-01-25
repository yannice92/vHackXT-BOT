// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Animation;

// Referenced classes of package android.support.v4.widget:
//            aj, af

final class ah
    implements android.view.animation.Animation.AnimationListener
{

    final aj a;
    final af b;

    ah(af af1, aj aj1)
    {
        b = af1;
        a = aj1;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
    }

    public final void onAnimationRepeat(Animation animation)
    {
        a.m();
        a.c();
        a.b(a.j());
        if (b.a)
        {
            b.a = false;
            animation.setDuration(1332L);
            a.a(false);
            return;
        } else
        {
            af.a(b, (af.a(b) + 1.0F) % 5F);
            return;
        }
    }

    public final void onAnimationStart(Animation animation)
    {
        af.a(b, 0.0F);
    }
}
