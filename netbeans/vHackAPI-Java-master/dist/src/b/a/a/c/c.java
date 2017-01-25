// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.c;

import b.a.a.a;
import b.a.a.b;
import b.a.a.e;

// Referenced classes of package b.a.a.c:
//            b, a

public final class c extends b
{

    b.a.a.c.a g;

    public c(a a1)
    {
        this(a1, ((b.a.a.c.a) (new b.a.a.c.b())));
    }

    private c(a a1, b.a.a.c.a a2)
    {
        d = a1;
        g = a2;
        a = new byte[a1.a()];
        b = 0;
    }

    public final int a(int i)
    {
        i = b + i;
        int j = i % a.length;
        if (j == 0)
        {
            return i - a.length;
        } else
        {
            return i - j;
        }
    }

    public final int a(byte abyte0[], int i)
    {
        int j = d.a();
        if (c)
        {
            if (b == j)
            {
                if (j * 2 + i > abyte0.length)
                {
                    b();
                    throw new e("output buffer too short");
                }
                j = d.a(a, 0, abyte0, i);
                b = 0;
            } else
            {
                j = 0;
            }
            g.a(a, b);
            i = d.a(a, 0, abyte0, i + j);
            b();
            return j + i;
        }
        if (b != j)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        j = d.a(a, 0, a, 0);
        b = 0;
        j -= g.a(a);
        System.arraycopy(a, 0, abyte0, i, j);
        b();
        return j;
        b();
        throw new e("last block incomplete in decryption");
        abyte0;
        b();
        throw abyte0;
    }

    public final int a(byte abyte0[], int i, int j, byte abyte1[])
    {
        if (j < 0)
        {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int l1 = a();
        int k = a(j);
        if (k > 0 && k + 0 > abyte1.length)
        {
            throw new e("output buffer too short");
        }
        int i1 = a.length - b;
        int j1;
        int k1;
        if (j > i1)
        {
            System.arraycopy(abyte0, 0, a, b, i1);
            int l = d.a(a, 0, abyte1, 0) + 0;
            b = 0;
            j -= i1;
            i = i1 + 0;
            do
            {
                k1 = l;
                j1 = j;
                i1 = i;
                if (j <= a.length)
                {
                    break;
                }
                l += d.a(abyte0, i, abyte1, l + 0);
                j -= l1;
                i += l1;
            } while (true);
        } else
        {
            k1 = 0;
            i1 = i;
            j1 = j;
        }
        System.arraycopy(abyte0, i1, a, b, j1);
        b = j1 + b;
        return k1;
    }

    public final void a(boolean flag, b.a.a.c c1)
    {
        c = flag;
        b();
        if (c1 instanceof b.a.a.d.c)
        {
            c1 = (b.a.a.d.c)c1;
            b.a.a.c.a a1 = g;
            c1.a();
            d.a(flag, c1.b());
            return;
        } else
        {
            b.a.a.c.a a2 = g;
            d.a(flag, c1);
            return;
        }
    }

    public final int b(int i)
    {
        int j = b + i;
        i = j % a.length;
        if (i == 0)
        {
            i = j;
            if (c)
            {
                i = j + a.length;
            }
            return i;
        } else
        {
            return (j - i) + a.length;
        }
    }
}
