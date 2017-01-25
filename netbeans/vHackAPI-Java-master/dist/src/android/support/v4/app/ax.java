// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            bu, ay, bb, bv, 
//            cc, ck

public final class ax extends bu
{

    public static final bv d = new ay();
    public int a;
    public CharSequence b;
    public PendingIntent c;
    private final Bundle e;
    private final cc f[];

    public ax(int i, CharSequence charsequence, PendingIntent pendingintent)
    {
        this(i, charsequence, pendingintent, new Bundle(), null);
    }

    private ax(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, cc acc[])
    {
        a = i;
        b = bb.limitCharSequenceLength(charsequence);
        c = pendingintent;
        if (bundle == null)
        {
            bundle = new Bundle();
        }
        e = bundle;
        f = acc;
    }

    ax(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, cc acc[], byte byte0)
    {
        this(i, charsequence, pendingintent, bundle, acc);
    }

    public final int a()
    {
        return a;
    }

    public final CharSequence b()
    {
        return b;
    }

    public final PendingIntent c()
    {
        return c;
    }

    public final Bundle d()
    {
        return e;
    }

    public final volatile ck[] e()
    {
        return f;
    }

}
