// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import com.bca.mobile.bn;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Info_Suku_Bunga

final class cu
    implements Runnable
{

    final M_Info_Suku_Bunga a;
    private final String b[];

    cu(M_Info_Suku_Bunga m_info_suku_bunga, String as[])
    {
        a = m_info_suku_bunga;
        b = as;
        super();
    }

    public final void run()
    {
        a.g();
        a.a(bn.a(0x7f0c0059), bn.a(b), a, false, bn.a(0x7f0c002b));
    }
}
