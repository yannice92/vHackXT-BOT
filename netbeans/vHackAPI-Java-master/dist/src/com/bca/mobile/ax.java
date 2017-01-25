// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.app.ProgressDialog;
import android.widget.Button;

// Referenced classes of package com.bca.mobile:
//            aw, ShareActivity

final class ax
    implements Runnable
{

    final aw a;

    ax(aw aw1)
    {
        a = aw1;
        super();
    }

    public final void run()
    {
        aw.a(a).A.getButton(-1).setEnabled(true);
    }
}
