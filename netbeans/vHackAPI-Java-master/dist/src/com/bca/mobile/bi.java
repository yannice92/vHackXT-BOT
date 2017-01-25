// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.app.Activity;
import android.content.DialogInterface;

// Referenced classes of package com.bca.mobile:
//            ShareActivity, n, bn, TabSample

final class bi
    implements android.content.DialogInterface.OnCancelListener
{

    final ShareActivity a;
    private final String b;
    private final String c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final Activity g;

    bi(ShareActivity shareactivity, String s, String s1, boolean flag, boolean flag1, boolean flag2, Activity activity)
    {
        a = shareactivity;
        b = s;
        c = s1;
        d = flag;
        e = flag1;
        f = flag2;
        g = activity;
        super();
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        a.i();
        dialoginterface.dismiss();
        if (!b.equalsIgnoreCase("close") && !c.equalsIgnoreCase("close")) goto _L2; else goto _L1
_L1:
        n.ao = true;
        bn.a(a, true);
_L4:
        return;
_L2:
        if (d)
        {
            a.f();
            return;
        }
        if (!e)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (n.f) goto _L4; else goto _L3
_L3:
        a.f();
        return;
        if (!f) goto _L4; else goto _L5
_L5:
        if (b.equals(bn.a(0x7f0c0061)))
        {
            n.an = true;
            bn.a(a, true);
            return;
        }
        if (n.am != null)
        {
            TabSample.a(TabSample.a);
            return;
        } else
        {
            g.finish();
            return;
        }
    }
}
