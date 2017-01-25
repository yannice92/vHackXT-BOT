// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bca.mobile.n;

public final class b extends SQLiteOpenHelper
{

    private StringBuilder a;
    private StringBuilder b;
    private StringBuilder c;
    private StringBuilder d;
    private StringBuilder e;
    private StringBuilder f;
    private StringBuilder g;
    private StringBuilder h;

    public b(Context context)
    {
        super(context, "bca", null, n.w);
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
    }

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        a = new StringBuilder();
        a.append("CREATE TABLE IF NOT EXISTS ");
        a.append("profile");
        a.append('(');
        a.append("profile_crazy");
        a.append(')');
        b = new StringBuilder();
        b.append("CREATE TABLE IF NOT EXISTS ");
        b.append("inbox_info");
        b.append('(');
        b.append("inbox_id");
        b.append(" INTEGER PRIMARY KEY NOT NULL,");
        b.append("inbox_header");
        b.append(" VARCHAR(128) NOT NULL,");
        b.append("inbox_data");
        b.append(" VARCHAR(128) NOT NULL,");
        b.append("inbox_on_off");
        b.append(" VARCHAR(128) NOT NULL");
        b.append(')');
        c = new StringBuilder();
        c.append("CREATE TABLE IF NOT EXISTS ");
        c.append("inbox_transfer");
        c.append('(');
        c.append("inbox_id");
        c.append(" INTEGER PRIMARY KEY NOT NULL,");
        c.append("inbox_header");
        c.append(" VARCHAR(128) NOT NULL,");
        c.append("inbox_data");
        c.append(" VARCHAR(128) NOT NULL,");
        c.append("inbox_on_off");
        c.append(" VARCHAR(128) NOT NULL");
        c.append(')');
        d = new StringBuilder();
        d.append("CREATE TABLE IF NOT EXISTS ");
        d.append("inbox_payment");
        d.append('(');
        d.append("inbox_id");
        d.append(" INTEGER PRIMARY KEY NOT NULL,");
        d.append("inbox_header");
        d.append(" VARCHAR(128) NOT NULL,");
        d.append("inbox_data");
        d.append(" VARCHAR(128) NOT NULL,");
        d.append("inbox_on_off");
        d.append(" VARCHAR(128) NOT NULL");
        d.append(')');
        e = new StringBuilder();
        e.append("CREATE TABLE IF NOT EXISTS ");
        e.append("inbox_commerce");
        e.append('(');
        e.append("inbox_id");
        e.append(" INTEGER PRIMARY KEY NOT NULL,");
        e.append("inbox_header");
        e.append(" VARCHAR(128) NOT NULL,");
        e.append("inbox_data");
        e.append(" VARCHAR(128) NOT NULL,");
        e.append("inbox_on_off");
        e.append(" VARCHAR(128) NOT NULL");
        e.append(')');
        f = new StringBuilder();
        f.append("CREATE TABLE IF NOT EXISTS ");
        f.append("inbox_admin");
        f.append('(');
        f.append("inbox_id");
        f.append(" INTEGER PRIMARY KEY NOT NULL,");
        f.append("inbox_header");
        f.append(" VARCHAR(128) NOT NULL,");
        f.append("inbox_data");
        f.append(" VARCHAR(128) NOT NULL,");
        f.append("inbox_on_off");
        f.append(" VARCHAR(128) NOT NULL");
        f.append(')');
        g = new StringBuilder();
        g.append("CREATE TABLE IF NOT EXISTS ");
        g.append("app_constant");
        g.append('(');
        g.append("constant_name");
        g.append(" VARCHAR(128) PRIMARY KEY NOT NULL,");
        g.append("constant_value");
        g.append(" VARCHAR(128) NOT NULL");
        g.append(')');
        h = new StringBuilder();
        h.append("CREATE TABLE IF NOT EXISTS ");
        h.append("tujuan_valas");
        h.append('(');
        h.append("tujuan_valas_value");
        h.append(" VARCHAR(128) PRIMARY KEY NOT NULL");
        h.append(')');
        sqlitedatabase.execSQL(a.toString());
        sqlitedatabase.execSQL(b.toString());
        sqlitedatabase.execSQL(c.toString());
        sqlitedatabase.execSQL(d.toString());
        sqlitedatabase.execSQL(e.toString());
        sqlitedatabase.execSQL(f.toString());
        sqlitedatabase.execSQL(g.toString());
        sqlitedatabase.execSQL(h.toString());
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.setLength(0);
        stringbuilder.append("DROP TABLE IF EXISTS ");
        stringbuilder.append("profile");
        sqlitedatabase.execSQL(stringbuilder.toString());
        stringbuilder.setLength(0);
        stringbuilder.append("DROP TABLE IF EXISTS ");
        stringbuilder.append("inbox_info");
        sqlitedatabase.execSQL(stringbuilder.toString());
        stringbuilder.setLength(0);
        stringbuilder.append("DROP TABLE IF EXISTS ");
        stringbuilder.append("inbox_transfer");
        sqlitedatabase.execSQL(stringbuilder.toString());
        stringbuilder.setLength(0);
        stringbuilder.append("DROP TABLE IF EXISTS ");
        stringbuilder.append("inbox_payment");
        sqlitedatabase.execSQL(stringbuilder.toString());
        stringbuilder.setLength(0);
        stringbuilder.append("DROP TABLE IF EXISTS ");
        stringbuilder.append("inbox_commerce");
        sqlitedatabase.execSQL(stringbuilder.toString());
        stringbuilder.setLength(0);
        stringbuilder.append("DROP TABLE IF EXISTS ");
        stringbuilder.append("inbox_admin");
        sqlitedatabase.execSQL(stringbuilder.toString());
        stringbuilder.setLength(0);
        stringbuilder.append("DROP TABLE IF EXISTS ");
        stringbuilder.append("app_constant");
        sqlitedatabase.execSQL(stringbuilder.toString());
        stringbuilder.setLength(0);
        stringbuilder.append("DROP TABLE IF EXISTS ");
        stringbuilder.append("tujuan_valas");
        sqlitedatabase.execSQL(stringbuilder.toString());
        onCreate(sqlitedatabase);
    }
}
