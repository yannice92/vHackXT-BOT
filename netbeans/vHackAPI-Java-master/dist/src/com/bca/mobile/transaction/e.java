// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.view.View;
import android.widget.CheckBox;
import java.util.ArrayList;

// Referenced classes of package com.bca.mobile.transaction:
//            d

final class e
    implements android.view.View.OnClickListener
{

    final d a;
    private final int b;

    e(d d1, int i)
    {
        a = d1;
        b = i;
        super();
    }

    public final void onClick(View view)
    {
        view = (CheckBox)view;
        a.c.set(b, Boolean.valueOf(view.isChecked()));
    }
}
