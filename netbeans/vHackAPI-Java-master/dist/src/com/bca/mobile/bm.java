// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.List;

// Referenced classes of package com.bca.mobile:
//            n, ShareActivity

public final class bm extends ArrayAdapter
{

    RelativeLayout a;
    int b[];
    boolean c;
    TextView d;
    ImageView e;
    final ShareActivity f;
    private List g;

    public bm(ShareActivity shareactivity, Context context, List list, List list1)
    {
        f = shareactivity;
        super(context, 0, list);
        a = null;
        b = null;
        g = null;
        d = null;
        e = null;
        g = list1;
        c = false;
    }

    public final void a(int ai[])
    {
        b = ai;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        view = (String)getItem(i);
        int j = b[i];
        if (g.contains(getItem(i)))
        {
            view = LayoutInflater.from(getContext()).inflate(0x7f030067, null);
            ((TextView)view.findViewById(0x7f0b00ed)).setText((CharSequence)getItem(i));
            return view;
        }
        viewgroup = LayoutInflater.from(getContext()).inflate(0x7f030066, null);
        a = (RelativeLayout)viewgroup.findViewById(0x7f0b022b);
        d = (TextView)viewgroup.findViewById(0x7f0b00ed);
        e = (ImageView)viewgroup.findViewById(0x7f0b022c);
        if (c && i == getCount() - 1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            if (j == 1)
            {
                a.setBackgroundResource(0x7f020043);
                d.setTextColor(-1);
                if (n.aM >= 5D)
                {
                    e.setBackgroundResource(0x7f020158);
                } else
                {
                    e.setBackgroundResource(0x7f02008c);
                }
            } else
            {
                if (n.aM >= 5D)
                {
                    e.setBackgroundResource(0x7f020157);
                } else
                {
                    e.setBackgroundResource(0x7f02008b);
                }
                a.setBackgroundResource(0x7f020044);
                d.setTextColor(f.getResources().getColor(0x7f08003d));
            }
            e.setVisibility(0);
            d.setText(view);
        }
        return viewgroup;
    }

    public final boolean isEnabled(int i)
    {
        if (g.contains(getItem(i)))
        {
            return false;
        } else
        {
            return super.isEnabled(i);
        }
    }
}
