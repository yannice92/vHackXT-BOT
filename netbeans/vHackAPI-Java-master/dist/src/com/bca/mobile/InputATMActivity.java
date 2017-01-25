// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Environment;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.b.b;
import com.bca.c.c;
import com.bca.c.d;
import com.f.e;
import com.h.a;
import com.utilities.f;
import com.utilities.h;
import com.utilities.k;
import com.utilities.l;
import com.utilities.n;
import com.utilities.q;
import com.utilities.r;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

// Referenced classes of package com.bca.mobile:
//            ShareActivity, r, q, p, 
//            n

public class InputATMActivity extends ShareActivity
    implements c, e, a
{

    EditText a;
    Button b;
    RelativeLayout c;
    ProgressBar d;
    ProgressBar e;
    TextView f;
    boolean g;

    public InputATMActivity()
    {
    }

    protected final void a()
    {
    }

    public final void a(int i)
    {
        a(((Runnable) (new com.bca.mobile.r(this, i))));
    }

    public final void a(int i, String as[])
    {
        super.a(new com.bca.mobile.q(this, i));
    }

    public final void a(Context context, int i, String s, String s1)
    {
        g();
        super.a(context, i, s, s1);
    }

    protected final void a(String s)
    {
    }

    public final void a(String s, String as[])
    {
    }

    protected final void b()
    {
    }

    public final void b(int i)
    {
        super.a(new p(this, i));
    }

    public final void b(String s)
    {
    }

    public final void c()
    {
    }

    public void onBackPressed()
    {
        if (c.getVisibility() != 0)
        {
            super.onBackPressed();
        }
    }

    public void onCancel(DialogInterface dialoginterface)
    {
    }

    public void onClick(View view)
    {
        if (view == b)
        {
            y.hideSoftInputFromWindow(b.getWindowToken(), 0);
            if (a.getText().length() == 16)
            {
                if (com.b.b.a(this) == -1)
                {
                    r.a(getApplicationContext(), "mbca_prov_ok", 100);
                    super.a(1, "m-BCA", "Verification process in-progress. Please wait for the process to complete...", "Cancel", false);
                    com.h.b.b();
                    com.h.b.b = 0;
                    com.h.b.a(this);
                    n.aL = a.getText().toString();
                    Object obj = n.a(this);
                    n.A = ((String) (obj));
                    String s = (new SimpleDateFormat("yyyyMMddhhmmssSSS")).format(new Date());
                    Object obj1 = s.substring(s.length() - 3);
                    Object obj2 = ((TelephonyManager)getSystemService("phone")).getSubscriberId();
                    s = q.a(Long.parseLong(s), 33);
                    obj1 = q.a(Long.parseLong((new StringBuilder(String.valueOf(obj1))).append(((String) (obj2)).substring(((String) (obj2)).length() - 13)).toString()), 32);
                    n.P = (new StringBuilder(String.valueOf(s))).append(((String) (obj1))).toString().trim();
                    n.az = h.a((new h(n.P.getBytes())).a());
                    obj1 = k.a(this, ((String) (obj)), n.O, n.az, n.aL, n.N);
                    obj2 = new com.utilities.a();
                    ((com.utilities.a) (obj2)).a(obj);
                    ((com.utilities.a) (obj2)).a(((l) (obj1)).b());
                    n.aE = ((com.utilities.a) (obj2));
                    n.ah = new com.utilities.e(com.utilities.f.a(n.A, r.e((new StringBuilder(String.valueOf(((l) (obj1)).c()))).append(((l) (obj1)).d()).toString())));
                    if (n.s != null)
                    {
                        n.s = null;
                    }
                    obj = new d(this);
                    n.s = ((d) (obj));
                    ((d) (obj)).a(this);
                    n.s.a(((l) (obj1)).a());
                    n.s.a();
                }
            } else
            {
                a("m-BCA", "105 - Nomor kartu ATM harus 16 digit.", this, false, "Back");
            }
        }
        super.onClick(view);
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f030031, this);
        super.c("m-BCA");
        a = (EditText)findViewById(0x7f0b00de);
        a.setInputType(2);
        b = (Button)findViewById(0x7f0b00df);
        b.setOnClickListener(this);
        c = (RelativeLayout)findViewById(0x7f0b00bf);
        d = (ProgressBar)findViewById(0x7f0b00c0);
        e = (ProgressBar)findViewById(0x7f0b00c1);
        f = (TextView)findViewById(0x7f0b00c2);
        c.setOnClickListener(this);
    }

    protected void onDestroy()
    {
        super.onDestroy();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l1)
    {
    }

    public void onResultButtonCancel(View view)
    {
    }

    public void onResultButtonOK(View view)
    {
    }

    protected void onResume()
    {
        super.onResume();
        com.h.b.c();
        if (g)
        {
            super.a(false);
            File file = new File((new StringBuilder()).append(Environment.getExternalStorageDirectory()).append("/download/").toString());
            file.mkdirs();
            (new File(file, "BCA Mobile.apk")).delete();
        }
    }
}
