// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

// Referenced classes of package com.bca.mobile:
//            TermAndConditionActivity, bz

final class by extends WebViewClient
{

    final TermAndConditionActivity a;

    by(TermAndConditionActivity termandconditionactivity)
    {
        a = termandconditionactivity;
        super();
    }

    static TermAndConditionActivity a(by by1)
    {
        return by1.a;
    }

    public final void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        a.e.setVisibility(8);
        (new Handler()).postDelayed(new bz(this), 1000L);
    }

    public final void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
    }
}
