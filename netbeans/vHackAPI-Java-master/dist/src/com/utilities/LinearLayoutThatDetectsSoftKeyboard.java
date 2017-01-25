// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.utilities;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

// Referenced classes of package com.utilities:
//            g

public class LinearLayoutThatDetectsSoftKeyboard extends LinearLayout
{

    private g a;

    public LinearLayoutThatDetectsSoftKeyboard(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void onMeasure(int i, int j)
    {
        android.view.View.MeasureSpec.getSize(j);
        Object obj = (Activity)getContext();
        Rect rect = new Rect();
        ((Activity) (obj)).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int k = rect.top;
        ((Activity) (obj)).getWindowManager().getDefaultDisplay().getHeight();
        if (a != null)
        {
            obj = a;
        }
        super.onMeasure(i, j);
    }
}
