// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public final class a extends ArrayAdapter
{

    private List a;

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (a.contains(getItem(i)))
        {
            view = LayoutInflater.from(getContext()).inflate(0x7f030067, null);
        } else
        {
            view = LayoutInflater.from(getContext()).inflate(0x7f030066, null);
        }
        ((TextView)view.findViewById(0x7f0b00ed)).setText((CharSequence)getItem(i));
        return view;
    }

    public final boolean isEnabled(int i)
    {
        if (a.contains(getItem(i)))
        {
            return false;
        } else
        {
            return super.isEnabled(i);
        }
    }
}
