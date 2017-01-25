// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.method.NumberKeyListener;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.f.a;
import java.io.PrintStream;
import java.util.ArrayList;

// Referenced classes of package com.bca.mobile:
//            n, TabSample, bs, bo, 
//            bp, br

public final class bn
{

    static Dialog a;
    private static ContextWrapper b;
    private static SharedPreferences c;

    public static int a(String s)
    {
        return c.getInt(s, 0);
    }

    public static Dialog a(String s, Activity activity)
    {
        return b(s, activity);
    }

    public static String a(int i)
    {
        return b.getResources().getString(i);
    }

    public static String a(ArrayList arraylist)
    {
        return (String)arraylist.get(Integer.parseInt((String)arraylist.get(arraylist.size() - 1)));
    }

    public static String a(String as[])
    {
        as = as[1].split(":@:");
        int j = as.length;
        StringBuilder stringbuilder = new StringBuilder();
        int i = 0;
        do
        {
            if (i >= j)
            {
                return stringbuilder.toString();
            }
            stringbuilder.append(as[i]);
            if (i != j - 1)
            {
                stringbuilder.append("\n");
            }
            i++;
        } while (true);
    }

    public static void a()
    {
        if (n.j != null)
        {
            n.j.release();
            n.j = null;
        }
    }

    public static void a(Activity activity, boolean flag)
    {
        a();
        a("isLogin", "0");
        n.aw = true;
        if (n.y != null)
        {
            n.y.c();
            n.y = null;
        }
        if (n.am != null && flag)
        {
            n.am.finish();
        }
        activity.finish();
        n.an = true;
    }

    public static void a(Context context)
    {
        context = new ContextWrapper(context);
        b = context;
        c = context.getSharedPreferences("bca", 0);
    }

    public static void a(EditText edittext)
    {
        edittext.addTextChangedListener(new bs(edittext));
    }

    public static void a(String s, int i)
    {
        android.content.SharedPreferences.Editor editor = c.edit();
        editor.putInt(s, i);
        editor.commit();
    }

    public static void a(String s, String s1)
    {
        android.content.SharedPreferences.Editor editor = c.edit();
        editor.putString(s, s1);
        editor.commit();
    }

    private static Dialog b(String s, Activity activity)
    {
        Object obj;
        int i;
        int j;
        int k;
        obj = new Dialog(activity);
        a = ((Dialog) (obj));
        ((Dialog) (obj)).getWindow().requestFeature(1);
        a.getWindow().setBackgroundDrawableResource(0x7f0201da);
        a.setContentView(0x7f030026);
        i = (int)(61F * activity.getResources().getDisplayMetrics().density + 0.5F);
        j = (int)(172F * activity.getResources().getDisplayMetrics().density + 0.5F);
        obj = ((WindowManager)activity.getSystemService("window")).getDefaultDisplay();
        k = ((Display) (obj)).getWidth();
        int l = ((Display) (obj)).getHeight();
        LinearLayout linearlayout = (LinearLayout)a.findViewById(0x7f0b009c);
        linearlayout.getLayoutParams().height = (l * 5) / 10;
        linearlayout.getLayoutParams().width = (k * 7) / 10;
        TextView textview = (TextView)a.findViewById(0x7f0b009e);
        obj = (TextView)a.findViewById(0x7f0b00a0);
        textview.setText(null);
        ((TextView) (obj)).setText(s);
        if (n.aM < 5.5D)
        {
            ((TextView) (obj)).setTextSize(14F);
        }
        obj = (LinearLayout)a.findViewById(0x7f0b00a7);
        a.findViewById(0x7f0b009f).setVisibility(8);
        textview.setVisibility(8);
        activity = new Button(activity);
        activity.setBackgroundResource(0x7f020047);
        ((LinearLayout) (obj)).setVisibility(0);
        activity.setOnClickListener(new bo());
        a.setOnCancelListener(new bp());
        k = linearlayout.getLayoutParams().width / 2;
        int i1 = (int)(0.29999999999999999D * (double)k);
        try
        {
            if (n.aM > 6.7999999999999998D)
            {
                s = new android.widget.LinearLayout.LayoutParams(j, i);
            } else
            {
                s = new android.widget.LinearLayout.LayoutParams(k, i1);
            }
            ((LinearLayout) (obj)).setGravity(81);
            ((LinearLayout) (obj)).addView(activity, s);
            a.show();
            return a;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            System.out.println(s.toString());
        }
        return null;
    }

    public static NumberKeyListener b()
    {
        return new br();
    }

    public static String b(String s, String s1)
    {
        return c.getString(s, s1);
    }

    public static ArrayList b(String s)
    {
        ArrayList arraylist = new ArrayList();
        s = s.split(":@:");
        int j = s.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return arraylist;
            }
            arraylist.add(s[i]);
            i++;
        } while (true);
    }

    public static void b(Context context)
    {
        android.content.SharedPreferences.Editor editor = c.edit();
        editor.clear();
        editor.commit();
        context = new com.c.a(context);
        context.a();
        context.b();
        return;
        Object obj;
        obj;
        ((Exception) (obj)).printStackTrace();
        context.b();
        return;
        obj;
        context.b();
        throw obj;
    }
}
