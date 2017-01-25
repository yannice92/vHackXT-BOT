// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Looper;
import java.io.IOException;

// Referenced classes of package com.appsflyer:
//            e, f, d

public final class c
{

    public static d a(Context context)
    {
        e e1;
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        Object obj;
        try
        {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        e1 = new e((byte)0);
        obj = new Intent("com.google.android.gms.ads.identifier.service.START");
        ((Intent) (obj)).setPackage("com.google.android.gms");
        if (!context.bindService(((Intent) (obj)), e1, 1))
        {
            break MISSING_BLOCK_LABEL_115;
        }
        obj = new f(e1.a());
        obj = new d(((f) (obj)).a(), ((f) (obj)).b());
        context.unbindService(e1);
        return ((d) (obj));
        Object obj1;
        obj1;
        throw obj1;
        obj1;
        context.unbindService(e1);
        throw obj1;
        throw new IOException("Google Play connection failed");
    }
}
