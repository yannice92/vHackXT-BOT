// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a;

import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Method;

// Referenced classes of package a:
//            j, i

public final class f
{

    public static Object a(j j1, String s, String s1, Class aclass[], Object aobj[])
    {
        j1 = j1.a(s);
        return j1.getDeclaredMethod(s1, aclass).invoke(j1.newInstance(), aobj);
    }

    public static Object a(InputStream inputstream, String s, String s1, Class aclass[], Object aobj[])
    {
        inputstream = (new i(a/i.getClassLoader(), new File("\\"))).d(inputstream, s, true);
        return inputstream.getDeclaredMethod(s1, aclass).invoke(inputstream.newInstance(), aobj);
    }

    public static Object a(String s, String s1, String s2, Class aclass[], Object aobj[])
    {
        File file = new File(s);
        s = (new i(a/i.getClassLoader(), file)).d(s, s1, true);
        return s.getDeclaredMethod(s2, aclass).invoke(s.newInstance(), aobj);
    }
}
