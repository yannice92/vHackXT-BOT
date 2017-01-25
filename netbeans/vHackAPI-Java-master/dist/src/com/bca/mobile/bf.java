// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.app.Activity;
import android.content.Context;
import com.h.b;

// Referenced classes of package com.bca.mobile:
//            ShareActivity, bn, n

final class bf
    implements Runnable
{

    final ShareActivity a;
    private final Context b;
    private final int c;
    private final String d;
    private final String e;

    bf(ShareActivity shareactivity, Context context, int i, String s, String s1)
    {
        a = shareactivity;
        b = context;
        c = i;
        d = s;
        e = s1;
        super();
    }

    public final void run()
    {
        Object obj;
        a.i();
        a.g();
        obj = b;
        if (a.getParent() != null)
        {
            obj = a.getParent();
        }
        if (c != 2001 || com.bca.mobile.bn.b("upgradeProvis", "0").equals("1")) goto _L2; else goto _L1
_L1:
        String as[] = d.split(":!:");
        String s1 = as[1];
        String s3 = as[2].split(":@:")[1];
        String s5 = as[2].split(":@:")[0];
        String s7 = as[3];
        String s8 = as[4];
        String s;
        if (as.length > 4)
        {
            s = as[5];
        } else
        {
            s = "0";
        }
        if (com.bca.mobile.bn.b("counterVersion", "-1").equals("-1"))
        {
            bn.a("counterVersion", "0");
        }
        if (com.bca.mobile.bn.b("latestVersion", "0").compareTo(s8) > 0)
        {
            bn.a("upgradeNotif", "0");
            bn.a("latestVersion", s8);
            bn.a("counterVersion", s);
        } else
        if (com.bca.mobile.bn.b("latestVersion", "0").compareTo(s8) == 0)
        {
            if (com.bca.mobile.bn.b("counterVersion", "0").compareTo(s) < 0)
            {
                bn.a("upgradeNotif", "0");
                bn.a("counterVersion", s);
                a.a(s1, (Activity)obj, s3, s5, s7);
                return;
            }
            if (com.bca.mobile.bn.b("counterVersion", "0").compareTo(s) == 0 && com.bca.mobile.bn.b("upgradeNotif", "0").equals("0"))
            {
                a.a(s1, (Activity)obj, s3, s5, s7);
                return;
            }
        } else
        {
            bn.a("upgradeNotif", "0");
            bn.a("latestVersion", s8);
            bn.a("counterVersion", s);
            a.a(s1, (Activity)obj, s3, s5, s7);
            return;
        }
_L4:
        return;
_L2:
        if (c == 2002 && !com.bca.mobile.bn.b("upgradeProvis", "0").equals("1"))
        {
            a.g();
            b.b = 1000;
            String as1[] = d.split(":!:");
            String s2 = as1[1];
            String s4 = as1[2];
            String s6 = as1[3];
            bn.a("latestVersion", as1[4]);
            a.a(s2, (Activity)obj, s4, s6);
            return;
        }
        if (c != 1000)
        {
            break; /* Loop/switch isn't completed */
        }
        if (d.contains("<Rsp "))
        {
            n.ar = d;
            ShareActivity shareactivity = a;
            String as2[] = ShareActivity.h(n.ar);
            a.a(as2[2], (Activity)obj, false, as2[1], true, false);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (c != 1001)
        {
            break; /* Loop/switch isn't completed */
        }
        if (d.contains("<Rsp "))
        {
            n.ar = d;
            ShareActivity shareactivity1 = a;
            String as3[] = ShareActivity.h(n.ar);
            a.a(as3[2], (Activity)obj, false, as3[1], false, false);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (c != 3001)
        {
            break; /* Loop/switch isn't completed */
        }
        if (d.contains("<Rsp "))
        {
            n.ar = d;
            ShareActivity shareactivity2 = a;
            String as4[] = ShareActivity.h(n.ar);
            a.a(as4[2], (Activity)obj, false, as4[1], false, false);
            return;
        }
        if (true) goto _L4; else goto _L6
_L6:
        if (c == 10)
        {
            com.h.b.c();
            bn.a(a, true);
            return;
        }
        if (c == 8 && com.bca.mobile.bn.b("isProvision", "0").equals("1"))
        {
            a.a(bn.a(0x7f0c0067), (Activity)obj, true, bn.a(0x7f0c0061), false, false);
            return;
        }
        if (c == 9)
        {
            a.a(d, (Activity)obj, false, e, false, true);
            return;
        }
        if (c == 12)
        {
            a.a(d, (Activity)obj, false, e, false, false);
            return;
        }
        if (true) goto _L4; else goto _L7
_L7:
    }
}
