// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.text.method.NumberKeyListener;

// Referenced classes of package com.bca.mobile:
//            ShareActivity

final class at extends NumberKeyListener
{

    final ShareActivity a;

    at(ShareActivity shareactivity)
    {
        a = shareactivity;
        super();
    }

    protected final char[] getAcceptedChars()
    {
        return (new char[] {
            '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'
        });
    }

    public final int getInputType()
    {
        return 3;
    }
}
