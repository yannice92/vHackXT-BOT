// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.VelocityTracker;

// Referenced classes of package android.support.v4.view:
//            br

final class bq
    implements br
{

    bq()
    {
    }

    public final float a(VelocityTracker velocitytracker, int i)
    {
        return velocitytracker.getXVelocity(i);
    }

    public final float b(VelocityTracker velocitytracker, int i)
    {
        return velocitytracker.getYVelocity(i);
    }
}
