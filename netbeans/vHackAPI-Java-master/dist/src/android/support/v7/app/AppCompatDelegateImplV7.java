// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.v4.app.ap;
import android.support.v4.view.ai;
import android.support.v4.view.bs;
import android.support.v4.view.ch;
import android.support.v4.view.z;
import android.support.v7.internal.app.AppCompatViewInflater;
import android.support.v7.internal.app.ToolbarActionBar;
import android.support.v7.internal.app.WindowDecorActionBar;
import android.support.v7.internal.view.ContextThemeWrapper;
import android.support.v7.internal.view.StandaloneActionMode;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ContentFrameLayout;
import android.support.v7.internal.widget.DecorContentParent;
import android.support.v7.internal.widget.FitWindowsViewGroup;
import android.support.v7.internal.widget.ViewStubCompat;
import android.support.v7.internal.widget.ViewUtils;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplBase, ActionBar, AppCompatCallback

class AppCompatDelegateImplV7 extends AppCompatDelegateImplBase
    implements ai, android.support.v7.internal.view.menu.MenuBuilder.Callback
{

    private ActionMenuPresenterCallback mActionMenuPresenterCallback;
    ActionMode mActionMode;
    PopupWindow mActionModePopup;
    ActionBarContextView mActionModeView;
    private AppCompatViewInflater mAppCompatViewInflater;
    private boolean mClosingActionMenu;
    private DecorContentParent mDecorContentParent;
    private boolean mEnableDefaultActionBarUp;
    private boolean mFeatureIndeterminateProgress;
    private boolean mFeatureProgress;
    private int mInvalidatePanelMenuFeatures;
    private boolean mInvalidatePanelMenuPosted;
    private final Runnable mInvalidatePanelMenuRunnable = new _cls1();
    private PanelMenuPresenterCallback mPanelMenuPresenterCallback;
    private PanelFeatureState mPanels[];
    private PanelFeatureState mPreparedPanel;
    Runnable mShowActionModePopup;
    private View mStatusGuard;
    private ViewGroup mSubDecor;
    private boolean mSubDecorInstalled;
    private Rect mTempRect1;
    private Rect mTempRect2;
    private TextView mTitleView;
    private ViewGroup mWindowDecor;

    AppCompatDelegateImplV7(Context context, Window window, AppCompatCallback appcompatcallback)
    {
        super(context, window, appcompatcallback);
    }

    private void applyFixedSizeWindow(ContentFrameLayout contentframelayout)
    {
        contentframelayout.setDecorPadding(mWindowDecor.getPaddingLeft(), mWindowDecor.getPaddingTop(), mWindowDecor.getPaddingRight(), mWindowDecor.getPaddingBottom());
        TypedArray typedarray = mContext.obtainStyledAttributes(android.support.v7.appcompat.R.styleable.Theme);
        typedarray.getValue(android.support.v7.appcompat.R.styleable.Theme_windowMinWidthMajor, contentframelayout.getMinWidthMajor());
        typedarray.getValue(android.support.v7.appcompat.R.styleable.Theme_windowMinWidthMinor, contentframelayout.getMinWidthMinor());
        if (typedarray.hasValue(android.support.v7.appcompat.R.styleable.Theme_windowFixedWidthMajor))
        {
            typedarray.getValue(android.support.v7.appcompat.R.styleable.Theme_windowFixedWidthMajor, contentframelayout.getFixedWidthMajor());
        }
        if (typedarray.hasValue(android.support.v7.appcompat.R.styleable.Theme_windowFixedWidthMinor))
        {
            typedarray.getValue(android.support.v7.appcompat.R.styleable.Theme_windowFixedWidthMinor, contentframelayout.getFixedWidthMinor());
        }
        if (typedarray.hasValue(android.support.v7.appcompat.R.styleable.Theme_windowFixedHeightMajor))
        {
            typedarray.getValue(android.support.v7.appcompat.R.styleable.Theme_windowFixedHeightMajor, contentframelayout.getFixedHeightMajor());
        }
        if (typedarray.hasValue(android.support.v7.appcompat.R.styleable.Theme_windowFixedHeightMinor))
        {
            typedarray.getValue(android.support.v7.appcompat.R.styleable.Theme_windowFixedHeightMinor, contentframelayout.getFixedHeightMinor());
        }
        typedarray.recycle();
        contentframelayout.requestLayout();
    }

    private void callOnPanelClosed(int i, PanelFeatureState panelfeaturestate, Menu menu)
    {
        PanelFeatureState panelfeaturestate2 = panelfeaturestate;
        Object obj = menu;
        if (menu == null)
        {
            PanelFeatureState panelfeaturestate1 = panelfeaturestate;
            if (panelfeaturestate == null)
            {
                panelfeaturestate1 = panelfeaturestate;
                if (i >= 0)
                {
                    panelfeaturestate1 = panelfeaturestate;
                    if (i < mPanels.length)
                    {
                        panelfeaturestate1 = mPanels[i];
                    }
                }
            }
            panelfeaturestate2 = panelfeaturestate1;
            obj = menu;
            if (panelfeaturestate1 != null)
            {
                obj = panelfeaturestate1.menu;
                panelfeaturestate2 = panelfeaturestate1;
            }
        }
        if (panelfeaturestate2 == null || panelfeaturestate2.isOpen)
        {
            if ((panelfeaturestate = getWindowCallback()) != null)
            {
                panelfeaturestate.onPanelClosed(i, ((Menu) (obj)));
                return;
            }
        }
    }

    private void checkCloseActionMenu(MenuBuilder menubuilder)
    {
        if (mClosingActionMenu)
        {
            return;
        }
        mClosingActionMenu = true;
        mDecorContentParent.dismissPopups();
        android.view.Window.Callback callback = getWindowCallback();
        if (callback != null && !isDestroyed())
        {
            callback.onPanelClosed(8, menubuilder);
        }
        mClosingActionMenu = false;
    }

    private void closePanel(int i)
    {
        closePanel(getPanelState(i, true), true);
    }

    private void closePanel(PanelFeatureState panelfeaturestate, boolean flag)
    {
        if (flag && panelfeaturestate.featureId == 0 && mDecorContentParent != null && mDecorContentParent.isOverflowMenuShowing())
        {
            checkCloseActionMenu(panelfeaturestate.menu);
        } else
        {
            boolean flag1 = panelfeaturestate.isOpen;
            WindowManager windowmanager = (WindowManager)mContext.getSystemService("window");
            if (windowmanager != null && flag1 && panelfeaturestate.decorView != null)
            {
                windowmanager.removeView(panelfeaturestate.decorView);
            }
            panelfeaturestate.isPrepared = false;
            panelfeaturestate.isHandled = false;
            panelfeaturestate.isOpen = false;
            if (flag1 && flag)
            {
                callOnPanelClosed(panelfeaturestate.featureId, panelfeaturestate, null);
            }
            panelfeaturestate.shownPanelView = null;
            panelfeaturestate.refreshDecorView = true;
            if (mPreparedPanel == panelfeaturestate)
            {
                mPreparedPanel = null;
                return;
            }
        }
    }

    private void doInvalidatePanelMenu(int i)
    {
        PanelFeatureState panelfeaturestate = getPanelState(i, true);
        if (panelfeaturestate.menu != null)
        {
            Bundle bundle = new Bundle();
            panelfeaturestate.menu.saveActionViewStates(bundle);
            if (bundle.size() > 0)
            {
                panelfeaturestate.frozenActionViewState = bundle;
            }
            panelfeaturestate.menu.stopDispatchingItemsChanged();
            panelfeaturestate.menu.clear();
        }
        panelfeaturestate.refreshMenuContent = true;
        panelfeaturestate.refreshDecorView = true;
        if ((i == 8 || i == 0) && mDecorContentParent != null)
        {
            PanelFeatureState panelfeaturestate1 = getPanelState(0, false);
            if (panelfeaturestate1 != null)
            {
                panelfeaturestate1.isPrepared = false;
                preparePanel(panelfeaturestate1, null);
            }
        }
    }

    private void ensureSubDecor()
    {
        Object obj;
        if (mSubDecorInstalled)
        {
            break MISSING_BLOCK_LABEL_515;
        }
        obj = LayoutInflater.from(mContext);
        if (mWindowNoTitle) goto _L2; else goto _L1
_L1:
        if (!mIsFloating) goto _L4; else goto _L3
_L3:
        mSubDecor = (ViewGroup)((LayoutInflater) (obj)).inflate(android.support.v7.appcompat.R.layout.abc_dialog_title_material, null);
        mOverlayActionBar = false;
        mHasActionBar = false;
_L6:
        if (mSubDecor == null)
        {
            throw new IllegalArgumentException("AppCompat does not support the current theme features");
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (mHasActionBar)
        {
            obj = new TypedValue();
            mContext.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.actionBarTheme, ((TypedValue) (obj)), true);
            if (((TypedValue) (obj)).resourceId != 0)
            {
                obj = new ContextThemeWrapper(mContext, ((TypedValue) (obj)).resourceId);
            } else
            {
                obj = mContext;
            }
            mSubDecor = (ViewGroup)LayoutInflater.from(((Context) (obj))).inflate(android.support.v7.appcompat.R.layout.abc_screen_toolbar, null);
            mDecorContentParent = (DecorContentParent)mSubDecor.findViewById(android.support.v7.appcompat.R.id.decor_content_parent);
            mDecorContentParent.setWindowCallback(getWindowCallback());
            if (mOverlayActionBar)
            {
                mDecorContentParent.initFeature(9);
            }
            if (mFeatureProgress)
            {
                mDecorContentParent.initFeature(2);
            }
            if (mFeatureIndeterminateProgress)
            {
                mDecorContentParent.initFeature(5);
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (mOverlayActionMode)
        {
            mSubDecor = (ViewGroup)((LayoutInflater) (obj)).inflate(android.support.v7.appcompat.R.layout.abc_screen_simple_overlay_action_mode, null);
        } else
        {
            mSubDecor = (ViewGroup)((LayoutInflater) (obj)).inflate(android.support.v7.appcompat.R.layout.abc_screen_simple, null);
        }
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            bs.a(mSubDecor, new _cls2());
        } else
        {
            ((FitWindowsViewGroup)mSubDecor).setOnFitSystemWindowsListener(new _cls3());
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (mDecorContentParent == null)
        {
            mTitleView = (TextView)mSubDecor.findViewById(android.support.v7.appcompat.R.id.title);
        }
        ViewUtils.makeOptionalFitsSystemWindows(mSubDecor);
        Object obj2 = (ViewGroup)mWindow.findViewById(0x1020002);
        Object obj1 = (ContentFrameLayout)mSubDecor.findViewById(android.support.v7.appcompat.R.id.action_bar_activity_content);
        View view;
        for (; ((ViewGroup) (obj2)).getChildCount() > 0; ((ContentFrameLayout) (obj1)).addView(view))
        {
            view = ((ViewGroup) (obj2)).getChildAt(0);
            ((ViewGroup) (obj2)).removeViewAt(0);
        }

        mWindow.setContentView(mSubDecor);
        ((ViewGroup) (obj2)).setId(-1);
        ((ContentFrameLayout) (obj1)).setId(0x1020002);
        if (obj2 instanceof FrameLayout)
        {
            ((FrameLayout)obj2).setForeground(null);
        }
        obj2 = getTitle();
        if (!TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            onTitleChanged(((CharSequence) (obj2)));
        }
        applyFixedSizeWindow(((ContentFrameLayout) (obj1)));
        onSubDecorInstalled(mSubDecor);
        mSubDecorInstalled = true;
        obj1 = getPanelState(0, false);
        if (!isDestroyed() && (obj1 == null || ((PanelFeatureState) (obj1)).menu == null))
        {
            invalidatePanelMenu(8);
        }
    }

    private PanelFeatureState findMenuPanel(Menu menu)
    {
        PanelFeatureState apanelfeaturestate[] = mPanels;
        int i;
        int j;
        if (apanelfeaturestate != null)
        {
            i = apanelfeaturestate.length;
        } else
        {
            i = 0;
        }
        for (j = 0; j < i; j++)
        {
            PanelFeatureState panelfeaturestate = apanelfeaturestate[j];
            if (panelfeaturestate != null && panelfeaturestate.menu == menu)
            {
                return panelfeaturestate;
            }
        }

        return null;
    }

    private PanelFeatureState getPanelState(int i, boolean flag)
    {
        PanelFeatureState apanelfeaturestate[];
label0:
        {
            PanelFeatureState apanelfeaturestate1[] = mPanels;
            if (apanelfeaturestate1 != null)
            {
                apanelfeaturestate = apanelfeaturestate1;
                if (apanelfeaturestate1.length > i)
                {
                    break label0;
                }
            }
            apanelfeaturestate = new PanelFeatureState[i + 1];
            if (apanelfeaturestate1 != null)
            {
                System.arraycopy(apanelfeaturestate1, 0, apanelfeaturestate, 0, apanelfeaturestate1.length);
            }
            mPanels = apanelfeaturestate;
        }
        PanelFeatureState panelfeaturestate = apanelfeaturestate[i];
        if (panelfeaturestate == null)
        {
            panelfeaturestate = new PanelFeatureState(i);
            apanelfeaturestate[i] = panelfeaturestate;
            return panelfeaturestate;
        } else
        {
            return panelfeaturestate;
        }
    }

    private boolean initializePanelContent(PanelFeatureState panelfeaturestate)
    {
        if (panelfeaturestate.createdPanelView != null)
        {
            panelfeaturestate.shownPanelView = panelfeaturestate.createdPanelView;
            return true;
        }
        if (panelfeaturestate.menu == null)
        {
            return false;
        }
        if (mPanelMenuPresenterCallback == null)
        {
            mPanelMenuPresenterCallback = new PanelMenuPresenterCallback(null);
        }
        panelfeaturestate.shownPanelView = (View)panelfeaturestate.getListMenuView(mPanelMenuPresenterCallback);
        return panelfeaturestate.shownPanelView != null;
    }

    private boolean initializePanelDecor(PanelFeatureState panelfeaturestate)
    {
        panelfeaturestate.setStyle(getActionBarThemedContext());
        panelfeaturestate.decorView = new ListMenuDecorView(panelfeaturestate.listPresenterContext);
        panelfeaturestate.gravity = 81;
        return true;
    }

    private boolean initializePanelMenu(PanelFeatureState panelfeaturestate)
    {
        Context context = mContext;
        if (panelfeaturestate.featureId != 0 && panelfeaturestate.featureId != 8 || mDecorContentParent == null) goto _L2; else goto _L1
_L1:
        Object obj;
        TypedValue typedvalue = new TypedValue();
        android.content.res.Resources.Theme theme1 = context.getTheme();
        theme1.resolveAttribute(android.support.v7.appcompat.R.attr.actionBarTheme, typedvalue, true);
        obj = null;
        android.content.res.Resources.Theme theme;
        if (typedvalue.resourceId != 0)
        {
            obj = context.getResources().newTheme();
            ((android.content.res.Resources.Theme) (obj)).setTo(theme1);
            ((android.content.res.Resources.Theme) (obj)).applyStyle(typedvalue.resourceId, true);
            ((android.content.res.Resources.Theme) (obj)).resolveAttribute(android.support.v7.appcompat.R.attr.actionBarWidgetTheme, typedvalue, true);
        } else
        {
            theme1.resolveAttribute(android.support.v7.appcompat.R.attr.actionBarWidgetTheme, typedvalue, true);
        }
        theme = ((android.content.res.Resources.Theme) (obj));
        if (typedvalue.resourceId != 0)
        {
            theme = ((android.content.res.Resources.Theme) (obj));
            if (obj == null)
            {
                theme = context.getResources().newTheme();
                theme.setTo(theme1);
            }
            theme.applyStyle(typedvalue.resourceId, true);
        }
        if (theme == null) goto _L2; else goto _L3
_L3:
        obj = new ContextThemeWrapper(context, 0);
        ((Context) (obj)).getTheme().setTo(theme);
_L5:
        obj = new MenuBuilder(((Context) (obj)));
        ((MenuBuilder) (obj)).setCallback(this);
        panelfeaturestate.setMenu(((MenuBuilder) (obj)));
        return true;
_L2:
        obj = context;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void invalidatePanelMenu(int i)
    {
        mInvalidatePanelMenuFeatures = mInvalidatePanelMenuFeatures | 1 << i;
        if (!mInvalidatePanelMenuPosted && mWindowDecor != null)
        {
            bs.a(mWindowDecor, mInvalidatePanelMenuRunnable);
            mInvalidatePanelMenuPosted = true;
        }
    }

    private boolean onKeyDownPanel(int i, KeyEvent keyevent)
    {
        if (keyevent.getRepeatCount() == 0)
        {
            PanelFeatureState panelfeaturestate = getPanelState(i, true);
            if (!panelfeaturestate.isOpen)
            {
                return preparePanel(panelfeaturestate, keyevent);
            }
        }
        return false;
    }

    private boolean onKeyUpPanel(int i, KeyEvent keyevent)
    {
        PanelFeatureState panelfeaturestate;
        boolean flag1;
        flag1 = true;
        if (mActionMode != null)
        {
            return false;
        }
        panelfeaturestate = getPanelState(i, true);
        if (i != 0 || mDecorContentParent == null || !mDecorContentParent.canShowOverflowMenu() || ch.b(ViewConfiguration.get(mContext))) goto _L2; else goto _L1
_L1:
        if (mDecorContentParent.isOverflowMenuShowing()) goto _L4; else goto _L3
_L3:
        if (isDestroyed() || !preparePanel(panelfeaturestate, keyevent)) goto _L6; else goto _L5
_L5:
        boolean flag = mDecorContentParent.showOverflowMenu();
_L8:
        if (flag)
        {
            keyevent = (AudioManager)mContext.getSystemService("audio");
            if (keyevent != null)
            {
                keyevent.playSoundEffect(0);
            } else
            {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return flag;
_L4:
        flag = mDecorContentParent.hideOverflowMenu();
        continue; /* Loop/switch isn't completed */
_L2:
        if (panelfeaturestate.isOpen || panelfeaturestate.isHandled)
        {
            flag = panelfeaturestate.isOpen;
            closePanel(panelfeaturestate, true);
            continue; /* Loop/switch isn't completed */
        }
        if (panelfeaturestate.isPrepared)
        {
            if (panelfeaturestate.refreshMenuContent)
            {
                panelfeaturestate.isPrepared = false;
                flag = preparePanel(panelfeaturestate, keyevent);
            } else
            {
                flag = true;
            }
            if (flag)
            {
                openPanel(panelfeaturestate, keyevent);
                flag = flag1;
                continue; /* Loop/switch isn't completed */
            }
        }
_L6:
        flag = false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void openPanel(PanelFeatureState panelfeaturestate, KeyEvent keyevent)
    {
        byte byte0 = -1;
        if (!panelfeaturestate.isOpen && !isDestroyed()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (panelfeaturestate.featureId != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = mContext;
        boolean flag;
        boolean flag1;
        if ((((Context) (obj)).getResources().getConfiguration().screenLayout & 0xf) == 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((Context) (obj)).getApplicationInfo().targetSdkVersion >= 11)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag && flag1) goto _L1; else goto _L3
_L3:
        WindowManager windowmanager;
        obj = getWindowCallback();
        if (obj != null && !((android.view.Window.Callback) (obj)).onMenuOpened(panelfeaturestate.featureId, panelfeaturestate.menu))
        {
            closePanel(panelfeaturestate, true);
            return;
        }
        windowmanager = (WindowManager)mContext.getSystemService("window");
        if (windowmanager == null || !preparePanel(panelfeaturestate, keyevent)) goto _L1; else goto _L4
_L4:
        if (panelfeaturestate.decorView != null && !panelfeaturestate.refreshDecorView) goto _L6; else goto _L5
_L5:
        if (panelfeaturestate.decorView != null) goto _L8; else goto _L7
_L7:
        if (!initializePanelDecor(panelfeaturestate) || panelfeaturestate.decorView == null) goto _L1; else goto _L9
_L9:
        if (!initializePanelContent(panelfeaturestate) || !panelfeaturestate.hasPanelItems()) goto _L1; else goto _L10
_L10:
        int i;
        keyevent = panelfeaturestate.shownPanelView.getLayoutParams();
        if (keyevent == null)
        {
            keyevent = new android.view.ViewGroup.LayoutParams(-2, -2);
        }
        i = panelfeaturestate.background;
        panelfeaturestate.decorView.setBackgroundResource(i);
        android.view.ViewParent viewparent = panelfeaturestate.shownPanelView.getParent();
        if (viewparent != null && (viewparent instanceof ViewGroup))
        {
            ((ViewGroup)viewparent).removeView(panelfeaturestate.shownPanelView);
        }
        panelfeaturestate.decorView.addView(panelfeaturestate.shownPanelView, keyevent);
        if (!panelfeaturestate.shownPanelView.hasFocus())
        {
            panelfeaturestate.shownPanelView.requestFocus();
        }
        i = -2;
_L14:
        panelfeaturestate.isHandled = false;
        keyevent = new android.view.WindowManager.LayoutParams(i, -2, panelfeaturestate.x, panelfeaturestate.y, 1002, 0x820000, -3);
        keyevent.gravity = panelfeaturestate.gravity;
        keyevent.windowAnimations = panelfeaturestate.windowAnimations;
        windowmanager.addView(panelfeaturestate.decorView, keyevent);
        panelfeaturestate.isOpen = true;
        return;
_L8:
        if (panelfeaturestate.refreshDecorView && panelfeaturestate.decorView.getChildCount() > 0)
        {
            panelfeaturestate.decorView.removeAllViews();
        }
          goto _L9
_L6:
        if (panelfeaturestate.createdPanelView == null) goto _L12; else goto _L11
_L11:
        keyevent = panelfeaturestate.createdPanelView.getLayoutParams();
        if (keyevent == null) goto _L12; else goto _L13
_L13:
        i = byte0;
        if (((android.view.ViewGroup.LayoutParams) (keyevent)).width == -1) goto _L14; else goto _L12
_L12:
        i = -2;
          goto _L14
    }

    private boolean performPanelShortcut(PanelFeatureState panelfeaturestate, int i, KeyEvent keyevent, int j)
    {
        boolean flag;
        boolean flag2;
        flag2 = false;
        flag = false;
        if (!keyevent.isSystem()) goto _L2; else goto _L1
_L1:
        flag2 = flag;
_L4:
        return flag2;
_L2:
        boolean flag1;
label0:
        {
            if (!panelfeaturestate.isPrepared)
            {
                flag1 = flag2;
                if (!preparePanel(panelfeaturestate, keyevent))
                {
                    break label0;
                }
            }
            flag1 = flag2;
            if (panelfeaturestate.menu != null)
            {
                flag1 = panelfeaturestate.menu.performShortcut(i, keyevent, j);
            }
        }
        flag2 = flag1;
        if (flag1)
        {
            flag2 = flag1;
            if ((j & 1) == 0)
            {
                flag2 = flag1;
                if (mDecorContentParent == null)
                {
                    closePanel(panelfeaturestate, true);
                    return flag1;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean preparePanel(PanelFeatureState panelfeaturestate, KeyEvent keyevent)
    {
        if (!isDestroyed()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        android.view.Window.Callback callback;
        int i;
        if (panelfeaturestate.isPrepared)
        {
            return true;
        }
        if (mPreparedPanel != null && mPreparedPanel != panelfeaturestate)
        {
            closePanel(mPreparedPanel, false);
        }
        callback = getWindowCallback();
        if (callback != null)
        {
            panelfeaturestate.createdPanelView = callback.onCreatePanelView(panelfeaturestate.featureId);
        }
        if (panelfeaturestate.featureId == 0 || panelfeaturestate.featureId == 8)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i && mDecorContentParent != null)
        {
            mDecorContentParent.setMenuPrepared();
        }
        if (panelfeaturestate.createdPanelView != null || i && (peekSupportActionBar() instanceof ToolbarActionBar))
        {
            break MISSING_BLOCK_LABEL_412;
        }
        if (panelfeaturestate.menu != null && !panelfeaturestate.refreshMenuContent)
        {
            break MISSING_BLOCK_LABEL_280;
        }
        if (panelfeaturestate.menu == null && (!initializePanelMenu(panelfeaturestate) || panelfeaturestate.menu == null))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i && mDecorContentParent != null)
        {
            if (mActionMenuPresenterCallback == null)
            {
                mActionMenuPresenterCallback = new ActionMenuPresenterCallback(null);
            }
            mDecorContentParent.setMenu(panelfeaturestate.menu, mActionMenuPresenterCallback);
        }
        panelfeaturestate.menu.stopDispatchingItemsChanged();
        if (callback.onCreatePanelMenu(panelfeaturestate.featureId, panelfeaturestate.menu))
        {
            break; /* Loop/switch isn't completed */
        }
        panelfeaturestate.setMenu(null);
        if (i && mDecorContentParent != null)
        {
            mDecorContentParent.setMenu(null, mActionMenuPresenterCallback);
            return false;
        }
        if (true) goto _L1; else goto _L3
_L3:
        panelfeaturestate.refreshMenuContent = false;
        panelfeaturestate.menu.stopDispatchingItemsChanged();
        if (panelfeaturestate.frozenActionViewState != null)
        {
            panelfeaturestate.menu.restoreActionViewStates(panelfeaturestate.frozenActionViewState);
            panelfeaturestate.frozenActionViewState = null;
        }
        if (!callback.onPreparePanel(0, panelfeaturestate.createdPanelView, panelfeaturestate.menu))
        {
            if (i && mDecorContentParent != null)
            {
                mDecorContentParent.setMenu(null, mActionMenuPresenterCallback);
            }
            panelfeaturestate.menu.startDispatchingItemsChanged();
            return false;
        }
        boolean flag;
        if (keyevent != null)
        {
            i = keyevent.getDeviceId();
        } else
        {
            i = -1;
        }
        if (KeyCharacterMap.load(i).getKeyboardType() != 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        panelfeaturestate.qwertyMode = flag;
        panelfeaturestate.menu.setQwertyMode(panelfeaturestate.qwertyMode);
        panelfeaturestate.menu.startDispatchingItemsChanged();
        panelfeaturestate.isPrepared = true;
        panelfeaturestate.isHandled = false;
        mPreparedPanel = panelfeaturestate;
        return true;
    }

    private void reopenMenu(MenuBuilder menubuilder, boolean flag)
    {
        if (mDecorContentParent == null || !mDecorContentParent.canShowOverflowMenu() || ch.b(ViewConfiguration.get(mContext)) && !mDecorContentParent.isOverflowMenuShowPending())
        {
            break MISSING_BLOCK_LABEL_211;
        }
        menubuilder = getWindowCallback();
        if (mDecorContentParent.isOverflowMenuShowing() && flag) goto _L2; else goto _L1
_L1:
        if (menubuilder != null && !isDestroyed())
        {
            if (mInvalidatePanelMenuPosted && (mInvalidatePanelMenuFeatures & 1) != 0)
            {
                mWindowDecor.removeCallbacks(mInvalidatePanelMenuRunnable);
                mInvalidatePanelMenuRunnable.run();
            }
            PanelFeatureState panelfeaturestate = getPanelState(0, true);
            if (panelfeaturestate.menu != null && !panelfeaturestate.refreshMenuContent && menubuilder.onPreparePanel(0, panelfeaturestate.createdPanelView, panelfeaturestate.menu))
            {
                menubuilder.onMenuOpened(8, panelfeaturestate.menu);
                mDecorContentParent.showOverflowMenu();
            }
        }
_L4:
        return;
_L2:
        mDecorContentParent.hideOverflowMenu();
        if (isDestroyed()) goto _L4; else goto _L3
_L3:
        menubuilder.onPanelClosed(8, getPanelState(0, true).menu);
        return;
        menubuilder = getPanelState(0, true);
        menubuilder.refreshDecorView = true;
        closePanel(menubuilder, false);
        openPanel(menubuilder, null);
        return;
    }

    private void throwFeatureRequestIfSubDecorInstalled()
    {
        if (mSubDecorInstalled)
        {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        } else
        {
            return;
        }
    }

    private int updateStatusGuard(int i)
    {
        int k = 1;
        boolean flag = true;
        boolean flag1 = false;
        int j;
        if (mActionModeView != null && (mActionModeView.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams))
        {
            Object obj = (android.view.ViewGroup.MarginLayoutParams)mActionModeView.getLayoutParams();
            if (mActionModeView.isShown())
            {
                if (mTempRect1 == null)
                {
                    mTempRect1 = new Rect();
                    mTempRect2 = new Rect();
                }
                Rect rect = mTempRect1;
                Rect rect1 = mTempRect2;
                rect.set(0, i, 0, 0);
                ViewUtils.computeFitSystemWindows(mSubDecor, rect, rect1);
                if (rect1.top == 0)
                {
                    j = i;
                } else
                {
                    j = 0;
                }
                if (((android.view.ViewGroup.MarginLayoutParams) (obj)).topMargin != j)
                {
                    obj.topMargin = i;
                    if (mStatusGuard == null)
                    {
                        mStatusGuard = new View(mContext);
                        mStatusGuard.setBackgroundColor(mContext.getResources().getColor(android.support.v7.appcompat.R.color.abc_input_method_navigation_guard));
                        mSubDecor.addView(mStatusGuard, -1, new android.view.ViewGroup.LayoutParams(-1, i));
                        j = 1;
                    } else
                    {
                        android.view.ViewGroup.LayoutParams layoutparams = mStatusGuard.getLayoutParams();
                        if (layoutparams.height != i)
                        {
                            layoutparams.height = i;
                            mStatusGuard.setLayoutParams(layoutparams);
                        }
                        j = 1;
                    }
                } else
                {
                    j = 0;
                }
                if (mStatusGuard == null)
                {
                    flag = false;
                }
                k = i;
                if (!mOverlayActionMode)
                {
                    k = i;
                    if (flag)
                    {
                        k = 0;
                    }
                }
                i = k;
                k = j;
                j = ((flag) ? 1 : 0);
            } else
            if (((android.view.ViewGroup.MarginLayoutParams) (obj)).topMargin != 0)
            {
                obj.topMargin = 0;
                j = 0;
            } else
            {
                k = 0;
                j = 0;
            }
            if (k != 0)
            {
                mActionModeView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            }
        } else
        {
            j = 0;
        }
        if (mStatusGuard != null)
        {
            obj = mStatusGuard;
            if (j != 0)
            {
                j = ((flag1) ? 1 : 0);
            } else
            {
                j = 8;
            }
            ((View) (obj)).setVisibility(j);
        }
        return i;
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        ensureSubDecor();
        ((ViewGroup)mSubDecor.findViewById(0x1020002)).addView(view, layoutparams);
        mOriginalWindowCallback.onContentChanged();
    }

    View callActivityOnCreateView(View view, String s, Context context, AttributeSet attributeset)
    {
        if (mOriginalWindowCallback instanceof android.view.LayoutInflater.Factory)
        {
            view = ((android.view.LayoutInflater.Factory)mOriginalWindowCallback).onCreateView(s, context, attributeset);
            if (view != null)
            {
                return view;
            }
        }
        return null;
    }

    public ActionBar createSupportActionBar()
    {
        WindowDecorActionBar windowdecoractionbar;
        ensureSubDecor();
        windowdecoractionbar = null;
        if (!(mOriginalWindowCallback instanceof Activity)) goto _L2; else goto _L1
_L1:
        windowdecoractionbar = new WindowDecorActionBar((Activity)mOriginalWindowCallback, mOverlayActionBar);
_L4:
        if (windowdecoractionbar != null)
        {
            windowdecoractionbar.setDefaultDisplayHomeAsUpEnabled(mEnableDefaultActionBarUp);
        }
        return windowdecoractionbar;
_L2:
        if (mOriginalWindowCallback instanceof Dialog)
        {
            windowdecoractionbar = new WindowDecorActionBar((Dialog)mOriginalWindowCallback);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public View createView(View view, String s, Context context, AttributeSet attributeset)
    {
        boolean flag;
        boolean flag1;
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (mAppCompatViewInflater == null)
        {
            mAppCompatViewInflater = new AppCompatViewInflater();
        }
        if (flag && mSubDecorInstalled && view != null && view.getId() != 0x1020002 && !bs.v(view))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        return mAppCompatViewInflater.createView(view, s, context, attributeset, flag1, flag, true);
    }

    boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        int i = keyevent.getKeyCode();
        boolean flag;
        if (keyevent.getAction() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return onKeyDown(i, keyevent);
        } else
        {
            return onKeyUp(i, keyevent);
        }
    }

    ViewGroup getSubDecor()
    {
        return mSubDecor;
    }

    public void installViewFactory()
    {
        LayoutInflater layoutinflater = LayoutInflater.from(mContext);
        if (layoutinflater.getFactory() == null)
        {
            z.a(layoutinflater, this);
            return;
        } else
        {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
            return;
        }
    }

    public void invalidateOptionsMenu()
    {
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null && actionbar.invalidateOptionsMenu())
        {
            return;
        } else
        {
            invalidatePanelMenu(0);
            return;
        }
    }

    boolean onBackPressed()
    {
        if (mActionMode != null)
        {
            mActionMode.finish();
        } else
        {
            ActionBar actionbar = getSupportActionBar();
            if (actionbar == null || !actionbar.collapseActionView())
            {
                return false;
            }
        }
        return true;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        if (mHasActionBar && mSubDecorInstalled)
        {
            ActionBar actionbar = getSupportActionBar();
            if (actionbar != null)
            {
                actionbar.onConfigurationChanged(configuration);
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
label0:
        {
            super.onCreate(bundle);
            mWindowDecor = (ViewGroup)mWindow.getDecorView();
            if ((mOriginalWindowCallback instanceof Activity) && ap.b((Activity)mOriginalWindowCallback) != null)
            {
                bundle = peekSupportActionBar();
                if (bundle != null)
                {
                    break label0;
                }
                mEnableDefaultActionBarUp = true;
            }
            return;
        }
        bundle.setDefaultDisplayHomeAsUpEnabled(true);
    }

    public final View onCreateView(View view, String s, Context context, AttributeSet attributeset)
    {
        View view1 = callActivityOnCreateView(view, s, context, attributeset);
        if (view1 != null)
        {
            return view1;
        } else
        {
            return createView(view, s, context, attributeset);
        }
    }

    boolean onKeyDown(int i, KeyEvent keyevent)
    {
        boolean flag = false;
        i;
        JVM INSTR tableswitch 82 82: default 20
    //                   82 37;
           goto _L1 _L2
_L1:
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            flag = onKeyShortcut(i, keyevent);
        }
        return flag;
_L2:
        if (onKeyDownPanel(0, keyevent))
        {
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    boolean onKeyShortcut(int i, KeyEvent keyevent)
    {
        ActionBar actionbar = getSupportActionBar();
        if (actionbar == null || !actionbar.onKeyShortcut(i, keyevent)) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (mPreparedPanel == null || !performPanelShortcut(mPreparedPanel, keyevent.getKeyCode(), keyevent, 1))
        {
            break; /* Loop/switch isn't completed */
        }
        if (mPreparedPanel != null)
        {
            mPreparedPanel.isHandled = true;
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        boolean flag;
        if (mPreparedPanel != null)
        {
            break; /* Loop/switch isn't completed */
        }
        PanelFeatureState panelfeaturestate = getPanelState(0, true);
        preparePanel(panelfeaturestate, keyevent);
        flag = performPanelShortcut(panelfeaturestate, keyevent.getKeyCode(), keyevent, 1);
        panelfeaturestate.isPrepared = false;
        if (flag) goto _L1; else goto _L4
_L4:
        return false;
    }

    boolean onKeyUp(int i, KeyEvent keyevent)
    {
        i;
        JVM INSTR lookupswitch 2: default 28
    //                   4: 41
    //                   82: 30;
           goto _L1 _L2 _L3
_L1:
        return false;
_L3:
        if (onKeyUpPanel(0, keyevent))
        {
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        keyevent = getPanelState(0, false);
        if (keyevent != null && ((PanelFeatureState) (keyevent)).isOpen)
        {
            closePanel(keyevent, true);
            return true;
        }
        if (onBackPressed())
        {
            return true;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
    {
        android.view.Window.Callback callback = getWindowCallback();
        if (callback != null && !isDestroyed())
        {
            menubuilder = findMenuPanel(menubuilder.getRootMenu());
            if (menubuilder != null)
            {
                return callback.onMenuItemSelected(((PanelFeatureState) (menubuilder)).featureId, menuitem);
            }
        }
        return false;
    }

    public void onMenuModeChange(MenuBuilder menubuilder)
    {
        reopenMenu(menubuilder, true);
    }

    boolean onMenuOpened(int i, Menu menu)
    {
        if (i == 8)
        {
            menu = getSupportActionBar();
            if (menu != null)
            {
                menu.dispatchMenuVisibilityChanged(true);
            }
            return true;
        } else
        {
            return false;
        }
    }

    boolean onPanelClosed(int i, Menu menu)
    {
        if (i == 8)
        {
            menu = getSupportActionBar();
            if (menu != null)
            {
                menu.dispatchMenuVisibilityChanged(false);
            }
            return true;
        }
        if (i == 0)
        {
            menu = getPanelState(i, true);
            if (((PanelFeatureState) (menu)).isOpen)
            {
                closePanel(menu, false);
            }
        }
        return false;
    }

    public void onPostCreate(Bundle bundle)
    {
        ensureSubDecor();
    }

    public void onPostResume()
    {
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null)
        {
            actionbar.setShowHideAnimationEnabled(true);
        }
    }

    public void onStop()
    {
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null)
        {
            actionbar.setShowHideAnimationEnabled(false);
        }
    }

    void onSubDecorInstalled(ViewGroup viewgroup)
    {
    }

    void onTitleChanged(CharSequence charsequence)
    {
        if (mDecorContentParent != null)
        {
            mDecorContentParent.setWindowTitle(charsequence);
        } else
        {
            if (peekSupportActionBar() != null)
            {
                peekSupportActionBar().setWindowTitle(charsequence);
                return;
            }
            if (mTitleView != null)
            {
                mTitleView.setText(charsequence);
                return;
            }
        }
    }

    public boolean requestWindowFeature(int i)
    {
        switch (i)
        {
        case 3: // '\003'
        case 4: // '\004'
        case 6: // '\006'
        case 7: // '\007'
        default:
            return mWindow.requestFeature(i);

        case 8: // '\b'
            throwFeatureRequestIfSubDecorInstalled();
            mHasActionBar = true;
            return true;

        case 9: // '\t'
            throwFeatureRequestIfSubDecorInstalled();
            mOverlayActionBar = true;
            return true;

        case 10: // '\n'
            throwFeatureRequestIfSubDecorInstalled();
            mOverlayActionMode = true;
            return true;

        case 2: // '\002'
            throwFeatureRequestIfSubDecorInstalled();
            mFeatureProgress = true;
            return true;

        case 5: // '\005'
            throwFeatureRequestIfSubDecorInstalled();
            mFeatureIndeterminateProgress = true;
            return true;

        case 1: // '\001'
            throwFeatureRequestIfSubDecorInstalled();
            mWindowNoTitle = true;
            return true;
        }
    }

    public void setContentView(int i)
    {
        ensureSubDecor();
        ViewGroup viewgroup = (ViewGroup)mSubDecor.findViewById(0x1020002);
        viewgroup.removeAllViews();
        LayoutInflater.from(mContext).inflate(i, viewgroup);
        mOriginalWindowCallback.onContentChanged();
    }

    public void setContentView(View view)
    {
        ensureSubDecor();
        ViewGroup viewgroup = (ViewGroup)mSubDecor.findViewById(0x1020002);
        viewgroup.removeAllViews();
        viewgroup.addView(view);
        mOriginalWindowCallback.onContentChanged();
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        ensureSubDecor();
        ViewGroup viewgroup = (ViewGroup)mSubDecor.findViewById(0x1020002);
        viewgroup.removeAllViews();
        viewgroup.addView(view, layoutparams);
        mOriginalWindowCallback.onContentChanged();
    }

    public void setSupportActionBar(Toolbar toolbar)
    {
        if (!(mOriginalWindowCallback instanceof Activity))
        {
            return;
        }
        if (getSupportActionBar() instanceof WindowDecorActionBar)
        {
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        } else
        {
            toolbar = new ToolbarActionBar(toolbar, ((Activity)mContext).getTitle(), mAppCompatWindowCallback);
            setSupportActionBar(((ActionBar) (toolbar)));
            mWindow.setCallback(toolbar.getWrappedWindowCallback());
            toolbar.invalidateOptionsMenu();
            return;
        }
    }

    public ActionMode startSupportActionMode(android.support.v7.view.ActionMode.Callback callback)
    {
        if (callback == null)
        {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        if (mActionMode != null)
        {
            mActionMode.finish();
        }
        callback = new ActionModeCallbackWrapperV7(callback);
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null)
        {
            mActionMode = actionbar.startActionMode(callback);
            if (mActionMode != null && mAppCompatCallback != null)
            {
                mAppCompatCallback.onSupportActionModeStarted(mActionMode);
            }
        }
        if (mActionMode == null)
        {
            mActionMode = startSupportActionModeFromWindow(callback);
        }
        return mActionMode;
    }

    ActionMode startSupportActionModeFromWindow(android.support.v7.view.ActionMode.Callback callback)
    {
        ActionModeCallbackWrapperV7 actionmodecallbackwrapperv7;
        if (mActionMode != null)
        {
            mActionMode.finish();
        }
        actionmodecallbackwrapperv7 = new ActionModeCallbackWrapperV7(callback);
        if (mAppCompatCallback == null || isDestroyed())
        {
            break MISSING_BLOCK_LABEL_91;
        }
        Object obj = mAppCompatCallback.onWindowStartingSupportActionMode(actionmodecallbackwrapperv7);
_L1:
        if (obj != null)
        {
            mActionMode = ((ActionMode) (obj));
        } else
        {
            if (mActionModeView == null)
            {
                if (mIsFloating)
                {
                    Object obj2 = new TypedValue();
                    Object obj1 = mContext.getTheme();
                    ((android.content.res.Resources.Theme) (obj1)).resolveAttribute(android.support.v7.appcompat.R.attr.actionBarTheme, ((TypedValue) (obj2)), true);
                    int i;
                    if (((TypedValue) (obj2)).resourceId != 0)
                    {
                        android.content.res.Resources.Theme theme = mContext.getResources().newTheme();
                        theme.setTo(((android.content.res.Resources.Theme) (obj1)));
                        theme.applyStyle(((TypedValue) (obj2)).resourceId, true);
                        obj1 = new ContextThemeWrapper(mContext, 0);
                        ((Context) (obj1)).getTheme().setTo(theme);
                    } else
                    {
                        obj1 = mContext;
                    }
                    mActionModeView = new ActionBarContextView(((Context) (obj1)));
                    mActionModePopup = new PopupWindow(((Context) (obj1)), null, android.support.v7.appcompat.R.attr.actionModePopupWindowStyle);
                    mActionModePopup.setContentView(mActionModeView);
                    mActionModePopup.setWidth(-1);
                    ((Context) (obj1)).getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.actionBarSize, ((TypedValue) (obj2)), true);
                    i = TypedValue.complexToDimensionPixelSize(((TypedValue) (obj2)).data, ((Context) (obj1)).getResources().getDisplayMetrics());
                    mActionModeView.setContentHeight(i);
                    mActionModePopup.setHeight(-2);
                    mShowActionModePopup = new _cls4();
                } else
                {
                    ViewStubCompat viewstubcompat = (ViewStubCompat)mSubDecor.findViewById(android.support.v7.appcompat.R.id.action_mode_bar_stub);
                    if (viewstubcompat != null)
                    {
                        viewstubcompat.setLayoutInflater(LayoutInflater.from(getActionBarThemedContext()));
                        mActionModeView = (ActionBarContextView)viewstubcompat.inflate();
                    }
                }
            }
            if (mActionModeView != null)
            {
                mActionModeView.killMode();
                obj1 = mActionModeView.getContext();
                obj2 = mActionModeView;
                boolean flag;
                if (mActionModePopup == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj1 = new StandaloneActionMode(((Context) (obj1)), ((ActionBarContextView) (obj2)), actionmodecallbackwrapperv7, flag);
                if (callback.onCreateActionMode(((ActionMode) (obj1)), ((ActionMode) (obj1)).getMenu()))
                {
                    ((ActionMode) (obj1)).invalidate();
                    mActionModeView.initForMode(((ActionMode) (obj1)));
                    mActionModeView.setVisibility(0);
                    mActionMode = ((ActionMode) (obj1));
                    if (mActionModePopup != null)
                    {
                        mWindow.getDecorView().post(mShowActionModePopup);
                    }
                    mActionModeView.sendAccessibilityEvent(32);
                    if (mActionModeView.getParent() != null)
                    {
                        bs.p((View)mActionModeView.getParent());
                    }
                } else
                {
                    mActionMode = null;
                }
            }
        }
        if (mActionMode != null && mAppCompatCallback != null)
        {
            mAppCompatCallback.onSupportActionModeStarted(mActionMode);
        }
        return mActionMode;
        obj;
        obj = null;
          goto _L1
    }



/*
    static int access$002(AppCompatDelegateImplV7 appcompatdelegateimplv7, int i)
    {
        appcompatdelegateimplv7.mInvalidatePanelMenuFeatures = i;
        return i;
    }

*/




/*
    static boolean access$202(AppCompatDelegateImplV7 appcompatdelegateimplv7, boolean flag)
    {
        appcompatdelegateimplv7.mInvalidatePanelMenuPosted = flag;
        return flag;
    }

*/






    private class _cls1
        implements Runnable
    {

        final AppCompatDelegateImplV7 this$0;

        public void run()
        {
            if ((mInvalidatePanelMenuFeatures & 1) != 0)
            {
                doInvalidatePanelMenu(0);
            }
            if ((mInvalidatePanelMenuFeatures & 0x100) != 0)
            {
                doInvalidatePanelMenu(8);
            }
            mInvalidatePanelMenuPosted = false;
            mInvalidatePanelMenuFeatures = 0;
        }

        _cls1()
        {
            this$0 = AppCompatDelegateImplV7.this;
            super();
        }
    }


    private class PanelFeatureState
    {

        int background;
        View createdPanelView;
        ViewGroup decorView;
        int featureId;
        Bundle frozenActionViewState;
        Bundle frozenMenuState;
        int gravity;
        boolean isHandled;
        boolean isOpen;
        boolean isPrepared;
        ListMenuPresenter listMenuPresenter;
        Context listPresenterContext;
        MenuBuilder menu;
        public boolean qwertyMode;
        boolean refreshDecorView;
        boolean refreshMenuContent;
        View shownPanelView;
        boolean wasLastOpen;
        int windowAnimations;
        int x;
        int y;

        final void applyFrozenState()
        {
            if (menu != null && frozenMenuState != null)
            {
                menu.restorePresenterStates(frozenMenuState);
                frozenMenuState = null;
            }
        }

        public final void clearMenuPresenters()
        {
            if (menu != null)
            {
                menu.removeMenuPresenter(listMenuPresenter);
            }
            listMenuPresenter = null;
        }

        final MenuView getListMenuView(android.support.v7.internal.view.menu.MenuPresenter.Callback callback)
        {
            if (menu == null)
            {
                return null;
            }
            if (listMenuPresenter == null)
            {
                listMenuPresenter = new ListMenuPresenter(listPresenterContext, android.support.v7.appcompat.R.layout.abc_list_menu_item_layout);
                listMenuPresenter.setCallback(callback);
                menu.addMenuPresenter(listMenuPresenter);
            }
            return listMenuPresenter.getMenuView(decorView);
        }

        public final boolean hasPanelItems()
        {
            if (shownPanelView != null)
            {
                if (createdPanelView != null)
                {
                    return true;
                }
                if (listMenuPresenter.getAdapter().getCount() > 0)
                {
                    return true;
                }
            }
            return false;
        }

        final void onRestoreInstanceState(Parcelable parcelable)
        {
            class SavedState
                implements Parcelable
            {

                public static final android.os.Parcelable.Creator CREATOR = new _cls1();
                int featureId;
                boolean isOpen;
                Bundle menuState;

                private static SavedState readFromParcel(Parcel parcel)
                {
                    boolean flag = true;
                    SavedState savedstate = new SavedState();
                    savedstate.featureId = parcel.readInt();
                    if (parcel.readInt() != 1)
                    {
                        flag = false;
                    }
                    savedstate.isOpen = flag;
                    if (savedstate.isOpen)
                    {
                        savedstate.menuState = parcel.readBundle();
                    }
                    return savedstate;
                }

                public int describeContents()
                {
                    return 0;
                }

                public void writeToParcel(Parcel parcel, int i)
                {
                    parcel.writeInt(featureId);
                    if (isOpen)
                    {
                        i = 1;
                    } else
                    {
                        i = 0;
                    }
                    parcel.writeInt(i);
                    if (isOpen)
                    {
                        parcel.writeBundle(menuState);
                    }
                }



                private SavedState()
                {
                }

                SavedState(_cls1 _pcls1)
                {
                    this();
                }

                class _cls1
                    implements android.os.Parcelable.Creator
                {

                    public final SavedState createFromParcel(Parcel parcel)
                    {
                        return SavedState.readFromParcel(parcel);
                    }

                    public final volatile Object createFromParcel(Parcel parcel)
                    {
                        return createFromParcel(parcel);
                    }

                    public final SavedState[] newArray(int i)
                    {
                        return new SavedState[i];
                    }

                    public final volatile Object[] newArray(int i)
                    {
                        return newArray(i);
                    }

                            _cls1()
                            {
                            }
                }

            }

            parcelable = (SavedState)parcelable;
            featureId = ((SavedState) (parcelable)).featureId;
            wasLastOpen = ((SavedState) (parcelable)).isOpen;
            frozenMenuState = ((SavedState) (parcelable)).menuState;
            shownPanelView = null;
            decorView = null;
        }

        final Parcelable onSaveInstanceState()
        {
            SavedState savedstate = new SavedState(null);
            savedstate.featureId = featureId;
            savedstate.isOpen = isOpen;
            if (menu != null)
            {
                savedstate.menuState = new Bundle();
                menu.savePresenterStates(savedstate.menuState);
            }
            return savedstate;
        }

        final void setMenu(MenuBuilder menubuilder)
        {
            if (menubuilder != menu)
            {
                if (menu != null)
                {
                    menu.removeMenuPresenter(listMenuPresenter);
                }
                menu = menubuilder;
                if (menubuilder != null && listMenuPresenter != null)
                {
                    menubuilder.addMenuPresenter(listMenuPresenter);
                    return;
                }
            }
        }

        final void setStyle(Context context)
        {
            TypedValue typedvalue = new TypedValue();
            android.content.res.Resources.Theme theme = context.getResources().newTheme();
            theme.setTo(context.getTheme());
            theme.resolveAttribute(android.support.v7.appcompat.R.attr.actionBarPopupTheme, typedvalue, true);
            if (typedvalue.resourceId != 0)
            {
                theme.applyStyle(typedvalue.resourceId, true);
            }
            theme.resolveAttribute(android.support.v7.appcompat.R.attr.panelMenuListTheme, typedvalue, true);
            if (typedvalue.resourceId != 0)
            {
                theme.applyStyle(typedvalue.resourceId, true);
            } else
            {
                theme.applyStyle(android.support.v7.appcompat.R.style.Theme_AppCompat_CompactMenu, true);
            }
            context = new ContextThemeWrapper(context, 0);
            context.getTheme().setTo(theme);
            listPresenterContext = context;
            context = context.obtainStyledAttributes(android.support.v7.appcompat.R.styleable.Theme);
            background = context.getResourceId(android.support.v7.appcompat.R.styleable.Theme_panelBackground, 0);
            windowAnimations = context.getResourceId(android.support.v7.appcompat.R.styleable.Theme_android_windowAnimationStyle, 0);
            context.recycle();
        }

        PanelFeatureState(int i)
        {
            featureId = i;
            refreshDecorView = false;
        }
    }


    private class _cls2
        implements bd
    {

        final AppCompatDelegateImplV7 this$0;

        public eh onApplyWindowInsets(View view, eh eh1)
        {
            int i = eh1.b();
            int j = updateStatusGuard(i);
            eh eh2 = eh1;
            if (i != j)
            {
                eh2 = eh1.a(eh1.a(), j, eh1.c(), eh1.d());
            }
            return bs.a(view, eh2);
        }

        _cls2()
        {
            this$0 = AppCompatDelegateImplV7.this;
            super();
        }
    }


    private class _cls3
        implements android.support.v7.internal.widget.FitWindowsViewGroup.OnFitSystemWindowsListener
    {

        final AppCompatDelegateImplV7 this$0;

        public void onFitSystemWindows(Rect rect)
        {
            rect.top = updateStatusGuard(rect.top);
        }

        _cls3()
        {
            this$0 = AppCompatDelegateImplV7.this;
            super();
        }
    }


    private class PanelMenuPresenterCallback
        implements android.support.v7.internal.view.menu.MenuPresenter.Callback
    {

        final AppCompatDelegateImplV7 this$0;

        public final void onCloseMenu(MenuBuilder menubuilder, boolean flag)
        {
label0:
            {
                MenuBuilder menubuilder1 = menubuilder.getRootMenu();
                AppCompatDelegateImplV7 appcompatdelegateimplv7;
                boolean flag1;
                if (menubuilder1 != menubuilder)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                appcompatdelegateimplv7 = AppCompatDelegateImplV7.this;
                if (flag1)
                {
                    menubuilder = menubuilder1;
                }
                menubuilder = appcompatdelegateimplv7.findMenuPanel(menubuilder);
                if (menubuilder != null)
                {
                    if (!flag1)
                    {
                        break label0;
                    }
                    callOnPanelClosed(((PanelFeatureState) (menubuilder)).featureId, menubuilder, menubuilder1);
                    closePanel(menubuilder, true);
                }
                return;
            }
            closePanel(menubuilder, flag);
        }

        public final boolean onOpenSubMenu(MenuBuilder menubuilder)
        {
            if (menubuilder == null && mHasActionBar)
            {
                android.view.Window.Callback callback = getWindowCallback();
                if (callback != null && !isDestroyed())
                {
                    callback.onMenuOpened(8, menubuilder);
                }
            }
            return true;
        }

        private PanelMenuPresenterCallback()
        {
            this$0 = AppCompatDelegateImplV7.this;
            super();
        }

        PanelMenuPresenterCallback(_cls1 _pcls1)
        {
            this();
        }
    }


    private class ListMenuDecorView extends FrameLayout
    {

        final AppCompatDelegateImplV7 this$0;

        private boolean isOutOfBounds(int i, int j)
        {
            return i < -5 || j < -5 || i > getWidth() + 5 || j > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyevent)
        {
            return AppCompatDelegateImplV7.this.dispatchKeyEvent(keyevent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionevent)
        {
            if (motionevent.getAction() == 0 && isOutOfBounds((int)motionevent.getX(), (int)motionevent.getY()))
            {
                closePanel(0);
                return true;
            } else
            {
                return super.onInterceptTouchEvent(motionevent);
            }
        }

        public void setBackgroundResource(int i)
        {
            setBackgroundDrawable(TintManager.getDrawable(getContext(), i));
        }

        public ListMenuDecorView(Context context)
        {
            this$0 = AppCompatDelegateImplV7.this;
            super(context);
        }
    }


    private class ActionMenuPresenterCallback
        implements android.support.v7.internal.view.menu.MenuPresenter.Callback
    {

        final AppCompatDelegateImplV7 this$0;

        public final void onCloseMenu(MenuBuilder menubuilder, boolean flag)
        {
            checkCloseActionMenu(menubuilder);
        }

        public final boolean onOpenSubMenu(MenuBuilder menubuilder)
        {
            android.view.Window.Callback callback = getWindowCallback();
            if (callback != null)
            {
                callback.onMenuOpened(8, menubuilder);
            }
            return true;
        }

        private ActionMenuPresenterCallback()
        {
            this$0 = AppCompatDelegateImplV7.this;
            super();
        }

        ActionMenuPresenterCallback(_cls1 _pcls1)
        {
            this();
        }
    }


    private class ActionModeCallbackWrapperV7
        implements android.support.v7.view.ActionMode.Callback
    {

        private android.support.v7.view.ActionMode.Callback mWrapped;
        final AppCompatDelegateImplV7 this$0;

        public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
        {
            return mWrapped.onActionItemClicked(actionmode, menuitem);
        }

        public boolean onCreateActionMode(ActionMode actionmode, Menu menu)
        {
            return mWrapped.onCreateActionMode(actionmode, menu);
        }

        public void onDestroyActionMode(ActionMode actionmode)
        {
            mWrapped.onDestroyActionMode(actionmode);
            if (mActionModePopup == null) goto _L2; else goto _L1
_L1:
            mWindow.getDecorView().removeCallbacks(mShowActionModePopup);
            mActionModePopup.dismiss();
_L4:
            if (mActionModeView != null)
            {
                mActionModeView.removeAllViews();
            }
            if (mAppCompatCallback != null)
            {
                mAppCompatCallback.onSupportActionModeFinished(mActionMode);
            }
            mActionMode = null;
            return;
_L2:
            if (mActionModeView != null)
            {
                mActionModeView.setVisibility(8);
                if (mActionModeView.getParent() != null)
                {
                    bs.p((View)mActionModeView.getParent());
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
        {
            return mWrapped.onPrepareActionMode(actionmode, menu);
        }

        public ActionModeCallbackWrapperV7(android.support.v7.view.ActionMode.Callback callback)
        {
            this$0 = AppCompatDelegateImplV7.this;
            super();
            mWrapped = callback;
        }
    }


    private class _cls4
        implements Runnable
    {

        final AppCompatDelegateImplV7 this$0;

        public void run()
        {
            mActionModePopup.showAtLocation(mActionModeView, 55, 0, 0);
        }

        _cls4()
        {
            this$0 = AppCompatDelegateImplV7.this;
            super();
        }
    }

}
