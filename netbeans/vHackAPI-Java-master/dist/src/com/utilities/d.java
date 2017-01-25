// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class d
{

    public static String a()
    {
        return (new SimpleDateFormat("yyyyMMddKKmm")).format(new Date());
    }

    public static String a(String s)
    {
        return (new SimpleDateFormat(s)).format(new Date());
    }

    public static String a(Date date)
    {
        return (new SimpleDateFormat("ddMMyy")).format(date);
    }

    public static String b(Date date)
    {
        return (new SimpleDateFormat("HHmmss")).format(date);
    }
}
