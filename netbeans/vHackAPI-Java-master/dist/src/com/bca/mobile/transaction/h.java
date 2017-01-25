// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.text.InputFilter;
import android.text.Spanned;

// Referenced classes of package com.bca.mobile.transaction:
//            g

final class h
    implements InputFilter
{

    final g a;

    h(g g)
    {
        a = g;
        super();
    }

    public final CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int k, int l)
    {
        do
        {
            if (i >= j)
            {
                return null;
            }
            if (!Character.isLetterOrDigit(charsequence.charAt(i)))
            {
                return "";
            }
            i++;
        } while (true);
    }
}
