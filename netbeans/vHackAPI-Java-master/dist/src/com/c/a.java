// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;
import b.a.a.d;
import com.bca.mobile.n;
import com.utilities.e;
import java.util.ArrayList;
import java.util.Hashtable;

// Referenced classes of package com.c:
//            b

public final class a
{

    public static boolean b = false;
    public SQLiteDatabase a;
    private Context c;
    private b d;
    private SQLiteDatabase e;
    private SQLiteStatement f;
    private SQLiteStatement g;
    private SQLiteStatement h;
    private SQLiteStatement i;
    private SQLiteStatement j;
    private SQLiteStatement k;
    private SQLiteStatement l;
    private SQLiteStatement m;

    public a(Context context)
    {
        c = null;
        d = null;
        e = null;
        a = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
_L3:
        boolean flag = b;
        if (flag) goto _L2; else goto _L1
_L1:
        b = true;
        c = context;
        d = new b(c);
        e = d.getWritableDatabase();
        a = d.getReadableDatabase();
        return;
_L2:
        Thread.sleep(100L);
          goto _L3
        Exception exception;
        exception;
          goto _L1
    }

    public final long a(String s, String s1)
    {
        String as[] = a(true);
        as[15] = s1;
        as[13] = s;
        try
        {
            b(as);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        return 0L;
    }

    public final long a(String s, String s1, String s2)
    {
        if (i == null)
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("INSERT INTO ");
            stringbuilder.append(s2);
            stringbuilder.append('(');
            stringbuilder.append("inbox_id");
            stringbuilder.append(",");
            stringbuilder.append("inbox_header");
            stringbuilder.append(",");
            stringbuilder.append("inbox_data");
            stringbuilder.append(",");
            stringbuilder.append("inbox_on_off");
            stringbuilder.append(')');
            stringbuilder.append("values(null,?,?,?)");
            i = e.compileStatement(stringbuilder.toString());
        }
        i.clearBindings();
        i.bindString(1, s);
        i.bindString(2, s1);
        i.bindString(3, "off");
        return i.executeInsert();
    }

    public final long a(String as[])
    {
        Object obj = "";
        if (f != null) goto _L2; else goto _L1
_L1:
        obj = new StringBuilder();
        int i1 = 0;
_L6:
        if (i1 < as.length) goto _L4; else goto _L3
_L3:
        obj = n.ae.a(((StringBuilder) (obj)).toString());
        f = e.compileStatement("INSERT INTO profile(profile_crazy)values(?)");
_L2:
        f.clearBindings();
        f.bindString(1, ((String) (obj)));
        return f.executeInsert();
_L4:
        ((StringBuilder) (obj)).append(as[i1]);
        if (as.length - 1 != i1)
        {
            ((StringBuilder) (obj)).append(":-:");
        }
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
        as;
        as.printStackTrace();
        return -1L;
    }

    public final ArrayList a(String s)
    {
        ArrayList arraylist;
        s = a.query(s, null, null, null, null, null, null);
        arraylist = new ArrayList();
        boolean flag;
        if (s.moveToFirst())
        {
            do
            {
                Hashtable hashtable = new Hashtable();
                hashtable.put("id", Integer.valueOf(s.getInt(0)));
                hashtable.put("header", s.getString(1));
                hashtable.put("data", s.getString(2));
                hashtable.put("pic", s.getString(3));
                arraylist.add(0, hashtable);
                flag = s.moveToNext();
            } while (flag);
        }
        s.close();
        return arraylist;
        Exception exception1;
        exception1;
        Log.i("error", (new StringBuilder("readFromInbox :")).append(exception1.toString()).toString());
        s.close();
        return arraylist;
        Exception exception;
        exception;
        s.close();
        throw exception;
    }

    public final void a()
    {
        e.delete("profile", null, null);
        e.delete("app_constant", null, null);
        e.delete("tujuan_valas", null, null);
    }

    public final String[] a(boolean flag)
    {
        Cursor cursor1 = a.query("profile", null, null, null, null, null, null);
        Cursor cursor = cursor1;
        int j1 = cursor1.getColumnCount();
        cursor = cursor1;
        if (!cursor1.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_172;
        }
_L4:
        cursor = cursor1;
        Object obj = new String[j1];
        int i1 = 0;
_L7:
        if (i1 < j1) goto _L2; else goto _L1
_L1:
        cursor = cursor1;
        if (cursor1.moveToNext()) goto _L4; else goto _L3
_L3:
        if (!flag) goto _L6; else goto _L5
_L5:
        cursor = cursor1;
        obj = n.ae.b(obj[0]).split(":-:", -1);
        cursor1.close();
        return ((String []) (obj));
_L2:
        cursor = cursor1;
        obj[i1] = cursor1.getString(i1);
        i1++;
          goto _L7
_L6:
        cursor1.close();
        return ((String []) (obj));
        obj;
        cursor1 = null;
_L11:
        cursor = cursor1;
        ((d) (obj)).printStackTrace();
        cursor1.close();
        return null;
        Exception exception;
        exception;
        cursor = null;
_L9:
        cursor.close();
        throw exception;
        exception;
        if (true) goto _L9; else goto _L8
_L8:
        obj;
        if (true) goto _L11; else goto _L10
_L10:
        obj = null;
          goto _L3
    }

    public final ArrayList b(String s)
    {
        ArrayList arraylist;
        s = a.query(s, null, null, null, null, null, null);
        arraylist = new ArrayList();
        boolean flag;
        if (s.moveToFirst())
        {
            do
            {
                Hashtable hashtable = new Hashtable();
                hashtable.put("id", Integer.valueOf(s.getInt(0)));
                hashtable.put("header", s.getString(1));
                hashtable.put("data", s.getString(2));
                hashtable.put("pic", s.getString(3));
                if (s.getString(3).equals("off"))
                {
                    arraylist.add(0, hashtable);
                }
                flag = s.moveToNext();
            } while (flag);
        }
        s.close();
        return arraylist;
        Exception exception1;
        exception1;
        Log.i("error", (new StringBuilder("readFromInbox :")).append(exception1.toString()).toString());
        s.close();
        return arraylist;
        Exception exception;
        exception;
        s.close();
        throw exception;
    }

    public final void b()
    {
        e.close();
        a.close();
        d.close();
        b = false;
    }

    public final void b(String s, String s1)
    {
        try
        {
            if (l == null)
            {
                StringBuilder stringbuilder = new StringBuilder();
                stringbuilder.append("UPDATE ");
                stringbuilder.append("app_constant");
                stringbuilder.append(" SET ");
                stringbuilder.append("constant_value");
                stringbuilder.append("=?");
                stringbuilder.append(" WHERE ");
                stringbuilder.append("constant_name");
                stringbuilder.append("=?");
                l = e.compileStatement(stringbuilder.toString());
            }
            g.clearBindings();
            g.bindString(1, s);
            g.bindString(2, s1);
            g.execute();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

    public final void b(String as[])
    {
        Object obj = "";
        if (g != null) goto _L2; else goto _L1
_L1:
        obj = new StringBuilder();
        int i1 = 0;
_L7:
        if (i1 < as.length) goto _L4; else goto _L3
_L3:
        obj = n.ae.a(((StringBuilder) (obj)).toString());
        g = e.compileStatement("UPDATE profile SET profile_crazy=?");
_L2:
        g.clearBindings();
        g.bindString(1, ((String) (obj)));
        g.execute();
        return;
_L4:
        ((StringBuilder) (obj)).append(as[i1]);
        if (as.length - 1 == i1) goto _L3; else goto _L5
_L5:
        ((StringBuilder) (obj)).append(":-:");
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
        as;
        as.printStackTrace();
        return;
    }

    public final String c(String s)
    {
        String s1 = null;
        s = a.query("app_constant", new String[] {
            "constant_value"
        }, "constant_name=?", new String[] {
            s
        }, null, null, null);
        s1 = s;
        if (!s.moveToFirst()) goto _L2; else goto _L1
_L1:
        s1 = s;
        String s2 = s.getString(0);
        s1 = s;
        boolean flag = s.moveToNext();
        if (flag) goto _L1; else goto _L3
_L3:
        s1 = s2;
_L8:
        s.close();
        return s1;
        Exception exception;
        exception;
        s = null;
_L6:
        s1 = s;
        exception.printStackTrace();
        s.close();
        return null;
        s;
_L5:
        s1.close();
        throw s;
        s;
        if (true) goto _L5; else goto _L4
_L4:
        exception;
        if (true) goto _L6; else goto _L2
_L2:
        s1 = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final String[] c()
    {
        Cursor cursor = a.query("tujuan_valas", null, null, null, null, null, null);
        Object obj = cursor;
        if (!cursor.moveToFirst()) goto _L2; else goto _L1
_L1:
        obj = cursor;
        String as[] = new String[1];
        obj = cursor;
        as[0] = cursor.getString(0);
        obj = cursor;
        boolean flag = cursor.moveToNext();
        if (flag) goto _L1; else goto _L3
_L3:
        obj = as;
_L8:
        cursor.close();
        return ((String []) (obj));
        Exception exception1;
        exception1;
        cursor = null;
_L6:
        obj = cursor;
        exception1.printStackTrace();
        cursor.close();
        return null;
        Exception exception;
        exception;
        obj = null;
_L5:
        ((Cursor) (obj)).close();
        throw exception;
        exception;
        if (true) goto _L5; else goto _L4
_L4:
        exception1;
        if (true) goto _L6; else goto _L2
_L2:
        obj = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final long d(String s)
    {
        if (m == null)
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("INSERT INTO ");
            stringbuilder.append("tujuan_valas");
            stringbuilder.append(" (");
            stringbuilder.append("tujuan_valas_value");
            stringbuilder.append(") ");
            stringbuilder.append("VALUES (?)");
            m = e.compileStatement(stringbuilder.toString());
        }
        m.clearBindings();
        m.bindString(1, s);
        return m.executeInsert();
    }

}
