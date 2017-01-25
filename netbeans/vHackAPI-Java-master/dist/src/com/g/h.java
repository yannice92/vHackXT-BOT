// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.g;

import a.b;
import java.util.Comparator;

// Referenced classes of package com.g:
//            g

final class h
    implements Comparator
{

    final g a;

    h(g g)
    {
        a = g;
        super();
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (b)obj;
        return ((b)obj1).k().compareToIgnoreCase(((b) (obj)).k());
    }
}
