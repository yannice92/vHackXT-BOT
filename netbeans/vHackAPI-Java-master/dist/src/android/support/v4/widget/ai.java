// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.widget:
//            af

final class ai
    implements android.graphics.drawable.Drawable.Callback
{

    final af a;

    ai(af af1)
    {
        a = af1;
        super();
    }

    public final void invalidateDrawable(Drawable drawable)
    {
        a.invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
    {
        a.scheduleSelf(runnable, l);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable)
    {
        a.unscheduleSelf(runnable);
    }
}
