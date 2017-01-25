// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.app.Dialog;
import android.view.View;
import com.h.b;

// Referenced classes of package com.bca.mobile:
//            n, bn, ShareActivity

final class an
    implements android.view.View.OnClickListener
{

    final ShareActivity a;

    an(ShareActivity shareactivity)
    {
        a = shareactivity;
        super();
    }

    public final void onClick(View view)
    {
        bn.a(n.al, true);
        b.c();
        a.D.dismiss();
    }
}
