// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;

public abstract class d
{

    public d()
    {
    }

    public abstract Parcelable a(View view, Matrix matrix, RectF rectf);

    public abstract View a(Context context, Parcelable parcelable);

    public abstract void a();

    public abstract void b();

    public abstract void c();

    public abstract void d();
}
