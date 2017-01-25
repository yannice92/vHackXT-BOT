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
//            M_Commerce_PLN, ax

final class at
    implements android.widget.AdapterView.OnItemClickListener
{

    final M_Commerce_PLN a;

    at(M_Commerce_PLN m_commerce_pln)
    {
        a = m_commerce_pln;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        M_Commerce_PLN.a(a).setText(((ax)com.bca.mobile.transaction.M_Commerce_PLN.b(a).get(M_Commerce_PLN.c(a))).h()[i]);
        b.a();
    }
}
