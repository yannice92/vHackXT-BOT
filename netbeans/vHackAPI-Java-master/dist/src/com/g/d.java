// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.g;

import a.j;
import dalvik.system.DexClassLoader;

public final class d
    implements j
{

    private DexClassLoader a;

    public d(DexClassLoader dexclassloader)
    {
        a = dexclassloader;
    }

    public final Class a(String s)
    {
        try
        {
            s = a.loadClass(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }
}
