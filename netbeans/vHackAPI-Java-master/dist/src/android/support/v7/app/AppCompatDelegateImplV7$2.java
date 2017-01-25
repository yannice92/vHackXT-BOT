// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v4.view.bd;
import android.support.v4.view.bs;
import android.support.v4.view.eh;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7

class this._cls0
    implements bd
{

    final AppCompatDelegateImplV7 this$0;

    public eh onApplyWindowInsets(View view, eh eh1)
    {
        int i = eh1.b();
        int j = AppCompatDelegateImplV7.access$300(AppCompatDelegateImplV7.this, i);
        eh eh2 = eh1;
        if (i != j)
        {
            eh2 = eh1.a(eh1.a(), j, eh1.c(), eh1.d());
        }
        return bs.a(view, eh2);
    }

    ()
    {
        this$0 = AppCompatDelegateImplV7.this;
        super();
    }
}
