// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer;


final class y
{

    private long a;
    private String b;
    private String c;

    public y(long l, String s, String s1)
    {
        a = l;
        b = s;
        c = s1;
    }

    public y(String s, String s1, String s2)
    {
        if (s == null)
        {
            a = 0L;
        } else
        {
            a = Long.valueOf(s).longValue();
        }
        b = s1;
        c = s2;
    }

    public final long a()
    {
        return a;
    }

    public final boolean a(long l, String s, String s1)
    {
        if (!s.equals(b) && l - a > 2000L)
        {
            a = l;
            b = s;
            c = s1;
            return true;
        } else
        {
            return false;
        }
    }

    public final String b()
    {
        return b;
    }

    public final String c()
    {
        return c;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(a).append(",").append(b).append(",").append(c).toString();
    }
}
