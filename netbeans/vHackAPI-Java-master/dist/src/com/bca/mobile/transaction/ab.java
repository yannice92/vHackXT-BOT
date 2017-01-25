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
import android.widget.TextView;
import java.util.ArrayList;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Admin_Hapus_Trans_Ant_Rek

final class ab extends BaseAdapter
{

    ArrayList a;
    final M_Admin_Hapus_Trans_Ant_Rek b;
    private LayoutInflater c;

    public ab(M_Admin_Hapus_Trans_Ant_Rek m_admin_hapus_trans_ant_rek, Context context)
    {
        b = m_admin_hapus_trans_ant_rek;
        super();
        a = null;
        c = LayoutInflater.from(context);
    }

    public final void a(ArrayList arraylist)
    {
        a = arraylist;
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
        view = (String)a.get(i);
        viewgroup = c.inflate(0x7f030034, null);
        CheckBox checkbox = (CheckBox)viewgroup.findViewById(0x7f0b00e5);
        checkbox.setOnCheckedChangeListener(b.f);
        ((TextView)viewgroup.findViewById(0x7f0b00e4)).setText(view);
        checkbox.setTag(Integer.valueOf(i));
        int j = 0;
        do
        {
            if (j >= b.a.size())
            {
                return viewgroup;
            }
            if (((Integer)b.a.get(j)).intValue() == i)
            {
                checkbox.setChecked(true);
            }
            j++;
        } while (true);
    }
}
