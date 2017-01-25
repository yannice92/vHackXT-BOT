// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v4.b.a.b;
import android.support.v4.b.a.c;
import android.support.v4.e.a;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package android.support.v7.internal.view.menu:
//            BaseWrapper, MenuWrapperFactory

abstract class BaseMenuWrapper extends BaseWrapper
{

    final Context mContext;
    private Map mMenuItems;
    private Map mSubMenus;

    BaseMenuWrapper(Context context, Object obj)
    {
        super(obj);
        mContext = context;
    }

    final MenuItem getMenuItemWrapper(MenuItem menuitem)
    {
        if (menuitem instanceof b)
        {
            b b1 = (b)menuitem;
            if (mMenuItems == null)
            {
                mMenuItems = new a();
            }
            MenuItem menuitem1 = (MenuItem)mMenuItems.get(menuitem);
            menuitem = menuitem1;
            if (menuitem1 == null)
            {
                menuitem = MenuWrapperFactory.wrapSupportMenuItem(mContext, b1);
                mMenuItems.put(b1, menuitem);
            }
            return menuitem;
        } else
        {
            return menuitem;
        }
    }

    final SubMenu getSubMenuWrapper(SubMenu submenu)
    {
        if (submenu instanceof c)
        {
            c c1 = (c)submenu;
            if (mSubMenus == null)
            {
                mSubMenus = new a();
            }
            SubMenu submenu1 = (SubMenu)mSubMenus.get(c1);
            submenu = submenu1;
            if (submenu1 == null)
            {
                submenu = MenuWrapperFactory.wrapSupportSubMenu(mContext, c1);
                mSubMenus.put(c1, submenu);
            }
            return submenu;
        } else
        {
            return submenu;
        }
    }

    final void internalClear()
    {
        if (mMenuItems != null)
        {
            mMenuItems.clear();
        }
        if (mSubMenus != null)
        {
            mSubMenus.clear();
        }
    }

    final void internalRemoveGroup(int i)
    {
        if (mMenuItems != null)
        {
            Iterator iterator = mMenuItems.keySet().iterator();
            while (iterator.hasNext()) 
            {
                if (i == ((MenuItem)iterator.next()).getGroupId())
                {
                    iterator.remove();
                }
            }
        }
    }

    final void internalRemoveItem(int i)
    {
        if (mMenuItems != null)
        {
            Iterator iterator = mMenuItems.keySet().iterator();
            while (iterator.hasNext()) 
            {
                if (i == ((MenuItem)iterator.next()).getItemId())
                {
                    iterator.remove();
                    return;
                }
            }
        }
    }
}
