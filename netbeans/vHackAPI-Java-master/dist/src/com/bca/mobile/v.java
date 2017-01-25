// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.content.DialogInterface;

// Referenced classes of package com.bca.mobile:
//            MainActivity

final class v
    implements android.content.DialogInterface.OnClickListener
{

    final MainActivity a;

    v(MainActivity mainactivity)
    {
        a = mainactivity;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        MainActivity.b(a);
    }
}
