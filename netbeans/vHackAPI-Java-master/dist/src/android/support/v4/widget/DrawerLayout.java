// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.view.at;
import android.support.v4.view.bs;
import android.support.v4.view.cn;
import android.support.v4.view.q;
import android.support.v4.view.u;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.v4.widget:
//            x, p, q, n, 
//            t, bn, m, o, 
//            r

public class DrawerLayout extends ViewGroup
    implements x
{

    static final o a;
    private static final int b[] = {
        0x10100b3
    };
    private static final boolean c;
    private CharSequence A;
    private Object B;
    private boolean C;
    private final n d;
    private int e;
    private int f;
    private float g;
    private Paint h;
    private final bn i;
    private final bn j;
    private final t k;
    private final t l;
    private int m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private r t;
    private float u;
    private float v;
    private Drawable w;
    private Drawable x;
    private Drawable y;
    private CharSequence z;

    public DrawerLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        d = new n(this);
        f = 0x99000000;
        h = new Paint();
        o = true;
        setDescendantFocusability(0x40000);
        float f1 = getResources().getDisplayMetrics().density;
        e = (int)(64F * f1 + 0.5F);
        f1 *= 400F;
        k = new t(this, 3);
        l = new t(this, 5);
        i = bn.a(this, 1.0F, k);
        i.a(1);
        i.a(f1);
        k.a(i);
        j = bn.a(this, 1.0F, l);
        j.a(2);
        j.a(f1);
        l.a(j);
        setFocusableInTouchMode(true);
        bs.c(this, 1);
        bs.a(this, new m(this));
        cn.a(this);
        if (bs.q(this))
        {
            a.a(this);
            y = a.a(context);
        }
    }

    static View a(DrawerLayout drawerlayout)
    {
        return drawerlayout.i();
    }

    private void a(int i1, int j1)
    {
        j1 = android.support.v4.view.q.a(j1, bs.e(this));
        if (j1 == 3)
        {
            p = i1;
        } else
        if (j1 == 5)
        {
            q = i1;
        }
        if (i1 != 0)
        {
            bn bn1;
            if (j1 == 3)
            {
                bn1 = i;
            } else
            {
                bn1 = j;
            }
            bn1.e();
        }
        i1;
        JVM INSTR tableswitch 1 2: default 60
    //                   1 98
    //                   2 82;
           goto _L1 _L2 _L3
_L1:
        View view;
        return;
_L3:
        if ((view = b(j1)) != null)
        {
            h(view);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if ((view = b(j1)) != null)
        {
            e(view);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void a(View view, boolean flag)
    {
        int j1 = getChildCount();
        int i1 = 0;
        while (i1 < j1) 
        {
            View view1 = getChildAt(i1);
            if (!flag && !d(view1) || flag && view1 == view)
            {
                bs.c(view1, 1);
            } else
            {
                bs.c(view1, 4);
            }
            i1++;
        }
    }

    private void a(boolean flag)
    {
        int l1 = getChildCount();
        int j1 = 0;
        int i1 = 0;
        while (j1 < l1) 
        {
label0:
            {
                View view = getChildAt(j1);
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                int k1 = i1;
                if (!d(view))
                {
                    break label0;
                }
                if (flag)
                {
                    k1 = i1;
                    if (!layoutparams.c)
                    {
                        break label0;
                    }
                }
                k1 = view.getWidth();
                if (a(view, 3))
                {
                    i1 |= i.a(view, -k1, view.getTop());
                } else
                {
                    i1 |= j.a(view, getWidth(), view.getTop());
                }
                layoutparams.c = false;
                k1 = i1;
            }
            j1++;
            i1 = k1;
        }
        k.a();
        l.a();
        if (i1 != 0)
        {
            invalidate();
        }
    }

    static float b(View view)
    {
        return ((LayoutParams)view.getLayoutParams()).b;
    }

    private static String c(int i1)
    {
        if ((i1 & 3) == 3)
        {
            return "LEFT";
        }
        if ((i1 & 5) == 5)
        {
            return "RIGHT";
        } else
        {
            return Integer.toHexString(i1);
        }
    }

    static boolean d(View view)
    {
        return (android.support.v4.view.q.a(((LayoutParams)view.getLayoutParams()).a, bs.e(view)) & 7) != 0;
    }

    static boolean f(View view)
    {
        return bs.c(view) != 4 && bs.c(view) != 2;
    }

    static int[] f()
    {
        return b;
    }

    static boolean g()
    {
        return c;
    }

    private static boolean g(View view)
    {
        return ((LayoutParams)view.getLayoutParams()).a == 0;
    }

    private View h()
    {
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            if (((LayoutParams)view.getLayoutParams()).d)
            {
                return view;
            }
        }

        return null;
    }

    private void h(View view)
    {
        if (!d(view))
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a sliding drawer").toString());
        }
        if (o)
        {
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            layoutparams.b = 1.0F;
            layoutparams.d = true;
            a(view, true);
        } else
        if (a(view, 3))
        {
            i.a(view, 0, view.getTop());
        } else
        {
            j.a(view, getWidth() - view.getWidth(), view.getTop());
        }
        invalidate();
    }

    private View i()
    {
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            if (d(view) && i(view))
            {
                return view;
            }
        }

        return null;
    }

    private static boolean i(View view)
    {
        if (!d(view))
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a drawer").toString());
        }
        return ((LayoutParams)view.getLayoutParams()).b > 0.0F;
    }

    public final int a(View view)
    {
        int i1 = c(view);
        if (i1 == 3)
        {
            return p;
        }
        if (i1 == 5)
        {
            return q;
        } else
        {
            return 0;
        }
    }

    public final CharSequence a(int i1)
    {
        i1 = android.support.v4.view.q.a(i1, bs.e(this));
        if (i1 == 3)
        {
            return z;
        }
        if (i1 == 5)
        {
            return A;
        } else
        {
            return null;
        }
    }

    public final void a()
    {
        View view = b(0x800003);
        if (view == null)
        {
            throw new IllegalArgumentException((new StringBuilder("No drawer view found with gravity ")).append(c(0x800003)).toString());
        } else
        {
            h(view);
            return;
        }
    }

    final void a(int i1, View view)
    {
        LayoutParams layoutparams;
        int j1 = i.a();
        int k1 = j.a();
        if (j1 == 1 || k1 == 1)
        {
            j1 = 1;
        } else
        if (j1 == 2 || k1 == 2)
        {
            j1 = 2;
        } else
        {
            j1 = 0;
        }
        if (view == null || i1 != 0) goto _L2; else goto _L1
_L1:
        layoutparams = (LayoutParams)view.getLayoutParams();
        if (layoutparams.b != 0.0F) goto _L4; else goto _L3
_L3:
        layoutparams = (LayoutParams)view.getLayoutParams();
        if (layoutparams.d)
        {
            layoutparams.d = false;
            if (t != null)
            {
                t.onDrawerClosed(view);
            }
            a(view, false);
            if (hasWindowFocus())
            {
                view = getRootView();
                if (view != null)
                {
                    view.sendAccessibilityEvent(32);
                }
            }
        }
_L2:
        if (j1 != m)
        {
            m = j1;
            if (t != null)
            {
                t.onDrawerStateChanged(j1);
            }
        }
        return;
_L4:
        if (layoutparams.b == 1.0F)
        {
            LayoutParams layoutparams1 = (LayoutParams)view.getLayoutParams();
            if (!layoutparams1.d)
            {
                layoutparams1.d = true;
                if (t != null)
                {
                    t.onDrawerOpened(view);
                }
                a(view, true);
                if (hasWindowFocus())
                {
                    sendAccessibilityEvent(32);
                }
                view.requestFocus();
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    final void a(View view, float f1)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (f1 != layoutparams.b)
        {
            layoutparams.b = f1;
            if (t != null)
            {
                t.onDrawerSlide(view, f1);
                return;
            }
        }
    }

    public final void a(Object obj, boolean flag)
    {
        B = obj;
        C = flag;
        if (!flag && getBackground() == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setWillNotDraw(flag);
        requestLayout();
    }

    final boolean a(View view, int i1)
    {
        return (c(view) & i1) == i1;
    }

    public void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.addView(view, i1, layoutparams);
        if (h() != null || d(view))
        {
            bs.c(view, 4);
        } else
        {
            bs.c(view, 1);
        }
        if (!c)
        {
            bs.a(view, d);
        }
    }

    final View b(int i1)
    {
        int j1 = android.support.v4.view.q.a(i1, bs.e(this));
        int k1 = getChildCount();
        for (i1 = 0; i1 < k1; i1++)
        {
            View view = getChildAt(i1);
            if ((c(view) & 7) == (j1 & 7))
            {
                return view;
            }
        }

        return null;
    }

    public final void b()
    {
        View view = b(0x800003);
        if (view == null)
        {
            throw new IllegalArgumentException((new StringBuilder("No drawer view found with gravity ")).append(c(0x800003)).toString());
        } else
        {
            e(view);
            return;
        }
    }

    final int c(View view)
    {
        return android.support.v4.view.q.a(((LayoutParams)view.getLayoutParams()).a, bs.e(this));
    }

    public final boolean c()
    {
        View view = b(0x800003);
        if (view != null)
        {
            if (!d(view))
            {
                throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a drawer").toString());
            } else
            {
                return ((LayoutParams)view.getLayoutParams()).d;
            }
        } else
        {
            return false;
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
    }

    public void computeScroll()
    {
        int j1 = getChildCount();
        float f1 = 0.0F;
        for (int i1 = 0; i1 < j1; i1++)
        {
            f1 = Math.max(f1, ((LayoutParams)getChildAt(i1).getLayoutParams()).b);
        }

        g = f1;
        if (i.g() | j.g())
        {
            bs.b(this);
        }
    }

    public final boolean d()
    {
        View view = b(0x800003);
        if (view != null)
        {
            return i(view);
        } else
        {
            return false;
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long l1)
    {
        int i1;
        int j2;
        int i3;
        int l3;
        int i5;
        int j5;
        int k5;
        boolean flag1;
        i5 = getHeight();
        flag1 = g(view);
        j2 = 0;
        boolean flag = false;
        i1 = getWidth();
        j5 = canvas.save();
        i3 = i1;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        k5 = getChildCount();
        l3 = 0;
        j2 = ((flag) ? 1 : 0);
_L6:
        View view1;
        if (l3 >= k5)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        view1 = getChildAt(l3);
        if (view1 == view || view1.getVisibility() != 0) goto _L2; else goto _L1
_L1:
        int k4;
        Drawable drawable = view1.getBackground();
        if (drawable != null)
        {
            if (drawable.getOpacity() == -1)
            {
                i3 = 1;
            } else
            {
                i3 = 0;
            }
        } else
        {
            i3 = 0;
        }
        if (i3 == 0 || !d(view1) || view1.getHeight() < i5) goto _L2; else goto _L3
_L3:
        if (!a(view1, 3)) goto _L5; else goto _L4
_L4:
        i3 = view1.getRight();
        if (i3 > j2)
        {
            j2 = i3;
        }
        k4 = j2;
        i3 = i1;
_L7:
        l3++;
        i1 = i3;
        j2 = k4;
          goto _L6
_L5:
        int l4;
        l4 = view1.getLeft();
        i3 = l4;
        k4 = j2;
        if (l4 < i1) goto _L7; else goto _L2
_L2:
        i3 = i1;
        k4 = j2;
          goto _L7
        canvas.clipRect(j2, 0, i1, getHeight());
        i3 = i1;
        boolean flag2 = super.drawChild(canvas, view, l1);
        canvas.restoreToCount(j5);
        if (g > 0.0F && flag1)
        {
            int j1 = (int)((float)((f & 0xff000000) >>> 24) * g);
            int i4 = f;
            h.setColor(j1 << 24 | i4 & 0xffffff);
            canvas.drawRect(j2, 0.0F, i3, getHeight(), h);
        } else
        {
            if (w != null && a(view, 3))
            {
                int k1 = w.getIntrinsicWidth();
                int k2 = view.getRight();
                int j3 = i.b();
                float f1 = Math.max(0.0F, Math.min((float)k2 / (float)j3, 1.0F));
                w.setBounds(k2, view.getTop(), k1 + k2, view.getBottom());
                w.setAlpha((int)(255F * f1));
                w.draw(canvas);
                return flag2;
            }
            if (x != null && a(view, 5))
            {
                int i2 = x.getIntrinsicWidth();
                int l2 = view.getLeft();
                int k3 = getWidth();
                int j4 = j.b();
                float f2 = Math.max(0.0F, Math.min((float)(k3 - l2) / (float)j4, 1.0F));
                x.setBounds(l2 - i2, view.getTop(), l2, view.getBottom());
                x.setAlpha((int)(255F * f2));
                x.draw(canvas);
                return flag2;
            }
        }
        return flag2;
    }

    final void e()
    {
        int i1 = 0;
        if (!s)
        {
            long l1 = SystemClock.uptimeMillis();
            MotionEvent motionevent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
            for (int j1 = getChildCount(); i1 < j1; i1++)
            {
                getChildAt(i1).dispatchTouchEvent(motionevent);
            }

            motionevent.recycle();
            s = true;
        }
    }

    public final void e(View view)
    {
        if (!d(view))
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a sliding drawer").toString());
        }
        if (o)
        {
            view = (LayoutParams)view.getLayoutParams();
            view.b = 0.0F;
            view.d = false;
        } else
        if (a(view, 3))
        {
            i.a(view, -view.getWidth(), view.getTop());
        } else
        {
            j.a(view, getWidth(), view.getTop());
        }
        invalidate();
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
        if (layoutparams instanceof LayoutParams)
        {
            return new LayoutParams((LayoutParams)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new LayoutParams(layoutparams);
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        o = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        o = true;
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (C && y != null)
        {
            int i1 = a.a(B);
            if (i1 > 0)
            {
                y.setBounds(0, 0, getWidth(), i1);
                y.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag = false;
        i1 = at.a(motionevent);
        flag1 = i.a(motionevent);
        flag2 = j.a(motionevent);
        i1;
        JVM INSTR tableswitch 0 3: default 60
    //                   0 131
    //                   1 229
    //                   2 199
    //                   3 229;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        i1 = 0;
_L15:
        if (flag1 | flag2 || i1 != 0) goto _L6; else goto _L5
_L5:
        int j1;
        j1 = getChildCount();
        i1 = 0;
_L17:
        if (i1 >= j1) goto _L8; else goto _L7
_L7:
        if (!((LayoutParams)getChildAt(i1).getLayoutParams()).c) goto _L10; else goto _L9
_L9:
        i1 = 1;
_L18:
        if (i1 == 0 && !s) goto _L11; else goto _L6
_L6:
        flag = true;
_L11:
        return flag;
_L2:
        float f1;
        float f2;
        f1 = motionevent.getX();
        f2 = motionevent.getY();
        u = f1;
        v = f2;
        if (g <= 0.0F) goto _L13; else goto _L12
_L12:
        motionevent = i.b((int)f1, (int)f2);
        if (motionevent == null || !g(motionevent)) goto _L13; else goto _L14
_L14:
        i1 = 1;
_L19:
        r = false;
        s = false;
          goto _L15
_L4:
        if (!i.h()) goto _L1; else goto _L16
_L16:
        k.a();
        l.a();
        i1 = 0;
          goto _L15
_L3:
        a(true);
        r = false;
        s = false;
          goto _L1
_L10:
        i1++;
          goto _L17
_L8:
        i1 = 0;
          goto _L18
_L13:
        i1 = 0;
          goto _L19
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4)
        {
            boolean flag;
            if (i() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                android.support.v4.view.u.c(keyevent);
                return true;
            }
        }
        return super.onKeyDown(i1, keyevent);
    }

    public boolean onKeyUp(int i1, KeyEvent keyevent)
    {
        boolean flag = false;
        if (i1 == 4)
        {
            keyevent = i();
            if (keyevent != null && a(keyevent) == 0)
            {
                a(false);
            }
            if (keyevent != null)
            {
                flag = true;
            }
            return flag;
        } else
        {
            return super.onKeyUp(i1, keyevent);
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int k2;
        int l2;
        n = true;
        k2 = k1 - i1;
        l2 = getChildCount();
        k1 = 0;
_L2:
        View view;
        LayoutParams layoutparams;
        if (k1 >= l2)
        {
            break MISSING_BLOCK_LABEL_446;
        }
        view = getChildAt(k1);
        if (view.getVisibility() != 8)
        {
            layoutparams = (LayoutParams)view.getLayoutParams();
            if (!g(view))
            {
                break; /* Loop/switch isn't completed */
            }
            view.layout(layoutparams.leftMargin, layoutparams.topMargin, layoutparams.leftMargin + view.getMeasuredWidth(), layoutparams.topMargin + view.getMeasuredHeight());
        }
_L6:
        k1++;
        if (true) goto _L2; else goto _L1
_L1:
        int i2;
        int i3;
        int j3;
        i3 = view.getMeasuredWidth();
        j3 = view.getMeasuredHeight();
        float f1;
        boolean flag1;
        if (a(view, 3))
        {
            i1 = -i3;
            i2 = (int)((float)i3 * layoutparams.b) + i1;
            f1 = (float)(i3 + i2) / (float)i3;
        } else
        {
            i2 = k2 - (int)((float)i3 * layoutparams.b);
            f1 = (float)(k2 - i2) / (float)i3;
        }
        if (f1 != layoutparams.b)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        layoutparams.a & 0x70;
        JVM INSTR lookupswitch 2: default 212
    //                   16: 356
    //                   80: 316;
           goto _L3 _L4 _L5
_L4:
        break MISSING_BLOCK_LABEL_356;
_L3:
        view.layout(i2, layoutparams.topMargin, i3 + i2, j3 + layoutparams.topMargin);
_L7:
        if (flag1)
        {
            a(view, f1);
        }
        int j2;
        int k3;
        if (layoutparams.b > 0.0F)
        {
            i1 = 0;
        } else
        {
            i1 = 4;
        }
        if (view.getVisibility() != i1)
        {
            view.setVisibility(i1);
        }
          goto _L6
_L5:
        i1 = l1 - j1;
        view.layout(i2, i1 - layoutparams.bottomMargin - view.getMeasuredHeight(), i3 + i2, i1 - layoutparams.bottomMargin);
          goto _L7
        k3 = l1 - j1;
        j2 = (k3 - j3) / 2;
        if (j2 < layoutparams.topMargin)
        {
            i1 = layoutparams.topMargin;
        } else
        {
            i1 = j2;
            if (j2 + j3 > k3 - layoutparams.bottomMargin)
            {
                i1 = k3 - layoutparams.bottomMargin - j3;
            }
        }
        view.layout(i2, i1, i3 + i2, j3 + i1);
          goto _L7
        n = false;
        o = false;
        return;
          goto _L6
    }

    protected void onMeasure(int i1, int j1)
    {
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int l3;
        k2 = 300;
        j2 = 0;
        l3 = android.view.View.MeasureSpec.getMode(i1);
        i3 = android.view.View.MeasureSpec.getMode(j1);
        i2 = android.view.View.MeasureSpec.getSize(i1);
        l2 = android.view.View.MeasureSpec.getSize(j1);
        if (l3 != 0x40000000) goto _L2; else goto _L1
_L1:
        int l1 = i2;
        if (i3 == 0x40000000) goto _L3; else goto _L2
_L2:
        int k1;
        boolean flag;
        if (isInEditMode())
        {
            k1 = i2;
            if (l3 != 0x80000000)
            {
                k1 = i2;
                if (l3 == 0)
                {
                    k1 = 300;
                }
            }
            l1 = k1;
            if (i3 != 0x80000000)
            {
label0:
                {
                    l1 = k1;
                    if (i3 == 0)
                    {
                        l1 = k1;
                        k1 = k2;
                        break label0;
                    }
                }
            }
        } else
        {
            throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
        }
          goto _L3
_L5:
        setMeasuredDimension(l1, k1);
        if (B != null && bs.q(this))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k2 = bs.e(this);
        l2 = getChildCount();
        while (j2 < l2) 
        {
            View view = getChildAt(j2);
            if (view.getVisibility() != 8)
            {
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                if (flag)
                {
                    int j3 = android.support.v4.view.q.a(layoutparams.a, k2);
                    if (bs.q(view))
                    {
                        a.a(view, B, j3);
                    } else
                    {
                        a.a(layoutparams, B, j3);
                    }
                }
                if (g(view))
                {
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(l1 - layoutparams.leftMargin - layoutparams.rightMargin, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(k1 - layoutparams.topMargin - layoutparams.bottomMargin, 0x40000000));
                } else
                if (d(view))
                {
                    int k3 = c(view) & 7;
                    if ((k3 & 0) != 0)
                    {
                        throw new IllegalStateException((new StringBuilder("Child drawer has absolute gravity ")).append(c(k3)).append(" but this DrawerLayout already has a drawer view along that edge").toString());
                    }
                    view.measure(getChildMeasureSpec(i1, e + layoutparams.leftMargin + layoutparams.rightMargin, layoutparams.width), getChildMeasureSpec(j1, layoutparams.topMargin + layoutparams.bottomMargin, layoutparams.height));
                } else
                {
                    throw new IllegalStateException((new StringBuilder("Child ")).append(view).append(" at index ").append(j2).append(" does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY").toString());
                }
            }
            j2++;
        }
        return;
_L3:
        k1 = l2;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((SavedState) (parcelable)).a != 0)
        {
            View view = b(((SavedState) (parcelable)).a);
            if (view != null)
            {
                h(view);
            }
        }
        a(((SavedState) (parcelable)).b, 3);
        a(((SavedState) (parcelable)).c, 5);
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        View view = h();
        if (view != null)
        {
            savedstate.a = ((LayoutParams)view.getLayoutParams()).a;
        }
        savedstate.b = p;
        savedstate.c = q;
        return savedstate;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        i.b(motionevent);
        j.b(motionevent);
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 3: default 56
    //                   0 58
    //                   1 90
    //                   2 56
    //                   3 203;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        return true;
_L2:
        float f1 = motionevent.getX();
        float f3 = motionevent.getY();
        u = f1;
        v = f3;
        r = false;
        s = false;
        return true;
_L3:
        float f2;
        float f4;
        f4 = motionevent.getX();
        f2 = motionevent.getY();
        motionevent = i.b((int)f4, (int)f2);
        if (motionevent == null || !g(motionevent)) goto _L6; else goto _L5
_L5:
        int i1;
        f4 -= u;
        f2 -= v;
        i1 = i.d();
        if (f4 * f4 + f2 * f2 >= (float)(i1 * i1)) goto _L6; else goto _L7
_L7:
        motionevent = h();
        if (motionevent == null) goto _L6; else goto _L8
_L8:
        boolean flag;
        if (a(motionevent) == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L10:
        a(flag);
        r = false;
        return true;
_L4:
        a(true);
        r = false;
        s = false;
        return true;
_L6:
        flag = true;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
        super.requestDisallowInterceptTouchEvent(flag);
        r = flag;
        if (flag)
        {
            a(true);
        }
    }

    public void requestLayout()
    {
        if (!n)
        {
            super.requestLayout();
        }
    }

    static 
    {
        boolean flag = true;
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            flag = false;
        }
        c = flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new p();
        } else
        {
            a = new android.support.v4.widget.q();
        }
    }

    private class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        public int a;
        float b;
        boolean c;
        boolean d;

        public LayoutParams()
        {
            super(-1, -1);
            a = 0;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            a = 0;
            context = context.obtainStyledAttributes(attributeset, DrawerLayout.f());
            a = context.getInt(0, 0);
            context.recycle();
        }

        public LayoutParams(LayoutParams layoutparams)
        {
            super(layoutparams);
            a = 0;
            a = layoutparams.a;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            a = 0;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            a = 0;
        }
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new s();
        int a;
        int b;
        int c;

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            parcel.writeInt(a);
        }


        public SavedState(Parcel parcel)
        {
            super(parcel);
            a = 0;
            b = 0;
            c = 0;
            a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
            a = 0;
            b = 0;
            c = 0;
        }
    }

}
