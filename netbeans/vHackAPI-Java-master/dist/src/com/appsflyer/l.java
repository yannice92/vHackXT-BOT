// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer;

import android.content.Context;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

// Referenced classes of package com.appsflyer:
//            r, i, ab, b

abstract class l
    implements Runnable
{

    protected WeakReference a;
    final i b;
    private String c;
    private ScheduledExecutorService d;
    private AtomicInteger e;

    public l(i j, Context context, String s, ScheduledExecutorService scheduledexecutorservice)
    {
        b = j;
        super();
        a = null;
        e = new AtomicInteger(0);
        a = new WeakReference(context);
        c = s;
        d = scheduledexecutorservice;
    }

    protected abstract void a();

    protected abstract void a(int j);

    public abstract String b();

    public void run()
    {
        Object obj4;
        obj4 = null;
        if (c == null || c.length() == 0)
        {
            return;
        }
        e.incrementAndGet();
        Context context = (Context)a.get();
        if (context == null)
        {
            e.decrementAndGet();
            return;
        }
        Object obj1;
        long l1;
        l1 = System.currentTimeMillis();
        i j = b;
        j = b;
        obj1 = i.a(context, i.d(context));
        Object obj;
        obj = "";
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        obj = (new StringBuilder("-")).append(((String) (obj1))).toString();
        Object obj2;
        obj = (new StringBuilder()).append(b()).append(context.getPackageName()).append(((String) (obj))).append("?devkey=").append(c).append("&device_id=");
        obj1 = b;
        obj1 = ((StringBuilder) (obj)).append(i.a(context));
        ab.b((new StringBuilder("Calling server for attribution url: ")).append(((StringBuilder) (obj1)).toString()).toString());
        obj2 = (HttpURLConnection)(new URL(((StringBuilder) (obj1)).toString())).openConnection();
        obj = obj2;
        ((HttpURLConnection) (obj2)).setRequestMethod("GET");
        obj = obj2;
        ((HttpURLConnection) (obj2)).setConnectTimeout(10000);
        obj = obj2;
        ((HttpURLConnection) (obj2)).setRequestProperty("Connection", "close");
        obj = obj2;
        ((HttpURLConnection) (obj2)).connect();
        obj = obj2;
        if (((HttpURLConnection) (obj2)).getResponseCode() != 200) goto _L2; else goto _L1
_L1:
        obj = obj2;
        long l2 = System.currentTimeMillis();
        obj = obj2;
        obj1 = b;
        obj = obj2;
        i.a(context, "appsflyerGetConversionDataTiming", (l2 - l1) / 1000L);
        obj = obj2;
        StringBuilder stringbuilder = new StringBuilder();
        Object obj3 = new InputStreamReader(((HttpURLConnection) (obj2)).getInputStream());
        obj1 = new BufferedReader(((java.io.Reader) (obj3)));
_L5:
        obj = ((BufferedReader) (obj1)).readLine();
        if (obj == null) goto _L4; else goto _L3
_L3:
        stringbuilder.append(((String) (obj))).append('\n');
          goto _L5
        obj;
        obj4 = obj1;
        obj1 = obj;
_L18:
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_357;
        }
        obj = obj2;
        ((BufferedReader) (obj4)).close();
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_369;
        }
        obj = obj2;
        ((InputStreamReader) (obj3)).close();
        obj = obj2;
        i k;
        int i1;
        try
        {
            throw obj1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj1 = obj2;
        }
        finally
        {
            obj1 = obj;
        }
        obj2 = obj;
_L15:
        obj = obj1;
        if (i.c() == null)
        {
            break MISSING_BLOCK_LABEL_400;
        }
        obj = obj1;
        ((Throwable) (obj2)).getMessage();
        obj = obj1;
        a(0);
        obj = obj1;
        com.appsflyer.b.a(((Throwable) (obj2)).getMessage(), ((Throwable) (obj2)));
        e.decrementAndGet();
        if (obj1 != null)
        {
            ((HttpURLConnection) (obj1)).disconnect();
        }
_L12:
        d.shutdown();
        return;
_L4:
        obj = obj2;
        ((BufferedReader) (obj1)).close();
        obj = obj2;
        ((InputStreamReader) (obj3)).close();
        obj = obj2;
        ab.b((new StringBuilder("Attribution data: ")).append(stringbuilder.toString()).toString());
        obj = obj2;
        if (stringbuilder.length() <= 0 || context == null) goto _L7; else goto _L6
_L6:
        obj = obj2;
        obj1 = b;
        obj = obj2;
        obj3 = i.b(stringbuilder.toString());
        obj = obj2;
        obj1 = (String)((Map) (obj3)).get("iscache");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_558;
        }
        obj = obj2;
        if (!"false".equals(obj1))
        {
            break MISSING_BLOCK_LABEL_558;
        }
        obj = obj2;
        k = b;
        obj = obj2;
        i.a(context, "appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
        obj = obj2;
        obj3 = (new JSONObject(((Map) (obj3)))).toString();
        if (obj3 == null) goto _L9; else goto _L8
_L8:
        obj = obj2;
        k = b;
        obj = obj2;
        i.a(context, "attributionId", ((String) (obj3)));
_L13:
        obj = obj2;
        com.appsflyer.b.b((new StringBuilder("iscache=")).append(((String) (obj1))).append(" caching conversion data").toString());
        obj = obj2;
        if (i.c() == null) goto _L7; else goto _L10
_L10:
        obj = obj2;
        i1 = e.intValue();
        if (i1 > 1) goto _L7; else goto _L11
_L11:
        obj = obj2;
        obj1 = b;
        obj = obj2;
        i.e(context);
_L16:
        obj = obj2;
        a();
_L7:
        e.decrementAndGet();
        if (obj2 != null)
        {
            ((HttpURLConnection) (obj2)).disconnect();
        }
          goto _L12
_L9:
        obj = obj2;
        obj3 = b;
        obj = obj2;
        i.a(context, "attributionId", stringbuilder.toString());
          goto _L13
        obj = obj2;
_L14:
        e.decrementAndGet();
        if (obj1 != null)
        {
            ((HttpURLConnection) (obj1)).disconnect();
        }
        throw obj;
_L2:
        obj = obj2;
        if (i.c() == null)
        {
            break MISSING_BLOCK_LABEL_777;
        }
        obj = obj2;
        (new StringBuilder("Error connection to server: ")).append(((HttpURLConnection) (obj2)).getResponseCode()).toString();
        obj = obj2;
        a(((HttpURLConnection) (obj2)).getResponseCode());
        obj = obj2;
        ab.b((new StringBuilder("AttributionIdFetcher response code: ")).append(((HttpURLConnection) (obj2)).getResponseCode()).append("  url: ").append(obj1).toString());
          goto _L7
        obj;
        obj1 = null;
          goto _L14
        obj2;
        obj1 = null;
          goto _L15
        r r1;
        r1;
          goto _L16
        obj1;
        obj3 = null;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L18; else goto _L17
_L17:
    }
}
