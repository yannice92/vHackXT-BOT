// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.a;


// Referenced classes of package com.bca.a:
//            c, e, b, f

public final class d
{

    public static f a(String as[], int i)
    {
        switch (i)
        {
        default:
            return new c(as);

        case 1: // '\001'
            return new e(as);

        case 2: // '\002'
            return new b(as);
        }
    }
}
