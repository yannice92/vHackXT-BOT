// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import com.d.b;
import java.util.ArrayList;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Commerce_Voucher1, bk

final class bh
    implements android.widget.AdapterView.OnItemClickListener
{

    final M_Commerce_Voucher1 a;

    bh(M_Commerce_Voucher1 m_commerce_voucher1)
    {
        a = m_commerce_voucher1;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        M_Commerce_Voucher1.a(a).setText(((bk)com.bca.mobile.transaction.M_Commerce_Voucher1.b(a).get(M_Commerce_Voucher1.c(a))).h()[i]);
        b.a();
    }
}
