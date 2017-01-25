// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.app.Dialog;
import android.view.View;

// Referenced classes of package com.bca.mobile:
//            ShareActivity, bn, n

final class ar
    implements android.view.View.OnClickListener
{

    final ShareActivity a;
    private final String b;

    ar(ShareActivity shareactivity, String s)
    {
        a = shareactivity;
        b = s;
        super();
    }

    public final void onClick(View view)
    {
        ShareActivity.a(a, b);
        if (bn.b("upgradeProvis", "0").equals("1"))
        {
            bn.a("upgradeProvis", "0");
        }
        if (n.V != null)
        {
            n.V = null;
        }
        a.D.dismiss();
    }
}
