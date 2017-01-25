// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.splash;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.Window;
import android.view.WindowManager;
import android.widget.VideoView;
import com.appsflyer.i;
import com.bca.mobile.MainActivity;
import com.bca.mobile.bn;
import com.bca.mobile.n;
import java.io.File;
import java.io.PrintStream;

public class Splash2 extends Activity
    implements android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnPreparedListener
{

    private VideoView a;
    private int b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private boolean h;

    public Splash2()
    {
    }

    private void a()
    {
        if (h)
        {
            Intent intent = new Intent("com.android.music.musicservicecommand");
            intent.putExtra("command", "play");
            sendBroadcast(intent);
        }
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        startActivity(new Intent(this, com/bca/mobile/MainActivity));
        finish();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        int j;
        int k;
        int l;
        int i1;
        boolean flag;
        if (2 == configuration.orientation)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
        if (f)
        {
            j = c;
        } else
        {
            j = b;
        }
        if (f)
        {
            k = b;
        } else
        {
            k = c;
        }
        Log.i("Screen Dimension", (new StringBuilder(String.valueOf(j))).append("x").append(k).toString());
        i1 = j;
        l = k;
        if (d > 0)
        {
            i1 = j;
            l = k;
            if (e > 0)
            {
                float f3 = j;
                float f5 = k;
                float f2 = d;
                float f1 = e;
                float f4 = f3 / f2;
                f3 = f2 * f4;
                f4 *= f1;
                f2 = f4;
                f1 = f3;
                if (f4 > f5)
                {
                    f2 = f5 / f4;
                    f1 = f3 * f2;
                    f2 = f4 * f2;
                }
                i1 = (int)f1;
                l = (int)f2;
            }
        }
        a.getHolder().setFixedSize(i1, l);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        System.out.println("Splash onCreate");
        setContentView(0x7f03006d);
        g = false;
        bn.a(this);
        bn.a("screen_width", "0");
        bn.a("screen_inch", "0");
        bundle = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(bundle);
        Log.i("********", (new StringBuilder(String.valueOf(((DisplayMetrics) (bundle)).densityDpi))).append(" < x, y > ").append(((DisplayMetrics) (bundle)).ydpi).toString());
        double d1 = Math.sqrt(Math.pow((float)((DisplayMetrics) (bundle)).widthPixels / ((DisplayMetrics) (bundle)).xdpi, 2D) + Math.pow((float)((DisplayMetrics) (bundle)).heightPixels / ((DisplayMetrics) (bundle)).ydpi, 2D));
        n.aM = d1;
        System.out.println((new StringBuilder("Width Pixel : ")).append(((DisplayMetrics) (bundle)).widthPixels).append(" -- xdpi ").append(((DisplayMetrics) (bundle)).xdpi).toString());
        System.out.println((new StringBuilder("Height Pixel : ")).append(((DisplayMetrics) (bundle)).heightPixels).append(" -- ydpi ").append(((DisplayMetrics) (bundle)).ydpi).toString());
        System.out.println((new StringBuilder("Screen inches : ")).append(d1).toString());
        getWindow().clearFlags(2048);
        getWindow().setFlags(1024, 1024);
        bundle = getWindowManager().getDefaultDisplay();
        b = bundle.getWidth();
        c = bundle.getHeight();
        n.c = bundle.getWidth();
        bn.a("screen_width", (new StringBuilder(String.valueOf(b))).toString());
        bn.a("screen_inch", (new StringBuilder(String.valueOf(d1))).toString());
        a = (VideoView)findViewById(0x7f0b0241);
        bundle = new File((new StringBuilder()).append(Environment.getExternalStorageDirectory()).append("/download/").toString());
        bundle.mkdirs();
        (new File(bundle, "BCA Mobile.apk")).delete();
        Log.i("*********", (new StringBuilder(String.valueOf(b))).append("x").append(c).toString());
        try
        {
            i.a().a(getApplication(), bn.a(0x7f0c0031));
            i.a();
            i.b();
            i.a();
            i.a(this);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            System.out.println("af");
        }
        if (b <= 320)
        {
            a.setVideoPath((new StringBuilder("android.resource://")).append(getPackageName()).append("/2131099649").toString());
            bundle = "s166x240";
        } else
        {
            a.setVideoPath((new StringBuilder("android.resource://")).append(getPackageName()).append("/2131099650").toString());
            bundle = "s640x920";
        }
        h = ((AudioManager)getSystemService("audio")).isMusicActive();
        Log.i("Videoo *********", bundle);
        a.setOnCompletionListener(this);
        a.setOnPreparedListener(this);
        a.start();
        a();
    }

    protected void onPause()
    {
        super.onPause();
        System.out.println("Splash onPause");
        if (a.isPlaying())
        {
            System.out.println("Splash onPause 2");
            g = true;
        }
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        a();
    }

    protected void onResume()
    {
        super.onResume();
        System.out.println("Splash onResume");
        if (g)
        {
            System.out.println("Splash onResume 2");
            startActivity(new Intent(this, com/bca/mobile/MainActivity));
            finish();
        }
    }
}
