// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Transfer_Dafter_Bank

final class dh extends BaseAdapter
{

    String a[];
    final M_Transfer_Dafter_Bank b;
    private LayoutInflater c;

    public dh(M_Transfer_Dafter_Bank m_transfer_dafter_bank, Context context)
    {
        b = m_transfer_dafter_bank;
        super();
        a = null;
        c = LayoutInflater.from(context);
    }

    public final void a(String as[])
    {
        a = as;
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
        String s = a[i];
        viewgroup = view;
        if (view == null)
        {
            viewgroup = c.inflate(0x7f030038, null);
        }
        ((TextView)viewgroup.findViewById(0x7f0b00ee)).setText(s);
        return viewgroup;
    }
}
