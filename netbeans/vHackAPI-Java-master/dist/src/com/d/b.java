// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.d;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.e.a;
import java.io.PrintStream;
import java.util.ArrayList;

// Referenced classes of package com.d:
//            c, d, a

public final class b
{

    static Dialog a;
    static EditText b = null;

    public static void a()
    {
        if (a != null)
        {
            a.cancel();
            a = null;
        }
    }

    public static void a(Context context, int i, String s, String s1, int j, int k, com.d.a a1)
    {
        Object obj1;
        Button button;
        int l;
        int i1;
        try
        {
            Object obj = new Dialog(context);
            a = ((Dialog) (obj));
            ((Dialog) (obj)).getWindow().requestFeature(1);
            a.setContentView(0x7f030019);
            obj = new DisplayMetrics();
            ((Activity)context).getWindowManager().getDefaultDisplay().getMetrics(((DisplayMetrics) (obj)));
            l = ((DisplayMetrics) (obj)).heightPixels;
            i1 = (int)(260F * context.getResources().getDisplayMetrics().density + 0.5F);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            System.out.println((new StringBuilder("showDialogMsg :")).append(context.toString()).toString());
            return;
        }
        if (l != 320)
        {
            break MISSING_BLOCK_LABEL_254;
        }
        context = (LinearLayout)a.findViewById(0x7f0b004f);
        obj1 = (LinearLayout)a.findViewById(0x7f0b0050);
        context.getLayoutParams().width = i1;
        ((LinearLayout) (obj1)).setVisibility(0);
_L2:
        context = (TextView)a.findViewById(0x7f0b0051);
        b = (EditText)a.findViewById(0x7f0b0052);
        obj1 = (Button)a.findViewById(0x7f0b0053);
        button = (Button)a.findViewById(0x7f0b0054);
        b.setKeyListener(com.e.a.a());
        b.setText(s1);
        b.setSelection(s1.length());
        context.setText(s);
        ((Button) (obj1)).setOnClickListener(new c());
        button.setOnClickListener(new d(j, k, a1, i));
        a.show();
        return;
        l = ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getWidth();
        context = (LinearLayout)a.findViewById(0x7f0b004f);
        obj1 = (LinearLayout)a.findViewById(0x7f0b0050);
        context.getLayoutParams().width = (l * 9) / 10;
        ((LinearLayout) (obj1)).setVisibility(0);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void a(Context context, ArrayList arraylist, android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        ListView listview;
        int i;
        int j;
        try
        {
            Object obj = new Dialog(context);
            a = ((Dialog) (obj));
            ((Dialog) (obj)).getWindow().requestFeature(1);
            a.setContentView(0x7f03001a);
            obj = new DisplayMetrics();
            ((Activity)context).getWindowManager().getDefaultDisplay().getMetrics(((DisplayMetrics) (obj)));
            i = ((DisplayMetrics) (obj)).heightPixels;
            j = (int)(260F * context.getResources().getDisplayMetrics().density + 0.5F);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            System.out.println((new StringBuilder("showDialogMsg :")).append(context.toString()).toString());
            return;
        }
        if (i != 320)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        ((LinearLayout)a.findViewById(0x7f0b004f)).getLayoutParams().width = j;
_L2:
        listview = (ListView)a.findViewById(0x7f0b0055);
        listview.setAdapter(new ArrayAdapter(context, 0x7f030033, arraylist));
        listview.setOnItemClickListener(onitemclicklistener);
        a.show();
        return;
        i = ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getWidth();
        ((LinearLayout)a.findViewById(0x7f0b004f)).getLayoutParams().width = (i * 9) / 10;
        if (true) goto _L2; else goto _L1
_L1:
    }

}
