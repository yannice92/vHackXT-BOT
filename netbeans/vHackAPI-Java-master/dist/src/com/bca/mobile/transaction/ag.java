// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.os.Handler;
import android.os.Message;
import com.bca.mobile.bm;
import com.bca.mobile.n;
import java.util.List;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Commerce

final class ag extends Handler
{

    final M_Commerce a;

    ag(M_Commerce m_commerce)
    {
        a = m_commerce;
        super();
    }

    public final void handleMessage(Message message)
    {
        if (n.k)
        {
            a.d();
            if (a.b == 0)
            {
                a.q.set(a.q.size() - 1, "Inbox");
            } else
            {
                a.q.set(a.q.size() - 1, (new StringBuilder("Inbox (")).append(a.b).append(")").toString());
            }
            M_Commerce.a(a).notifyDataSetChanged();
            n.k = false;
        }
    }
}
