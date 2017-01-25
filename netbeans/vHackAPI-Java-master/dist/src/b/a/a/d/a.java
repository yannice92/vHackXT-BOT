// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.d;

import b.a.a.c;

public final class a
    implements c
{

    private byte a[];

    public a(byte abyte0[])
    {
        this(abyte0, abyte0.length);
    }

    private a(byte abyte0[], int i)
    {
        a = new byte[i];
        System.arraycopy(abyte0, 0, a, 0, i);
    }

    public final byte[] a()
    {
        return a;
    }
}
