// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.content.Intent;
import com.bca.mobile.transaction.ChangePinActivity_Trans;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile:
//            ShareActivity, n, ActivateActivity_Trans

final class be
    implements Runnable
{

    final ShareActivity a;
    private final String b;
    private final String c;

    be(ShareActivity shareactivity, String s, String s1)
    {
        a = shareactivity;
        b = s;
        c = s1;
        super();
    }

    public final void run()
    {
        a.g();
        if (b.equals("ACTS"))
        {
            if (n.m != null)
            {
                n.m = null;
            }
            Object obj = new Hashtable();
            n.m = ((Hashtable) (obj));
            ((Hashtable) (obj)).put("atm_num", c);
            obj = new Intent(a, com/bca/mobile/ActivateActivity_Trans);
            a.startActivity(((Intent) (obj)));
        } else
        if (b.equals("FPCS"))
        {
            Intent intent = new Intent(a, com/bca/mobile/transaction/ChangePinActivity_Trans);
            a.startActivity(intent);
            return;
        }
    }
}
