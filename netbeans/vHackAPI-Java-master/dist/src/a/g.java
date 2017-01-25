// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a;


public final class g
{

    public static final char a[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };

    private static int a(char c1)
    {
        if (c1 >= '0' && c1 <= '9')
        {
            return c1 - 48;
        }
        if (c1 >= 'A' && c1 <= 'F')
        {
            return (c1 - 65) + 10;
        }
        if (c1 >= 'a' && c1 <= 'f')
        {
            return (c1 - 97) + 10;
        } else
        {
            return 0;
        }
    }

    public static String a(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        s = d(s);
        for (int i = 0; i < s.length; i++)
        {
            stringbuilder.append((char)s[i]);
        }

        return stringbuilder.toString();
    }

    public static int b(String s)
    {
        return Integer.parseInt(s, 16);
    }

    public static String c(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        int i = Integer.parseInt(s, 16);
        int j = i / 0x15180;
        s = new StringBuilder();
        int k = j + 0x254bd0 + 0x10bd9;
        j = (k * 4) / 0x23ab1;
        int l = k - (0x23ab1 * j + 3) / 4;
        k = ((l + 1) * 4000) / 0x164b09;
        l = (l - (k * 1461) / 4) + 31;
        int i1 = (l * 80) / 2447;
        int j1 = (i1 * 2447) / 80;
        int k1 = i1 / 11;
        s.append(String.format("%2s", new Object[] {
            Integer.valueOf(((j - 49) * 100 + k + k1) % 100)
        }).replace(' ', '0'));
        s.append(String.format("%2s", new Object[] {
            Integer.valueOf((i1 + 2) - k1 * 12)
        }).replace(' ', '0'));
        s.append(String.format("%2s", new Object[] {
            Integer.valueOf(l - j1)
        }).replace(' ', '0'));
        stringbuilder.append(s.toString());
        j = i % 0x15180;
        i = j / 3600;
        j %= 3600;
        k = j / 60;
        stringbuilder.append(String.format("%2s", new Object[] {
            Integer.valueOf(i)
        }).replace(' ', '0'));
        stringbuilder.append(String.format("%2s", new Object[] {
            Integer.valueOf(k)
        }).replace(' ', '0'));
        stringbuilder.append(String.format("%2s", new Object[] {
            Integer.valueOf(j % 60)
        }).replace(' ', '0'));
        return stringbuilder.toString();
    }

    private static byte[] d(String s)
    {
        int i = 1;
        int k = s.length();
        byte abyte0[] = new byte[(k + 1) / 2];
        int j;
        if (k % 2 == 1)
        {
            abyte0[0] = (byte)a(s.charAt(0));
            j = 1;
        } else
        {
            i = 0;
            j = 0;
        }
        while (j < k) 
        {
            int l = j + 1;
            int i1 = a(s.charAt(j));
            j = l + 1;
            abyte0[i] = (byte)(a(s.charAt(l)) | i1 << 4);
            i++;
        }
        return abyte0;
    }

}
