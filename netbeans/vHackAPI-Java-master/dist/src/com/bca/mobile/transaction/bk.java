// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;


// Referenced classes of package com.bca.mobile.transaction:
//            M_Commerce_Voucher1

final class bk
{

    final M_Commerce_Voucher1 a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;

    bk(M_Commerce_Voucher1 m_commerce_voucher1, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7)
    {
        a = m_commerce_voucher1;
        super();
        b = s;
        c = s1;
        d = s2;
        e = s3;
        f = s4;
        g = s5;
        h = s6;
        i = s7;
    }

    public final String a()
    {
        return b;
    }

    public final String b()
    {
        return c;
    }

    public final String c()
    {
        return d;
    }

    public final String d()
    {
        return e;
    }

    public final String e()
    {
        return f;
    }

    public final String f()
    {
        return g;
    }

    public final String[] g()
    {
        return h.split(":\\$:");
    }

    public final String[] h()
    {
        return i.split(":\\$:");
    }
}
