// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v7.internal.view.WindowCallbackWrapper;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplBase

class this._cls0 extends WindowCallbackWrapper
{

    final AppCompatDelegateImplBase this$0;

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        if (AppCompatDelegateImplBase.this.dispatchKeyEvent(keyevent))
        {
            return true;
        } else
        {
            return super.dispatchKeyEvent(keyevent);
        }
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyevent)
    {
        if (onKeyShortcut(keyevent.getKeyCode(), keyevent))
        {
            return true;
        } else
        {
            return super.dispatchKeyShortcutEvent(keyevent);
        }
    }

    public void onContentChanged()
    {
    }

    public boolean onCreatePanelMenu(int i, Menu menu)
    {
        if (i == 0 && !(menu instanceof MenuBuilder))
        {
            return false;
        } else
        {
            return super.onCreatePanelMenu(i, menu);
        }
    }

    public boolean onMenuOpened(int i, Menu menu)
    {
        if (AppCompatDelegateImplBase.this.onMenuOpened(i, menu))
        {
            return true;
        } else
        {
            return super.onMenuOpened(i, menu);
        }
    }

    public void onPanelClosed(int i, Menu menu)
    {
        if (AppCompatDelegateImplBase.this.onPanelClosed(i, menu))
        {
            return;
        } else
        {
            super.onPanelClosed(i, menu);
            return;
        }
    }

    public boolean onPreparePanel(int i, View view, Menu menu)
    {
        MenuBuilder menubuilder;
        boolean flag;
        if (menu instanceof MenuBuilder)
        {
            menubuilder = (MenuBuilder)menu;
        } else
        {
            menubuilder = null;
        }
        if (i == 0 && menubuilder == null)
        {
            flag = false;
        } else
        {
            if (menubuilder != null)
            {
                menubuilder.setOverrideVisibleItems(true);
            }
            boolean flag1 = super.onPreparePanel(i, view, menu);
            flag = flag1;
            if (menubuilder != null)
            {
                menubuilder.setOverrideVisibleItems(false);
                return flag1;
            }
        }
        return flag;
    }

    (android.view.lbackBase lbackbase)
    {
        this$0 = AppCompatDelegateImplBase.this;
        super(lbackbase);
    }
}
