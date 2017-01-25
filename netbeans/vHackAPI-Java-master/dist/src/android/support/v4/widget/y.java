// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;

// Referenced classes of package android.support.v4.widget:
//            ac, aa, z, ab

public final class y
{

    private static final ab b;
    private Object a;

    public y(Context context)
    {
        a = b.a(context);
    }

    public final void a(int i, int j)
    {
        b.a(a, i, j);
    }

    public final boolean a()
    {
        return b.a(a);
    }

    public final boolean a(float f)
    {
        return b.a(a, f);
    }

    public final boolean a(float f, float f1)
    {
        return b.a(a, f, f1);
    }

    public final boolean a(int i)
    {
        return b.a(a, i);
    }

    public final boolean a(Canvas canvas)
    {
        return b.a(a, canvas);
    }

    public final void b()
    {
        b.b(a);
    }

    public final boolean c()
    {
        return b.c(a);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            b = new ac();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            b = new aa();
        } else
        {
            b = new z();
        }
    }
}
