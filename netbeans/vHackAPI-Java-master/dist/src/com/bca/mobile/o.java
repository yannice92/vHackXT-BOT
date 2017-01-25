// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import java.io.PrintStream;

// Referenced classes of package com.bca.mobile:
//            InfoBCA_Acitivity

final class o extends WebViewClient
{

    final InfoBCA_Acitivity a;

    o(InfoBCA_Acitivity infobca_acitivity)
    {
        a = infobca_acitivity;
        super();
    }

    public final void onPageFinished(WebView webview, String s)
    {
        System.out.println("WebView onPageFinished");
        InfoBCA_Acitivity.a(a).setVisibility(4);
        super.onPageFinished(webview, s);
    }

    public final void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        System.out.println("WebView start");
        InfoBCA_Acitivity.a(a).setVisibility(0);
        super.onPageStarted(webview, s, bitmap);
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        System.out.println("webview loading");
        webview.loadUrl(s);
        return true;
    }
}
