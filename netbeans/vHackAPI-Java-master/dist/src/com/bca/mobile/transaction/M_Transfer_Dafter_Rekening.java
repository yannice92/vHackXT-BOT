// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import b.a.a.d;
import com.bca.c.g;
import com.bca.mobile.ShareActivity;
import com.bca.mobile.TabSample;
import com.bca.mobile.af;
import com.bca.mobile.n;
import com.f.a;
import com.utilities.e;
import com.utilities.k;
import com.utilities.l;
import java.io.PrintStream;
import java.util.Date;

// Referenced classes of package com.bca.mobile.transaction:
//            di

public class M_Transfer_Dafter_Rekening extends ShareActivity
    implements android.view.View.OnFocusChangeListener
{

    public static String a = "";
    public static String b = "";
    public static String c = "";
    EditText d;
    EditText e;
    EditText f;

    public M_Transfer_Dafter_Rekening()
    {
    }

    protected final void a()
    {
label0:
        {
            String s = d.getText().toString();
            String s1 = e.getText().toString();
            String s2 = f.getText().toString();
            int i;
            int j;
            if (s.equals("") || s == null)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            if (!s1.equals(""))
            {
                i = j;
                if (s1 != null)
                {
                    break label0;
                }
            }
            i = j + 1;
        }
label1:
        {
            if (!s2.equals(""))
            {
                j = i;
                if (s2 != null)
                {
                    break label1;
                }
            }
            j = i + 1;
        }
        if (j == 3)
        {
            a(null, "110 - Anda belum menginput no rekening tujuan yang akan didaftarkan.", getParent(), false, "Back");
            return;
        }
        if ((s.equals(s1) || s.equals(s2) || s2.equals(s1)) && (j == 0 || j == 1))
        {
            a(null, "149 - No rekening tujuan yang Anda input tidak boleh sama.", getParent(), false, "Back");
            return;
        } else
        {
            super.f();
            return;
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
        a(((Runnable) (new di(this, as))));
    }

    protected final void a(String s)
    {
        String s1 = d.getText().toString();
        String s2 = e.getText().toString();
        String s3 = f.getText().toString();
        try
        {
            if (f(s))
            {
                Object obj = new Date();
                String s4 = com.utilities.d.a(((Date) (obj)));
                obj = com.utilities.d.b(((Date) (obj)));
                l l1 = k.a(this, com.utilities.n.a((new StringBuilder(String.valueOf(s1))).append(s2).append(s3).toString(), (new StringBuilder(String.valueOf(s4))).append(((String) (obj))).toString()), s4, ((String) (obj)));
                (new af(this, l1.a())).a();
                StringBuilder stringbuilder = new StringBuilder();
                stringbuilder.append("PGI");
                stringbuilder.append(":!:");
                stringbuilder.append("TDAR");
                stringbuilder.append(":!:");
                stringbuilder.append(s1);
                stringbuilder.append(":!:");
                stringbuilder.append(s2);
                stringbuilder.append(":!:");
                stringbuilder.append(s3);
                stringbuilder.append(":!:");
                stringbuilder.append(n.af.a((new StringBuilder(String.valueOf(s))).append(":-:").append(n.ak[13]).toString()));
                stringbuilder.append(":!:");
                stringbuilder.append(l1.b());
                stringbuilder.append(":!:");
                stringbuilder.append((new StringBuilder(String.valueOf(s4))).append(((String) (obj))).toString());
                System.out.println(stringbuilder.toString());
                g(stringbuilder.toString());
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
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

    public void onBackPressed()
    {
        a = "";
        b = "";
        c = "";
        super.onBackPressed();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f03005e);
        d = (EditText)findViewById(0x7f0b01ea);
        e = (EditText)findViewById(0x7f0b01ec);
        f = (EditText)findViewById(0x7f0b01ee);
        d.setText(a);
        e.setText(b);
        f.setText(c);
        d.setOnFocusChangeListener(this);
        e.setOnFocusChangeListener(this);
        f.setOnFocusChangeListener(this);
    }

    public void onFocusChange(View view, boolean flag)
    {
        if (flag)
        {
            ((EditText)view).setTextColor(getResources().getColor(0x7f08003d));
            return;
        } else
        {
            ((EditText)view).setTextColor(getResources().getColor(0x7f080036));
            return;
        }
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
