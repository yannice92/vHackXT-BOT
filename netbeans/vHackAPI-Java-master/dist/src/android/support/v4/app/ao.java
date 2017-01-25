// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.i;
import android.support.v4.content.j;
import android.support.v4.e.d;
import android.util.Log;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//            an, FragmentActivity, u, am

final class ao
    implements j
{

    final int a;
    final Bundle b;
    am c;
    i d;
    boolean e;
    boolean f;
    Object g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    boolean l;
    boolean m;
    ao n;
    final an o;

    final void a()
    {
        if (an.a)
        {
            Log.v("LoaderManager", (new StringBuilder("  Stopping: ")).append(this).toString());
        }
        h = false;
        if (!i && d != null && m)
        {
            m = false;
            d.a(this);
            d.b();
        }
    }

    final void a(i i1, Object obj)
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        String s;
        StringBuilder stringbuilder;
        if (o.e != null)
        {
            s = o.e.mFragments.u;
            o.e.mFragments.u = "onLoadFinished";
        } else
        {
            s = null;
        }
        if (an.a)
        {
            i1 = (new StringBuilder("  onLoadFinished in ")).append(i1).append(": ");
            stringbuilder = new StringBuilder(64);
            android.support.v4.e.d.a(obj, stringbuilder);
            stringbuilder.append("}");
            Log.v("LoaderManager", i1.append(stringbuilder.toString()).toString());
        }
        i1 = c;
        if (o.e != null)
        {
            o.e.mFragments.u = s;
        }
        f = true;
        return;
        i1;
        if (o.e != null)
        {
            o.e.mFragments.u = s;
        }
        throw i1;
    }

    public final void a(String s, PrintWriter printwriter)
    {
        String s1 = s;
        s = this;
        do
        {
            printwriter.print(s1);
            printwriter.print("mId=");
            printwriter.print(((ao) (s)).a);
            printwriter.print(" mArgs=");
            printwriter.println(((ao) (s)).b);
            printwriter.print(s1);
            printwriter.print("mCallbacks=");
            printwriter.println(((ao) (s)).c);
            printwriter.print(s1);
            printwriter.print("mLoader=");
            printwriter.println(((ao) (s)).d);
            if (((ao) (s)).d != null)
            {
                ((ao) (s)).d.a((new StringBuilder()).append(s1).append("  ").toString(), printwriter);
            }
            if (((ao) (s)).e || ((ao) (s)).f)
            {
                printwriter.print(s1);
                printwriter.print("mHaveData=");
                printwriter.print(((ao) (s)).e);
                printwriter.print("  mDeliveredData=");
                printwriter.println(((ao) (s)).f);
                printwriter.print(s1);
                printwriter.print("mData=");
                printwriter.println(((ao) (s)).g);
            }
            printwriter.print(s1);
            printwriter.print("mStarted=");
            printwriter.print(((ao) (s)).h);
            printwriter.print(" mReportNextStart=");
            printwriter.print(((ao) (s)).k);
            printwriter.print(" mDestroyed=");
            printwriter.println(((ao) (s)).l);
            printwriter.print(s1);
            printwriter.print("mRetaining=");
            printwriter.print(((ao) (s)).i);
            printwriter.print(" mRetainingStarted=");
            printwriter.print(((ao) (s)).j);
            printwriter.print(" mListenerRegistered=");
            printwriter.println(((ao) (s)).m);
            if (((ao) (s)).n != null)
            {
                printwriter.print(s1);
                printwriter.println("Pending Loader ");
                printwriter.print(((ao) (s)).n);
                printwriter.println(":");
                s = ((ao) (s)).n;
                s1 = (new StringBuilder()).append(s1).append("  ").toString();
            } else
            {
                return;
            }
        } while (true);
    }

    final void b()
    {
        ao ao1 = this;
_L2:
        if (an.a)
        {
            Log.v("LoaderManager", (new StringBuilder("  Destroying: ")).append(ao1).toString());
        }
        ao1.l = true;
        boolean flag = ao1.f;
        ao1.f = false;
        if (ao1.c == null || ao1.d == null || !ao1.e || !flag)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        if (an.a)
        {
            Log.v("LoaderManager", (new StringBuilder("  Reseting: ")).append(ao1).toString());
        }
        String s;
        Object obj;
        Exception exception;
        if (ao1.o.e != null)
        {
            s = ao1.o.e.mFragments.u;
            ao1.o.e.mFragments.u = "onLoaderReset";
        } else
        {
            s = null;
        }
        obj = ao1.c;
        obj = ao1.d;
        if (ao1.o.e != null)
        {
            ao1.o.e.mFragments.u = s;
        }
        ao1.c = null;
        ao1.g = null;
        ao1.e = false;
        if (ao1.d != null)
        {
            if (ao1.m)
            {
                ao1.m = false;
                ao1.d.a(ao1);
            }
            ao1.d.c();
        }
        if (ao1.n != null)
        {
            ao1 = ao1.n;
        } else
        {
            return;
        }
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        if (ao1.o.e != null)
        {
            ao1.o.e.mFragments.u = s;
        }
        throw exception;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        stringbuilder.append("LoaderInfo{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(" #");
        stringbuilder.append(a);
        stringbuilder.append(" : ");
        android.support.v4.e.d.a(d, stringbuilder);
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }
}
