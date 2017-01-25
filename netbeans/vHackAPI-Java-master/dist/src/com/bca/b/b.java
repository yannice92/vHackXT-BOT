// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.telephony.SmsManager;
import java.util.ArrayList;

// Referenced classes of package com.bca.b:
//            c, d, a

public final class b
{

    public static void a(Context context, String s, String s1, a a1)
    {
        int i = 0;
        PendingIntent pendingintent = PendingIntent.getBroadcast(context, 0, new Intent("SMS_SENT"), 0);
        PendingIntent pendingintent1 = PendingIntent.getBroadcast(context, 0, new Intent("SMS_DELIVERED"), 0);
        context.registerReceiver(new c(a1), new IntentFilter("SMS_SENT"));
        context.registerReceiver(new d(a1), new IntentFilter("SMS_DELIVERED"));
        context = SmsManager.getDefault();
        s1 = context.divideMessage(s1);
        a1 = new ArrayList();
        ArrayList arraylist = new ArrayList();
        int j = s1.size();
        do
        {
            if (i >= j)
            {
                context.sendMultipartTextMessage(s, null, s1, a1, arraylist);
                return;
            }
            a1.add(pendingintent);
            arraylist.add(pendingintent1);
            i++;
        } while (true);
    }
}
