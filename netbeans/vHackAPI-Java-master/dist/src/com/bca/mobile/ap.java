// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.content.DialogInterface;
import com.f.a;
import com.h.b;

// Referenced classes of package com.bca.mobile:
//            n, ShareActivity

final class ap
    implements android.content.DialogInterface.OnCancelListener
{

    final ShareActivity a;

    ap(ShareActivity shareactivity)
    {
        a = shareactivity;
        super();
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        dialoginterface.dismiss();
        if (n.l != 0x7f0200a8)
        {
            if (n.y != null)
            {
                n.y.c();
                n.y.a();
            }
            b.k = 0;
        }
    }
}
