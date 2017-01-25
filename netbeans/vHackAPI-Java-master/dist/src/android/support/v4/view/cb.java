// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;

// Referenced classes of package android.support.v4.view:
//            ca, ei, cg, eh, 
//            bd

final class cb extends ca
{

    cb()
    {
    }

    public final eh a(View view, eh eh)
    {
        Object obj = eh;
        if (eh instanceof ei)
        {
            android.view.WindowInsets windowinsets = ((ei)eh).e();
            view = view.onApplyWindowInsets(windowinsets);
            obj = eh;
            if (view != windowinsets)
            {
                obj = new ei(view);
            }
        }
        return ((eh) (obj));
    }

    public final void a(View view, bd bd)
    {
        view.setOnApplyWindowInsetsListener(new cg(bd));
    }

    public final void f(View view, float f1)
    {
        view.setElevation(f1);
    }

    public final void o(View view)
    {
        view.requestApplyInsets();
    }

    public final float p(View view)
    {
        return view.getElevation();
    }

    public final void t(View view)
    {
        view.stopNestedScroll();
    }
}
