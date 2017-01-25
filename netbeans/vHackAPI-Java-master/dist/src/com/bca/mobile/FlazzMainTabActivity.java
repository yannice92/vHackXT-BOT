// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import a.a;
import a.b;
import a.h;
import a.i;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.g.c;
import com.g.d;
import com.g.f;
import dalvik.system.DexClassLoader;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.bca.mobile:
//            m, bn, i, j, 
//            k

public class FlazzMainTabActivity extends ActionBarActivity
{

    public static Timer d;
    public static TimerTask e;
    private static int m = 0;
    private static int n = 5;
    ViewPager a;
    f b;
    ActionBar c;
    NfcAdapter f;
    PendingIntent g;
    IntentFilter h[];
    String i[][];
    Tag j;
    Bundle k;
    Toast l;
    private c o;

    public FlazzMainTabActivity()
    {
        l = null;
    }

    static int a()
    {
        return m;
    }

    static void a(int i1)
    {
        m = i1;
    }

    private void a(int i1, String s)
    {
        char c1;
        c1 = '\u0DAC';
        if (l != null)
        {
            l.cancel();
        }
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        int j1 = 1000;
_L4:
        l = Toast.makeText(getApplicationContext(), s, 0);
        s = (TextView)l.getView().findViewById(0x102000b);
        if (s != null)
        {
            s.setGravity(17);
        }
        l.show();
        (new Handler()).postDelayed(new m(this), j1);
        return;
_L2:
        j1 = c1;
        if (i1 != 1)
        {
            j1 = c1;
            if (i1 != 2)
            {
                j1 = 1000;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static int b()
    {
        return n;
    }

    public void onBackPressed()
    {
        finish();
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030029);
        com.bca.mobile.bn.a(this);
        j = null;
        f = NfcAdapter.getDefaultAdapter(this);
        if (f != null)
        {
            g = PendingIntent.getActivity(this, 0, (new Intent(this, getClass())).addFlags(0x20000000), 0);
            bundle = new IntentFilter("android.nfc.action.NDEF_DISCOVERED");
            try
            {
                bundle.addDataType("*/*");
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw new RuntimeException("fail", bundle);
            }
            h = (new IntentFilter[] {
                bundle
            });
            i = (new String[][] {
                new String[] {
                    android/nfc/tech/IsoDep.getName()
                }
            });
        }
        b = new f(getSupportFragmentManager());
        b.c();
        bundle = getLayoutInflater().inflate(0x7f030070, null);
        c = getSupportActionBar();
        c.setDisplayShowCustomEnabled(true);
        c.setDisplayShowHomeEnabled(false);
        c.setDisplayShowTitleEnabled(false);
        c.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#d2d2d2")));
        c.setDisplayOptions(16);
        c.setIcon(null);
        c.setCustomView(bundle);
        c.setNavigationMode(2);
        a = (ViewPager)findViewById(0x7f0b00b2);
        a.a(new com.bca.mobile.i(this));
        a.a(b);
        a.setBackgroundColor(Color.parseColor("#fcfcfc"));
        bundle = new j(this);
        c.addTab(c.newTab().setText(com.bca.mobile.bn.a(0x7f0c003c)).setTabListener(bundle));
        c.addTab(c.newTab().setText(com.bca.mobile.bn.a(0x7f0c003d)).setTabListener(bundle));
    }

    public void onNewIntent(Intent intent)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        List list;
        Object obj5;
        Object obj6;
        Object obj7;
        boolean flag;
        setIntent(intent);
        a(0, "Loading...");
        flag = true;
        if ("android.nfc.action.TECH_DISCOVERED".equals(getIntent().getAction()))
        {
            j = (Tag)getIntent().getParcelableExtra("android.nfc.extra.TAG");
        }
        obj3 = null;
        obj6 = null;
        obj4 = null;
        obj5 = null;
        list = null;
        obj2 = null;
        obj7 = new File(getCacheDir(), "s.dex");
        if (((File) (obj7)).exists())
        {
            ((File) (obj7)).delete();
        }
        obj1 = list;
        obj = obj6;
        intent = ((Intent) (obj3));
        o = new c(j);
        obj1 = list;
        obj = obj6;
        intent = ((Intent) (obj3));
        if (!o.a())
        {
            flag = false;
        }
        obj1 = list;
        obj = obj6;
        intent = ((Intent) (obj3));
        Object obj8 = getAssets().open("txt/tnc.txt");
        obj1 = list;
        obj = obj6;
        intent = ((Intent) (obj3));
        Object obj9 = new BufferedOutputStream(new FileOutputStream(((File) (obj7))));
        obj1 = list;
        obj = obj6;
        intent = ((Intent) (obj3));
        byte abyte0[] = a.i.a(a.i.a(((InputStream) (obj8))));
        obj1 = list;
        obj = obj6;
        intent = ((Intent) (obj3));
        ((OutputStream) (obj9)).write(abyte0, 0, abyte0.length);
        obj1 = list;
        obj = obj6;
        intent = ((Intent) (obj3));
        ((OutputStream) (obj9)).close();
        obj1 = list;
        obj = obj6;
        intent = ((Intent) (obj3));
        ((InputStream) (obj8)).close();
        obj1 = list;
        obj = obj6;
        intent = ((Intent) (obj3));
        getApplicationContext();
        obj1 = list;
        obj = obj6;
        intent = ((Intent) (obj3));
        obj8 = getDir("outdex", 0);
        obj1 = list;
        obj = obj6;
        intent = ((Intent) (obj3));
        obj9 = new File((new StringBuilder(String.valueOf(((File) (obj8)).getCanonicalPath()))).append("/s.dex").toString());
        obj1 = list;
        obj = obj6;
        intent = ((Intent) (obj3));
        if (!((File) (obj9)).exists())
        {
            break MISSING_BLOCK_LABEL_365;
        }
        obj1 = list;
        obj = obj6;
        intent = ((Intent) (obj3));
        ((File) (obj9)).delete();
        obj1 = list;
        obj = obj6;
        intent = ((Intent) (obj3));
        obj7 = new d(new DexClassLoader(((File) (obj7)).getAbsolutePath(), ((File) (obj8)).getAbsolutePath(), null, getClassLoader()));
        obj1 = list;
        obj = obj6;
        intent = ((Intent) (obj3));
        obj8 = new h();
        obj1 = list;
        obj = obj6;
        intent = ((Intent) (obj3));
        obj3 = ((h) (obj8)).c(((a.j) (obj7)), o);
        obj1 = list;
        obj = obj6;
        intent = ((Intent) (obj3));
        if (!((a) (obj3)).a()) goto _L2; else goto _L1
_L1:
        obj1 = list;
        obj = obj6;
        intent = ((Intent) (obj3));
        obj3 = ((h) (obj8)).a(((a.j) (obj7)), o);
        obj1 = list;
        obj = obj6;
        intent = ((Intent) (obj3));
        obj4 = ((h) (obj8)).b(((a.j) (obj7)), o);
        boolean flag1;
        obj = obj5;
        intent = ((Intent) (obj4));
        obj1 = obj3;
        flag1 = flag;
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_569;
        }
        obj1 = list;
        obj = obj4;
        intent = ((Intent) (obj3));
        obj2 = ((a.c) (obj4)).c();
        obj1 = obj2;
        obj = obj4;
        intent = ((Intent) (obj3));
        list = ((a.c) (obj4)).b();
        obj = list;
        flag1 = flag;
        obj1 = obj3;
        intent = ((Intent) (obj4));
_L11:
        o.b();
        obj4 = intent;
        intent = ((Intent) (obj1));
        obj3 = obj;
        obj1 = obj2;
        obj2 = obj4;
_L7:
        if (!flag1) goto _L4; else goto _L3
_L3:
        k = new Bundle();
        obj = "-";
        obj4 = "-";
        if (intent != null)
        {
            if (intent.a())
            {
                obj = (new StringBuilder(String.valueOf(intent.c()))).toString();
                intent = intent.b();
            } else
            {
                a(1, com.bca.mobile.bn.a(0x7f0c0046));
                intent = ((Intent) (obj4));
            }
        } else
        {
            a(1, com.bca.mobile.bn.a(0x7f0c0046));
            intent = ((Intent) (obj4));
        }
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_1074;
        }
        if (!((a.c) (obj2)).a()) goto _L6; else goto _L5
_L5:
        if (((List) (obj1)).size() > 0 && !((b)((List) (obj1)).get(0)).k().equals(com.bca.mobile.bn.a(0x7f0c0039)) && !((b)((List) (obj1)).get(0)).f().equals(com.bca.mobile.bn.a(0x7f0c0037)))
        {
            obj2 = (new StringBuilder()).append(((b)((List) (obj1)).get(0)).l()).toString();
            obj4 = (new StringBuilder(String.valueOf(((b)((List) (obj1)).get(0)).f()))).toString();
            obj1 = obj2;
            obj2 = intent;
            intent = ((Intent) (obj4));
        } else
        {
            String s = "-";
            obj2 = intent;
            obj1 = "-";
            intent = s;
        }
        k.putString("balance", ((String) (obj)));
        k.putString("cardnumber", ((String) (obj2)));
        k.putString("lasttopupdate", ((String) (obj1)));
        k.putString("lasttopupamt", intent);
        b.a(k);
        b.a(((List) (obj3)));
        if (d != null)
        {
            d.cancel();
            d = null;
        }
        m = 0;
        e = new k(this);
        intent = new Timer();
        d = intent;
        intent.schedule(e, 1000L, 1000L);
        return;
_L2:
        flag1 = false;
        obj = obj5;
        intent = ((Intent) (obj4));
        obj1 = obj3;
        continue; /* Loop/switch isn't completed */
        obj2;
        flag1 = false;
        o.b();
        obj3 = null;
        obj2 = obj;
          goto _L7
        intent;
        o.b();
        throw intent;
_L6:
        intent = "-";
        obj = "-";
_L9:
        a(1, com.bca.mobile.bn.a(0x7f0c0046));
        obj1 = "-";
        obj2 = obj;
        obj = intent;
        intent = "-";
        break MISSING_BLOCK_LABEL_788;
_L4:
        b.a(null);
        b.a(((List) (obj3)));
        a(1, com.bca.mobile.bn.a(0x7f0c0045));
        return;
        Intent intent1 = intent;
        intent = ((Intent) (obj));
        obj = intent1;
        if (true) goto _L9; else goto _L8
_L8:
        if (true) goto _L11; else goto _L10
_L10:
    }

    public void onPause()
    {
        super.onPause();
        if (f != null)
        {
            f.disableForegroundDispatch(this);
        }
    }

    public void onResume()
    {
        super.onResume();
        if (f != null)
        {
            f.enableForegroundDispatch(this, g, h, i);
        }
    }

}
