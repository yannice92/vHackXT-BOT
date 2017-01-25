// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v4.b.a.b;
import android.view.ActionProvider;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuItemWrapperICS

class MenuItemWrapperJB extends MenuItemWrapperICS
{

    MenuItemWrapperJB(Context context, b b)
    {
        super(context, b);
    }

    MenuItemWrapperICS.ActionProviderWrapper createActionProviderWrapper(ActionProvider actionprovider)
    {
        return new ActionProviderWrapperJB(mContext, actionprovider);
    }

    private class ActionProviderWrapperJB extends MenuItemWrapperICS.ActionProviderWrapper
        implements android.view.ActionProvider.VisibilityListener
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

        public ActionProviderWrapperJB(Context context, ActionProvider actionprovider)
        {
            this$0 = MenuItemWrapperJB.this;
            super(MenuItemWrapperJB.this, context, actionprovider);
        }
    }

}
