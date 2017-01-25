// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.a;


public final class a extends Enum
{

    public static final a a;
    public static final a b;
    public static final a c;
    public static final a d;
    public static final a e;
    private static final a f[];

    private a(String s, int i)
    {
        super(s, i);
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/bca/a/a, s);
    }

    public static a[] values()
    {
        a aa[] = f;
        int i = aa.length;
        a aa1[] = new a[i];
        System.arraycopy(aa, 0, aa1, 0, i);
        return aa1;
    }

    static 
    {
        a = new a("CONFIRMATION", 0);
        b = new a("AMOUNT", 1);
        c = new a("NEWS", 2);
        d = new a("PIN", 3);
        e = new a("INFO", 4);
        f = (new a[] {
            a, b, c, d, e
        });
    }
}
