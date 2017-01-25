// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import com.bca.mobile.transaction.g;
import com.bca.mobile.transaction.j;
import java.util.Hashtable;
import java.util.List;

// Referenced classes of package com.bca.mobile:
//            ShareActivity

final class bk
    implements android.view.View.OnClickListener
{

    final ShareActivity a;
    private final List b;
    private final Activity c;

    bk(ShareActivity shareactivity, List list, Activity activity)
    {
        a = shareactivity;
        b = list;
        c = activity;
        super();
    }

    public final void onClick(View view)
    {
        view = new Hashtable();
        if (b != null && b.size() != 0)
        {
            view.put(g.r, new Boolean(false));
            view.put(g.s, new Boolean(true));
            view.put(g.t, a.getString(0x7f0c0057));
            view.put(g.b, new Boolean(false));
            view.put(g.x, new Integer("0"));
            view.put(g.y, new Long(0x1869fL));
            view.put(g.v, Integer.valueOf(0));
            view.put(g.w, new Integer(0x1869f));
            view.put(g.q, b);
        } else
        {
            view.put(g.t, a.getString(0x7f0c0057));
            view.put(g.A, "");
        }
        view.put(g.f, a.getString(0x7f0c0077));
        view.put(g.g, a.getString(0x7f0c007b));
        view.put(g.h, a.getString(0x7f0c007c));
        if (a.B != null)
        {
            a.B.cancel();
            a.B = null;
        }
        a.B = new j(c, view, a, a);
        a.B.show();
    }
}
