// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.utilities;

import java.util.ArrayList;

public final class c
{

    public static ArrayList a(String s)
    {
        s = s.split(":@:", -1);
        ArrayList arraylist = new ArrayList();
        int i = 0;
        do
        {
            if (i >= s.length - 1)
            {
                return arraylist;
            }
            arraylist.add(s[i]);
            i++;
        } while (true);
    }

    public static ArrayList b(String s)
    {
        s = s.split(":#:", -1);
        ArrayList arraylist = new ArrayList();
        int i = 0;
        do
        {
            if (i >= s.length)
            {
                return arraylist;
            }
            arraylist.add(s[i]);
            i++;
        } while (true);
    }

    public static String c(String s)
    {
        s = s.replace(":@:", "\n");
        return s.substring(0, s.length() - 1);
    }
}
