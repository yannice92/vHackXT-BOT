// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.view.View;
import android.widget.AdapterView;
import com.d.b;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Commerce_PLN

final class as
    implements android.widget.AdapterView.OnItemClickListener
{

    final M_Commerce_PLN a;

    as(M_Commerce_PLN m_commerce_pln)
    {
        a = m_commerce_pln;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a.e(i);
        b.a();
    }
}
