// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            dx, ee, do, dq, 
//            eg

class dp
    implements dx
{

    WeakHashMap a;

    dp()
    {
        a = null;
    }

    static void a(dp dp1, do do1, View view)
    {
        dp1.d(do1, view);
    }

    private void d(do do1, View view)
    {
        Object obj = view.getTag(0x7e000000);
        Runnable runnable;
        if (obj instanceof ee)
        {
            obj = (ee)obj;
        } else
        {
            obj = null;
        }
        runnable = android.support.v4.view.do.a(do1);
        do1 = android.support.v4.view.do.b(do1);
        if (runnable != null)
        {
            runnable.run();
        }
        if (obj != null)
        {
            ((ee) (obj)).onAnimationStart(view);
            ((ee) (obj)).onAnimationEnd(view);
        }
        if (do1 != null)
        {
            do1.run();
        }
        if (a != null)
        {
            a.remove(view);
        }
    }

    private void e(do do1, View view)
    {
        Runnable runnable = null;
        if (a != null)
        {
            runnable = (Runnable)a.get(view);
        }
        Object obj = runnable;
        if (runnable == null)
        {
            obj = new dq(this, do1, view, (byte)0);
            if (a == null)
            {
                a = new WeakHashMap();
            }
            a.put(view, obj);
        }
        view.removeCallbacks(((Runnable) (obj)));
        view.post(((Runnable) (obj)));
    }

    public void a(do do1, View view)
    {
        e(do1, view);
    }

    public void a(do do1, View view, float f)
    {
        e(do1, view);
    }

    public void a(do do1, View view, ee ee1)
    {
        view.setTag(0x7e000000, ee1);
    }

    public void a(View view, long l)
    {
    }

    public void a(View view, eg eg)
    {
    }

    public void a(View view, Interpolator interpolator)
    {
    }

    public void b(do do1, View view)
    {
        e(do1, view);
    }

    public void b(do do1, View view, float f)
    {
        e(do1, view);
    }

    public void c(do do1, View view)
    {
        if (a != null)
        {
            Runnable runnable = (Runnable)a.get(view);
            if (runnable != null)
            {
                view.removeCallbacks(runnable);
            }
        }
        d(do1, view);
    }

    public void c(do do1, View view, float f)
    {
        e(do1, view);
    }
}
