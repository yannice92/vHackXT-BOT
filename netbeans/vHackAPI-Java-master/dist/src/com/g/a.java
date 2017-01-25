// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.g;

import a.b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.bca.mobile.bn;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.g:
//            b

public final class a extends BaseAdapter
{

    private List a;
    private LayoutInflater b;
    private int c;
    private Context d;

    public a(Context context, List list, int i)
    {
        a = list;
        b = (LayoutInflater)context.getSystemService("layout_inflater");
        c = i;
        d = context;
    }

    public final int getCount()
    {
        return a.size() - c;
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
label0:
        {
            if (view == null)
            {
                view = b.inflate(0x7f030043, null);
                viewgroup = new com.g.b();
                viewgroup.a = (TextView)view.findViewById(0x7f0b010a);
                viewgroup.b = (TextView)view.findViewById(0x7f0b010b);
                viewgroup.c = (TextView)view.findViewById(0x7f0b010c);
                viewgroup.d = (ImageView)view.findViewById(0x7f0b0109);
                view.setTag(viewgroup);
            } else
            {
                viewgroup = (com.g.b)view.getTag();
            }
            if (a != null && a.size() > 0)
            {
                b b1 = (b)a.get(i);
                Object obj = b1.l().toString();
                String s = b1.a();
                Object obj1 = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
                SimpleDateFormat simpledateformat;
                try
                {
                    obj = ((SimpleDateFormat) (obj1)).parse(((String) (obj)));
                }
                catch (ParseException parseexception)
                {
                    parseexception.printStackTrace();
                    parseexception = null;
                }
                obj1 = "";
                simpledateformat = new SimpleDateFormat("dd/MM/yy  HH:mm:ss", Locale.ENGLISH);
                try
                {
                    obj = simpledateformat.format(((Date) (obj)));
                }
                catch (Exception exception)
                {
                    exception = ((Exception) (obj1));
                }
                obj1 = (DecimalFormat)NumberFormat.getNumberInstance(Locale.CHINA);
                ((DecimalFormat) (obj1)).applyPattern("###,##0");
                ((com.g.b) (viewgroup)).a.setText((new StringBuilder("Transaksi ")).append(b1.b()).toString());
                ((com.g.b) (viewgroup)).b.setText((new StringBuilder()).append(((String) (obj))).toString());
                ((com.g.b) (viewgroup)).c.setText((new StringBuilder("Rp. ")).append(((DecimalFormat) (obj1)).format(Double.parseDouble(b1.g().replace(".", "").substring(3))).replace(",", ".")).toString());
                if (!s.equals(bn.a(0x7f0c0032)))
                {
                    break label0;
                }
                ((com.g.b) (viewgroup)).d.setImageResource(0x7f02007f);
            }
            return view;
        }
        if (s.equals(bn.a(0x7f0c0034)))
        {
            ((com.g.b) (viewgroup)).d.setImageResource(0x7f020081);
            return view;
        }
        if (s.equals(bn.a(0x7f0c0033)))
        {
            ((com.g.b) (viewgroup)).d.setImageResource(0x7f020080);
            return view;
        }
        if (s.equals(bn.a(0x7f0c0035)))
        {
            ((com.g.b) (viewgroup)).d.setImageResource(0x7f020080);
            return view;
        }
        if (s.equals(bn.a(0x7f0c0036)))
        {
            ((com.g.b) (viewgroup)).d.setImageResource(0x7f020080);
            return view;
        } else
        {
            ((com.g.b) (viewgroup)).d.setImageResource(0x7f02007e);
            return view;
        }
    }
}
