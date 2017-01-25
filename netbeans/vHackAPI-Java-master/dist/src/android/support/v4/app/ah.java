// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;

// Referenced classes of package android.support.v4.app:
//            aj, ae

final class ah extends android.transition.Transition.EpicenterCallback
{

    final aj a;
    private Rect b;

    ah(aj aj1)
    {
        a = aj1;
        super();
    }

    public final Rect onGetEpicenter(Transition transition)
    {
        if (b == null && a.a != null)
        {
            b = ae.a(a.a);
        }
        return b;
    }
}
