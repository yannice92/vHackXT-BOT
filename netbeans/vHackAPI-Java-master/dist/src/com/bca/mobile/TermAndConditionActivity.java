// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ProgressBar;

// Referenced classes of package com.bca.mobile:
//            ShareActivity, by, n, ca, 
//            cb

public class TermAndConditionActivity extends ShareActivity
{

    Button a;
    Button b;
    WebView c;
    WebSettings d;
    ProgressBar e;

    public TermAndConditionActivity()
    {
        a = null;
        b = null;
        c = null;
    }

    protected final void a()
    {
    }

    public final void a(int i)
    {
    }

    public final void a(int i, String as[])
    {
    }

    protected final void a(String s)
    {
    }

    protected final void b()
    {
    }

    public final void b(String s)
    {
    }

    public final void c()
    {
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        if (j == 1001)
        {
            setResult(1001);
            finish();
        }
    }

    public void onCancel(DialogInterface dialoginterface)
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f030071);
        c = (WebView)findViewById(0x7f0b024d);
        e = (ProgressBar)findViewById(0x7f0b00c0);
        c.setWebViewClient(new by(this));
        c.loadUrl("file:///android_asset/txt/tnc.html");
        d = c.getSettings();
        if (n.aM < 7.0999999999999996D) goto _L2; else goto _L1
_L1:
        d.setTextSize(android.webkit.WebSettings.TextSize.LARGEST);
_L4:
        a = (Button)findViewById(0x7f0b0250);
        b = (Button)findViewById(0x7f0b024f);
        a.setOnClickListener(new ca(this));
        b.setOnClickListener(new cb(this));
        return;
_L2:
        if (n.aM >= 4.9000000000000004D)
        {
            d.setTextSize(android.webkit.WebSettings.TextSize.LARGER);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
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
        if (n.ao)
        {
            finish();
        }
    }
}
