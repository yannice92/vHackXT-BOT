// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.support.v4.a.a.i;
import android.support.v4.view.bs;
import android.support.v7.internal.widget.TintManager;
import android.support.v7.internal.widget.TintTypedArray;
import android.util.AttributeSet;
import android.widget.RatingBar;

public class AppCompatRatingBar extends RatingBar
{

    private static final int TINT_ATTRS[] = {
        0x101013b, 0x101013c
    };
    private Bitmap mSampleTile;

    public AppCompatRatingBar(Context context)
    {
        this(context, null);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, android.support.v7.appcompat.R.attr.ratingBarStyle);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        if (TintManager.SHOULD_BE_USED)
        {
            context = TintTypedArray.obtainStyledAttributes(getContext(), attributeset, TINT_ATTRS, j, 0);
            attributeset = context.getDrawableIfKnown(0);
            if (attributeset != null)
            {
                setIndeterminateDrawable(tileifyIndeterminate(attributeset));
            }
            attributeset = context.getDrawableIfKnown(1);
            if (attributeset != null)
            {
                setProgressDrawable(tileify(attributeset, false));
            }
            context.recycle();
        }
    }

    private Shape getDrawableShape()
    {
        return new RoundRectShape(new float[] {
            5F, 5F, 5F, 5F, 5F, 5F, 5F, 5F
        }, null, null);
    }

    private Drawable tileify(Drawable drawable, boolean flag)
    {
        boolean flag1 = false;
        if (drawable instanceof i)
        {
            Drawable drawable1 = ((i)drawable).a();
            if (drawable1 != null)
            {
                drawable1 = tileify(drawable1, flag);
                ((i)drawable).a(drawable1);
            }
        } else
        {
            if (drawable instanceof LayerDrawable)
            {
                drawable = (LayerDrawable)drawable;
                int l = drawable.getNumberOfLayers();
                Drawable adrawable[] = new Drawable[l];
                int j = 0;
                while (j < l) 
                {
                    int i1 = drawable.getId(j);
                    Drawable drawable2 = drawable.getDrawable(j);
                    if (i1 == 0x102000d || i1 == 0x102000f)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    adrawable[j] = tileify(drawable2, flag);
                    j++;
                }
                LayerDrawable layerdrawable = new LayerDrawable(adrawable);
                for (int k = ((flag1) ? 1 : 0); k < l; k++)
                {
                    layerdrawable.setId(k, drawable.getId(k));
                }

                return layerdrawable;
            }
            if (drawable instanceof BitmapDrawable)
            {
                Object obj = ((BitmapDrawable)drawable).getBitmap();
                if (mSampleTile == null)
                {
                    mSampleTile = ((Bitmap) (obj));
                }
                drawable = new ShapeDrawable(getDrawableShape());
                obj = new BitmapShader(((Bitmap) (obj)), android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.CLAMP);
                drawable.getPaint().setShader(((android.graphics.Shader) (obj)));
                if (flag)
                {
                    return new ClipDrawable(drawable, 3, 1);
                } else
                {
                    return drawable;
                }
            }
        }
        return drawable;
    }

    private Drawable tileifyIndeterminate(Drawable drawable)
    {
        Object obj = drawable;
        if (drawable instanceof AnimationDrawable)
        {
            drawable = (AnimationDrawable)drawable;
            int k = drawable.getNumberOfFrames();
            obj = new AnimationDrawable();
            ((AnimationDrawable) (obj)).setOneShot(drawable.isOneShot());
            for (int j = 0; j < k; j++)
            {
                Drawable drawable1 = tileify(drawable.getFrame(j), true);
                drawable1.setLevel(10000);
                ((AnimationDrawable) (obj)).addFrame(drawable1, drawable.getDuration(j));
            }

            ((AnimationDrawable) (obj)).setLevel(10000);
        }
        return ((Drawable) (obj));
    }

    protected void onMeasure(int j, int k)
    {
        this;
        JVM INSTR monitorenter ;
        super.onMeasure(j, k);
        if (mSampleTile != null)
        {
            setMeasuredDimension(bs.a(mSampleTile.getWidth() * getNumStars(), j, 0), getMeasuredHeight());
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
