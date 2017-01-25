// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.tab;

import android.content.Intent;
import android.os.Bundle;
import com.bca.mobile.transaction.M_Commerce;

// Referenced classes of package com.bca.mobile.tab:
//            TabGroupBaseActivity

public class TabGroup4CommerceActivity extends TabGroupBaseActivity
{

    public static TabGroup4CommerceActivity a;

    public TabGroup4CommerceActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a = this;
        a("M_Commerce_1", new Intent(this, com/bca/mobile/transaction/M_Commerce));
    }
}
