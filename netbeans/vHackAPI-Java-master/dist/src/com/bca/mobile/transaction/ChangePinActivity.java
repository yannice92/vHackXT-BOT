// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.TextView;
import b.a.a.d;
import com.bca.c.g;
import com.bca.mobile.ShareActivity;
import com.bca.mobile.TabSample;
import com.bca.mobile.bn;
import com.bca.mobile.n;
import com.f.a;
import com.utilities.e;

// Referenced classes of package com.bca.mobile.transaction:
//            a

public class ChangePinActivity extends ShareActivity
{

    EditText a;
    EditText b;
    EditText c;

    public ChangePinActivity()
    {
    }

    protected final void a()
    {
        String s1 = a.getText().toString();
        String s2 = b.getText().toString();
        String s = c.getText().toString();
        int i = s1.length();
        int j = s2.length();
        int k = s.length();
        if (i != 6)
        {
            a(null, "131 - PIN m-BCA harus 6 digit.", getParent(), false, "Back");
            return;
        }
        if (j != 6)
        {
            a(null, "131 - PIN m-BCA harus 6 digit.", getParent(), false, "Back");
            return;
        }
        if (k != 6)
        {
            a(null, "131 - PIN m-BCA harus 6 digit.", getParent(), false, "Back");
            return;
        }
        if (!s2.equals(s))
        {
            a(null, "135 - Kedua PIN baru tidak sama.", getParent(), false, "Back");
            return;
        }
        if (s2.equals(s1))
        {
            a(null, "136 - PIN baru tidak boleh sama dengan PIN lama.", getParent(), false, "Back");
            return;
        }
        try
        {
            s1 = n.af.a((new StringBuilder(String.valueOf(s1))).append(":-:").append(n.ak[13]).toString());
            s2 = n.af.a((new StringBuilder(String.valueOf(s2))).append(":-:").append(n.ak[13]).toString());
            s = n.af.a((new StringBuilder(String.valueOf(s))).append(":-:").append(n.ak[13]).toString());
            g((new StringBuilder("PGI:!:AGPN:!:")).append(s1).append(":!:").append(s2).append(":!:").append(s).toString());
            return;
        }
        catch (d d1)
        {
            d1.printStackTrace();
        }
    }

    public final void a(int i)
    {
        g();
        if (n.l == 0x7f0200a7 && n.y != null)
        {
            n.y.c();
            n.y = null;
        }
    }

    public final void a(int i, String as[])
    {
        a(((Runnable) (new com.bca.mobile.transaction.a(this, as))));
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

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f030022);
        bundle = (TextView)findViewById(0x7f0b008e);
        TextView textview = (TextView)findViewById(0x7f0b0091);
        TextView textview1 = (TextView)findViewById(0x7f0b0094);
        a = (EditText)findViewById(0x7f0b008f);
        b = (EditText)findViewById(0x7f0b0092);
        c = (EditText)findViewById(0x7f0b0095);
        a.setKeyListener(bn.b());
        b.setKeyListener(bn.b());
        c.setKeyListener(bn.b());
        bundle.setText("PIN m-BCA saat ini:");
        textview.setText("PIN m-BCA yang baru:");
        textview1.setText("Ulangi PIN m-BCA yang baru:");
        n.f = true;
    }

    protected void onDestroy()
    {
        super.onDestroy();
        n.f = false;
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
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
        if (n.am != null)
        {
            n.am.a("Send", true);
        }
        if (n.v == null)
        {
            n.v = new g(this);
        }
        n.v.a(this);
    }
}
