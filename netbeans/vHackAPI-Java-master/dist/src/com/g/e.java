// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.g;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public final class e extends Fragment
{

    private TextView aa;
    private TextView ab;
    private TextView ac;
    private TextView ad;
    private TextView ae;
    private TextView af;
    private TextView ag;
    private TextView ah;
    private ImageView ai;
    private View aj;

    public e()
    {
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        aj = layoutinflater.inflate(0x7f03002a, viewgroup, false);
        ai = (ImageView)aj.findViewById(0x7f0b00af);
        ac = (TextView)aj.findViewById(0x7f0b00b9);
        ad = (TextView)aj.findViewById(0x7f0b00ba);
        ab = (TextView)aj.findViewById(0x7f0b00b3);
        aa = (TextView)aj.findViewById(0x7f0b00b4);
        ae = (TextView)aj.findViewById(0x7f0b00b5);
        af = (TextView)aj.findViewById(0x7f0b00b6);
        ag = (TextView)aj.findViewById(0x7f0b00b7);
        ah = (TextView)aj.findViewById(0x7f0b00b8);
        return aj;
    }

    public final void d(Bundle bundle)
    {
        ai.setVisibility(0);
        ac.setVisibility(0);
        ad.setVisibility(0);
        ab.setVisibility(4);
        ae.setVisibility(4);
        ag.setVisibility(4);
        aa.setVisibility(4);
        af.setVisibility(4);
        ah.setVisibility(4);
        if (bundle == null) goto _L2; else goto _L1
_L1:
        DecimalFormat decimalformat;
        ai.setVisibility(4);
        ac.setVisibility(4);
        ad.setVisibility(4);
        ab.setVisibility(0);
        ae.setVisibility(0);
        ag.setVisibility(0);
        aa.setVisibility(0);
        af.setVisibility(0);
        ah.setVisibility(0);
        aa.setText("-");
        af.setText("-");
        ah.setText("-");
        decimalformat = (DecimalFormat)NumberFormat.getNumberInstance(Locale.CHINA);
        decimalformat.applyPattern("###,##0");
        if (bundle.getString("balance") != null)
        {
            String s2 = bundle.getString("balance");
            String s = s2;
            if (!s2.trim().equals("-"))
            {
                s = decimalformat.format(Double.parseDouble(bundle.getString("balance"))).replace(",", ".");
            }
            aa.setText((new StringBuilder("Rp. ")).append(s).toString());
        }
        if (bundle.getString("cardnumber") != null)
        {
            String s3 = bundle.getString("cardnumber");
            String s1 = s3;
            if (s3.length() > 0)
            {
                s1 = s3;
                if (s3.length() == 16)
                {
                    s1 = (new StringBuilder(String.valueOf(s3.substring(0, 4)))).append("-").append(s3.substring(4, 8)).append("-").append(s3.substring(8, 12)).append("-").append(s3.substring(12, 16)).toString();
                }
            }
            af.setText(s1);
        }
        if (bundle.getString("lasttopupamt") == null) goto _L2; else goto _L3
_L3:
        if (bundle.getString("lasttopupdate").length() <= 26) goto _L5; else goto _L4
_L4:
        Object obj;
        Object obj1;
        obj1 = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
        obj = null;
        obj1 = ((SimpleDateFormat) (obj1)).parse(bundle.getString("lasttopupdate"));
        obj = obj1;
_L9:
        SimpleDateFormat simpledateformat = new SimpleDateFormat("dd/MM/yy", Locale.ENGLISH);
        try
        {
            obj = simpledateformat.format(((java.util.Date) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = "-";
        }
_L7:
        bundle = bundle.getString("lasttopupamt");
        if (!bundle.trim().equals("-"))
        {
            bundle = (new StringBuilder("Rp. ")).append(decimalformat.format(Long.parseLong(bundle, 16)).replace(",", ".")).toString();
        }
        ah.setText((new StringBuilder(String.valueOf(obj))).append(" - ").append(bundle).toString());
_L2:
        return;
_L5:
        obj = bundle.getString("lasttopupdate");
        if (true) goto _L7; else goto _L6
_L6:
        ParseException parseexception;
        parseexception;
        if (true) goto _L9; else goto _L8
_L8:
    }
}
