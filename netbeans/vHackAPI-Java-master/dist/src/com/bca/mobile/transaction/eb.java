// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import com.bca.mobile.n;

// Referenced classes of package com.bca.mobile.transaction:
//            ec, TransactionListActivity

public final class eb extends BaseAdapter
{

    int a[];
    final TransactionListActivity b;
    private LayoutInflater c;

    public eb(TransactionListActivity transactionlistactivity, Context context)
    {
        b = transactionlistactivity;
        super();
        a = null;
        c = LayoutInflater.from(context);
    }

    static TransactionListActivity a(eb eb1)
    {
        return eb1.b;
    }

    public final void a(int ai[])
    {
        a = ai;
    }

    public final int getCount()
    {
        return a.length;
    }

    public final Object getItem(int i)
    {
        return Integer.valueOf(a[i]);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        int j = a[i];
        viewgroup = view;
        if (view == null)
        {
            viewgroup = c.inflate(0x7f03003f, null);
        }
        view = (Button)viewgroup.findViewById(0x7f0b00fc);
        view.setBackgroundResource(j);
        j = (int)(0.90000000000000002D * (double)n.c);
        view.setWidth(j);
        view.setHeight((int)((double)j * 0.223D));
        view.setOnClickListener(new ec(this, i));
        return viewgroup;
    }
}
