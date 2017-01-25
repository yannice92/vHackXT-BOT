// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.utilities;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Hashtable;

// Referenced classes of package com.utilities:
//            u, s

public final class t
{

    private static s a(InputStream inputstream)
    {
        u u1;
        inputstream = new InputStreamReader(inputstream);
        s s1;
        int i;
        try
        {
            u1 = new u(inputstream);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new RuntimeException((new StringBuilder("Could not create xml parser.")).append(inputstream).toString());
        }
        s1 = new s();
        inputstream = s1;
_L6:
        int j;
        int l;
        Hashtable hashtable;
        String s2;
        int k;
        try
        {
            i = u1.e();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new RuntimeException((new StringBuilder("parse error:")).append(inputstream).toString());
        }
        if (i == 1)
        {
            inputstream = s1;
            if (s1.b() == 1)
            {
                inputstream = s1.a();
            }
            return inputstream;
        }
        s2 = u1.b();
        k = u1.d();
        if (k != 2) goto _L2; else goto _L1
_L1:
        hashtable = null;
        l = u1.c();
        if (l <= 0) goto _L4; else goto _L3
_L3:
        hashtable = new Hashtable();
        j = 0;
          goto _L5
_L4:
        inputstream = new s(inputstream, s2, hashtable, k);
          goto _L6
_L10:
        hashtable.put(u1.a(j), u1.b(j));
        j++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (k != 3) goto _L8; else goto _L7
_L7:
        inputstream = inputstream.e();
          goto _L6
_L8:
        if (k != 4) goto _L6; else goto _L9
_L9:
        inputstream.a(u1.a());
          goto _L6
_L5:
        if (j < l) goto _L10; else goto _L4
    }

    public static s a(String s1)
    {
        try
        {
            System.out.println((new StringBuilder("document :")).append(s1).toString());
            s1 = a(((InputStream) (new ByteArrayInputStream(s1.getBytes()))));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new RuntimeException(s1.toString());
        }
        return s1;
    }
}
