// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.MotionEvent;

// Referenced classes of package android.support.v4.view:
//            ax, aw, av, au, 
//            ay

public final class at
{

    static final ay a;

    public static int a(MotionEvent motionevent)
    {
        return motionevent.getAction() & 0xff;
    }

    public static int a(MotionEvent motionevent, int i)
    {
        return a.a(motionevent, i);
    }

    public static int b(MotionEvent motionevent)
    {
        return (motionevent.getAction() & 0xff00) >> 8;
    }

    public static int b(MotionEvent motionevent, int i)
    {
        return a.b(motionevent, i);
    }

    public static float c(MotionEvent motionevent, int i)
    {
        return a.c(motionevent, i);
    }

    public static int c(MotionEvent motionevent)
    {
        return a.a(motionevent);
    }

    public static float d(MotionEvent motionevent, int i)
    {
        return a.d(motionevent, i);
    }

    public static int d(MotionEvent motionevent)
    {
        return a.b(motionevent);
    }

    public static float e(MotionEvent motionevent)
    {
        return a.c(motionevent);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 12)
        {
            a = new ax();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            a = new aw();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 5)
        {
            a = new av();
        } else
        {
            a = new au();
        }
    }
}
