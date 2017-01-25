// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.appsflyer:
//            u

public final class t
{

    private static t b = new t();
    List a;

    private t()
    {
        a = new ArrayList();
    }

    public static t a()
    {
        return b;
    }

    public final void a(String s)
    {
        a.add(new u(s));
    }

}
