// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.support.v4.content.i;
import android.support.v4.e.d;
import android.support.v4.e.n;
import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

// Referenced classes of package android.support.v4.app:
//            al, ao, am, FragmentActivity

final class an extends al
{

    static boolean a = false;
    final n b = new n();
    final n c = new n();
    final String d;
    FragmentActivity e;
    boolean f;
    boolean g;

    an(String s, FragmentActivity fragmentactivity, boolean flag)
    {
        d = s;
        e = fragmentactivity;
        f = flag;
    }

    final void a(FragmentActivity fragmentactivity)
    {
        e = fragmentactivity;
    }

    public final void a(String s, PrintWriter printwriter)
    {
        boolean flag = false;
        if (b.a() > 0)
        {
            printwriter.print(s);
            printwriter.println("Active Loaders:");
            String s1 = (new StringBuilder()).append(s).append("    ").toString();
            for (int j = 0; j < b.a(); j++)
            {
                ao ao1 = (ao)b.b(j);
                printwriter.print(s);
                printwriter.print("  #");
                printwriter.print(b.a(j));
                printwriter.print(": ");
                printwriter.println(ao1.toString());
                ao1.a(s1, printwriter);
            }

        }
        if (c.a() > 0)
        {
            printwriter.print(s);
            printwriter.println("Inactive Loaders:");
            String s2 = (new StringBuilder()).append(s).append("    ").toString();
            for (int k = ((flag) ? 1 : 0); k < c.a(); k++)
            {
                ao ao2 = (ao)c.b(k);
                printwriter.print(s);
                printwriter.print("  #");
                printwriter.print(c.a(k));
                printwriter.print(": ");
                printwriter.println(ao2.toString());
                ao2.a(s2, printwriter);
            }

        }
    }

    public final boolean a()
    {
        int k = b.a();
        int j = 0;
        boolean flag1 = false;
        while (j < k) 
        {
            ao ao1 = (ao)b.b(j);
            boolean flag;
            if (ao1.h && !ao1.f)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 |= flag;
            j++;
        }
        return flag1;
    }

    final void b()
    {
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder("Starting in ")).append(this).toString());
        }
        if (f)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder("Called doStart when already started: ")).append(this).toString(), runtimeexception);
        } else
        {
            f = true;
            int j = b.a() - 1;
            while (j >= 0) 
            {
                ao ao1 = (ao)b.b(j);
                if (ao1.i && ao1.j)
                {
                    ao1.h = true;
                } else
                if (!ao1.h)
                {
                    ao1.h = true;
                    if (a)
                    {
                        Log.v("LoaderManager", (new StringBuilder("  Starting: ")).append(ao1).toString());
                    }
                    if (ao1.d == null && ao1.c != null)
                    {
                        am am1 = ao1.c;
                        int k = ao1.a;
                        android.os.Bundle bundle = ao1.b;
                        ao1.d = am1.a();
                    }
                    if (ao1.d != null)
                    {
                        if (ao1.d.getClass().isMemberClass() && !Modifier.isStatic(ao1.d.getClass().getModifiers()))
                        {
                            throw new IllegalArgumentException((new StringBuilder("Object returned from onCreateLoader must not be a non-static inner member class: ")).append(ao1.d).toString());
                        }
                        if (!ao1.m)
                        {
                            ao1.d.a(ao1.a, ao1);
                            ao1.m = true;
                        }
                        ao1.d.a();
                    }
                }
                j--;
            }
        }
    }

    final void c()
    {
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder("Stopping in ")).append(this).toString());
        }
        if (!f)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder("Called doStop when not started: ")).append(this).toString(), runtimeexception);
            return;
        }
        for (int j = b.a() - 1; j >= 0; j--)
        {
            ((ao)b.b(j)).a();
        }

        f = false;
    }

    final void d()
    {
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder("Retaining in ")).append(this).toString());
        }
        if (!f)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder("Called doRetain when not started: ")).append(this).toString(), runtimeexception);
        } else
        {
            g = true;
            f = false;
            int j = b.a() - 1;
            while (j >= 0) 
            {
                ao ao1 = (ao)b.b(j);
                if (a)
                {
                    Log.v("LoaderManager", (new StringBuilder("  Retaining: ")).append(ao1).toString());
                }
                ao1.i = true;
                ao1.j = ao1.h;
                ao1.h = false;
                ao1.c = null;
                j--;
            }
        }
    }

    final void e()
    {
        if (g)
        {
            if (a)
            {
                Log.v("LoaderManager", (new StringBuilder("Finished Retaining in ")).append(this).toString());
            }
            g = false;
            for (int j = b.a() - 1; j >= 0; j--)
            {
                ao ao1 = (ao)b.b(j);
                if (ao1.i)
                {
                    if (a)
                    {
                        Log.v("LoaderManager", (new StringBuilder("  Finished Retaining: ")).append(ao1).toString());
                    }
                    ao1.i = false;
                    if (ao1.h != ao1.j && !ao1.h)
                    {
                        ao1.a();
                    }
                }
                if (ao1.h && ao1.e && !ao1.k)
                {
                    ao1.a(ao1.d, ao1.g);
                }
            }

        }
    }

    final void f()
    {
        for (int j = b.a() - 1; j >= 0; j--)
        {
            ((ao)b.b(j)).k = true;
        }

    }

    final void g()
    {
        for (int j = b.a() - 1; j >= 0; j--)
        {
            ao ao1 = (ao)b.b(j);
            if (!ao1.h || !ao1.k)
            {
                continue;
            }
            ao1.k = false;
            if (ao1.e)
            {
                ao1.a(ao1.d, ao1.g);
            }
        }

    }

    final void h()
    {
        if (!g)
        {
            if (a)
            {
                Log.v("LoaderManager", (new StringBuilder("Destroying Active in ")).append(this).toString());
            }
            for (int j = b.a() - 1; j >= 0; j--)
            {
                ((ao)b.b(j)).b();
            }

            b.b();
        }
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder("Destroying Inactive in ")).append(this).toString());
        }
        for (int k = c.a() - 1; k >= 0; k--)
        {
            ((ao)c.b(k)).b();
        }

        c.b();
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("LoaderManager{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(" in ");
        android.support.v4.e.d.a(e, stringbuilder);
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }

}
