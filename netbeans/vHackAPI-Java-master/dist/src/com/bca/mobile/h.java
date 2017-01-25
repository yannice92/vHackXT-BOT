// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

// Referenced classes of package com.bca.mobile:
//            ChangePasswordActivity

final class h
    implements android.view.View.OnClickListener
{

    final ChangePasswordActivity a;

    h(ChangePasswordActivity changepasswordactivity)
    {
        a = changepasswordactivity;
        super();
    }

    public final void onClick(View view)
    {
        a.y.hideSoftInputFromWindow(a.a.getWindowToken(), 0);
        a.d();
    }
}
