// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.app.Activity;
import android.content.DialogInterface;

// Referenced classes of package com.bca.mobile:
//            n, bn, ShareActivity, TabSample

final class al
    implements android.content.DialogInterface.OnCancelListener
{

    final ShareActivity a;
    private final String b;
    private final String c;
    private final boolean d = false;
    private final Activity e;

    al(ShareActivity shareactivity, String s, String s1, Activity activity)
    {
        a = shareactivity;
        b = s;
        c = s1;
        e = activity;
        super();
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        dialoginterface.dismiss();
        if (!b.equalsIgnoreCase("close") && !c.equalsIgnoreCase("close")) goto _L2; else goto _L1
_L1:
        n.ao = true;
        bn.a(a, true);
_L4:
        a.c();
        return;
_L2:
        if (d)
        {
            if (b.equals(bn.a(0x7f0c0061)))
            {
                n.an = true;
            }
            if (n.am != null)
            {
                TabSample.a(TabSample.a);
            } else
            {
                e.finish();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
