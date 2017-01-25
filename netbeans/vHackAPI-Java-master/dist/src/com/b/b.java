// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.bca.mobile.n;
import com.utilities.r;

public final class b
{

    public static int a(Context context)
    {
        int i;
        i = 1;
        context = (TelephonyManager)context.getSystemService("phone");
        if (context.getSimState() != 0) goto _L2; else goto _L1
_L1:
        i = 0;
_L4:
        n.N = r.b(context.getSubscriberId());
        n.O = r.b(context.getDeviceId());
        return i;
_L2:
        if (context.getSimState() != 1)
        {
            i = -1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
