// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.utilities;


// Referenced classes of package com.utilities:
//            i

public final class h
{

    private static final char a[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };
    private static final byte d[];
    private i b;
    private i c;

    public h(byte abyte0[])
    {
        b = new i();
        c = null;
        if (abyte0 != null)
        {
            b = new i();
            a(b, abyte0, abyte0.length);
        }
    }

    public static final String a(byte abyte0[])
    {
        int k = 0;
        char ac[] = new char[abyte0.length * 2];
        int j = 0;
        do
        {
            if (j >= abyte0.length)
            {
                return new String(ac);
            }
            int l = k + 1;
            ac[k] = a[abyte0[j] >>> 4 & 0xf];
            k = l + 1;
            ac[l] = a[abyte0[j] & 0xf];
            j++;
        } while (true);
    }

    private final void a(i j, byte abyte0[], int k)
    {
        int l;
        int i1;
        int j1;
        int k1;
        i1 = 0;
        c = null;
        l = k;
        if (k + 0 > abyte0.length)
        {
            l = abyte0.length + 0;
        }
        j1 = (int)(j.b & 63L);
        j.b = j.b + (long)l;
        k1 = 64 - j1;
        k = i1;
        i1 = j1;
        if (l < k1) goto _L2; else goto _L1
_L1:
        int ai[] = new int[16];
        if (k1 != 64) goto _L4; else goto _L3
_L3:
        k = 0;
_L9:
        if (k + 63 < l) goto _L6; else goto _L5
_L5:
        i1 = 0;
_L2:
        if (k >= l) goto _L8; else goto _L7
_L7:
        j1 = k;
_L11:
        if (j1 < l)
        {
            break MISSING_BLOCK_LABEL_177;
        }
_L8:
        return;
_L4:
        k = 0;
_L10:
label0:
        {
            if (k < k1)
            {
                break label0;
            }
            a(j, j.c, 0, ai);
            k = k1;
        }
          goto _L9
        j.c[k + j1] = abyte0[k + 0];
        k++;
          goto _L10
_L6:
        a(j, abyte0, k + 0, ai);
        k += 64;
          goto _L9
        j.c[(i1 + j1) - k] = abyte0[j1 + 0];
        j1++;
          goto _L11
    }

    private static void a(i j, byte abyte0[], int k, int ai[])
    {
        int k1 = j.a[0];
        int l = j.a[1];
        int j1 = j.a[2];
        int i1 = j.a[3];
        ai[0] = abyte0[k] & 0xff | (abyte0[k + 1] & 0xff) << 8 | (abyte0[k + 2] & 0xff) << 16 | abyte0[k + 3] << 24;
        ai[1] = abyte0[k + 4] & 0xff | (abyte0[k + 5] & 0xff) << 8 | (abyte0[k + 6] & 0xff) << 16 | abyte0[k + 7] << 24;
        ai[2] = abyte0[k + 8] & 0xff | (abyte0[k + 9] & 0xff) << 8 | (abyte0[k + 10] & 0xff) << 16 | abyte0[k + 11] << 24;
        ai[3] = abyte0[k + 12] & 0xff | (abyte0[k + 13] & 0xff) << 8 | (abyte0[k + 14] & 0xff) << 16 | abyte0[k + 15] << 24;
        ai[4] = abyte0[k + 16] & 0xff | (abyte0[k + 17] & 0xff) << 8 | (abyte0[k + 18] & 0xff) << 16 | abyte0[k + 19] << 24;
        ai[5] = abyte0[k + 20] & 0xff | (abyte0[k + 21] & 0xff) << 8 | (abyte0[k + 22] & 0xff) << 16 | abyte0[k + 23] << 24;
        ai[6] = abyte0[k + 24] & 0xff | (abyte0[k + 25] & 0xff) << 8 | (abyte0[k + 26] & 0xff) << 16 | abyte0[k + 27] << 24;
        ai[7] = abyte0[k + 28] & 0xff | (abyte0[k + 29] & 0xff) << 8 | (abyte0[k + 30] & 0xff) << 16 | abyte0[k + 31] << 24;
        ai[8] = abyte0[k + 32] & 0xff | (abyte0[k + 33] & 0xff) << 8 | (abyte0[k + 34] & 0xff) << 16 | abyte0[k + 35] << 24;
        ai[9] = abyte0[k + 36] & 0xff | (abyte0[k + 37] & 0xff) << 8 | (abyte0[k + 38] & 0xff) << 16 | abyte0[k + 39] << 24;
        ai[10] = abyte0[k + 40] & 0xff | (abyte0[k + 41] & 0xff) << 8 | (abyte0[k + 42] & 0xff) << 16 | abyte0[k + 43] << 24;
        ai[11] = abyte0[k + 44] & 0xff | (abyte0[k + 45] & 0xff) << 8 | (abyte0[k + 46] & 0xff) << 16 | abyte0[k + 47] << 24;
        ai[12] = abyte0[k + 48] & 0xff | (abyte0[k + 49] & 0xff) << 8 | (abyte0[k + 50] & 0xff) << 16 | abyte0[k + 51] << 24;
        ai[13] = abyte0[k + 52] & 0xff | (abyte0[k + 53] & 0xff) << 8 | (abyte0[k + 54] & 0xff) << 16 | abyte0[k + 55] << 24;
        ai[14] = abyte0[k + 56] & 0xff | (abyte0[k + 57] & 0xff) << 8 | (abyte0[k + 58] & 0xff) << 16 | abyte0[k + 59] << 24;
        ai[15] = abyte0[k + 60] & 0xff | (abyte0[k + 61] & 0xff) << 8 | (abyte0[k + 62] & 0xff) << 16 | abyte0[k + 63] << 24;
        k = k1 + (((l & j1 | ~l & i1) + ai[0]) - 0x28955b88);
        k = (k >>> 25 | k << 7) + l;
        i1 += ((k & l | ~k & j1) + ai[1]) - 0x173848aa;
        i1 = (i1 >>> 20 | i1 << 12) + k;
        j1 += (i1 & k | ~i1 & l) + ai[2] + 0x242070db;
        j1 = (j1 >>> 15 | j1 << 17) + i1;
        l += ((j1 & i1 | ~j1 & k) + ai[3]) - 0x3e423112;
        l = (l >>> 10 | l << 22) + j1;
        k += ((l & j1 | ~l & i1) + ai[4]) - 0xa83f051;
        k = (k >>> 25 | k << 7) + l;
        i1 += (k & l | ~k & j1) + ai[5] + 0x4787c62a;
        i1 = (i1 >>> 20 | i1 << 12) + k;
        j1 += ((i1 & k | ~i1 & l) + ai[6]) - 0x57cfb9ed;
        j1 = (j1 >>> 15 | j1 << 17) + i1;
        l += ((j1 & i1 | ~j1 & k) + ai[7]) - 0x2b96aff;
        l = (l >>> 10 | l << 22) + j1;
        k += (l & j1 | ~l & i1) + ai[8] + 0x698098d8;
        k = (k >>> 25 | k << 7) + l;
        i1 += ((k & l | ~k & j1) + ai[9]) - 0x74bb0851;
        i1 = (i1 >>> 20 | i1 << 12) + k;
        j1 += ((i1 & k | ~i1 & l) + ai[10]) - 42063;
        j1 = (j1 >>> 15 | j1 << 17) + i1;
        l += ((j1 & i1 | ~j1 & k) + ai[11]) - 0x76a32842;
        l = (l >>> 10 | l << 22) + j1;
        k += (l & j1 | ~l & i1) + ai[12] + 0x6b901122;
        k = (k >>> 25 | k << 7) + l;
        i1 += ((k & l | ~k & j1) + ai[13]) - 0x2678e6d;
        i1 = (i1 >>> 20 | i1 << 12) + k;
        j1 += ((i1 & k | ~i1 & l) + ai[14]) - 0x5986bc72;
        j1 = (j1 >>> 15 | j1 << 17) + i1;
        l += (j1 & i1 | ~j1 & k) + ai[15] + 0x49b40821;
        l = (l >>> 10 | l << 22) + j1;
        k += ((l & i1 | ~i1 & j1) + ai[1]) - 0x9e1da9e;
        k = (k >>> 27 | k << 5) + l;
        i1 += ((k & j1 | ~j1 & l) + ai[6]) - 0x3fbf4cc0;
        i1 = (i1 >>> 23 | i1 << 9) + k;
        j1 += (i1 & l | ~l & k) + ai[11] + 0x265e5a51;
        j1 = (j1 >>> 18 | j1 << 14) + i1;
        l += ((j1 & k | ~k & i1) + ai[0]) - 0x16493856;
        l = (l >>> 12 | l << 20) + j1;
        k += ((l & i1 | ~i1 & j1) + ai[5]) - 0x29d0efa3;
        k = (k >>> 27 | k << 5) + l;
        i1 += (k & j1 | ~j1 & l) + ai[10] + 0x2441453;
        i1 = (i1 >>> 23 | i1 << 9) + k;
        j1 += ((i1 & l | ~l & k) + ai[15]) - 0x275e197f;
        j1 = (j1 >>> 18 | j1 << 14) + i1;
        l += ((j1 & k | ~k & i1) + ai[4]) - 0x182c0438;
        l = (l >>> 12 | l << 20) + j1;
        k += (l & i1 | ~i1 & j1) + ai[9] + 0x21e1cde6;
        k = (k >>> 27 | k << 5) + l;
        i1 += ((k & j1 | ~j1 & l) + ai[14]) - 0x3cc8f82a;
        i1 = (i1 >>> 23 | i1 << 9) + k;
        j1 += ((i1 & l | ~l & k) + ai[3]) - 0xb2af279;
        j1 = (j1 >>> 18 | j1 << 14) + i1;
        l += (j1 & k | ~k & i1) + ai[8] + 0x455a14ed;
        l = (l >>> 12 | l << 20) + j1;
        k += ((l & i1 | ~i1 & j1) + ai[13]) - 0x561c16fb;
        k = (k >>> 27 | k << 5) + l;
        i1 += ((k & j1 | ~j1 & l) + ai[2]) - 0x3105c08;
        i1 = (i1 >>> 23 | i1 << 9) + k;
        j1 += (i1 & l | ~l & k) + ai[7] + 0x676f02d9;
        j1 = (j1 >>> 18 | j1 << 14) + i1;
        l += ((j1 & k | ~k & i1) + ai[12]) - 0x72d5b376;
        l = (l >>> 12 | l << 20) + j1;
        k += ((l ^ j1 ^ i1) + ai[5]) - 0x5c6be;
        k = (k >>> 28 | k << 4) + l;
        i1 += ((k ^ l ^ j1) + ai[8]) - 0x788e097f;
        i1 = (i1 >>> 21 | i1 << 11) + k;
        j1 += (i1 ^ k ^ l) + ai[11] + 0x6d9d6122;
        j1 = (j1 >>> 16 | j1 << 16) + i1;
        l += ((j1 ^ i1 ^ k) + ai[14]) - 0x21ac7f4;
        l = (l >>> 9 | l << 23) + j1;
        k += ((l ^ j1 ^ i1) + ai[1]) - 0x5b4115bc;
        k = (k >>> 28 | k << 4) + l;
        i1 += (k ^ l ^ j1) + ai[4] + 0x4bdecfa9;
        i1 = (i1 >>> 21 | i1 << 11) + k;
        j1 += ((i1 ^ k ^ l) + ai[7]) - 0x944b4a0;
        j1 = (j1 >>> 16 | j1 << 16) + i1;
        l += ((j1 ^ i1 ^ k) + ai[10]) - 0x41404390;
        l = (l >>> 9 | l << 23) + j1;
        k += (l ^ j1 ^ i1) + ai[13] + 0x289b7ec6;
        k = (k >>> 28 | k << 4) + l;
        i1 += ((k ^ l ^ j1) + ai[0]) - 0x155ed806;
        i1 = (i1 >>> 21 | i1 << 11) + k;
        j1 += ((i1 ^ k ^ l) + ai[3]) - 0x2b10cf7b;
        j1 = (j1 >>> 16 | j1 << 16) + i1;
        l += (j1 ^ i1 ^ k) + ai[6] + 0x4881d05;
        l = (l >>> 9 | l << 23) + j1;
        k += ((l ^ j1 ^ i1) + ai[9]) - 0x262b2fc7;
        k = (k >>> 28 | k << 4) + l;
        i1 += ((k ^ l ^ j1) + ai[12]) - 0x1924661b;
        i1 = (i1 >>> 21 | i1 << 11) + k;
        j1 += (i1 ^ k ^ l) + ai[15] + 0x1fa27cf8;
        j1 = (j1 >>> 16 | j1 << 16) + i1;
        l += ((j1 ^ i1 ^ k) + ai[2]) - 0x3b53a99b;
        l = (l >>> 9 | l << 23) + j1;
        k += (((~i1 | l) ^ j1) + ai[0]) - 0xbd6ddbc;
        k = (k >>> 26 | k << 6) + l;
        i1 += ((~j1 | k) ^ l) + ai[7] + 0x432aff97;
        i1 = (i1 >>> 22 | i1 << 10) + k;
        j1 += (((~l | i1) ^ k) + ai[14]) - 0x546bdc59;
        j1 = (j1 >>> 17 | j1 << 15) + i1;
        l += (((~k | j1) ^ i1) + ai[5]) - 0x36c5fc7;
        l = (l >>> 11 | l << 21) + j1;
        k += ((~i1 | l) ^ j1) + ai[12] + 0x655b59c3;
        k = (k >>> 26 | k << 6) + l;
        i1 += (((~j1 | k) ^ l) + ai[3]) - 0x70f3336e;
        i1 = (i1 >>> 22 | i1 << 10) + k;
        j1 += (((~l | i1) ^ k) + ai[10]) - 0x100b83;
        j1 = (j1 >>> 17 | j1 << 15) + i1;
        l += (((~k | j1) ^ i1) + ai[1]) - 0x7a7ba22f;
        l = (l >>> 11 | l << 21) + j1;
        k += ((~i1 | l) ^ j1) + ai[8] + 0x6fa87e4f;
        k = (k >>> 26 | k << 6) + l;
        i1 += (((~j1 | k) ^ l) + ai[15]) - 0x1d31920;
        i1 = (i1 >>> 22 | i1 << 10) + k;
        j1 += (((~l | i1) ^ k) + ai[6]) - 0x5cfebcec;
        j1 = (j1 >>> 17 | j1 << 15) + i1;
        l += ((~k | j1) ^ i1) + ai[13] + 0x4e0811a1;
        l = (l >>> 11 | l << 21) + j1;
        k += (((~i1 | l) ^ j1) + ai[4]) - 0x8ac817e;
        k = (k >>> 26 | k << 6) + l;
        i1 += (((~j1 | k) ^ l) + ai[11]) - 0x42c50dcb;
        i1 = (i1 >>> 22 | i1 << 10) + k;
        j1 += ((~l | i1) ^ k) + ai[2] + 0x2ad7d2bb;
        j1 = (j1 >>> 17 | j1 << 15) + i1;
        l += (((~k | j1) ^ i1) + ai[9]) - 0x14792c6f;
        abyte0 = j.a;
        abyte0[0] = k + abyte0[0];
        abyte0 = j.a;
        abyte0[1] = (l >>> 11 | l << 21) + j1 + abyte0[1];
        abyte0 = j.a;
        abyte0[2] = abyte0[2] + j1;
        j = j.a;
        j[3] = j[3] + i1;
        System.gc();
    }

    private static final byte[] a(int ai[], int j)
    {
        byte abyte0[] = new byte[j];
        int k = 0;
        int l = 0;
        do
        {
            if (k >= j)
            {
                return abyte0;
            }
            abyte0[k] = (byte)(ai[l] & 0xff);
            abyte0[k + 1] = (byte)(ai[l] >>> 8 & 0xff);
            abyte0[k + 2] = (byte)(ai[l] >>> 16 & 0xff);
            abyte0[k + 3] = (byte)(ai[l] >>> 24 & 0xff);
            l++;
            k += 4;
        } while (true);
    }

    public final byte[] a()
    {
        this;
        JVM INSTR monitorenter ;
        i j;
        byte abyte1[];
        int k;
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        j = new i(b);
        abyte1 = a(new int[] {
            (int)(j.b << 3), (int)(j.b >> 29)
        }, 8);
        k = (int)(j.b & 63L);
        byte abyte0[];
        if (k < 56)
        {
            k = 56 - k;
        } else
        {
            k = 120 - k;
        }
        a(j, d, k);
        a(j, abyte1, 8);
        c = j;
        abyte0 = a(c.a, 16);
        this;
        JVM INSTR monitorexit ;
        return abyte0;
        Exception exception;
        exception;
        throw exception;
    }

    static 
    {
        byte abyte0[] = new byte[64];
        abyte0[0] = -128;
        d = abyte0;
    }
}
