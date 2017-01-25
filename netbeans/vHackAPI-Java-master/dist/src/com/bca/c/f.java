// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.c;

import android.content.Context;
import b.a.a.d;
import com.bca.mobile.n;
import com.c.a;
import com.utilities.e;
import com.utilities.h;

public final class f
{

    private String a;
    private a b;

    public f(String s, Context context)
    {
        a = s;
        b = new a(context);
    }

    private static void b()
    {
        int i = 0;
        do
        {
            if (i >= n.aj.length)
            {
                return;
            }
            if (i == 1 || i == 9 || i == 11 || i == 12 || i == 13 || i == 15)
            {
                n.ak[i] = n.af.b(n.aj[i]);
            } else
            {
                n.ak[i] = n.aj[i];
            }
            i++;
        } while (true);
    }

    public final boolean a()
    {
        int k = n.ai.length;
        int i = 0;
          goto _L1
_L2:
        n.aj[15] = n.af.a(n.az);
        Object obj = new e(n.aj[10]);
        n.af = ((e) (obj));
        obj = ((e) (obj)).b(n.aj[9]);
        n.aj[16] = h.a((new h((new StringBuilder(String.valueOf(a))).append(((String) (obj))).toString().getBytes())).a());
        n.ae = new e(h.a((new h(a.getBytes())).a()));
        b();
        b.a(n.aj);
        b.b();
        return true;
_L3:
        if (i == 15)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1;
        int j;
        if (i >= 9)
        {
            j = i + 2;
        } else
        {
            j = i;
        }
        n.aj[i] = n.ai[j];
        i++;
        continue; /* Loop/switch isn't completed */
        obj1;
        ((d) (obj1)).printStackTrace();
        b.b();
        return false;
        obj1;
        b.b();
        throw obj1;
_L1:
        if (i < k) goto _L3; else goto _L2
    }
}
