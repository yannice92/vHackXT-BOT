// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import com.bca.c.c;
import com.bca.mobile.ShareActivity;
import com.bca.mobile.bn;
import com.bca.mobile.n;
import com.f.a;
import com.h.b;
import java.util.Timer;

// Referenced classes of package com.bca.mobile.transaction:
//            eb, ea

public class TransactionListActivity extends ShareActivity
    implements c
{

    private final int a = 0;
    private final int b = 1;
    private final int c = 2;
    private final int d = 3;
    private final int e = 4;
    private ListView f;
    private eb g;
    private ImageView h;
    private Animation i;
    private Timer j;

    public TransactionListActivity()
    {
    }

    static void a(TransactionListActivity transactionlistactivity)
    {
        transactionlistactivity.h.startAnimation(transactionlistactivity.i);
    }

    protected final void a()
    {
    }

    public final void a(int k)
    {
    }

    public final void a(int k, String as[])
    {
    }

    protected final void a(String s)
    {
    }

    protected final void b()
    {
        bn.a(this, false);
    }

    public final void b(String s)
    {
    }

    public final void c()
    {
    }

    public void onBackPressed()
    {
        bn.a();
        bn.a("isLogin", "0");
        n.aw = true;
        if (n.y != null)
        {
            n.y.c();
            n.y = null;
        }
        n.an = true;
        super.onBackPressed();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
    }

    public void onClick(View view)
    {
        super.onClick(view);
    }

    protected void onCreate(Bundle bundle)
    {
        int k;
        if (n.c >= 720 && n.aM > 6.9000000000000004D)
        {
            super.a(bundle, 0x7f030074, this);
        } else
        if (n.c >= 600 && n.aM > 4.7999999999999998D)
        {
            super.a(bundle, 0x7f030073, this);
        } else
        {
            super.a(bundle, 0x7f030072, this);
        }
        bundle = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(bundle);
        k = ((DisplayMetrics) (bundle)).heightPixels;
        if (k < 450)
        {
            findViewById(0x7f0b0075).getLayoutParams().height = (int)(50F * getResources().getDisplayMetrics().density + 0.5F);
        } else
        if (k < 700)
        {
            findViewById(0x7f0b0075).getLayoutParams().height = (int)(60F * getResources().getDisplayMetrics().density + 0.5F);
        } else
        if (n.aM < 7.2000000000000002D)
        {
            findViewById(0x7f0b0075).getLayoutParams().height = (int)(70F * getResources().getDisplayMetrics().density + 0.5F);
        } else
        {
            findViewById(0x7f0b0075).getLayoutParams().height = (int)(130F * getResources().getDisplayMetrics().density + 0.5F);
        }
        super.e(bn.a(0x7f0c002a));
        super.c(getResources().getString(0x7f0c001d));
        n.h = true;
        com.h.b.d();
        if (n.j == null)
        {
            bundle = ((PowerManager)getApplicationContext().getSystemService("power")).newWakeLock(1, getClass().getCanonicalName());
            n.j = bundle;
            bundle.acquire();
        }
        if (bn.b("upgradeProvis", "0").equals("1"))
        {
            bn.a("upgradeProvis", "0");
        }
        if (n.V != null && !n.V.equals(""))
        {
            bundle = n.V.split(":!:", -1);
            if (bundle[0].equals("UF"))
            {
                g();
                b.b = 1000;
                String s = bundle[1];
                String s2 = bundle[2];
                String s4 = bundle[3];
                bn.a("latestVersion", bundle[4]);
                a(s, this, s2, s4);
            } else
            if (bundle[0].equals("UNF"))
            {
                String s1 = bundle[1];
                String s3 = bundle[2].split(":@:", -1)[1];
                String s5 = bundle[2].split(":@:", -1)[0];
                String s6 = bundle[3];
                String s7 = bundle[4];
                if (bundle.length > 4)
                {
                    bundle = bundle[5];
                } else
                {
                    bundle = "0";
                }
                if (bn.b("counterVersion", "-1").equals("-1"))
                {
                    bn.a("counterVersion", "0");
                }
                if (bn.b("latestVersion", "0").compareTo(s7) > 0)
                {
                    bn.a("upgradeNotif", "0");
                    bn.a("latestVersion", s7);
                    bn.a("counterVersion", bundle);
                } else
                if (bn.b("latestVersion", "0").compareTo(s7) == 0)
                {
                    if (bn.b("counterVersion", "0").compareTo(bundle) < 0)
                    {
                        bn.a("upgradeNotif", "0");
                        bn.a("counterVersion", bundle);
                        a(s1, this, s3, s5, s6);
                    } else
                    if (bn.b("counterVersion", "0").compareTo(bundle) == 0 && bn.b("upgradeNotif", "0").equals("0"))
                    {
                        a(s1, this, s3, s5, s6);
                    }
                } else
                {
                    bn.a("upgradeNotif", "0");
                    bn.a("latestVersion", s7);
                    bn.a("counterVersion", bundle);
                    a(s1, this, s3, s5, s6);
                }
            }
        }
        bundle = new com.bca.c.a(this);
        n.u = bundle;
        bundle.a(null);
        if (bn.b("isProvision", "0").equals("1"))
        {
            n.l = 0x7f0200a9;
            super.a(true);
            n.u.b();
        } else
        {
            n.l = 0x7f0200a8;
            super.a(true);
        }
        f = (ListView)findViewById(0x7f0b0252);
        g = new eb(this, this);
        g.a(new int[] {
            0x7f020057, 0x7f020059, 0x7f020058, 0x7f020056, 0x7f020055
        });
        f.setAdapter(g);
        g.notifyDataSetChanged();
        f.invalidate();
        h = (ImageView)findViewById(0x7f0b0073);
        i = AnimationUtils.loadAnimation(this, 0x7f04000c);
        j = new Timer();
        j.schedule(new ea(this), 0L, 4500L);
    }

    protected void onDestroy()
    {
        bn.a();
        if (j != null)
        {
            j.cancel();
            j = null;
        }
        super.onDestroy();
    }

    public void onItemClick(AdapterView adapterview, View view, int k, long l)
    {
    }

    protected void onPause()
    {
        super.onPause();
    }

    protected void onRestart()
    {
        super.onRestart();
    }

    public void onResultButtonCancel(View view)
    {
    }

    public void onResultButtonOK(View view)
    {
    }

    protected void onResume()
    {
        super.onResume();
        bn.a("isProvision", "1");
        n.h = true;
        if (n.an)
        {
            finish();
        } else
        {
            if (n.u != null)
            {
                n.u.a(this);
            }
            n.aw = false;
            bn.a("isLogin", "1");
            super.a(true);
            if (n.g)
            {
                n.g = false;
                return;
            }
        }
    }

    protected void onStart()
    {
        super.onStart();
    }

    protected void onStop()
    {
        super.onStop();
    }
}
