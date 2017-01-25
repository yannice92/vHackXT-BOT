// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.content.Context;
import android.widget.Toast;
import com.bca.b.a;
import com.bca.b.b;

// Referenced classes of package com.bca.mobile:
//            n

public final class af
    implements a, Runnable
{

    private Context a;
    private Thread b;
    private String c;

    public af(Context context, String s)
    {
        a = context;
        b = new Thread(this);
        c = s;
    }

    public final void a()
    {
        b.start();
    }

    public final void b()
    {
        Toast.makeText(a, "SMS Sent", 0).show();
    }

    public final void run()
    {
        com.bca.b.b.a(a, n.C, c, this);
    }
}
