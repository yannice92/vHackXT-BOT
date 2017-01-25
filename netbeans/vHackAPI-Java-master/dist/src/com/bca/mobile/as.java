// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.content.DialogInterface;

// Referenced classes of package com.bca.mobile:
//            ShareActivity

final class as
    implements android.content.DialogInterface.OnCancelListener
{

    final ShareActivity a;

    as(ShareActivity shareactivity)
    {
        a = shareactivity;
        super();
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        a.i();
    }
}
