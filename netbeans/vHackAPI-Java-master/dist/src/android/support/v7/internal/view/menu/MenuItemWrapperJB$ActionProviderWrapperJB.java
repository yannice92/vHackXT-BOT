// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v4.view.p;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuItemWrapperJB

class init> extends init>
    implements android.view.S.ActionProviderWrapper
{

    p mListener;
    final MenuItemWrapperJB this$0;

    public boolean isVisible()
    {
        return mInner.isVisible();
    }

    public void onActionProviderVisibilityChanged(boolean flag)
    {
        if (mListener != null)
        {
            mListener.onActionProviderVisibilityChanged(flag);
        }
    }

    public View onCreateActionView(MenuItem menuitem)
    {
        return mInner.onCreateActionView(menuitem);
    }

    public boolean overridesItemVisibility()
    {
        return mInner.overridesItemVisibility();
    }

    public void refreshVisibility()
    {
        mInner.refreshVisibility();
    }

    public void setVisibilityListener(p p1)
    {
        mListener = p1;
        ActionProvider actionprovider = mInner;
        if (p1 != null)
        {
            p1 = this;
        } else
        {
            p1 = null;
        }
        actionprovider.setVisibilityListener(p1);
    }

    public (Context context, ActionProvider actionprovider)
    {
        this$0 = MenuItemWrapperJB.this;
        super(MenuItemWrapperJB.this, context, actionprovider);
    }
}
