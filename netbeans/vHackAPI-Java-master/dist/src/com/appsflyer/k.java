// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.iid.InstanceID;
import java.io.IOException;

// Referenced classes of package com.appsflyer:
//            y, b, q, i

final class k extends AsyncTask
{

    final Context a;
    final String b;
    final i c;

    k(i j, Context context, String s)
    {
        c = j;
        a = context;
        b = s;
        super();
    }

    private transient y a()
    {
        Object obj;
        Class.forName("com.google.android.gms.iid.InstanceID");
        Object obj2 = InstanceID.getInstance(a);
        obj = ((InstanceID) (obj2)).getToken(b, "GCM", null);
        obj2 = ((InstanceID) (obj2)).getId();
        obj = new y(System.currentTimeMillis(), ((String) (obj)), ((String) (obj2)));
        return ((y) (obj));
        Object obj1;
        obj1;
        com.appsflyer.b.a("Please integrate Google Play Services in order to support uninstall feature");
_L2:
        return null;
        obj1;
        com.appsflyer.b.a("Could not load registration ID");
        continue; /* Loop/switch isn't completed */
        obj1;
        com.appsflyer.b.a("Error registering for uninstall feature");
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (y)obj;
        if (obj != null)
        {
            Object obj1 = q.a().a("gcmToken");
            String s = q.a().a("gcmInstanceId");
            obj1 = new y(q.a().a("gcmTokenTimestamp"), ((String) (obj1)), s);
            if (((y) (obj1)).a(((y) (obj)).a(), ((y) (obj)).b(), ((y) (obj)).c()))
            {
                com.appsflyer.b.a((new StringBuilder("token=")).append(((y) (obj1)).b()).toString());
                com.appsflyer.b.a((new StringBuilder("instance id=")).append(((y) (obj1)).c()).toString());
                obj = c;
                i.a(((y) (obj1)), a);
            }
        }
    }
}
