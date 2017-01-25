// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.c;

import android.content.Context;
import android.content.res.Resources;
import com.bca.mobile.n;
import com.c.a;
import com.utilities.e;
import com.utilities.f;
import com.utilities.r;
import java.io.IOException;
import java.io.InputStream;

public final class b
{

    private static a a;
    private static String b;

    public static int a(Context context)
    {
        a = new a(context);
        com.b.b.a(context);
        if (n.N == null) goto _L2; else goto _L1
_L1:
        boolean flag = n.N.equals("");
        if (!flag) goto _L3; else goto _L2
_L2:
        int i = 1;
_L5:
        if (i != 0)
        {
            a.b();
            return i;
        }
          goto _L4
_L3:
        String s;
        if (n.O == null || n.O.equals(""))
        {
            i = 2;
        } else
        {
            i = 0;
        }
        if (true) goto _L5; else goto _L4
_L4:
        s = f.a(context);
        b = s;
        if (s == null)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        if (i == 0)
        {
            a.b();
            return 3;
        }
        flag = b(context);
        if (!flag)
        {
            a.b();
            return 4;
        }
        context = a.a(false);
        if (context == null) goto _L7; else goto _L6
_L6:
        if (context.length == 1)
        {
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
          goto _L7
_L11:
        n.z = flag;
        a.b();
_L9:
        return 0;
        context;
        context.printStackTrace();
        a.b();
        if (true) goto _L9; else goto _L8
_L8:
        context;
        a.b();
        throw context;
_L7:
        flag = false;
        if (true) goto _L11; else goto _L10
_L10:
    }

    private static boolean b(Context context)
    {
        Context context1;
        Context context2;
        String as[];
        Object obj;
        obj = null;
        as = null;
        context2 = as;
        context1 = obj;
        n.ac = new e(b);
        context2 = as;
        context1 = obj;
        StringBuilder stringbuilder = new StringBuilder();
        context2 = as;
        context1 = obj;
        context = context.getResources().openRawResource(0x7f060000);
_L2:
        context2 = context;
        context1 = context;
        int i = context.read();
        if (i != -1)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        context2 = context;
        context1 = context;
        as = r.a(n.ac.b(stringbuilder.toString()), ":*:");
        context2 = context;
        context1 = context;
        n.T = n.ac.b(stringbuilder.toString());
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        context2 = context;
        context1 = context;
        i = as.length;
        if (i >= 15)
        {
            break MISSING_BLOCK_LABEL_181;
        }
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return false;
            }
        }
        return false;
        char c = (char)i;
        context2 = context;
        context1 = context;
        try
        {
            stringbuilder.append(c);
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context1 = context2;
        }
        finally
        {
            if (context1 != null)
            {
                try
                {
                    context1.close();
                }
                catch (IOException ioexception) { }
            }
            throw context;
        }
        context.printStackTrace();
        if (context2 != null)
        {
            try
            {
                context2.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return false;
            }
            return false;
        } else
        {
            break MISSING_BLOCK_LABEL_141;
        }
        context2 = context;
        context1 = context;
        n.C = as[2];
        context2 = context;
        context1 = context;
        n.D = as[3];
        context2 = context;
        context1 = context;
        n.E = as[4];
        context2 = context;
        context1 = context;
        n.F = as[5];
        context2 = context;
        context1 = context;
        n.G = as[6];
        context2 = context;
        context1 = context;
        n.H = as[7];
        context2 = context;
        context1 = context;
        n.I = as[8];
        context2 = context;
        context1 = context;
        n.J = as[9];
        context2 = context;
        context1 = context;
        n.K = as[10];
        context2 = context;
        context1 = context;
        n.L = as[11];
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        return true;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
