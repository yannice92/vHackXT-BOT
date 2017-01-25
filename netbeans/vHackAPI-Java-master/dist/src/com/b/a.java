// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public final class a
{

    public static boolean a(Activity activity)
    {
        activity = (ConnectivityManager)activity.getApplicationContext().getSystemService("connectivity");
        if (activity != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if ((activity = activity.getAllNetworkInfo()) != null)
        {
            int i = 0;
            while (i < activity.length) 
            {
                if (activity[i].getState() == android.net.NetworkInfo.State.CONNECTED)
                {
                    return true;
                }
                i++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
