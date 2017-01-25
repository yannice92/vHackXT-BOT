// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.g;

import a.d;
import a.e;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import java.io.IOException;

public final class c
    implements e
{

    private IsoDep a;

    public c(Tag tag)
    {
        a = null;
        a = IsoDep.get(tag);
    }

    private d b(String s)
    {
        d d1;
        d1 = new d();
        if (a == null || !a.isConnected())
        {
            break MISSING_BLOCK_LABEL_293;
        }
        byte abyte0[];
        int j;
        j = s.length();
        abyte0 = new byte[j / 2];
        int i = 0;
_L5:
        if (i < j) goto _L2; else goto _L1
_L1:
        char ac[];
        s = a.transceive(abyte0);
        abyte0 = new char[16];
        abyte0;
        abyte0[0] = '0';
        abyte0[1] = '1';
        abyte0[2] = '2';
        abyte0[3] = '3';
        abyte0[4] = '4';
        abyte0[5] = '5';
        abyte0[6] = '6';
        abyte0[7] = '7';
        abyte0[8] = '8';
        abyte0[9] = '9';
        abyte0[10] = 'A';
        abyte0[11] = 'B';
        abyte0[12] = 'C';
        abyte0[13] = 'D';
        abyte0[14] = 'E';
        abyte0[15] = 'F';
        ac = new char[s.length * 2];
        i = 0;
_L6:
        if (i < s.length) goto _L4; else goto _L3
_L3:
        s = new String(ac);
_L7:
        if (s.length() > 0)
        {
            d1.a(true);
            d1.b(s);
            return d1;
        } else
        {
            d1.a(false);
            d1.b("");
            return d1;
        }
_L2:
        abyte0[i / 2] = (byte)((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
        i += 2;
          goto _L5
_L4:
        int k = s[i] & 0xff;
        ac[i * 2] = abyte0[k >>> 4];
        ac[i * 2 + 1] = abyte0[k & 0xf];
        i++;
          goto _L6
        s;
        s = "";
          goto _L7
    }

    public final d a(String s)
    {
        return b(s);
    }

    public final boolean a()
    {
        if (a != null)
        {
            try
            {
                if (!a.isConnected())
                {
                    a.connect();
                }
            }
            catch (IOException ioexception)
            {
                return false;
            }
        }
        return true;
    }

    public final boolean b()
    {
        if (a != null)
        {
            try
            {
                if (a.isConnected())
                {
                    a.close();
                }
            }
            catch (IOException ioexception)
            {
                return false;
            }
        }
        return true;
    }
}
