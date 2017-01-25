// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v4.view:
//            dw, dv, dt, du, 
//            dr, dp, dx, ee, 
//            eg

public final class do
{

    static final dx a;
    private WeakReference b;
    private Runnable c;
    private Runnable d;
    private int e;

    do(View view)
    {
        c = null;
        d = null;
        e = -1;
        b = new WeakReference(view);
    }

    static Runnable a(do do1)
    {
        return do1.c;
    }

    static Runnable b(do do1)
    {
        return do1.d;
    }

    static int c(do do1)
    {
        do1.e = -1;
        return -1;
    }

    static int d(do do1)
    {
        return do1.e;
    }

    public final do a()
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(this, view);
        }
        return this;
    }

    public final do a(float f)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(this, view, f);
        }
        return this;
    }

    public final do a(long l)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(view, l);
        }
        return this;
    }

    public final do a(ee ee)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(this, view, ee);
        }
        return this;
    }

    public final do a(eg eg)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(view, eg);
        }
        return this;
    }

    public final do a(Interpolator interpolator)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(view, interpolator);
        }
        return this;
    }

    public final do b(float f)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.b(this, view, f);
        }
        return this;
    }

    public final void b()
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.b(this, view);
        }
    }

    public final do c(float f)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.c(this, view, f);
        }
        return this;
    }

    public final void c()
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.c(this, view);
        }
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            a = new dw();
        } else
        if (i >= 19)
        {
            a = new dv();
        } else
        if (i >= 18)
        {
            a = new dt();
        } else
        if (i >= 16)
        {
            a = new du();
        } else
        if (i >= 14)
        {
            a = new dr();
        } else
        {
            a = new dp();
        }
    }
}
