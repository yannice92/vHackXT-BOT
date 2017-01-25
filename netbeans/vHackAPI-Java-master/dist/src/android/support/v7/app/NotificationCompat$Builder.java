// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.support.v4.app.bb;
import android.support.v4.app.bc;

public class SandwichExtender extends bb
{

    protected bc getExtender()
    {
        if (android.os.pat._fld1 >= 21)
        {
            return new Extender(null);
        }
        if (android.os.pat._fld1 >= 16)
        {
            return new nExtender(null);
        }
        if (android.os.pat._fld1 >= 14)
        {
            return new SandwichExtender(null);
        } else
        {
            return super.getExtender();
        }
    }

    public SandwichExtender(Context context)
    {
        super(context);
    }
}
