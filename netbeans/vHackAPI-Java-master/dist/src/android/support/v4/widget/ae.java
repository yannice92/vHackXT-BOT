// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.View;
import android.widget.ListView;

// Referenced classes of package android.support.v4.widget:
//            a

public final class ae extends a
{

    private final ListView a;

    public ae(ListView listview)
    {
        super(listview);
        a = listview;
    }

    public final void a(int i)
    {
        ListView listview = a;
        int j = listview.getFirstVisiblePosition();
        View view;
        if (j != -1)
        {
            if ((view = listview.getChildAt(0)) != null)
            {
                listview.setSelectionFromTop(j, view.getTop() - i);
                return;
            }
        }
    }

    public final boolean b(int i)
    {
        ListView listview;
        int j;
        listview = a;
        j = listview.getCount();
        if (j != 0) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int l;
        int k = listview.getChildCount();
        l = listview.getFirstVisiblePosition();
        if (i <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (l + k >= j && listview.getChildAt(k - 1).getBottom() <= listview.getHeight())
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        return true;
        if (i >= 0) goto _L1; else goto _L3
_L3:
        if (l <= 0 && listview.getChildAt(0).getTop() >= 0)
        {
            return false;
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }
}
