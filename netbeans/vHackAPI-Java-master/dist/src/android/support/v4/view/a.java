// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.a.f;
import android.support.v4.view.a.o;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//            e, d, b, g

public class a
{

    private static final d b;
    private static final Object c;
    final Object a;

    public a()
    {
        a = b.a(this);
    }

    public static o a(View view)
    {
        return b.a(c, view);
    }

    public static void a(View view, int i)
    {
        b.a(c, view, i);
    }

    public static void a(View view, AccessibilityEvent accessibilityevent)
    {
        b.d(c, view, accessibilityevent);
    }

    public static void c(View view, AccessibilityEvent accessibilityevent)
    {
        b.c(c, view, accessibilityevent);
    }

    final Object a()
    {
        return a;
    }

    public void a(View view, f f)
    {
        b.a(c, view, f);
    }

    public boolean a(View view, int i, Bundle bundle)
    {
        return b.a(c, view, i, bundle);
    }

    public boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        return b.a(c, viewgroup, view, accessibilityevent);
    }

    public boolean b(View view, AccessibilityEvent accessibilityevent)
    {
        return b.a(c, view, accessibilityevent);
    }

    public void d(View view, AccessibilityEvent accessibilityevent)
    {
        b.b(c, view, accessibilityevent);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            b = new e();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            b = new b();
        } else
        {
            b = new g();
        }
        c = b.a();
    }
}
