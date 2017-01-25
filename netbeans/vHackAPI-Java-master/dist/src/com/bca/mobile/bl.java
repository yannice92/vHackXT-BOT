// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.app.Dialog;
import android.view.View;

// Referenced classes of package com.bca.mobile:
//            n, bn, ShareActivity

final class bl
    implements android.view.View.OnClickListener
{

    final ShareActivity a;
    private final String b;
    private final String c;

    bl(ShareActivity shareactivity, String s, String s1)
    {
        a = shareactivity;
        b = s;
        c = s1;
        super();
    }

    public final void onClick(View view)
    {
        if (b.equalsIgnoreCase("close") || c.equalsIgnoreCase("close"))
        {
            n.ao = true;
            bn.a(a, true);
        }
        a.D.dismiss();
        a.onResultButtonCancel(view);
    }
}
