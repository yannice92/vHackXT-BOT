// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.content.Context;
import android.widget.TextView;
import com.bca.mobile.bu;

// Referenced classes of package com.bca.mobile.transaction:
//            bx, M_Info_KPR_Pinjaman

final class by extends bu
{

    final bx j;

    by(bx bx1, Context context, String s, String s1)
    {
        j = bx1;
        super(context, s, 2, 1, s1);
    }

    public final void a()
    {
        bx.a(j).finish();
    }

    public final void b()
    {
        bx.a(j).c.setText(bx.a(j).T);
        bx.a(j).f.setText(bx.a(j).U);
    }
}
