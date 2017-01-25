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
import java.util.List;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Info_Rek_Deposito

final class cp extends BaseAdapter
{

    List a;
    final M_Info_Rek_Deposito b;
    private LayoutInflater c;

    public cp(M_Info_Rek_Deposito m_info_rek_deposito, Context context)
    {
        b = m_info_rek_deposito;
        super();
        a = null;
        c = LayoutInflater.from(context);
    }

    public final void a(List list)
    {
        a = list;
    }

    public final int getCount()
    {
        return a.size();
    }

    public final Object getItem(int i)
    {
        return a.get(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        String s = (String)a.get(i);
        viewgroup = view;
        if (view == null)
        {
            viewgroup = c.inflate(0x7f03003d, null);
        }
        ((TextView)viewgroup.findViewById(0x7f0b00f9)).setText(s);
        return viewgroup;
    }
}
