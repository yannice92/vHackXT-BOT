// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.content.Context;
import android.widget.TextView;
import com.bca.mobile.bu;

// Referenced classes of package com.bca.mobile.transaction:
//            cn, M_Info_Rek_Deposito

final class co extends bu
{

    final cn j;

    co(cn cn1, Context context, String s, String s1)
    {
        j = cn1;
        super(context, s, 2, 1, s1);
    }

    public final void a()
    {
        cn.a(j).finish();
    }

    public final void b()
    {
        cn.a(j).c.setText(cn.a(j).T);
        cn.a(j).f.setText(cn.a(j).U);
    }
}
