// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import com.bca.c.c;
import com.bca.c.d;
import com.bca.c.f;
import com.bca.mobile.transaction.TransactionListActivity;
import com.h.a;
import com.utilities.r;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile:
//            ShareActivity, ad, ab, ac, 
//            bn, n, ActivateActivity, bq

public class ProvisionCodeAccess extends ShareActivity
    implements c, a
{

    private EditText a;
    private EditText b;
    private Button c;

    public ProvisionCodeAccess()
    {
    }

    protected final void a()
    {
    }

    public final void a(int i)
    {
        a(((Runnable) (new ad(this))));
    }

    public final void a(int i, String as[])
    {
    }

    public final void a(Context context, int i, String s, String s1)
    {
        super.a(new ab(this, i));
    }

    protected final void a(String s)
    {
    }

    protected final void b()
    {
    }

    public final void b(int i)
    {
        super.a(new ac(this, i));
    }

    public final void b(String s)
    {
    }

    public final void c()
    {
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        com.bca.mobile.bn.a(this, true);
    }

    public void onCancel(DialogInterface dialoginterface)
    {
    }

    public void onClick(View view)
    {
        super.onClick(view);
        if (c != view) goto _L2; else goto _L1
_L1:
        String s;
        int i;
        s = a.getText().toString();
        view = b.getText().toString();
        i = b.getText().length();
        if (a.getText().length() < 0 || r.c(s)) goto _L4; else goto _L3
_L3:
        a(null, com.bca.mobile.bn.a(0x7f0c0068), this, false, com.bca.mobile.bn.a(0x7f0c0028));
_L2:
        return;
_L4:
        if (i == 0)
        {
            a(null, com.bca.mobile.bn.a(0x7f0c006a), this, false, com.bca.mobile.bn.a(0x7f0c0028));
            return;
        }
        if (i > 0 && !r.c(view))
        {
            a(null, com.bca.mobile.bn.a(0x7f0c0068), this, false, com.bca.mobile.bn.a(0x7f0c0028));
            return;
        }
        if (!view.equals(s))
        {
            break MISSING_BLOCK_LABEL_324;
        }
        if (n.y == null) goto _L2; else goto _L5
_L5:
        Exception exception1;
        r.a(getApplicationContext(), "mbca_prov_acccode", 100);
        if (n.ai[17].equals("true"))
        {
            Hashtable hashtable = new Hashtable();
            n.m = hashtable;
            hashtable.put("pw", view);
            startActivity(new Intent(this, com/bca/mobile/ActivateActivity));
            finish();
            return;
        }
        if ((new f(a.getText().toString(), this)).a())
        {
            startActivity(new Intent(this, com/bca/mobile/transaction/TransactionListActivity));
            finish();
            return;
        }
        view = new com.c.a(this);
        try
        {
            ((com.c.a) (view)).a.delete("profile", null, null);
            ((com.c.a) (view)).a.delete("app_constant", null, null);
            finish();
        }
        catch (Exception exception)
        {
            view.b();
            return;
        }
        finally
        {
            view.b();
        }
        view.b();
        return;
        throw exception1;
        a(null, com.bca.mobile.bn.a(0x7f0c006b), this, false, "Back");
        return;
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f030068, this);
        super.c(getResources().getString(0x7f0c004a));
        if (n.s != null)
        {
            n.s.a(this);
        }
        a = (EditText)findViewById(0x7f0b0230);
        b = (EditText)findViewById(0x7f0b0232);
        bundle = new bq();
        a.setKeyListener(bundle);
        b.setKeyListener(bundle);
        a.setInputType(0x80000);
        b.setInputType(0x80000);
        c = (Button)findViewById(0x7f0b0233);
        c.setOnClickListener(this);
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
