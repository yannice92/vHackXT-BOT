// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.nfc.tech.MifareClassic;
import android.nfc.tech.MifareUltralight;
import android.nfc.tech.Ndef;
import android.nfc.tech.NdefFormatable;
import android.nfc.tech.NfcA;
import android.nfc.tech.NfcB;
import android.nfc.tech.NfcF;
import android.nfc.tech.NfcV;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.io.PrintStream;
import java.util.Timer;

// Referenced classes of package com.bca.mobile:
//            ShareActivity, n, bn, a, 
//            FlazzMainTabActivity, MainActivity

public class AboutActivity extends ShareActivity
{

    ImageView a;
    Animation b;
    NfcAdapter c;
    PendingIntent d;
    IntentFilter e[];
    String f[][];
    Toast g;
    TextView h;
    Timer i;

    public AboutActivity()
    {
    }

    static void a(AboutActivity aboutactivity)
    {
        aboutactivity.a.startAnimation(aboutactivity.b);
    }

    protected final void a()
    {
    }

    public final void a(int j)
    {
    }

    public final void a(int j, String as[])
    {
    }

    protected final void a(String s)
    {
    }

    protected final void b()
    {
        finish();
    }

    public final void b(String s)
    {
    }

    public final void c()
    {
    }

    public void onCancel(DialogInterface dialoginterface)
    {
    }

    protected void onCreate(Bundle bundle)
    {
        if (n.c >= 720 && n.aM > 6.9000000000000004D)
        {
            super.a(bundle, 0x7f03001e, this);
        } else
        if (n.c >= 600 && n.aM > 4.7999999999999998D)
        {
            super.a(bundle, 0x7f03001d, this);
        } else
        {
            super.a(bundle, 0x7f03001c, this);
        }
        if (O < 450)
        {
            findViewById(0x7f0b0075).getLayoutParams().height = (int)(50F * getResources().getDisplayMetrics().density + 0.5F);
        } else
        if (O < 700)
        {
            findViewById(0x7f0b0075).getLayoutParams().height = (int)(60F * getResources().getDisplayMetrics().density + 0.5F);
        } else
        if (n.aM < 7.2000000000000002D)
        {
            findViewById(0x7f0b0075).getLayoutParams().height = (int)(70F * getResources().getDisplayMetrics().density + 0.5F);
        } else
        {
            findViewById(0x7f0b0075).getLayoutParams().height = (int)(130F * getResources().getDisplayMetrics().density + 0.5F);
        }
        super.c(getResources().getString(0x7f0c001b));
        if (bn.a(0x7f0c0013).contains("P"))
        {
            findViewById(0x7f0b0074).setVisibility(8);
        }
        a = (ImageView)findViewById(0x7f0b0073);
        b = AnimationUtils.loadAnimation(this, 0x7f04000c);
        i = new Timer();
        i.schedule(new a(this), 0L, 4500L);
        c = NfcAdapter.getDefaultAdapter(this);
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_373;
        }
        d = PendingIntent.getActivity(this, 0, (new Intent(this, getClass())).addFlags(0x20000000), 0);
        bundle = new IntentFilter("android.nfc.action.NDEF_DISCOVERED");
        try
        {
            bundle.addDataType("*/*");
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            try
            {
                throw new RuntimeException("fail", bundle);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                return;
            }
        }
        e = (new IntentFilter[] {
            bundle
        });
        f = (new String[][] {
            new String[] {
                android/nfc/tech/IsoDep.getName()
            }, new String[] {
                android/nfc/tech/NfcA.getName()
            }, new String[] {
                android/nfc/tech/NfcB.getName()
            }, new String[] {
                android/nfc/tech/NfcF.getName()
            }, new String[] {
                android/nfc/tech/NfcV.getName()
            }, new String[] {
                android/nfc/tech/Ndef.getName()
            }, new String[] {
                android/nfc/tech/NdefFormatable.getName()
            }, new String[] {
                android/nfc/tech/MifareClassic.getName()
            }, new String[] {
                android/nfc/tech/MifareUltralight.getName()
            }
        });
    }

    protected void onDestroy()
    {
        if (i != null)
        {
            i.cancel();
            i = null;
        }
        super.onDestroy();
    }

    public void onItemClick(AdapterView adapterview, View view, int j, long l)
    {
    }

    public void onNewIntent(Intent intent)
    {
        boolean flag;
        g = Toast.makeText(getApplicationContext(), "Loading.", 0);
        h = (TextView)g.getView().findViewById(0x102000b);
        if (h != null)
        {
            h.setGravity(17);
        }
        g.show();
        setIntent(intent);
        if (!"android.nfc.action.TECH_DISCOVERED".equals(getIntent().getAction()))
        {
            break MISSING_BLOCK_LABEL_225;
        }
        Tag tag = (Tag)intent.getParcelableExtra("android.nfc.extra.TAG");
        intent = android/nfc/tech/IsoDep.getName();
        String as[] = tag.getTechList();
        int k = as.length;
        int j = 0;
        flag = false;
        while (j < k) 
        {
            if (intent.equals(as[j]))
            {
                flag = true;
            }
            j++;
        }
_L2:
        if (flag)
        {
            startActivity(new Intent(this, com/bca/mobile/FlazzMainTabActivity));
            return;
        }
        g = Toast.makeText(getApplicationContext(), getResources().getString(0x7f0c0045), 0);
        h = (TextView)g.getView().findViewById(0x102000b);
        if (h != null)
        {
            h.setGravity(17);
        }
        g.show();
        return;
        flag = false;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void onPause()
    {
        super.onPause();
        if (c != null)
        {
            c.disableForegroundDispatch(this);
        }
    }

    protected void onRestart()
    {
        System.out.println((new StringBuilder(String.valueOf(com/bca/mobile/MainActivity.getName()))).append(" onRestart").toString());
        super.onRestart();
    }

    public void onResultButtonCancel(View view)
    {
    }

    public void onResultButtonOK(View view)
    {
    }

    public void onResume()
    {
        super.onResume();
        if (c != null)
        {
            c.enableForegroundDispatch(this, d, e, f);
        }
    }

    protected void onStop()
    {
        super.onStop();
    }
}
