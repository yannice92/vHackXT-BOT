// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.UUID;

public final class aa
{

    private static String a = null;

    public static String a(Context context)
    {
        com/appsflyer/aa;
        JVM INSTR monitorenter ;
        if (a != null) goto _L2; else goto _L1
_L1:
        Object obj = context.getSharedPreferences("appsflyer-data", 0).getString("AF_INSTALLATION", null);
        if (obj == null) goto _L4; else goto _L3
_L3:
        a = ((String) (obj));
_L2:
        context = a;
        com/appsflyer/aa;
        JVM INSTR monitorexit ;
        return context;
_L4:
        obj = new File(context.getFilesDir(), "AF_INSTALLATION");
        if (((File) (obj)).exists())
        {
            break MISSING_BLOCK_LABEL_197;
        }
        obj = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        if (android.os.Build.VERSION.SDK_INT < 9) goto _L6; else goto _L5
_L5:
        obj = (new StringBuilder()).append(((PackageInfo) (obj)).firstInstallTime).append("-").append(Math.abs((new Random()).nextLong())).toString();
_L7:
        a = ((String) (obj));
_L8:
        obj = a;
        context = context.getSharedPreferences("appsflyer-data", 0).edit();
        context.putString("AF_INSTALLATION", ((String) (obj)));
        if (android.os.Build.VERSION.SDK_INT < 9)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        context.apply();
          goto _L2
        context;
        throw new RuntimeException(context);
        context;
        com/appsflyer/aa;
        JVM INSTR monitorexit ;
        throw context;
_L6:
        obj = UUID.randomUUID().toString();
          goto _L7
        a = a(((File) (obj)));
        ((File) (obj)).delete();
          goto _L8
        context.commit();
          goto _L2
    }

    private static String a(File file)
    {
        Object obj1;
        Object obj2;
        obj1 = null;
        obj2 = null;
        Object obj = new RandomAccessFile(file, "r");
        file = ((File) (obj1));
        obj1 = new byte[(int)((RandomAccessFile) (obj)).length()];
        file = ((File) (obj1));
        ((RandomAccessFile) (obj)).readFully(((byte []) (obj1)));
        file = ((File) (obj1));
        ((RandomAccessFile) (obj)).close();
        ((RandomAccessFile) (obj)).close();
        obj = obj1;
_L2:
        if (obj == null)
        {
            obj = new byte[0];
        }
        return new String(((byte []) (obj)));
        file;
        obj1 = null;
        file = obj2;
_L4:
        obj = file;
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        ((RandomAccessFile) (obj1)).close();
        obj = file;
          goto _L2
        obj;
        obj = file;
          goto _L2
        file;
        obj = null;
_L3:
        if (obj != null)
        {
            try
            {
                ((RandomAccessFile) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw file;
        file;
        obj = obj1;
          goto _L2
        file;
          goto _L3
        IOException ioexception;
        ioexception;
        ioexception = ((IOException) (obj));
          goto _L4
    }

}
