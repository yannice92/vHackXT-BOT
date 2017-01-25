// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

public final class bt extends BaseAdapter
{

    List a;
    private LayoutInflater b;

    public bt(Context context)
    {
        a = null;
        b = LayoutInflater.from(context);
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
            viewgroup = b.inflate(0x7f03003d, null);
        }
        ((TextView)viewgroup.findViewById(0x7f0b00f9)).setText(s);
        return viewgroup;
    }
}
