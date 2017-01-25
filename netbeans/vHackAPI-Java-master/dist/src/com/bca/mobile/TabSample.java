// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.app.Dialog;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;
import com.bca.mobile.tab.TabGroup1InfoActivity;
import com.bca.mobile.tab.TabGroup2TransferActivity;
import com.bca.mobile.tab.TabGroup3PaymentActivity;
import com.bca.mobile.tab.TabGroup4CommerceActivity;
import com.bca.mobile.tab.TabGroup5AdminActivity;
import com.bca.mobile.tab.TabGroupBaseActivity;
import com.f.a;
import com.f.d;
import com.utilities.p;
import java.util.ArrayList;

// Referenced classes of package com.bca.mobile:
//            bx, n, bw, ShareActivity, 
//            bv

public class TabSample extends TabActivity
    implements android.view.View.OnClickListener, android.widget.TabHost.OnTabChangeListener, d
{

    public static int a = 0;
    public InputMethodManager b;
    private boolean c;
    private final String d = "Back";
    private final String e = "m-Info";
    private final String f = "m-Transfer";
    private final String g = "m-Payment";
    private final String h = "m-Commerce";
    private final String i = "m-Admin";
    private TabHost j;
    private int k;
    private Dialog l;
    private EditText m;
    private Button n;
    private Button o;
    private TextView p;
    private ImageView q;
    private Handler r;

    public TabSample()
    {
        j = null;
        k = 1;
        l = null;
        m = null;
        b = null;
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
    }

    public static void a(int i1)
    {
        Object obj;
        int j1;
        j1 = 0;
        obj = null;
        i1;
        JVM INSTR tableswitch 0 4: default 40
    //                   0 48
    //                   1 72
    //                   2 96
    //                   3 120
    //                   4 144;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_144;
_L1:
        i1 = 0;
        break; /* Loop/switch isn't completed */
_L7:
        while (j1 < i1 && i1 > 1 && j1 != i1 - 1) 
        {
            ((TabGroupBaseActivity)obj).onBackPressed();
            j1++;
        }
        return;
_L2:
        i1 = TabGroup1InfoActivity.a.b.size();
        obj = TabGroup1InfoActivity.a.b;
        obj = TabGroup1InfoActivity.a;
          goto _L7
_L3:
        i1 = TabGroup2TransferActivity.a.b.size();
        obj = TabGroup2TransferActivity.a.b;
        obj = TabGroup2TransferActivity.a;
          goto _L7
_L4:
        i1 = TabGroup3PaymentActivity.a.b.size();
        obj = TabGroup3PaymentActivity.a.b;
        obj = TabGroup3PaymentActivity.a;
          goto _L7
_L5:
        i1 = TabGroup4CommerceActivity.a.b.size();
        obj = TabGroup4CommerceActivity.a.b;
        obj = TabGroup4CommerceActivity.a;
          goto _L7
        i1 = TabGroup5AdminActivity.a.b.size();
        obj = TabGroup5AdminActivity.a.b;
        obj = TabGroup5AdminActivity.a;
          goto _L7
    }

    static void a(TabSample tabsample, ImageView imageview)
    {
        tabsample.q = imageview;
    }

    private void a(String s)
    {
        p = (TextView)findViewById(0x7f0b0249);
        p.setVisibility(0);
        p.setText(s);
    }

    private void a(String s, Class class1, int i1, int j1)
    {
        bx bx1 = new bx(this, this, getResources().getDrawable(j1), getResources().getDrawable(i1));
        s = j.newTabSpec(s);
        s.setIndicator(bx1);
        s.setContent(new Intent(this, class1));
        j.addTab(s);
        j.setOnTabChangedListener(this);
    }

    static boolean a(TabSample tabsample)
    {
        return tabsample.c;
    }

    static ImageView b(TabSample tabsample)
    {
        return tabsample.q;
    }

    public final void a(String s, boolean flag)
    {
        n = (Button)findViewById(0x7f0b0247);
        n.setOnClickListener(this);
        n.setTag("RightButton");
        if (n.aM < 6.9000000000000004D)
        {
            if (s.equals("Send"))
            {
                n.setBackgroundDrawable(getResources().getDrawable(0x7f020060));
            } else
            if (s.equals("Edit"))
            {
                n.setBackgroundDrawable(getResources().getDrawable(0x7f02005e));
            } else
            if (s.equals("Done"))
            {
                n.setBackgroundDrawable(getResources().getDrawable(0x7f02005d));
            } else
            if (s.equals("Delete"))
            {
                n.setBackgroundDrawable(getResources().getDrawable(0x7f02005c));
            }
        } else
        if (s.equals("Send"))
        {
            n.setBackgroundDrawable(getResources().getDrawable(0x7f02012d));
        } else
        if (s.equals("Edit"))
        {
            n.setBackgroundDrawable(getResources().getDrawable(0x7f02012b));
        } else
        if (s.equals("Done"))
        {
            n.setBackgroundDrawable(getResources().getDrawable(0x7f02012a));
        } else
        if (s.equals("Delete"))
        {
            n.setBackgroundDrawable(getResources().getDrawable(0x7f020129));
        }
        if (flag)
        {
            n.setVisibility(0);
            return;
        } else
        {
            n.setVisibility(4);
            return;
        }
    }

    public final void c(int i1)
    {
        bw bw1 = new bw(this, i1);
        r.post(bw1);
    }

    public void onClick(View view)
    {
        if (n.al != null)
        {
            n.al.onClick(view);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(bundle);
        int i1 = ((DisplayMetrics) (bundle)).heightPixels;
        int j1;
        int k1;
        if (i1 < 450)
        {
            com.utilities.p.a(0);
        } else
        if (i1 < 700)
        {
            com.utilities.p.a(1);
        } else
        if (n.aM < 7.2000000000000002D)
        {
            com.utilities.p.a(2);
        } else
        {
            com.utilities.p.a(3);
        }
        getWindow().requestFeature(7);
        com.utilities.p.a(this);
        setContentView(0x7f03006e);
        getWindow().setFeatureInt(7, 0x7f03006f);
        r = new Handler();
        k = getIntent().getExtras().getInt("tab seleted");
        j = getTabHost();
        i1 = k;
        j1 = n.c / 6;
        k1 = (int)(1.1100000000000001D * (double)j1);
        bundle = (ImageView)findViewById(0x7f0b0243);
        bundle.getLayoutParams().height = k1;
        bundle.getLayoutParams().width = j1;
        bundle.setBackgroundResource(0x7f0201bc);
        a("m-Info", com/bca/mobile/tab/TabGroup1InfoActivity, 0x7f0201c1, 0x7f0201c2);
        a("m-Transfer", com/bca/mobile/tab/TabGroup2TransferActivity, 0x7f0201c7, 0x7f0201c8);
        a("m-Payment", com/bca/mobile/tab/TabGroup3PaymentActivity, 0x7f0201c4, 0x7f0201c5);
        a("m-Commerce", com/bca/mobile/tab/TabGroup4CommerceActivity, 0x7f0201be, 0x7f0201bf);
        a("m-Admin", com/bca/mobile/tab/TabGroup5AdminActivity, 0x7f0201b8, 0x7f0201b9);
        bundle.setOnClickListener(new bv(this));
        a = i1;
        j.setCurrentTab(i1);
        findViewById(0x1020013).getLayoutParams().height = k1;
        n.am = this;
        a(n.x);
        a("Send", true);
        c = true;
        if (n.y != null)
        {
            n.y.a(this);
        }
        if (q == null)
        {
            q = (ImageView)findViewById(0x7f0b0248);
        }
        q.setVisibility(0);
        q.setBackgroundResource(n.l);
    }

    protected void onDestroy()
    {
        super.onDestroy();
    }

    protected void onResume()
    {
        n.am = this;
        super.onResume();
    }

    public void onTabChanged(String s)
    {
        a(a);
        if (s.equals("Back")) goto _L2; else goto _L1
_L1:
        if (!s.equals("m-Info")) goto _L4; else goto _L3
_L3:
        n.x = getResources().getString(0x7f0c001e);
        a(n.x);
_L2:
        a = j.getCurrentTab();
        return;
_L4:
        if (s.equals("m-Transfer"))
        {
            n.x = getResources().getString(0x7f0c001f);
            a(n.x);
        } else
        if (s.equals("m-Payment"))
        {
            n.x = getResources().getString(0x7f0c0021);
            a(n.x);
        } else
        if (s.equals("m-Commerce"))
        {
            n.x = getResources().getString(0x7f0c0022);
            a(n.x);
        } else
        if (s.equals("m-Admin"))
        {
            n.x = getResources().getString(0x7f0c0020);
            a(n.x);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

}
