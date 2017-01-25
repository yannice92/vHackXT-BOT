// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.content.Context;
import com.bca.mobile.bu;

// Referenced classes of package com.bca.mobile.transaction:
//            bo, M_Info

final class bq extends bu
{

    final bo j;
    private final int k;

    bq(bo bo1, Context context, String s, int i, String s1, int l)
    {
        j = bo1;
        k = l;
        super(context, s, i, s1);
    }

    public final void a()
    {
        if (k == 2)
        {
            bo.a(j).g((new StringBuilder("PGI:!:ISDN:!::!:")).append(M_Info.e(bo.a(j))).toString());
        }
    }

    public final void b()
    {
    }
}
