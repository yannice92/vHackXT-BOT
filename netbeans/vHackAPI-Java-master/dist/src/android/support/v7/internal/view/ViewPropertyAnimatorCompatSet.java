// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.support.v4.view.do;
import android.support.v4.view.ee;
import android.support.v4.view.ef;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

public class ViewPropertyAnimatorCompatSet
{

    private final ArrayList mAnimators = new ArrayList();
    private long mDuration;
    private Interpolator mInterpolator;
    private boolean mIsStarted;
    private ee mListener;
    private final ef mProxyListener = new _cls1();

    public ViewPropertyAnimatorCompatSet()
    {
        mDuration = -1L;
    }

    private void onAnimationsEnded()
    {
        mIsStarted = false;
    }

    public void cancel()
    {
        if (!mIsStarted)
        {
            return;
        }
        for (Iterator iterator = mAnimators.iterator(); iterator.hasNext(); ((do)iterator.next()).b()) { }
        mIsStarted = false;
    }

    public ViewPropertyAnimatorCompatSet play(do do1)
    {
        if (!mIsStarted)
        {
            mAnimators.add(do1);
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet setDuration(long l)
    {
        if (!mIsStarted)
        {
            mDuration = l;
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet setInterpolator(Interpolator interpolator)
    {
        if (!mIsStarted)
        {
            mInterpolator = interpolator;
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet setListener(ee ee)
    {
        if (!mIsStarted)
        {
            mListener = ee;
        }
        return this;
    }

    public void start()
    {
        if (mIsStarted)
        {
            return;
        }
        do do1;
        for (Iterator iterator = mAnimators.iterator(); iterator.hasNext(); do1.c())
        {
            do1 = (do)iterator.next();
            if (mDuration >= 0L)
            {
                do1.a(mDuration);
            }
            if (mInterpolator != null)
            {
                do1.a(mInterpolator);
            }
            if (mListener != null)
            {
                do1.a(mProxyListener);
            }
        }

        mIsStarted = true;
    }




    private class _cls1 extends ef
    {

        private int mProxyEndCount;
        private boolean mProxyStarted;
        final ViewPropertyAnimatorCompatSet this$0;

        public void onAnimationEnd(View view)
        {
            int i = mProxyEndCount + 1;
            mProxyEndCount = i;
            if (i == mAnimators.size())
            {
                if (mListener != null)
                {
                    mListener.onAnimationEnd(null);
                }
                onEnd();
            }
        }

        public void onAnimationStart(View view)
        {
            if (!mProxyStarted)
            {
                mProxyStarted = true;
                if (mListener != null)
                {
                    mListener.onAnimationStart(null);
                    return;
                }
            }
        }

        void onEnd()
        {
            mProxyEndCount = 0;
            mProxyStarted = false;
            mIsStarted;
        }

        _cls1()
        {
            this$0 = ViewPropertyAnimatorCompatSet.this;
            super();
            mProxyStarted = false;
            mProxyEndCount = 0;
        }
    }

}
