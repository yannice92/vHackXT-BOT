// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;

// Referenced classes of package android.support.v4.view:
//            ee, do, bs

final class ds
    implements ee
{

    do a;

    ds(do do1)
    {
        a = do1;
    }

    public final void onAnimationCancel(View view)
    {
        Object obj = view.getTag(0x7e000000);
        if (obj instanceof ee)
        {
            obj = (ee)obj;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            ((ee) (obj)).onAnimationCancel(view);
        }
    }

    public final void onAnimationEnd(View view)
    {
        if (android.support.v4.view.do.d(a) >= 0)
        {
            bs.a(view, android.support.v4.view.do.d(a), null);
            android.support.v4.view.do.c(a);
        }
        if (android.support.v4.view.do.b(a) != null)
        {
            android.support.v4.view.do.b(a).run();
        }
        Object obj = view.getTag(0x7e000000);
        if (obj instanceof ee)
        {
            obj = (ee)obj;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            ((ee) (obj)).onAnimationEnd(view);
        }
    }

    public final void onAnimationStart(View view)
    {
        if (android.support.v4.view.do.d(a) >= 0)
        {
            bs.a(view, 2, null);
        }
        if (android.support.v4.view.do.a(a) != null)
        {
            android.support.v4.view.do.a(a).run();
        }
        Object obj = view.getTag(0x7e000000);
        if (obj instanceof ee)
        {
            obj = (ee)obj;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            ((ee) (obj)).onAnimationStart(view);
        }
    }
}
