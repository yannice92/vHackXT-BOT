// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.transition.Transition;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package android.support.v4.app:
//            ak, ae

final class ag
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    final View a;
    final ak b;
    final Map c;
    final Map d;
    final Transition e;
    final ArrayList f;
    final View g;

    ag(View view, ak ak1, Map map, Map map1, Transition transition, ArrayList arraylist, View view1)
    {
        a = view;
        b = ak1;
        c = map;
        d = map1;
        e = transition;
        f = arraylist;
        g = view1;
        super();
    }

    public final boolean onPreDraw()
    {
        a.getViewTreeObserver().removeOnPreDrawListener(this);
        View view = b.a();
        if (view != null)
        {
            if (!c.isEmpty())
            {
                ae.a(d, view);
                d.keySet().retainAll(c.values());
                Iterator iterator = c.entrySet().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                    Object obj = (String)entry.getValue();
                    obj = (View)d.get(obj);
                    if (obj != null)
                    {
                        ((View) (obj)).setTransitionName((String)entry.getKey());
                    }
                } while (true);
            }
            if (e != null)
            {
                ae.a(f, view);
                f.removeAll(d.values());
                f.add(g);
                e.removeTarget(g);
                ae.b(e, f);
            }
        }
        return true;
    }
}
