// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Parcel;
import android.support.v4.c.c;

final class de
    implements c
{

    de()
    {
    }

    public final Object a(Parcel parcel, ClassLoader classloader)
    {
        return new ViewPager.SavedState(parcel, classloader);
    }

    public final volatile Object[] a(int i)
    {
        return new ViewPager.SavedState[i];
    }
}
