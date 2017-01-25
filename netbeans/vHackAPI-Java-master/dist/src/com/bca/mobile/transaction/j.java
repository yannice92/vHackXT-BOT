// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bca.mobile.bn;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile.transaction:
//            k, l

public final class j extends Dialog
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener
{

    public static String A = "input_dialog_input_type_text_1";
    public static String a = "input_dialog_input_type";
    public static String b = "input_dialog_pick";
    public static String c = "input_dialog_error_title";
    public static String d = "input_dialog_input_currency";
    public static String e = "input_dialog_error_input_empty";
    public static String f = "input_dialog_error_input_not_in_range_1";
    public static String g = "input_dialog_error_input_not_in_range_2";
    public static String h = "input_dialog_error_input_not_in_range_3";
    public static String i = "input_dialog_label_input";
    public static String j = "input_dialog_label_input_image";
    public static String k = "input_dialog_label_input_image_pick";
    public static String l = "input_dialog_label_list";
    public static String m = "input_dialog_label_list_image";
    public static String n = "input_dialog_label_list_image_pick";
    public static String o = "input_dialog_list_data_1";
    public static String p = "input_dialog_list_data_2";
    public static String q = "input_dialog_enable_choose_1";
    public static String r = "input_dialog_enable_choose_2";
    public static String s = "input_dialog_label_1";
    public static String t = "input_dialog_check_text_1";
    public static String u = "input_dialog_min_len_1";
    public static String v = "input_dialog_max_len_1";
    public static String w = "input_dialog_min_amount_1";
    public static String x = "input_dialog_max_amount_1";
    public static String y = "input_dialog_check_state_1";
    public static String z = "input_dialog_input_1";
    Hashtable B;
    android.widget.AdapterView.OnItemClickListener C;
    l D;
    LinearLayout E;
    LinearLayout F;
    boolean G;
    RelativeLayout H;
    Button I;
    Button J;
    Drawable K;
    Drawable L;
    Drawable M;
    Drawable N;
    String O;
    String P;
    LinearLayout Q;
    TextView R;
    EditText S;
    CheckBox T;
    Button U;
    Button V;
    int W;
    String X;
    boolean Y;
    int Z;
    int aa;
    int ab;
    long ac;
    LinearLayout ad;
    ListView ae;
    ArrayList af;
    LinearLayout ag;
    ListView ah;
    ArrayList ai;
    Context aj;
    InputFilter ak;

    public j(Context context, Hashtable hashtable, android.widget.AdapterView.OnItemClickListener onitemclicklistener, l l1)
    {
        super(context);
        G = true;
        W = 0;
        X = "";
        Y = false;
        ak = new k(this);
        getWindow().requestFeature(1);
        aj = context;
        B = hashtable;
        D = l1;
        C = onitemclicklistener;
        W = 1;
        hashtable = LayoutInflater.from(context).inflate(0x7f030030, null);
        setContentView(hashtable);
        onitemclicklistener = new DisplayMetrics();
        ((Activity)context).getWindowManager().getDefaultDisplay().getMetrics(onitemclicklistener);
        int i1 = ((DisplayMetrics) (onitemclicklistener)).heightPixels;
        int k1 = (int)(260F * aj.getResources().getDisplayMetrics().density + 0.5F);
        float f1 = aj.getResources().getDisplayMetrics().density;
        if (i1 == 320)
        {
            ((LinearLayout)hashtable.findViewById(0x7f0b00c8)).getLayoutParams().width = k1;
        } else
        {
            j1 = ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getWidth();
            ((LinearLayout)hashtable.findViewById(0x7f0b00c8)).getLayoutParams().width = (j1 * 9) / 10;
        }
        onitemclicklistener = ((android.widget.AdapterView.OnItemClickListener) (B.get(b)));
        if (onitemclicklistener != null)
        {
            G = ((Boolean)onitemclicklistener).booleanValue();
        }
        if (B.get(i) != null)
        {
            K = (Drawable)B.get(j);
            L = (Drawable)B.get(k);
            O = (String)B.get(i);
        }
        if (B.get(l) != null)
        {
            M = (Drawable)B.get(m);
            N = (Drawable)B.get(n);
            P = (String)B.get(l);
        }
        onitemclicklistener = ((android.widget.AdapterView.OnItemClickListener) (B.get(A)));
        if (onitemclicklistener != null)
        {
            Y = ((Boolean)onitemclicklistener).booleanValue();
        } else
        if (B.get(s) != null)
        {
            Z = ((Integer)B.get(u)).intValue();
            aa = ((Integer)B.get(v)).intValue();
            ab = ((Integer)B.get(w)).intValue();
            ac = ((Long)B.get(x)).longValue();
        }
        onitemclicklistener = ((android.widget.AdapterView.OnItemClickListener) (B.get(o)));
        if (onitemclicklistener != null)
        {
            af = (ArrayList)onitemclicklistener;
        }
        onitemclicklistener = ((android.widget.AdapterView.OnItemClickListener) (B.get(p)));
        if (onitemclicklistener != null)
        {
            ai = (ArrayList)onitemclicklistener;
        }
        H = (RelativeLayout)hashtable.findViewById(0x7f0b00c9);
        I = (Button)hashtable.findViewById(0x7f0b00cb);
        J = (Button)hashtable.findViewById(0x7f0b00ca);
        Q = (LinearLayout)hashtable.findViewById(0x7f0b00cd);
        R = (TextView)hashtable.findViewById(0x7f0b00ce);
        S = (EditText)hashtable.findViewById(0x7f0b00cf);
        T = (CheckBox)hashtable.findViewById(0x7f0b00d0);
        V = (Button)hashtable.findViewById(0x7f0b00d2);
        U = (Button)hashtable.findViewById(0x7f0b00d1);
        ad = (LinearLayout)hashtable.findViewById(0x7f0b00d9);
        ae = (ListView)hashtable.findViewById(0x7f0b00da);
        ag = (LinearLayout)hashtable.findViewById(0x7f0b00db);
        ah = (ListView)hashtable.findViewById(0x7f0b00dc);
        if (K != null)
        {
            boolean flag;
            boolean flag1;
            if (G)
            {
                I.setBackgroundDrawable(L);
                I.setTextColor(context.getResources().getColor(0x7f080034));
            } else
            {
                I.setBackgroundDrawable(K);
                I.setTextColor(context.getResources().getColor(0x7f080033));
            }
            I.setText((String)B.get(i));
            I.setOnClickListener(this);
            H.setVisibility(0);
        }
        if (M != null)
        {
            if (G)
            {
                J.setBackgroundDrawable(M);
                J.setTextColor(context.getResources().getColor(0x7f080033));
            } else
            {
                J.setBackgroundDrawable(N);
                J.setTextColor(context.getResources().getColor(0x7f080034));
            }
            J.setText((String)B.get(l));
            J.setOnClickListener(this);
            H.setVisibility(0);
        }
        if (Z != 0 || aa != 0 || ab != 0)
        {
            X = (String)B.get(s);
            R.setText(X);
            int j1;
            if (B.get(t) != null)
            {
                T.setText((String)B.get(t));
                T.setChecked(((Boolean)B.get(y)).booleanValue());
            } else
            {
                T.setVisibility(8);
            }
            U.setOnClickListener(this);
            V.setOnClickListener(this);
            S.setText((String)B.get(z));
            if (G)
            {
                Q.setVisibility(0);
            }
            E = Q;
            if (W != 0)
            {
                j1 = aa;
            } else
            if (Z != 0 || aa != 0)
            {
                j1 = 19;
            } else
            if (ab != 0)
            {
                if ((X.contains("Uang") || X.contains("uang")) && X.contains("Rp"))
                {
                    j1 = 9;
                } else
                if (X.contains("Uang") || X.contains("uang"))
                {
                    j1 = 8;
                } else
                if (ac != 0L)
                {
                    j1 = (new StringBuilder(String.valueOf(ac))).toString().length();
                } else
                {
                    j1 = 8;
                }
            } else
            {
                j1 = 0;
            }
            System.out.println((new StringBuilder("l_intLen : ")).append(j1).append(" max :").append(aa).toString());
            S.setFilters(new InputFilter[] {
                new android.text.InputFilter.LengthFilter(j1)
            });
            S.setInputType(2);
            if (X.contains("Uang") || X.contains("uang"))
            {
                bn.a(S);
            }
        }
        if (Y)
        {
            X = (String)B.get(s);
            R.setText(X);
            S.setText((String)B.get(z));
            S.setFilters(new InputFilter[] {
                new android.text.InputFilter.LengthFilter(32)
            });
            T.setVisibility(8);
            V.setOnClickListener(this);
            U.setOnClickListener(this);
            if (G)
            {
                Q.setVisibility(0);
            }
            E = Q;
        }
        if (af != null)
        {
            onitemclicklistener = new ArrayAdapter(context, 0x7f030033, af);
            ae.setAdapter(onitemclicklistener);
            ae.setOnItemClickListener(this);
            if (G)
            {
                ad.setVisibility(0);
            }
            E = ad;
        }
        if (ai != null)
        {
            context = new ArrayAdapter(context, 0x7f030033, ai);
            ah.setAdapter(context);
            ah.setOnItemClickListener(this);
            if (!G)
            {
                ag.setVisibility(0);
            }
            F = ag;
        }
        context = ((Context) (B.get(q)));
        if (context != null)
        {
            flag = ((Boolean)context).booleanValue();
            flag1 = ((Boolean)B.get(r)).booleanValue();
            context = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            context.addRule(14, 1);
            if (!flag)
            {
                I.setVisibility(8);
                hashtable.findViewById(0x7f0b00cc).setVisibility(8);
                J.setLayoutParams(context);
            }
            if (!flag1)
            {
                J.setVisibility(8);
                hashtable.findViewById(0x7f0b00cc).setVisibility(8);
                I.setLayoutParams(context);
            }
        }
    }

    private String a(String s1)
    {
        String s2 = s1;
        if (G)
        {
            s2 = s1.replace("#LABEL#", X.replace(":", "").replace("Input ", "")).replace("#SD.MIN#", (new StringBuilder()).append(Z).toString()).replace("#SD.MAX#", (new StringBuilder()).append(aa).toString()).replace("#SD.RANGE_FROM#", (new StringBuilder()).append(ab).toString()).replace("#SD.RANGE_TO#", (new StringBuilder()).append(ac).toString());
        }
        s1 = s2;
        if (s2.indexOf("#SD.CURRENCY#") != -1)
        {
            s1 = s2.replace("#SD.CURRENCY#", (String)B.get(d));
        }
        return s1;
    }

    public final void onClick(View view)
    {
        if (!view.equals(I) || G) goto _L2; else goto _L1
_L1:
        I.setBackgroundDrawable(L);
        J.setBackgroundDrawable(M);
        I.setTextColor(aj.getResources().getColor(0x7f080034));
        J.setTextColor(aj.getResources().getColor(0x7f080033));
        G = true;
        E.setVisibility(0);
        F.setVisibility(8);
        ((InputMethodManager)aj.getSystemService("input_method")).hideSoftInputFromWindow(I.getWindowToken(), 0);
_L9:
        return;
_L2:
        Object obj;
        String s1;
        int i1;
        if (view.equals(J) && G)
        {
            I.setBackgroundDrawable(K);
            J.setBackgroundDrawable(N);
            I.setTextColor(aj.getResources().getColor(0x7f080033));
            J.setTextColor(aj.getResources().getColor(0x7f080034));
            G = false;
            E.setVisibility(8);
            F.setVisibility(0);
            ((InputMethodManager)aj.getSystemService("input_method")).hideSoftInputFromWindow(J.getWindowToken(), 0);
            return;
        }
        if (!view.equals(V))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (Y)
        {
            view = S.getText().toString();
            ((InputMethodManager)aj.getSystemService("input_method")).hideSoftInputFromWindow(S.getWindowToken(), 0);
            D.a(view, T.isChecked(), G);
            dismiss();
            return;
        }
        s1 = S.getText().toString();
        i1 = s1.length();
        obj = null;
        if (i1 == 0)
        {
            if (W == 1)
            {
                view = "142 - Anda belum menginput Jumlah Bayar.";
            } else
            {
                view = a((String)B.get(e));
            }
        } else
        {
label0:
            {
                if (Z == 0 || aa == 0)
                {
                    break MISSING_BLOCK_LABEL_546;
                }
                if (Z != aa || i1 == Z)
                {
                    break label0;
                }
                view = a((String)B.get(f));
            }
        }
_L5:
        ((InputMethodManager)aj.getSystemService("input_method")).hideSoftInputFromWindow(S.getWindowToken(), 0);
        if (view != null)
        {
            B.get(c);
            bn.a(view, (Activity)aj);
            return;
        } else
        {
            D.a(s1, T.isChecked(), G);
            dismiss();
            return;
        }
        if (i1 < Z) goto _L4; else goto _L3
_L3:
        view = obj;
        if (i1 <= aa) goto _L5; else goto _L4
_L4:
        view = a((String)B.get(g));
          goto _L5
        if (ab == 0 || ac == 0L)
        {
            break MISSING_BLOCK_LABEL_651;
        }
        try
        {
            i1 = (new Integer(s1)).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            System.out.println((new StringBuilder("Error - ")).append(view.toString()).toString());
            i1 = 0;
        }
        if (i1 < ab) goto _L7; else goto _L6
_L6:
        view = obj;
        if ((long)i1 <= ac) goto _L5; else goto _L7
_L7:
        view = a((String)B.get(g));
          goto _L5
        view = obj;
        if (ab != 0)
        {
            view = obj;
            if (ac == 0L)
            {
                try
                {
                    i1 = (new Integer(s1)).intValue();
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    System.out.println((new StringBuilder("Error - ")).append(view.toString()).toString());
                    i1 = 0;
                }
                view = obj;
                if (i1 < ab)
                {
                    view = a((String)B.get(h));
                }
            }
        }
          goto _L5
        if (!view.equals(U)) goto _L9; else goto _L8
_L8:
        ((InputMethodManager)aj.getSystemService("input_method")).hideSoftInputFromWindow(S.getWindowToken(), 0);
        dismiss();
        return;
    }

    public final void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        if (G)
        {
            C.onItemClick(adapterview, view, i1, 0L);
        } else
        {
            C.onItemClick(adapterview, view, i1, 1L);
        }
        dismiss();
    }

}
