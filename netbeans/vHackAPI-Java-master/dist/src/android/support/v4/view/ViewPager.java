// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.widget.y;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Referenced classes of package android.support.v4.view:
//            cu, cv, dg, cy, 
//            cw, be, db, bs, 
//            at, ch, cz, dd, 
//            da, cx, u, bo, 
//            dc

public class ViewPager extends ViewGroup
{

    private static final int a[] = {
        0x10100b3
    };
    private static final dg ag = new dg();
    private static final Comparator c = new cu();
    private static final Interpolator d = new cv();
    private boolean A;
    private boolean B;
    private int C;
    private int D;
    private int E;
    private float F;
    private float G;
    private float H;
    private float I;
    private int J;
    private VelocityTracker K;
    private int L;
    private int M;
    private int N;
    private int O;
    private boolean P;
    private y Q;
    private y R;
    private boolean S;
    private boolean T;
    private boolean U;
    private int V;
    private List W;
    private db aa;
    private db ab;
    private da ac;
    private dc ad;
    private int ae;
    private ArrayList af;
    private final Runnable ah;
    private int ai;
    private int b;
    private final ArrayList e;
    private final cy f;
    private final Rect g;
    private be h;
    private int i;
    private int j;
    private Parcelable k;
    private ClassLoader l;
    private Scroller m;
    private dd n;
    private int o;
    private Drawable p;
    private int q;
    private int r;
    private float s;
    private float t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z;

    public ViewPager(Context context)
    {
        super(context);
        e = new ArrayList();
        f = new cy();
        g = new Rect();
        j = -1;
        k = null;
        l = null;
        s = -3.402823E+38F;
        t = 3.402823E+38F;
        z = 1;
        J = -1;
        S = true;
        T = false;
        ah = new cw(this);
        ai = 0;
        f();
    }

    public ViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = new ArrayList();
        f = new cy();
        g = new Rect();
        j = -1;
        k = null;
        l = null;
        s = -3.402823E+38F;
        t = 3.402823E+38F;
        z = 1;
        J = -1;
        S = true;
        T = false;
        ah = new cw(this);
        ai = 0;
        f();
    }

    private Rect a(Rect rect, View view)
    {
        if (rect == null)
        {
            rect = new Rect();
        }
        if (view == null)
        {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        for (view = view.getParent(); (view instanceof ViewGroup) && view != this; view = view.getParent())
        {
            view = (ViewGroup)view;
            rect.left = rect.left + view.getLeft();
            rect.right = rect.right + view.getRight();
            rect.top = rect.top + view.getTop();
            rect.bottom = rect.bottom + view.getBottom();
        }

        return rect;
    }

    private cy a(int i1, int j1)
    {
        cy cy1 = new cy();
        cy1.b = i1;
        cy1.a = h.a(this, i1);
        be be1 = h;
        cy1.d = 1.0F;
        if (j1 < 0 || j1 >= e.size())
        {
            e.add(cy1);
            return cy1;
        } else
        {
            e.add(j1, cy1);
            return cy1;
        }
    }

    private cy a(View view)
    {
        for (int i1 = 0; i1 < e.size(); i1++)
        {
            cy cy1 = (cy)e.get(i1);
            if (h.a(view, cy1.a))
            {
                return cy1;
            }
        }

        return null;
    }

    private void a(int i1, float f1)
    {
        if (V <= 0) goto _L2; else goto _L1
_L1:
        int j1;
        int k1;
        int k2;
        int l2;
        int i3;
        int j3;
        l2 = getScrollX();
        j1 = getPaddingLeft();
        k1 = getPaddingRight();
        i3 = getWidth();
        j3 = getChildCount();
        k2 = 0;
_L8:
        if (k2 >= j3) goto _L2; else goto _L3
_L3:
        View view;
        LayoutParams layoutparams;
        view = getChildAt(k2);
        layoutparams = (LayoutParams)view.getLayoutParams();
        if (!layoutparams.a)
        {
            break MISSING_BLOCK_LABEL_452;
        }
        layoutparams.b & 7;
        JVM INSTR tableswitch 1 5: default 112
    //                   1 212
    //                   2 112
    //                   3 184
    //                   4 112
    //                   5 243;
           goto _L4 _L5 _L4 _L6 _L4 _L7
_L4:
        int l1;
        l1 = j1;
        int i2 = k1;
        k1 = j1;
        j1 = i2;
_L9:
        int j2;
        int k3 = (l1 + l2) - view.getLeft();
        l1 = j1;
        j2 = k1;
        if (k3 != 0)
        {
            view.offsetLeftAndRight(k3);
            j2 = k1;
            l1 = j1;
        }
_L10:
        k2++;
        j1 = j2;
        k1 = l1;
          goto _L8
_L6:
        l1 = view.getWidth();
        j2 = l1 + j1;
        l1 = j1;
        j1 = k1;
        k1 = j2;
          goto _L9
_L5:
        l1 = Math.max((i3 - view.getMeasuredWidth()) / 2, j1);
        j2 = j1;
        j1 = k1;
        k1 = j2;
          goto _L9
_L7:
        l1 = i3 - k1 - view.getMeasuredWidth();
        int l3 = view.getMeasuredWidth();
        j2 = j1;
        j1 = k1 + l3;
        k1 = j2;
          goto _L9
_L2:
        if (aa != null)
        {
            aa.a(i1, f1);
        }
        if (W != null)
        {
            k1 = W.size();
            for (j1 = 0; j1 < k1; j1++)
            {
                db db1 = (db)W.get(j1);
                if (db1 != null)
                {
                    db1.a(i1, f1);
                }
            }

        }
        if (ab != null)
        {
            ab.a(i1, f1);
        }
        if (ad != null)
        {
            getScrollX();
            j1 = getChildCount();
            for (i1 = 0; i1 < j1; i1++)
            {
                Object obj = getChildAt(i1);
                if (!((LayoutParams)((View) (obj)).getLayoutParams()).a)
                {
                    ((View) (obj)).getLeft();
                    g();
                    obj = ad;
                }
            }

        }
        U = true;
        return;
        l1 = k1;
        j2 = j1;
          goto _L10
    }

    private void a(int i1, boolean flag, int j1, boolean flag1)
    {
        cy cy1 = e(i1);
        int k1 = 0;
        if (cy1 != null)
        {
            k1 = (int)((float)g() * Math.max(s, Math.min(cy1.e, t)));
        }
        if (flag)
        {
            if (getChildCount() == 0)
            {
                b(false);
            } else
            {
                int l1 = getScrollX();
                int i2 = getScrollY();
                k1 -= l1;
                int j2 = 0 - i2;
                if (k1 == 0 && j2 == 0)
                {
                    a(false);
                    d();
                    b(0);
                } else
                {
                    b(true);
                    b(2);
                    int k2 = g();
                    int l2 = k2 / 2;
                    float f4 = Math.min(1.0F, (1.0F * (float)Math.abs(k1)) / (float)k2);
                    float f1 = l2;
                    float f3 = l2;
                    f4 = (float)Math.sin((float)((double)(f4 - 0.5F) * 0.4712389167638204D));
                    j1 = Math.abs(j1);
                    if (j1 > 0)
                    {
                        j1 = Math.round(1000F * Math.abs((f3 * f4 + f1) / (float)j1)) * 4;
                    } else
                    {
                        float f2 = k2;
                        be be1 = h;
                        j1 = i;
                        j1 = (int)(((float)Math.abs(k1) / (f2 * 1.0F + (float)o) + 1.0F) * 100F);
                    }
                    j1 = Math.min(j1, 600);
                    m.startScroll(l1, i2, k1, j2, j1);
                    bs.b(this);
                }
            }
        } else
        {
            if (flag1)
            {
                g(i1);
            }
            a(false);
            scrollTo(k1, 0);
            f(k1);
            return;
        }
        if (flag1)
        {
            g(i1);
        }
    }

    private void a(int i1, boolean flag, boolean flag1)
    {
        a(i1, flag, flag1, 0);
    }

    private void a(int i1, boolean flag, boolean flag1, int j1)
    {
        boolean flag2;
        flag2 = true;
        if (h != null)
        {
            be be1 = h;
            if (!flag1 && i == i1 && e.size() != 0)
            {
                b(false);
                return;
            }
        } else
        {
            b(false);
            return;
        }
        if (i1 >= 0) goto _L2; else goto _L1
_L1:
        int k1 = 0;
_L4:
        i1 = z;
        if (k1 > i + i1 || k1 < i - i1)
        {
            for (i1 = 0; i1 < e.size(); i1++)
            {
                ((cy)e.get(i1)).c = true;
            }

        }
        break; /* Loop/switch isn't completed */
_L2:
        be be2 = h;
        k1 = i1;
        if (i1 >= 2)
        {
            be be3 = h;
            k1 = 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (i != k1)
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        if (S)
        {
            i = k1;
            if (flag1)
            {
                g(k1);
            }
            requestLayout();
            return;
        } else
        {
            d(k1);
            a(k1, flag, j1, flag1);
            return;
        }
    }

    static void a(ViewPager viewpager)
    {
        viewpager.b(0);
    }

    private void a(cy cy1, int i1, cy cy2)
    {
        be be1 = h;
        int j1 = g();
        float f4;
        if (j1 > 0)
        {
            f4 = (float)o / (float)j1;
        } else
        {
            f4 = 0.0F;
        }
        if (cy2 != null)
        {
            j1 = cy2.b;
            if (j1 < cy1.b)
            {
                float f1 = cy2.e + cy2.d + f4;
                j1++;
                int j2;
                for (int k1 = 0; j1 <= cy1.b && k1 < e.size(); j1 = j2 + 1)
                {
                    cy2 = (cy)e.get(k1);
                    float f5;
                    do
                    {
                        j2 = j1;
                        f5 = f1;
                        if (j1 <= cy2.b)
                        {
                            break;
                        }
                        j2 = j1;
                        f5 = f1;
                        if (k1 >= e.size() - 1)
                        {
                            break;
                        }
                        k1++;
                        cy2 = (cy)e.get(k1);
                    } while (true);
                    for (; j2 < cy2.b; j2++)
                    {
                        be be2 = h;
                        f5 += 1.0F + f4;
                    }

                    cy2.e = f5;
                    f1 = f5 + (cy2.d + f4);
                }

            } else
            if (j1 > cy1.b)
            {
                int l1 = e.size() - 1;
                float f2 = cy2.e;
                int k2;
                for (j1--; j1 >= cy1.b && l1 >= 0; j1 = k2 - 1)
                {
                    cy2 = (cy)e.get(l1);
                    float f6;
                    do
                    {
                        k2 = j1;
                        f6 = f2;
                        if (j1 >= cy2.b)
                        {
                            break;
                        }
                        k2 = j1;
                        f6 = f2;
                        if (l1 <= 0)
                        {
                            break;
                        }
                        l1--;
                        cy2 = (cy)e.get(l1);
                    } while (true);
                    for (; k2 > cy2.b; k2--)
                    {
                        be be3 = h;
                        f6 -= 1.0F + f4;
                    }

                    f2 = f6 - (cy2.d + f4);
                    cy2.e = f2;
                }

            }
        }
        int l2 = e.size();
        float f7 = cy1.e;
        j1 = cy1.b - 1;
        float f3;
        int i2;
        if (cy1.b == 0)
        {
            f3 = cy1.e;
        } else
        {
            f3 = -3.402823E+38F;
        }
        s = f3;
        if (cy1.b == 1)
        {
            f3 = (cy1.e + cy1.d) - 1.0F;
        } else
        {
            f3 = 3.402823E+38F;
        }
        t = f3;
        i2 = i1 - 1;
        f3 = f7;
        for (; i2 >= 0; i2--)
        {
            for (cy2 = (cy)e.get(i2); j1 > cy2.b;)
            {
                be be4 = h;
                j1--;
                f3 -= 1.0F + f4;
            }

            f3 -= cy2.d + f4;
            cy2.e = f3;
            if (cy2.b == 0)
            {
                s = f3;
            }
            j1--;
        }

        f3 = cy1.e + cy1.d + f4;
        i2 = cy1.b + 1;
        j1 = i1 + 1;
        i1 = i2;
        for (; j1 < l2; j1++)
        {
            for (cy1 = (cy)e.get(j1); i1 < cy1.b;)
            {
                cy2 = h;
                i1++;
                f3 += 1.0F + f4;
            }

            if (cy1.b == 1)
            {
                t = (cy1.d + f3) - 1.0F;
            }
            cy1.e = f3;
            f3 += cy1.d + f4;
            i1++;
        }

        T = false;
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = at.b(motionevent);
        if (at.b(motionevent, i1) == J)
        {
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            F = at.c(motionevent, i1);
            J = at.b(motionevent, i1);
            if (K != null)
            {
                K.clear();
            }
        }
    }

    private void a(boolean flag)
    {
label0:
        {
            int i1;
            boolean flag1;
            boolean flag2;
            if (ai == 2)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                b(false);
                m.abortAnimation();
                int j1 = getScrollX();
                int k1 = getScrollY();
                int l1 = m.getCurrX();
                int i2 = m.getCurrY();
                if (j1 != l1 || k1 != i2)
                {
                    scrollTo(l1, i2);
                    if (l1 != j1)
                    {
                        f(l1);
                    }
                }
            }
            y = false;
            flag2 = false;
            flag1 = i1;
            for (i1 = ((flag2) ? 1 : 0); i1 < e.size(); i1++)
            {
                cy cy1 = (cy)e.get(i1);
                if (cy1.c)
                {
                    cy1.c = false;
                    flag1 = true;
                }
            }

            if (flag1)
            {
                if (!flag)
                {
                    break label0;
                }
                bs.a(this, ah);
            }
            return;
        }
        ah.run();
    }

    private boolean a(float f1)
    {
        boolean flag1 = true;
        boolean flag3 = false;
        boolean flag2 = false;
        float f2 = F;
        F = f1;
        float f3 = (float)getScrollX() + (f2 - f1);
        int i1 = g();
        f1 = (float)i1 * s;
        f2 = i1;
        float f4 = t;
        Object obj = (cy)e.get(0);
        cy cy1 = (cy)e.get(e.size() - 1);
        boolean flag;
        int j1;
        if (((cy) (obj)).b != 0)
        {
            f1 = ((cy) (obj)).e * (float)i1;
            flag = false;
        } else
        {
            flag = true;
        }
        j1 = cy1.b;
        obj = h;
        if (j1 != 1)
        {
            f2 = cy1.e * (float)i1;
            flag1 = false;
        } else
        {
            f2 *= f4;
        }
        if (f3 >= f1) goto _L2; else goto _L1
_L1:
        f2 = f1;
        if (flag)
        {
            flag2 = Q.a(Math.abs(f1 - f3) / (float)i1);
            f2 = f1;
        }
_L4:
        F = F + (f2 - (float)(int)f2);
        scrollTo((int)f2, getScrollY());
        f((int)f2);
        return flag2;
_L2:
        if (f3 > f2)
        {
            flag2 = flag3;
            if (flag1)
            {
                flag2 = R.a(Math.abs(f3 - f2) / (float)i1);
            }
        } else
        {
            f2 = f3;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean a(View view, boolean flag, int i1, int j1, int k1)
    {
        if (!(view instanceof ViewGroup)) goto _L2; else goto _L1
_L1:
        ViewGroup viewgroup;
        int l1;
        int i2;
        int j2;
        viewgroup = (ViewGroup)view;
        i2 = view.getScrollX();
        j2 = view.getScrollY();
        l1 = viewgroup.getChildCount() - 1;
_L8:
        if (l1 < 0) goto _L2; else goto _L3
_L3:
        View view1 = viewgroup.getChildAt(l1);
        if (j1 + i2 < view1.getLeft() || j1 + i2 >= view1.getRight() || k1 + j2 < view1.getTop() || k1 + j2 >= view1.getBottom() || !a(view1, true, i1, (j1 + i2) - view1.getLeft(), (k1 + j2) - view1.getTop())) goto _L5; else goto _L4
_L4:
        return true;
_L5:
        l1--;
        continue; /* Loop/switch isn't completed */
_L2:
        if (flag && bs.a(view, -i1)) goto _L4; else goto _L6
_L6:
        return false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static be b(ViewPager viewpager)
    {
        return viewpager.h;
    }

    private cy b(View view)
    {
        do
        {
            ViewParent viewparent = view.getParent();
            if (viewparent != this)
            {
                if (viewparent == null || !(viewparent instanceof View))
                {
                    return null;
                }
                view = (View)viewparent;
            } else
            {
                return a(view);
            }
        } while (true);
    }

    private void b(int i1)
    {
        boolean flag1 = false;
        if (ai != i1)
        {
            ai = i1;
            if (ad != null)
            {
                boolean flag;
                int k1;
                int i2;
                if (i1 != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                i2 = getChildCount();
                k1 = 0;
                while (k1 < i2) 
                {
                    byte byte0;
                    if (flag)
                    {
                        byte0 = 2;
                    } else
                    {
                        byte0 = 0;
                    }
                    bs.a(getChildAt(k1), byte0, null);
                    k1++;
                }
            }
            if (aa != null)
            {
                aa.b(i1);
            }
            if (W != null)
            {
                int l1 = W.size();
                for (int j1 = ((flag1) ? 1 : 0); j1 < l1; j1++)
                {
                    db db1 = (db)W.get(j1);
                    if (db1 != null)
                    {
                        db1.b(i1);
                    }
                }

            }
            if (ab != null)
            {
                ab.b(i1);
                return;
            }
        }
    }

    private void b(boolean flag)
    {
        if (x != flag)
        {
            x = flag;
        }
    }

    static int c(ViewPager viewpager)
    {
        return viewpager.i;
    }

    private void c(int i1)
    {
        y = false;
        a(i1, true, false);
    }

    private void d(int i1)
    {
        float f1;
        float f5;
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        int j1;
        byte byte1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        if (i != i1)
        {
            byte byte0;
            if (i < i1)
            {
                byte0 = 66;
            } else
            {
                byte0 = 17;
            }
            obj1 = e(i);
            i = i1;
            byte1 = byte0;
        } else
        {
            obj1 = null;
            byte1 = 2;
        }
        if (h != null) goto _L2; else goto _L1
_L1:
        h();
_L4:
        return;
_L2:
        if (y)
        {
            h();
            return;
        }
        if (getWindowToken() == null) goto _L4; else goto _L3
_L3:
        be be1 = h;
        i1 = z;
        i3 = Math.max(0, i - i1);
        be1 = h;
        l2 = Math.min(1, i1 + i);
        if (2 != b)
        {
            String s1;
            try
            {
                s1 = getResources().getResourceName(getId());
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception)
            {
                notfoundexception = Integer.toHexString(getId());
            }
            throw new IllegalStateException((new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ")).append(b).append(", found: 2 Pager id: ").append(s1).append(" Pager class: ").append(getClass()).append(" Problematic adapter: ").append(h.getClass()).toString());
        }
        i1 = 0;
_L14:
        if (i1 >= e.size())
        {
            break MISSING_BLOCK_LABEL_1239;
        }
        obj = (cy)e.get(i1);
        if (((cy) (obj)).b < i) goto _L6; else goto _L5
_L5:
        if (((cy) (obj)).b != i)
        {
            break MISSING_BLOCK_LABEL_1239;
        }
_L21:
        if (obj == null)
        {
            obj2 = a(i, i1);
        } else
        {
            obj2 = obj;
        }
        if (obj2 == null) goto _L8; else goto _L7
_L7:
        k2 = i1 - 1;
        float f3;
        if (k2 >= 0)
        {
            obj = (cy)e.get(k2);
        } else
        {
            obj = null;
        }
        j3 = g();
        if (j3 <= 0)
        {
            f3 = 0.0F;
        } else
        {
            f3 = (2.0F - ((cy) (obj2)).d) + (float)getPaddingLeft() / (float)j3;
        }
        j1 = i;
        f5 = 0.0F;
        j2 = j1 - 1;
        i2 = i1;
        obj3 = obj;
        if (j2 < 0) goto _L10; else goto _L9
_L9:
        if (f5 < f3 || j2 >= i3) goto _L12; else goto _L11
_L11:
        if (obj3 == null) goto _L10; else goto _L13
_L13:
        obj = obj3;
        i1 = k2;
        f1 = f5;
        j1 = i2;
        if (j2 == ((cy) (obj3)).b)
        {
            obj = obj3;
            i1 = k2;
            f1 = f5;
            j1 = i2;
            if (!((cy) (obj3)).c)
            {
                e.remove(k2);
                h.a(j2, ((cy) (obj3)).a);
                i1 = k2 - 1;
                j1 = i2 - 1;
                if (i1 >= 0)
                {
                    obj = (cy)e.get(i1);
                    f1 = f5;
                } else
                {
                    obj = null;
                    f1 = f5;
                }
            }
        }
_L15:
        j2--;
        obj3 = obj;
        k2 = i1;
        f5 = f1;
        i2 = j1;
        break MISSING_BLOCK_LABEL_351;
_L6:
        i1++;
          goto _L14
_L12:
        if (obj3 != null && j2 == ((cy) (obj3)).b)
        {
            f1 = f5 + ((cy) (obj3)).d;
            i1 = k2 - 1;
            if (i1 >= 0)
            {
                obj = (cy)e.get(i1);
                j1 = i2;
            } else
            {
                obj = null;
                j1 = i2;
            }
        } else
        {
            f1 = f5 + a(j2, k2 + 1).d;
            j1 = i2 + 1;
            if (k2 >= 0)
            {
                obj = (cy)e.get(k2);
                i1 = k2;
            } else
            {
                obj = null;
                i1 = k2;
            }
        }
          goto _L15
_L10:
label0:
        {
            float f2 = ((cy) (obj2)).d;
            i1 = i2 + 1;
            if (f2 >= 2.0F)
            {
                break label0;
            }
            float f4;
            int k1;
            if (i1 < e.size())
            {
                obj = (cy)e.get(i1);
            } else
            {
                obj = null;
            }
            if (j3 <= 0)
            {
                f4 = 0.0F;
            } else
            {
                f4 = (float)getPaddingRight() / (float)j3 + 2.0F;
            }
            k1 = i;
            k1++;
            do
            {
                if (k1 >= 2)
                {
                    break label0;
                }
                if (f2 >= f4 && k1 > l2)
                {
                    if (obj == null)
                    {
                        break label0;
                    }
                    if (k1 == ((cy) (obj)).b && !((cy) (obj)).c)
                    {
                        e.remove(i1);
                        h.a(k1, ((cy) (obj)).a);
                        if (i1 < e.size())
                        {
                            obj = (cy)e.get(i1);
                        } else
                        {
                            obj = null;
                        }
                    }
                } else
                if (obj != null && k1 == ((cy) (obj)).b)
                {
                    float f6 = ((cy) (obj)).d;
                    i1++;
                    if (i1 < e.size())
                    {
                        obj = (cy)e.get(i1);
                    } else
                    {
                        obj = null;
                    }
                    f2 += f6;
                } else
                {
                    obj = a(k1, i1);
                    i1++;
                    float f7 = ((cy) (obj)).d;
                    if (i1 < e.size())
                    {
                        obj = (cy)e.get(i1);
                    } else
                    {
                        obj = null;
                    }
                    f2 += f7;
                }
                k1++;
            } while (true);
        }
        a(((cy) (obj2)), i2, ((cy) (obj1)));
_L8:
        obj1 = h;
        i1 = i;
        int l1;
        if (obj2 != null)
        {
            obj = ((cy) (obj2)).a;
        } else
        {
            obj = null;
        }
        ((be) (obj1)).a(obj);
        h.a();
        l1 = getChildCount();
        for (i1 = 0; i1 < l1; i1++)
        {
            obj1 = getChildAt(i1);
            obj = (LayoutParams)((View) (obj1)).getLayoutParams();
            obj.f = i1;
            if (((LayoutParams) (obj)).a || ((LayoutParams) (obj)).c != 0.0F)
            {
                continue;
            }
            obj1 = a(((View) (obj1)));
            if (obj1 != null)
            {
                obj.c = ((cy) (obj1)).d;
                obj.e = ((cy) (obj1)).b;
            }
        }

        h();
        if (!hasFocus()) goto _L4; else goto _L16
_L16:
        obj = findFocus();
        if (obj != null)
        {
            obj = b(((View) (obj)));
        } else
        {
            obj = null;
        }
        if (obj != null && ((cy) (obj)).b == i) goto _L4; else goto _L17
_L17:
        i1 = 0;
_L20:
        if (i1 >= getChildCount()) goto _L4; else goto _L18
_L18:
        obj = getChildAt(i1);
        obj1 = a(((View) (obj)));
        if (obj1 != null && ((cy) (obj1)).b == i && ((View) (obj)).requestFocus(byte1)) goto _L4; else goto _L19
_L19:
        i1++;
          goto _L20
        obj = null;
          goto _L21
    }

    private cy e(int i1)
    {
        for (int j1 = 0; j1 < e.size(); j1++)
        {
            cy cy1 = (cy)e.get(j1);
            if (cy1.b == i1)
            {
                return cy1;
            }
        }

        return null;
    }

    static int[] e()
    {
        return a;
    }

    private void f()
    {
        setWillNotDraw(false);
        setDescendantFocusability(0x40000);
        setFocusable(true);
        Context context = getContext();
        m = new Scroller(context, d);
        ViewConfiguration viewconfiguration = ViewConfiguration.get(context);
        float f1 = context.getResources().getDisplayMetrics().density;
        E = ch.a(viewconfiguration);
        L = (int)(400F * f1);
        M = viewconfiguration.getScaledMaximumFlingVelocity();
        Q = new y(context);
        R = new y(context);
        N = (int)(25F * f1);
        O = (int)(2.0F * f1);
        C = (int)(16F * f1);
        bs.a(this, new cz(this));
        if (bs.c(this) == 0)
        {
            bs.c(this, 1);
        }
    }

    private boolean f(int i1)
    {
        boolean flag = false;
        if (e.size() == 0)
        {
            U = false;
            a(0, 0.0F);
            if (!U)
            {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
        } else
        {
            cy cy1 = j();
            int j1 = g();
            int k1 = o;
            float f1 = (float)o / (float)j1;
            k1 = cy1.b;
            f1 = ((float)i1 / (float)j1 - cy1.e) / (cy1.d + f1);
            U = false;
            a(k1, f1);
            if (!U)
            {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
            flag = true;
        }
        return flag;
    }

    private int g()
    {
        return getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
    }

    private void g(int i1)
    {
        if (aa != null)
        {
            aa.a(i1);
        }
        if (W != null)
        {
            int k1 = W.size();
            for (int j1 = 0; j1 < k1; j1++)
            {
                db db1 = (db)W.get(j1);
                if (db1 != null)
                {
                    db1.a(i1);
                }
            }

        }
        if (ab != null)
        {
            ab.a(i1);
        }
    }

    private void h()
    {
        if (ae != 0)
        {
            int j1;
            if (af == null)
            {
                af = new ArrayList();
            } else
            {
                af.clear();
            }
            j1 = getChildCount();
            for (int i1 = 0; i1 < j1; i1++)
            {
                View view = getChildAt(i1);
                af.add(view);
            }

            Collections.sort(af, ag);
        }
    }

    private boolean h(int i1)
    {
        View view;
        boolean flag;
        flag = false;
        view = findFocus();
        if (view != this) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L13:
        view = FocusFinder.getInstance().findNextFocus(this, ((View) (obj)), i1);
        if (view == null || view == obj) goto _L4; else goto _L3
_L3:
        if (i1 != 17) goto _L6; else goto _L5
_L5:
        int j1;
        j1 = a(g, view).left;
        int k1 = a(g, ((View) (obj))).left;
        StringBuilder stringbuilder;
        if (obj != null && j1 >= k1)
        {
            flag = l();
        } else
        {
            flag = view.requestFocus();
        }
_L15:
        if (flag)
        {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i1));
        }
        return flag;
_L2:
        if (view == null) goto _L8; else goto _L7
_L7:
        obj = view.getParent();
_L12:
        if (!(obj instanceof ViewGroup))
        {
            break MISSING_BLOCK_LABEL_380;
        }
        if (obj != this) goto _L10; else goto _L9
_L9:
        j1 = 1;
_L20:
        if (j1 != 0) goto _L8; else goto _L11
_L10:
        obj = ((ViewParent) (obj)).getParent();
          goto _L12
_L11:
        stringbuilder = new StringBuilder();
        stringbuilder.append(view.getClass().getSimpleName());
        for (obj = view.getParent(); obj instanceof ViewGroup; obj = ((ViewParent) (obj)).getParent())
        {
            stringbuilder.append(" => ").append(obj.getClass().getSimpleName());
        }

        Log.e("ViewPager", (new StringBuilder("arrowScroll tried to find focus based on non-child current focused view ")).append(stringbuilder.toString()).toString());
        obj = null;
          goto _L13
_L6:
        if (i1 != 66) goto _L15; else goto _L14
_L14:
        int l1;
        j1 = a(g, view).left;
        l1 = a(g, ((View) (obj))).left;
        if (obj != null && j1 <= l1) goto _L17; else goto _L16
_L16:
        flag = view.requestFocus();
          goto _L15
_L4:
        if (i1 != 17 && i1 != 1) goto _L19; else goto _L18
_L18:
        flag = l();
          goto _L15
_L19:
        if (i1 != 66 && i1 != 2) goto _L15; else goto _L17
_L17:
label0:
        {
            if (h == null)
            {
                break label0;
            }
            j1 = i;
            obj = h;
            if (j1 > 0)
            {
                break label0;
            }
            c(i + 1);
            flag = true;
        }
          goto _L15
        flag = false;
          goto _L15
_L8:
        obj = view;
          goto _L13
        j1 = 0;
          goto _L20
    }

    private void i()
    {
        ViewParent viewparent = getParent();
        if (viewparent != null)
        {
            viewparent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private cy j()
    {
        int i1 = g();
        float f1;
        float f2;
        float f3;
        float f4;
        cy cy2;
        boolean flag;
        int j1;
        if (i1 > 0)
        {
            f1 = (float)getScrollX() / (float)i1;
        } else
        {
            f1 = 0.0F;
        }
        if (i1 > 0)
        {
            f2 = (float)o / (float)i1;
        } else
        {
            f2 = 0.0F;
        }
        f4 = 0.0F;
        f3 = 0.0F;
        j1 = -1;
        i1 = 0;
        flag = true;
        cy2 = null;
        do
        {
            cy cy1;
label0:
            {
                Object obj;
label1:
                {
                    obj = cy2;
                    if (i1 >= e.size())
                    {
                        break label1;
                    }
                    cy1 = (cy)e.get(i1);
                    if (!flag && cy1.b != j1 + 1)
                    {
                        cy1 = f;
                        cy1.e = f4 + f3 + f2;
                        cy1.b = j1 + 1;
                        obj = h;
                        j1 = cy1.b;
                        cy1.d = 1.0F;
                        i1--;
                    }
                    f3 = cy1.e;
                    f4 = cy1.d;
                    if (!flag)
                    {
                        obj = cy2;
                        if (f1 < f3)
                        {
                            break label1;
                        }
                    }
                    if (f1 >= f4 + f3 + f2 && i1 != e.size() - 1)
                    {
                        break label0;
                    }
                    obj = cy1;
                }
                return ((cy) (obj));
            }
            j1 = cy1.b;
            f4 = cy1.d;
            flag = false;
            i1++;
            cy2 = cy1;
        } while (true);
    }

    private void k()
    {
        A = false;
        B = false;
        if (K != null)
        {
            K.recycle();
            K = null;
        }
    }

    private boolean l()
    {
        if (i > 0)
        {
            c(i - 1);
            return true;
        } else
        {
            return false;
        }
    }

    public final be a()
    {
        return h;
    }

    public final void a(int i1)
    {
        y = false;
        boolean flag;
        if (!S)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(i1, flag, false);
    }

    public final void a(be be1)
    {
        if (h != null)
        {
            h.b(n);
            be be2 = h;
            for (int i1 = 0; i1 < e.size(); i1++)
            {
                cy cy1 = (cy)e.get(i1);
                h.a(cy1.b, cy1.a);
            }

            h.a();
            e.clear();
            int k1;
            for (int j1 = 0; j1 < getChildCount(); j1 = k1 + 1)
            {
                k1 = j1;
                if (!((LayoutParams)getChildAt(j1).getLayoutParams()).a)
                {
                    removeViewAt(j1);
                    k1 = j1 - 1;
                }
            }

            i = 0;
            scrollTo(0, 0);
        }
        be be3 = h;
        h = be1;
        b = 0;
        if (h != null)
        {
            if (n == null)
            {
                n = new dd(this, (byte)0);
            }
            h.a(n);
            y = false;
            boolean flag = S;
            S = true;
            be be4 = h;
            b = 2;
            if (j >= 0)
            {
                h.a(k, l);
                a(j, false, true);
                j = -1;
                k = null;
                l = null;
            } else
            if (!flag)
            {
                d();
            } else
            {
                requestLayout();
            }
        }
        if (ac != null && be3 != be1)
        {
            ac.a(be3, be1);
        }
    }

    final void a(da da1)
    {
        ac = da1;
    }

    public final void a(db db1)
    {
        aa = db1;
    }

    public void addFocusables(ArrayList arraylist, int i1, int j1)
    {
        int l1 = arraylist.size();
        int i2 = getDescendantFocusability();
        if (i2 != 0x60000)
        {
            for (int k1 = 0; k1 < getChildCount(); k1++)
            {
                View view = getChildAt(k1);
                if (view.getVisibility() == 0)
                {
                    cy cy1 = a(view);
                    if (cy1 != null && cy1.b == i)
                    {
                        view.addFocusables(arraylist, i1, j1);
                    }
                }
            }

        }
        while (i2 == 0x40000 && l1 != arraylist.size() || !isFocusable() || (j1 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode() || arraylist == null) 
        {
            return;
        }
        arraylist.add(this);
    }

    public void addTouchables(ArrayList arraylist)
    {
        for (int i1 = 0; i1 < getChildCount(); i1++)
        {
            View view = getChildAt(i1);
            if (view.getVisibility() != 0)
            {
                continue;
            }
            cy cy1 = a(view);
            if (cy1 != null && cy1.b == i)
            {
                view.addTouchables(arraylist);
            }
        }

    }

    public void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (!checkLayoutParams(layoutparams))
        {
            layoutparams = generateLayoutParams(layoutparams);
        }
        LayoutParams layoutparams1 = (LayoutParams)layoutparams;
        layoutparams1.a = layoutparams1.a | (view instanceof cx);
        if (w)
        {
            if (layoutparams1 != null && layoutparams1.a)
            {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            } else
            {
                layoutparams1.d = true;
                addViewInLayout(view, i1, layoutparams);
                return;
            }
        } else
        {
            super.addView(view, i1, layoutparams);
            return;
        }
    }

    public final int b()
    {
        return i;
    }

    final db b(db db1)
    {
        db db2 = ab;
        ab = db1;
        return db2;
    }

    final void c()
    {
        be be1 = h;
        b = 2;
        boolean flag;
        int l1;
        if (e.size() < z * 2 + 1 && e.size() < 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l1 = i;
        for (int j1 = 0; j1 < e.size(); j1++)
        {
            Object obj = (cy)e.get(j1);
            be be2 = h;
            obj = ((cy) (obj)).a;
        }

        Collections.sort(e, c);
        if (flag)
        {
            int k1 = getChildCount();
            for (int i1 = 0; i1 < k1; i1++)
            {
                LayoutParams layoutparams = (LayoutParams)getChildAt(i1).getLayoutParams();
                if (!layoutparams.a)
                {
                    layoutparams.c = 0.0F;
                }
            }

            a(l1, false, true);
            requestLayout();
        }
    }

    public boolean canScrollHorizontally(int i1)
    {
        if (h != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j1;
        int k1;
        j1 = g();
        k1 = getScrollX();
        if (i1 >= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (k1 <= (int)((float)j1 * s)) goto _L1; else goto _L3
_L3:
        return true;
        if (i1 <= 0 || k1 >= (int)((float)j1 * t)) goto _L1; else goto _L4
_L4:
        return true;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
    }

    public void computeScroll()
    {
        if (!m.isFinished() && m.computeScrollOffset())
        {
            int i1 = getScrollX();
            int j1 = getScrollY();
            int k1 = m.getCurrX();
            int l1 = m.getCurrY();
            if (i1 != k1 || j1 != l1)
            {
                scrollTo(k1, l1);
                if (!f(k1))
                {
                    m.abortAnimation();
                    scrollTo(0, l1);
                }
            }
            bs.b(this);
            return;
        } else
        {
            a(true);
            return;
        }
    }

    final void d()
    {
        d(i);
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        boolean flag1 = false;
        if (super.dispatchKeyEvent(keyevent)) goto _L2; else goto _L1
_L1:
        if (keyevent.getAction() != 0) goto _L4; else goto _L3
_L3:
        keyevent.getKeyCode();
        JVM INSTR lookupswitch 3: default 56
    //                   21: 66
    //                   22: 76
    //                   61: 86;
           goto _L4 _L5 _L6 _L7
_L4:
        boolean flag = false;
_L9:
        if (!flag) goto _L8; else goto _L2
_L2:
        flag1 = true;
_L8:
        return flag1;
_L5:
        flag = h(17);
          goto _L9
_L6:
        flag = h(66);
          goto _L9
_L7:
        if (android.os.Build.VERSION.SDK_INT < 11) goto _L4; else goto _L10
_L10:
        if (!android.support.v4.view.u.b(keyevent))
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = h(2);
          goto _L9
        if (!android.support.v4.view.u.a(keyevent)) goto _L4; else goto _L11
_L11:
        flag = h(1);
          goto _L9
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        boolean flag1 = false;
        if (accessibilityevent.getEventType() != 4096) goto _L2; else goto _L1
_L1:
        boolean flag = super.dispatchPopulateAccessibilityEvent(accessibilityevent);
_L4:
        return flag;
_L2:
        int j1 = getChildCount();
        int i1 = 0;
        do
        {
            flag = flag1;
            if (i1 >= j1)
            {
                continue;
            }
            View view = getChildAt(i1);
            if (view.getVisibility() == 0)
            {
                cy cy1 = a(view);
                if (cy1 != null && cy1.b == i && view.dispatchPopulateAccessibilityEvent(accessibilityevent))
                {
                    return true;
                }
            }
            i1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void draw(Canvas canvas)
    {
        int i1;
        int j1;
        int k1;
        super.draw(canvas);
        j1 = 0;
        i1 = 0;
        k1 = bs.a(this);
        if (k1 == 0) goto _L2; else goto _L1
_L1:
        if (k1 != 1 || h == null) goto _L4; else goto _L3
_L3:
        be be1 = h;
_L2:
        if (!Q.a())
        {
            j1 = canvas.save();
            i1 = getHeight() - getPaddingTop() - getPaddingBottom();
            int l1 = getWidth();
            canvas.rotate(270F);
            canvas.translate(-i1 + getPaddingTop(), s * (float)l1);
            Q.a(i1, l1);
            i1 = Q.a(canvas) | false;
            canvas.restoreToCount(j1);
        }
        j1 = i1;
        if (!R.a())
        {
            int i2 = canvas.save();
            j1 = getWidth();
            int j2 = getHeight();
            int k2 = getPaddingTop();
            int l2 = getPaddingBottom();
            canvas.rotate(90F);
            canvas.translate(-getPaddingTop(), -(t + 1.0F) * (float)j1);
            R.a(j2 - k2 - l2, j1);
            j1 = i1 | R.a(canvas);
            canvas.restoreToCount(i2);
        }
_L6:
        if (j1 != 0)
        {
            bs.b(this);
        }
        return;
_L4:
        Q.b();
        R.b();
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        Drawable drawable = p;
        if (drawable != null && drawable.isStateful())
        {
            drawable.setState(getDrawableState());
        }
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return generateDefaultLayoutParams();
    }

    protected int getChildDrawingOrder(int i1, int j1)
    {
        int k1 = j1;
        if (ae == 2)
        {
            k1 = i1 - 1 - j1;
        }
        return ((LayoutParams)((View)af.get(k1)).getLayoutParams()).f;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        S = true;
    }

    protected void onDetachedFromWindow()
    {
        removeCallbacks(ah);
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (o > 0 && p != null && e.size() > 0 && h != null)
        {
            int k1 = getScrollX();
            int l1 = getWidth();
            float f3 = (float)o / (float)l1;
            Object obj = (cy)e.get(0);
            float f1 = ((cy) (obj)).e;
            int i2 = e.size();
            int i1 = ((cy) (obj)).b;
            int j2 = ((cy)e.get(i2 - 1)).b;
            int j1 = 0;
            do
            {
                if (i1 >= j2)
                {
                    break;
                }
                for (; i1 > ((cy) (obj)).b && j1 < i2; obj = (cy)((ArrayList) (obj)).get(j1))
                {
                    obj = e;
                    j1++;
                }

                float f2;
                if (i1 == ((cy) (obj)).b)
                {
                    f2 = (((cy) (obj)).e + ((cy) (obj)).d) * (float)l1;
                    f1 = ((cy) (obj)).e + ((cy) (obj)).d + f3;
                } else
                {
                    be be1 = h;
                    f2 = (1.0F + f1) * (float)l1;
                    f1 += 1.0F + f3;
                }
                if ((float)o + f2 > (float)k1)
                {
                    p.setBounds((int)f2, q, (int)((float)o + f2 + 0.5F), r);
                    p.draw(canvas);
                }
                if (f2 > (float)(k1 + l1))
                {
                    break;
                }
                i1++;
            } while (true);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1 = motionevent.getAction() & 0xff;
        if (i1 != 3 && i1 != 1) goto _L2; else goto _L1
_L1:
        A = false;
        B = false;
        J = -1;
        if (K != null)
        {
            K.recycle();
            K = null;
        }
_L4:
        return false;
_L2:
        if (i1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (A)
        {
            return true;
        }
        if (B) goto _L4; else goto _L3
_L3:
        i1;
        JVM INSTR lookupswitch 3: default 116
    //                   0: 427
    //                   2: 143
    //                   6: 558;
           goto _L5 _L6 _L7 _L8
_L5:
        if (K == null)
        {
            K = VelocityTracker.obtain();
        }
        K.addMovement(motionevent);
        return A;
_L7:
        float f1;
        float f3;
        float f4;
        float f5;
        float f6;
        int j1 = J;
        if (j1 == -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        j1 = at.a(motionevent, j1);
        f3 = at.c(motionevent, j1);
        f1 = f3 - F;
        f5 = Math.abs(f1);
        f4 = at.d(motionevent, j1);
        f6 = Math.abs(f4 - I);
        if (f1 != 0.0F)
        {
            float f7 = F;
            boolean flag;
            if (f7 < (float)D && f1 > 0.0F || f7 > (float)(getWidth() - D) && f1 < 0.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag && a(this, false, (int)f1, (int)f3, (int)f4))
            {
                F = f3;
                G = f4;
                B = true;
                return false;
            }
        }
        if (f5 <= (float)E || 0.5F * f5 <= f6) goto _L10; else goto _L9
_L9:
        A = true;
        i();
        b(1);
        if (f1 > 0.0F)
        {
            f1 = H + (float)E;
        } else
        {
            f1 = H - (float)E;
        }
        F = f1;
        G = f4;
        b(true);
_L11:
        if (A && a(f3))
        {
            bs.b(this);
        }
        continue; /* Loop/switch isn't completed */
_L10:
        if (f6 > (float)E)
        {
            B = true;
        }
        if (true) goto _L11; else goto _L6
_L6:
        float f2 = motionevent.getX();
        H = f2;
        F = f2;
        f2 = motionevent.getY();
        I = f2;
        G = f2;
        J = at.b(motionevent, 0);
        B = false;
        m.computeScrollOffset();
        if (ai == 2 && Math.abs(m.getFinalX() - m.getCurrX()) > O)
        {
            m.abortAnimation();
            y = false;
            d();
            A = true;
            i();
            b(1);
        } else
        {
            a(false);
            A = false;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        a(motionevent);
        if (true) goto _L5; else goto _L12
_L12:
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int i2;
        int j2;
        int j3;
        int l4;
        int i5;
        int j5;
        int k5;
        l4 = getChildCount();
        j5 = k1 - i1;
        i5 = l1 - j1;
        j1 = getPaddingLeft();
        i1 = getPaddingTop();
        i2 = getPaddingRight();
        k1 = getPaddingBottom();
        k5 = getScrollX();
        j2 = 0;
        j3 = 0;
_L14:
        if (j3 >= l4) goto _L2; else goto _L1
_L1:
        View view = getChildAt(j3);
        if (view.getVisibility() == 8) goto _L4; else goto _L3
_L3:
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (!layoutparams.a) goto _L4; else goto _L5
_L5:
        int l5;
        l1 = layoutparams.b;
        l5 = layoutparams.b;
        l1 & 7;
        JVM INSTR tableswitch 1 5: default 148
    //                   1 304
    //                   2 148
    //                   3 285
    //                   4 148
    //                   5 326;
           goto _L6 _L7 _L6 _L8 _L6 _L9
_L6:
        int k2;
        l1 = j1;
        k2 = j1;
_L15:
        l5 & 0x70;
        JVM INSTR lookupswitch 3: default 192
    //                   16: 394
    //                   48: 367
    //                   80: 422;
           goto _L10 _L11 _L12 _L13
_L10:
        int k3 = i1;
        j1 = i1;
        i1 = k1;
        k1 = k3;
_L16:
        l1 += k5;
        view.layout(l1, k1, view.getMeasuredWidth() + l1, view.getMeasuredHeight() + k1);
        j2++;
        l1 = i2;
        k1 = k2;
        i2 = i1;
        i1 = j2;
_L17:
        j3++;
        k2 = k1;
        j2 = i1;
        i1 = j1;
        k1 = i2;
        i2 = l1;
        j1 = k2;
          goto _L14
_L8:
        k2 = view.getMeasuredWidth();
        l1 = j1;
        k2 += j1;
          goto _L15
_L7:
        l1 = Math.max((j5 - view.getMeasuredWidth()) / 2, j1);
        k2 = j1;
          goto _L15
_L9:
        k2 = view.getMeasuredWidth();
        l1 = i2 + view.getMeasuredWidth();
        int l3 = j5 - i2 - k2;
        i2 = l1;
        k2 = j1;
        l1 = l3;
          goto _L15
_L12:
        int i4 = view.getMeasuredHeight();
        j1 = k1;
        i4 += i1;
        k1 = i1;
        i1 = j1;
        j1 = i4;
          goto _L16
_L11:
        int j4 = Math.max((i5 - view.getMeasuredHeight()) / 2, i1);
        j1 = i1;
        i1 = k1;
        k1 = j4;
          goto _L16
_L13:
        int k4 = i5 - k1 - view.getMeasuredHeight();
        int i6 = view.getMeasuredHeight();
        j1 = i1;
        i1 = k1 + i6;
        k1 = k4;
          goto _L16
_L2:
        i2 = j5 - j1 - i2;
        for (l1 = 0; l1 < l4; l1++)
        {
            View view1 = getChildAt(l1);
            if (view1.getVisibility() == 8)
            {
                continue;
            }
            LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
            if (layoutparams1.a)
            {
                continue;
            }
            cy cy1 = a(view1);
            if (cy1 == null)
            {
                continue;
            }
            float f1 = i2;
            int l2 = (int)(cy1.e * f1) + j1;
            if (layoutparams1.d)
            {
                layoutparams1.d = false;
                float f2 = i2;
                view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)(layoutparams1.c * f2), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(i5 - i1 - k1, 0x40000000));
            }
            view1.layout(l2, i1, view1.getMeasuredWidth() + l2, view1.getMeasuredHeight() + i1);
        }

        q = i1;
        r = i5 - k1;
        V = j2;
        if (S)
        {
            a(i, false, 0, false);
        }
        S = false;
        return;
_L4:
        l1 = j2;
        j2 = i1;
        int i3 = j1;
        i1 = l1;
        l1 = i2;
        i2 = k1;
        j1 = j2;
        k1 = i3;
          goto _L17
    }

    protected void onMeasure(int i1, int j1)
    {
label0:
        {
            setMeasuredDimension(getDefaultSize(0, i1), getDefaultSize(0, j1));
            i1 = getMeasuredWidth();
            D = Math.min(i1 / 10, C);
            i1 = i1 - getPaddingLeft() - getPaddingRight();
            j1 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
            int j3 = getChildCount();
            int i2 = 0;
            while (i2 < j3) 
            {
label1:
                {
                    {
                        View view = getChildAt(i2);
                        int k1 = i1;
                        int l1 = j1;
                        if (view.getVisibility() == 8)
                        {
                            break label1;
                        }
                        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                        k1 = i1;
                        l1 = j1;
                        if (layoutparams == null)
                        {
                            break label1;
                        }
                        k1 = i1;
                        l1 = j1;
                        if (!layoutparams.a)
                        {
                            break label1;
                        }
                        k1 = layoutparams.b & 7;
                        int j2 = layoutparams.b & 0x70;
                        int k2 = 0x80000000;
                        l1 = 0x80000000;
                        boolean flag;
                        boolean flag1;
                        if (j2 == 48 || j2 == 80)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if (k1 == 3 || k1 == 5)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        if (flag)
                        {
                            k1 = 0x40000000;
                        } else
                        {
                            k1 = k2;
                            if (flag1)
                            {
                                l1 = 0x40000000;
                                k1 = k2;
                            }
                        }
                        if (layoutparams.width != -2)
                        {
                            k2 = 0x40000000;
                            float f1;
                            int l2;
                            int i3;
                            if (layoutparams.width != -1)
                            {
                                k1 = layoutparams.width;
                            } else
                            {
                                k1 = i1;
                            }
                        } else
                        {
                            k2 = k1;
                            k1 = i1;
                        }
                        if (layoutparams.height == -2)
                        {
                            break label0;
                        }
                        l2 = 0x40000000;
                        l1 = l2;
                        if (layoutparams.height == -1)
                        {
                            break label0;
                        }
                        i3 = layoutparams.height;
                        l1 = l2;
                        l2 = i3;
                    }
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(k1, k2), android.view.View.MeasureSpec.makeMeasureSpec(l2, l1));
                    if (flag)
                    {
                        l1 = j1 - view.getMeasuredHeight();
                        k1 = i1;
                    } else
                    {
                        k1 = i1;
                        l1 = j1;
                        if (flag1)
                        {
                            k1 = i1 - view.getMeasuredWidth();
                            l1 = j1;
                        }
                    }
                }
                i2++;
                i1 = k1;
                j1 = l1;
            }
            u = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
            v = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000);
            w = true;
            d();
            w = false;
            k1 = getChildCount();
            for (j1 = 0; j1 < k1; j1++)
            {
                view = getChildAt(j1);
                if (view.getVisibility() == 8)
                {
                    continue;
                }
                layoutparams = (LayoutParams)view.getLayoutParams();
                if (layoutparams == null || !layoutparams.a)
                {
                    f1 = i1;
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)(layoutparams.c * f1), 0x40000000), v);
                }
            }

            return;
        }
        l2 = j1;
        break MISSING_BLOCK_LABEL_282;
    }

    protected boolean onRequestFocusInDescendants(int i1, Rect rect)
    {
        byte byte0 = -1;
        int k1 = getChildCount();
        int j1;
        if ((i1 & 2) != 0)
        {
            byte0 = 1;
            j1 = 0;
        } else
        {
            j1 = k1 - 1;
            k1 = -1;
        }
        for (; j1 != k1; j1 += byte0)
        {
            View view = getChildAt(j1);
            if (view.getVisibility() != 0)
            {
                continue;
            }
            cy cy1 = a(view);
            if (cy1 != null && cy1.b == i && view.requestFocus(i1, rect))
            {
                return true;
            }
        }

        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (!(parcelable instanceof SavedState))
        {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (h != null)
        {
            h.a(((SavedState) (parcelable)).b, ((SavedState) (parcelable)).c);
            a(((SavedState) (parcelable)).a, false, true);
            return;
        } else
        {
            j = ((SavedState) (parcelable)).a;
            k = ((SavedState) (parcelable)).b;
            l = ((SavedState) (parcelable)).c;
            return;
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = i;
        if (h != null)
        {
            savedstate.b = h.b();
        }
        return savedstate;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (i1 != k1)
        {
            j1 = o;
            l1 = o;
            if (k1 > 0 && !e.isEmpty())
            {
                int i2 = getPaddingLeft();
                int j2 = getPaddingRight();
                int k2 = getPaddingLeft();
                int l2 = getPaddingRight();
                float f1 = (float)getScrollX() / (float)(l1 + (k1 - k2 - l2));
                j1 = (int)((float)(j1 + (i1 - i2 - j2)) * f1);
                scrollTo(j1, getScrollY());
                if (!m.isFinished())
                {
                    k1 = m.getDuration();
                    l1 = m.timePassed();
                    cy cy1 = e(i);
                    m.startScroll(j1, 0, (int)(cy1.e * (float)i1), 0, k1 - l1);
                }
            } else
            {
                cy cy2 = e(i);
                float f2;
                if (cy2 != null)
                {
                    f2 = Math.min(cy2.e, t);
                } else
                {
                    f2 = 0.0F;
                }
                i1 = (int)(f2 * (float)(i1 - getPaddingLeft() - getPaddingRight()));
                if (i1 != getScrollX())
                {
                    a(false);
                    scrollTo(i1, getScrollY());
                    return;
                }
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int j1;
        j1 = 0;
        if (P)
        {
            return true;
        }
        if (motionevent.getAction() == 0 && motionevent.getEdgeFlags() != 0)
        {
            return false;
        }
        if (h == null) goto _L2; else goto _L1
_L1:
        int i1;
        be be1 = h;
        if (K == null)
        {
            K = VelocityTracker.obtain();
        }
        K.addMovement(motionevent);
        i1 = j1;
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 6: default 116
    //                   0 133
    //                   1 385
    //                   2 195
    //                   3 669
    //                   4 120
    //                   5 720
    //                   6 753;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L8:
        break; /* Loop/switch isn't completed */
_L3:
        i1 = j1;
_L12:
        if (i1 != 0)
        {
            bs.b(this);
        }
        return true;
_L2:
        return false;
_L4:
        m.abortAnimation();
        y = false;
        d();
        float f1 = motionevent.getX();
        H = f1;
        F = f1;
        f1 = motionevent.getY();
        I = f1;
        G = f1;
        J = at.b(motionevent, 0);
        i1 = j1;
        continue; /* Loop/switch isn't completed */
_L6:
        if (!A)
        {
            i1 = android.support.v4.view.at.a(motionevent, J);
            float f2 = at.c(motionevent, i1);
            float f6 = Math.abs(f2 - F);
            float f4 = at.d(motionevent, i1);
            float f7 = Math.abs(f4 - G);
            if (f6 > (float)E && f6 > f7)
            {
                A = true;
                i();
                ViewParent viewparent;
                if (f2 - H > 0.0F)
                {
                    f2 = H + (float)E;
                } else
                {
                    f2 = H - (float)E;
                }
                F = f2;
                G = f4;
                b(1);
                b(true);
                viewparent = getParent();
                if (viewparent != null)
                {
                    viewparent.requestDisallowInterceptTouchEvent(true);
                }
            }
        }
        i1 = j1;
        if (A)
        {
            i1 = a(at.c(motionevent, android.support.v4.view.at.a(motionevent, J))) | false;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        i1 = j1;
        if (A)
        {
            Object obj = K;
            ((VelocityTracker) (obj)).computeCurrentVelocity(1000, M);
            int k1 = (int)android.support.v4.view.bo.a(((VelocityTracker) (obj)), J);
            y = true;
            j1 = g();
            int l1 = getScrollX();
            obj = j();
            i1 = ((cy) (obj)).b;
            float f5 = ((float)l1 / (float)j1 - ((cy) (obj)).e) / ((cy) (obj)).d;
            if (Math.abs((int)(at.c(motionevent, android.support.v4.view.at.a(motionevent, J)) - H)) > N && Math.abs(k1) > L)
            {
                if (k1 <= 0)
                {
                    i1++;
                }
            } else
            {
                float f3;
                if (i1 >= i)
                {
                    f3 = 0.4F;
                } else
                {
                    f3 = 0.6F;
                }
                i1 = (int)((float)i1 + f5 + f3);
            }
            j1 = i1;
            if (e.size() > 0)
            {
                motionevent = (cy)e.get(0);
                cy cy1 = (cy)e.get(e.size() - 1);
                j1 = Math.max(((cy) (motionevent)).b, Math.min(i1, cy1.b));
            }
            a(j1, true, true, k1);
            J = -1;
            k();
            i1 = Q.c() | R.c();
        }
        continue; /* Loop/switch isn't completed */
_L7:
        i1 = j1;
        if (A)
        {
            a(i, true, 0, false);
            J = -1;
            k();
            i1 = Q.c() | R.c();
        }
        continue; /* Loop/switch isn't completed */
_L9:
        i1 = at.b(motionevent);
        F = at.c(motionevent, i1);
        J = at.b(motionevent, i1);
        i1 = j1;
        continue; /* Loop/switch isn't completed */
_L10:
        a(motionevent);
        F = at.c(motionevent, android.support.v4.view.at.a(motionevent, J));
        i1 = j1;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public void removeView(View view)
    {
        if (w)
        {
            removeViewInLayout(view);
            return;
        } else
        {
            super.removeView(view);
            return;
        }
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return super.verifyDrawable(drawable) || drawable == p;
    }


    private class LayoutParams extends android.view.ViewGroup.LayoutParams
    {

        public boolean a;
        public int b;
        float c;
        boolean d;
        int e;
        int f;

        public LayoutParams()
        {
            super(-1, -1);
            c = 0.0F;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            c = 0.0F;
            context = context.obtainStyledAttributes(attributeset, ViewPager.e());
            b = context.getInteger(0, 48);
            context.recycle();
        }
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = android.support.v4.c.a.a(new de());
        int a;
        Parcelable b;
        ClassLoader c;

        public String toString()
        {
            return (new StringBuilder("FragmentPager.SavedState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" position=").append(a).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            parcel.writeInt(a);
            parcel.writeParcelable(b, i1);
        }


        SavedState(Parcel parcel, ClassLoader classloader)
        {
            super(parcel);
            ClassLoader classloader1 = classloader;
            if (classloader == null)
            {
                classloader1 = getClass().getClassLoader();
            }
            a = parcel.readInt();
            b = parcel.readParcelable(classloader1);
            c = classloader1;
        }

        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
