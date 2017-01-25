// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            ck, cf, cd, ch, 
//            cg, cl, ce

public final class cc extends ck
{

    public static final cl a = new cd();
    private static final ce g;
    private final String b;
    private final CharSequence c;
    private final CharSequence d[];
    private final boolean e;
    private final Bundle f;

    cc(String s, CharSequence charsequence, CharSequence acharsequence[], boolean flag, Bundle bundle)
    {
        b = s;
        c = charsequence;
        d = acharsequence;
        e = flag;
        f = bundle;
    }

    public final String a()
    {
        return b;
    }

    public final CharSequence b()
    {
        return c;
    }

    public final CharSequence[] c()
    {
        return d;
    }

    public final boolean d()
    {
        return e;
    }

    public final Bundle e()
    {
        return f;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 20)
        {
            g = new cf();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            g = new ch();
        } else
        {
            g = new cg();
        }
    }
}
