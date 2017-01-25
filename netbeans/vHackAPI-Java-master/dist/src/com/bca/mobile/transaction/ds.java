// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;


// Referenced classes of package com.bca.mobile.transaction:
//            M_Transfer_TA_Bank

final class ds
    implements Runnable
{

    final M_Transfer_TA_Bank a;
    private final String b;

    ds(M_Transfer_TA_Bank m_transfer_ta_bank, String s)
    {
        a = m_transfer_ta_bank;
        b = s;
        super();
    }

    public final void run()
    {
        M_Transfer_TA_Bank.a(a, (new StringBuilder(String.valueOf((new Integer(b)).intValue()))).toString());
    }
}
