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
//            M_Info_Mutasi_Rekening

final class cm extends BaseAdapter
{

    String a[];
    final M_Info_Mutasi_Rekening b;
    private LayoutInflater c;

    public cm(M_Info_Mutasi_Rekening m_info_mutasi_rekening, Context context)
    {
        b = m_info_mutasi_rekening;
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
            viewgroup = c.inflate(0x7f030036, null);
        }
        ((TextView)viewgroup.findViewById(0x7f0b00e9)).setText(s);
        return viewgroup;
    }
}
