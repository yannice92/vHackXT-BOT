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
//            M_Commerce_PMA, bd

final class az
    implements android.widget.AdapterView.OnItemClickListener
{

    final M_Commerce_PMA a;

    az(M_Commerce_PMA m_commerce_pma)
    {
        a = m_commerce_pma;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        M_Commerce_PMA.a(a).setText(((bd)com.bca.mobile.transaction.M_Commerce_PMA.b(a).get(M_Commerce_PMA.c(a))).h()[i]);
        b.a();
    }
}
