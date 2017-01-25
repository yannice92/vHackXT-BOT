// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.ViewConfiguration;

// Referenced classes of package android.support.v4.view:
//            cl, ck, cj, ci, 
//            cm

public final class ch
{

    static final cm a;

    public static int a(ViewConfiguration viewconfiguration)
    {
        return a.a(viewconfiguration);
    }

    public static boolean b(ViewConfiguration viewconfiguration)
    {
        return a.b(viewconfiguration);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new cl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new ck();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            a = new cj();
        } else
        {
            a = new ci();
        }
    }
}
