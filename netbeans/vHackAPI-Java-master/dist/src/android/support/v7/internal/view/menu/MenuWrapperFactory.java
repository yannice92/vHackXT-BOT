// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v4.b.a.a;
import android.support.v4.b.a.b;
import android.support.v4.b.a.c;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuWrapperICS, MenuItemWrapperJB, MenuItemWrapperICS, SubMenuWrapperICS

public final class MenuWrapperFactory
{

    private MenuWrapperFactory()
    {
    }

    public static Menu wrapSupportMenu(Context context, a a)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return new MenuWrapperICS(context, a);
        } else
        {
            throw new UnsupportedOperationException();
        }
    }

    public static MenuItem wrapSupportMenuItem(Context context, b b)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return new MenuItemWrapperJB(context, b);
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return new MenuItemWrapperICS(context, b);
        } else
        {
            throw new UnsupportedOperationException();
        }
    }

    public static SubMenu wrapSupportSubMenu(Context context, c c)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return new SubMenuWrapperICS(context, c);
        } else
        {
            throw new UnsupportedOperationException();
        }
    }
}
