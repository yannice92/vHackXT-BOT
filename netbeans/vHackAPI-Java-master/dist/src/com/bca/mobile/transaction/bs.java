// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.content.Context;
import android.widget.TextView;
import com.bca.mobile.bu;

// Referenced classes of package com.bca.mobile.transaction:
//            br, M_Info_KK_Saldo

final class bs extends bu
{

    final br j;

    bs(br br1, Context context, String s, String s1)
    {
        j = br1;
        super(context, s, 2, 1, s1);
    }

    public final void a()
    {
        br.a(j).finish();
    }

    public final void b()
    {
        M_Info_KK_Saldo.a(br.a(j)).setText(M_Info_KK_Saldo.b(br.a(j)));
    }
}
