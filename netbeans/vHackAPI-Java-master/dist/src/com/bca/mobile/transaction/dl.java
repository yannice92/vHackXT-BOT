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
//            dn, dm, M_Transfer_Detail_Status_Sakuku

final class dl extends BaseAdapter
{

    String a[];
    String b[];
    ArrayList c;
    final M_Transfer_Detail_Status_Sakuku d;
    private LayoutInflater e;

    public dl(M_Transfer_Detail_Status_Sakuku m_transfer_detail_status_sakuku, Context context)
    {
        d = m_transfer_detail_status_sakuku;
        super();
        a = new String[0];
        b = new String[0];
        c = null;
        e = LayoutInflater.from(context);
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
        if (view == null)
        {
            viewgroup = new dn(this);
            view = e.inflate(0x7f030032, null);
            viewgroup.a = (CheckBox)view.findViewById(0x7f0b00e3);
            viewgroup.b = (TextView)view.findViewById(0x7f0b00e2);
            viewgroup.c = (ImageView)view.findViewById(0x7f0b00e1);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (dn)view.getTag();
        }
        ((dn) (viewgroup)).a.setChecked(((Boolean)c.get(i)).booleanValue());
        ((dn) (viewgroup)).b.setText(a[i]);
        ((dn) (viewgroup)).a.setOnClickListener(new dm(this, i));
        viewgroup = (RelativeLayout)view.findViewById(0x7f0b00e0);
        if (getCount() == 1)
        {
            viewgroup.setBackgroundResource(0x7f020106);
        } else
        if (getCount() == 2)
        {
            if (i == 0)
            {
                viewgroup.setBackgroundResource(0x7f0200ea);
                return view;
            }
            if (i == 1)
            {
                viewgroup.setBackgroundResource(0x7f0200e1);
                return view;
            }
        } else
        {
            if (i == 0)
            {
                viewgroup.setBackgroundResource(0x7f0200ea);
                return view;
            }
            if (i == getCount() - 1)
            {
                viewgroup.setBackgroundResource(0x7f0200e1);
                return view;
            } else
            {
                viewgroup.setBackgroundResource(0x7f0200e3);
                return view;
            }
        }
        return view;
    }
}
