// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.d;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import java.util.HashMap;

// Referenced classes of package com.d:
//            b, a

final class d
    implements android.view.View.OnClickListener
{

    private final int a;
    private final int b;
    private final a c;
    private final int d;

    d(int i, int j, a a1, int k)
    {
        a = i;
        b = j;
        c = a1;
        d = k;
        super();
    }

    public final void onClick(View view)
    {
        view = new HashMap();
        view.put("MIN", Integer.valueOf(a));
        view.put("MAX", Integer.valueOf(b));
        view.put("TEXT", b.b.getText().toString());
        c.a(d, view);
    }
}
