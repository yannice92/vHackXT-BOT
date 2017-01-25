// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.support.v4.view.bs;
import android.support.v4.view.ef;
import android.support.v7.internal.widget.ActionBarContainer;
import android.view.View;

// Referenced classes of package android.support.v7.internal.app:
//            WindowDecorActionBar

class this._cls0 extends ef
{

    final WindowDecorActionBar this$0;

    public void onAnimationEnd(View view)
    {
        if (WindowDecorActionBar.access$000(WindowDecorActionBar.this) && WindowDecorActionBar.access$100(WindowDecorActionBar.this) != null)
        {
            bs.b(WindowDecorActionBar.access$100(WindowDecorActionBar.this), 0.0F);
            bs.b(WindowDecorActionBar.access$200(WindowDecorActionBar.this), 0.0F);
        }
        if (WindowDecorActionBar.access$300(WindowDecorActionBar.this) != null && WindowDecorActionBar.access$400(WindowDecorActionBar.this) == 1)
        {
            WindowDecorActionBar.access$300(WindowDecorActionBar.this).setVisibility(8);
        }
        WindowDecorActionBar.access$200(WindowDecorActionBar.this).setVisibility(8);
        WindowDecorActionBar.access$200(WindowDecorActionBar.this).setTransitioning(false);
        WindowDecorActionBar.access$502(WindowDecorActionBar.this, null);
        completeDeferredDestroyActionMode();
        if (WindowDecorActionBar.access$600(WindowDecorActionBar.this) != null)
        {
            bs.p(WindowDecorActionBar.access$600(WindowDecorActionBar.this));
        }
    }

    ()
    {
        this$0 = WindowDecorActionBar.this;
        super();
    }
}
