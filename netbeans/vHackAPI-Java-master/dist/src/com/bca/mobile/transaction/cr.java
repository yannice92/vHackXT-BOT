// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.content.Context;
import android.widget.TextView;
import com.bca.mobile.bu;

// Referenced classes of package com.bca.mobile.transaction:
//            cq, M_Info_Saldo_Reksadana

final class cr extends bu
{

    final cq j;

    cr(cq cq1, Context context, String s, String s1)
    {
        j = cq1;
        super(context, s, 2, 1, s1);
    }

    public final void a()
    {
        cq.a(j).finish();
    }

    public final void b()
    {
        M_Info_Saldo_Reksadana.a(cq.a(j)).setText(M_Info_Saldo_Reksadana.b(cq.a(j)));
    }
}
