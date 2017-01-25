// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bca.c.g;
import com.bca.mobile.ShareActivity;
import com.bca.mobile.TabSample;
import com.bca.mobile.n;
import com.f.a;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile.transaction:
//            dj

public class M_Transfer_Dafter_Rekening_ConfirmScreen extends ShareActivity
{

    TextView T;
    TextView U;
    CheckBox V;
    RelativeLayout W;
    TextView X;
    TextView Y;
    CheckBox Z;
    int a;
    boolean b;
    String c[];
    String d[];
    int e;
    boolean f;
    String g[];
    String h[];
    int i;
    RelativeLayout j;
    TextView k;
    TextView l;
    CheckBox m;
    RelativeLayout n;

    public M_Transfer_Dafter_Rekening_ConfirmScreen()
    {
    }

    protected final void a()
    {
        String s1 = "";
        if (m.isChecked())
        {
            s1 = (new StringBuilder(String.valueOf(""))).append(k.getText().toString()).append(":").toString();
        }
        String s = s1;
        if (V.isChecked())
        {
            s = (new StringBuilder(String.valueOf(s1))).append(T.getText().toString()).append(":").toString();
        }
        s1 = s;
        if (Z.isChecked())
        {
            s1 = (new StringBuilder(String.valueOf(s))).append(X.getText().toString()).append(":").toString();
        }
        if (s1.equals(""))
        {
            a(null, "112 - Anda belum memilih No. Rekening Tujuan yang akan didaftarkan.", getParent(), false, "Back");
            return;
        } else
        {
            g((new StringBuilder("PGI:!:TDAR:!:")).append(s1.substring(0, s1.length() - 1)).toString());
            return;
        }
    }

    public final void a(int i1)
    {
        g();
        if (n.l == 0x7f0200a7 && n.y != null)
        {
            n.y.c();
            n.y = null;
        }
    }

    public final void a(int i1, String as[])
    {
        a(((Runnable) (new dj(this, as))));
    }

    protected final void a(String s)
    {
    }

    protected final void b()
    {
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

    public void onClick(View view)
    {
        super.onClick(view);
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f03004d);
        bundle = (String[])n.m.get("valid");
        String as[] = (String[])n.m.get("invalid");
        a = bundle.length;
        e = as.length;
        if (a == 1 && bundle[0].equals(""))
        {
            b = true;
        } else
        {
            c = (String[])n.m.get("valid_rek");
            d = (String[])n.m.get("valid_name");
        }
        if (e == 1 && as[0].equals(""))
        {
            f = true;
        } else
        {
            g = (String[])n.m.get("invalid_rek");
            h = (String[])n.m.get("invalid_name");
        }
        if (!b)
        {
            i = i + a;
        }
        if (!f)
        {
            i = i + e;
        }
        j = (RelativeLayout)findViewById(0x7f0b015c);
        k = (TextView)findViewById(0x7f0b015d);
        l = (TextView)findViewById(0x7f0b015e);
        m = (CheckBox)findViewById(0x7f0b015f);
        n = (RelativeLayout)findViewById(0x7f0b0160);
        T = (TextView)findViewById(0x7f0b0161);
        U = (TextView)findViewById(0x7f0b0162);
        V = (CheckBox)findViewById(0x7f0b0163);
        W = (RelativeLayout)findViewById(0x7f0b0164);
        X = (TextView)findViewById(0x7f0b0165);
        Y = (TextView)findViewById(0x7f0b0166);
        Z = (CheckBox)findViewById(0x7f0b0167);
        if (i == 3)
        {
            j.setVisibility(0);
            n.setVisibility(0);
            W.setVisibility(0);
        } else
        if (i == 2)
        {
            j.setVisibility(0);
            n.setVisibility(0);
        } else
        {
            j.setVisibility(0);
        }
        if (b) goto _L2; else goto _L1
_L1:
        a;
        JVM INSTR tableswitch 1 3: default 356
    //                   1 554
    //                   2 591
    //                   3 662;
           goto _L2 _L3 _L4 _L5
_L2:
        if (f) goto _L7; else goto _L6
_L6:
        if (e != 3) goto _L9; else goto _L8
_L8:
        k.setText(g[0]);
        l.setText(h[0]);
        T.setText(g[1]);
        U.setText(h[1]);
        X.setText(g[2]);
        Y.setText(h[2]);
_L7:
        return;
_L3:
        m.setVisibility(0);
        k.setText(c[0]);
        l.setText(d[0]);
        continue; /* Loop/switch isn't completed */
_L4:
        m.setVisibility(0);
        V.setVisibility(0);
        k.setText(c[0]);
        l.setText(d[0]);
        T.setText(c[1]);
        U.setText(d[1]);
        continue; /* Loop/switch isn't completed */
_L5:
        m.setVisibility(0);
        V.setVisibility(0);
        Z.setVisibility(0);
        k.setText(c[0]);
        l.setText(d[0]);
        T.setText(c[1]);
        U.setText(d[1]);
        X.setText(c[2]);
        Y.setText(d[2]);
        continue; /* Loop/switch isn't completed */
_L9:
        if (e == 2)
        {
            if (!b)
            {
                T.setText(g[0]);
                U.setText(h[0]);
                X.setText(g[1]);
                Y.setText(h[1]);
                return;
            } else
            {
                k.setText(g[0]);
                l.setText(h[0]);
                T.setText(g[1]);
                U.setText(h[1]);
                return;
            }
        }
        if (e != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (b)
        {
            break; /* Loop/switch isn't completed */
        }
        if (a == 1)
        {
            T.setText(g[0]);
            U.setText(h[0]);
            return;
        }
        if (a == 2)
        {
            X.setText(g[0]);
            Y.setText(h[0]);
            return;
        }
        if (true) goto _L7; else goto _L10
_L10:
        k.setText(g[0]);
        l.setText(h[0]);
        return;
        if (true) goto _L2; else goto _L11
_L11:
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
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
        if (n.am != null && !b)
        {
            n.am.a("Send", true);
        } else
        {
            n.am.a("Send", false);
        }
        if (n.v == null)
        {
            n.v = new g(this);
        }
        n.v.a(this);
    }
}
