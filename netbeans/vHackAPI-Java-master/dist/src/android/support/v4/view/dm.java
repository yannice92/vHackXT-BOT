// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.v4.view:
//            dj, bb

class dm
    implements dj
{

    dm()
    {
    }

    public void a(ViewParent viewparent, View view)
    {
        if (viewparent instanceof bb)
        {
            ((bb)viewparent).onStopNestedScroll(view);
        }
    }

    public void a(ViewParent viewparent, View view, int i, int j, int k, int l)
    {
        if (viewparent instanceof bb)
        {
            ((bb)viewparent).onNestedScroll(view, i, j, k, l);
        }
    }

    public void a(ViewParent viewparent, View view, int i, int j, int ai[])
    {
        if (viewparent instanceof bb)
        {
            ((bb)viewparent).onNestedPreScroll(view, i, j, ai);
        }
    }

    public boolean a(ViewParent viewparent, View view, float f, float f1)
    {
        if (viewparent instanceof bb)
        {
            return ((bb)viewparent).onNestedPreFling(view, f, f1);
        } else
        {
            return false;
        }
    }

    public boolean a(ViewParent viewparent, View view, float f, float f1, boolean flag)
    {
        if (viewparent instanceof bb)
        {
            return ((bb)viewparent).onNestedFling(view, f, f1, flag);
        } else
        {
            return false;
        }
    }

    public boolean a(ViewParent viewparent, View view, View view1, int i)
    {
        if (viewparent instanceof bb)
        {
            return ((bb)viewparent).onStartNestedScroll(view, view1, i);
        } else
        {
            return false;
        }
    }

    public void b(ViewParent viewparent, View view, View view1, int i)
    {
        if (viewparent instanceof bb)
        {
            ((bb)viewparent).onNestedScrollAccepted(view, view1, i);
        }
    }
}
