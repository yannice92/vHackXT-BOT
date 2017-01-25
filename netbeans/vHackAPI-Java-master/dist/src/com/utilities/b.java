// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.utilities;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public final class b
{

    private static final byte a[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 43, 47
    };
    private static final byte b[];
    private static final byte c[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 45, 95
    };
    private static final byte d[];
    private static final byte e[] = {
        45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 
        57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 
        74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 
        84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 
        99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 
        109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 
        119, 120, 121, 122
    };
    private static final byte f[];

    private static int a(byte abyte0[], byte abyte1[], int i)
    {
        byte abyte2[] = b;
        if (abyte0[2] == 61)
        {
            abyte1[i] = (byte)(((abyte2[abyte0[0]] & 0xff) << 18 | (abyte2[abyte0[1]] & 0xff) << 12) >>> 16);
            return 1;
        }
        if (abyte0[3] == 61)
        {
            int j = abyte2[abyte0[0]];
            j = (abyte2[abyte0[1]] & 0xff) << 12 | (j & 0xff) << 18 | (abyte2[abyte0[2]] & 0xff) << 6;
            abyte1[i] = (byte)(j >>> 16);
            abyte1[i + 1] = (byte)(j >>> 8);
            return 2;
        } else
        {
            int k = (abyte2[abyte0[0]] & 0xff) << 18 | (abyte2[abyte0[1]] & 0xff) << 12 | (abyte2[abyte0[2]] & 0xff) << 6 | abyte2[abyte0[3]] & 0xff;
            abyte1[i] = (byte)(k >> 16);
            abyte1[i + 1] = (byte)(k >> 8);
            abyte1[i + 2] = (byte)k;
            return 3;
        }
    }

    public static String a(byte abyte0[])
    {
        return a(abyte0, abyte0.length);
    }

    private static String a(byte abyte0[], int i)
    {
        int k = (i * 4) / 3;
        byte abyte1[];
        int j;
        if (i % 3 > 0)
        {
            j = 4;
        } else
        {
            j = 0;
        }
        abyte1 = new byte[j + k + 0];
        j = 0;
        k = 0;
        do
        {
            if (k >= i - 2)
            {
                if (k < i)
                {
                    a(abyte0, k + 0, i - k, abyte1, j);
                    i = j + 4;
                } else
                {
                    i = j;
                }
                try
                {
                    abyte0 = new String(abyte1, 0, i, "UTF-8");
                }
                // Misplaced declaration of an exception variable
                catch (byte abyte0[])
                {
                    return new String(abyte1, 0, i);
                }
                return abyte0;
            }
            a(abyte0, k + 0, 3, abyte1, j);
            k += 3;
            j += 4;
        } while (true);
    }

    public static byte[] a(String s)
    {
        return b(s);
    }

    private static byte[] a(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        int j1 = 0;
        byte abyte2[] = a;
        int l;
        int i1;
        if (j > 0)
        {
            l = (abyte0[i] << 24) >>> 8;
        } else
        {
            l = 0;
        }
        if (j > 1)
        {
            i1 = (abyte0[i + 1] << 24) >>> 16;
        } else
        {
            i1 = 0;
        }
        if (j > 2)
        {
            j1 = (abyte0[i + 2] << 24) >>> 24;
        }
        i = j1 | (i1 | l);
        switch (j)
        {
        default:
            return abyte1;

        case 3: // '\003'
            abyte1[k] = abyte2[i >>> 18];
            abyte1[k + 1] = abyte2[i >>> 12 & 0x3f];
            abyte1[k + 2] = abyte2[i >>> 6 & 0x3f];
            abyte1[k + 3] = abyte2[i & 0x3f];
            return abyte1;

        case 2: // '\002'
            abyte1[k] = abyte2[i >>> 18];
            abyte1[k + 1] = abyte2[i >>> 12 & 0x3f];
            abyte1[k + 2] = abyte2[i >>> 6 & 0x3f];
            abyte1[k + 3] = 61;
            return abyte1;

        case 1: // '\001'
            abyte1[k] = abyte2[i >>> 18];
            abyte1[k + 1] = abyte2[i >>> 12 & 0x3f];
            abyte1[k + 2] = 61;
            abyte1[k + 3] = 61;
            return abyte1;
        }
    }

    private static byte[] b(String s)
    {
        byte abyte0[] = s.getBytes("UTF-8");
        s = abyte0;
_L3:
        Object obj;
        byte abyte1[];
        byte abyte2[];
        int i;
        int j;
        int k;
        int j1;
        j1 = s.length;
        abyte1 = b;
        obj = new byte[(j1 * 3) / 4];
        abyte2 = new byte[4];
        k = 0;
        j = 0;
        i = 0;
_L9:
        if (k < j1 + 0) goto _L2; else goto _L1
_L1:
        s = new byte[i];
        System.arraycopy(obj, 0, s, 0, i);
        return s;
        obj;
        s = s.getBytes();
          goto _L3
_L2:
        byte byte0;
        int l;
        byte0 = (byte)(s[k] & 0x7f);
        l = abyte1[byte0];
        if (l < -5) goto _L5; else goto _L4
_L4:
        if (l < -1)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        l = j + 1;
        abyte2[j] = byte0;
        if (l <= 3) goto _L7; else goto _L6
_L6:
        j = a(abyte2, ((byte []) (obj)), i) + i;
        i = j;
        if (byte0 == 61) goto _L1; else goto _L8
_L8:
        i = 0;
_L10:
        l = k + 1;
        k = j;
        j = i;
        i = k;
        k = l;
          goto _L9
_L5:
        System.err.println((new StringBuilder("Bad Base64 input character at ")).append(k).append(": ").append(s[k]).append("(decimal)").toString());
        return null;
_L7:
        j = i;
        i = l;
          goto _L10
        int i1 = i;
        i = j;
        j = i1;
          goto _L10
    }

    static 
    {
        byte abyte0[] = new byte[127];
        abyte0[0] = -9;
        abyte0[1] = -9;
        abyte0[2] = -9;
        abyte0[3] = -9;
        abyte0[4] = -9;
        abyte0[5] = -9;
        abyte0[6] = -9;
        abyte0[7] = -9;
        abyte0[8] = -9;
        abyte0[9] = -5;
        abyte0[10] = -5;
        abyte0[11] = -9;
        abyte0[12] = -9;
        abyte0[13] = -5;
        abyte0[14] = -9;
        abyte0[15] = -9;
        abyte0[16] = -9;
        abyte0[17] = -9;
        abyte0[18] = -9;
        abyte0[19] = -9;
        abyte0[20] = -9;
        abyte0[21] = -9;
        abyte0[22] = -9;
        abyte0[23] = -9;
        abyte0[24] = -9;
        abyte0[25] = -9;
        abyte0[26] = -9;
        abyte0[27] = -9;
        abyte0[28] = -9;
        abyte0[29] = -9;
        abyte0[30] = -9;
        abyte0[31] = -9;
        abyte0[32] = -5;
        abyte0[33] = -9;
        abyte0[34] = -9;
        abyte0[35] = -9;
        abyte0[36] = -9;
        abyte0[37] = -9;
        abyte0[38] = -9;
        abyte0[39] = -9;
        abyte0[40] = -9;
        abyte0[41] = -9;
        abyte0[42] = -9;
        abyte0[43] = 62;
        abyte0[44] = -9;
        abyte0[45] = -9;
        abyte0[46] = -9;
        abyte0[47] = 63;
        abyte0[48] = 52;
        abyte0[49] = 53;
        abyte0[50] = 54;
        abyte0[51] = 55;
        abyte0[52] = 56;
        abyte0[53] = 57;
        abyte0[54] = 58;
        abyte0[55] = 59;
        abyte0[56] = 60;
        abyte0[57] = 61;
        abyte0[58] = -9;
        abyte0[59] = -9;
        abyte0[60] = -9;
        abyte0[61] = -1;
        abyte0[62] = -9;
        abyte0[63] = -9;
        abyte0[64] = -9;
        abyte0[66] = 1;
        abyte0[67] = 2;
        abyte0[68] = 3;
        abyte0[69] = 4;
        abyte0[70] = 5;
        abyte0[71] = 6;
        abyte0[72] = 7;
        abyte0[73] = 8;
        abyte0[74] = 9;
        abyte0[75] = 10;
        abyte0[76] = 11;
        abyte0[77] = 12;
        abyte0[78] = 13;
        abyte0[79] = 14;
        abyte0[80] = 15;
        abyte0[81] = 16;
        abyte0[82] = 17;
        abyte0[83] = 18;
        abyte0[84] = 19;
        abyte0[85] = 20;
        abyte0[86] = 21;
        abyte0[87] = 22;
        abyte0[88] = 23;
        abyte0[89] = 24;
        abyte0[90] = 25;
        abyte0[91] = -9;
        abyte0[92] = -9;
        abyte0[93] = -9;
        abyte0[94] = -9;
        abyte0[95] = -9;
        abyte0[96] = -9;
        abyte0[97] = 26;
        abyte0[98] = 27;
        abyte0[99] = 28;
        abyte0[100] = 29;
        abyte0[101] = 30;
        abyte0[102] = 31;
        abyte0[103] = 32;
        abyte0[104] = 33;
        abyte0[105] = 34;
        abyte0[106] = 35;
        abyte0[107] = 36;
        abyte0[108] = 37;
        abyte0[109] = 38;
        abyte0[110] = 39;
        abyte0[111] = 40;
        abyte0[112] = 41;
        abyte0[113] = 42;
        abyte0[114] = 43;
        abyte0[115] = 44;
        abyte0[116] = 45;
        abyte0[117] = 46;
        abyte0[118] = 47;
        abyte0[119] = 48;
        abyte0[120] = 49;
        abyte0[121] = 50;
        abyte0[122] = 51;
        abyte0[123] = -9;
        abyte0[124] = -9;
        abyte0[125] = -9;
        abyte0[126] = -9;
        b = abyte0;
        abyte0 = new byte[127];
        abyte0[0] = -9;
        abyte0[1] = -9;
        abyte0[2] = -9;
        abyte0[3] = -9;
        abyte0[4] = -9;
        abyte0[5] = -9;
        abyte0[6] = -9;
        abyte0[7] = -9;
        abyte0[8] = -9;
        abyte0[9] = -5;
        abyte0[10] = -5;
        abyte0[11] = -9;
        abyte0[12] = -9;
        abyte0[13] = -5;
        abyte0[14] = -9;
        abyte0[15] = -9;
        abyte0[16] = -9;
        abyte0[17] = -9;
        abyte0[18] = -9;
        abyte0[19] = -9;
        abyte0[20] = -9;
        abyte0[21] = -9;
        abyte0[22] = -9;
        abyte0[23] = -9;
        abyte0[24] = -9;
        abyte0[25] = -9;
        abyte0[26] = -9;
        abyte0[27] = -9;
        abyte0[28] = -9;
        abyte0[29] = -9;
        abyte0[30] = -9;
        abyte0[31] = -9;
        abyte0[32] = -5;
        abyte0[33] = -9;
        abyte0[34] = -9;
        abyte0[35] = -9;
        abyte0[36] = -9;
        abyte0[37] = -9;
        abyte0[38] = -9;
        abyte0[39] = -9;
        abyte0[40] = -9;
        abyte0[41] = -9;
        abyte0[42] = -9;
        abyte0[43] = -9;
        abyte0[44] = -9;
        abyte0[45] = 62;
        abyte0[46] = -9;
        abyte0[47] = -9;
        abyte0[48] = 52;
        abyte0[49] = 53;
        abyte0[50] = 54;
        abyte0[51] = 55;
        abyte0[52] = 56;
        abyte0[53] = 57;
        abyte0[54] = 58;
        abyte0[55] = 59;
        abyte0[56] = 60;
        abyte0[57] = 61;
        abyte0[58] = -9;
        abyte0[59] = -9;
        abyte0[60] = -9;
        abyte0[61] = -1;
        abyte0[62] = -9;
        abyte0[63] = -9;
        abyte0[64] = -9;
        abyte0[66] = 1;
        abyte0[67] = 2;
        abyte0[68] = 3;
        abyte0[69] = 4;
        abyte0[70] = 5;
        abyte0[71] = 6;
        abyte0[72] = 7;
        abyte0[73] = 8;
        abyte0[74] = 9;
        abyte0[75] = 10;
        abyte0[76] = 11;
        abyte0[77] = 12;
        abyte0[78] = 13;
        abyte0[79] = 14;
        abyte0[80] = 15;
        abyte0[81] = 16;
        abyte0[82] = 17;
        abyte0[83] = 18;
        abyte0[84] = 19;
        abyte0[85] = 20;
        abyte0[86] = 21;
        abyte0[87] = 22;
        abyte0[88] = 23;
        abyte0[89] = 24;
        abyte0[90] = 25;
        abyte0[91] = -9;
        abyte0[92] = -9;
        abyte0[93] = -9;
        abyte0[94] = -9;
        abyte0[95] = 63;
        abyte0[96] = -9;
        abyte0[97] = 26;
        abyte0[98] = 27;
        abyte0[99] = 28;
        abyte0[100] = 29;
        abyte0[101] = 30;
        abyte0[102] = 31;
        abyte0[103] = 32;
        abyte0[104] = 33;
        abyte0[105] = 34;
        abyte0[106] = 35;
        abyte0[107] = 36;
        abyte0[108] = 37;
        abyte0[109] = 38;
        abyte0[110] = 39;
        abyte0[111] = 40;
        abyte0[112] = 41;
        abyte0[113] = 42;
        abyte0[114] = 43;
        abyte0[115] = 44;
        abyte0[116] = 45;
        abyte0[117] = 46;
        abyte0[118] = 47;
        abyte0[119] = 48;
        abyte0[120] = 49;
        abyte0[121] = 50;
        abyte0[122] = 51;
        abyte0[123] = -9;
        abyte0[124] = -9;
        abyte0[125] = -9;
        abyte0[126] = -9;
        d = abyte0;
        abyte0 = new byte[127];
        abyte0[0] = -9;
        abyte0[1] = -9;
        abyte0[2] = -9;
        abyte0[3] = -9;
        abyte0[4] = -9;
        abyte0[5] = -9;
        abyte0[6] = -9;
        abyte0[7] = -9;
        abyte0[8] = -9;
        abyte0[9] = -5;
        abyte0[10] = -5;
        abyte0[11] = -9;
        abyte0[12] = -9;
        abyte0[13] = -5;
        abyte0[14] = -9;
        abyte0[15] = -9;
        abyte0[16] = -9;
        abyte0[17] = -9;
        abyte0[18] = -9;
        abyte0[19] = -9;
        abyte0[20] = -9;
        abyte0[21] = -9;
        abyte0[22] = -9;
        abyte0[23] = -9;
        abyte0[24] = -9;
        abyte0[25] = -9;
        abyte0[26] = -9;
        abyte0[27] = -9;
        abyte0[28] = -9;
        abyte0[29] = -9;
        abyte0[30] = -9;
        abyte0[31] = -9;
        abyte0[32] = -5;
        abyte0[33] = -9;
        abyte0[34] = -9;
        abyte0[35] = -9;
        abyte0[36] = -9;
        abyte0[37] = -9;
        abyte0[38] = -9;
        abyte0[39] = -9;
        abyte0[40] = -9;
        abyte0[41] = -9;
        abyte0[42] = -9;
        abyte0[43] = -9;
        abyte0[44] = -9;
        abyte0[46] = -9;
        abyte0[47] = -9;
        abyte0[48] = 1;
        abyte0[49] = 2;
        abyte0[50] = 3;
        abyte0[51] = 4;
        abyte0[52] = 5;
        abyte0[53] = 6;
        abyte0[54] = 7;
        abyte0[55] = 8;
        abyte0[56] = 9;
        abyte0[57] = 10;
        abyte0[58] = -9;
        abyte0[59] = -9;
        abyte0[60] = -9;
        abyte0[61] = -1;
        abyte0[62] = -9;
        abyte0[63] = -9;
        abyte0[64] = -9;
        abyte0[65] = 11;
        abyte0[66] = 12;
        abyte0[67] = 13;
        abyte0[68] = 14;
        abyte0[69] = 15;
        abyte0[70] = 16;
        abyte0[71] = 17;
        abyte0[72] = 18;
        abyte0[73] = 19;
        abyte0[74] = 20;
        abyte0[75] = 21;
        abyte0[76] = 22;
        abyte0[77] = 23;
        abyte0[78] = 24;
        abyte0[79] = 25;
        abyte0[80] = 26;
        abyte0[81] = 27;
        abyte0[82] = 28;
        abyte0[83] = 29;
        abyte0[84] = 30;
        abyte0[85] = 31;
        abyte0[86] = 32;
        abyte0[87] = 33;
        abyte0[88] = 34;
        abyte0[89] = 35;
        abyte0[90] = 36;
        abyte0[91] = -9;
        abyte0[92] = -9;
        abyte0[93] = -9;
        abyte0[94] = -9;
        abyte0[95] = 37;
        abyte0[96] = -9;
        abyte0[97] = 38;
        abyte0[98] = 39;
        abyte0[99] = 40;
        abyte0[100] = 41;
        abyte0[101] = 42;
        abyte0[102] = 43;
        abyte0[103] = 44;
        abyte0[104] = 45;
        abyte0[105] = 46;
        abyte0[106] = 47;
        abyte0[107] = 48;
        abyte0[108] = 49;
        abyte0[109] = 50;
        abyte0[110] = 51;
        abyte0[111] = 52;
        abyte0[112] = 53;
        abyte0[113] = 54;
        abyte0[114] = 55;
        abyte0[115] = 56;
        abyte0[116] = 57;
        abyte0[117] = 58;
        abyte0[118] = 59;
        abyte0[119] = 60;
        abyte0[120] = 61;
        abyte0[121] = 62;
        abyte0[122] = 63;
        abyte0[123] = -9;
        abyte0[124] = -9;
        abyte0[125] = -9;
        abyte0[126] = -9;
        f = abyte0;
    }
}
