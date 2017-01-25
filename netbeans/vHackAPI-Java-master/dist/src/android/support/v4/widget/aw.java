// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.a;
import android.support.v4.view.a.f;
import android.support.v4.view.bs;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.widget:
//            SlidingPaneLayout

final class aw extends a
{

    final SlidingPaneLayout b;
    private final Rect c = new Rect();

    aw(SlidingPaneLayout slidingpanelayout)
    {
        b = slidingpanelayout;
        super();
    }

    private boolean b(View view)
    {
        return b.b(view);
    }

    public final void a(View view, f f1)
    {
        f f2 = f.a(f1);
        super.a(view, f2);
        Rect rect = c;
        f2.a(rect);
        f1.b(rect);
        f2.c(rect);
        f1.d(rect);
        f1.c(f2.f());
        f1.a(f2.l());
        f1.b(f2.m());
        f1.c(f2.n());
        f1.h(f2.k());
        f1.f(f2.i());
        f1.a(f2.d());
        f1.b(f2.e());
        f1.d(f2.g());
        f1.e(f2.h());
        f1.g(f2.j());
        f1.a(f2.b());
        f1.b(f2.c());
        f2.o();
        f1.b(android/support/v4/widget/SlidingPaneLayout.getName());
        f1.a(view);
        view = bs.f(view);
        if (view instanceof View)
        {
            f1.c((View)view);
        }
        int j = b.getChildCount();
        for (int i = 0; i < j; i++)
        {
            view = b.getChildAt(i);
            if (!b(view) && view.getVisibility() == 0)
            {
                bs.c(view, 1);
                f1.b(view);
            }
        }

    }

    public final boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        if (!b(view))
        {
            return super.a(viewgroup, view, accessibilityevent);
        } else
        {
            return false;
        }
    }

    public final void d(View view, AccessibilityEvent accessibilityevent)
    {
        super.d(view, accessibilityevent);
        accessibilityevent.setClassName(android/support/v4/widget/SlidingPaneLayout.getName());
    }
}
