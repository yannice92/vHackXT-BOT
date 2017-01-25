// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a;

import java.util.ArrayList;
import java.util.List;

public class c
{

    List a;
    List b;
    private boolean c;

    public c()
    {
        c = false;
        a = new ArrayList(10);
        b = new ArrayList(2);
    }

    public void a(List list)
    {
        a = list;
    }

    public boolean a()
    {
        return c;
    }

    public List b()
    {
        return a;
    }

    public void b(List list)
    {
        b = list;
    }

    public List c()
    {
        return b;
    }

    public void c(boolean flag)
    {
        c = flag;
    }
}
