// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.app.Dialog;
import android.view.View;

// Referenced classes of package com.bca.mobile:
//            bn, n, ShareActivity

final class aq
    implements android.view.View.OnClickListener
{

    final ShareActivity a;

    aq(ShareActivity shareactivity)
    {
        a = shareactivity;
        super();
    }

    public final void onClick(View view)
    {
        bn.a("upgradeNotif", "1");
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
