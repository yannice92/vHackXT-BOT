// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.bca.c.g;
import com.bca.mobile.ShareActivity;
import com.bca.mobile.TabSample;
import com.bca.mobile.n;
import com.c.a;
import java.util.ArrayList;
import java.util.Hashtable;

// Referenced classes of package com.bca.mobile.transaction:
//            d

public class InboxActivity1 extends ShareActivity
    implements android.widget.AdapterView.OnItemClickListener
{

    ListView a;
    d b;
    a c;
    String d[];
    String e[];
    String f[];
    int g[];
    String h;
    ArrayList i;
    boolean j;
    private boolean k;

    public InboxActivity1()
    {
        k = false;
        a = null;
        j = true;
    }

    static boolean a(InboxActivity1 inboxactivity1)
    {
        return inboxactivity1.k;
    }

    private int d()
    {
        i = c.a(h);
        int i1 = i.size();
        g = new int[i1];
        d = new String[i1];
        e = new String[i1];
        f = new String[i1];
        int l = 0;
        do
        {
            if (l >= i1)
            {
                b.a(d);
                b.b(f);
                b.notifyDataSetInvalidated();
                return i1;
            }
            g[l] = ((Integer)((Hashtable)i.get(l)).get("id")).intValue();
            d[l] = (String)((Hashtable)i.get(l)).get("header");
            e[l] = (String)((Hashtable)i.get(l)).get("data");
            f[l] = (String)((Hashtable)i.get(l)).get("pic");
            l++;
        } while (true);
    }

    protected final void a()
    {
        if (!k)
        {
            n.am.a("Delete", true);
            k = true;
            b.notifyDataSetInvalidated();
        } else
        if (k)
        {
            ArrayList arraylist = b.a();
            int l = 0;
            do
            {
                if (l >= arraylist.size())
                {
                    k = false;
                    n.am.a("Edit", true);
                    b.notifyDataSetInvalidated();
                    return;
                }
                if (((Boolean)arraylist.get(l)).booleanValue())
                {
                    a(null, "Do you want to delete your selected message(s)?", getParent(), "OK", "Cancel");
                    return;
                }
                l++;
            } while (true);
        }
    }

    public final void a(int l)
    {
        g();
    }

    public final void a(int l, String as[])
    {
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
        Exception exception1;
        if (!j)
        {
            try
            {
                c = new a(this);
                d();
                k = false;
                n.am.a("Edit", true);
                b.notifyDataSetInvalidated();
            }
            catch (Exception exception)
            {
                c.b();
                return;
            }
            finally
            {
                c.b();
            }
            c.b();
        }
        return;
        throw exception1;
    }

    protected void onCreate(Bundle bundle)
    {
        super.a(bundle, 0x7f03002e);
        j = false;
        h = (String)n.m.get("inbox_service");
        n.am.a("Edit", true);
        c = new a(this);
        a = (ListView)findViewById(0x7f0b00c5);
        b = new d(this, this);
        if (d() <= 0)
        {
            a(null, "No message is saved.", getParent(), true, "Back");
            j = true;
        }
        a.setAdapter(b);
        a.invalidate();
        a.setChoiceMode(2);
        a.setOnItemClickListener(this);
        c.b();
        return;
        bundle;
        bundle.printStackTrace();
        c.b();
        return;
        bundle;
        c.b();
        throw bundle;
    }

    public void onItemClick(AdapterView adapterview, View view, int l, long l1)
    {
        if (a != adapterview)
        {
            break MISSING_BLOCK_LABEL_184;
        }
        a.getCheckedItemPosition();
        if (k)
        {
            break MISSING_BLOCK_LABEL_184;
        }
        view = n.x;
        String s = e[l];
        android.app.Activity activity = getParent();
        adapterview = "Back";
        if ("Back".equals(""))
        {
            adapterview = "Ok";
        }
        a(view, s, activity, false, 1, adapterview, "", false, false, true, 0, null, new String[0]);
        if (!f[l].equals("off"))
        {
            break MISSING_BLOCK_LABEL_184;
        }
        adapterview = new ContentValues();
        adapterview.put("inbox_on_off", "on");
        c = new a(getParent());
        c.a.update(h, adapterview, (new StringBuilder("inbox_id ='")).append(g[l]).append("'").toString(), new String[0]);
        d();
        c.b();
        return;
        adapterview;
        adapterview.printStackTrace();
        c.b();
        return;
        adapterview;
        c.b();
        throw adapterview;
    }

    public void onResultButtonCancel(View view)
    {
        try
        {
            c = new a(this);
            d();
            k = false;
            n.am.a("Edit", true);
            b.notifyDataSetInvalidated();
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            c.b();
            return;
        }
        finally
        {
            c.b();
        }
        c.b();
        return;
        throw view;
    }

    public void onResultButtonOK(View view)
    {
        if (j) goto _L2; else goto _L1
_L1:
        view = b.a();
        a(n.x, "Sending", "Cancel");
        c = new a(this);
        boolean flag;
        int l;
        l = 0;
        flag = false;
_L8:
        if (l < view.size()) goto _L4; else goto _L3
_L3:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        d();
        c.b();
_L6:
        g();
        k = false;
        n.am.a("Edit", true);
        b.notifyDataSetInvalidated();
_L2:
        return;
_L4:
        if (!((Boolean)view.get(l)).booleanValue())
        {
            break MISSING_BLOCK_LABEL_154;
        }
        c.a.delete(h, (new StringBuilder("inbox_id ='")).append(g[l]).append("'").toString(), new String[0]);
        flag = true;
        l++;
        continue; /* Loop/switch isn't completed */
        view;
        view.printStackTrace();
        c.b();
        if (true) goto _L6; else goto _L5
_L5:
        view;
        c.b();
        throw view;
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected void onResume()
    {
        super.onResume();
        if (n.v == null)
        {
            n.v = new g(this);
        }
        n.v.a(this);
    }
}
