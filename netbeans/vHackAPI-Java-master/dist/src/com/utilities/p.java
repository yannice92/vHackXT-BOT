// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.utilities;

import android.app.Activity;
import com.bca.mobile.n;

public final class p
{

    private static int a = 1;

    public static void a(int i)
    {
        a = i;
    }

    public static void a(Activity activity)
    {
        switch (a)
        {
        default:
            return;

        case 0: // '\0'
            activity.setTheme(0x7f0d01a6);
            n.aI = 17;
            return;

        case 1: // '\001'
            activity.setTheme(0x7f0d01a5);
            n.aI = 18;
            return;

        case 2: // '\002'
            activity.setTheme(0x7f0d01a7);
            n.aI = 20;
            return;

        case 3: // '\003'
            activity.setTheme(0x7f0d01a8);
            break;
        }
        n.aI = 22;
    }

}
