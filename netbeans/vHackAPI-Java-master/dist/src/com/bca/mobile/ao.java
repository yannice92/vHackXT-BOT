// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.app.Dialog;
import android.view.View;
import com.f.a;
import com.h.b;

// Referenced classes of package com.bca.mobile:
//            n, ShareActivity

final class ao
    implements android.view.View.OnClickListener
{

    final ShareActivity a;

    ao(ShareActivity shareactivity)
    {
        a = shareactivity;
        super();
    }

    public final void onClick(View view)
    {
        if (n.l != 0x7f0200a8)
        {
            if (n.y != null)
            {
                n.y.c();
                n.y.a();
            }
            b.k = 0;
        }
        a.D.dismiss();
    }
}
