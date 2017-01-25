// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.io.PrintStream;

// Referenced classes of package com.bca.mobile:
//            n

public abstract class bu extends Dialog
    implements android.view.View.OnClickListener
{

    Button a;
    Button b;
    LinearLayout c;
    RelativeLayout d;
    WebView e;
    WebSettings f;
    TextView g;
    int h;
    int i;

    public bu(Context context, String s, int j, int k, String s1)
    {
        super(context);
        e = null;
        a(context, s, j, k, s1, false);
    }

    public bu(Context context, String s, int j, String s1)
    {
        super(context);
        e = null;
        a(context, s, j, 0, s1, true);
    }

    private void a(Context context, String s, int j, int k, String s1, boolean flag)
    {
        h = k;
        i = j;
        onBackPressed();
        requestWindowFeature(1);
        getWindow().setBackgroundDrawableResource(0x7f0201da);
        if (n.c >= 600 && n.aM > 7.0999999999999996D)
        {
            setContentView(0x7f03006b);
        } else
        {
            setContentView(0x7f03006a);
        }
        g = (TextView)findViewById(0x7f0b0238);
        g.setText(s1);
        if (j != 1) goto _L2; else goto _L1
_L1:
        d = (RelativeLayout)findViewById(0x7f0b023f);
        a = (Button)findViewById(0x7f0b0240);
        a.setOnClickListener(this);
        d.setVisibility(0);
_L4:
        context = s.replace("%", "&#37;");
        e = (WebView)findViewById(0x7f0b023b);
        e.setBackgroundColor(0);
        e.loadData(context, "text/html", "utf-8");
        f = e.getSettings();
        if (s.contains("Inbox") || s.contains("inbox"))
        {
            System.out.println("Inboxxx : true");
            context = (RelativeLayout)findViewById(0x7f0b0236);
            e.getLayoutParams().width = context.getLayoutParams().width - 10;
        }
        if (n.c >= 600 && n.aM > 7D)
        {
            f.setDefaultFontSize(28);
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (j == 2)
        {
            c = (LinearLayout)findViewById(0x7f0b023c);
            a = (Button)findViewById(0x7f0b023e);
            b = (Button)findViewById(0x7f0b023d);
            if (flag)
            {
                b.setBackgroundDrawable(context.getResources().getDrawable(0x7f02004e));
                a.setBackgroundDrawable(context.getResources().getDrawable(0x7f020061));
            }
            c.setVisibility(0);
            b.setOnClickListener(this);
            a.setOnClickListener(this);
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (n.aM > 5.5D)
        {
            f.setDefaultFontSize(20);
            return;
        }
        if (n.aM > 2.8999999999999999D)
        {
            f.setDefaultFontSize(17);
            return;
        } else
        {
            f.setDefaultFontSize(16);
            return;
        }
    }

    public abstract void a();

    public abstract void b();

    public void onBackPressed()
    {
        if (i != 1) goto _L2; else goto _L1
_L1:
        if (1 != h) goto _L4; else goto _L3
_L3:
        dismiss();
        a();
_L6:
        return;
_L4:
        if (h == 0)
        {
            dismiss();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (i == 2)
        {
            dismiss();
            b();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onClick(View view)
    {
        if (i != 1) goto _L2; else goto _L1
_L1:
        if (view != a) goto _L4; else goto _L3
_L3:
        if (1 != h) goto _L6; else goto _L5
_L5:
        dismiss();
        a();
_L4:
        return;
_L6:
        if (h == 0)
        {
            dismiss();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (view == a)
        {
            dismiss();
            a();
            return;
        }
        if (view == b)
        {
            dismiss();
            b();
            return;
        }
        if (true) goto _L4; else goto _L7
_L7:
    }
}
