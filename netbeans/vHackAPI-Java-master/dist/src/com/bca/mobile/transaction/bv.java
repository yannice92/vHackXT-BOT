// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.content.Context;
import android.widget.TextView;
import com.bca.mobile.bu;

// Referenced classes of package com.bca.mobile.transaction:
//            bu, M_Info_KK_Transaksi

final class bv extends bu
{

    final com.bca.mobile.transaction.bu j;

    bv(com.bca.mobile.transaction.bu bu1, Context context, String s, String s1)
    {
        j = bu1;
        super(context, s, 2, 1, s1);
    }

    public final void a()
    {
        bu.a(j).finish();
    }

    public final void b()
    {
        bu.a(j).c.setText(bu.a(j).T);
        bu.a(j).f.setText(bu.a(j).U);
    }
}
