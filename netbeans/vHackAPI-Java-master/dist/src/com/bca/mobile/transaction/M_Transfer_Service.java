// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bca.c.g;
import com.bca.mobile.ShareActivity;
import com.bca.mobile.TabSample;
import com.bca.mobile.n;

// Referenced classes of package com.bca.mobile.transaction:
//            i

public abstract class M_Transfer_Service extends ShareActivity
    implements android.widget.AdapterView.OnItemClickListener, android.widget.CompoundButton.OnCheckedChangeListener, i
{

    boolean a;

    public M_Transfer_Service()
    {
        a = false;
    }

    protected static String a(String as[])
    {
        int j1 = as.length;
        String s = "";
        int i1 = 0;
        do
        {
            if (i1 >= j1)
            {
                return s.substring(0, s.length() - 3);
            }
            String s1 = as[i1];
            s = (new StringBuilder(String.valueOf(s))).append(s1).append(":!:").toString();
            i1++;
        } while (true);
    }

    protected final void a(Bundle bundle, int i1)
    {
        super.a(bundle, i1);
        if (n.am != null)
        {
            n.am.a("Send", true);
        }
        d();
        e();
    }

    protected abstract void d();

    protected abstract void e();

    protected final View[] j()
    {
        TextView textview = (TextView)findViewById(0x7f0b01c9);
        TextView textview1 = (TextView)findViewById(0x7f0b01ca);
        RelativeLayout relativelayout = (RelativeLayout)findViewById(0x7f0b01c8);
        relativelayout.setOnClickListener(this);
        return (new View[] {
            textview, textview1, relativelayout
        });
    }

    protected final View[] k()
    {
        TextView textview = (TextView)findViewById(0x7f0b01cc);
        TextView textview1 = (TextView)findViewById(0x7f0b01cd);
        RelativeLayout relativelayout = (RelativeLayout)findViewById(0x7f0b01cb);
        if (!a)
        {
            relativelayout.setOnClickListener(this);
        } else
        {
            relativelayout.setOnClickListener(null);
        }
        return (new View[] {
            textview, textview1, relativelayout
        });
    }

    protected final View[] l()
    {
        TextView textview = (TextView)findViewById(0x7f0b01dd);
        TextView textview1 = (TextView)findViewById(0x7f0b01de);
        RelativeLayout relativelayout = (RelativeLayout)findViewById(0x7f0b01dc);
        relativelayout.setOnClickListener(this);
        return (new View[] {
            textview, textview1, relativelayout
        });
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f03005c);
        if (n.am != null)
        {
            n.am.a("Send", true);
        }
        d();
        e();
    }

    protected void onResume()
    {
        super.onResume();
        if (n.v == null)
        {
            n.v = new g(this);
        }
        n.v.a(this);
    }
}
