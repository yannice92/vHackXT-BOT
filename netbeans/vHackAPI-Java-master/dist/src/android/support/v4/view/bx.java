// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            bw, a, do

class bx extends bw
{

    static boolean b = false;

    bx()
    {
    }

    public final void a(View view, a a1)
    {
        if (a1 == null)
        {
            a1 = null;
        } else
        {
            a1 = ((a) (a1.a()));
        }
        view.setAccessibilityDelegate((android.view.View.AccessibilityDelegate)a1);
    }

    public final boolean a(View view, int i)
    {
        return view.canScrollHorizontally(i);
    }

    public final boolean b(View view, int i)
    {
        return view.canScrollVertically(i);
    }

    public final do m(View view)
    {
        if (a == null)
        {
            a = new WeakHashMap();
        }
        do do2 = (do)a.get(view);
        do do1 = do2;
        if (do2 == null)
        {
            do1 = new do(view);
            a.put(view, do1);
        }
        return do1;
    }

}
