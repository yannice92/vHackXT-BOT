// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.content.Context;
import android.widget.TextView;
import com.bca.mobile.bu;

// Referenced classes of package com.bca.mobile.transaction:
//            ck, M_Info_Mutasi_Rekening

final class cl extends bu
{

    final ck j;

    cl(ck ck1, Context context, String s, String s1)
    {
        j = ck1;
        super(context, s, 2, 1, s1);
    }

    public final void a()
    {
        ck.a(j).finish();
    }

    public final void b()
    {
        ck.a(j).a.setText(ck.a(j).k);
    }
}
