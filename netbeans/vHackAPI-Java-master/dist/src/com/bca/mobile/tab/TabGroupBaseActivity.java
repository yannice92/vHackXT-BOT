// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.tab;

import android.app.Activity;
import android.app.ActivityGroup;
import android.app.LocalActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import com.bca.mobile.n;
import java.util.ArrayList;

public class TabGroupBaseActivity extends ActivityGroup
{

    public ArrayList b;

    public TabGroupBaseActivity()
    {
    }

    public final void a(String s, Intent intent)
    {
        intent = getLocalActivityManager().startActivity(s, intent.addFlags(0x4000000));
        if (intent != null)
        {
            b.add(s);
            setContentView(intent.getDecorView());
        }
    }

    public void finishFromChild(Activity activity)
    {
        activity = getLocalActivityManager();
        int i = b.size() - 1;
        if (i <= 0)
        {
            finish();
            return;
        } else
        {
            activity.destroyActivity((String)b.get(i), true);
            b.remove(i);
            String s = (String)b.get(i - 1);
            setContentView(activity.startActivity(s, activity.getActivity(s).getIntent()).getDecorView());
            return;
        }
    }

    public void onBackPressed()
    {
        int i = b.size();
        if (i > 0)
        {
            getLocalActivityManager().getActivity((String)b.get(i - 1)).finish();
            if (i == 1)
            {
                n.am = null;
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (b == null)
        {
            b = new ArrayList();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            onBackPressed();
            return true;
        } else
        {
            return super.onKeyUp(i, keyevent);
        }
    }
}
