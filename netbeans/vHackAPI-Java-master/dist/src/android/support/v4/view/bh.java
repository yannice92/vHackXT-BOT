// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v4.view:
//            da, db, PagerTitleStrip, ViewPager, 
//            be

final class bh extends DataSetObserver
    implements da, db
{

    final PagerTitleStrip a;
    private int b;

    private bh(PagerTitleStrip pagertitlestrip)
    {
        a = pagertitlestrip;
        super();
    }

    bh(PagerTitleStrip pagertitlestrip, byte byte0)
    {
        this(pagertitlestrip);
    }

    public final void a(int i)
    {
        float f = 0.0F;
        if (b == 0)
        {
            PagerTitleStrip pagertitlestrip = a;
            i = a.a.b();
            a.a.a();
            pagertitlestrip.b(i);
            if (PagerTitleStrip.a(a) >= 0.0F)
            {
                f = PagerTitleStrip.a(a);
            }
            a.a(a.a.b(), f, true);
        }
    }

    public final void a(int i, float f)
    {
        int j = i;
        if (f > 0.5F)
        {
            j = i + 1;
        }
        a.a(j, f, false);
    }

    public final void a(be be, be be1)
    {
        a.a(be, be1);
    }

    public final void b(int i)
    {
        b = i;
    }

    public final void onChanged()
    {
        float f = 0.0F;
        PagerTitleStrip pagertitlestrip = a;
        int i = a.a.b();
        a.a.a();
        pagertitlestrip.b(i);
        if (PagerTitleStrip.a(a) >= 0.0F)
        {
            f = PagerTitleStrip.a(a);
        }
        a.a(a.a.b(), f, true);
    }
}
