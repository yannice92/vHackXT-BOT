// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.animation.ValueAnimator;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            eg

final class ed
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    final eg a;
    final View b;

    ed(eg eg1, View view)
    {
        a = eg1;
        b = view;
        super();
    }

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        a.onAnimationUpdate(b);
    }
}
