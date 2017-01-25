// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;

// Referenced classes of package android.support.v4.app:
//            b, c, cn, d

public final class a extends android.support.v4.content.a
{

    private static d a(cn cn)
    {
        b b1 = null;
        if (cn != null)
        {
            b1 = new b(cn);
        }
        return b1;
    }

    public static void a(Activity activity, cn cn)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            c.a(activity, a(cn));
        }
    }

    public static void b(Activity activity, cn cn)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            c.b(activity, a(cn));
        }
    }
}
