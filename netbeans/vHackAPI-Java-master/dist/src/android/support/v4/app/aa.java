// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.be;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//            Fragment, t, ad

public abstract class aa extends be
{

    private final t a;
    private ad b;
    private ArrayList c;
    private ArrayList d;
    private Fragment e;

    public aa(t t1)
    {
        b = null;
        c = new ArrayList();
        d = new ArrayList();
        e = null;
        a = t1;
    }

    public abstract Fragment a(int i);

    public final Object a(ViewGroup viewgroup, int i)
    {
        if (d.size() > i)
        {
            Fragment fragment = (Fragment)d.get(i);
            if (fragment != null)
            {
                return fragment;
            }
        }
        if (b == null)
        {
            b = a.a();
        }
        Fragment fragment1 = a(i);
        if (c.size() > i)
        {
            Fragment.SavedState savedstate = (Fragment.SavedState)c.get(i);
            if (savedstate != null)
            {
                fragment1.a(savedstate);
            }
        }
        for (; d.size() <= i; d.add(null)) { }
        fragment1.a(false);
        fragment1.b(false);
        d.set(i, fragment1);
        b.a(viewgroup.getId(), fragment1);
        return fragment1;
    }

    public final void a()
    {
        if (b != null)
        {
            b.c();
            b = null;
            a.b();
        }
    }

    public final void a(int i, Object obj)
    {
        obj = (Fragment)obj;
        if (b == null)
        {
            b = a.a();
        }
        for (; c.size() <= i; c.add(null)) { }
        c.set(i, a.a(((Fragment) (obj))));
        d.set(i, null);
        b.a(((Fragment) (obj)));
    }

    public final void a(Parcelable parcelable, ClassLoader classloader)
    {
        if (parcelable != null)
        {
            parcelable = (Bundle)parcelable;
            parcelable.setClassLoader(classloader);
            classloader = parcelable.getParcelableArray("states");
            c.clear();
            d.clear();
            if (classloader != null)
            {
                for (int i = 0; i < classloader.length; i++)
                {
                    c.add((Fragment.SavedState)classloader[i]);
                }

            }
            classloader = parcelable.keySet().iterator();
            do
            {
                if (!classloader.hasNext())
                {
                    break;
                }
                String s = (String)classloader.next();
                if (s.startsWith("f"))
                {
                    int j = Integer.parseInt(s.substring(1));
                    Fragment fragment = a.a(parcelable, s);
                    if (fragment != null)
                    {
                        for (; d.size() <= j; d.add(null)) { }
                        fragment.a(false);
                        d.set(j, fragment);
                    } else
                    {
                        Log.w("FragmentStatePagerAdapter", (new StringBuilder("Bad fragment at key ")).append(s).toString());
                    }
                }
            } while (true);
        }
    }

    public final void a(Object obj)
    {
        obj = (Fragment)obj;
        if (obj != e)
        {
            if (e != null)
            {
                e.a(false);
                e.b(false);
            }
            if (obj != null)
            {
                ((Fragment) (obj)).a(true);
                ((Fragment) (obj)).b(true);
            }
            e = ((Fragment) (obj));
        }
    }

    public final boolean a(View view, Object obj)
    {
        return ((Fragment)obj).o() == view;
    }

    public final Parcelable b()
    {
        Object obj = null;
        if (c.size() > 0)
        {
            obj = new Bundle();
            Fragment.SavedState asavedstate[] = new Fragment.SavedState[c.size()];
            c.toArray(asavedstate);
            ((Bundle) (obj)).putParcelableArray("states", asavedstate);
        }
        for (int i = 0; i < d.size();)
        {
            Fragment fragment = (Fragment)d.get(i);
            Object obj1 = obj;
            if (fragment != null)
            {
                obj1 = obj;
                if (fragment.e())
                {
                    obj1 = obj;
                    if (obj == null)
                    {
                        obj1 = new Bundle();
                    }
                    obj = (new StringBuilder("f")).append(i).toString();
                    a.a(((Bundle) (obj1)), ((String) (obj)), fragment);
                }
            }
            i++;
            obj = obj1;
        }

        return ((Parcelable) (obj));
    }
}
