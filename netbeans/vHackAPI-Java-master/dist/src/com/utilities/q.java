// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.utilities;

import java.util.Random;

public final class q
{

    public static String a(long l, int i)
    {
        Random random = new Random(l);
        char ac[] = "QizoW1pExRu2TycYt3Ur4IqvObPw5LnKe6JmH7G7F8DlSkA8ZjX0ChVgaBfNdMs".toCharArray();
        String s = "";
        int j = 0;
        do
        {
            if (j >= i)
            {
                return s;
            }
            try
            {
                s = (new StringBuilder(String.valueOf(s))).append(ac[random.nextInt(63)]).toString();
            }
            catch (Exception exception)
            {
                return null;
            }
            j++;
        } while (true);
    }
}
