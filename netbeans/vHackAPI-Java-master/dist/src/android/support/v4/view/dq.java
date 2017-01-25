// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v4.view:
//            dp, do

final class dq
    implements Runnable
{

    WeakReference a;
    do b;
    final dp c;

    private dq(dp dp1, do do1, View view)
    {
        c = dp1;
        super();
        a = new WeakReference(view);
        b = do1;
    }

    dq(dp dp1, do do1, View view, byte byte0)
    {
        this(dp1, do1, view);
    }

    public final void run()
    {
        View view = (View)a.get();
        if (view != null)
        {
            dp.a(c, b, view);
        }
    }
}
