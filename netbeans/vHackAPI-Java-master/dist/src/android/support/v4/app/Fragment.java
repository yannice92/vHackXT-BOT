// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.e.d;
import android.support.v4.e.m;
import android.support.v4.view.z;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//            u, m, n, co, 
//            FragmentActivity, an, cn

public class Fragment
    implements ComponentCallbacks, android.view.View.OnCreateContextMenuListener
{

    static final Object a = new Object();
    private static final m aa = new m();
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    boolean F;
    boolean G;
    int H;
    ViewGroup I;
    View J;
    View K;
    boolean L;
    boolean M;
    an N;
    boolean O;
    boolean P;
    Object Q;
    Object R;
    Object S;
    Object T;
    Object U;
    Object V;
    Boolean W;
    Boolean X;
    cn Y;
    cn Z;
    int b;
    View c;
    int d;
    Bundle e;
    SparseArray f;
    int g;
    String h;
    Bundle i;
    Fragment j;
    int k;
    int l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    boolean r;
    int s;
    u t;
    FragmentActivity u;
    u v;
    Fragment w;
    int x;
    int y;
    String z;

    public Fragment()
    {
        b = 0;
        g = -1;
        k = -1;
        F = true;
        M = true;
        Q = null;
        R = a;
        S = null;
        T = a;
        U = null;
        V = a;
        Y = null;
        Z = null;
    }

    private void L()
    {
        v = new u();
        v.a(u, new android.support.v4.app.m(this), this);
    }

    public static Fragment a(Context context, String s1)
    {
        return a(context, s1, null);
    }

    public static Fragment a(Context context, String s1, Bundle bundle)
    {
        Class class1;
        Class class2;
        try
        {
            class2 = (Class)aa.get(s1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new n((new StringBuilder("Unable to instantiate fragment ")).append(s1).append(": make sure class name exists, is public, and has an empty constructor that is public").toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new n((new StringBuilder("Unable to instantiate fragment ")).append(s1).append(": make sure class name exists, is public, and has an empty constructor that is public").toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new n((new StringBuilder("Unable to instantiate fragment ")).append(s1).append(": make sure class name exists, is public, and has an empty constructor that is public").toString(), context);
        }
        class1 = class2;
        if (class2 != null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        class1 = context.getClassLoader().loadClass(s1);
        aa.put(s1, class1);
        context = (Fragment)class1.newInstance();
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        bundle.setClassLoader(context.getClass().getClassLoader());
        context.i = bundle;
        return context;
    }

    static boolean b(Context context, String s1)
    {
        Class class1;
        Class class2;
        boolean flag;
        try
        {
            class2 = (Class)aa.get(s1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        class1 = class2;
        if (class2 != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        class1 = context.getClassLoader().loadClass(s1);
        aa.put(s1, class1);
        flag = android/support/v4/app/Fragment.isAssignableFrom(class1);
        return flag;
    }

    public static void h()
    {
    }

    public static void i()
    {
    }

    public static Animation l()
    {
        return null;
    }

    public static void n()
    {
    }

    public static void t()
    {
    }

    public final boolean A()
    {
        if (X == null)
        {
            return true;
        } else
        {
            return X.booleanValue();
        }
    }

    public final boolean B()
    {
        if (W == null)
        {
            return true;
        } else
        {
            return W.booleanValue();
        }
    }

    final void C()
    {
        if (v != null)
        {
            v.g();
        }
        G = false;
        G = true;
        if (!G)
        {
            throw new co((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onActivityCreated()").toString());
        }
        if (v != null)
        {
            v.i();
        }
    }

    final void D()
    {
        if (v != null)
        {
            v.g();
            v.d();
        }
        G = false;
        G = true;
        if (!O)
        {
            O = true;
            if (!P)
            {
                P = true;
                N = u.getLoaderManager(h, O, false);
            }
            if (N != null)
            {
                N.b();
            }
        }
        if (!G)
        {
            throw new co((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onStart()").toString());
        }
        if (v != null)
        {
            v.j();
        }
        if (N != null)
        {
            N.g();
        }
    }

    final void E()
    {
        if (v != null)
        {
            v.g();
            v.d();
        }
        G = false;
        p();
        if (!G)
        {
            throw new co((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onResume()").toString());
        }
        if (v != null)
        {
            v.k();
            v.d();
        }
    }

    final void F()
    {
        onLowMemory();
        if (v != null)
        {
            v.q();
        }
    }

    final void G()
    {
        if (v != null)
        {
            v.l();
        }
        G = false;
        q();
        if (!G)
        {
            throw new co((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onPause()").toString());
        } else
        {
            return;
        }
    }

    final void H()
    {
        if (v != null)
        {
            v.m();
        }
        G = false;
        G = true;
        if (!G)
        {
            throw new co((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onStop()").toString());
        } else
        {
            return;
        }
    }

    final void I()
    {
label0:
        {
            if (v != null)
            {
                v.n();
            }
            if (O)
            {
                O = false;
                if (!P)
                {
                    P = true;
                    N = u.getLoaderManager(h, O, false);
                }
                if (N != null)
                {
                    if (u.mRetaining)
                    {
                        break label0;
                    }
                    N.c();
                }
            }
            return;
        }
        N.d();
    }

    final void J()
    {
        if (v != null)
        {
            v.o();
        }
        G = false;
        G = true;
        if (!G)
        {
            throw new co((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onDestroyView()").toString());
        }
        if (N != null)
        {
            N.f();
        }
    }

    final void K()
    {
        if (v != null)
        {
            v.p();
        }
        G = false;
        G = true;
        if (!P)
        {
            P = true;
            N = u.getLoaderManager(h, O, false);
        }
        if (N != null)
        {
            N.h();
        }
        if (!G)
        {
            throw new co((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onDestroy()").toString());
        } else
        {
            return;
        }
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        return null;
    }

    final void a()
    {
        if (f != null)
        {
            K.restoreHierarchyState(f);
            f = null;
        }
        G = false;
        G = true;
        if (!G)
        {
            throw new co((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onViewStateRestored()").toString());
        } else
        {
            return;
        }
    }

    final void a(int i1, Fragment fragment)
    {
        g = i1;
        if (fragment != null)
        {
            h = (new StringBuilder()).append(fragment.h).append(":").append(g).toString();
            return;
        } else
        {
            h = (new StringBuilder("android:fragment:")).append(g).toString();
            return;
        }
    }

    public void a(Activity activity)
    {
        G = true;
    }

    final void a(Configuration configuration)
    {
        onConfigurationChanged(configuration);
        if (v != null)
        {
            v.a(configuration);
        }
    }

    public final void a(Bundle bundle)
    {
        if (g >= 0)
        {
            throw new IllegalStateException("Fragment already active");
        } else
        {
            i = bundle;
            return;
        }
    }

    public final void a(SavedState savedstate)
    {
        if (g >= 0)
        {
            throw new IllegalStateException("Fragment already active");
        }
        if (savedstate != null && savedstate.a != null)
        {
            savedstate = savedstate.a;
        } else
        {
            savedstate = null;
        }
        e = savedstate;
    }

    public final void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.print(s1);
        printwriter.print("mFragmentId=#");
        printwriter.print(Integer.toHexString(x));
        printwriter.print(" mContainerId=#");
        printwriter.print(Integer.toHexString(y));
        printwriter.print(" mTag=");
        printwriter.println(z);
        printwriter.print(s1);
        printwriter.print("mState=");
        printwriter.print(b);
        printwriter.print(" mIndex=");
        printwriter.print(g);
        printwriter.print(" mWho=");
        printwriter.print(h);
        printwriter.print(" mBackStackNesting=");
        printwriter.println(s);
        printwriter.print(s1);
        printwriter.print("mAdded=");
        printwriter.print(m);
        printwriter.print(" mRemoving=");
        printwriter.print(n);
        printwriter.print(" mResumed=");
        printwriter.print(o);
        printwriter.print(" mFromLayout=");
        printwriter.print(p);
        printwriter.print(" mInLayout=");
        printwriter.println(q);
        printwriter.print(s1);
        printwriter.print("mHidden=");
        printwriter.print(A);
        printwriter.print(" mDetached=");
        printwriter.print(B);
        printwriter.print(" mMenuVisible=");
        printwriter.print(F);
        printwriter.print(" mHasMenu=");
        printwriter.println(E);
        printwriter.print(s1);
        printwriter.print("mRetainInstance=");
        printwriter.print(C);
        printwriter.print(" mRetaining=");
        printwriter.print(D);
        printwriter.print(" mUserVisibleHint=");
        printwriter.println(M);
        if (t != null)
        {
            printwriter.print(s1);
            printwriter.print("mFragmentManager=");
            printwriter.println(t);
        }
        if (u != null)
        {
            printwriter.print(s1);
            printwriter.print("mActivity=");
            printwriter.println(u);
        }
        if (w != null)
        {
            printwriter.print(s1);
            printwriter.print("mParentFragment=");
            printwriter.println(w);
        }
        if (i != null)
        {
            printwriter.print(s1);
            printwriter.print("mArguments=");
            printwriter.println(i);
        }
        if (e != null)
        {
            printwriter.print(s1);
            printwriter.print("mSavedFragmentState=");
            printwriter.println(e);
        }
        if (f != null)
        {
            printwriter.print(s1);
            printwriter.print("mSavedViewState=");
            printwriter.println(f);
        }
        if (j != null)
        {
            printwriter.print(s1);
            printwriter.print("mTarget=");
            printwriter.print(j);
            printwriter.print(" mTargetRequestCode=");
            printwriter.println(l);
        }
        if (H != 0)
        {
            printwriter.print(s1);
            printwriter.print("mNextAnim=");
            printwriter.println(H);
        }
        if (I != null)
        {
            printwriter.print(s1);
            printwriter.print("mContainer=");
            printwriter.println(I);
        }
        if (J != null)
        {
            printwriter.print(s1);
            printwriter.print("mView=");
            printwriter.println(J);
        }
        if (K != null)
        {
            printwriter.print(s1);
            printwriter.print("mInnerView=");
            printwriter.println(J);
        }
        if (c != null)
        {
            printwriter.print(s1);
            printwriter.print("mAnimatingAway=");
            printwriter.println(c);
            printwriter.print(s1);
            printwriter.print("mStateAfterAnimating=");
            printwriter.println(d);
        }
        if (N != null)
        {
            printwriter.print(s1);
            printwriter.println("Loader Manager:");
            N.a((new StringBuilder()).append(s1).append("  ").toString(), printwriter);
        }
        if (v != null)
        {
            printwriter.print(s1);
            printwriter.println((new StringBuilder("Child ")).append(v).append(":").toString());
            v.a((new StringBuilder()).append(s1).append("  ").toString(), filedescriptor, printwriter, as);
        }
    }

    public final void a(boolean flag)
    {
        if (F != flag)
        {
            F = flag;
            if (E && e() && !A)
            {
                u.supportInvalidateOptionsMenu();
            }
        }
    }

    final boolean a(Menu menu)
    {
        boolean flag1 = false;
        boolean flag2 = false;
        if (!A)
        {
            boolean flag = flag2;
            if (E)
            {
                flag = flag2;
                if (F)
                {
                    flag = true;
                }
            }
            flag1 = flag;
            if (v != null)
            {
                flag1 = flag | v.a(menu);
            }
        }
        return flag1;
    }

    final boolean a(Menu menu, MenuInflater menuinflater)
    {
        boolean flag1 = false;
        boolean flag2 = false;
        if (!A)
        {
            boolean flag = flag2;
            if (E)
            {
                flag = flag2;
                if (F)
                {
                    flag = true;
                }
            }
            flag1 = flag;
            if (v != null)
            {
                flag1 = flag | v.a(menu, menuinflater);
            }
        }
        return flag1;
    }

    final boolean a(MenuItem menuitem)
    {
        if (!A)
        {
            boolean flag;
            if (E)
            {
                flag = F;
            }
            if (v != null && v.a(menuitem))
            {
                return true;
            }
        }
        return false;
    }

    final View b(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        if (v != null)
        {
            v.g();
        }
        return a(layoutinflater, viewgroup);
    }

    final void b(Bundle bundle)
    {
        if (v != null)
        {
            v.g();
        }
        G = false;
        G = true;
        if (!G)
        {
            throw new co((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onCreate()").toString());
        }
        if (bundle != null)
        {
            bundle = bundle.getParcelable("android:support:fragments");
            if (bundle != null)
            {
                if (v == null)
                {
                    L();
                }
                v.a(bundle, null);
                v.h();
            }
        }
    }

    final void b(Menu menu)
    {
        if (!A)
        {
            boolean flag;
            if (E)
            {
                flag = F;
            }
            if (v != null)
            {
                v.b(menu);
            }
        }
    }

    public final void b(boolean flag)
    {
        if (!M && flag && b < 4)
        {
            t.b(this);
        }
        M = flag;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        L = flag;
    }

    final boolean b()
    {
        return s > 0;
    }

    final boolean b(MenuItem menuitem)
    {
        return !A && v != null && v.b(menuitem);
    }

    public final FragmentActivity c()
    {
        return u;
    }

    final void c(Bundle bundle)
    {
        if (v != null)
        {
            Parcelable parcelable = v.f();
            if (parcelable != null)
            {
                bundle.putParcelable("android:support:fragments", parcelable);
            }
        }
    }

    public final Resources d()
    {
        if (u == null)
        {
            throw new IllegalStateException((new StringBuilder("Fragment ")).append(this).append(" not attached to Activity").toString());
        } else
        {
            return u.getResources();
        }
    }

    public final boolean e()
    {
        return u != null && m;
    }

    public final boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public final boolean f()
    {
        return B;
    }

    public final boolean g()
    {
        return A;
    }

    public final int hashCode()
    {
        return super.hashCode();
    }

    public final LayoutInflater j()
    {
        LayoutInflater layoutinflater = u.getLayoutInflater().cloneInContext(u);
        if (v != null) goto _L2; else goto _L1
_L1:
        L();
        if (b < 5) goto _L4; else goto _L3
_L3:
        v.k();
_L2:
        u u1 = v;
        android.support.v4.view.z.a(layoutinflater, v.r());
        return layoutinflater;
_L4:
        if (b >= 4)
        {
            v.j();
        } else
        if (b >= 2)
        {
            v.i();
        } else
        if (b > 0)
        {
            v.h();
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final void k()
    {
        G = true;
    }

    public final void m()
    {
        G = true;
    }

    public final View o()
    {
        return J;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        G = true;
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        u.onCreateContextMenu(contextmenu, view, contextmenuinfo);
    }

    public void onLowMemory()
    {
        G = true;
    }

    public void p()
    {
        G = true;
    }

    public void q()
    {
        G = true;
    }

    final void r()
    {
        g = -1;
        h = null;
        m = false;
        n = false;
        o = false;
        p = false;
        q = false;
        r = false;
        s = 0;
        t = null;
        v = null;
        u = null;
        x = 0;
        y = 0;
        z = null;
        A = false;
        B = false;
        D = false;
        N = null;
        O = false;
        P = false;
    }

    public final void s()
    {
        G = true;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        android.support.v4.e.d.a(this, stringbuilder);
        if (g >= 0)
        {
            stringbuilder.append(" #");
            stringbuilder.append(g);
        }
        if (x != 0)
        {
            stringbuilder.append(" id=0x");
            stringbuilder.append(Integer.toHexString(x));
        }
        if (z != null)
        {
            stringbuilder.append(" ");
            stringbuilder.append(z);
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    public final Object u()
    {
        return Q;
    }

    public final Object v()
    {
        if (R == a)
        {
            return Q;
        } else
        {
            return R;
        }
    }

    public final Object w()
    {
        return S;
    }

    public final Object x()
    {
        if (T == a)
        {
            return S;
        } else
        {
            return T;
        }
    }

    public final Object y()
    {
        return U;
    }

    public final Object z()
    {
        if (V == a)
        {
            return U;
        } else
        {
            return V;
        }
    }


    private class SavedState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new o();
        final Bundle a;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            parcel.writeBundle(a);
        }


        SavedState(Bundle bundle)
        {
            a = bundle;
        }

        SavedState(Parcel parcel)
        {
            a = parcel.readBundle();
        }
    }

}
