// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            p, o

public abstract class n
{

    private static final String TAG = "ActionProvider(support)";
    private final Context mContext;
    private o mSubUiVisibilityListener;
    private p mVisibilityListener;

    public n(Context context)
    {
        mContext = context;
    }

    public Context getContext()
    {
        return mContext;
    }

    public boolean hasSubMenu()
    {
        return false;
    }

    public boolean isVisible()
    {
        return true;
    }

    public abstract View onCreateActionView();

    public View onCreateActionView(MenuItem menuitem)
    {
        return onCreateActionView();
    }

    public boolean onPerformDefaultAction()
    {
        return false;
    }

    public void onPrepareSubMenu(SubMenu submenu)
    {
    }

    public boolean overridesItemVisibility()
    {
        return false;
    }

    public void refreshVisibility()
    {
        if (mVisibilityListener != null && overridesItemVisibility())
        {
            mVisibilityListener.onActionProviderVisibilityChanged(isVisible());
        }
    }

    public void setSubUiVisibilityListener(o o1)
    {
        mSubUiVisibilityListener = o1;
    }

    public void setVisibilityListener(p p1)
    {
        if (mVisibilityListener != null && p1 != null)
        {
            Log.w("ActionProvider(support)", (new StringBuilder("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ")).append(getClass().getSimpleName()).append(" instance while it is still in use somewhere else?").toString());
        }
        mVisibilityListener = p1;
    }

    public void subUiVisibilityChanged(boolean flag)
    {
        if (mSubUiVisibilityListener != null)
        {
            mSubUiVisibilityListener.onSubUiVisibilityChanged(flag);
        }
    }
}
