// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.database.sqlite.SQLiteDatabase;
import com.c.a;

// Referenced classes of package com.bca.mobile:
//            ActivateActivity, bn

final class b
    implements Runnable
{

    final ActivateActivity a;

    b(ActivateActivity activateactivity)
    {
        a = activateactivity;
        super();
    }

    public final void run()
    {
        Exception exception1;
        a.g();
        com.h.b.a();
        if (a.d())
        {
            a.E = 1;
            a.a("m-BCA", "Anda telah berhasil melakukan aktivasi m-BCA. Tekan OK untuk menggunakan layanan m-BCA.", a, false, com.bca.mobile.bn.a(0x7f0c002b));
            return;
        }
        a a1 = new a(a);
        try
        {
            a1.a.delete("profile", null, null);
            a1.a.delete("app_constant", null, null);
            a.finish();
        }
        catch (Exception exception)
        {
            a1.b();
            return;
        }
        finally
        {
            a1.b();
        }
        a1.b();
        return;
        throw exception1;
    }
}
