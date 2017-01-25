// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.content.DialogInterface;

final class bp
    implements android.content.DialogInterface.OnCancelListener
{

    bp()
    {
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        dialoginterface.dismiss();
    }
}
