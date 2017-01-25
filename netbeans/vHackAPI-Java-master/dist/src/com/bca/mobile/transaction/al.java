// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Commerce_Lainnya

final class al
    implements android.view.View.OnClickListener
{

    final M_Commerce_Lainnya a;

    al(M_Commerce_Lainnya m_commerce_lainnya)
    {
        a = m_commerce_lainnya;
        super();
    }

    public final void onClick(View view)
    {
        if (a.y.isActive())
        {
            a.y.hideSoftInputFromWindow(a.a.getWindowToken(), 0);
        }
    }
}
