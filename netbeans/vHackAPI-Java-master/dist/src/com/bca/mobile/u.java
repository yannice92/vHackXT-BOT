// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;


// Referenced classes of package com.bca.mobile:
//            t, MainActivity

final class u
    implements Runnable
{

    final t a;

    u(t t1)
    {
        a = t1;
        super();
    }

    public final void run()
    {
        try
        {
            MainActivity.a(t.a(a));
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }
}
