// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a.b;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v7.internal.view.menu:
//            BaseMenuWrapper

public class MenuItemWrapperICS extends BaseMenuWrapper
    implements MenuItem
{

    static final String LOG_TAG = "MenuItemWrapper";
    private Method mSetExclusiveCheckableMethod;

    MenuItemWrapperICS(Context context, b b1)
    {
        super(context, b1);
    }

    public boolean collapseActionView()
    {
        return ((b)mWrappedObject).collapseActionView();
    }

    ActionProviderWrapper createActionProviderWrapper(ActionProvider actionprovider)
    {
        return new ActionProviderWrapper(mContext, actionprovider);
    }

    public boolean expandActionView()
    {
        return ((b)mWrappedObject).expandActionView();
    }

    public ActionProvider getActionProvider()
    {
        n n = ((b)mWrappedObject).getSupportActionProvider();
        if (n instanceof ActionProviderWrapper)
        {
            return ((ActionProviderWrapper)n).mInner;
        } else
        {
            return null;
        }
    }

    public View getActionView()
    {
        View view1 = ((b)mWrappedObject).getActionView();
        View view = view1;
        if (view1 instanceof CollapsibleActionViewWrapper)
        {
            view = ((CollapsibleActionViewWrapper)view1).getWrappedView();
        }
        return view;
    }

    public char getAlphabeticShortcut()
    {
        return ((b)mWrappedObject).getAlphabeticShortcut();
    }

    public int getGroupId()
    {
        return ((b)mWrappedObject).getGroupId();
    }

    public Drawable getIcon()
    {
        return ((b)mWrappedObject).getIcon();
    }

    public Intent getIntent()
    {
        return ((b)mWrappedObject).getIntent();
    }

    public int getItemId()
    {
        return ((b)mWrappedObject).getItemId();
    }

    public android.view.ContextMenu.ContextMenuInfo getMenuInfo()
    {
        return ((b)mWrappedObject).getMenuInfo();
    }

    public char getNumericShortcut()
    {
        return ((b)mWrappedObject).getNumericShortcut();
    }

    public int getOrder()
    {
        return ((b)mWrappedObject).getOrder();
    }

    public SubMenu getSubMenu()
    {
        return getSubMenuWrapper(((b)mWrappedObject).getSubMenu());
    }

    public CharSequence getTitle()
    {
        return ((b)mWrappedObject).getTitle();
    }

    public CharSequence getTitleCondensed()
    {
        return ((b)mWrappedObject).getTitleCondensed();
    }

    public boolean hasSubMenu()
    {
        return ((b)mWrappedObject).hasSubMenu();
    }

    public boolean isActionViewExpanded()
    {
        return ((b)mWrappedObject).isActionViewExpanded();
    }

    public boolean isCheckable()
    {
        return ((b)mWrappedObject).isCheckable();
    }

    public boolean isChecked()
    {
        return ((b)mWrappedObject).isChecked();
    }

    public boolean isEnabled()
    {
        return ((b)mWrappedObject).isEnabled();
    }

    public boolean isVisible()
    {
        return ((b)mWrappedObject).isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionprovider)
    {
        b b1 = (b)mWrappedObject;
        if (actionprovider != null)
        {
            actionprovider = createActionProviderWrapper(actionprovider);
        } else
        {
            actionprovider = null;
        }
        b1.setSupportActionProvider(actionprovider);
        return this;
    }

    public MenuItem setActionView(int i)
    {
        ((b)mWrappedObject).setActionView(i);
        View view = ((b)mWrappedObject).getActionView();
        if (view instanceof CollapsibleActionView)
        {
            ((b)mWrappedObject).setActionView(new CollapsibleActionViewWrapper(view));
        }
        return this;
    }

    public MenuItem setActionView(View view)
    {
        Object obj = view;
        if (view instanceof CollapsibleActionView)
        {
            obj = new CollapsibleActionViewWrapper(view);
        }
        ((b)mWrappedObject).setActionView(((View) (obj)));
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c)
    {
        ((b)mWrappedObject).setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setCheckable(boolean flag)
    {
        ((b)mWrappedObject).setCheckable(flag);
        return this;
    }

    public MenuItem setChecked(boolean flag)
    {
        ((b)mWrappedObject).setChecked(flag);
        return this;
    }

    public MenuItem setEnabled(boolean flag)
    {
        ((b)mWrappedObject).setEnabled(flag);
        return this;
    }

    public void setExclusiveCheckable(boolean flag)
    {
        try
        {
            if (mSetExclusiveCheckableMethod == null)
            {
                mSetExclusiveCheckableMethod = ((b)mWrappedObject).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[] {
                    Boolean.TYPE
                });
            }
            mSetExclusiveCheckableMethod.invoke(mWrappedObject, new Object[] {
                Boolean.valueOf(flag)
            });
            return;
        }
        catch (Exception exception)
        {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", exception);
        }
    }

    public MenuItem setIcon(int i)
    {
        ((b)mWrappedObject).setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable)
    {
        ((b)mWrappedObject).setIcon(drawable);
        return this;
    }

    public MenuItem setIntent(Intent intent)
    {
        ((b)mWrappedObject).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c)
    {
        ((b)mWrappedObject).setNumericShortcut(c);
        return this;
    }

    public MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
        b b1 = (b)mWrappedObject;
        if (onactionexpandlistener != null)
        {
            onactionexpandlistener = new OnActionExpandListenerWrapper(onactionexpandlistener);
        } else
        {
            onactionexpandlistener = null;
        }
        b1.setSupportOnActionExpandListener(onactionexpandlistener);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
    {
        b b1 = (b)mWrappedObject;
        if (onmenuitemclicklistener != null)
        {
            onmenuitemclicklistener = new OnMenuItemClickListenerWrapper(onmenuitemclicklistener);
        } else
        {
            onmenuitemclicklistener = null;
        }
        b1.setOnMenuItemClickListener(onmenuitemclicklistener);
        return this;
    }

    public MenuItem setShortcut(char c, char c1)
    {
        ((b)mWrappedObject).setShortcut(c, c1);
        return this;
    }

    public void setShowAsAction(int i)
    {
        ((b)mWrappedObject).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i)
    {
        ((b)mWrappedObject).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i)
    {
        ((b)mWrappedObject).setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charsequence)
    {
        ((b)mWrappedObject).setTitle(charsequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charsequence)
    {
        ((b)mWrappedObject).setTitleCondensed(charsequence);
        return this;
    }

    public MenuItem setVisible(boolean flag)
    {
        return ((b)mWrappedObject).setVisible(flag);
    }

    private class ActionProviderWrapper extends n
    {

        final ActionProvider mInner;
        final MenuItemWrapperICS this$0;

        public boolean hasSubMenu()
        {
            return mInner.hasSubMenu();
        }

        public View onCreateActionView()
        {
            return mInner.onCreateActionView();
        }

        public boolean onPerformDefaultAction()
        {
            return mInner.onPerformDefaultAction();
        }

        public void onPrepareSubMenu(SubMenu submenu)
        {
            mInner.onPrepareSubMenu(getSubMenuWrapper(submenu));
        }

        public ActionProviderWrapper(Context context, ActionProvider actionprovider)
        {
            this$0 = MenuItemWrapperICS.this;
            super(context);
            mInner = actionprovider;
        }
    }


    private class CollapsibleActionViewWrapper extends FrameLayout
        implements android.support.v7.view.CollapsibleActionView
    {

        final CollapsibleActionView mWrappedView;

        View getWrappedView()
        {
            return (View)mWrappedView;
        }

        public void onActionViewCollapsed()
        {
            mWrappedView.onActionViewCollapsed();
        }

        public void onActionViewExpanded()
        {
            mWrappedView.onActionViewExpanded();
        }

        CollapsibleActionViewWrapper(View view)
        {
            super(view.getContext());
            mWrappedView = (CollapsibleActionView)view;
            addView(view);
        }
    }


    private class OnActionExpandListenerWrapper extends BaseWrapper
        implements as
    {

        final MenuItemWrapperICS this$0;

        public boolean onMenuItemActionCollapse(MenuItem menuitem)
        {
            return ((android.view.MenuItem.OnActionExpandListener)mWrappedObject).onMenuItemActionCollapse(getMenuItemWrapper(menuitem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuitem)
        {
            return ((android.view.MenuItem.OnActionExpandListener)mWrappedObject).onMenuItemActionExpand(getMenuItemWrapper(menuitem));
        }

        OnActionExpandListenerWrapper(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
        {
            this$0 = MenuItemWrapperICS.this;
            super(onactionexpandlistener);
        }
    }


    private class OnMenuItemClickListenerWrapper extends BaseWrapper
        implements android.view.MenuItem.OnMenuItemClickListener
    {

        final MenuItemWrapperICS this$0;

        public boolean onMenuItemClick(MenuItem menuitem)
        {
            return ((android.view.MenuItem.OnMenuItemClickListener)mWrappedObject).onMenuItemClick(getMenuItemWrapper(menuitem));
        }

        OnMenuItemClickListenerWrapper(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
        {
            this$0 = MenuItemWrapperICS.this;
            super(onmenuitemclicklistener);
        }
    }

}
