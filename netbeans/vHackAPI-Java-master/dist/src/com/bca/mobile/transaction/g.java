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
//            h, i

public final class g extends Dialog
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener
{

    public static String A = "input_dialog_input_1";
    public static String B = "input_dialog_input_type_text_1";
    public static String C = "input_dialog_input_filter_1";
    public static String D = "input_dialog_label_2";
    public static String E = "input_dialog_check_text_2";
    public static String F = "input_dialog_min_len_2";
    public static String G = "input_dialog_max_len_2";
    public static String H = "input_dialog_min_amount_2";
    public static String I = "input_dialog_max_amount_2";
    public static String J = "input_dialog_check_state_2";
    public static String K = "input_dialog_input_2";
    public static String L = "input_dialog_input_type_text_2";
    public static String a = "input_dialog_input_type";
    public static String b = "input_dialog_pick";
    public static String c = "input_dialog_error_title";
    public static String d = "input_dialog_input_currency";
    public static String e = "input_dialog_transfer_type";
    public static String f = "input_dialog_error_input_empty";
    public static String g = "input_dialog_error_input_not_in_range_1";
    public static String h = "input_dialog_error_input_not_in_range_2";
    public static String i = "input_dialog_error_input_not_in_range_3";
    public static String j = "input_dialog_label_input";
    public static String k = "input_dialog_label_input_image";
    public static String l = "input_dialog_label_input_image_pick";
    public static String m = "input_dialog_label_list";
    public static String n = "input_dialog_label_list_image";
    public static String o = "input_dialog_label_list_image_pick";
    public static String p = "input_dialog_list_data_1";
    public static String q = "input_dialog_list_data_2";
    public static String r = "input_dialog_enable_choose_1";
    public static String s = "input_dialog_enable_choose_2";
    public static String t = "input_dialog_label_1";
    public static String u = "input_dialog_check_text_1";
    public static String v = "input_dialog_min_len_1";
    public static String w = "input_dialog_max_len_1";
    public static String x = "input_dialog_min_amount_1";
    public static String y = "input_dialog_max_amount_1";
    public static String z = "input_dialog_check_state_1";
    Hashtable M;
    android.widget.AdapterView.OnItemClickListener N;
    i O;
    LinearLayout P;
    LinearLayout Q;
    boolean R;
    RelativeLayout S;
    Button T;
    Button U;
    Drawable V;
    Drawable W;
    Drawable X;
    Drawable Y;
    String Z;
    ListView aA;
    ArrayList aB;
    LinearLayout aC;
    ListView aD;
    ArrayList aE;
    Context aF;
    InputFilter aG;
    String aa;
    LinearLayout ab;
    TextView ac;
    EditText ad;
    CheckBox ae;
    Button af;
    Button ag;
    String ah;
    boolean ai;
    int aj;
    int ak;
    int al;
    int am;
    LinearLayout an;
    TextView ao;
    EditText ap;
    CheckBox aq;
    Button ar;
    Button as;
    String at;
    boolean au;
    int av;
    int aw;
    int ax;
    int ay;
    LinearLayout az;

    public g(Context context, Hashtable hashtable, android.widget.AdapterView.OnItemClickListener onitemclicklistener, i i1)
    {
        byte byte0 = 9;
        super(context);
        R = true;
        ah = "";
        ai = false;
        at = "";
        au = false;
        aG = new h(this);
        getWindow().requestFeature(1);
        aF = context;
        M = hashtable;
        O = i1;
        N = onitemclicklistener;
        i1 = LayoutInflater.from(context).inflate(0x7f030030, null);
        setContentView(i1);
        hashtable = new DisplayMetrics();
        ((Activity)context).getWindowManager().getDefaultDisplay().getMetrics(hashtable);
        int j1 = ((DisplayMetrics) (hashtable)).heightPixels;
        int l1 = (int)(260F * aF.getResources().getDisplayMetrics().density + 0.5F);
        float f1 = aF.getResources().getDisplayMetrics().density;
        if (j1 == 320)
        {
            ((LinearLayout)i1.findViewById(0x7f0b00c8)).getLayoutParams().width = l1;
        } else
        {
            k1 = ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getWidth();
            ((LinearLayout)i1.findViewById(0x7f0b00c8)).getLayoutParams().width = (k1 * 9) / 10;
        }
        hashtable = ((Hashtable) (M.get(b)));
        if (hashtable != null)
        {
            R = ((Boolean)hashtable).booleanValue();
        }
        if (M.get(j) != null)
        {
            V = (Drawable)M.get(k);
            W = (Drawable)M.get(l);
            Z = (String)M.get(j);
            X = (Drawable)M.get(n);
            Y = (Drawable)M.get(o);
            aa = (String)M.get(m);
        }
        hashtable = ((Hashtable) (M.get(B)));
        if (hashtable != null)
        {
            ai = ((Boolean)hashtable).booleanValue();
        } else
        if (M.get(t) != null)
        {
            c();
        }
        hashtable = ((Hashtable) (M.get(L)));
        if (hashtable != null)
        {
            au = ((Boolean)hashtable).booleanValue();
        } else
        if (M.get(D) != null)
        {
            e();
            ax = b(H);
            ay = b(I);
        }
        hashtable = ((Hashtable) (M.get(p)));
        if (hashtable != null)
        {
            aB = (ArrayList)hashtable;
        }
        hashtable = ((Hashtable) (M.get(q)));
        if (hashtable != null)
        {
            aE = (ArrayList)hashtable;
        }
        S = (RelativeLayout)i1.findViewById(0x7f0b00c9);
        T = (Button)i1.findViewById(0x7f0b00cb);
        U = (Button)i1.findViewById(0x7f0b00ca);
        T = (Button)i1.findViewById(0x7f0b00ca);
        U = (Button)i1.findViewById(0x7f0b00cb);
        ab = (LinearLayout)i1.findViewById(0x7f0b00cd);
        ac = (TextView)i1.findViewById(0x7f0b00ce);
        ad = (EditText)i1.findViewById(0x7f0b00cf);
        ae = (CheckBox)i1.findViewById(0x7f0b00d0);
        ag = (Button)i1.findViewById(0x7f0b00d2);
        af = (Button)i1.findViewById(0x7f0b00d1);
        an = (LinearLayout)i1.findViewById(0x7f0b00d3);
        ao = (TextView)i1.findViewById(0x7f0b00d4);
        ap = (EditText)i1.findViewById(0x7f0b00d5);
        aq = (CheckBox)i1.findViewById(0x7f0b00d6);
        as = (Button)i1.findViewById(0x7f0b00d8);
        ar = (Button)i1.findViewById(0x7f0b00d7);
        az = (LinearLayout)i1.findViewById(0x7f0b00d9);
        aA = (ListView)i1.findViewById(0x7f0b00da);
        aC = (LinearLayout)i1.findViewById(0x7f0b00db);
        aD = (ListView)i1.findViewById(0x7f0b00dc);
        if (V != null)
        {
            boolean flag;
            boolean flag1;
            if (R)
            {
                T.setBackgroundDrawable(W);
                U.setBackgroundDrawable(X);
                T.setTextColor(context.getResources().getColor(0x7f080034));
                U.setTextColor(context.getResources().getColor(0x7f080033));
            } else
            {
                T.setBackgroundDrawable(V);
                U.setBackgroundDrawable(Y);
                T.setTextColor(context.getResources().getColor(0x7f080033));
                U.setTextColor(context.getResources().getColor(0x7f080034));
            }
            T.setText((String)M.get(j));
            U.setText((String)M.get(m));
            T.setOnClickListener(this);
            U.setOnClickListener(this);
            S.setVisibility(0);
        }
        if (aj != 0 || ak != 0 || al != 0)
        {
            ah = (String)M.get(t);
            ac.setText(ah);
            b();
            af.setOnClickListener(this);
            ag.setOnClickListener(this);
            ad.setText((String)M.get(A));
            if (R)
            {
                ab.setVisibility(0);
            }
            P = ab;
            int k1;
            if (ak != 0)
            {
                k1 = ak;
            } else
            if (aj != 0)
            {
                k1 = 19;
            } else
            if (al != 0)
            {
                System.out.println((new StringBuilder("WLS-Debug - Label :")).append(ah).append("_ l_intLen :0").toString());
                onitemclicklistener = (String)M.get(e);
                hashtable = onitemclicklistener;
                if (onitemclicklistener == null)
                {
                    hashtable = "";
                }
                if ((ah.contains("Uang") || ah.contains("uang")) && ah.contains("Rp"))
                {
                    k1 = 9;
                } else
                if ((ah.contains("Uang") || ah.contains("uang")) && hashtable.contains("TRSFAR"))
                {
                    k1 = 9;
                } else
                if (ah.contains("Uang") || ah.contains("uang"))
                {
                    k1 = 8;
                } else
                if (am != 0)
                {
                    k1 = (new StringBuilder(String.valueOf(am))).toString().length();
                } else
                {
                    k1 = 8;
                }
            } else
            {
                k1 = 0;
            }
            System.out.println((new StringBuilder("l_intLen : ")).append(k1).append("max :").append(ak).toString());
            ad.setFilters(new InputFilter[] {
                new android.text.InputFilter.LengthFilter(k1)
            });
            ad.setInputType(2);
            if (ah.contains("Uang") || ah.contains("uang"))
            {
                bn.a(ad);
            }
        }
        if (av != 0 || aw != 0 || ax != 0)
        {
            at = (String)M.get(D);
            ao.setText(at);
            a();
            ar.setOnClickListener(this);
            as.setOnClickListener(this);
            ap.setText((String)M.get(K));
            aq.setChecked(((Boolean)M.get(J)).booleanValue());
            if (!R)
            {
                an.setVisibility(0);
            }
            Q = an;
            if (av != 0 || aw != 0)
            {
                k1 = 19;
            } else
            if (ax != 0)
            {
                k1 = byte0;
                if (!at.contains("Uang"))
                {
                    k1 = byte0;
                    if (!at.contains("uang"))
                    {
                        if (ay != 0)
                        {
                            k1 = (new StringBuilder(String.valueOf(ay))).toString().length();
                        } else
                        {
                            k1 = 8;
                        }
                    }
                }
            } else
            {
                k1 = 0;
            }
            System.out.println((new StringBuilder("l_intLen : ")).append(k1).append("max :").append(aw).toString());
            ap.setFilters(new InputFilter[] {
                new android.text.InputFilter.LengthFilter(k1)
            });
            ap.setInputType(2);
            if (at.contains("Uang") || at.contains("uang"))
            {
                bn.a(ap);
            }
        }
        if (ai)
        {
            d();
            k1 = ak;
            if (ak == 0)
            {
                k1 = 32;
            }
            System.out.println((new StringBuilder("Max Length ")).append(k1).append(" ").append(ak).toString());
            ah = (String)M.get(t);
            ac.setText(ah);
            ad.setText((String)M.get(A));
            ad.setFilters(new InputFilter[] {
                new android.text.InputFilter.LengthFilter(k1)
            });
            b();
            ag.setOnClickListener(this);
            af.setOnClickListener(this);
            if (R)
            {
                ab.setVisibility(0);
            }
            P = ab;
        }
        if (au)
        {
            e();
            k1 = aw;
            if (aw == 0)
            {
                k1 = 32;
            }
            at = (String)M.get(D);
            ao.setText(at);
            ap.setText((String)M.get(K));
            ap.setFilters(new InputFilter[] {
                new android.text.InputFilter.LengthFilter(k1)
            });
            a();
            as.setOnClickListener(this);
            ar.setOnClickListener(this);
            if (!R)
            {
                an.setVisibility(0);
            }
            Q = an;
        }
        if (aB != null)
        {
            hashtable = new ArrayAdapter(context, 0x7f030033, aB);
            aA.setAdapter(hashtable);
            aA.setOnItemClickListener(this);
            if (R)
            {
                az.setVisibility(0);
            }
            P = az;
        }
        if (aE != null)
        {
            context = new ArrayAdapter(context, 0x7f030033, aE);
            aD.setAdapter(context);
            aD.setOnItemClickListener(this);
            if (!R)
            {
                aC.setVisibility(0);
            }
            Q = aC;
        }
        context = ((Context) (M.get(r)));
        if (context != null)
        {
            flag = ((Boolean)context).booleanValue();
            flag1 = ((Boolean)M.get(s)).booleanValue();
            context = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            context.addRule(14, 1);
            if (!flag)
            {
                T.setVisibility(8);
                i1.findViewById(0x7f0b00cc).setVisibility(8);
                U.setLayoutParams(context);
            }
            if (!flag1)
            {
                U.setVisibility(8);
                i1.findViewById(0x7f0b00cc).setVisibility(8);
                T.setLayoutParams(context);
            }
        }
    }

    private String a(String s1)
    {
        String s2;
        if (R)
        {
            s1 = s1.replace("#LABEL#", ah.replace(":", "").replace("Input ", "")).replace("#SD.MIN#", (new StringBuilder()).append(aj).toString()).replace("#SD.MAX#", (new StringBuilder()).append(ak).toString()).replace("#SD.RANGE_FROM#", (new StringBuilder()).append(al).toString()).replace("#SD.RANGE_TO#", (new StringBuilder()).append(am).toString());
        } else
        {
            s1 = s1.replace("#LABEL#", at.replace(":", "").replace("Input ", "")).replace("#SD.MIN#", (new StringBuilder()).append(av).toString()).replace("#SD.MAX#", (new StringBuilder()).append(aw).toString()).replace("#SD.RANGE_FROM#", (new StringBuilder()).append(ax).toString()).replace("#SD.RANGE_TO#", (new StringBuilder()).append(ay).toString());
        }
        s2 = s1;
        if (s1.indexOf("#SD.CURRENCY#") != -1)
        {
            s2 = s1.replace("#SD.CURRENCY#", (String)M.get(d));
        }
        return s2;
    }

    private void a()
    {
        if (M.get(E) != null)
        {
            aq.setText((String)M.get(E));
            aq.setChecked(((Boolean)M.get(J)).booleanValue());
            return;
        } else
        {
            aq.setVisibility(8);
            return;
        }
    }

    private int b(String s1)
    {
        s1 = ((String) (M.get(s1)));
        if (s1 == null)
        {
            return 0;
        } else
        {
            return ((Integer)s1).intValue();
        }
    }

    private void b()
    {
        if (M.get(u) != null)
        {
            ae.setText((String)M.get(u));
            ae.setChecked(((Boolean)M.get(z)).booleanValue());
            return;
        } else
        {
            ae.setVisibility(8);
            return;
        }
    }

    private void c()
    {
        d();
        al = b(x);
        am = b(y);
    }

    private void d()
    {
        aj = b(v);
        ak = b(w);
    }

    private void e()
    {
        av = b(F);
        aw = b(G);
    }

    private String f()
    {
        Object obj;
        String s1;
        boolean flag;
        boolean flag1;
        int i2;
        flag1 = false;
        flag = false;
        obj = ad.getText().toString();
        i2 = ((String) (obj)).length();
        s1 = (String)M.get(C);
        if (s1 == null) goto _L2; else goto _L1
_L1:
        char ac1[];
        int i1;
        int j2;
        ac1 = s1.toCharArray();
        j2 = ac1.length;
        i1 = 0;
_L7:
        if (i1 < j2) goto _L4; else goto _L3
_L3:
        i1 = 0;
_L6:
        if (i1 != 0)
        {
            return a((String)M.get("input_dialog_error_input_contain_illegal_character"));
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (!((String) (obj)).contains(Character.toString(ac1[i1])))
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = 1;
        if (true) goto _L6; else goto _L5
_L5:
        i1++;
        if (true) goto _L7; else goto _L2
_L2:
        if (i2 == 0)
        {
            return a((String)M.get(f));
        }
        if (aj != 0 && ak != 0)
        {
            if (aj == ak && i2 != aj)
            {
                return a((String)M.get(g));
            }
            if (i2 < aj || i2 > ak)
            {
                return a((String)M.get(h));
            }
            if (al != 0 && am == 0)
            {
                int j1;
                try
                {
                    j1 = (new Integer(((String) (obj)))).intValue();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    System.out.println((new StringBuilder("Error - ")).append(((Exception) (obj)).toString()).toString());
                    j1 = 0;
                }
                if (j1 < al)
                {
                    return a((String)M.get(i));
                }
            }
        } else
        if (al != 0 && am != 0)
        {
            int k1;
            try
            {
                k1 = (new Integer(((String) (obj)))).intValue();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                System.out.println((new StringBuilder("Error - ")).append(((Exception) (obj)).toString()).toString());
                k1 = ((flag) ? 1 : 0);
            }
            if (k1 < al || k1 > am)
            {
                return a((String)M.get(h));
            }
        } else
        if (al != 0 && am == 0)
        {
            int l1;
            try
            {
                l1 = (new Integer(((String) (obj)))).intValue();
            }
            catch (Exception exception)
            {
                System.out.println((new StringBuilder("Error - ")).append(exception.toString()).toString());
                l1 = ((flag1) ? 1 : 0);
            }
            if (l1 < al)
            {
                return a((String)M.get(i));
            }
        }
        return null;
    }

    public final void onClick(View view)
    {
        boolean flag = false;
        if (!view.equals(T) || R) goto _L2; else goto _L1
_L1:
        T.setBackgroundDrawable(W);
        U.setBackgroundDrawable(X);
        T.setTextColor(aF.getResources().getColor(0x7f080034));
        U.setTextColor(aF.getResources().getColor(0x7f080033));
        R = true;
        P.setVisibility(0);
        Q.setVisibility(8);
        ((InputMethodManager)aF.getSystemService("input_method")).hideSoftInputFromWindow(T.getWindowToken(), 0);
_L9:
        return;
_L2:
        Object obj;
        String s3;
        int i1;
        if (view.equals(U) && R)
        {
            T.setBackgroundDrawable(V);
            U.setBackgroundDrawable(Y);
            T.setTextColor(aF.getResources().getColor(0x7f080033));
            U.setTextColor(aF.getResources().getColor(0x7f080034));
            R = false;
            P.setVisibility(8);
            Q.setVisibility(0);
            ((InputMethodManager)aF.getSystemService("input_method")).hideSoftInputFromWindow(U.getWindowToken(), 0);
            return;
        }
        if (view.equals(ag))
        {
            if (ai)
            {
                view = ad.getText().toString();
                ((InputMethodManager)aF.getSystemService("input_method")).hideSoftInputFromWindow(ad.getWindowToken(), 0);
                if (M.get("force_validation") != null)
                {
                    flag = true;
                }
                if (flag)
                {
                    c();
                    String s1 = f();
                    if (s1 != null)
                    {
                        M.get(c);
                        bn.a(s1, (Activity)aF);
                        return;
                    } else
                    {
                        O.a(view, ae.isChecked(), R);
                        dismiss();
                        return;
                    }
                } else
                {
                    O.a(view, ae.isChecked(), R);
                    dismiss();
                    return;
                }
            }
            view = ad.getText().toString();
            String s2 = f();
            ((InputMethodManager)aF.getSystemService("input_method")).hideSoftInputFromWindow(ad.getWindowToken(), 0);
            if (s2 != null)
            {
                M.get(c);
                bn.a(s2, (Activity)aF);
                return;
            } else
            {
                O.a(view, ae.isChecked(), R);
                dismiss();
                return;
            }
        }
        if (view.equals(af))
        {
            ((InputMethodManager)aF.getSystemService("input_method")).hideSoftInputFromWindow(ad.getWindowToken(), 0);
            dismiss();
            return;
        }
        if (!view.equals(as))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (au)
        {
            view = ap.getText().toString();
            ((InputMethodManager)aF.getSystemService("input_method")).hideSoftInputFromWindow(ap.getWindowToken(), 0);
            O.a(view, aq.isChecked(), R);
            dismiss();
            return;
        }
        s3 = ap.getText().toString();
        i1 = s3.length();
        obj = null;
        if (i1 == 0)
        {
            view = a((String)M.get(f));
        } else
        {
label0:
            {
                if (av == 0 || aw == 0)
                {
                    break MISSING_BLOCK_LABEL_841;
                }
                if (av != aw || i1 == av)
                {
                    break label0;
                }
                view = a((String)M.get(g));
            }
        }
_L5:
        ((InputMethodManager)aF.getSystemService("input_method")).hideSoftInputFromWindow(ap.getWindowToken(), 0);
        if (view != null)
        {
            M.get(c);
            bn.a(view, (Activity)aF);
            return;
        } else
        {
            O.a(s3, aq.isChecked(), R);
            dismiss();
            return;
        }
        if (i1 < av) goto _L4; else goto _L3
_L3:
        view = obj;
        if (i1 <= aw) goto _L5; else goto _L4
_L4:
        view = a((String)M.get(h));
          goto _L5
        if (ax == 0 || ay == 0)
        {
            break MISSING_BLOCK_LABEL_942;
        }
        try
        {
            i1 = (new Integer(s3)).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            System.out.println((new StringBuilder("Error - ")).append(view.toString()).toString());
            i1 = 0;
        }
        if (i1 < ax) goto _L7; else goto _L6
_L6:
        view = obj;
        if (i1 <= ay) goto _L5; else goto _L7
_L7:
        view = a((String)M.get(h));
          goto _L5
        view = obj;
        if (ax != 0)
        {
            view = obj;
            if (ay == 0)
            {
                try
                {
                    i1 = (new Integer(s3)).intValue();
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    System.out.println((new StringBuilder("Error - ")).append(view.toString()).toString());
                    i1 = 0;
                }
                view = obj;
                if (i1 < ax)
                {
                    view = a((String)M.get(i));
                }
            }
        }
          goto _L5
        if (!view.equals(ar)) goto _L9; else goto _L8
_L8:
        ((InputMethodManager)aF.getSystemService("input_method")).hideSoftInputFromWindow(ap.getWindowToken(), 0);
        dismiss();
        return;
    }

    public final void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        if (R)
        {
            N.onItemClick(adapterview, view, i1, 0L);
        } else
        {
            N.onItemClick(adapterview, view, i1, 1L);
        }
        dismiss();
    }

}
