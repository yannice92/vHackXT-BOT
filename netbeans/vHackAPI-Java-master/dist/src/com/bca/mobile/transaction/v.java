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
//            M_Admin_Blokir_KK

final class v extends WebViewClient
{

    final M_Admin_Blokir_KK a;

    v(M_Admin_Blokir_KK m_admin_blokir_kk)
    {
        a = m_admin_blokir_kk;
        super();
    }

    public final void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        a.X.setVisibility(8);
        new Handler();
        M_Admin_Blokir_KK.a(a).setVisibility(0);
        M_Admin_Blokir_KK.b(a).setVisibility(0);
    }

    public final void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
    }
}
