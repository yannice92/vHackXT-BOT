// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.a;

import com.utilities.c;
import java.util.ArrayList;

// Referenced classes of package com.bca.a:
//            a

public abstract class f
{

    protected String a;
    protected String b;
    protected String c;
    protected String d;
    protected String e;
    protected String f;
    protected String g;
    protected String h;
    protected String i;
    protected String j;
    protected String k;
    protected String l[];
    protected a m[];
    protected boolean n;
    private int o;

    public f(String as[])
    {
        a = as[1];
        b = as[2];
        c = com.utilities.c.c(as[3].replace(":@:", "\n"));
        d = as[4];
        f = as[5];
        o = 0;
    }

    public final void a(String s)
    {
        e = s;
    }

    protected final void a(ArrayList arraylist)
    {
        g = (String)arraylist.get(2);
        h = (String)arraylist.get(1);
        i = (String)arraylist.get(3);
    }

    public final void a(String as[])
    {
        l = as;
    }

    public final a b()
    {
        return m[o];
    }

    public final void b(String s)
    {
        f = s;
    }

    public final void c()
    {
        if (o < m.length - 1)
        {
            o = o + 1;
        }
    }

    public final void c(String s)
    {
        j = s;
    }

    public final String d()
    {
        return b;
    }

    public final void d(String s)
    {
        k = s;
    }

    public final String e()
    {
        return c;
    }

    public final String f()
    {
        return d;
    }

    public final String[] g()
    {
        return l;
    }

    public final void h()
    {
        n = true;
    }

    public final String i()
    {
        Object obj;
        String as[];
        int i1;
        i1 = 1;
        if (!n)
        {
            if (b.equals("OFF"))
            {
                obj = new String[13];
                obj[11] = e;
                obj[12] = "3";
            } else
            {
                obj = new String[12];
                obj[11] = "3";
            }
            obj[0] = "PGI";
            obj[1] = "TVA";
            obj[2] = a;
            obj[3] = b;
            obj[4] = g;
            obj[5] = h;
            obj[6] = i;
            obj[7] = k;
            obj[8] = f;
            obj[9] = "#MPIN#";
            obj[10] = d;
            as = ((String []) (obj));
        } else
        {
            as = new String[12];
            as[0] = "PGI";
            as[1] = "TSK2";
            as[2] = a;
            as[3] = b;
            as[4] = g;
            as[5] = h;
            as[6] = i;
            as[7] = k;
            as[8] = f;
            as[9] = "#MPIN#";
            as[10] = d;
            as[11] = "3";
        }
        obj = "";
        if (as.length <= 0) goto _L2; else goto _L1
_L1:
        obj = as[0];
_L5:
        if (i1 < as.length) goto _L3; else goto _L2
_L2:
        return ((String) (obj));
_L3:
        obj = (new StringBuilder(String.valueOf(obj))).append(":!:").append(as[i1]).toString();
        i1++;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
