// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.app.Activity;
import android.app.Dialog;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.bca.mobile:
//            ShareActivity, n, bn, TabSample

final class ah
    implements android.view.View.OnClickListener
{

    final ShareActivity a;
    private final String b;
    private final String c;
    private final boolean d;
    private final Activity e;
    private final boolean f;
    private final EditText g;
    private final boolean h;
    private final String i[];

    ah(ShareActivity shareactivity, String s, String s1, boolean flag, Activity activity, boolean flag1, EditText edittext, 
            boolean flag2, String as[])
    {
        a = shareactivity;
        b = s;
        c = s1;
        d = flag;
        e = activity;
        f = flag1;
        g = edittext;
        h = flag2;
        i = as;
        super();
    }

    public final void onClick(View view)
    {
        a.D.dismiss();
        if (b.equalsIgnoreCase("close") || c.equalsIgnoreCase("close"))
        {
            n.ao = true;
            bn.a(a, true);
        } else
        if (d)
        {
            if (b.equals(bn.a(0x7f0c0061)))
            {
                n.an = true;
            }
            if (n.am != null)
            {
                TabSample.a(TabSample.a);
            } else
            {
                e.finish();
            }
        }
        if (f)
        {
            a.b(g.getText().toString());
        } else
        if (h)
        {
            a.b(a.L.getText().toString());
        } else
        if (i.length != 0 && i[0].equals("Valas"))
        {
            a.b(a.L.getText().toString());
        }
        a.onResultButtonOK(view);
    }
}
