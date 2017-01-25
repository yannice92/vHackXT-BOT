// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.utilities;

import android.content.Context;
import java.util.Date;

// Referenced classes of package com.utilities:
//            l, m, h, r, 
//            a, d

public final class k
{

    public static l a(Context context, String s, String s1, String s2)
    {
        m m1 = a(s, s1, s2);
        return new l(context.getString(0x7f0c00b7, new Object[] {
            s.toUpperCase(), s1, s2
        }), m1, (byte)0);
    }

    public static l a(Context context, String s, String s1, String s2, String s3, String s4)
    {
        s2 = (new StringBuilder(String.valueOf(s1))).append(s2).append(s3).append(s4).toString().getBytes();
        s1 = new m((byte)0);
        m.a(s1, h.a((new h(s2)).a()).substring(0, 8));
        m.b(s1, (String)r.a(m.d(s1)).a(1));
        s2 = new Date();
        m.c(s1, d.a(s2));
        m.d(s1, d.b(s2));
        return new l(context.getString(0x7f0c00b6, new Object[] {
            s.toUpperCase(), m.d(s1).toUpperCase(), m.b(s1), m.c(s1)
        }), s1, (byte)0);
    }

    private static m a(String s, String s1, String s2)
    {
        m m1 = new m((byte)0);
        m.b(m1, (String)r.a(s).a(1));
        m.c(m1, s1);
        m.d(m1, s2);
        return m1;
    }

    public static l b(Context context, String s, String s1, String s2)
    {
        m m1 = a(s, s1, s2);
        return new l(context.getString(0x7f0c00b8, new Object[] {
            s.toUpperCase(), s1, s2
        }), m1, (byte)0);
    }
}
