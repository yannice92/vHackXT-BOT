// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.os.AsyncTask;

// Referenced classes of package com.bca.mobile:
//            MainActivity, aa

final class z extends AsyncTask
{

    final MainActivity a;

    z(MainActivity mainactivity)
    {
        a = mainactivity;
        super();
    }

    static MainActivity a(z z1)
    {
        return z1.a;
    }

    protected final transient Object doInBackground(Object aobj[])
    {
        String s = a.d();
        if (s != null)
        {
            a.e();
            aobj = "";
            if (s.length() >= 4)
            {
                aobj = s.substring(0, 4);
            }
            if (((String) (aobj)).equals("http"))
            {
                MainActivity.a(a, s);
            } else
            {
                a.a(new aa(this, s));
            }
        }
        return "";
    }
}
