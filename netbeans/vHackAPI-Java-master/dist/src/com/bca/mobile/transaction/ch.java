// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.content.Context;
import android.widget.TextView;
import com.bca.mobile.bu;
import java.util.ArrayList;

// Referenced classes of package com.bca.mobile.transaction:
//            cg, M_Info_Mutasi_RDN

final class ch extends bu
{

    final cg j;

    ch(cg cg1, Context context, String s, String s1)
    {
        j = cg1;
        super(context, s, 2, 1, s1);
    }

    public final void a()
    {
        cg.a(j).finish();
    }

    public final void b()
    {
        cg.a(j).a.setText((CharSequence)cg.a(j).j.get(M_Info_Mutasi_RDN.h(cg.a(j))));
        cg.a(j).e(M_Info_Mutasi_RDN.h(cg.a(j)));
    }
}
