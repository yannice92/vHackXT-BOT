// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.app.Dialog;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.nfc.tech.MifareClassic;
import android.nfc.tech.MifareUltralight;
import android.nfc.tech.Ndef;
import android.nfc.tech.NdefFormatable;
import android.nfc.tech.NfcA;
import android.nfc.tech.NfcB;
import android.nfc.tech.NfcF;
import android.nfc.tech.NfcV;
import android.os.Bundle;
import android.os.Handler;
import android.os.StrictMode;
import android.text.Editable;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.bca.c.b;
import com.bca.c.c;
import com.bca.mobile.transaction.TransactionListActivity;
import com.c.a;
import com.f.e;
import com.utilities.r;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Timer;

// Referenced classes of package com.bca.mobile:
//            ShareActivity, s, InputATMActivity, n, 
//            bq, bn, v, w, 
//            TermAndConditionActivity, x, z, ChangePasswordActivity, 
//            FlazzMainTabActivity, AboutActivity, t

public class MainActivity extends ShareActivity
    implements c, e
{

    private final int T = 1;
    private final int U = 3;
    private final int V = 4;
    private EditText W;
    private ImageView X;
    private Button Y;
    private Button Z;
    Handler a;
    private Button aa;
    private Button ab;
    private Button ac;
    private Button ad;
    private Dialog ae;
    private Button af;
    private Button ag;
    private Timer ah;
    WebView b;
    WebSettings c;
    NfcAdapter d;
    PendingIntent e;
    IntentFilter f[];
    String g[][];
    Toast h;
    TextView i;
    ImageView j;
    Animation k;
    ProgressDialog l;
    HttpURLConnection m;
    Timer n;

    public MainActivity()
    {
        a = new s(this);
    }

    private String a(InputStream inputstream)
    {
        Object obj1;
        int i1;
        obj1 = null;
        i1 = 0;
        if (m != null)
        {
            i1 = m.getContentLength();
        }
        if (i1 > 0) goto _L2; else goto _L1
_L1:
        Object obj;
        try
        {
            throw new RuntimeException("Can't get the file size");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            obj = null;
        }
        finally
        {
            obj = obj1;
        }
_L10:
        inputstream = ((InputStream) (obj));
        ((IOException) (obj1)).printStackTrace();
        String s1;
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                inputstream.printStackTrace();
            }
        }
        return null;
_L2:
        if (inputstream != null) goto _L4; else goto _L3
_L3:
        throw new RuntimeException("stream is null");
_L8:
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        throw inputstream;
_L4:
        obj = new BufferedReader(new InputStreamReader(inputstream));
        obj1 = "";
_L6:
        inputstream = ((InputStream) (obj));
        s1 = ((BufferedReader) (obj)).readLine();
        if (s1 == null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                inputstream.printStackTrace();
                return ((String) (obj1));
            }
            return ((String) (obj1));
        }
        inputstream = ((InputStream) (obj));
        obj1 = (new StringBuilder(String.valueOf(obj1))).append(s1).toString();
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
        obj = inputstream;
        inputstream = exception;
        if (true) goto _L8; else goto _L7
_L7:
        exception;
        if (true) goto _L10; else goto _L9
_L9:
    }

    static void a(MainActivity mainactivity)
    {
        mainactivity.j.startAnimation(mainactivity.k);
    }

    static void a(MainActivity mainactivity, String s1)
    {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(s1));
        mainactivity.startActivity(intent);
    }

    static void b(MainActivity mainactivity)
    {
        mainactivity.startActivity(new Intent(mainactivity, com/bca/mobile/InputATMActivity));
    }

    private boolean j()
    {
        a a1 = new a(this);
        String as[];
        com.utilities.e e1;
        String as1[];
        int j1;
        as = n.ak;
        e1 = n.af;
        j1 = as.length;
        as1 = new String[j1];
        int i1 = 0;
_L2:
        if (i1 < j1)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        a1.b(as1);
        a1.b();
        return true;
        Object obj;
        boolean flag;
        if (i1 != 1 && i1 != 9 && i1 != 11 && i1 != 12 && i1 != 13 && i1 != 15)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        as1[i1] = e1.a(as[i1]);
        break MISSING_BLOCK_LABEL_150;
        as1[i1] = as[i1];
        break MISSING_BLOCK_LABEL_150;
        obj;
        Log.e("Profile", "Update Profile Failed", ((Throwable) (obj)));
        a1.b();
        return false;
        obj;
        a1.b();
        throw obj;
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private boolean j(String s1)
    {
        boolean flag = false;
        Object obj = null;
        PackageManager packagemanager = getPackageManager();
        try
        {
            s1 = packagemanager.getPackageInfo(s1, 0);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            s1 = obj;
        }
        if (s1 != null)
        {
            flag = true;
        }
        return flag;
    }

    private void k()
    {
        int i1 = (int)(70F * getResources().getDisplayMetrics().density + 0.5F);
        int j1 = (int)(55F * getResources().getDisplayMetrics().density + 0.5F);
        int k1 = (int)(44F * getResources().getDisplayMetrics().density + 0.5F);
        int l1 = (int)(149F * getResources().getDisplayMetrics().density + 0.5F);
        int i2 = (int)(214F * getResources().getDisplayMetrics().density + 0.5F);
        int j2 = (int)(120F * getResources().getDisplayMetrics().density + 0.5F);
        Object obj = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(((DisplayMetrics) (obj)));
        int k2 = ((DisplayMetrics) (obj)).heightPixels;
        LinearLayout linearlayout;
        if (n.aM > 6.9000000000000004D)
        {
            obj = new android.widget.LinearLayout.LayoutParams(i2, i1);
        } else
        if (k2 > 320 && n.aM > 3.7999999999999998D)
        {
            obj = new android.widget.LinearLayout.LayoutParams(l1, j1);
        } else
        {
            obj = new android.widget.LinearLayout.LayoutParams(j2, k1);
        }
        ae = new Dialog(this);
        ae.getWindow().requestFeature(1);
        ae.getWindow().setBackgroundDrawableResource(0x7f0201da);
        ae.getWindow().setSoftInputMode(5);
        ae.setContentView(0x7f030076);
        W = (EditText)ae.findViewById(0x7f0b0257);
        W.setKeyListener(new bq());
        W.setInputType(0x80000);
        linearlayout = (LinearLayout)ae.findViewById(0x7f0b0258);
        af = new Button(this);
        ag = new Button(this);
        af.setOnClickListener(this);
        ag.setOnClickListener(this);
        a("login", af);
        a("cancel", ag);
        obj.weight = 1.0F;
        linearlayout.addView(ag, ((android.view.ViewGroup.LayoutParams) (obj)));
        linearlayout.addView(af, ((android.view.ViewGroup.LayoutParams) (obj)));
        ae.show();
    }

    private boolean l()
    {
        switch (com.bca.c.b.a(this))
        {
        default:
            com.bca.mobile.bn.a("major", n.H);
            return true;

        case 1: // '\001'
        case 2: // '\002'
            E = 3;
            a(null, com.bca.mobile.bn.a(0x7f0c0065), this, true, com.bca.mobile.bn.a(0x7f0c0062));
            return false;

        case 3: // '\003'
            return false;

        case 4: // '\004'
            E = 3;
            break;
        }
        a(null, (new StringBuilder(String.valueOf(com.bca.mobile.bn.a(0x7f0c0064)))).append("FAIL_GET_PROFILE").toString(), this, true, com.bca.mobile.bn.a(0x7f0c0062));
        return false;
    }

    protected final void a()
    {
    }

    public final void a(int i1)
    {
    }

    public final void a(int i1, String as[])
    {
    }

    protected final void a(String s1)
    {
    }

    public final void a(String s1, String as[])
    {
    }

    protected final void b()
    {
    }

    public final void b(String s1)
    {
    }

    public final void c()
    {
    }

    public final String d()
    {
        String s1;
        s1 = (new StringBuilder(String.valueOf(com.bca.mobile.bn.a(0x7f0c0014)))).append("://").append(n.F).append(":").append(n.G).append("/mbca/HTTPHandler?action=apk").toString();
        if (n.aq.contains("Nokia"))
        {
            s1 = (new StringBuilder(String.valueOf(com.bca.mobile.bn.a(0x7f0c0014)))).append("://").append(n.F).append(":").append(n.G).append("/mbca/HTTPHandler?action=apk").toString();
        }
        m = (HttpURLConnection)(new URL(s1)).openConnection();
        m.setConnectTimeout(60000);
        s1 = a(m.getInputStream());
        if (m != null)
        {
            m.disconnect();
        }
        return s1;
        Object obj;
        obj;
        ((Exception) (obj)).printStackTrace();
        if (m != null)
        {
            m.disconnect();
        }
        return null;
        obj;
        if (m != null)
        {
            m.disconnect();
        }
        throw obj;
    }

    public final void e()
    {
        if (ah != null)
        {
            ah.cancel();
            ah = null;
        }
        if (l != null)
        {
            l.dismiss();
        }
        if (m != null)
        {
            m.disconnect();
        }
    }

    public void onClick(View view)
    {
        boolean flag;
        flag = false;
        super.onClick(view);
        if (Y != view) goto _L2; else goto _L1
_L1:
        if (!com.bca.mobile.bn.b("reinstall", "0").equals("1")) goto _L4; else goto _L3
_L3:
        view = new android.app.AlertDialog.Builder(this);
        view.setTitle("m-BCA");
        view.setMessage(com.bca.mobile.bn.a(0x7f0c005f));
        view.setNegativeButton("Reinstall", new v(this));
        view.setPositiveButton("Back", new w(this));
        view.show();
_L6:
        return;
_L4:
        if (com.bca.mobile.bn.b("isProvision", "0").equals("0"))
        {
            startActivity(new Intent(this, com/bca/mobile/TermAndConditionActivity));
            return;
        } else
        {
            k();
            return;
        }
_L2:
        if (Z == view)
        {
            view = new Intent();
            view.setAction("android.intent.action.VIEW");
            view.setData(Uri.parse("https://m.klikbca.com"));
            startActivity(view);
            return;
        }
        if (aa == view)
        {
            try
            {
                e();
                ah = new Timer();
                ah.schedule(new x(this), 60000L);
                l = new ProgressDialog(this);
                l.setCancelable(false);
                l.show();
            }
            // Misplaced declaration of an exception variable
            catch (View view) { }
            if (j("com.infobca"))
            {
                e();
                startActivity(getPackageManager().getLaunchIntentForPackage("com.infobca"));
                finish();
                return;
            }
            if (com.b.a.a(this))
            {
                (new z(this)).execute(new String[] {
                    ""
                });
                return;
            }
        }
        while (false) 
        {
            if (ab != null && view == ab)
            {
                startActivity(new Intent(this, com/bca/mobile/ChangePasswordActivity));
                return;
            }
            if (ac == view)
            {
                try
                {
                    NfcAdapter.getDefaultAdapter(this);
                }
                // Misplaced declaration of an exception variable
                catch (View view) { }
                // Misplaced declaration of an exception variable
                catch (View view) { }
                if (d != null)
                {
                    flag = true;
                }
                if (!flag)
                {
                    i(com.bca.mobile.bn.a(0x7f0c0047));
                    return;
                }
                if (!d.isEnabled())
                {
                    i(com.bca.mobile.bn.a(0x7f0c0048));
                    return;
                } else
                {
                    startActivity(new Intent(this, com/bca/mobile/FlazzMainTabActivity));
                    return;
                }
            }
            if (view == ad)
            {
                startActivity(new Intent(this, com/bca/mobile/AboutActivity));
                return;
            }
            if (view != af)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (r.c(W.getText().toString()))
            {
                if (super.a(W))
                {
                    com.bca.mobile.bn.a("login_tiem_lefe", 0);
                    boolean flag1;
                    if (n.ak[7].equals(n.H))
                    {
                        flag1 = false;
                    } else
                    {
                        flag1 = true;
                    }
                    if (flag1)
                    {
                        n.ak[2] = n.C;
                        n.ak[3] = n.D;
                        n.ak[4] = n.E;
                        n.ak[5] = n.F;
                        n.ak[6] = n.G;
                        n.ak[7] = n.H;
                        n.ak[8] = n.I;
                        j();
                    }
                    if (com.bca.mobile.bn.b("isProvision", "0").equals("1"))
                    {
                        n.R = n.ak[11];
                        n.S = n.ak[12];
                        if (!n.N.equals(n.R) || !n.O.equals(n.S))
                        {
                            a(null, com.bca.mobile.bn.a(0x7f0c0064), this, true, com.bca.mobile.bn.a(0x7f0c0062));
                            flag1 = false;
                        } else
                        {
                            flag1 = true;
                        }
                    } else
                    {
                        flag1 = false;
                    }
                    if (flag1)
                    {
                        n.W = true;
                        n.an = false;
                        com.bca.mobile.bn.a("isLogin", "0");
                        if (W != null)
                        {
                            y.hideSoftInputFromWindow(W.getWindowToken(), 0);
                        }
                        ae.dismiss();
                        startActivity(new Intent(this, com/bca/mobile/transaction/TransactionListActivity));
                        return;
                    }
                    continue;
                }
                ae.dismiss();
                if (com.bca.mobile.bn.a("login_tiem_lefe") == 0)
                {
                    com.bca.mobile.bn.a("login_tiem_lefe", 1);
                    E = 1;
                    a(null, com.bca.mobile.bn.a(0x7f0c006d), this, false, com.bca.mobile.bn.a(0x7f0c0028));
                    return;
                }
                if (com.bca.mobile.bn.a("login_tiem_lefe") == 1)
                {
                    com.bca.mobile.bn.a("login_tiem_lefe", 2);
                    E = 1;
                    a(null, com.bca.mobile.bn.a(0x7f0c006e), this, false, com.bca.mobile.bn.a(0x7f0c0028));
                    return;
                }
                if (com.bca.mobile.bn.a("login_tiem_lefe") == 2)
                {
                    com.bca.mobile.bn.b(this);
                    com.bca.mobile.bn.a("reinstall", "1");
                    a(null, com.bca.mobile.bn.a(0x7f0c006f), this, true, com.bca.mobile.bn.a(0x7f0c0062));
                    return;
                }
            } else
            {
                ae.dismiss();
                E = 1;
                a(null, com.bca.mobile.bn.a(0x7f0c0068), this, false, "Back");
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (view != ag) goto _L8; else goto _L7
_L7:
        break MISSING_BLOCK_LABEL_904;
_L8:
        break; /* Loop/switch isn't completed */
        if (W != null)
        {
            y.hideSoftInputFromWindow(W.getWindowToken(), 0);
        }
        ae.dismiss();
        return;
    }

    public void onCreate(Bundle bundle)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            StrictMode.setThreadPolicy((new android.os.StrictMode.ThreadPolicy.Builder()).permitAll().build());
        }
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        String s6;
        String s7;
        String as[];
        int i1;
        if (com.bca.mobile.n.c >= 720 && n.aM > 6.7999999999999998D)
        {
            super.a(bundle, 0x7f030064);
        } else
        if (com.bca.mobile.n.c >= 600 && n.aM > 4.7999999999999998D)
        {
            super.a(bundle, 0x7f030063);
        } else
        {
            super.a(bundle, 0x7f030062);
        }
        com.bca.mobile.bn.a(this);
        com.bca.mobile.bn.a("isLogin", "0");
        com.bca.mobile.bn.a("color", "0");
        n.ao = false;
        d = null;
        com.bca.mobile.n.a = 0;
        com.bca.mobile.n.e = false;
        n.ak = new String[17];
        n.aj = new String[17];
        if (com.bca.mobile.bn.b("isProvision", "0").equals("0"))
        {
            l();
        } else
        {
            com.bca.c.b.a(this);
            l();
        }
        b = new WebView(this);
        c = b.getSettings();
        n.aq = c.getUserAgentString();
        X = (ImageView)findViewById(0x7f0b0222);
        Y = (Button)findViewById(0x7f0b0223);
        Z = (Button)findViewById(0x7f0b0224);
        aa = (Button)findViewById(0x7f0b0225);
        Y.setOnClickListener(this);
        Z.setOnClickListener(this);
        aa.setOnClickListener(this);
        ab = (Button)findViewById(0x7f0b0226);
        ab.setOnClickListener(this);
        if (com.bca.mobile.bn.b("isProvision", "0").equals("1"))
        {
            ab.setVisibility(0);
        }
        ac = (Button)findViewById(0x7f0b0227);
        ac.setOnClickListener(this);
        ad = (Button)findViewById(0x7f0b0228);
        ad.setOnClickListener(this);
        if (!com.bca.mobile.bn.b("screen_width", "0").equals("0"))
        {
            com.bca.mobile.n.c = Integer.parseInt(com.bca.mobile.bn.b("screen_width", "0"));
        }
        if (!com.bca.mobile.bn.b("screen_inch", "0").equals("0"))
        {
            n.aM = Double.parseDouble(com.bca.mobile.bn.b("screen_inch", "0"));
        }
        i1 = (int)(0.90000000000000002D * (double)com.bca.mobile.n.c);
        if (com.bca.mobile.n.c <= 240)
        {
            i1 = (int)(0.80000000000000004D * (double)com.bca.mobile.n.c);
        }
        Y.getLayoutParams().width = i1;
        Y.getLayoutParams().height = (int)((double)i1 * 0.22D);
        Z.getLayoutParams().width = i1;
        Z.getLayoutParams().height = (int)((double)i1 * 0.22D);
        aa.getLayoutParams().width = i1;
        aa.getLayoutParams().height = (int)((double)i1 * 0.22D);
        i1 = (int)(0.90000000000000002D * (double)com.bca.mobile.n.c);
        if (com.bca.mobile.n.c <= 240)
        {
            i1 = (int)(0.80000000000000004D * (double)com.bca.mobile.n.c);
        }
        ab.getLayoutParams().width = i1;
        ab.getLayoutParams().height = (int)((double)i1 * 0.14000000000000001D);
        ac.getLayoutParams().width = i1;
        ac.getLayoutParams().height = (int)((double)i1 * 0.14000000000000001D);
        ad.getLayoutParams().width = i1;
        ad.getLayoutParams().height = (int)((double)i1 * 0.14000000000000001D);
        i1 = (int)(0.55000000000000004D * (double)com.bca.mobile.n.c);
        if (com.bca.mobile.n.c <= 240)
        {
            i1 = (int)(0.40000000000000002D * (double)com.bca.mobile.n.c);
        }
        X.getLayoutParams().width = i1;
        X.getLayoutParams().height = (int)((double)i1 * 0.32000000000000001D);
        if (O < 450)
        {
            findViewById(0x7f0b0075).getLayoutParams().height = (int)(50F * getResources().getDisplayMetrics().density + 0.5F);
        } else
        if (O < 700)
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
        j = (ImageView)findViewById(0x7f0b0229);
        k = AnimationUtils.loadAnimation(this, 0x7f04000c);
        n = new Timer();
        n.schedule(new t(this), 0L, 4500L);
        d = NfcAdapter.getDefaultAdapter(this);
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_1058;
        }
        e = PendingIntent.getActivity(this, 0, (new Intent(this, getClass())).addFlags(0x20000000), 0);
        bundle = new IntentFilter("android.nfc.action.NDEF_DISCOVERED");
        try
        {
            bundle.addDataType("*/*");
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            try
            {
                throw new RuntimeException("fail", bundle);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                return;
            }
        }
        f = (new IntentFilter[] {
            bundle
        });
        bundle = android/nfc/tech/IsoDep.getName();
        s1 = android/nfc/tech/NfcA.getName();
        s2 = android/nfc/tech/NfcB.getName();
        s3 = android/nfc/tech/NfcF.getName();
        s4 = android/nfc/tech/NfcV.getName();
        s5 = android/nfc/tech/Ndef.getName();
        s6 = android/nfc/tech/NdefFormatable.getName();
        as = (new String[] {
            android/nfc/tech/MifareClassic.getName()
        });
        s7 = android/nfc/tech/MifareUltralight.getName();
        g = (new String[][] {
            new String[] {
                bundle
            }, new String[] {
                s1
            }, new String[] {
                s2
            }, new String[] {
                s3
            }, new String[] {
                s4
            }, new String[] {
                s5
            }, new String[] {
                s6
            }, as, new String[] {
                s7
            }
        });
    }

    protected void onDestroy()
    {
        if (ae != null)
        {
            ae.cancel();
            ae = null;
        }
        if (n != null)
        {
            n.cancel();
            n = null;
        }
        super.onDestroy();
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
    }

    public void onNewIntent(Intent intent)
    {
        boolean flag;
        h = Toast.makeText(getApplicationContext(), "Loading.", 0);
        i = (TextView)h.getView().findViewById(0x102000b);
        if (i != null)
        {
            i.setGravity(17);
        }
        h.show();
        setIntent(intent);
        if (!"android.nfc.action.TECH_DISCOVERED".equals(getIntent().getAction()))
        {
            break MISSING_BLOCK_LABEL_222;
        }
        Tag tag = (Tag)intent.getParcelableExtra("android.nfc.extra.TAG");
        intent = android/nfc/tech/IsoDep.getName();
        String as[] = tag.getTechList();
        int j1 = as.length;
        int i1 = 0;
        flag = false;
        while (i1 < j1) 
        {
            if (intent.equals(as[i1]))
            {
                flag = true;
            }
            i1++;
        }
_L2:
        if (flag)
        {
            startActivity(new Intent(this, com/bca/mobile/FlazzMainTabActivity));
            return;
        }
        h = Toast.makeText(getApplicationContext(), com.bca.mobile.bn.a(0x7f0c0045), 0);
        i = (TextView)h.getView().findViewById(0x102000b);
        if (i != null)
        {
            i.setGravity(17);
        }
        h.show();
        return;
        flag = false;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected void onPause()
    {
        super.onPause();
        if (d != null)
        {
            d.disableForegroundDispatch(this);
        }
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
        E;
        JVM INSTR tableswitch 1 1: default 24
    //                   1 30;
           goto _L1 _L2
_L1:
        E = 0;
        return;
_L2:
        k();
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void onResume()
    {
        super.onResume();
        if (com.bca.mobile.n.e)
        {
            com.bca.mobile.bn.a("reinstall", "1");
            com.bca.mobile.n.e = false;
        }
        if (com.bca.mobile.bn.b("isProvision", "0").equals("1"))
        {
            ab.setVisibility(0);
        }
        n.W = true;
        n.an = false;
        com.bca.mobile.bn.a("isLogin", "0");
        if (n.ao)
        {
            finish();
        }
        if (d != null)
        {
            d.enableForegroundDispatch(this, e, f, g);
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
