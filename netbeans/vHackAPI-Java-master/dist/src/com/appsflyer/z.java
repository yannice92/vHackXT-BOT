// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer;

import java.security.MessageDigest;
import java.util.Formatter;

// Referenced classes of package com.appsflyer:
//            b

public final class z
{

    public z()
    {
    }

    public static String a(String s)
    {
        int i = 0;
        byte abyte0[];
        String s1;
        int j;
        try
        {
            MessageDigest messagedigest = MessageDigest.getInstance("SHA-1");
            messagedigest.reset();
            messagedigest.update(s.getBytes("UTF-8"));
            abyte0 = messagedigest.digest();
            s = new Formatter();
            j = abyte0.length;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            b.a(s.toString());
            return null;
        }
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        s.format("%02x", new Object[] {
            Byte.valueOf(abyte0[i])
        });
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_38;
_L1:
        s1 = s.toString();
        s.close();
        return s1;
    }
}
