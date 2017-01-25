// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.utilities;

import android.content.Context;
import android.content.res.Resources;

// Referenced classes of package com.utilities:
//            h, o

public final class f
{

    private static String a[] = null;

    public static String a(Context context)
    {
        if (a == null)
        {
            b(context);
        }
        return a[0];
    }

    public static String a(Context context, String s)
    {
        if (a == null)
        {
            b(context);
        }
        char c = s.toUpperCase().charAt(7);
        if (c >= 'A' && c <= 'H')
        {
            return a[1];
        }
        if (c >= 'I' && c <= 'Q')
        {
            return a[2];
        }
        if (c >= 'R' && c <= 'Z')
        {
            return a[3];
        } else
        {
            return "";
        }
    }

    public static String a(String s, String s1)
    {
        return h.a((new h((new StringBuilder(String.valueOf(s))).append(s1).toString().getBytes())).a());
    }

    private static void b(Context context)
    {
        context = o.a(context.getResources().openRawResource(0x7f020086));
        if (context == null || context.equals(""))
        {
            a = null;
            return;
        } else
        {
            a = context.split(":-:", -1);
            return;
        }
    }

}
