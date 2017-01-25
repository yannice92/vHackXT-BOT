// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer.a;

import java.util.Scanner;

public final class b
{

    private String a;
    private String b;
    private String c;
    private String d;

    public b(String s, String s1, String s2)
    {
        c = s;
        b = s1;
        a = s2;
    }

    public b(char ac[])
    {
        ac = new Scanner(new String(ac));
        do
        {
            if (!ac.hasNextLine())
            {
                break;
            }
            String s = ac.nextLine();
            if (s.startsWith("url="))
            {
                c = s.substring(4).trim();
            } else
            if (s.startsWith("version="))
            {
                a = s.substring(8).trim();
            } else
            if (s.startsWith("data="))
            {
                b = s.substring(5).trim();
            }
        } while (true);
        ac.close();
    }

    public final String a()
    {
        return a;
    }

    public final void a(String s)
    {
        d = s;
    }

    public final String b()
    {
        return b;
    }

    public final String c()
    {
        return c;
    }

    public final String d()
    {
        return d;
    }
}
