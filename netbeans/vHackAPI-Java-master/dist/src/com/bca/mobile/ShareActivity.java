// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.text.ClipboardManager;
import android.text.Editable;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TextKeyListener;
import android.util.DisplayMetrics;
import android.view.ContextMenu;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.bca.c.c;
import com.bca.mobile.tab.TabGroupBaseActivity;
import com.bca.mobile.transaction.i;
import com.bca.mobile.transaction.l;
import com.d.a;
import com.f.d;
import com.h.b;
import com.utilities.e;
import com.utilities.h;
import com.utilities.p;
import com.utilities.s;
import com.utilities.t;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;

// Referenced classes of package com.bca.mobile:
//            ag, bh, bi, n, 
//            bn, am, aq, ar, 
//            aj, ak, al, bj, 
//            bl, ah, ai, bk, 
//            aw, ay, ba, bf, 
//            at, au, av, bg, 
//            an, ao, ap, bb, 
//            be, bd, as, bc, 
//            TabSample

public abstract class ShareActivity extends Activity
    implements android.content.DialogInterface.OnCancelListener, android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener, c, i, l, a, d, com.h.a
{

    ProgressDialog A;
    public Dialog B;
    public Dialog C;
    public Dialog D;
    public int E;
    public AlertDialog F;
    protected String G;
    public String H;
    public String I;
    ArrayList J;
    protected boolean K;
    protected EditText L;
    protected int M;
    protected long N;
    int O;
    Timer P;
    Timer Q;
    public final int R = 0;
    public final int S = 1;
    private boolean a;
    private View b;
    private Dialog c;
    private Button d;
    private EditText e;
    private Button f;
    private Button g;
    private TextView h;
    private ImageView i;
    private Activity j;
    private Handler k;
    public com.a.a o;
    public ListView p;
    public List q;
    public List r;
    public List s;
    public List t;
    public Handler u;
    EditText v;
    AlertDialog w;
    public Button x;
    public InputMethodManager y;
    AlertDialog z;

    public ShareActivity()
    {
        o = null;
        p = null;
        q = new ArrayList();
        r = new ArrayList();
        s = new ArrayList();
        t = new ArrayList();
        u = new ag(this);
        c = null;
        d = null;
        x = null;
        e = null;
        y = null;
        G = "";
        H = "";
        I = "";
        J = null;
        K = false;
        f = null;
        g = null;
        h = null;
        i = null;
        k = null;
    }

    private Dialog a(String s1, Activity activity, boolean flag, String s2, String s3, boolean flag1, boolean flag2)
    {
        Object obj;
        Object obj1;
        int i1;
        int j1;
        int k1;
        int i2;
        try
        {
            D = new Dialog(activity);
            D.getWindow().requestFeature(1);
            D.getWindow().setBackgroundDrawableResource(0x7f0201da);
            D.setContentView(0x7f030026);
            i1 = (int)(61F * activity.getResources().getDisplayMetrics().density + 0.5F);
            j1 = (int)(172F * activity.getResources().getDisplayMetrics().density + 0.5F);
            obj = ((WindowManager)activity.getSystemService("window")).getDefaultDisplay();
            k1 = ((Display) (obj)).getWidth();
            int l1 = ((Display) (obj)).getHeight();
            LinearLayout linearlayout = (LinearLayout)D.findViewById(0x7f0b009c);
            linearlayout.getLayoutParams().height = (l1 * 5) / 10;
            linearlayout.getLayoutParams().width = (k1 * 7) / 10;
            obj1 = (TextView)D.findViewById(0x7f0b009e);
            obj = (TextView)D.findViewById(0x7f0b00a0);
            ((TextView) (obj1)).setText(null);
            ((TextView) (obj)).setText(s1);
            new Button(this);
            obj = (LinearLayout)D.findViewById(0x7f0b00a7);
            D.findViewById(0x7f0b00a1);
            D.findViewById(0x7f0b009f).setVisibility(8);
            ((TextView) (obj1)).setVisibility(8);
            obj1 = new Button(this);
            a(s2, ((Button) (obj1)));
            ((LinearLayout) (obj)).setVisibility(0);
            ((Button) (obj1)).setOnClickListener(new bh(this, s2, s3, flag1, flag2, flag, activity));
            D.setOnCancelListener(new bi(this, s2, s3, flag1, flag2, flag, activity));
            k1 = linearlayout.getLayoutParams().width / 2;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return null;
        }
        i2 = (int)(0.32000000000000001D * (double)k1);
        if (n.aM > 6.7999999999999998D)
        {
            s1 = new android.widget.LinearLayout.LayoutParams(j1, i1);
        } else
        {
            s1 = new android.widget.LinearLayout.LayoutParams(k1, i2);
        }
        ((LinearLayout) (obj)).setGravity(81);
        ((LinearLayout) (obj)).addView(((View) (obj1)), s1);
        D.show();
        return D;
    }

    private void a(int i1, boolean flag)
    {
        b = new View(this);
        v = new EditText(this);
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        O = displaymetrics.heightPixels;
        if (O < 450)
        {
            com.utilities.p.a(0);
        } else
        if (O < 700)
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
        if (flag)
        {
            getWindow().requestFeature(7);
        } else
        {
            getWindow().requestFeature(1);
        }
        com.utilities.p.a(this);
        if (getParent() != null)
        {
            setContentView(LayoutInflater.from(getParent()).inflate(i1, null));
        } else
        {
            setContentView(i1);
        }
        if (flag)
        {
            getWindow().setFeatureInt(7, 0x7f03006f);
        } else
        {
            getWindow().setFeatureInt(1, -1);
        }
        k = new Handler();
    }

    static void a(ShareActivity shareactivity, ImageView imageview)
    {
        shareactivity.i = imageview;
    }

    static void a(ShareActivity shareactivity, String s1)
    {
        String s2;
        Iterator iterator;
        s2 = shareactivity.getPackageName();
        iterator = shareactivity.getPackageManager().getInstalledPackages(8192).iterator();
_L4:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L5:
        PackageInfo packageinfo;
        if (flag)
        {
            com.bca.mobile.bn.a(shareactivity, true);
            shareactivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder("market://details?id=")).append(s2).toString())));
            return;
        } else
        {
            shareactivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s1)));
            return;
        }
_L2:
        packageinfo = (PackageInfo)iterator.next();
        if (!packageinfo.packageName.equals("com.google.market") && !packageinfo.packageName.equals("com.android.vending")) goto _L4; else goto _L3
_L3:
        flag = true;
          goto _L5
    }

    static boolean a(ShareActivity shareactivity)
    {
        return shareactivity.a;
    }

    private boolean a(String s1, String s2, String s3, int i1)
    {
        if (n.y != null && e())
        {
            com.bca.mobile.n.a = i1;
            a("Sending", s2, s3);
            n.y.a(s1);
            return true;
        } else
        {
            return false;
        }
    }

    static ImageView b(ShareActivity shareactivity)
    {
        return shareactivity.i;
    }

    private void d()
    {
        if (c != null)
        {
            y.hideSoftInputFromWindow(e.getWindowToken(), 0);
            c.dismiss();
        }
    }

    public static int[] d(int i1)
    {
        int ai1[] = new int[i1];
        i1 = 0;
        do
        {
            if (i1 >= ai1.length)
            {
                return ai1;
            }
            ai1[0] = ai1[i1];
            i1++;
        } while (true);
    }

    private boolean e()
    {
        Object obj;
        if (getParent() != null)
        {
            obj = getParent();
        } else
        {
            obj = n.al;
        }
        if (com.bca.mobile.n.l == 0x7f0200a7)
        {
            g();
            a(getString(0x7f0c005e), (Activity)obj, false, "Back", false, false);
            return false;
        }
        if (com.bca.mobile.n.l == 0x7f0200a9)
        {
            g();
            a(getString(0x7f0c005e), (Activity)obj, false, "Back", false, false);
            return false;
        } else
        {
            return true;
        }
    }

    public static String[] h(String s1)
    {
        String as1[];
        int i1;
        int k1;
        as1 = new String[3];
        s1 = com.utilities.t.a(s1).f();
        k1 = s1.length;
        i1 = 0;
_L2:
        if (i1 >= k1)
        {
            return as1;
        }
        s as2[] = s1[i1].f();
        int l1 = as2.length;
        int j1 = 0;
        do
        {
label0:
            {
                if (j1 < l1)
                {
                    break label0;
                }
                i1++;
            }
            if (true)
            {
                continue;
            }
            s s2 = as2[j1];
            if (s2.d().equals("Dsp"))
            {
                as1[0] = s2.b("tle");
                as1[1] = s2.b("btb");
                as1[2] = s2.c();
            }
            j1++;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final Dialog a(String s1, Activity activity, String s2, String s3)
    {
        Object obj;
        int i1;
        int j1;
        int k1;
        int i2;
        try
        {
            D = new Dialog(activity);
            D.getWindow().requestFeature(1);
            D.getWindow().setBackgroundDrawableResource(0x7f0201da);
            D.setContentView(0x7f030026);
            i1 = (int)(61F * activity.getResources().getDisplayMetrics().density + 0.5F);
            j1 = (int)(172F * activity.getResources().getDisplayMetrics().density + 0.5F);
            activity = ((WindowManager)activity.getSystemService("window")).getDefaultDisplay();
            k1 = activity.getWidth();
            int l1 = activity.getHeight();
            LinearLayout linearlayout = (LinearLayout)D.findViewById(0x7f0b009c);
            linearlayout.getLayoutParams().height = (l1 * 5) / 10;
            linearlayout.getLayoutParams().width = (k1 * 7) / 10;
            obj = (TextView)D.findViewById(0x7f0b009e);
            activity = (TextView)D.findViewById(0x7f0b00a0);
            ((TextView) (obj)).setText(null);
            activity.setText(s1);
            if (n.aM < 5.5D)
            {
                activity.setTextSize(14F);
            }
            new Button(this);
            activity = (LinearLayout)D.findViewById(0x7f0b00a7);
            D.findViewById(0x7f0b00a1);
            s1 = (LinearLayout)D.findViewById(0x7f0b00a2);
            D.findViewById(0x7f0b00a3);
            s1.setVisibility(8);
            D.findViewById(0x7f0b009f).setVisibility(8);
            ((TextView) (obj)).setVisibility(8);
            obj = new Button(this);
            a(s2, ((Button) (obj)));
            activity.setVisibility(0);
            ((Button) (obj)).setOnClickListener(new am(this, s3));
            D.setCancelable(false);
            k1 = linearlayout.getLayoutParams().width / 2;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return null;
        }
        i2 = (int)(0.29999999999999999D * (double)k1);
        if (n.aM > 6.7999999999999998D)
        {
            s1 = new android.widget.LinearLayout.LayoutParams(j1, i1);
        } else
        {
            s1 = new android.widget.LinearLayout.LayoutParams(k1, i2);
        }
        activity.setGravity(81);
        activity.addView(((View) (obj)), s1);
        D.show();
        return D;
    }

    public final Dialog a(String s1, Activity activity, String s2, String s3, String s4)
    {
        Object obj;
        int i1;
        int j1;
        int k1;
        int i2;
        try
        {
            D = new Dialog(activity);
            D.getWindow().requestFeature(1);
            D.getWindow().setBackgroundDrawableResource(0x7f0201da);
            D.setContentView(0x7f030026);
            com.bca.mobile.bn.a("skip", "1");
            i1 = (int)(61F * activity.getResources().getDisplayMetrics().density + 0.5F);
            j1 = (int)(172F * activity.getResources().getDisplayMetrics().density + 0.5F);
            obj = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(((DisplayMetrics) (obj)));
            activity = ((WindowManager)activity.getSystemService("window")).getDefaultDisplay();
            k1 = activity.getWidth();
            int l1 = activity.getHeight();
            LinearLayout linearlayout = (LinearLayout)D.findViewById(0x7f0b009c);
            linearlayout.getLayoutParams().height = (l1 * 5) / 10;
            linearlayout.getLayoutParams().width = (k1 * 7) / 10;
            obj = (TextView)D.findViewById(0x7f0b009e);
            activity = (TextView)D.findViewById(0x7f0b00a0);
            ((TextView) (obj)).setText(null);
            activity.setText(s1);
            if (n.aM < 5.5D)
            {
                activity.setTextSize(14F);
            }
            activity = new Button(this);
            s1 = (LinearLayout)D.findViewById(0x7f0b00a1);
            ((LinearLayout)D.findViewById(0x7f0b00a2)).setVisibility(8);
            D.findViewById(0x7f0b009f).setVisibility(8);
            ((TextView) (obj)).setVisibility(8);
            obj = new Button(this);
            a(s2, ((Button) (obj)));
            a(s3, ((Button) (activity)));
            s1.setVisibility(0);
            activity.setOnClickListener(new aq(this));
            ((Button) (obj)).setOnClickListener(new ar(this, s4));
            k1 = linearlayout.getLayoutParams().width / 2;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return null;
        }
        i2 = (int)(0.29999999999999999D * (double)k1);
        if (n.aM > 6.7999999999999998D)
        {
            s1 = new android.widget.LinearLayout.LayoutParams(j1, i1);
        } else
        {
            s1 = new android.widget.LinearLayout.LayoutParams(k1, i2);
        }
        s2 = (LinearLayout)D.findViewById(0x7f0b00a6);
        s1.weight = 1.0F;
        s2.addView(activity, s1);
        s2.addView(((View) (obj)), s1);
        D.show();
        return D;
    }

    public final Dialog a(String s1, Activity activity, boolean flag, String s2, boolean flag1, boolean flag2)
    {
        if (s2.equals("") || s2 == null)
        {
            s2 = "Ok";
        }
        return a(s1, activity, flag, s2, "", flag1, flag2);
    }

    public final Dialog a(String s1, String s2, Activity activity)
    {
        E = 1;
        return a(s1, s2, activity, false, 2, "Ok", "Cancel", false, false, false, 2, null, new String[0]);
    }

    public final Dialog a(String s1, String s2, Activity activity, int i1, ArrayList arraylist)
    {
        return a(s1, s2, activity, false, 2, "Ok", "Cancel", true, true, false, i1, arraylist, new String[0]);
    }

    public final Dialog a(String s1, String s2, Activity activity, String s3, String s4)
    {
        return a(s1, s2, activity, false, 2, s3, s4, false, false, false, 0, null, new String[0]);
    }

    public final Dialog a(String s1, String s2, Activity activity, String s3, String s4, boolean flag, ArrayList arraylist)
    {
        if (!flag)
        {
            return a(s1, s2, activity, false, 2, s3, s4, false, false, false, 0, null, new String[0]);
        } else
        {
            return a(s1, s2, activity, false, 2, s3, s4, true, false, false, 0, arraylist, new String[] {
                "Valas"
            });
        }
    }

    public final transient Dialog a(String s1, String s2, Activity activity, String s3, String s4, String as1[])
    {
        Object obj;
        Object obj1;
        Object obj2;
        EditText edittext;
        int i1;
        int j1;
        int l1;
        int j2;
        try
        {
            D = new Dialog(activity);
            D.getWindow().requestFeature(1);
            D.getWindow().setBackgroundDrawableResource(0x7f0201da);
            D.setContentView(0x7f030026);
            i1 = (int)(61F * activity.getResources().getDisplayMetrics().density + 0.5F);
            j1 = (int)(172F * activity.getResources().getDisplayMetrics().density + 0.5F);
            obj = ((WindowManager)activity.getSystemService("window")).getDefaultDisplay();
            int k1 = ((Display) (obj)).getWidth();
            int i2 = ((Display) (obj)).getHeight();
            obj = (LinearLayout)D.findViewById(0x7f0b009c);
            ((LinearLayout) (obj)).getLayoutParams().height = (i2 * 5) / 10;
            ((LinearLayout) (obj)).getLayoutParams().width = (k1 * 7) / 10;
            obj1 = (TextView)D.findViewById(0x7f0b009e);
            obj2 = (TextView)D.findViewById(0x7f0b00a0);
            ((TextView) (obj1)).setText(s1);
            ((TextView) (obj2)).setText(s2);
            if (n.aM < 5.5D)
            {
                ((TextView) (obj2)).setTextSize(14F);
            }
            s2 = new Button(this);
            D.findViewById(0x7f0b00a7);
            obj2 = (LinearLayout)D.findViewById(0x7f0b00a1);
            LinearLayout linearlayout = (LinearLayout)D.findViewById(0x7f0b00a2);
            edittext = (EditText)D.findViewById(0x7f0b00a3);
            L = (EditText)D.findViewById(0x7f0b00a4);
            EditText edittext1 = L;
            linearlayout.setVisibility(8);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return null;
        }
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_334;
        }
        D.findViewById(0x7f0b009f).setVisibility(8);
        ((TextView) (obj1)).setVisibility(8);
        obj1 = new Button(this);
        a(s4, ((Button) (s2)));
        a(s3, ((Button) (obj1)));
        ((LinearLayout) (obj2)).setVisibility(0);
        s2.setOnClickListener(new aj(this, s3, s4));
        ((Button) (obj1)).setOnClickListener(new ak(this, s3, s4, activity, edittext, as1));
        D.setOnCancelListener(new al(this, s3, s4, activity));
        l1 = ((LinearLayout) (obj)).getLayoutParams().width / 2;
        j2 = (int)(0.29999999999999999D * (double)l1);
        if (n.aM > 6.7999999999999998D)
        {
            s1 = new android.widget.LinearLayout.LayoutParams(j1, i1);
        } else
        {
            s1 = new android.widget.LinearLayout.LayoutParams(l1, j2);
        }
        activity = (LinearLayout)D.findViewById(0x7f0b00a6);
        s1.weight = 1.0F;
        activity.addView(s2, s1);
        activity.addView(((View) (obj1)), s1);
        D.show();
        return D;
    }

    public final Dialog a(String s1, String s2, Activity activity, boolean flag, int i1)
    {
        if (flag)
        {
            return a(s1, s2, activity, false, 2, "Ok", "Cancel", flag, false, false, i1, null, new String[0]);
        } else
        {
            return a(s1, s2, activity, false, 2, "Ok", "Cancel", flag, false, false, i1, null, new String[0]);
        }
    }

    public final transient Dialog a(String s1, String s2, Activity activity, boolean flag, int i1, String s3, String s4, 
            boolean flag1, boolean flag2, boolean flag3, int j1, ArrayList arraylist, String as1[])
    {
        Object obj;
        LinearLayout linearlayout;
        LinearLayout linearlayout1;
        TextView textview;
        LinearLayout linearlayout2;
        LinearLayout linearlayout3;
        EditText edittext;
        int k1;
        int l1;
        int j2;
        long l2;
        try
        {
            D = new Dialog(activity);
            D.getWindow().requestFeature(1);
            D.getWindow().setBackgroundDrawableResource(0x7f0201da);
            D.setContentView(0x7f030026);
            k1 = (int)(61F * activity.getResources().getDisplayMetrics().density + 0.5F);
            l1 = (int)(172F * activity.getResources().getDisplayMetrics().density + 0.5F);
            obj = ((WindowManager)activity.getSystemService("window")).getDefaultDisplay();
            int i2 = ((Display) (obj)).getWidth();
            int k2 = ((Display) (obj)).getHeight();
            linearlayout1 = (LinearLayout)D.findViewById(0x7f0b009c);
            linearlayout1.getLayoutParams().height = (k2 * 5) / 10;
            linearlayout1.getLayoutParams().width = (i2 * 7) / 10;
            textview = (TextView)D.findViewById(0x7f0b009e);
            obj = (TextView)D.findViewById(0x7f0b00a0);
            textview.setText(s1);
            ((TextView) (obj)).setText(s2);
            if (n.aM < 5.5D)
            {
                ((TextView) (obj)).setTextSize(14F);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return null;
        }
        if (!flag3)
        {
            break MISSING_BLOCK_LABEL_245;
        }
        registerForContextMenu(((View) (obj)));
        ((ClipboardManager)getSystemService("clipboard")).setText(((TextView) (obj)).getText());
        obj = new Button(this);
        linearlayout = (LinearLayout)D.findViewById(0x7f0b00a7);
        linearlayout2 = (LinearLayout)D.findViewById(0x7f0b00a1);
        linearlayout3 = (LinearLayout)D.findViewById(0x7f0b00a2);
        s2 = (EditText)D.findViewById(0x7f0b00a3);
        L = (EditText)D.findViewById(0x7f0b00a4);
        edittext = L;
        if (!flag1) goto _L2; else goto _L1
_L1:
        linearlayout3.setVisibility(0);
        if (!flag2) goto _L4; else goto _L3
_L3:
        j1 = (new StringBuilder(String.valueOf(N))).toString().length();
        j2 = M;
        l2 = N;
        L.setHint(getString(0x7f0c0054));
        a(L, 0);
        J = new ArrayList(arraylist);
        L.setVisibility(0);
        s2.setVisibility(8);
        if (!G.equals(""))
        {
            L.setText((new StringBuilder("Rp. ")).append(G).toString());
        }
        L.setOnClickListener(new bj(this, l2, j1, arraylist, activity));
_L13:
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_521;
        }
        D.findViewById(0x7f0b009f).setVisibility(8);
        textview.setVisibility(8);
        if (i1 != 2) goto _L6; else goto _L5
_L5:
        s1 = new Button(this);
        a(s3, ((Button) (s1)));
        a(s4, ((Button) (obj)));
        linearlayout2.setVisibility(0);
        ((Button) (obj)).setOnClickListener(new bl(this, s3, s4));
_L14:
        s1.setOnClickListener(new ah(this, s3, s4, flag, activity, flag1, s2, flag2, as1));
        D.setOnCancelListener(new ai(this, s3, s4, flag, activity));
        j1 = linearlayout1.getLayoutParams().width / 2;
        j2 = (int)(0.29999999999999999D * (double)j1);
        if (n.aM <= 6.7999999999999998D) goto _L8; else goto _L7
_L7:
        s2 = new android.widget.LinearLayout.LayoutParams(l1, k1);
_L15:
        if (i1 != 1) goto _L10; else goto _L9
_L9:
        linearlayout.setGravity(81);
        linearlayout.addView(s1, s2);
_L17:
        D.show();
        return D;
_L4:
        if (as1.length != 0) goto _L12; else goto _L11
_L11:
        L.setVisibility(8);
        s2.setVisibility(0);
        s2.setFilters(new InputFilter[] {
            new android.text.InputFilter.LengthFilter(j1)
        });
        a(((EditText) (s2)), 0);
        s2.setHint("Masukkan jumlah uang (Rp)");
          goto _L13
_L12:
        edittext.setVisibility(0);
        s2.setVisibility(8);
        if (as1[0].equals("Valas"))
        {
            edittext.setHint(getString(0x7f0c0058));
            a(edittext, 2);
            edittext.setOnClickListener(new bk(this, arraylist, activity));
        }
          goto _L13
_L2:
        linearlayout3.setVisibility(8);
          goto _L13
_L6:
        s1 = new Button(this);
        a(s3, ((Button) (s1)));
        linearlayout.setVisibility(0);
          goto _L14
_L8:
        s2 = new android.widget.LinearLayout.LayoutParams(j1, j2);
          goto _L15
_L10:
        if (i1 != 2) goto _L17; else goto _L16
_L16:
        activity = (LinearLayout)D.findViewById(0x7f0b00a6);
        s2.weight = 1.0F;
        activity.addView(((View) (obj)), s2);
        activity.addView(s1, s2);
          goto _L17
    }

    public final Dialog a(String s1, String s2, Activity activity, boolean flag, String s3)
    {
        if (s3.equals("") || s3 == null)
        {
            s3 = "Ok";
        }
        return a(s1, s2, activity, flag, 1, s3, "", false, false, false, 0, null, new String[0]);
    }

    protected abstract void a();

    public abstract void a(int i1);

    public void a(int i1, Object obj)
    {
    }

    public final void a(int i1, String s1, String s2, String s3, boolean flag)
    {
        P = new Timer();
        P.schedule(new aw(this), 30000L);
        if (flag)
        {
            Q = new Timer();
            Q.schedule(new ay(this, i1), 60000L);
        }
        if (getParent() != null)
        {
            A = new ProgressDialog(getParent());
        } else
        {
            A = new ProgressDialog(this);
        }
        A.setButton(-1, s3, new ba(this, i1));
        A.setMessage(s2);
        A.setTitle(s1);
        A.setCancelable(false);
        A.setOnCancelListener(this);
        A.show();
        A.getButton(-1).setEnabled(false);
    }

    public void a(Context context, int i1, String s1, String s2)
    {
        a(((Runnable) (new bf(this, context, i1, s1, s2))));
    }

    public final void a(Context context, BaseAdapter baseadapter, android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        ListView listview = (ListView)LayoutInflater.from(context).inflate(0x7f030042, null).findViewById(0x7f0b0107);
        listview.setAdapter(baseadapter);
        listview.setOnItemClickListener(onitemclicklistener);
        F = (new android.app.AlertDialog.Builder(context)).create();
        F.setView(listview);
        F.show();
    }

    protected void a(Bundle bundle, int i1)
    {
        super.onCreate(bundle);
        a(i1, false);
        y = (InputMethodManager)getSystemService("input_method");
        n.al = this;
    }

    protected final void a(Bundle bundle, int i1, Activity activity)
    {
        super.onCreate(bundle);
        a(i1, true);
        y = (InputMethodManager)getSystemService("input_method");
        j = activity;
        n.al = this;
    }

    public final void a(EditText edittext, int i1)
    {
        switch (i1)
        {
        default:
            return;

        case 0: // '\0'
            edittext.setInputType(3);
            edittext.setSingleLine(true);
            edittext.setSingleLine();
            edittext.setKeyListener(new at(this));
            return;

        case 4: // '\004'
            edittext.setInputType(131);
            edittext.setTransformationMethod(PasswordTransformationMethod.getInstance());
            edittext.setSingleLine(true);
            edittext.setSingleLine();
            edittext.setKeyListener(new au(this));
            return;

        case 1: // '\001'
            edittext.setInputType(3);
            edittext.setKeyListener(new av(this));
            return;

        case 2: // '\002'
            edittext.setInputType(1);
            edittext.setSingleLine(true);
            edittext.setSingleLine();
            edittext.setLines(1);
            return;

        case 3: // '\003'
            edittext.setInputType(1);
            edittext.setSingleLine(true);
            edittext.setLines(4);
            return;

        case 5: // '\005'
            edittext.setInputType(129);
            break;
        }
        edittext.setSingleLine(true);
        edittext.setSingleLine();
        edittext.setLines(1);
        edittext.setTransformationMethod(PasswordTransformationMethod.getInstance());
        edittext.setKeyListener(new TextKeyListener(android.text.method.TextKeyListener.Capitalize.NONE, false));
    }

    protected final void a(Runnable runnable)
    {
        k.post(runnable);
    }

    protected abstract void a(String s1);

    public final void a(String s1, Button button)
    {
        if (s1.equalsIgnoreCase("Back"))
        {
            button.setBackgroundDrawable(getResources().getDrawable(0x7f020047));
        } else
        {
            if (s1.equalsIgnoreCase("Logout"))
            {
                button.setBackgroundDrawable(getResources().getDrawable(0x7f020054));
                return;
            }
            if (s1.equalsIgnoreCase("Ok"))
            {
                button.setBackgroundDrawable(getResources().getDrawable(0x7f020063));
                return;
            }
            if (s1.equalsIgnoreCase("Close"))
            {
                button.setBackgroundDrawable(getResources().getDrawable(0x7f02004e));
                return;
            }
            if (s1.equalsIgnoreCase("send"))
            {
                button.setBackgroundResource(0x7f020069);
                return;
            }
            if (s1.equalsIgnoreCase("login"))
            {
                button.setBackgroundResource(0x7f020053);
                return;
            }
            if (s1.equalsIgnoreCase("cancel"))
            {
                button.setBackgroundResource(0x7f02004c);
                return;
            }
            if (s1.equalsIgnoreCase("yes"))
            {
                button.setBackgroundResource(0x7f02006b);
                return;
            }
            if (s1.equalsIgnoreCase("no"))
            {
                button.setBackgroundResource(0x7f020062);
                return;
            }
            if (s1.equalsIgnoreCase("skip"))
            {
                button.setBackgroundResource(0x7f02006a);
                return;
            }
            if (s1.equalsIgnoreCase("delete"))
            {
                button.setBackgroundDrawable(getResources().getDrawable(0x7f02004f));
                return;
            }
        }
    }

    public final void a(String s1, String s2, String s3)
    {
        a(0, s1, s2, s3, true);
    }

    public void a(String s1, boolean flag, boolean flag1)
    {
        a(((Runnable) (new bg(this))));
    }

    protected final void a(boolean flag)
    {
        a = flag;
        if (n.y != null)
        {
            n.y.a(this);
        }
        if (i == null)
        {
            i = (ImageView)findViewById(0x7f0b0248);
        }
        if (flag)
        {
            i.setVisibility(0);
        } else
        {
            i.setVisibility(4);
        }
        i.setBackgroundResource(com.bca.mobile.n.l);
    }

    public final boolean a(EditText edittext)
    {
        com.c.a a1;
        byte abyte0[];
        abyte0 = edittext.getText().toString().getBytes();
        a1 = new com.c.a(this);
        n.ae = new e(com.utilities.h.a((new h(abyte0)).a()));
        n.ak = a1.a(true);
        n.af = new e(n.ak[10]);
        n.X = true;
        int i1 = 0;
_L4:
        if (i1 < n.ak.length) goto _L2; else goto _L1
_L1:
        boolean flag = com.utilities.h.a((new h((new StringBuilder(String.valueOf(edittext.getText().toString()))).append(n.ak[9]).toString().getBytes())).a()).equals(n.ak[16]);
        if (flag)
        {
            a1.b();
            return true;
        }
        a1.b();
          goto _L3
_L2:
        if (i1 != 1 && i1 != 9 && i1 != 11 && i1 != 12 && i1 != 13 && i1 != 15)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        n.ak[i1] = n.af.b(n.ak[i1]);
_L7:
        i1++;
          goto _L4
        edittext;
        edittext.printStackTrace();
        a1.b();
_L6:
        return false;
        edittext;
        a1.b();
        throw edittext;
_L3:
        if (true) goto _L6; else goto _L5
_L5:
        b.a.a.d d1;
        d1;
          goto _L7
    }

    public final boolean a(String s1, String s2)
    {
        if (!f(s1))
        {
            return false;
        } else
        {
            a(s2, "Sending", "Cancel", 1);
            return true;
        }
    }

    public final Dialog b(String s1, Activity activity, String s2, String s3)
    {
        Object obj;
        int i1;
        int j1;
        int k1;
        int i2;
        try
        {
            D = new Dialog(activity);
            D.getWindow().requestFeature(1);
            D.getWindow().setBackgroundDrawableResource(0x7f0201da);
            D.setContentView(0x7f030026);
            i1 = (int)(61F * activity.getResources().getDisplayMetrics().density + 0.5F);
            j1 = (int)(172F * activity.getResources().getDisplayMetrics().density + 0.5F);
            obj = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(((DisplayMetrics) (obj)));
            activity = ((WindowManager)activity.getSystemService("window")).getDefaultDisplay();
            k1 = activity.getWidth();
            int l1 = activity.getHeight();
            LinearLayout linearlayout = (LinearLayout)D.findViewById(0x7f0b009c);
            linearlayout.getLayoutParams().height = (l1 * 5) / 10;
            linearlayout.getLayoutParams().width = (k1 * 7) / 10;
            obj = (TextView)D.findViewById(0x7f0b009e);
            activity = (TextView)D.findViewById(0x7f0b00a0);
            ((TextView) (obj)).setText(null);
            activity.setText(s1);
            if (n.aM < 5.5D)
            {
                activity.setTextSize(14F);
            }
            activity = new Button(this);
            s1 = (LinearLayout)D.findViewById(0x7f0b00a1);
            ((LinearLayout)D.findViewById(0x7f0b00a2)).setVisibility(8);
            D.findViewById(0x7f0b009f).setVisibility(8);
            ((TextView) (obj)).setVisibility(8);
            obj = new Button(this);
            a(s2, ((Button) (obj)));
            a(s3, activity);
            s1.setVisibility(0);
            activity.setOnClickListener(new an(this));
            ((Button) (obj)).setOnClickListener(new ao(this));
            D.setOnCancelListener(new ap(this));
            k1 = linearlayout.getLayoutParams().width / 2;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return null;
        }
        i2 = (int)(0.29999999999999999D * (double)k1);
        if (n.aM > 6.7999999999999998D)
        {
            s1 = new android.widget.LinearLayout.LayoutParams(j1, i1);
        } else
        {
            s1 = new android.widget.LinearLayout.LayoutParams(k1, i2);
        }
        s2 = (LinearLayout)D.findViewById(0x7f0b00a6);
        s1.weight = 1.0F;
        s2.addView(activity, s1);
        s2.addView(((View) (obj)), s1);
        D.show();
        return D;
    }

    protected abstract void b();

    public void b(int i1)
    {
        a(new bb(this, i1));
    }

    public abstract void b(String s1);

    public final void b(String s1, String s2)
    {
        a(new be(this, s1, s2));
    }

    public abstract void c();

    public final void c(int i1)
    {
        a(new bd(this, i1));
    }

    protected final void c(String s1)
    {
        h = (TextView)findViewById(0x7f0b0249);
        h.setVisibility(0);
        h.setText(s1);
    }

    protected final void d(String s1)
    {
        f = (Button)findViewById(0x7f0b0247);
        f.setOnClickListener(this);
        if (n.aM >= 6.9000000000000004D) goto _L2; else goto _L1
_L1:
        if (!s1.equals("Send")) goto _L4; else goto _L3
_L3:
        f.setBackgroundDrawable(getResources().getDrawable(0x7f020060));
_L6:
        f.setVisibility(0);
        return;
_L4:
        if (s1.equals("Edit"))
        {
            f.setBackgroundDrawable(getResources().getDrawable(0x7f02005e));
        } else
        if (s1.equals("Done"))
        {
            f.setBackgroundDrawable(getResources().getDrawable(0x7f02005d));
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (s1.equals("Send"))
        {
            f.setBackgroundDrawable(getResources().getDrawable(0x7f02012d));
        } else
        if (s1.equals("Edit"))
        {
            f.setBackgroundDrawable(getResources().getDrawable(0x7f02012b));
        } else
        if (s1.equals("Done"))
        {
            f.setBackgroundDrawable(getResources().getDrawable(0x7f02012a));
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        if (n.y != null)
        {
            n.y.d();
        }
        if (motionevent.getAction() == 262)
        {
            return false;
        } else
        {
            return super.dispatchTouchEvent(motionevent);
        }
    }

    protected final void e(String s1)
    {
        g = (Button)findViewById(0x7f0b0246);
        g.setOnClickListener(this);
        if (n.aM >= 6.9000000000000004D) goto _L2; else goto _L1
_L1:
        if (!s1.equals("Logout")) goto _L4; else goto _L3
_L3:
        g.setBackgroundResource(0x7f02005f);
_L6:
        g.setVisibility(0);
        return;
_L4:
        if (s1.equals("Close"))
        {
            g.setBackgroundResource(0x7f02005b);
        } else
        if (s1.equalsIgnoreCase("back"))
        {
            g.setBackgroundResource(0x7f02005a);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (s1.equals("Logout"))
        {
            g.setBackgroundResource(0x7f02012c);
        } else
        if (s1.equals("Close"))
        {
            g.setBackgroundResource(0x7f020128);
        } else
        if (s1.equalsIgnoreCase("back"))
        {
            g.setBackgroundResource(0x7f020127);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected final void f()
    {
        if (!e()) goto _L2; else goto _L1
_L1:
        if (c != null) goto _L4; else goto _L3
_L3:
        if (getParent() == null) goto _L6; else goto _L5
_L5:
        c = new Dialog(getParent());
_L11:
        int i1;
        int j1;
        int k1;
        int l1;
        c.getWindow().requestFeature(1);
        c.getWindow().setSoftInputMode(5);
        c.setContentView(0x7f030027);
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        i1 = displaymetrics.heightPixels;
        j1 = (int)(280F * getResources().getDisplayMetrics().density + 0.5F);
        k1 = (int)(260F * getResources().getDisplayMetrics().density + 0.5F);
        l1 = (int)(600F * getResources().getDisplayMetrics().density + 0.5F);
        if (i1 != 320) goto _L8; else goto _L7
_L7:
        ((LinearLayout)c.findViewById(0x7f0b009c)).getLayoutParams().width = k1;
_L9:
        e = (EditText)c.findViewById(0x7f0b00aa);
        e.setFilters(new InputFilter[] {
            new android.text.InputFilter.LengthFilter(6)
        });
        d = (Button)c.findViewById(0x7f0b00ac);
        x = (Button)c.findViewById(0x7f0b00ab);
        c.setOnCancelListener(new as(this));
        ((TextView)c.findViewById(0x7f0b00a9)).setText(0x7f0c004d);
        d.setOnClickListener(this);
        x.setOnClickListener(this);
_L4:
        e.setText("");
        y = (InputMethodManager)e.getContext().getSystemService("input_method");
        c.show();
        y.showSoftInput(e, 1);
        e.requestFocus();
        return;
_L6:
        try
        {
            c = new Dialog(this);
            continue; /* Loop/switch isn't completed */
        }
        catch (Exception exception)
        {
            if (c != null)
            {
                c.cancel();
                c = null;
                return;
            }
        }
          goto _L2
_L8:
label0:
        {
            if (n.aM < 7.0999999999999996D)
            {
                break label0;
            }
            ((LinearLayout)c.findViewById(0x7f0b009c)).getLayoutParams().width = l1;
        }
          goto _L9
        ((LinearLayout)c.findViewById(0x7f0b009c)).getLayoutParams().width = j1;
          goto _L9
_L2:
        return;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final boolean f(String s1)
    {
        if (s1.length() != 6)
        {
            if (getParent() != null)
            {
                a(com.bca.mobile.bn.a(0x7f0c0071), getParent(), false, "Back", true, false);
                return false;
            } else
            {
                a(com.bca.mobile.bn.a(0x7f0c0071), this, false, "Back", true, false);
                return false;
            }
        } else
        {
            return e();
        }
    }

    public final void g()
    {
        if (P != null)
        {
            P.cancel();
        }
        if (A != null)
        {
            A.cancel();
        }
        if (Q != null)
        {
            Q.cancel();
        }
    }

    public final boolean g(String s1)
    {
        return a(s1, "Sending", "Cancel", 0);
    }

    public final void h()
    {
        EditText edittext = v;
        y.hideSoftInputFromWindow(edittext.getWindowToken(), 0);
        if (c != null && c.isShowing())
        {
            c.cancel();
            c = null;
        }
        if (z != null && z.isShowing())
        {
            z.cancel();
            z = null;
        }
        if (C != null && C.isShowing())
        {
            C.cancel();
            C = null;
        }
        if (A != null && A.isShowing())
        {
            A.cancel();
            A = null;
        }
        if (F != null && F.isShowing())
        {
            F.cancel();
            F = null;
        }
        if (B != null && B.isShowing())
        {
            B.cancel();
            B = null;
        }
        if (D != null && D.isShowing())
        {
            D.cancel();
            D = null;
        }
        if (com.bca.mobile.bn.a != null && com.bca.mobile.bn.a.isShowing())
        {
            com.bca.mobile.bn.a.cancel();
            com.bca.mobile.bn.a = null;
        }
    }

    public void i()
    {
    }

    public final boolean i(String s1)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        Object obj = getLayoutInflater();
        View view = ((LayoutInflater) (obj)).inflate(0x7f030028, null);
        LinearLayout linearlayout = (LinearLayout)view.findViewById(0x7f0b00ae);
        TextView textview = (TextView)view.findViewById(0x7f0b00b0);
        obj = ((LayoutInflater) (obj)).inflate(0x7f030070, null);
        ((View) (obj)).setBackgroundDrawable(new ColorDrawable(Color.parseColor("#d2d2d2")));
        linearlayout.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#d2d2d2")));
        linearlayout.addView(((View) (obj)));
        builder.setView(view);
        textview.setText(s1);
        ((ImageButton)view.findViewById(0x7f0b00b1)).setOnClickListener(new bc(this));
        w = builder.create();
        w.show();
        return true;
    }

    public void onCancel(DialogInterface dialoginterface)
    {
label0:
        {
            if (z == dialoginterface)
            {
                if (n.am == null)
                {
                    break label0;
                }
                com.bca.mobile.TabSample.a(com.bca.mobile.TabSample.a);
            }
            return;
        }
        finish();
    }

    public void onClick(View view)
    {
        if (n.y != null)
        {
            n.y.d();
        }
        if (view.getTag() != null && view.getTag().equals("RightButton"))
        {
            y.hideSoftInputFromWindow(view.getWindowToken(), 0);
            a();
        } else
        {
            if (view.getTag() != null && view.getTag().equals("LeftButton"))
            {
                y.hideSoftInputFromWindow(view.getWindowToken(), 0);
                b();
                return;
            }
            if (view == d)
            {
                d();
                y.hideSoftInputFromWindow(view.getWindowToken(), 0);
                a(e.getText().toString());
                return;
            }
            if (view == x)
            {
                y.hideSoftInputFromWindow(view.getWindowToken(), 0);
                d();
                return;
            }
            if (view == f)
            {
                y.hideSoftInputFromWindow(view.getWindowToken(), 0);
                a();
                return;
            }
            if (view == g)
            {
                y.hideSoftInputFromWindow(view.getWindowToken(), 0);
                b();
                return;
            }
        }
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        contextmenu.add("Copy All");
    }

    protected Dialog onCreateDialog(int i1)
    {
        String as1[] = h(n.ar);
        a(as1[2], this, false, as1[1], true, false);
        return null;
    }

    protected void onDestroy()
    {
        h();
        super.onDestroy();
    }

    public boolean onKeyUp(int i1, KeyEvent keyevent)
    {
        if (i1 == 4 && getParent() != null)
        {
            ((TabGroupBaseActivity)getParent()).onBackPressed();
            return true;
        } else
        {
            return super.onKeyUp(i1, keyevent);
        }
    }

    protected void onPause()
    {
        super.onPause();
    }

    protected void onRestart()
    {
        super.onRestart();
    }

    public abstract void onResultButtonCancel(View view);

    public void onResultButtonDelete(View view)
    {
    }

    public abstract void onResultButtonOK(View view);

    protected void onResume()
    {
        n.al = this;
        com.h.b.a(this);
        File file = new File((new StringBuilder()).append(Environment.getExternalStorageDirectory()).append("/download/").toString());
        file.mkdirs();
        (new File(file, "BCA Mobile.apk")).delete();
        super.onResume();
    }

    protected void onStart()
    {
        super.onStart();
    }

    protected void onStop()
    {
        super.onStop();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (y.isActive() && motionevent.getAction() == 0)
        {
            y.hideSoftInputFromWindow(b.getWindowToken(), 0);
        }
        if (n.y != null)
        {
            n.y.d();
        }
        return true;
    }
}
