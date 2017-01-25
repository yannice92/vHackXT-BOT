// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ProgressBar;

// Referenced classes of package com.bca.mobile:
//            ShareActivity, n, o

public class InfoBCA_Acitivity extends ShareActivity
{

    private WebView a;
    private ProgressBar b;

    public InfoBCA_Acitivity()
    {
    }

    static ProgressBar a(InfoBCA_Acitivity infobca_acitivity)
    {
        return infobca_acitivity.b;
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
        a.stopLoading();
        finish();
    }

    public final void b(String s)
    {
    }

    public final void c()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f03002f, this);
        super.c("m-BCA");
        super.e("back");
        bundle = (new StringBuilder("https://")).append(n.F).append(":8443/mbca/HTTPHandler").toString();
        a = (WebView)findViewById(0x7f0b00c6);
        b = (ProgressBar)findViewById(0x7f0b00c7);
        a.getSettings().setJavaScriptEnabled(true);
        a.setWebViewClient(new o(this));
        a.loadUrl(bundle);
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
}
