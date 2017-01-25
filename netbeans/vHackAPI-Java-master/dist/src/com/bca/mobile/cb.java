// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.view.View;

// Referenced classes of package com.bca.mobile:
//            TermAndConditionActivity

final class cb
    implements android.view.View.OnClickListener
{

    final TermAndConditionActivity a;

    cb(TermAndConditionActivity termandconditionactivity)
    {
        a = termandconditionactivity;
        super();
    }

    public final void onClick(View view)
    {
        a.finish();
    }
}
