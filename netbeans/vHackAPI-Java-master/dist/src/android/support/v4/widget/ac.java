// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.widget.EdgeEffect;

// Referenced classes of package android.support.v4.widget:
//            aa

final class ac extends aa
{

    ac()
    {
    }

    public final boolean a(Object obj, float f, float f1)
    {
        ((EdgeEffect)obj).onPull(f, f1);
        return true;
    }
}
