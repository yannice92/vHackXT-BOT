// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.g;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.aa;
import android.support.v4.app.t;
import java.util.List;

// Referenced classes of package com.g:
//            e, g

public final class f extends aa
{

    Bundle a;
    e b;
    g c;

    public f(t t)
    {
        super(t);
        a = new Bundle();
        b = new e();
        c = new g();
    }

    public final Fragment a(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            b.a(a);
            return b;

        case 1: // '\001'
            return c;
        }
    }

    public final void a(Bundle bundle)
    {
        b.d(bundle);
    }

    public final void a(List list)
    {
        c.a(list);
    }
}
