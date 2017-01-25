// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.utilities;


final class i
{

    int a[];
    long b;
    byte c[];

    public i()
    {
        c = new byte[64];
        b = 0L;
        a = new int[4];
        a[0] = 0x67452301;
        a[1] = 0xefcdab89;
        a[2] = 0x98badcfe;
        a[3] = 0x10325476;
    }

    public i(i j)
    {
        int k;
        boolean flag;
        flag = false;
        this();
        k = 0;
_L3:
        if (k < c.length) goto _L2; else goto _L1
_L1:
        k = ((flag) ? 1 : 0);
_L4:
        if (k >= a.length)
        {
            b = j.b;
            return;
        }
        break MISSING_BLOCK_LABEL_56;
_L2:
        c[k] = j.c[k];
        k++;
          goto _L3
        a[k] = j.a[k];
        k++;
          goto _L4
    }
}
