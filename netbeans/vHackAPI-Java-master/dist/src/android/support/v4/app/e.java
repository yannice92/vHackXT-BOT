// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;

// Referenced classes of package android.support.v4.app:
//            d

final class e extends SharedElementCallback
{

    private d a;

    public e(d d1)
    {
        a = d1;
    }

    public final Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectf)
    {
        return a.a(view, matrix, rectf);
    }

    public final View onCreateSnapshotView(Context context, Parcelable parcelable)
    {
        return a.a(context, parcelable);
    }

    public final void onMapSharedElements(List list, Map map)
    {
        a.d();
    }

    public final void onRejectSharedElements(List list)
    {
        a.c();
    }

    public final void onSharedElementEnd(List list, List list1, List list2)
    {
        a.b();
    }

    public final void onSharedElementStart(List list, List list1, List list2)
    {
        a.a();
    }
}
