// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.a;

import com.utilities.c;

// Referenced classes of package com.bca.a:
//            f, a

public final class b extends f
{

    private String o;

    public b(String as[])
    {
        super(as);
        a(c.a(as[3]));
        k = as[6].replaceAll("(\\.00)", "").replaceAll("[^\\d]", "");
        o = as[6];
        m = (new a[] {
            a.e, com.bca.a.a.c, a.d, a.a
        });
    }
}
