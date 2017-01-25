// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Admin_BlokirATM

final class t extends WebViewClient
{

    final M_Admin_BlokirATM a;

    t(M_Admin_BlokirATM m_admin_blokiratm)
    {
        a = m_admin_blokiratm;
        super();
    }

    public final void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        a.c.setVisibility(8);
        new Handler();
        M_Admin_BlokirATM.a(a).setVisibility(0);
        M_Admin_BlokirATM.b(a).setVisibility(0);
    }

    public final void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
    }
}
