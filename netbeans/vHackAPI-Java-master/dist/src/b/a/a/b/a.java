// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.b;

import b.a.a.c;
import b.a.a.d.b;
import b.a.a.e;

public final class a
    implements b.a.a.a
{

    private byte a[];
    private byte b[];
    private byte c[];
    private int d;
    private b.a.a.a e;
    private boolean f;

    public a(b.a.a.a a1)
    {
        e = null;
        e = a1;
        d = a1.a();
        a = new byte[d];
        b = new byte[d];
        c = new byte[d];
    }

    public final int a()
    {
        return e.a();
    }

    public final int a(byte abyte0[], int i, byte abyte1[], int j)
    {
        int k = 0;
        if (f)
        {
            if (d + i > abyte0.length)
            {
                throw new e("input buffer too short");
            }
            for (k = 0; k < d; k++)
            {
                byte abyte2[] = b;
                abyte2[k] = (byte)(abyte2[k] ^ abyte0[i + k]);
            }

            i = e.a(b, 0, abyte1, j);
            System.arraycopy(abyte1, j, b, 0, b.length);
            return i;
        }
        if (d + i > abyte0.length)
        {
            throw new e("input buffer too short");
        }
        System.arraycopy(abyte0, i, c, 0, d);
        int i1 = e.a(abyte0, i, abyte1, j);
        for (i = k; i < d; i++)
        {
            int l = j + i;
            abyte1[l] = (byte)(abyte1[l] ^ b[i]);
        }

        abyte0 = b;
        b = c;
        c = abyte0;
        return i1;
    }

    public final void a(boolean flag, c c1)
    {
        boolean flag1;
        flag1 = f;
        f = flag;
        if (!(c1 instanceof b)) goto _L2; else goto _L1
_L1:
        c1 = (b)c1;
        byte abyte0[] = c1.a();
        if (abyte0.length != d)
        {
            throw new IllegalArgumentException("initialisation vector must be the same length as block size");
        }
        System.arraycopy(abyte0, 0, a, 0, abyte0.length);
        b();
        if (c1.b() == null) goto _L4; else goto _L3
_L3:
        e.a(flag, c1.b());
_L6:
        return;
_L4:
        if (flag1 != flag)
        {
            throw new IllegalArgumentException("cannot change encrypting state without providing key.");
        }
        continue; /* Loop/switch isn't completed */
_L2:
        b();
        if (c1 != null)
        {
            e.a(flag, c1);
            return;
        }
        if (flag1 != flag)
        {
            throw new IllegalArgumentException("cannot change encrypting state without providing key.");
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void b()
    {
        System.arraycopy(a, 0, b, 0, a.length);
        byte abyte0[] = c;
        for (int i = 0; i < abyte0.length; i++)
        {
            abyte0[i] = 0;
        }

        e.b();
    }
}
