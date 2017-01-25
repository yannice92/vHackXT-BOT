// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.View;
import android.view.WindowInsets;

// Referenced classes of package android.support.v4.widget:
//            x

final class w
    implements android.view.View.OnApplyWindowInsetsListener
{

    w()
    {
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowinsets)
    {
        view = (x)view;
        boolean flag;
        if (windowinsets.getSystemWindowInsetTop() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.a(windowinsets, flag);
        return windowinsets.consumeSystemWindowInsets();
    }
}
