// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.utilities;

import b.a.a.b;
import b.a.a.b.a;
import b.a.a.c.c;

// Referenced classes of package com.utilities:
//            b

public final class e
{

    private b a;
    private b.a.a.d.a b;

    public e(String s)
    {
        this(s.getBytes());
    }

    private e(byte abyte0[])
    {
        a = new c(new a(new b.a.a.a.a()));
        b = new b.a.a.d.a(abyte0);
    }

    private byte[] a(byte abyte0[])
    {
        int i = a.b(abyte0.length);
        byte abyte1[] = new byte[i];
        int j = a.a(abyte0, 0, abyte0.length, abyte1);
        j += a.a(abyte1, j);
        if (j < i)
        {
            abyte0 = new byte[j];
            System.arraycopy(abyte1, 0, abyte0, 0, j);
            return abyte0;
        } else
        {
            return abyte1;
        }
    }

    private byte[] b(byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        if (abyte0 == null) goto _L2; else goto _L1
_L1:
        if (abyte0.length != 0) goto _L3; else goto _L2
_L2:
        abyte0 = new byte[0];
_L5:
        this;
        JVM INSTR monitorexit ;
        return abyte0;
_L3:
        a.a(true, b);
        abyte0 = a(abyte0);
        if (true) goto _L5; else goto _L4
_L4:
        abyte0;
        throw abyte0;
    }

    private byte[] c(byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        if (abyte0 == null) goto _L2; else goto _L1
_L1:
        if (abyte0.length != 0) goto _L3; else goto _L2
_L2:
        abyte0 = new byte[0];
_L5:
        this;
        JVM INSTR monitorexit ;
        return abyte0;
_L3:
        a.a(false, b);
        abyte0 = a(abyte0);
        if (true) goto _L5; else goto _L4
_L4:
        abyte0;
        throw abyte0;
    }

    public final String a(String s)
    {
        if (s == null || s.length() == 0)
        {
            return "";
        } else
        {
            return com.utilities.b.a(b(s.getBytes()));
        }
    }

    public final String b(String s)
    {
        if (s == null || s.equals(""))
        {
            return "";
        } else
        {
            return new String(c(com.utilities.b.a(s.toString())));
        }
    }
}
