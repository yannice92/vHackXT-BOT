// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.LayoutInflater;

// Referenced classes of package android.support.v4.view:
//            ac, ah, ai

final class ad extends ac
{

    ad()
    {
    }

    public final void a(LayoutInflater layoutinflater, ai ai)
    {
        if (ai != null)
        {
            ai = new ah(ai);
        } else
        {
            ai = null;
        }
        layoutinflater.setFactory2(ai);
    }
}
