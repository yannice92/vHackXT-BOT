// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;

// Referenced classes of package android.support.v4.app:
//            d, cn

final class b extends d
{

    private cn a;

    public b(cn cn1)
    {
        a = cn1;
    }

    public final Parcelable a(View view, Matrix matrix, RectF rectf)
    {
        return a.a(view, matrix, rectf);
    }

    public final View a(Context context, Parcelable parcelable)
    {
        cn cn1 = a;
        return cn.a(context, parcelable);
    }

    public final void a()
    {
        cn cn1 = a;
        cn.a();
    }

    public final void b()
    {
        cn cn1 = a;
        cn.b();
    }

    public final void c()
    {
        cn cn1 = a;
        cn.c();
    }

    public final void d()
    {
        cn cn1 = a;
        cn.d();
    }
}
