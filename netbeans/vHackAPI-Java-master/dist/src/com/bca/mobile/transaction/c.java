// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.app.Activity;
import com.bca.mobile.bn;
import com.bca.mobile.n;
import com.h.b;

// Referenced classes of package com.bca.mobile.transaction:
//            ChangePinActivity_Trans

final class c
    implements Runnable
{

    final ChangePinActivity_Trans a;
    private final int b;
    private final String c;
    private final String d;

    c(ChangePinActivity_Trans changepinactivity_trans, int i, String s, String s1)
    {
        a = changepinactivity_trans;
        b = i;
        c = s;
        d = s1;
        super();
    }

    public final void run()
    {
        ChangePinActivity_Trans changepinactivity_trans;
        a.i();
        a.g();
        changepinactivity_trans = a;
        if (b != 1000) goto _L2; else goto _L1
_L1:
        if (c.contains("<Rsp "))
        {
            n.ar = c;
            ChangePinActivity_Trans changepinactivity_trans1 = a;
            String as[] = ChangePinActivity_Trans.h(n.ar);
            a.a(as[2], (Activity)changepinactivity_trans, false, as[1], true, false);
        }
_L4:
        return;
_L2:
        if (b != 1001)
        {
            break; /* Loop/switch isn't completed */
        }
        if (c.contains("<Rsp "))
        {
            n.ar = c;
            ChangePinActivity_Trans changepinactivity_trans2 = a;
            String as1[] = ChangePinActivity_Trans.h(n.ar);
            a.a(as1[2], (Activity)changepinactivity_trans, false, as1[1], false, false);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (b == 10)
        {
            com.h.b.c();
            bn.a(a, true);
            return;
        }
        if (b == 8 && bn.b("isProvision", "0").equals("1"))
        {
            a.a(bn.a(0x7f0c0067), (Activity)changepinactivity_trans, true, bn.a(0x7f0c0061), false, false);
            return;
        }
        if (b == 9)
        {
            a.a(c, (Activity)changepinactivity_trans, false, d, false, true);
            return;
        }
        if (b == 12)
        {
            a.a(c, (Activity)changepinactivity_trans, false, d, false, false);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }
}
