// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

// Referenced classes of package android.support.v4.view.a:
//            aa

final class z extends AccessibilityNodeProvider
{

    final aa a;

    z(aa aa1)
    {
        a = aa1;
        super();
    }

    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i)
    {
        a.c();
        return null;
    }

    public final List findAccessibilityNodeInfosByText(String s, int i)
    {
        return a.b();
    }

    public final AccessibilityNodeInfo findFocus(int i)
    {
        a.d();
        return null;
    }

    public final boolean performAction(int i, int j, Bundle bundle)
    {
        return a.a();
    }
}
