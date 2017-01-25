// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.utilities;

import java.io.IOException;
import java.io.Reader;
import java.util.Hashtable;

public final class u
{

    public boolean a;
    private Hashtable b;
    private int c;
    private String d[];
    private Reader e;
    private boolean f;
    private char g[];
    private int h;
    private int i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private int n;
    private char o[];
    private int p;
    private int q;
    private String r;
    private boolean s;
    private String t;
    private boolean u;
    private int v;
    private String w[];
    private String x[] = {
        "Start Document", "End Document", "Start Tag", "End Tag", "Text"
    };
    private boolean y;

    public u(Reader reader)
    {
        this(reader, (byte)0);
    }

    private u(Reader reader, byte byte0)
    {
        a = false;
        d = new String[4];
        boolean flag;
        if (Runtime.getRuntime().freeMemory() >= 0x100000L)
        {
            byte0 = 8192;
        } else
        {
            byte0 = 128;
        }
        g = new char[byte0];
        o = new char[128];
        w = new String[16];
        e = reader;
        f = true;
        m = reader.read();
        n = reader.read();
        if (m == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = flag;
        b = new Hashtable();
        b.put("amp", "&");
        b.put("apos", "'");
        b.put("gt", ">");
        b.put("lt", "<");
        b.put("quot", "\"");
        k = 1;
        l = 1;
    }

    private final void a(char c1)
    {
label0:
        {
            if (f() != c1)
            {
                if (!a)
                {
                    break label0;
                }
                if (c1 <= ' ')
                {
                    g();
                    f();
                }
            }
            return;
        }
        a((new StringBuilder("expected: '")).append(c1).append("'").toString());
    }

    private final void a(String s1)
    {
        StringBuilder stringbuilder = (new StringBuilder(String.valueOf(s1))).append(" pos: ");
        if (q < x.length)
        {
            s1 = x[q];
        } else
        {
            s1 = "Other";
        }
        s1 = new StringBuffer(s1);
        s1.append((new StringBuilder(" @")).append(k).append(":").append(l).append(": ").toString());
        if (q == 2 || q == 3)
        {
            s1.append('<');
            if (q == 3)
            {
                s1.append('/');
            }
            s1.append(t);
            s1.append('>');
        } else
        if (s)
        {
            s1.append("[whitespace]");
        } else
        {
            s1.append(a());
        }
        throw new IOException(stringbuilder.append(s1.toString()).toString());
    }

    private final void a(boolean flag)
    {
        String s1;
        byte byte0;
        int i1;
        byte0 = 45;
        f();
        i1 = f();
        if (i1 == 63)
        {
            byte0 = 63;
            s1 = "";
        } else
        if (i1 == 33)
        {
            if (m == 45)
            {
                s1 = "--";
            } else
            if (m == 91)
            {
                q = 4;
                flag = true;
                s1 = "[CDATA[";
                byte0 = 93;
            } else
            {
                s1 = "DOCTYPE";
                byte0 = -1;
            }
        } else
        {
            if (i1 != 91)
            {
                a((new StringBuilder("cantreachme: ")).append(i1).toString());
            }
            s1 = "CDATA[";
            byte0 = 93;
        }
_L9:
        i1 = 0;
_L5:
        if (i1 < s1.length()) goto _L2; else goto _L1
_L1:
        if (byte0 != -1) goto _L4; else goto _L3
_L3:
        i();
_L7:
        return;
_L2:
        a(s1.charAt(i1));
        i1++;
          goto _L5
_L4:
        int j1;
        do
        {
            if (j)
            {
                a("Unexpected EOF");
            }
            j1 = f();
            if (flag)
            {
                c(j1);
            }
        } while (byte0 != 63 && j1 != byte0 || m != byte0 || n != 62);
        f();
        f();
        if (!flag || byte0 == 63) goto _L7; else goto _L6
_L6:
        d(p - 1);
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private static final String[] a(String as[], int i1)
    {
        if (as.length >= i1)
        {
            return as;
        } else
        {
            String as1[] = new String[i1 + 16];
            System.arraycopy(as, 0, as1, 0, as.length);
            return as1;
        }
    }

    private final void c(int i1)
    {
        if (i1 == 0)
        {
            return;
        }
        if (p == o.length)
        {
            char ac[] = new char[(p * 4) / 3 + 4];
            System.arraycopy(o, 0, ac, 0, p);
            o = ac;
        }
        char ac1[] = o;
        int j1 = p;
        p = j1 + 1;
        ac1[j1] = (char)i1;
    }

    private final String d(int i1)
    {
        String s1 = new String(o, i1, p - i1);
        p = i1;
        return s1;
    }

    private final boolean e(int i1)
    {
        boolean flag = true;
        do
        {
            int j1;
            for (j1 = m; j || j1 == i1 || i1 == 32 && (j1 <= 32 || j1 == 62);)
            {
                return flag;
            }

            if (j1 == 38)
            {
                if (!l())
                {
                    flag = false;
                }
            } else
            {
                if (j1 > 32)
                {
                    flag = false;
                }
                c(f());
            }
        } while (true);
    }

    private final int f()
    {
        int i1 = m;
        m = n;
        if (y)
        {
            k = k + 1;
            l = 0;
            y = false;
        }
        if (m == -1)
        {
            j = true;
            return i1;
        }
        if (i1 == 10 || i1 == 13 && m != 10)
        {
            y = true;
        }
        l = l + 1;
        if (h >= i)
        {
            i = e.read(g, 0, g.length);
            if (i <= 0)
            {
                n = -1;
                return i1;
            }
            h = 0;
        }
        char ac[] = g;
        int j1 = h;
        h = j1 + 1;
        n = ac[j1];
        return i1;
    }

    private final boolean f(int i1)
    {
        boolean flag = true;
        do
        {
            int j1;
            for (j1 = m; j || j1 == i1 || i1 == 32 && (j1 <= 32 || j1 == 62);)
            {
                return flag;
            }

            if (j1 > 32)
            {
                flag = false;
            }
            c(f());
            j1 = m;
        } while (true);
    }

    private final void g()
    {
        do
        {
            if (j || m > 32)
            {
                return;
            }
            f();
        } while (true);
    }

    private final String h()
    {
        int i1 = p;
        int j1 = m;
        if ((j1 < 97 || j1 > 122) && (j1 < 65 || j1 > 90) && j1 != 95 && j1 != 58 && !a)
        {
            a("name expected");
        }
        do
        {
            c(f());
            j1 = m;
        } while (j1 >= 97 && j1 <= 122 || j1 >= 65 && j1 <= 90 || j1 >= 48 && j1 <= 57 || j1 == 95 || j1 == 45 || j1 == 58 || j1 == 46);
        return d(i1);
    }

    private final void i()
    {
        int i1 = 1;
        int j1;
        do
        {
label0:
            do
            {
                switch (f())
                {
                default:
                    break;

                case -1: 
                    a("Unexpected EOF");
                    break;

                case 60: // '<'
                    i1++;
                    break;

                case 62: // '>'
                    j1 = i1 - 1;
                    break label0;
                }
            } while (true);
            i1 = j1;
        } while (j1 != 0);
    }

    private final void j()
    {
        f();
        f();
        t = h();
        if (c == 0 && !a)
        {
            a("element stack empty");
        }
        if (!t.equals(d[c - 1])) goto _L2; else goto _L1
_L1:
        c = c - 1;
_L4:
        g();
        a('>');
        return;
_L2:
        if (!a)
        {
            a((new StringBuilder("expected: ")).append(d[c]).toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private final int k()
    {
        switch (m)
        {
        default:
            return 4;

        case -1: 
            return 1;

        case 38: // '&'
            return 6;

        case 60: // '<'
            switch (n)
            {
            default:
                return 2;

            case 47: // '/'
                return 3;

            case 91: // '['
                return 5;

            case 33: // '!'
            case 63: // '?'
                return 999;
            }
        }
    }

    private boolean l()
    {
        int i1;
        boolean flag;
        boolean flag1;
        flag = true;
        flag1 = true;
        f();
        i1 = p;
_L7:
        if (!j && m != 59) goto _L2; else goto _L1
_L1:
        String s3;
        s3 = d(i1);
        f();
        if (s3.length() <= 0 || s3.charAt(0) != '#') goto _L4; else goto _L3
_L3:
        if (s3.charAt(1) == 'x')
        {
            i1 = Integer.parseInt(s3.substring(2), 16);
        } else
        {
            i1 = Integer.parseInt(s3.substring(1));
        }
        c(i1);
        if (i1 > 32) goto _L6; else goto _L5
_L5:
        return flag1;
_L2:
        c(f());
          goto _L7
_L6:
        return false;
_L4:
        String s1;
        String s2 = (String)b.get(s3);
        s1 = s2;
        if (s2 == null)
        {
            s1 = (new StringBuilder("&")).append(s3).append(";").toString();
        }
        i1 = 0;
_L9:
        flag1 = flag;
        if (i1 >= s1.length()) goto _L5; else goto _L8
_L8:
        char c1 = s1.charAt(i1);
        if (c1 > ' ')
        {
            flag = false;
        }
        c(c1);
        i1++;
          goto _L9
    }

    public final String a()
    {
        if (r == null)
        {
            r = d(0);
        }
        return r;
    }

    public final String a(int i1)
    {
        if (i1 >= v)
        {
            throw new IndexOutOfBoundsException();
        } else
        {
            return w[i1 << 1];
        }
    }

    public final String b()
    {
        return t;
    }

    public final String b(int i1)
    {
        if (i1 >= v)
        {
            throw new IndexOutOfBoundsException();
        } else
        {
            return w[(i1 << 1) + 1];
        }
    }

    public final int c()
    {
        return v;
    }

    public final int d()
    {
        return q;
    }

    public final int e()
    {
        boolean flag = false;
        if (u)
        {
            q = 3;
            u = false;
            c = c - 1;
            return q;
        }
        p = 0;
        s = true;
_L9:
        v = 0;
        t = null;
        r = null;
        q = k();
        q;
        JVM INSTR tableswitch 1 6: default 562
    //                   1 113
    //                   2 198
    //                   3 519
    //                   4 526
    //                   5 544
    //                   6 168;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        a(false);
_L2:
        if (q > 4 || q == 4 && k() >= 4) goto _L9; else goto _L8
_L8:
        boolean flag1 = s;
        int i1 = ((flag) ? 1 : 0);
        if (q == 4)
        {
            i1 = 1;
        }
        try
        {
            s = i1 & flag1;
        }
        catch (IOException ioexception)
        {
            q = 1;
        }
        return q;
_L7:
        s = s & l();
        q = 4;
          goto _L2
_L3:
        f();
        t = h();
        d = a(d, c + 1);
        String as[] = d;
        i1 = c;
        c = i1 + 1;
        as[i1] = t;
_L23:
        g();
        i1 = m;
        if (i1 != 47) goto _L11; else goto _L10
_L10:
        u = true;
        f();
        g();
        a('>');
          goto _L2
_L11:
        if (i1 != 62) goto _L13; else goto _L12
_L12:
        f();
          goto _L2
_L13:
        if (i1 != -1) goto _L15; else goto _L14
_L14:
        a("Unexpected EOF");
_L15:
        String s1;
        int j1;
        s1 = h();
        if (s1.length() == 0)
        {
            a("attr name expected");
        }
        g();
        a('=');
        g();
        j1 = f();
        i1 = j1;
        if (j1 == 39) goto _L17; else goto _L16
_L16:
        i1 = j1;
        if (j1 == 34) goto _L17; else goto _L18
_L18:
        if (!a)
        {
            a((new StringBuilder("<")).append(t).append(">: invalid delimiter: ").append((char)j1).toString());
        }
          goto _L19
_L17:
        j1 = v;
        v = j1 + 1;
        j1 <<= 1;
        int k1;
        w = a(w, j1 + 4);
        w[j1] = s1;
        k1 = p;
        if (!f) goto _L21; else goto _L20
_L20:
        e(i1);
_L24:
        w[j1 + 1] = d(k1);
        if (i1 == 32) goto _L23; else goto _L22
_L22:
        f();
          goto _L23
_L21:
        f(i1);
          goto _L24
_L4:
        j();
          goto _L2
_L5:
        s = s & e(60);
          goto _L2
_L6:
        a(true);
        s = false;
        q = 4;
          goto _L2
_L19:
        i1 = 32;
          goto _L17
    }
}
