// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer;

import android.app.Activity;
import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.telephony.TelephonyManager;
import com.appsflyer.a.a;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailability;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.appsflyer:
//            b, aa, q, n, 
//            c, d, a, p, 
//            z, ab, y, s, 
//            t, r, o, m, 
//            k, v, j, g, 
//            h, x

public final class i
{

    public static final String a = "4.6.0".substring(0, "4.6.0".indexOf("."));
    public static final String b = "4.6.0".substring("4.6.0".indexOf(".") + 1);
    public static final String c = (new StringBuilder("AppsFlyer_")).append(b).toString();
    public static final String d = (new StringBuilder("https://t.appsflyer.com/api/v")).append(a).append("/androidevent?buildnumber=").append(b).append("&app_id=").toString();
    public static final String e = (new StringBuilder("https://events.appsflyer.com/api/v")).append(a).append("/androidevent?buildnumber=").append(b).append("&app_id=").toString();
    private static final String g = (new StringBuilder("https://register.appsflyer.com/api/v")).append(a).append("/androidevent?buildnumber=").append(b).append("&app_id=").toString();
    private static final List h = Arrays.asList(new String[] {
        "is_cache"
    });
    private static String i;
    private static String j;
    private static g k = null;
    private static h l = null;
    private static boolean m = false;
    private static long n;
    private static ScheduledExecutorService o = null;
    private static long p;
    private static i q = new i();
    Uri f;
    private x r;
    private long s;
    private boolean t;
    private String u;

    private i()
    {
        f = null;
        t = false;
    }

    static int a(Context context, String s1, boolean flag)
    {
        return b(context, s1, flag);
    }

    static long a(long l1)
    {
        p = l1;
        return l1;
    }

    public static i a()
    {
        return q;
    }

    private static String a(ContentResolver contentresolver)
    {
        ContentResolver contentresolver1;
        Cursor cursor;
        contentresolver1 = null;
        cursor = contentresolver.query(Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider"), new String[] {
            "aid"
        }, null, null, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        boolean flag = cursor.moveToFirst();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        contentresolver = contentresolver1;
        if (cursor != null)
        {
            try
            {
                cursor.close();
            }
            // Misplaced declaration of an exception variable
            catch (ContentResolver contentresolver)
            {
                return null;
            }
            contentresolver = contentresolver1;
        }
        return contentresolver;
        contentresolver = cursor.getString(cursor.getColumnIndex("aid"));
        contentresolver1 = contentresolver;
        contentresolver = contentresolver1;
        if (cursor != null)
        {
            try
            {
                cursor.close();
            }
            // Misplaced declaration of an exception variable
            catch (ContentResolver contentresolver)
            {
                return contentresolver1;
            }
            return contentresolver1;
        }
        break MISSING_BLOCK_LABEL_53;
        contentresolver;
        com.appsflyer.b.c((new StringBuilder("Could not collect cursor attribution")).append(contentresolver).toString());
        contentresolver = contentresolver1;
        if (cursor != null)
        {
            try
            {
                cursor.close();
            }
            // Misplaced declaration of an exception variable
            catch (ContentResolver contentresolver)
            {
                return null;
            }
            return null;
        } else
        {
            break MISSING_BLOCK_LABEL_53;
        }
        contentresolver;
        if (cursor != null)
        {
            try
            {
                cursor.close();
            }
            catch (Exception exception) { }
        }
        throw contentresolver;
    }

    public static String a(Context context)
    {
        return com.appsflyer.aa.a(context);
    }

    static String a(Context context, String s1)
    {
        return d(context, s1);
    }

    public static String a(String s1)
    {
        return com.appsflyer.q.a().a(s1);
    }

    static void a(Context context, String s1, int i1)
    {
        b(context, s1, i1);
    }

    static void a(Context context, String s1, long l1)
    {
        b(context, s1, l1);
    }

    static void a(Context context, String s1, String s2)
    {
        b(context, s1, s2);
    }

    private static void a(Context context, String s1, String s2, String s3)
    {
        if (com.appsflyer.q.a().b("shouldMonitor", false))
        {
            Intent intent = new Intent("com.appsflyer.MonitorBroadcast");
            intent.setPackage("com.appsflyer.nightvision");
            intent.putExtra("message", s2);
            intent.putExtra("value", s3);
            intent.putExtra("packageName", "true");
            intent.putExtra("pid", new Integer(Process.myPid()));
            intent.putExtra("eventIdentifier", s1);
            intent.putExtra("sdk", (new StringBuilder()).append(a).append('.').append(b).toString());
            context.sendBroadcast(intent);
        }
    }

    private void a(Context context, String s1, String s2, String s3, boolean flag)
    {
        ScheduledExecutorService scheduledexecutorservice = Executors.newSingleThreadScheduledExecutor();
        scheduledexecutorservice.schedule(new n(this, context, s1, s2, s3, flag, scheduledexecutorservice, (byte)0), 5L, TimeUnit.MILLISECONDS);
    }

    private static void a(Context context, HashMap hashmap)
    {
        Intent intent = new Intent("com.appsflyer.testIntgrationBroadcast");
        intent.putExtra("params", hashmap);
        context.sendBroadcast(intent);
    }

    private static void a(Context context, Map map)
    {
        Object obj2;
        boolean flag1;
        boolean flag2;
        obj2 = null;
        flag1 = true;
        flag2 = true;
        com.appsflyer.b.a("Trying to fetch GAID..");
        Object obj;
        Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
        obj = AdvertisingIdClient.getAdvertisingIdInfo(context);
        if (obj == null) goto _L2; else goto _L1
_L1:
        Object obj1 = ((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) (obj)).getId();
        int i1;
        boolean flag;
        if (!((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) (obj)).isLimitAdTrackingEnabled())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = Boolean.toString(flag);
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        if (((String) (obj1)).length() != 0) goto _L5; else goto _L4
_L4:
        flag = true;
        context = "emptyOrNull";
        i1 = -1;
_L10:
        if (context != null)
        {
            map.put("gaidError", (new StringBuilder()).append(i1).append(": ").append(context).toString());
        }
        if (obj1 != null && obj != null)
        {
            map.put("advertiserId", obj1);
            map.put("advertiserIdEnabled", obj);
            com.appsflyer.q.a().a("advertiserId", ((String) (obj1)));
            com.appsflyer.q.a().a("advertiserIdEnabled", ((String) (obj)));
            map.put("isGaidWithGps", String.valueOf(flag));
        }
        return;
_L2:
        obj1 = null;
        obj = null;
        context = "gpsAdInfo-null";
        flag = false;
_L8:
        i1 = -1;
        continue; /* Loop/switch isn't completed */
        obj2;
        flag = false;
        obj1 = null;
        obj = null;
_L6:
        Object obj3;
        try
        {
            i1 = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        }
        catch (Throwable throwable1)
        {
            i1 = -1;
        }
        obj2 = obj2.getClass().getSimpleName();
        com.appsflyer.b.a("WARNING: Google Play Services is missing.");
        if (!com.appsflyer.q.a().b("enableGpsFallback", true))
        {
            break MISSING_BLOCK_LABEL_473;
        }
        try
        {
            obj3 = com.appsflyer.c.a(context);
        }
        catch (Throwable throwable)
        {
            obj2 = (new StringBuilder()).append(((String) (obj2))).append("/").append(throwable.getClass().getSimpleName()).toString();
            a("GAID", (new StringBuilder("\tgot error: ")).append(throwable.getMessage()).toString(), context);
            obj1 = com.appsflyer.q.a().a("advertiserId");
            obj = com.appsflyer.q.a().a("advertiserIdEnabled");
            if (throwable.getLocalizedMessage() != null)
            {
                com.appsflyer.b.a(throwable.getLocalizedMessage());
            } else
            {
                com.appsflyer.b.a(throwable.toString());
            }
            a("Could not fetch advertiser id: ", throwable.getLocalizedMessage(), context);
            context = ((Context) (obj2));
            continue; /* Loop/switch isn't completed */
        }
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_293;
        }
        obj1 = ((d) (obj3)).a();
        if (((d) (obj3)).b())
        {
            flag1 = false;
        }
        obj = Boolean.toString(flag1);
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((String) (obj1)).length() == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_467;
        obj2 = "gpsAdInfo-null (bypass)";
        context = ((Context) (obj1));
        obj1 = obj;
        obj = context;
        context = ((Context) (obj2));
        continue; /* Loop/switch isn't completed */
        obj2;
        flag = false;
        obj = obj1;
        obj1 = null;
          goto _L6
        obj2;
        flag = true;
        throwable = ((Throwable) (obj1));
        obj1 = obj;
        obj = throwable;
          goto _L6
        context = ((Context) (obj2));
        continue; /* Loop/switch isn't completed */
        context = ((Context) (obj2));
        obj2 = obj;
        obj = obj1;
        obj1 = obj2;
        continue; /* Loop/switch isn't completed */
_L5:
        context = ((Context) (obj2));
        flag = flag2;
        if (true) goto _L8; else goto _L7
_L7:
        context = "emptyOrNull (bypass)";
        if (true) goto _L10; else goto _L9
_L9:
    }

    private void a(Context context, Map map, Uri uri)
    {
        map.put("af_deeplink", uri.toString());
        if (uri.getQueryParameter("af_deeplink") != null)
        {
            map = uri.getQueryParameter("media_source");
            Object obj = uri.getQueryParameter("is_retargeting");
            if (map != null && obj != null && map.equals("AppsFlyer_Test") && ((String) (obj)).equals("true"))
            {
                t = true;
            }
            obj = b(context, uri.getQuery().toString());
            if (uri.getPath() != null)
            {
                ((Map) (obj)).put("path", uri.getPath());
            }
            if (uri.getScheme() != null)
            {
                ((Map) (obj)).put("scheme", uri.getScheme());
            }
            map = ((Map) (obj));
            if (uri.getHost() != null)
            {
                ((Map) (obj)).put("host", uri.getHost());
                map = ((Map) (obj));
            }
        } else
        {
            map = new HashMap();
            map.put("link", uri.toString());
        }
        b(context, "deeplinkAttribution", (new JSONObject(map)).toString());
        if (k != null)
        {
            context = k;
        }
    }

    private static void a(android.content.SharedPreferences.Editor editor)
    {
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            editor.apply();
            return;
        } else
        {
            editor.commit();
            return;
        }
    }

    static void a(i i1, Context context, String s1, String s2, String s3, String s4, boolean flag)
    {
        Object obj;
        com.appsflyer.q.a().b(context);
        com.appsflyer.b.a((new StringBuilder("AsendTrackingWithEvent from activity: ")).append(context.getClass().getName().toString()).toString());
        Object obj1;
        HashMap hashmap;
        StringBuilder stringbuilder;
        String s5;
        JSONObject jsonobject;
        int j1;
        long l1;
        long l2;
        boolean flag2;
        if (s2 == null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        hashmap = new HashMap();
        a(context, ((Map) (hashmap)));
        hashmap.put("af_timestamp", Long.toString((new Date()).getTime()));
        try
        {
            a("collect data for server", "", context);
            obj1 = new StringBuilder("******* sendTrackingWithEvent: ");
        }
        // Misplaced declaration of an exception variable
        catch (i i1)
        {
            com.appsflyer.b.a(i1.getLocalizedMessage(), i1);
            return;
        }
        if (flag2)
        {
            obj = "Launch";
        } else
        {
            obj = s2;
        }
        com.appsflyer.b.a(((StringBuilder) (obj1)).append(((String) (obj))).toString());
        if (flag2)
        {
            obj = "Launch";
        } else
        {
            obj = s2;
        }
        a("********* sendTrackingWithEvent: ", ((String) (obj)), context);
        obj1 = c;
        if (flag2)
        {
            obj = "Launch";
        } else
        {
            obj = s2;
        }
        a(context, ((String) (obj1)), "EVENT_CREATED_WITH_NAME", ((String) (obj)));
        com.appsflyer.a.a.a();
        com.appsflyer.a.a.a(context);
        try
        {
            obj = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
            if (!((List) (obj)).contains("android.permission.INTERNET"))
            {
                com.appsflyer.b.c("Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                a(context, null, "PERMISSION_INTERNET_MISSING", null);
            }
            if (!((List) (obj)).contains("android.permission.ACCESS_NETWORK_STATE"))
            {
                com.appsflyer.b.c("Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
            }
            if (!((List) (obj)).contains("android.permission.ACCESS_WIFI_STATE"))
            {
                com.appsflyer.b.c("Permission android.permission.ACCESS_WIFI_STATE is missing in the AndroidManifest.xml");
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        stringbuilder = new StringBuilder();
        if (!flag2) goto _L2; else goto _L1
_L1:
        obj = d;
_L46:
        stringbuilder.append(((String) (obj))).append(context.getPackageName());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_321;
        }
        hashmap.put("af_events_api", "1");
        hashmap.put("brand", Build.BRAND);
        hashmap.put("device", Build.DEVICE);
        hashmap.put("product", Build.PRODUCT);
        hashmap.put("sdk", Integer.toString(android.os.Build.VERSION.SDK_INT));
        hashmap.put("model", Build.MODEL);
        hashmap.put("deviceType", Build.TYPE);
        if (!flag2) goto _L4; else goto _L3
_L3:
        if (!j(context)) goto _L6; else goto _L5
_L5:
        if (!com.appsflyer.q.a().i())
        {
            hashmap.put("af_sdks", (new StringBuilder()).append(d("com.tune.Tune")).append(d("com.adjust.sdk.Adjust")).append(d("com.kochava.android.tracker.Feature")).append(d("io.branch.referral.Branch")).append(d("com.apsalar.sdk.Apsalar")).append(d("com.localytics.android.Localytics")).append(d("com.tenjin.android.TenjinSDK")).append(d("com.talkingdata.sdk.TalkingDataSDK")).append(d("it.partytrack.sdk.Track")).append(d("jp.appAdForce.android.LtvManager")).toString());
            hashmap.put("batteryLevel", String.valueOf(n(context)));
        }
        if (android.os.Build.VERSION.SDK_INT < 18) goto _L6; else goto _L7
_L7:
        obj = new com.appsflyer.a(context);
        if (((com.appsflyer.a) (obj)).b()) goto _L9; else goto _L8
_L8:
        ((com.appsflyer.a) (obj)).(com.appsflyer.aa.a(context));
        a("KSAppsFlyerId", ((com.appsflyer.a) (obj)).c());
        a("KSAppsFlyerRICounter", String.valueOf(((com.appsflyer.a) (obj)).d()));
_L6:
        obj = com.appsflyer.q.a().a("KSAppsFlyerId");
        obj1 = com.appsflyer.q.a().a("KSAppsFlyerRICounter");
        if (obj == null || obj1 == null)
        {
            break MISSING_BLOCK_LABEL_686;
        }
        if (Integer.valueOf(((String) (obj1))).intValue() > 0)
        {
            hashmap.put("reinstallCounter", obj1);
            hashmap.put("originalAppsflyerId", obj);
        }
        obj = com.appsflyer.q.a().a("additionalCustomData");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_715;
        }
        hashmap.put("customData", obj);
        obj = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_746;
        }
        try
        {
            hashmap.put("installer_package", obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        obj = com.appsflyer.q.a().a("sdkExtension");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_783;
        }
        if (((String) (obj)).length() > 0)
        {
            hashmap.put("sdkExtension", obj);
        }
        obj = l(context);
        obj1 = d(context, ((String) (obj)));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_815;
        }
        hashmap.put("channel", obj1);
        if (obj1 == null) goto _L11; else goto _L10
_L10:
        if (!((String) (obj1)).equals(obj)) goto _L12; else goto _L11
_L12:
        hashmap.put("af_latestchannel", obj);
_L88:
        obj = context.getSharedPreferences("appsflyer-data", 0);
        if (!((SharedPreferences) (obj)).contains("INSTALL_STORE")) goto _L14; else goto _L13
_L13:
        obj = ((SharedPreferences) (obj)).getString("INSTALL_STORE", null);
_L49:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_903;
        }
        hashmap.put("af_installstore", ((String) (obj)).toLowerCase());
        obj1 = context.getSharedPreferences("appsflyer-data", 0);
        obj = null;
        if (!((SharedPreferences) (obj1)).contains("preInstallName")) goto _L16; else goto _L15
_L15:
        obj1 = ((SharedPreferences) (obj1)).getString("preInstallName", null);
_L51:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_963;
        }
        hashmap.put("af_preinstall_name", ((String) (obj1)).toLowerCase());
        obj = c(context, "AF_STORE");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_993;
        }
        hashmap.put("af_currentstore", ((String) (obj)).toLowerCase());
        if (s1 == null) goto _L18; else goto _L17
_L17:
        if (s1.length() < 0) goto _L18; else goto _L19
_L19:
        hashmap.put("appsflyerKey", s1);
_L53:
        s1 = com.appsflyer.q.a().a("AppUserId");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_1042;
        }
        hashmap.put("appUserId", s1);
        s1 = com.appsflyer.q.a().a("userEmails");
        if (s1 == null) goto _L21; else goto _L20
_L20:
        hashmap.put("user_emails", s1);
_L55:
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_1102;
        }
        hashmap.put("eventName", s2);
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_1102;
        }
        hashmap.put("eventValue", s3);
        if (com.appsflyer.q.a().a("appid") != null)
        {
            hashmap.put("appid", com.appsflyer.q.a().a("appid"));
        }
        s1 = com.appsflyer.q.a().a("currencyCode");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_1194;
        }
        if (s1.length() != 3)
        {
            com.appsflyer.b.c((new StringBuilder("WARNING: currency code should be 3 characters!!! '")).append(s1).append("' is not a legal value.").toString());
        }
        hashmap.put("currency", s1);
        s1 = com.appsflyer.q.a().a("IS_UPDATE");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_1220;
        }
        hashmap.put("isUpdate", s1);
        hashmap.put("af_preinstalled", Boolean.toString(m(context)));
        if (!com.appsflyer.q.a().b("collectFacebookAttrId", true))
        {
            break MISSING_BLOCK_LABEL_1275;
        }
        s1 = a(context.getContentResolver());
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_1275;
        }
        hashmap.put("fb", s1);
        if (!com.appsflyer.q.a().b("deviceTrackingDisabled", false)) goto _L23; else goto _L22
_L22:
        hashmap.put("deviceTrackingDisabled", "true");
_L72:
        s1 = com.appsflyer.aa.a(context);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_1322;
        }
        hashmap.put("uid", s1);
_L80:
        try
        {
            hashmap.put("lang", Locale.getDefault().getDisplayLanguage());
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        try
        {
            hashmap.put("lang_code", Locale.getDefault().getLanguage());
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        try
        {
            hashmap.put("country", Locale.getDefault().getCountry());
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        try
        {
            s1 = (TelephonyManager)context.getSystemService("phone");
            hashmap.put("operator", s1.getSimOperatorName());
            hashmap.put("carrier", s1.getNetworkOperatorName());
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        s1 = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (s1 == null) goto _L25; else goto _L24
_L24:
        if (s1.getType() != 1) goto _L27; else goto _L26
_L26:
        s1 = "WIFI";
_L82:
        hashmap.put("network", s1);
_L83:
        if (!com.appsflyer.q.a().b("collectFingerPrint", true))
        {
            break MISSING_BLOCK_LABEL_1489;
        }
        s1 = g();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_1489;
        }
        hashmap.put("deviceFingerPrintId", s1);
        Class.forName("com.unity3d.player.UnityPlayer");
        hashmap.put("platformextension", "android_unity");
_L84:
        s3 = new SimpleDateFormat("yyyy-MM-dd_HHmmZ", Locale.US);
        j1 = android.os.Build.VERSION.SDK_INT;
        if (j1 < 9)
        {
            break MISSING_BLOCK_LABEL_1575;
        }
        try
        {
            hashmap.put("installDate", s3.format(new Date(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime)));
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        s1 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        j1 = context.getSharedPreferences("appsflyer-data", 0).getInt("versionCode", 0);
        if (((PackageInfo) (s1)).versionCode > j1)
        {
            b(context, "appsflyerConversionDataRequestRetries", 0);
            b(context, "versionCode", ((PackageInfo) (s1)).versionCode);
        }
        hashmap.put("app_version_code", Integer.toString(((PackageInfo) (s1)).versionCode));
        hashmap.put("app_version_name", ((PackageInfo) (s1)).versionName);
        if (android.os.Build.VERSION.SDK_INT < 9) goto _L29; else goto _L28
_L28:
        l1 = ((PackageInfo) (s1)).firstInstallTime;
        l2 = ((PackageInfo) (s1)).lastUpdateTime;
        hashmap.put("date1", s3.format(new Date(l1)));
        hashmap.put("date2", s3.format(new Date(l2)));
        s2 = context.getSharedPreferences("appsflyer-data", 0).getString("appsFlyerFirstInstall", null);
        s1 = s2;
        if (s2 != null) goto _L31; else goto _L30
_L30:
        if (!j(context)) goto _L33; else goto _L32
_L32:
        com.appsflyer.b.b("AppsFlyer: first launch detected");
        s1 = s3.format(new Date());
_L85:
        b(context, "appsFlyerFirstInstall", s1);
_L31:
        com.appsflyer.b.a((new StringBuilder("AppsFlyer: first launch date: ")).append(s1).toString());
        hashmap.put("firstLaunchDate", s1);
_L29:
        if (s4.length() > 0)
        {
            hashmap.put("referrer", s4);
        }
        s1 = context.getSharedPreferences("appsflyer-data", 0).getString("attributionId", null);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_1890;
        }
        if (s1.length() > 0)
        {
            hashmap.put("installAttribution", s1);
        }
        s1 = com.appsflyer.q.a().a("gcmInstanceId");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_1916;
        }
        hashmap.put("af_google_instance_id", s1);
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_1970;
        }
        if (i1.u != null)
        {
            s1 = new JSONObject(i1.u);
            s1.put("isPush", "true");
            hashmap.put("af_deeplink", s1.toString());
        }
        i1.u = null;
        if (!flag2) goto _L35; else goto _L34
_L34:
        if (!(context instanceof Activity)) goto _L35; else goto _L36
_L36:
        s1 = ((Activity)context).getIntent();
        if (s1 == null) goto _L38; else goto _L37
_L37:
        if (!"android.intent.action.VIEW".equals(s1.getAction())) goto _L38; else goto _L39
_L39:
        s1 = s1.getData();
_L87:
        if (s1 == null) goto _L41; else goto _L40
_L40:
        i1.a(context, ((Map) (hashmap)), ((Uri) (s1)));
_L35:
        if (i1.t)
        {
            hashmap.put("testAppMode_retargeting", "true");
            a(context, (HashMap)hashmap);
            com.appsflyer.b.a("Sent retargeting params to test app");
        }
        if (System.currentTimeMillis() - i1.s > 30000L || s4 == null)
        {
            break MISSING_BLOCK_LABEL_3210;
        }
        if (!s4.contains("AppsFlyer_Test"))
        {
            break MISSING_BLOCK_LABEL_3210;
        }
        for (boolean flag1 = true; !flag1; flag1 = false)
        {
            break MISSING_BLOCK_LABEL_2137;
        }

        hashmap.put("testAppMode", "true");
        a(context, (HashMap)hashmap);
        com.appsflyer.b.a("Sent params to test app");
        com.appsflyer.b.a("Test mode ended!");
        i1.s = 0L;
        if (com.appsflyer.q.a().a("advertiserId") != null) goto _L43; else goto _L42
_L42:
        a(context, ((Map) (hashmap)));
        if (com.appsflyer.q.a().a("advertiserId") == null) goto _L45; else goto _L44
_L44:
        hashmap.put("GAID_retry", "true");
_L43:
        com.appsflyer.b.a("AppsFlyerLib.sendTrackingWithEvent");
        (new p(i1, stringbuilder.toString(), hashmap, context.getApplicationContext(), flag2, (byte)0)).run();
        return;
_L2:
        obj = e;
          goto _L46
_L9:
        ((com.appsflyer.a) (obj)).();
        a("KSAppsFlyerId", ((com.appsflyer.a) (obj)).c());
        a("KSAppsFlyerRICounter", String.valueOf(((com.appsflyer.a) (obj)).d()));
          goto _L6
_L4:
        obj = context.getSharedPreferences("appsflyer-data", 0);
        obj1 = ((SharedPreferences) (obj)).edit();
        s5 = ((SharedPreferences) (obj)).getString("prev_event_name", null);
        if (s5 == null)
        {
            break MISSING_BLOCK_LABEL_2391;
        }
        jsonobject = new JSONObject();
        jsonobject.put("prev_event_timestamp", (new StringBuilder()).append(((SharedPreferences) (obj)).getLong("prev_event_timestamp", -1L)).toString());
        jsonobject.put("prev_event_value", ((SharedPreferences) (obj)).getString("prev_event_value", null));
        jsonobject.put("prev_event_name", s5);
        hashmap.put("prev_event", jsonobject.toString());
        ((android.content.SharedPreferences.Editor) (obj1)).putString("prev_event_name", s2);
        ((android.content.SharedPreferences.Editor) (obj1)).putString("prev_event_value", s3);
        ((android.content.SharedPreferences.Editor) (obj1)).putLong("prev_event_timestamp", System.currentTimeMillis());
        a(((android.content.SharedPreferences.Editor) (obj1)));
          goto _L6
        obj;
        com.appsflyer.b.a("Error while processing previous event.", ((Throwable) (obj)));
          goto _L6
_L14:
        if (!j(context)) goto _L48; else goto _L47
_L47:
        obj = c(context, "AF_STORE");
_L89:
        b(context, "INSTALL_STORE", ((String) (obj)));
          goto _L49
_L16:
        if (!j(context))
        {
            break MISSING_BLOCK_LABEL_2497;
        }
        obj = k(context);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_2522;
        }
_L52:
        obj1 = obj;
        if (obj == null) goto _L51; else goto _L50
_L50:
        b(context, "preInstallName", ((String) (obj)));
        obj1 = obj;
          goto _L51
        obj = c(context, "AF_PRE_INSTALL_NAME");
          goto _L52
_L18:
        s1 = com.appsflyer.q.a().a("AppsFlyerKey");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_2570;
        }
        if (s1.length() < 0)
        {
            break MISSING_BLOCK_LABEL_2570;
        }
        hashmap.put("appsflyerKey", s1);
          goto _L53
        com.appsflyer.b.a("AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ");
        a(context, c, "DEV_KEY_MISSING", null);
        com.appsflyer.b.a("AppsFlyer will not track this event.");
        return;
_L21:
        s1 = com.appsflyer.q.a().a("userEmail");
        if (s1 == null) goto _L55; else goto _L54
_L54:
        hashmap.put("sha1_el", com.appsflyer.z.a(s1));
          goto _L55
_L23:
        obj = context.getSharedPreferences("appsflyer-data", 0);
        flag = com.appsflyer.q.a().b("collectIMEI", true);
        s2 = ((SharedPreferences) (obj)).getString("imeiCached", null);
        s1 = null;
        if (!flag) goto _L57; else goto _L56
_L56:
        flag = i(context);
        if (!flag) goto _L59; else goto _L58
_L58:
        s3 = (TelephonyManager)context.getSystemService("phone");
        s3 = (String)s3.getClass().getMethod("getDeviceId", new Class[0]).invoke(s3, new Object[0]);
        if (s3 == null) goto _L61; else goto _L60
_L60:
        s1 = s3;
_L73:
        if (s1 == null) goto _L63; else goto _L62
_L62:
        b(context, "imeiCached", s1);
        hashmap.put("imei", s1);
_L76:
        flag = com.appsflyer.q.a().b("collectAndroidId", true);
        s2 = ((SharedPreferences) (obj)).getString("androidIdCached", null);
        s1 = null;
        if (!flag) goto _L65; else goto _L64
_L64:
        flag = i(context);
        if (!flag) goto _L67; else goto _L66
_L66:
        s3 = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (s3 == null) goto _L69; else goto _L68
_L68:
        s1 = s3;
_L77:
        if (s1 == null) goto _L71; else goto _L70
_L70:
        b(context, "androidIdCached", s1);
        hashmap.put("android_id", s1);
          goto _L72
_L61:
        if (i == null)
        {
            break MISSING_BLOCK_LABEL_2855;
        }
        s2 = i;
        s1 = s2;
          goto _L73
        if (s2 != null)
        {
            s1 = s2;
        } else
        {
            s1 = null;
        }
          goto _L73
        s2;
        com.appsflyer.b.a("WARNING: READ_PHONE_STATE is missing");
          goto _L73
_L59:
        if (i == null) goto _L73; else goto _L74
_L74:
        s1 = i;
          goto _L73
_L57:
        if (i == null) goto _L73; else goto _L75
_L75:
        s1 = i;
          goto _L73
_L63:
        com.appsflyer.b.a("IMEI was not collected.");
          goto _L76
_L69:
        if (j == null)
        {
            break MISSING_BLOCK_LABEL_2924;
        }
        s2 = j;
        s1 = s2;
          goto _L77
        if (s2 != null)
        {
            s1 = s2;
        } else
        {
            s1 = null;
        }
          goto _L77
_L67:
        if (j == null) goto _L77; else goto _L78
_L78:
        s1 = j;
          goto _L77
_L65:
        if (j == null) goto _L77; else goto _L79
_L79:
        s1 = j;
          goto _L77
_L71:
        com.appsflyer.b.a("Android ID was not collected.");
          goto _L72
        s1;
        com.appsflyer.b.a((new StringBuilder("ERROR: ERROR: could not get uid ")).append(s1.getMessage()).toString());
          goto _L80
_L27:
        if (s1.getType() != 0) goto _L25; else goto _L81
_L81:
        s1 = "MOBILE";
          goto _L82
_L25:
        s1 = "unknown";
          goto _L82
        s1;
        com.appsflyer.b.a((new StringBuilder("checking network error ")).append(s1.getMessage()).toString());
          goto _L83
        s1;
        hashmap.put("platformextension", "android_native");
          goto _L84
_L33:
        s1 = "";
          goto _L85
_L41:
        if (i1.f == null) goto _L35; else goto _L86
_L86:
        i1.a(context, ((Map) (hashmap)), i1.f);
          goto _L35
_L45:
        hashmap.put("GAID_retry", "false");
          goto _L43
        s1;
          goto _L29
        s1;
          goto _L29
        s1;
          goto _L84
        s2;
          goto _L77
_L38:
        s1 = null;
          goto _L87
_L11:
        if (obj1 != null || obj == null) goto _L88; else goto _L12
_L48:
        obj = null;
          goto _L89
    }

    static void a(i i1, String s1, String s2, String s3, WeakReference weakreference, String s4, boolean flag)
    {
        URL url = new URL(s1);
        com.appsflyer.b.a((new StringBuilder("url: ")).append(url.toString()).toString());
        a("call server.", (new StringBuilder("\n")).append(url.toString()).append("\nPOST:").append(s2).toString(), (Context)weakreference.get());
        ab.b((new StringBuilder("data: ")).append(s2).toString());
        a((Context)weakreference.get(), c, "EVENT_DATA", s2);
        try
        {
            i1.a(url, s2, s3, weakreference, s4, flag);
            return;
        }
        catch (IOException ioexception)
        {
            if (com.appsflyer.q.a().b("useHttpFallback", false))
            {
                a((new StringBuilder("https failed: ")).append(ioexception.getLocalizedMessage()).toString(), "", (Context)weakreference.get());
                i1.a(new URL(s1.replace("https:", "http:")), s2, s3, weakreference, s4, flag);
                return;
            } else
            {
                com.appsflyer.b.a((new StringBuilder("failed to send requeset to server. ")).append(ioexception.getLocalizedMessage()).toString());
                a((Context)weakreference.get(), c, "ERROR", ioexception.getLocalizedMessage());
                throw ioexception;
            }
        }
    }

    static void a(y y1, Context context)
    {
        com.appsflyer.b.a("updateServerGcmToken called");
        com.appsflyer.q.a().a("gcmToken", y1.b());
        com.appsflyer.q.a().a("gcmInstanceId", y1.c());
        com.appsflyer.q.a().a("gcmTokenTimestamp", String.valueOf(y1.a()));
        y1 = new HashMap();
        y1.put("devkey", com.appsflyer.q.a().a("AppsFlyerKey"));
        y1.put("uid", com.appsflyer.aa.a(context));
        y1.put("af_gcm_token", com.appsflyer.q.a().a("gcmToken"));
        y1.put("advertiserId", com.appsflyer.q.a().a("advertiserId"));
        y1.put("af_google_instance_id", com.appsflyer.q.a().a("gcmInstanceId"));
        y1.put("launch_counter", Integer.toString(b(context, "appsFlyerCount", false)));
        y1.put("sdk", Integer.toString(android.os.Build.VERSION.SDK_INT));
        y1.put("channel", l(context));
        try
        {
            long l1 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
            y1.put("install_date", (new SimpleDateFormat("yyyy-MM-dd_HHmmZ", Locale.US)).format(new Date(l1)));
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception) { }
        catch (NoSuchFieldError nosuchfielderror) { }
        if (com.appsflyer.q.a().b("collectFingerPrint", true))
        {
            String s1 = g();
            if (s1 != null)
            {
                y1.put("deviceFingerPrintId", s1);
            }
        }
        try
        {
            s s2 = new s(context);
            s2.a = y1;
            s2.execute(new String[] {
                (new StringBuilder()).append(g).append(context.getPackageName()).toString()
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (y y1)
        {
            return;
        }
    }

    private static void a(String s1, String s2)
    {
        com.appsflyer.q.a().a(s1, s2);
    }

    private static void a(String s1, String s2, Context context)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        flag = flag1;
        try
        {
            if (context.getPackageName().length() <= 12)
            {
                break MISSING_BLOCK_LABEL_52;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.appsflyer.b.a(s1.toString());
            return;
        }
        flag = flag1;
        if ("com.appsflyer".equals(context.getPackageName().toLowerCase().substring(0, 13)))
        {
            flag = true;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        com.appsflyer.t.a().a((new StringBuilder()).append(s1).append(s2).toString());
    }

    private void a(URL url, String s1, String s2, WeakReference weakreference, String s3, boolean flag)
    {
        Context context = (Context)weakreference.get();
        HttpURLConnection httpurlconnection = (HttpURLConnection)url.openConnection();
        httpurlconnection.setRequestMethod("POST");
        int i1 = s1.getBytes().length;
        httpurlconnection.setRequestProperty("Content-Length", (new StringBuilder()).append(i1).toString());
        httpurlconnection.setRequestProperty("Content-Type", "application/json");
        httpurlconnection.setConnectTimeout(10000);
        httpurlconnection.setDoOutput(true);
        OutputStreamWriter outputstreamwriter = new OutputStreamWriter(httpurlconnection.getOutputStream());
        outputstreamwriter.write(s1);
        int j1;
        outputstreamwriter.close();
        j1 = httpurlconnection.getResponseCode();
        com.appsflyer.b.d((new StringBuilder("response code: ")).append(j1).toString());
        a(context, c, "SERVER_RESPONSE_CODE", Integer.toString(j1));
        a("response from server. status=", Integer.toString(j1), context);
        url = context.getSharedPreferences("appsflyer-data", 0);
        if (j1 != 200) goto _L2; else goto _L1
_L1:
        if (f != null)
        {
            f = null;
        }
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_210;
        }
        com.appsflyer.a.a.a();
        com.appsflyer.a.a.a(s3, context);
        if (weakreference.get() == null || s3 != null) goto _L2; else goto _L3
_L3:
        b(context, "sentSuccessfully", "true");
        if (!m && System.currentTimeMillis() - n >= 15000L) goto _L4; else goto _L2
_L2:
        long l1;
        j1 = url.getInt("appsflyerConversionDataRequestRetries", 0);
        l1 = url.getLong("appsflyerConversionDataCacheExpiration", 0L);
        if (l1 == 0L)
        {
            break MISSING_BLOCK_LABEL_315;
        }
        if (System.currentTimeMillis() - l1 > 0x134fd9000L)
        {
            b(context, "attributionId", ((String) (null)));
            b(context, "appsflyerConversionDataCacheExpiration", 0L);
        }
        if (url.getString("attributionId", null) != null || s2 == null || !flag) goto _L6; else goto _L5
_L5:
        if (k == null || j1 > 5) goto _L6; else goto _L7
_L7:
        url = Executors.newSingleThreadScheduledExecutor();
        url.schedule(new o(this, context.getApplicationContext(), s2, url), 10L, TimeUnit.MILLISECONDS);
_L11:
        if (httpurlconnection != null)
        {
            httpurlconnection.disconnect();
        }
        return;
        url;
        s1 = null;
_L17:
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_403;
        }
        s1.close();
        throw url;
        url;
        s1 = httpurlconnection;
_L16:
        if (s1 != null)
        {
            s1.disconnect();
        }
        throw url;
_L4:
        if (o != null) goto _L2; else goto _L8
_L8:
        s1 = Executors.newSingleThreadScheduledExecutor();
        o = s1;
        s1.schedule(new m(this, context), 1L, TimeUnit.SECONDS);
          goto _L2
_L6:
        if (s2 != null) goto _L10; else goto _L9
_L9:
        com.appsflyer.b.c("AppsFlyer dev key is missing.");
          goto _L11
_L10:
        if (!flag) goto _L11; else goto _L12
_L12:
        if (k == null || url.getString("attributionId", null) == null) goto _L11; else goto _L13
_L13:
        j1 = b(context, "appsFlyerCount", false);
        if (j1 <= 1) goto _L11; else goto _L14
_L14:
        if (g(context) == null) goto _L11; else goto _L15
_L15:
        url = k;
          goto _L11
        url;
        s1 = null;
          goto _L16
        url;
          goto _L11
        url;
        s1 = outputstreamwriter;
          goto _L17
    }

    static boolean a(boolean flag)
    {
        m = flag;
        return flag;
    }

    private static int b(Context context, String s1, boolean flag)
    {
        context = context.getSharedPreferences("appsflyer-data", 0);
        int j1 = context.getInt(s1, 0);
        int i1 = j1;
        if (flag)
        {
            i1 = j1 + 1;
            context = context.edit();
            context.putInt(s1, i1);
            a(context);
        }
        return i1;
    }

    static long b(long l1)
    {
        n = l1;
        return l1;
    }

    private static Map b(Context context, String s1)
    {
        LinkedHashMap linkedhashmap;
        String as[];
        boolean flag;
        int i1;
        int j1;
        linkedhashmap = new LinkedHashMap();
        as = s1.split("&");
        j1 = as.length;
        i1 = 0;
        flag = false;
_L9:
        if (i1 >= j1) goto _L2; else goto _L1
_L1:
        String s2;
        String s3 = as[i1];
        int k1 = s3.indexOf("=");
        boolean flag1;
        if (k1 > 0)
        {
            s2 = s3.substring(0, k1);
        } else
        {
            s2 = s3;
        }
        s1 = s2;
        flag1 = flag;
        if (linkedhashmap.containsKey(s2)) goto _L4; else goto _L3
_L3:
        if (!s2.equals("c")) goto _L6; else goto _L5
_L5:
        s1 = "campaign";
_L7:
        linkedhashmap.put(s1, new String());
        flag1 = flag;
_L4:
        if (k1 > 0 && s3.length() > k1 + 1)
        {
            s2 = s3.substring(k1 + 1);
        } else
        {
            s2 = null;
        }
        linkedhashmap.put(s1, s2);
        i1++;
        flag = flag1;
        continue; /* Loop/switch isn't completed */
_L6:
        if (s2.equals("pid"))
        {
            s1 = "media_source";
        } else
        {
            s1 = s2;
            if (s2.equals("af_prt"))
            {
                flag = true;
                s1 = "agency";
            }
        }
        if (true) goto _L7; else goto _L2
_L2:
        try
        {
            if (!linkedhashmap.containsKey("install_time"))
            {
                long l1 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
                linkedhashmap.put("install_time", (new SimpleDateFormat("yyyy-MM-dd hh:mm:ss")).format(new Date(l1)));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.appsflyer.b.c("Could not fetch install time");
        }
        if (!linkedhashmap.containsKey("af_status"))
        {
            linkedhashmap.put("af_status", "Non-organic");
        }
        if (flag)
        {
            linkedhashmap.remove("media_source");
        }
        return linkedhashmap;
        if (true) goto _L9; else goto _L8
_L8:
    }

    static Map b(String s1)
    {
        return c(s1);
    }

    public static void b()
    {
        com.appsflyer.q.a().f();
    }

    static void b(Context context)
    {
        com.appsflyer.b.a("app went to background");
        com.appsflyer.q.a().b(context);
        long l1 = System.currentTimeMillis();
        long l2 = p;
        HashMap hashmap = new HashMap();
        String s1 = com.appsflyer.q.a().a("AppsFlyerKey");
        hashmap.put("app_id", context.getPackageName());
        hashmap.put("devkey", s1);
        hashmap.put("uid", com.appsflyer.aa.a(context));
        hashmap.put("time_in_app", String.valueOf((l1 - l2) / 1000L));
        hashmap.put("statType", "user_closed_app");
        hashmap.put("platform", "Android");
        hashmap.put("launch_counter", Integer.toString(b(context, "appsFlyerCount", false)));
        hashmap.put("gcd_conversion_data_timing", Long.toString(context.getSharedPreferences("appsflyer-data", 0).getLong("appsflyerGetConversionDataTiming", 0L)));
        hashmap.put("channel", l(context));
        if (com.appsflyer.q.a().b("collectFingerPrint", true))
        {
            String s2 = g();
            if (s2 != null)
            {
                hashmap.put("deviceFingerPrintId", s2);
            }
        }
        try
        {
            context = new s(context);
            context.a = hashmap;
            context.execute(new String[] {
                "https://stats.appsflyer.com/stats"
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    private static void b(Context context, String s1, int i1)
    {
        context = context.getSharedPreferences("appsflyer-data", 0).edit();
        context.putInt(s1, i1);
        a(context);
    }

    private static void b(Context context, String s1, long l1)
    {
        context = context.getSharedPreferences("appsflyer-data", 0).edit();
        context.putLong(s1, l1);
        a(context);
    }

    private static void b(Context context, String s1, String s2)
    {
        context = context.getSharedPreferences("appsflyer-data", 0).edit();
        context.putString(s1, s2);
        a(context);
    }

    static long c(Context context)
    {
        long l1 = context.getSharedPreferences("appsflyer-data", 0).getLong("AppsFlyerTimePassedSincePrevLaunch", 0L);
        long l2 = System.currentTimeMillis();
        if (l1 > 0L)
        {
            l1 = l2 - l1;
        } else
        {
            l1 = -1L;
        }
        b(context, "AppsFlyerTimePassedSincePrevLaunch", l2);
        return l1 / 1000L;
    }

    static g c()
    {
        return k;
    }

    private static String c(Context context, String s1)
    {
        Object obj = null;
        Object obj1;
        try
        {
            obj1 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.appsflyer.b.a((new StringBuilder("Could not find ")).append(s1).append(" value in the manifest").toString(), context);
            return null;
        }
        context = obj;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        obj1 = ((Bundle) (obj1)).get(s1);
        context = obj;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        context = obj1.toString();
        return context;
    }

    private static Map c(String s1)
    {
        HashMap hashmap = new HashMap();
        try
        {
            s1 = new JSONObject(s1);
            Iterator iterator = s1.keys();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s2 = (String)iterator.next();
                if (!h.contains(s2))
                {
                    hashmap.put(s2, s1.getString(s2));
                }
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.appsflyer.b.c(s1.getMessage());
            return null;
        }
        return hashmap;
    }

    private static int d(String s1)
    {
        try
        {
            Class.forName(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return 0;
        }
        return 1;
    }

    static String d(Context context)
    {
        return l(context);
    }

    private static String d(Context context, String s1)
    {
        SharedPreferences sharedpreferences = context.getSharedPreferences("appsflyer-data", 0);
        if (sharedpreferences.contains("CACHED_CHANNEL"))
        {
            return sharedpreferences.getString("CACHED_CHANNEL", null);
        } else
        {
            b(context, "CACHED_CHANNEL", s1);
            return s1;
        }
    }

    static boolean d()
    {
        return m;
    }

    private static String e(String s1)
    {
        try
        {
            s1 = (String)Class.forName("android.os.SystemProperties").getMethod("get", new Class[] {
                java/lang/String
            }).invoke(null, new Object[] {
                s1
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            return null;
        }
        return s1;
    }

    static Map e(Context context)
    {
        return g(context);
    }

    static ScheduledExecutorService e()
    {
        return o;
    }

    static ScheduledExecutorService f()
    {
        o = null;
        return null;
    }

    private void f(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = com.appsflyer.q.a().a("gcmProjectNumber");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        if (com.appsflyer.q.a().a("gcmToken") == null)
        {
            (new k(this, context, s1)).execute(new Void[0]);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    private static String g()
    {
        String s1 = (new StringBuilder("35")).append(Build.BOARD.length() % 10).append(Build.BRAND.length() % 10).append(Build.CPU_ABI.length() % 10).append(Build.DEVICE.length() % 10).append(Build.MANUFACTURER.length() % 10).append(Build.MODEL.length() % 10).append(Build.PRODUCT.length() % 10).toString();
        String s2;
        try
        {
            s2 = android/os/Build.getField("SERIAL").get(null).toString();
            s2 = (new UUID(s1.hashCode(), s2.hashCode())).toString();
        }
        catch (Exception exception)
        {
            return (new UUID(s1.hashCode(), "serial".hashCode())).toString();
        }
        return s2;
    }

    private static Map g(Context context)
    {
        SharedPreferences sharedpreferences = context.getSharedPreferences("appsflyer-data", 0);
        String s1 = com.appsflyer.q.a().a(context);
        if (s1 != null && s1.length() > 0 && s1.contains("af_tranid"))
        {
            return b(context, s1);
        }
        context = sharedpreferences.getString("attributionId", null);
        if (context != null && context.length() > 0)
        {
            return c(context);
        } else
        {
            throw new r();
        }
    }

    private static boolean h(Context context)
    {
        boolean flag = false;
        int i1;
        try
        {
            i1 = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.appsflyer.b.a("WARNING: Google play services is unavailable.");
            return false;
        }
        if (i1 == 0)
        {
            flag = true;
        }
        return flag;
    }

    private static boolean i(Context context)
    {
        return android.os.Build.VERSION.SDK_INT < 19 || !h(context);
    }

    private static boolean j(Context context)
    {
        boolean flag = false;
        if (!context.getSharedPreferences("appsflyer-data", 0).contains("appsFlyerCount"))
        {
            flag = true;
        }
        return flag;
    }

    private static String k(Context context)
    {
        Object obj1;
        Object obj2;
        obj2 = null;
        obj1 = e("ro.appsflyer.preinstall.path");
        String s1 = ((String) (obj1));
        if (obj1 == null)
        {
            s1 = c(context, "AF_PRE_INSTALL_PATH");
        }
        obj1 = s1;
        if (s1 == null)
        {
            obj1 = "/data/local/tmp/pre_install.appsflyer";
        }
        Object obj;
        if (!(new File(((String) (obj1)))).exists())
        {
            obj = "/etc/pre_install.appsflyer";
        } else
        {
            obj = obj1;
        }
        obj1 = new Properties();
        obj = new FileReader(((String) (obj)));
        ((Properties) (obj1)).load(((java.io.Reader) (obj)));
        com.appsflyer.b.a("Found pre_install definition");
        context = ((Properties) (obj1)).getProperty(context.getPackageName());
        try
        {
            ((FileReader) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return context;
        }
        return context;
        context;
        obj = null;
_L4:
        context = obj2;
        if (obj != null)
        {
            try
            {
                ((FileReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return null;
            }
            return null;
        } else
        {
            break MISSING_BLOCK_LABEL_92;
        }
        context;
        obj = null;
_L2:
        if (obj != null)
        {
            try
            {
                ((FileReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw context;
        context;
        if (true) goto _L2; else goto _L1
_L1:
        context;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static String l(Context context)
    {
        String s2 = com.appsflyer.q.a().a("channel");
        String s1 = s2;
        if (s2 == null)
        {
            s1 = c(context, "CHANNEL");
        }
        return s1;
    }

    private static boolean m(Context context)
    {
        boolean flag = false;
        int i1;
        try
        {
            i1 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.appsflyer.b.a("Could not check if app is pre installed", context);
            return false;
        }
        if ((i1 & 1) != 0)
        {
            flag = true;
        }
        return flag;
    }

    private static float n(Context context)
    {
        int i1;
        int j1;
        try
        {
            context = context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            i1 = context.getIntExtra("level", -1);
            j1 = context.getIntExtra("scale", -1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return 1.0F;
        }
        if (i1 == -1 || j1 == -1)
        {
            return 50F;
        } else
        {
            return ((float)i1 / (float)j1) * 100F;
        }
    }

    public final void a(Application application, String s1)
    {
        com.appsflyer.b.d("Build Number: 282");
        a("AppsFlyerKey", s1);
        com.appsflyer.ab.a(s1);
        if (r == null)
        {
            com.appsflyer.q.a().c(application.getApplicationContext());
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                com.appsflyer.v.a(application);
                r = new j(this);
                com.appsflyer.v.a().a(r);
            } else
            {
                com.appsflyer.b.a("SDK<14 call trackAppLaunch manually");
                a(application.getApplicationContext(), ((String) (null)), ((Map) (null)));
            }
        }
        if (com.appsflyer.q.a().a("gcmToken") == null && com.appsflyer.q.a().a("gcmProjectNumber") != null)
        {
            f(application.getApplicationContext());
        }
    }

    public final void a(Context context, Intent intent)
    {
        String s1 = intent.getStringExtra("shouldMonitor");
        if (s1 != null)
        {
            com.appsflyer.b.a("Turning on monitoring.");
            com.appsflyer.q.a().a("shouldMonitor", s1.equals("true"));
            a(context, null, "START_TRACKING", context.getPackageName());
        } else
        {
            com.appsflyer.b.a("****** onReceive called *******");
            a("******* onReceive: ", "", context);
            com.appsflyer.q.a().b();
            String s2 = intent.getStringExtra("referrer");
            com.appsflyer.b.a((new StringBuilder("Play store referrer: ")).append(s2).toString());
            if (s2 != null)
            {
                intent = intent.getStringExtra("TestIntegrationMode");
                if (intent != null && intent.equals("AppsFlyer_Test"))
                {
                    intent = context.getSharedPreferences("appsflyer-data", 0).edit();
                    intent.clear();
                    a(((android.content.SharedPreferences.Editor) (intent)));
                    com.appsflyer.q.a().d();
                    com.appsflyer.b.a("Test mode started..");
                    s = System.currentTimeMillis();
                }
                a("onReceive called. referrer: ", s2, context);
                b(context, "referrer", s2);
                com.appsflyer.q.a().b(s2);
                if (com.appsflyer.q.a().c())
                {
                    com.appsflyer.b.a("onReceive: isLaunchCalled");
                    a(context, null, null, s2, false);
                    return;
                }
            }
        }
    }

    public final void a(Context context, String s1, Map map)
    {
        Object obj = map;
        if (map == null)
        {
            obj = new HashMap();
        }
        map = new JSONObject(((Map) (obj)));
        obj = com.appsflyer.q.a().a(context);
        String s2 = map.toString();
        map = ((Map) (obj));
        if (obj == null)
        {
            map = "";
        }
        a(context, s1, s2, ((String) (map)), true);
    }

}
