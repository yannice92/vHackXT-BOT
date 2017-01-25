// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer;

import android.content.Context;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Calendar;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;

// Referenced classes of package com.appsflyer:
//            b

final class a
{

    private final Object a = new Object();
    private KeyStore b;
    private Context c;
    private String d;
    private int e;

    public a(Context context)
    {
        c = context;
        d = "";
        e = 0;
        com.appsflyer.b.a("Initialising KeyStore..");
        try
        {
            b = KeyStore.getInstance("AndroidKeyStore");
            b.load(null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        com.appsflyer.b.a("Couldn't load keystore instance of type: AndroidKeyStore");
    }

    private void b(String s)
    {
        com.appsflyer.b.a((new StringBuilder("Creating a new key with alias: ")).append(s).toString());
        Object obj1 = a;
        obj1;
        JVM INSTR monitorenter ;
        if (b.containsAlias(s)) goto _L2; else goto _L1
_L1:
        Calendar calendar;
        Calendar calendar1;
        calendar = Calendar.getInstance();
        calendar1 = Calendar.getInstance();
        calendar1.add(1, 5);
        Object obj = null;
        if (android.os.Build.VERSION.SDK_INT < 23) goto _L4; else goto _L3
_L3:
        obj = (new android.security.keystore.KeyGenParameterSpec.Builder(s, 3)).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar1.getTime()).build();
_L6:
        s = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
        s.initialize(((java.security.spec.AlgorithmParameterSpec) (obj)));
        s.generateKeyPair();
_L7:
        obj1;
        JVM INSTR monitorexit ;
        return;
_L4:
        if (android.os.Build.VERSION.SDK_INT < 18) goto _L6; else goto _L5
_L5:
        obj = (new android.security.KeyPairGeneratorSpec.Builder(c)).setAlias(s).setSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setSerialNumber(BigInteger.ONE).setStartDate(calendar.getTime()).setEndDate(calendar1.getTime()).build();
          goto _L6
_L2:
        com.appsflyer.b.a((new StringBuilder("Alias already exists: ")).append(s).toString());
          goto _L7
        s;
        obj1;
        JVM INSTR monitorexit ;
        throw s;
        s;
        com.appsflyer.b.a((new StringBuilder("Exception ")).append(s.getMessage()).append(" occurred").toString());
        return;
          goto _L6
    }

    private String e()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("com.appsflyer,");
        synchronized (a)
        {
            stringbuilder.append("KSAppsFlyerId=").append(d).append(",");
            stringbuilder.append("KSAppsFlyerRICounter=").append(e);
        }
        return stringbuilder.toString();
    }

    public final void a()
    {
        String s = e();
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        e = e + 1;
        com.appsflyer.b.a((new StringBuilder("Deleting key with alias: ")).append(s).toString());
        synchronized (a)
        {
            b.deleteEntry(s);
        }
_L2:
        obj;
        JVM INSTR monitorexit ;
        b(e());
        return;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj2;
        obj2;
        com.appsflyer.b.a((new StringBuilder("Exception ")).append(((KeyStoreException) (obj2)).getMessage()).append(" occurred").toString());
        if (true) goto _L2; else goto _L1
_L1:
        obj2;
        throw obj2;
    }

    public final void a(String s)
    {
        d = s;
        e = 0;
        b(e());
    }

    public final boolean b()
    {
        boolean flag1;
        boolean flag2;
        flag2 = true;
        flag1 = true;
        Object obj2 = a;
        obj2;
        JVM INSTR monitorenter ;
        Object obj = b;
        if (obj == null) goto _L2; else goto _L1
_L1:
        Enumeration enumeration = b.aliases();
_L6:
        if (!enumeration.hasMoreElements()) goto _L4; else goto _L3
_L3:
        obj = (String)enumeration.nextElement();
        if (obj == null) goto _L6; else goto _L5
_L5:
        if (!((String) (obj)).startsWith("com.appsflyer")) goto _L6; else goto _L7
_L7:
        String as1[] = ((String) (obj)).split(",");
        if (as1.length != 3) goto _L4; else goto _L8
_L8:
        com.appsflyer.b.a((new StringBuilder("Found a matching AF key with alias:\n")).append(((String) (obj))).toString());
        String as[];
        as = as1[1].trim().split("=");
        as1 = as1[2].trim().split("=");
        boolean flag = flag1;
        if (as.length != 2)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        flag = flag1;
        if (as1.length != 2)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        d = as[1].trim();
        e = Integer.parseInt(as1[1].trim());
        flag = flag1;
_L9:
        obj2;
        JVM INSTR monitorexit ;
        return flag;
_L10:
        Object obj1;
        com.appsflyer.b.a((new StringBuilder("Couldn't list KeyStore Aliases: ")).append(obj1.getClass().getName()).toString());
          goto _L9
        obj1;
        throw obj1;
        obj1;
        flag = flag2;
          goto _L10
_L2:
        flag = false;
          goto _L9
_L4:
        flag = false;
          goto _L9
        obj1;
        flag = false;
          goto _L10
    }

    public final String c()
    {
        String s;
        synchronized (a)
        {
            s = d;
        }
        return s;
    }

    public final int d()
    {
        int i;
        synchronized (a)
        {
            i = e;
        }
        return i;
    }
}
