// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.utilities;

import java.util.Hashtable;

// Referenced classes of package com.utilities:
//            a

public final class s
{

    private s a;
    private final a b;
    private Hashtable c;
    private String d;
    private int e;
    private String f;

    public s()
    {
        this(null, null, null, -1);
    }

    public s(s s1, String s2, Hashtable hashtable, int i)
    {
        a = s1;
        if (a != null)
        {
            a.b.a(this);
        }
        d = s2;
        c = hashtable;
        e = i;
        b = new a();
    }

    public final s a()
    {
        return (s)b.a(0);
    }

    public final void a(String s1)
    {
        f = s1;
    }

    public final int b()
    {
        return b.a();
    }

    public final String b(String s1)
    {
        if (c == null)
        {
            return null;
        } else
        {
            return (String)c.get(s1);
        }
    }

    public final String c()
    {
        return f;
    }

    public final String d()
    {
        return d;
    }

    public final s e()
    {
        return a;
    }

    public final s[] f()
    {
        return (s[])b.a(new s[b.a()]);
    }
}
