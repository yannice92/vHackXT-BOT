// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer;

import android.content.Context;
import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

// Referenced classes of package com.appsflyer:
//            ab, b

public final class s extends AsyncTask
{

    public Map a;
    private String b;
    private boolean c;
    private String d;
    private Context e;

    public s(Context context)
    {
        b = null;
        c = false;
        e = context;
    }

    private transient String a(String as[])
    {
        as = new URL(as[0]);
        ab.b((new StringBuilder("call = ")).append(as).append(" parameters = ").append(a.toString()).toString());
        as = (HttpsURLConnection)as.openConnection();
        as.setReadTimeout(30000);
        as.setConnectTimeout(30000);
        as.setRequestMethod("POST");
        as.setDoInput(true);
        as.setDoOutput(true);
        as.setRequestProperty("Content-Type", "application/json");
        OutputStream outputstream = as.getOutputStream();
        BufferedWriter bufferedwriter = new BufferedWriter(new OutputStreamWriter(outputstream, "UTF-8"));
        bufferedwriter.write(d);
        bufferedwriter.flush();
        bufferedwriter.close();
        outputstream.close();
        as.connect();
        if (as.getResponseCode() != 200) goto _L2; else goto _L1
_L1:
        as = new BufferedReader(new InputStreamReader(as.getInputStream()));
_L5:
        String s1 = as.readLine();
        if (s1 == null) goto _L4; else goto _L3
_L3:
        b = (new StringBuilder()).append(b).append(s1).toString();
          goto _L5
_L2:
        return b;
_L4:
        try
        {
            com.appsflyer.b.a("Status 200 ok");
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            com.appsflyer.b.a((new StringBuilder("MalformedURLException: ")).append(as.toString()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            com.appsflyer.b.a((new StringBuilder("ProtocolException: ")).append(as.toString()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            com.appsflyer.b.a((new StringBuilder("IOException: ")).append(as.toString()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            com.appsflyer.b.a((new StringBuilder("Exception: ")).append(as.toString()).toString());
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected final void onCancelled()
    {
    }

    protected final void onPostExecute(Object obj)
    {
        if (c)
        {
            com.appsflyer.b.a("Connection error");
            return;
        } else
        {
            com.appsflyer.b.a("Connection call succeeded");
            return;
        }
    }

    protected final void onPreExecute()
    {
        d = (new JSONObject(a)).toString();
    }
}
