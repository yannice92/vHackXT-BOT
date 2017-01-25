// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.utilities;


final class m
{

    private String a;
    private String b;
    private String c;
    private String d;

    private m()
    {
    }

    m(byte byte0)
    {
        this();
    }

    static String a(m m1)
    {
        return m1.a;
    }

    static void a(m m1, String s)
    {
        m1.d = s;
    }

    static String b(m m1)
    {
        return m1.b;
    }

    static void b(m m1, String s)
    {
        m1.a = s;
    }

    static String c(m m1)
    {
        return m1.c;
    }

    static void c(m m1, String s)
    {
        m1.b = s;
    }

    static String d(m m1)
    {
        return m1.d;
    }

    static void d(m m1, String s)
    {
        m1.c = s;
    }
}
