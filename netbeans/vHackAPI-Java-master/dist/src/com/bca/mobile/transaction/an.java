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
//            M_Commerce_Lainnya1, ar

final class an
    implements android.widget.AdapterView.OnItemClickListener
{

    final M_Commerce_Lainnya1 a;

    an(M_Commerce_Lainnya1 m_commerce_lainnya1)
    {
        a = m_commerce_lainnya1;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        M_Commerce_Lainnya1.a(a).setText(((ar)com.bca.mobile.transaction.M_Commerce_Lainnya1.b(a).get(M_Commerce_Lainnya1.c(a))).h()[i]);
        b.a();
    }
}
