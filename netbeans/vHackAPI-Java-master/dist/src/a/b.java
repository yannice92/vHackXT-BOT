// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// Referenced classes of package a:
//            i, g

public class b
    implements Comparable
{

    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private Date l;
    private String m;

    public b()
    {
        a = "";
        b = "";
        c = "";
        d = "";
        e = "";
        f = "";
        g = "";
        h = "";
        i = "";
        j = "";
        k = "";
        l = null;
        m = "";
    }

    public String a()
    {
        return a;
    }

    public void a(String s)
    {
        m = s;
    }

    public String b()
    {
        return b;
    }

    public void b(String s)
    {
        a = s;
        if (s.equals("04"))
        {
            b = a.i.a(a.i.b(a.i.a("3335313643363536")));
        } else
        {
            if (s.equals("14"))
            {
                b = a.i.a(a.i.b(a.i.a("343546363037303235353037")));
                return;
            }
            if (s.equals("24"))
            {
                b = a.i.a(a.i.b(a.i.a("343546363037303235353037303234353537453631363936")));
                return;
            }
            if (s.equals("34"))
            {
                b = a.i.a(a.i.b(a.i.a("353530373436313634373536303233353136433634364636")));
                return;
            }
            if (s.equals("44"))
            {
                b = a.i.a(a.i.b(a.i.a("3035353632373436313645363136")));
                return;
            }
        }
    }

    public String c()
    {
        return c;
    }

    public void c(String s)
    {
        c = s;
    }

    public int compareTo(b b1)
    {
        return b1.m().compareTo(m());
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((b)obj);
    }

    public String d()
    {
        return d;
    }

    public void d(String s)
    {
        d = s;
        e = (new DecimalFormat("#,###,###")).format(a.g.b(s));
        if (e.contains(","))
        {
            e = (new StringBuilder()).append(a.i.a(a.i.b(a.i.a("323530373032")))).append(e.replace(",", ".")).toString();
            return;
        } else
        {
            e = (new StringBuilder()).append(a.i.a(a.i.b(a.i.a("323530373032")))).append(e).toString();
            return;
        }
    }

    public String e()
    {
        return e;
    }

    public void e(String s)
    {
        f = s;
        g = (new DecimalFormat("#,###,###")).format(a.g.b(s));
        if (g.contains(","))
        {
            g = (new StringBuilder()).append(a.i.a(a.i.b(a.i.a("323530373032")))).append(g.replace(",", ".")).toString();
            return;
        } else
        {
            g = (new StringBuilder()).append(a.i.a(a.i.b(a.i.a("323530373032")))).append(g).toString();
            return;
        }
    }

    public String f()
    {
        return f;
    }

    public void f(String s)
    {
        h = s;
    }

    public String g()
    {
        return g;
    }

    public void g(String s)
    {
        i = s;
        j = a.g.a(s);
    }

    public String h()
    {
        return h;
    }

    public void h(String s)
    {
        k = s;
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyMMddHHmmss");
        try
        {
            l = simpledateformat.parse(a.g.c(s));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            l = null;
        }
    }

    public String i()
    {
        return i;
    }

    public String j()
    {
        return j;
    }

    public String k()
    {
        return k;
    }

    public Date l()
    {
        return l;
    }

    public String m()
    {
        return m;
    }
}
