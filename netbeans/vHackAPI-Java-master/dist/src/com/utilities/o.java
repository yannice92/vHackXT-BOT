// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.utilities;

import java.io.InputStream;

public final class o
{

    public static String a(InputStream inputstream)
    {
        byte abyte0[];
        int i;
        int j;
        int k;
        try
        {
            abyte0 = new byte[inputstream.available()];
            inputstream.read(abyte0);
            inputstream = new byte[2328];
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            return null;
        }
        j = 48;
        i = 0;
          goto _L1
_L5:
        if (i < 32) goto _L3; else goto _L2
_L2:
        abyte0 = new byte[j];
        i = 32;
        j = 0;
_L8:
        if (j >= abyte0.length)
        {
            return new String(abyte0);
        }
          goto _L4
_L7:
        abyte0[j] = (byte)(abyte0[j] << 1 | inputstream[i] & 1);
        k++;
        i++;
        continue; /* Loop/switch isn't completed */
_L1:
label0:
        {
            if (j <= 2375)
            {
                break label0;
            }
            i = 0;
            j = 0;
        }
          goto _L5
        k = i;
        if (abyte0[j] != 0)
        {
            inputstream[i] = abyte0[j];
            k = i + 1;
        }
        j++;
        i = k;
          goto _L1
_L3:
        j = j << 1 | inputstream[i] & 1;
        i++;
          goto _L5
_L4:
        k = 0;
        if (k < 8) goto _L7; else goto _L6
_L6:
        j++;
          goto _L8
    }
}
