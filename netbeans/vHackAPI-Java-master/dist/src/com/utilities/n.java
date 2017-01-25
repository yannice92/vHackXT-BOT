// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.utilities;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.Random;

// Referenced classes of package com.utilities:
//            d, h

public final class n
{

    private static String a(long l, int i, String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        Random random = new Random(l);
        int j = 0;
        do
        {
            if (j >= i)
            {
                return stringbuilder.toString();
            }
            stringbuilder.append(s.charAt(random.nextInt(s.length())));
            j++;
        } while (true);
    }

    public static String a(Context context)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(a(Long.parseLong(d.a("ddHHmmssSS")), 3, "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        context = ((TelephonyManager)context.getSystemService("phone")).getDeviceId().substring(0, 11);
        stringbuilder.append(a(Long.parseLong((new StringBuilder(String.valueOf(d.a("SSS")))).append(context).toString(), 16), 4, "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        stringbuilder.append(a(Long.parseLong(d.a("SSS")), 1, "ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        return stringbuilder.toString();
    }

    public static String a(String s, String s1)
    {
        return h.a((new h((new StringBuilder(String.valueOf(s))).append(":-:").append(s1).toString().getBytes())).a()).substring(0, 8);
    }
}
