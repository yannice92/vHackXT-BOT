// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.b.a;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.widget:
//            ai, aj, ag, ah

final class af extends Drawable
    implements Animatable
{

    private static final Interpolator b = new LinearInterpolator();
    private static final Interpolator c = new a();
    boolean a;
    private final int d[] = {
        0xff000000
    };
    private final ArrayList e = new ArrayList();
    private final aj f;
    private float g;
    private Resources h;
    private View i;
    private Animation j;
    private float k;
    private double l;
    private double m;
    private final android.graphics.drawable.Drawable.Callback n = new ai(this);

    public af(Context context, View view)
    {
        i = view;
        h = context.getResources();
        f = new aj(n);
        f.a(d);
        context = f;
        float f1 = h.getDisplayMetrics().density;
        l = (double)f1 * 40D;
        m = (double)f1 * 40D;
        context.a(2.5F * f1);
        context.a(8.75D * (double)f1);
        context.b(0);
        context.a(10F * f1, f1 * 5F);
        context.a((int)l, (int)m);
        context = f;
        view = new ag(this, context);
        view.setRepeatCount(-1);
        view.setRepeatMode(1);
        view.setInterpolator(b);
        view.setAnimationListener(new ah(this, context));
        j = view;
    }

    static float a(af af1)
    {
        return af1.k;
    }

    static float a(af af1, float f1)
    {
        af1.k = f1;
        return f1;
    }

    static float a(aj aj1)
    {
        return b(aj1);
    }

    static void a(float f1, aj aj1)
    {
        c(f1, aj1);
        float f2 = (float)(Math.floor(aj1.l() / 0.8F) + 1.0D);
        float f3 = b(aj1);
        float f4 = aj1.g();
        aj1.b((aj1.h() - f3 - aj1.g()) * f1 + f4);
        aj1.c(aj1.h());
        f3 = aj1.l();
        aj1.d((f2 - aj1.l()) * f1 + f3);
    }

    private static float b(aj aj1)
    {
        return (float)Math.toRadians((double)aj1.e() / (6.2831853071795862D * aj1.k()));
    }

    static Interpolator b()
    {
        return c;
    }

    static void b(float f1, aj aj1)
    {
        c(f1, aj1);
    }

    private static void c(float f1, aj aj1)
    {
        if (f1 > 0.75F)
        {
            f1 = (f1 - 0.75F) / 0.25F;
            int i1 = aj1.i();
            int i2 = aj1.b();
            int l1 = Integer.valueOf(i1).intValue();
            i1 = l1 >> 24 & 0xff;
            int j1 = l1 >> 16 & 0xff;
            int k1 = l1 >> 8 & 0xff;
            l1 &= 0xff;
            i2 = Integer.valueOf(i2).intValue();
            int j2 = (int)((float)((i2 >> 24 & 0xff) - i1) * f1);
            int k2 = (int)((float)((i2 >> 16 & 0xff) - j1) * f1);
            int l2 = (int)((float)((i2 >> 8 & 0xff) - k1) * f1);
            aj1.a((int)(f1 * (float)((i2 & 0xff) - l1)) + l1 | (i1 + j2 << 24 | j1 + k2 << 16 | l2 + k1 << 8));
        }
    }

    public final void a()
    {
        f.a();
    }

    public final void a(float f1)
    {
        f.e(f1);
    }

    public final void a(boolean flag)
    {
        f.a(flag);
    }

    public final void b(float f1)
    {
        f.b(0.0F);
        f.c(f1);
    }

    public final void c(float f1)
    {
        f.d(f1);
    }

    final void d(float f1)
    {
        g = f1;
        invalidateSelf();
    }

    public final void draw(Canvas canvas)
    {
        Rect rect = getBounds();
        int i1 = canvas.save();
        canvas.rotate(g, rect.exactCenterX(), rect.exactCenterY());
        f.a(canvas, rect);
        canvas.restoreToCount(i1);
    }

    public final int getAlpha()
    {
        return f.d();
    }

    public final int getIntrinsicHeight()
    {
        return (int)m;
    }

    public final int getIntrinsicWidth()
    {
        return (int)l;
    }

    public final int getOpacity()
    {
        return -3;
    }

    public final boolean isRunning()
    {
        ArrayList arraylist = e;
        int j1 = arraylist.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            Animation animation = (Animation)arraylist.get(i1);
            if (animation.hasStarted() && !animation.hasEnded())
            {
                return true;
            }
        }

        return false;
    }

    public final void setAlpha(int i1)
    {
        f.c(i1);
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        f.a(colorfilter);
    }

    public final void start()
    {
        j.reset();
        f.m();
        if (f.j() != f.f())
        {
            a = true;
            j.setDuration(666L);
            i.startAnimation(j);
            return;
        } else
        {
            f.b(0);
            f.n();
            j.setDuration(1332L);
            i.startAnimation(j);
            return;
        }
    }

    public final void stop()
    {
        i.clearAnimation();
        d(0.0F);
        f.a(false);
        f.b(0);
        f.n();
    }

}
