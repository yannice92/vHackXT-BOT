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
//            M_Admin_Aktivasi_Pin_KK

final class s extends BaseAdapter
{

    List a;
    final M_Admin_Aktivasi_Pin_KK b;
    private LayoutInflater c;

    public s(M_Admin_Aktivasi_Pin_KK m_admin_aktivasi_pin_kk, Context context)
    {
        b = m_admin_aktivasi_pin_kk;
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
        String s1 = (String)a.get(i);
        viewgroup = view;
        if (view == null)
        {
            viewgroup = c.inflate(0x7f03003d, null);
        }
        ((TextView)viewgroup.findViewById(0x7f0b00f9)).setText(s1);
        return viewgroup;
    }
}
