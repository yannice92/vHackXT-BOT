// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import com.bca.mobile.transaction.g;
import com.bca.mobile.transaction.j;
import java.util.ArrayList;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile:
//            ShareActivity

final class bj
    implements android.view.View.OnClickListener
{

    final ShareActivity a;
    private final long b;
    private final int c;
    private final ArrayList d;
    private final Activity e;

    bj(ShareActivity shareactivity, long l, int i, ArrayList arraylist, Activity activity)
    {
        a = shareactivity;
        b = l;
        c = i;
        d = arraylist;
        e = activity;
        super();
    }

    public final void onClick(View view)
    {
        view = new Hashtable();
        if (a.J != null)
        {
            if (a.J.size() != 0)
            {
                view.put(g.r, Boolean.valueOf(false));
                view.put(g.s, Boolean.valueOf(true));
                view.put(g.t, a.getString(0x7f0c0053));
                view.put(g.b, new Boolean(a.K));
                view.put(g.x, new Integer("0"));
                view.put(g.y, Long.valueOf(b));
                view.put(g.v, Integer.valueOf(0));
                view.put(g.w, Integer.valueOf(c));
                view.put(g.q, d);
                view.put(g.A, a.H);
            } else
            {
                view.put(g.t, a.getString(0x7f0c0053));
                view.put(g.b, new Boolean(true));
                view.put(g.x, new Integer("0"));
                view.put(g.y, Long.valueOf(b));
                view.put(g.v, Integer.valueOf(0));
                view.put(g.w, Integer.valueOf(c));
                view.put(g.A, "");
            }
        } else
        {
            view.put(g.t, a.getString(0x7f0c0053));
            view.put(g.b, new Boolean(true));
            view.put(g.x, new Integer("0"));
            view.put(g.y, Long.valueOf(b));
            view.put(g.v, Integer.valueOf(0));
            view.put(g.w, Integer.valueOf(c));
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
        a.B = new j(e, view, a, a);
        a.B.show();
    }
}
