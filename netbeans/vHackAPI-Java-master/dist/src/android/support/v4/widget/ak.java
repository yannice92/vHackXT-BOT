// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.os.Bundle;
import android.support.v4.view.a;
import android.support.v4.view.a.ab;
import android.support.v4.view.a.f;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;

// Referenced classes of package android.support.v4.widget:
//            NestedScrollView

final class ak extends a
{

    ak()
    {
    }

    public final void a(View view, f f1)
    {
        super.a(view, f1);
        view = (NestedScrollView)view;
        f1.b(android/widget/ScrollView.getName());
        if (view.isEnabled())
        {
            int i = android.support.v4.widget.NestedScrollView.a(view);
            if (i > 0)
            {
                f1.i(true);
                if (view.getScrollY() > 0)
                {
                    f1.a(8192);
                }
                if (view.getScrollY() < i)
                {
                    f1.a(4096);
                }
            }
        }
    }

    public final boolean a(View view, int i, Bundle bundle)
    {
        if (super.a(view, i, bundle))
        {
            return true;
        }
        view = (NestedScrollView)view;
        if (!view.isEnabled())
        {
            return false;
        }
        switch (i)
        {
        default:
            return false;

        case 4096: 
            i = Math.min((view.getHeight() - view.getPaddingBottom() - view.getPaddingTop()) + view.getScrollY(), android.support.v4.widget.NestedScrollView.a(view));
            if (i != view.getScrollY())
            {
                view.a(i);
                return true;
            } else
            {
                return false;
            }

        case 8192: 
            i = view.getHeight();
            int j = view.getPaddingBottom();
            int k = view.getPaddingTop();
            i = Math.max(view.getScrollY() - (i - j - k), 0);
            break;
        }
        if (i != view.getScrollY())
        {
            view.a(i);
            return true;
        } else
        {
            return false;
        }
    }

    public final void d(View view, AccessibilityEvent accessibilityevent)
    {
        super.d(view, accessibilityevent);
        view = (NestedScrollView)view;
        accessibilityevent.setClassName(android/widget/ScrollView.getName());
        accessibilityevent = android.support.v4.view.a.a.a(accessibilityevent);
        boolean flag;
        if (android.support.v4.widget.NestedScrollView.a(view) > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        accessibilityevent.a(flag);
        accessibilityevent.c(view.getScrollX());
        accessibilityevent.d(view.getScrollY());
        accessibilityevent.e(view.getScrollX());
        accessibilityevent.f(android.support.v4.widget.NestedScrollView.a(view));
    }
}
