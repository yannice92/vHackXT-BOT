// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.tab;

import android.content.Intent;
import android.os.Bundle;
import com.bca.mobile.transaction.M_Info;

// Referenced classes of package com.bca.mobile.tab:
//            TabGroupBaseActivity

public class TabGroup1InfoActivity extends TabGroupBaseActivity
{

    public static TabGroup1InfoActivity a;

    public TabGroup1InfoActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a = this;
        a("M_Info_1", new Intent(this, com/bca/mobile/transaction/M_Info));
    }
}
