// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.TabHost;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            ac, t, ad, Fragment

public class FragmentTabHost extends TabHost
    implements android.widget.TabHost.OnTabChangeListener
{

    private final ArrayList a = new ArrayList();
    private Context b;
    private t c;
    private int d;
    private android.widget.TabHost.OnTabChangeListener e;
    private ac f;
    private boolean g;

    public FragmentTabHost(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.obtainStyledAttributes(attributeset, new int[] {
            0x10100f3
        }, 0, 0);
        d = context.getResourceId(0, 0);
        context.recycle();
        super.setOnTabChangedListener(this);
    }

    private ad a(String s, ad ad1)
    {
        ac ac1 = null;
        for (int i = 0; i < a.size(); i++)
        {
            ac ac2 = (ac)a.get(i);
            if (ac.b(ac2).equals(s))
            {
                ac1 = ac2;
            }
        }

        if (ac1 == null)
        {
            throw new IllegalStateException((new StringBuilder("No tab known for tag ")).append(s).toString());
        }
        s = ad1;
        if (f != ac1)
        {
            s = ad1;
            if (ad1 == null)
            {
                s = c.a();
            }
            if (f != null && ac.a(f) != null)
            {
                s.b(ac.a(f));
            }
            if (ac1 != null)
            {
                if (ac.a(ac1) == null)
                {
                    ac.a(ac1, Fragment.a(b, ac.c(ac1).getName(), ac.d(ac1)));
                    s.a(d, ac.a(ac1), ac.b(ac1));
                } else
                {
                    s.c(ac.a(ac1));
                }
            }
            f = ac1;
        }
        return s;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        String s = getCurrentTabTag();
        ad ad1 = null;
        int i = 0;
        while (i < a.size()) 
        {
            ac ac1 = (ac)a.get(i);
            ac.a(ac1, c.a(ac.b(ac1)));
            ad ad2 = ad1;
            if (ac.a(ac1) != null)
            {
                ad2 = ad1;
                if (!ac.a(ac1).f())
                {
                    if (ac.b(ac1).equals(s))
                    {
                        f = ac1;
                        ad2 = ad1;
                    } else
                    {
                        ad2 = ad1;
                        if (ad1 == null)
                        {
                            ad2 = c.a();
                        }
                        ad2.b(ac.a(ac1));
                    }
                }
            }
            i++;
            ad1 = ad2;
        }
        g = true;
        ad1 = a(s, ad1);
        if (ad1 != null)
        {
            ad1.b();
            c.b();
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        g = false;
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        setCurrentTabByTag(((SavedState) (parcelable)).a);
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = getCurrentTabTag();
        return savedstate;
    }

    public void onTabChanged(String s)
    {
        if (g)
        {
            ad ad1 = a(s, null);
            if (ad1 != null)
            {
                ad1.b();
            }
        }
        if (e != null)
        {
            e.onTabChanged(s);
        }
    }

    public void setOnTabChangedListener(android.widget.TabHost.OnTabChangeListener ontabchangelistener)
    {
        e = ontabchangelistener;
    }

    public void setup()
    {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new ab();
        String a;

        public String toString()
        {
            return (new StringBuilder("FragmentTabHost.SavedState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" curTab=").append(a).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeString(a);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            a = parcel.readString();
        }

        SavedState(Parcel parcel, byte byte0)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
