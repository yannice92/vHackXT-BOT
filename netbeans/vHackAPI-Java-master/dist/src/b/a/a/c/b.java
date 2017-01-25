// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.c;

import b.a.a.f;

// Referenced classes of package b.a.a.c:
//            a

public final class b
    implements a
{

    public b()
    {
    }

    public final int a(byte abyte0[])
    {
        int j = abyte0[abyte0.length - 1] & 0xff;
        if (j > abyte0.length || j == 0)
        {
            throw new f("pad block corrupted");
        }
        for (int i = 1; i <= j; i++)
        {
            if (abyte0[abyte0.length - i] != j)
            {
                throw new f("pad block corrupted");
            }
        }

        return j;
    }

    public final int a(byte abyte0[], int i)
    {
        byte byte0 = (byte)(abyte0.length - i);
        for (; i < abyte0.length; i++)
        {
            abyte0[i] = byte0;
        }

        return byte0;
    }
}
