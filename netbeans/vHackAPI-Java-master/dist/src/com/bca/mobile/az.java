// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.app.Activity;
import android.content.res.Resources;

// Referenced classes of package com.bca.mobile:
//            ay, ShareActivity, n

final class az
    implements Runnable
{

    final ay a;
    private final int b;

    az(ay ay1, int i)
    {
        a = ay1;
        b = i;
        super();
    }

    public final void run()
    {
        String s;
        Object obj;
        obj = ay.a(a);
        if (ay.a(a).getParent() != null)
        {
            obj = ay.a(a).getParent();
        }
        s = "Koneksi internet Anda terputus. Silakan ulangi beberapa saat lagi";
        if (!n.x.equals(ay.a(a).getResources().getString(0x7f0c001f)) && !n.x.equals(ay.a(a).getResources().getString(0x7f0c0021)) && !n.x.equals(ay.a(a).getResources().getString(0x7f0c0022)) || n.a != 1) goto _L2; else goto _L1
_L1:
        s = "Koneksi internet Anda terputus. Silakan cek mutasi rekening Anda";
_L4:
        ay.a(a).a(s, (Activity)obj, true, "Ok", false, false);
        ay.a(a).a(b);
        ay.a(a).g();
        return;
_L2:
        if (n.x.equals(ay.a(a).getResources().getString(0x7f0c001e)) || n.x.equals(ay.a(a).getResources().getString(0x7f0c0020)))
        {
            s = "Koneksi internet Anda terputus. Silakan ulangi beberapa saat lagi";
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
