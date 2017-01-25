// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.content.Intent;
import android.view.View;

// Referenced classes of package com.bca.mobile:
//            InputATMActivity, TermAndConditionActivity

final class ca
    implements android.view.View.OnClickListener
{

    final TermAndConditionActivity a;

    ca(TermAndConditionActivity termandconditionactivity)
    {
        a = termandconditionactivity;
        super();
    }

    public final void onClick(View view)
    {
        view = new Intent(a, com/bca/mobile/InputATMActivity);
        a.startActivityForResult(view, 1001);
        a.finish();
    }
}
