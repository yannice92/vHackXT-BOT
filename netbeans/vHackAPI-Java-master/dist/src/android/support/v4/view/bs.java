// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

// Referenced classes of package android.support.v4.view:
//            cb, ca, bz, by, 
//            bx, bw, bv, bu, 
//            bt, cc, eh, a, 
//            bd, do

public final class bs
{

    static final cc a;

    public static int a(int i1, int j1, int k1)
    {
        return a.a(i1, j1, k1);
    }

    public static int a(View view)
    {
        return a.a(view);
    }

    public static eh a(View view, eh eh)
    {
        return a.a(view, eh);
    }

    public static void a(View view, float f1)
    {
        a.a(view, f1);
    }

    public static void a(View view, int i1, int j1, int k1, int l1)
    {
        a.a(view, i1, j1, k1, l1);
    }

    public static void a(View view, int i1, Paint paint)
    {
        a.a(view, i1, paint);
    }

    public static void a(View view, Paint paint)
    {
        a.a(view, paint);
    }

    public static void a(View view, a a1)
    {
        a.a(view, a1);
    }

    public static void a(View view, bd bd)
    {
        a.a(view, bd);
    }

    public static void a(View view, Runnable runnable)
    {
        a.a(view, runnable);
    }

    public static void a(View view, Runnable runnable, long l1)
    {
        a.a(view, runnable, l1);
    }

    public static void a(View view, boolean flag)
    {
        a.a(view, flag);
    }

    public static void a(ViewGroup viewgroup)
    {
        a.a(viewgroup);
    }

    public static boolean a(View view, int i1)
    {
        return a.a(view, i1);
    }

    public static void b(View view)
    {
        a.b(view);
    }

    public static void b(View view, float f1)
    {
        a.b(view, f1);
    }

    public static boolean b(View view, int i1)
    {
        return a.b(view, i1);
    }

    public static int c(View view)
    {
        return a.c(view);
    }

    public static void c(View view, float f1)
    {
        a.c(view, f1);
    }

    public static void c(View view, int i1)
    {
        a.c(view, i1);
    }

    public static int d(View view)
    {
        return a.d(view);
    }

    public static void d(View view, float f1)
    {
        a.d(view, f1);
    }

    public static int e(View view)
    {
        return a.e(view);
    }

    public static void e(View view, float f1)
    {
        a.e(view, f1);
    }

    public static ViewParent f(View view)
    {
        return a.f(view);
    }

    public static void f(View view, float f1)
    {
        a.f(view, f1);
    }

    public static boolean g(View view)
    {
        return a.g(view);
    }

    public static int h(View view)
    {
        return a.h(view);
    }

    public static int i(View view)
    {
        return a.i(view);
    }

    public static float j(View view)
    {
        return a.j(view);
    }

    public static int k(View view)
    {
        return a.l(view);
    }

    public static do l(View view)
    {
        return a.m(view);
    }

    public static float m(View view)
    {
        return a.k(view);
    }

    public static float n(View view)
    {
        return a.p(view);
    }

    public static int o(View view)
    {
        return a.n(view);
    }

    public static void p(View view)
    {
        a.o(view);
    }

    public static boolean q(View view)
    {
        return a.q(view);
    }

    public static void r(View view)
    {
        a.r(view);
    }

    public static void s(View view)
    {
        a.s(view);
    }

    public static void t(View view)
    {
        a.t(view);
    }

    public static boolean u(View view)
    {
        return a.u(view);
    }

    public static boolean v(View view)
    {
        return a.v(view);
    }

    static 
    {
        int i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 >= 21)
        {
            a = new cb();
        } else
        if (i1 >= 19)
        {
            a = new ca();
        } else
        if (i1 >= 17)
        {
            a = new bz();
        } else
        if (i1 >= 16)
        {
            a = new by();
        } else
        if (i1 >= 14)
        {
            a = new bx();
        } else
        if (i1 >= 11)
        {
            a = new bw();
        } else
        if (i1 >= 9)
        {
            a = new bv();
        } else
        if (i1 >= 7)
        {
            a = new bu();
        } else
        {
            a = new bt();
        }
    }
}
