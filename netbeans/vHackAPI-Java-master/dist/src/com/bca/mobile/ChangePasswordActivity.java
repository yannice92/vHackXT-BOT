// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import b.a.a.d;
import com.c.a;
import com.utilities.e;
import com.utilities.h;
import com.utilities.r;

// Referenced classes of package com.bca.mobile:
//            ShareActivity, n, bn, bq, 
//            g, h

public class ChangePasswordActivity extends ShareActivity
{

    EditText a;
    EditText b;
    EditText c;

    public ChangePasswordActivity()
    {
    }

    private boolean b(EditText edittext)
    {
        boolean flag = false;
        a a1 = new a(this);
        Object obj = a1;
        int j = n.ak.length;
        obj = a1;
        edittext = edittext.getText().toString();
        obj = a1;
        String s = (new StringBuilder(String.valueOf(edittext))).append(n.ak[9]).toString();
        obj = a1;
        n.ak[16] = h.a((new h(s.getBytes())).a());
        int i = 0;
_L3:
        if (i < j) goto _L2; else goto _L1
_L1:
        obj = a1;
        n.ae = new e(h.a((new h(edittext.getBytes())).a()));
        obj = a1;
        a1.b(n.ak);
        a1.b();
        flag = true;
_L5:
        return flag;
_L2:
        if (i != 1 && i != 9 && i != 11 && i != 12 && i != 13 && i != 15)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        obj = a1;
        n.ak[i] = n.af.a(n.ak[i]);
        i++;
          goto _L3
        edittext;
        obj = a1;
        edittext.printStackTrace();
        a1.b();
        return false;
        Exception exception;
        exception;
        edittext = null;
_L8:
        obj = edittext;
        exception.printStackTrace();
        if (edittext == null) goto _L5; else goto _L4
_L4:
        edittext.b();
        return false;
        edittext;
        obj = null;
_L7:
        if (obj != null)
        {
            ((a) (obj)).b();
        }
        throw edittext;
        edittext;
        if (true) goto _L7; else goto _L6
_L6:
        exception;
        edittext = a1;
          goto _L8
    }

    protected final void a()
    {
    }

    public final void a(int i)
    {
    }

    public final void a(int i, String as[])
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

    public final void d()
    {
        String s = a.getText().toString();
        String s1 = b.getText().toString();
        String s2 = c.getText().toString();
        int i = s.length();
        int j = s1.length();
        int k = s2.length();
        if (i != 6 || !r.c(s))
        {
            a(null, com.bca.mobile.bn.a(0x7f0c0068), this, false, "Back");
        } else
        {
            if (j == 0)
            {
                a(null, com.bca.mobile.bn.a(0x7f0c0069), this, false, "Back");
                return;
            }
            if (j != 6 || !r.c(s1))
            {
                a(null, com.bca.mobile.bn.a(0x7f0c0068), this, false, "Back");
                return;
            }
            if (k == 0)
            {
                a(null, com.bca.mobile.bn.a(0x7f0c006a), this, false, "Back");
                return;
            }
            if (k != 6 || !r.c(s2))
            {
                a(null, com.bca.mobile.bn.a(0x7f0c0068), this, false, "Back");
                return;
            }
            if (!s1.equals(s2))
            {
                a(null, com.bca.mobile.bn.a(0x7f0c006b), this, false, "Back");
                return;
            }
            if (s.equals(s2))
            {
                a(null, com.bca.mobile.bn.a(0x7f0c006c), this, false, "Back");
                return;
            }
            if (super.a(a))
            {
                if (b(c))
                {
                    com.bca.mobile.bn.a("login_tiem_lefe", 0);
                    a(com.bca.mobile.bn.a(0x7f0c0060), "Kode Akses Anda telah berhasil diubah.", this, true, com.bca.mobile.bn.a(0x7f0c002b));
                }
                com.bca.mobile.bn.a("reinstall", "0");
                com.bca.mobile.n.e = false;
                return;
            }
            if (com.bca.mobile.bn.a("login_tiem_lefe") == 0)
            {
                com.bca.mobile.bn.a("login_tiem_lefe", 1);
                a(com.bca.mobile.bn.a(0x7f0c0060), com.bca.mobile.bn.a(0x7f0c006d), this, false, com.bca.mobile.bn.a(0x7f0c0028));
                return;
            }
            if (com.bca.mobile.bn.a("login_tiem_lefe") == 1)
            {
                com.bca.mobile.bn.a("login_tiem_lefe", 2);
                a(com.bca.mobile.bn.a(0x7f0c0060), com.bca.mobile.bn.a(0x7f0c006e), this, false, com.bca.mobile.bn.a(0x7f0c0028));
                return;
            }
            if (com.bca.mobile.bn.a("login_tiem_lefe") == 2)
            {
                bn.b(this);
                com.bca.mobile.bn.a("reinstall", "1");
                n.ao = true;
                a(com.bca.mobile.bn.a(0x7f0c0060), com.bca.mobile.bn.a(0x7f0c006f), this, true, com.bca.mobile.bn.a(0x7f0c0028));
                return;
            }
        }
    }

    public void onBackPressed()
    {
        finish();
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f030021, this);
        super.c(getResources().getString(0x7f0c001c));
        bundle = (Button)findViewById(0x7f0b007a);
        Button button = (Button)findViewById(0x7f0b007c);
        a = (EditText)findViewById(0x7f0b0080);
        b = (EditText)findViewById(0x7f0b0085);
        c = (EditText)findViewById(0x7f0b008a);
        a.setKeyListener(new bq());
        b.setKeyListener(new bq());
        c.setKeyListener(new bq());
        a.setInputType(0x80000);
        b.setInputType(0x80000);
        c.setInputType(0x80000);
        bundle.setOnClickListener(new g(this));
        button.setOnClickListener(new com.bca.mobile.h(this));
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
}
