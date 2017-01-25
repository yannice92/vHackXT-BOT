// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bca.c.c;
import com.bca.c.g;
import com.bca.mobile.ShareActivity;
import com.bca.mobile.TabSample;
import com.bca.mobile.n;
import com.utilities.r;
import java.util.ArrayList;
import java.util.Hashtable;

public abstract class M_Payment_Service extends ShareActivity
    implements android.widget.AdapterView.OnItemClickListener, android.widget.CompoundButton.OnCheckedChangeListener, c
{

    ImageView T;
    TextView U;
    TextView V;
    RelativeLayout W;
    ArrayList X;
    int Y;
    TextView Z;
    String aA;
    String aB;
    String aC;
    String aD;
    String aE;
    String aF;
    String aG;
    String aH;
    String aI;
    String aJ;
    String aK;
    TextView aa;
    RelativeLayout ab;
    ArrayList ac;
    int ad;
    TextView ae;
    TextView af;
    RelativeLayout ag;
    int ah;
    TextView ai;
    TextView aj;
    RelativeLayout ak;
    ArrayList al;
    int am;
    TextView an;
    TextView ao;
    RelativeLayout ap;
    ArrayList aq;
    int ar;
    TextView as;
    TextView at;
    RelativeLayout au;
    ArrayList av;
    int aw;
    String ax;
    String ay;
    String az;
    ArrayList e;
    ArrayList f;
    ArrayList g;
    ArrayList h;
    Hashtable i;
    int j;
    ImageView k;
    ImageView l;
    ImageView m;
    ImageView n;

    public M_Payment_Service()
    {
        ay = "";
        az = "";
        aA = "";
        aB = "";
        aD = "";
        aE = "";
        aF = "";
        aG = "";
        aH = "";
        aI = "";
        aJ = "";
        aK = "";
    }

    protected abstract void d();

    protected abstract void e();

    protected abstract void j();

    protected abstract void k();

    protected abstract void l();

    protected abstract void m();

    protected abstract void n();

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        j();
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f030059);
        e = (ArrayList)n.m.get("payment");
        f = (ArrayList)n.m.get("label");
        g = (ArrayList)n.m.get("label_pam");
        h = (ArrayList)n.m.get("region_copart");
        U = (TextView)findViewById(0x7f0b01ae);
        V = (TextView)findViewById(0x7f0b01af);
        W = (RelativeLayout)findViewById(0x7f0b01ad);
        k = (ImageView)findViewById(0x7f0b0114);
        Z = (TextView)findViewById(0x7f0b01b1);
        aa = (TextView)findViewById(0x7f0b01b2);
        ab = (RelativeLayout)findViewById(0x7f0b01b0);
        ae = (TextView)findViewById(0x7f0b01bb);
        af = (TextView)findViewById(0x7f0b01bc);
        ag = (RelativeLayout)findViewById(0x7f0b01ba);
        l = (ImageView)findViewById(0x7f0b0152);
        ai = (TextView)findViewById(0x7f0b01be);
        aj = (TextView)findViewById(0x7f0b01bf);
        ak = (RelativeLayout)findViewById(0x7f0b01bd);
        m = (ImageView)findViewById(0x7f0b0156);
        an = (TextView)findViewById(0x7f0b01b4);
        ao = (TextView)findViewById(0x7f0b01b5);
        ap = (RelativeLayout)findViewById(0x7f0b01b3);
        n = (ImageView)findViewById(0x7f0b015a);
        as = (TextView)findViewById(0x7f0b01b7);
        at = (TextView)findViewById(0x7f0b01b8);
        au = (RelativeLayout)findViewById(0x7f0b01b6);
        T = (ImageView)findViewById(0x7f0b01b9);
        W.setOnClickListener(this);
        ak.setOnClickListener(this);
        ag.setOnClickListener(this);
        ab.setOnClickListener(this);
        ap.setOnClickListener(this);
        au.setOnClickListener(this);
        ax = (String)n.m.get("pass_data_1_to_2");
        aC = (String)n.m.get("pass_data_2_to_3");
        d();
        e();
        j();
        k();
        l();
        aK = (String)n.m.get("track_transaction");
        if (!aK.equals(""))
        {
            r.a(getApplicationContext(), (new StringBuilder("mbca_mpaym_")).append(aK).append("_open").toString(), 40);
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        j;
        JVM INSTR tableswitch 0 5: default 44
    //                   0 45
    //                   1 120
    //                   2 126
    //                   3 132
    //                   4 138
    //                   5 167;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        return;
_L2:
        if (Y != i1)
        {
            Y = i1;
            i = (Hashtable)e.get(i1);
            aG = (String)i.get("payee_code");
            j();
            k();
            if (aG.equals("8"))
            {
                m();
                n();
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        ad = i1;
        return;
_L4:
        ah = i1;
        return;
_L5:
        am = i1;
        return;
_L6:
        if (ar != i1)
        {
            ar = i1;
            i = (Hashtable)e.get(i1);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (aw != i1)
        {
            aw = i1;
            i = (Hashtable)e.get(i1);
            return;
        }
        if (true) goto _L1; else goto _L8
_L8:
    }

    protected void onResume()
    {
        super.onResume();
        if (n.am != null)
        {
            n.am.a("Send", true);
        }
        if (n.v == null)
        {
            n.v = new g(this);
        }
        n.v.a(this);
    }
}
