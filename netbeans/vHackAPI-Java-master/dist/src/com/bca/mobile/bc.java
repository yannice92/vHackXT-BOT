// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.app.AlertDialog;
import android.view.View;

// Referenced classes of package com.bca.mobile:
//            ShareActivity

final class bc
    implements android.view.View.OnClickListener
{

    final ShareActivity a;

    bc(ShareActivity shareactivity)
    {
        a = shareactivity;
        super();
    }

    public final void onClick(View view)
    {
        a.w.dismiss();
    }
}
