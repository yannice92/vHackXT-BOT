// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.c.a;

// Referenced classes of package android.support.v4.view:
//            de

public class c extends android.view.SavedState
{

    public static final android.os.r.SavedState.b CREATOR = android.support.v4.c.a.a(new de());
    int a;
    Parcelable b;
    ClassLoader c;

    public String toString()
    {
        return (new StringBuilder("FragmentPager.SavedState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" position=").append(a).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.riteToParcel(parcel, i);
        parcel.writeInt(a);
        parcel.writeParcelable(b, i);
    }


    (Parcel parcel, ClassLoader classloader)
    {
        super(parcel);
        ClassLoader classloader1 = classloader;
        if (classloader == null)
        {
            classloader1 = getClass().getClassLoader();
        }
        a = parcel.readInt();
        b = parcel.readParcelable(classloader1);
        c = classloader1;
    }

    public c(Parcelable parcelable)
    {
        super(parcelable);
    }
}
