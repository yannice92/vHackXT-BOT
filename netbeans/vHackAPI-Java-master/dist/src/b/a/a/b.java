// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a;


// Referenced classes of package b.a.a:
//            a, e, c

public class b
{

    protected byte a[];
    protected int b;
    protected boolean c;
    protected a d;
    protected boolean e;
    protected boolean f;

    protected b()
    {
    }

    public final int a()
    {
        return d.a();
    }

    public int a(int i)
    {
        int j = i + b;
        if (f)
        {
            i = j % a.length - (d.a() + 2);
        } else
        {
            i = j % a.length;
        }
        return j - i;
    }

    public int a(byte abyte0[], int i)
    {
        int j = 0;
        if (b + i > abyte0.length)
        {
            throw new e("output buffer too short for doFinal()");
        }
        break MISSING_BLOCK_LABEL_30;
        abyte0;
        b();
        throw abyte0;
        if (b != 0)
        {
            if (!e)
            {
                throw new e("data not block size aligned");
            }
            d.a(a, 0, a, 0);
            j = b;
            b = 0;
            System.arraycopy(a, 0, abyte0, i, j);
        }
        b();
        return j;
    }

    public int a(byte abyte0[], int i, int j, byte abyte1[])
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
                i1 = l;
                k1 = j;
                j1 = i;
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
            i1 = 0;
            j1 = i;
            k1 = j;
        }
        System.arraycopy(abyte0, j1, a, b, k1);
        b = k1 + b;
        i = i1;
        if (b == a.length)
        {
            i = i1 + d.a(a, 0, abyte1, i1 + 0);
            b = 0;
        }
        return i;
    }

    public void a(boolean flag, c c1)
    {
        c = flag;
        b();
        d.a(flag, c1);
    }

    public int b(int i)
    {
        return b + i;
    }

    public final void b()
    {
        for (int i = 0; i < a.length; i++)
        {
            a[i] = 0;
        }

        b = 0;
        d.b();
    }
}
