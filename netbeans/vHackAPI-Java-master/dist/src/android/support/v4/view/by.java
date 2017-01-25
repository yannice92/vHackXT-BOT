// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.v4.view:
//            bx

class by extends bx
{

    by()
    {
    }

    public final void a(View view, int i, int j, int k, int i1)
    {
        view.postInvalidate(i, j, k, i1);
    }

    public final void a(View view, Runnable runnable)
    {
        view.postOnAnimation(runnable);
    }

    public final void a(View view, Runnable runnable, long l1)
    {
        view.postOnAnimationDelayed(runnable, l1);
    }

    public final void b(View view)
    {
        view.postInvalidateOnAnimation();
    }

    public final int c(View view)
    {
        return view.getImportantForAccessibility();
    }

    public void c(View view, int i)
    {
        int j = i;
        if (i == 4)
        {
            j = 2;
        }
        view.setImportantForAccessibility(j);
    }

    public final ViewParent f(View view)
    {
        return view.getParentForAccessibility();
    }

    public final int l(View view)
    {
        return view.getMinimumHeight();
    }

    public void o(View view)
    {
        view.requestFitSystemWindows();
    }

    public final boolean q(View view)
    {
        return view.getFitsSystemWindows();
    }
}
