// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.appsflyer:
//            b

public final class q
{

    private static q a = new q();
    private Map b;
    private boolean c;
    private boolean d;
    private String e;

    private q()
    {
        b = new HashMap();
    }

    public static q a()
    {
        return a;
    }

    public final String a(Context context)
    {
        String s = null;
        if (e != null)
        {
            s = e;
        } else
        {
            if (a("AF_REFERRER") != null)
            {
                return a("AF_REFERRER");
            }
            if (context != null)
            {
                return context.getSharedPreferences("appsflyer-data", 0).getString("referrer", null);
            }
        }
        return s;
    }

    public final String a(String s)
    {
        return (String)b.get(s);
    }

    public final void a(String s, String s1)
    {
        b.put(s, s1);
    }

    public final void a(String s, boolean flag)
    {
        b.put(s, Boolean.toString(flag));
    }

    protected final void b()
    {
        c = true;
    }

    public final void b(Context context)
    {
        String s = (new JSONObject(b)).toString();
        context = context.getSharedPreferences("appsflyer-data", 0).edit();
        context.putString("savedProperties", s);
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            context.apply();
            return;
        } else
        {
            context.commit();
            return;
        }
    }

    protected final void b(String s)
    {
        a("AF_REFERRER", s);
        e = s;
    }

    public final boolean b(String s, boolean flag)
    {
        s = a(s);
        if (s == null)
        {
            return flag;
        } else
        {
            return Boolean.valueOf(s).booleanValue();
        }
    }

    public final void c(Context context)
    {
        context = context.getSharedPreferences("appsflyer-data", 0).getString("savedProperties", null);
        if (context != null)
        {
            try
            {
                context = new JSONObject(context);
                Iterator iterator = context.keys();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    String s = (String)iterator.next();
                    if (b.get(s) == null)
                    {
                        b.put(s, context.getString(s));
                    }
                } while (true);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                com.appsflyer.b.a("Failed loading properties", context);
            }
        }
    }

    protected final boolean c()
    {
        return d;
    }

    protected final void d()
    {
        d = false;
    }

    protected final void e()
    {
        d = true;
    }

    public final void f()
    {
        a("shouldLog", false);
    }

    public final boolean g()
    {
        return b("shouldLog", true);
    }

    public final boolean h()
    {
        return b("disableLogs", false);
    }

    public final boolean i()
    {
        return b("disableOtherSdk", false);
    }

}
