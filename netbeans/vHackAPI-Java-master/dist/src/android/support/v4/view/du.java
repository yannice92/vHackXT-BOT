// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewPropertyAnimator;

// Referenced classes of package android.support.v4.view:
//            dr, eb, do, ee

class du extends dr
{

    du()
    {
    }

    public final void a(do do1, View view, ee ee)
    {
        if (ee != null)
        {
            view.animate().setListener(new eb(ee, view));
            return;
        } else
        {
            view.animate().setListener(null);
            return;
        }
    }
}
