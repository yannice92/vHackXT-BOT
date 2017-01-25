// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;

// Referenced classes of package com.bca.mobile.transaction:
//            f, e, InboxActivity1

final class d extends BaseAdapter
{

    String a[];
    String b[];
    ArrayList c;
    final InboxActivity1 d;
    private LayoutInflater e;

    public d(InboxActivity1 inboxactivity1, Context context)
    {
        d = inboxactivity1;
        super();
        a = new String[0];
        b = new String[0];
        c = null;
        e = LayoutInflater.from(context);
    }

    public final ArrayList a()
    {
        return c;
    }

    public final void a(String as[])
    {
        a = as;
        c = new ArrayList();
        int i = 0;
        do
        {
            if (i >= as.length)
            {
                return;
            }
            c.add(Boolean.valueOf(false));
            i++;
        } while (true);
    }

    public final void b(String as[])
    {
        b = as;
    }

    public final int getCount()
    {
        return a.length;
    }

    public final Object getItem(int i)
    {
        return a[i];
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        String s;
        RelativeLayout relativelayout;
        s = b[i];
        if (view == null)
        {
            viewgroup = new f(this);
            view = e.inflate(0x7f030032, null);
            viewgroup.a = (CheckBox)view.findViewById(0x7f0b00e3);
            viewgroup.b = (TextView)view.findViewById(0x7f0b00e2);
            viewgroup.c = (ImageView)view.findViewById(0x7f0b00e1);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (f)view.getTag();
        }
        ((f) (viewgroup)).a.setChecked(((Boolean)c.get(i)).booleanValue());
        ((f) (viewgroup)).b.setText(a[i]);
        ((f) (viewgroup)).a.setOnClickListener(new e(this, i));
        relativelayout = (RelativeLayout)view.findViewById(0x7f0b00e0);
        if (getCount() != 1) goto _L2; else goto _L1
_L1:
        relativelayout.setBackgroundResource(0x7f020106);
_L11:
        if (InboxActivity1.a(d)) goto _L4; else goto _L3
_L3:
        ((f) (viewgroup)).a.setVisibility(8);
        if (!s.equals("on")) goto _L6; else goto _L5
_L5:
        ((f) (viewgroup)).c.setBackgroundResource(0x7f020087);
_L8:
        return view;
_L2:
        if (getCount() == 2)
        {
            if (i == 0)
            {
                relativelayout.setBackgroundResource(0x7f0200ea);
            } else
            if (i == 1)
            {
                relativelayout.setBackgroundResource(0x7f0200e1);
            }
        } else
        if (i == 0)
        {
            relativelayout.setBackgroundResource(0x7f0200ea);
        } else
        if (i == getCount() - 1)
        {
            relativelayout.setBackgroundResource(0x7f0200e1);
        } else
        {
            relativelayout.setBackgroundResource(0x7f0200e3);
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (!s.equals("off")) goto _L8; else goto _L7
_L7:
        ((f) (viewgroup)).c.setBackgroundResource(0x7f020086);
        return view;
_L4:
        ((f) (viewgroup)).a.setVisibility(0);
        if (s.equals("on"))
        {
            ((f) (viewgroup)).c.setBackgroundResource(0x7f020087);
            return view;
        }
        if (!s.equals("off")) goto _L8; else goto _L9
_L9:
        ((f) (viewgroup)).c.setBackgroundResource(0x7f020086);
        return view;
        if (true) goto _L11; else goto _L10
_L10:
    }
}
