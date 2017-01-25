// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.content.DialogInterface;

// Referenced classes of package com.bca.mobile:
//            ShareActivity

final class ba
    implements android.content.DialogInterface.OnClickListener
{

    final ShareActivity a;
    private final int b;

    ba(ShareActivity shareactivity, int i)
    {
        a = shareactivity;
        b = i;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.a(b);
    }
}
