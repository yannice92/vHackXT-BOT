// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.b.a.a;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

// Referenced classes of package android.support.v7.internal.view.menu:
//            BaseMenuWrapper

class MenuWrapperICS extends BaseMenuWrapper
    implements Menu
{

    MenuWrapperICS(Context context, a a1)
    {
        super(context, a1);
    }

    public MenuItem add(int i)
    {
        return getMenuItemWrapper(((a)mWrappedObject).add(i));
    }

    public MenuItem add(int i, int j, int k, int l)
    {
        return getMenuItemWrapper(((a)mWrappedObject).add(i, j, k, l));
    }

    public MenuItem add(int i, int j, int k, CharSequence charsequence)
    {
        return getMenuItemWrapper(((a)mWrappedObject).add(i, j, k, charsequence));
    }

    public MenuItem add(CharSequence charsequence)
    {
        return getMenuItemWrapper(((a)mWrappedObject).add(charsequence));
    }

    public int addIntentOptions(int i, int j, int k, ComponentName componentname, Intent aintent[], Intent intent, int l, 
            MenuItem amenuitem[])
    {
        MenuItem amenuitem1[] = null;
        if (amenuitem != null)
        {
            amenuitem1 = new MenuItem[amenuitem.length];
        }
        j = ((a)mWrappedObject).addIntentOptions(i, j, k, componentname, aintent, intent, l, amenuitem1);
        if (amenuitem1 != null)
        {
            i = 0;
            for (k = amenuitem1.length; i < k; i++)
            {
                amenuitem[i] = getMenuItemWrapper(amenuitem1[i]);
            }

        }
        return j;
    }

    public SubMenu addSubMenu(int i)
    {
        return getSubMenuWrapper(((a)mWrappedObject).addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int j, int k, int l)
    {
        return getSubMenuWrapper(((a)mWrappedObject).addSubMenu(i, j, k, l));
    }

    public SubMenu addSubMenu(int i, int j, int k, CharSequence charsequence)
    {
        return getSubMenuWrapper(((a)mWrappedObject).addSubMenu(i, j, k, charsequence));
    }

    public SubMenu addSubMenu(CharSequence charsequence)
    {
        return getSubMenuWrapper(((a)mWrappedObject).addSubMenu(charsequence));
    }

    public void clear()
    {
        internalClear();
        ((a)mWrappedObject).clear();
    }

    public void close()
    {
        ((a)mWrappedObject).close();
    }

    public MenuItem findItem(int i)
    {
        return getMenuItemWrapper(((a)mWrappedObject).findItem(i));
    }

    public MenuItem getItem(int i)
    {
        return getMenuItemWrapper(((a)mWrappedObject).getItem(i));
    }

    public boolean hasVisibleItems()
    {
        return ((a)mWrappedObject).hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyevent)
    {
        return ((a)mWrappedObject).isShortcutKey(i, keyevent);
    }

    public boolean performIdentifierAction(int i, int j)
    {
        return ((a)mWrappedObject).performIdentifierAction(i, j);
    }

    public boolean performShortcut(int i, KeyEvent keyevent, int j)
    {
        return ((a)mWrappedObject).performShortcut(i, keyevent, j);
    }

    public void removeGroup(int i)
    {
        internalRemoveGroup(i);
        ((a)mWrappedObject).removeGroup(i);
    }

    public void removeItem(int i)
    {
        internalRemoveItem(i);
        ((a)mWrappedObject).removeItem(i);
    }

    public void setGroupCheckable(int i, boolean flag, boolean flag1)
    {
        ((a)mWrappedObject).setGroupCheckable(i, flag, flag1);
    }

    public void setGroupEnabled(int i, boolean flag)
    {
        ((a)mWrappedObject).setGroupEnabled(i, flag);
    }

    public void setGroupVisible(int i, boolean flag)
    {
        ((a)mWrappedObject).setGroupVisible(i, flag);
    }

    public void setQwertyMode(boolean flag)
    {
        ((a)mWrappedObject).setQwertyMode(flag);
    }

    public int size()
    {
        return ((a)mWrappedObject).size();
    }
}
