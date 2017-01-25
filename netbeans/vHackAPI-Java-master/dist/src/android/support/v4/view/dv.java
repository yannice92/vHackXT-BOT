// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewPropertyAnimator;

// Referenced classes of package android.support.v4.view:
//            dt, ed, eg

class dv extends dt
{

    dv()
    {
    }

    public final void a(View view, eg eg)
    {
        view.animate().setUpdateListener(new ed(eg, view));
    }
}
