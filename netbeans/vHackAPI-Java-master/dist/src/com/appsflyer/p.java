// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.a.a;
import com.appsflyer.a.b;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.appsflyer:
//            q, i, b, z

final class p
    implements Runnable
{

    Map a;
    boolean b;
    final i c;
    private String d;
    private WeakReference e;

    private p(i j, String s, Map map, Context context, boolean flag)
    {
        c = j;
        super();
        e = null;
        d = s;
        a = map;
        e = new WeakReference(context);
        b = flag;
    }

    p(i j, String s, Map map, Context context, boolean flag, byte byte0)
    {
        this(j, s, map, context, flag);
    }

    public final void run()
    {
        boolean flag1 = true;
        Object obj = (Context)e.get();
        if (obj == null) goto _L2; else goto _L1
_L1:
        Object obj1 = com.appsflyer.q.a().a(((Context) (obj)));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        if (((String) (obj1)).length() > 0 && a.get("referrer") == null)
        {
            a.put("referrer", obj1);
        }
        boolean flag2;
        flag2 = "true".equals(((Context) (obj)).getSharedPreferences("appsflyer-data", 0).getString("sentSuccessfully", ""));
        obj1 = (String)a.get("eventName");
        i j = c;
        IOException ioexception;
        Object obj2;
        Object obj3;
        WeakReference weakreference;
        int k;
        boolean flag;
        if (obj1 == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = com.appsflyer.i.a(((Context) (obj)), "appsFlyerCount", flag);
        a.put("counter", Integer.toString(k));
        obj2 = a;
        obj3 = c;
        if (obj1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((Map) (obj2)).put("iaecounter", Integer.toString(com.appsflyer.i.a(((Context) (obj)), "appsFlyerInAppEventCount", flag)));
        obj1 = a;
        obj2 = c;
        ((Map) (obj1)).put("timepassedsincelastlaunch", Long.toString(i.c(((Context) (obj)))));
        if (!b || k != 1) goto _L4; else goto _L3
_L3:
        com.appsflyer.q.a().e();
          goto _L4
_L7:
        obj = a;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((Map) (obj)).put("isFirstCall", Boolean.toString(flag));
        obj1 = (String)a.get("appsflyerKey");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_280;
        }
        if (((String) (obj1)).length() != 0)
        {
            break MISSING_BLOCK_LABEL_286;
        }
        com.appsflyer.b.b("Not sending data yet, waiting for dev key");
        return;
        new z();
        obj3 = a;
        obj = (String)((Map) (obj3)).get("appsflyerKey");
        obj2 = (String)((Map) (obj3)).get("af_timestamp");
        obj3 = (String)((Map) (obj3)).get("uid");
        obj = com.appsflyer.z.a((new StringBuilder()).append(((String) (obj)).substring(0, 7)).append(((String) (obj3)).substring(0, 7)).append(((String) (obj2)).substring(((String) (obj2)).length() - 7)).toString());
        a.put("af_v", obj);
        obj = (new JSONObject(a)).toString();
        obj2 = c;
        obj3 = d;
        weakreference = e;
        if (b && i.c() != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        com.appsflyer.i.a(((i) (obj2)), ((String) (obj3)), ((String) (obj)), ((String) (obj1)), weakreference, null, flag);
        return;
        ioexception;
_L5:
        if (obj != null && e != null && !d.contains("&isCachedRequest=true&timeincache="))
        {
            com.appsflyer.a.a.a();
            com.appsflyer.a.a.a(new b(d, ((String) (obj)), com.appsflyer.i.b), (Context)e.get());
            com.appsflyer.b.a(ioexception.getMessage(), ioexception);
            return;
        } else
        {
            return;
        }
        obj;
        com.appsflyer.b.a(((Throwable) (obj)).getMessage(), ((Throwable) (obj)));
        return;
        ioexception;
        obj = null;
          goto _L5
_L2:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L4:
        flag = flag2;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
