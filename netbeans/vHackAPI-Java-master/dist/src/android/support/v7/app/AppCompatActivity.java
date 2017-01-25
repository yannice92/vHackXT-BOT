// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ap;
import android.support.v4.app.cp;
import android.support.v4.app.cq;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            AppCompatCallback, AppCompatDelegate, ActionBar

public class AppCompatActivity extends FragmentActivity
    implements cq, ActionBarDrawerToggle.DelegateProvider, AppCompatCallback
{

    private AppCompatDelegate mDelegate;

    public AppCompatActivity()
    {
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        getDelegate().addContentView(view, layoutparams);
    }

    public AppCompatDelegate getDelegate()
    {
        if (mDelegate == null)
        {
            mDelegate = AppCompatDelegate.create(this, this);
        }
        return mDelegate;
    }

    public ActionBarDrawerToggle.Delegate getDrawerToggleDelegate()
    {
        return getDelegate().getDrawerToggleDelegate();
    }

    public MenuInflater getMenuInflater()
    {
        return getDelegate().getMenuInflater();
    }

    public ActionBar getSupportActionBar()
    {
        return getDelegate().getSupportActionBar();
    }

    public Intent getSupportParentActivityIntent()
    {
        return ap.a(this);
    }

    public void invalidateOptionsMenu()
    {
        getDelegate().invalidateOptionsMenu();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        getDelegate().onConfigurationChanged(configuration);
    }

    public void onContentChanged()
    {
        onSupportContentChanged();
    }

    protected void onCreate(Bundle bundle)
    {
        getDelegate().installViewFactory();
        super.onCreate(bundle);
        getDelegate().onCreate(bundle);
    }

    public void onCreateSupportNavigateUpTaskStack(cp cp1)
    {
        cp1.a(this);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        getDelegate().onDestroy();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        if (super.onMenuItemSelected(i, menuitem))
        {
            return true;
        }
        ActionBar actionbar = getSupportActionBar();
        if (menuitem.getItemId() == 0x102002c && actionbar != null && (actionbar.getDisplayOptions() & 4) != 0)
        {
            return onSupportNavigateUp();
        } else
        {
            return false;
        }
    }

    protected void onPostCreate(Bundle bundle)
    {
        super.onPostCreate(bundle);
        getDelegate().onPostCreate(bundle);
    }

    protected void onPostResume()
    {
        super.onPostResume();
        getDelegate().onPostResume();
    }

    public void onPrepareSupportNavigateUpTaskStack(cp cp1)
    {
    }

    protected void onStop()
    {
        super.onStop();
        getDelegate().onStop();
    }

    public void onSupportActionModeFinished(ActionMode actionmode)
    {
    }

    public void onSupportActionModeStarted(ActionMode actionmode)
    {
    }

    public void onSupportContentChanged()
    {
    }

    public boolean onSupportNavigateUp()
    {
        Object obj;
        obj = getSupportParentActivityIntent();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        if (!supportShouldUpRecreateTask(((Intent) (obj))))
        {
            break MISSING_BLOCK_LABEL_66;
        }
        obj = cp.a(this);
        onCreateSupportNavigateUpTaskStack(((cp) (obj)));
        onPrepareSupportNavigateUpTaskStack(((cp) (obj)));
        ((cp) (obj)).a();
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            finishAffinity();
            break MISSING_BLOCK_LABEL_76;
        }
        try
        {
            finish();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            finish();
        }
        break MISSING_BLOCK_LABEL_76;
        supportNavigateUpTo(((Intent) (obj)));
        break MISSING_BLOCK_LABEL_76;
        return false;
        return true;
    }

    protected void onTitleChanged(CharSequence charsequence, int i)
    {
        super.onTitleChanged(charsequence, i);
        getDelegate().setTitle(charsequence);
    }

    public ActionMode onWindowStartingSupportActionMode(android.support.v7.view.ActionMode.Callback callback)
    {
        return null;
    }

    public void setContentView(int i)
    {
        getDelegate().setContentView(i);
    }

    public void setContentView(View view)
    {
        getDelegate().setContentView(view);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        getDelegate().setContentView(view, layoutparams);
    }

    public void setSupportActionBar(Toolbar toolbar)
    {
        getDelegate().setSupportActionBar(toolbar);
    }

    public void setSupportProgress(int i)
    {
    }

    public void setSupportProgressBarIndeterminate(boolean flag)
    {
    }

    public void setSupportProgressBarIndeterminateVisibility(boolean flag)
    {
    }

    public void setSupportProgressBarVisibility(boolean flag)
    {
    }

    public ActionMode startSupportActionMode(android.support.v7.view.ActionMode.Callback callback)
    {
        return getDelegate().startSupportActionMode(callback);
    }

    public void supportInvalidateOptionsMenu()
    {
        getDelegate().invalidateOptionsMenu();
    }

    public void supportNavigateUpTo(Intent intent)
    {
        ap.b(this, intent);
    }

    public boolean supportRequestWindowFeature(int i)
    {
        return getDelegate().requestWindowFeature(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent)
    {
        return ap.a(this, intent);
    }
}
