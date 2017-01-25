// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.f;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;
import b.a.a.d;
import com.bca.mobile.bn;
import com.bca.mobile.n;
import com.utilities.e;
import com.utilities.f;
import com.utilities.j;
import com.utilities.r;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.net.ConnectException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

// Referenced classes of package com.f:
//            d, c, b, e

public final class a extends Thread
{

    private static final byte a[] = {
        42, 42, 42, 69, 78, 68, 42, 42, 42
    };
    private long b;
    private String c;
    private int d;
    private SSLSocket e;
    private DataInputStream f;
    private DataOutputStream g;
    private com.f.e h;
    private com.f.d i;
    private Context j;
    private TimerTask k;
    private Timer l;
    private TimerTask m;
    private Timer n;

    public a(Context context, String s, int i1)
    {
        b = 0L;
        k = null;
        l = null;
        m = null;
        n = null;
        j = context;
        c = s;
        d = i1;
        n.aw = false;
    }

    static com.f.e a(a a1)
    {
        return a1.h;
    }

    private void a(boolean flag)
    {
        try
        {
            Thread.sleep(1000L);
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        c();
        n.ab = false;
        if (m != null)
        {
            m.cancel();
        }
        if (k != null)
        {
            k.cancel();
        }
        if (!n.aw)
        {
            a();
        }
        return;
    }

    static long b(a a1)
    {
        return a1.b;
    }

    private boolean b(String s)
    {
        boolean flag1 = true;
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (bn.b("isLogin", "0").equals("1") && !s.equals("LO"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        d();
        n.l = 0x7f0200a7;
        i.c(n.l);
        g.write(s.getBytes("UTF-8"));
        g.write(a);
        g.flush();
_L2:
        this;
        JVM INSTR monitorexit ;
        return flag1;
        s;
        Log.e("Network", "sent data failed", s);
        flag1 = false;
        continue; /* Loop/switch isn't completed */
        s;
        throw s;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void e()
    {
        if (bn.b("isLogin", "0").equals("1"))
        {
            n.ax = true;
            n.l = 0x7f0200a9;
            i.c(n.l);
        }
    }

    private void f()
    {
        b();
        m = new c(this);
        n = new Timer();
        n.schedule(m, 10000L, 30000L);
    }

    public final void a()
    {
        n.W = true;
        n.X = true;
        bn.a("color", "0");
        n.aD = true;
        if (n.u == null)
        {
            n.u = new com.bca.c.a(j);
        } else
        {
            n.u.a();
        }
        n.u.a(null);
        n.u.b();
    }

    public final void a(com.f.d d1)
    {
        i = d1;
    }

    public final void a(com.f.e e1)
    {
        h = e1;
    }

    public final boolean a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = false;
        boolean flag1 = b(n.ag.a(s));
        flag = flag1;
_L2:
        this;
        JVM INSTR monitorexit ;
        return flag;
        s;
        Log.e("Network", "sent encrypted data failed", s);
        if (true) goto _L2; else goto _L1
_L1:
        s;
        throw s;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        a("HB");
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        Log.e("Network", "send HB failed");
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
    }

    public final void c()
    {
        bn.a("color", "0");
        if (n != null)
        {
            n.cancel();
            n = null;
        }
        if (l != null)
        {
            l.cancel();
            l = null;
        }
        if (g != null)
        {
            a("LO");
            Thread.sleep(500L);
        }
        n.ab = false;
        Object obj;
        Exception exception2;
        try
        {
            if (f != null)
            {
                f.close();
            }
        }
        catch (Exception exception)
        {
            f = null;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            f = null;
            throw exception1;
        }
        f = null;
_L8:
        if (g != null)
        {
            g.close();
        }
        g = null;
_L6:
        Object obj1;
        try
        {
            if (e != null)
            {
                e.close();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            e = null;
            return;
        }
        finally
        {
            e = null;
        }
        e = null;
        return;
        obj;
        if (f != null)
        {
            f.close();
        }
        f = null;
_L1:
        if (g != null)
        {
            g.close();
        }
        g = null;
_L2:
        try
        {
            if (e != null)
            {
                e.close();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            e = null;
            return;
        }
        finally
        {
            e = null;
        }
        e = null;
        return;
        obj;
        f = null;
          goto _L1
        obj;
        f = null;
        throw obj;
        obj;
        g = null;
          goto _L2
        obj;
        g = null;
        throw obj;
        throw obj;
        obj;
        if (f != null)
        {
            f.close();
        }
        f = null;
_L3:
        if (g != null)
        {
            g.close();
        }
        g = null;
_L4:
        if (e != null)
        {
            e.close();
        }
        e = null;
_L5:
        throw obj;
        exception2;
        f = null;
          goto _L3
        obj;
        f = null;
        throw obj;
        exception2;
        g = null;
          goto _L4
        obj;
        g = null;
        throw obj;
        exception2;
        e = null;
          goto _L5
        obj;
        e = null;
        throw obj;
        obj1;
        g = null;
          goto _L6
        obj1;
        g = null;
        throw obj1;
        throw obj1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void d()
    {
        if (l != null)
        {
            l.cancel();
            l = null;
        }
        k = new b(this);
        l = new Timer();
        l.schedule(k, n.q);
    }

    public final void run()
    {
        if (!bn.a(0x7f0c0014).equals("http")) goto _L2; else goto _L1
_L1:
        j j1 = new j();
        SSLContext sslcontext = SSLContext.getInstance("TLS");
        SecureRandom securerandom = new SecureRandom();
        sslcontext.init(null, new TrustManager[] {
            j1
        }, securerandom);
        e = (SSLSocket)sslcontext.getSocketFactory().createSocket(c, d);
_L14:
        if (!e.isConnected()) goto _L4; else goto _L3
_L3:
        byte abyte0[];
        StringBuilder stringbuilder;
        f = new DataInputStream(e.getInputStream());
        g = new DataOutputStream(e.getOutputStream());
        abyte0 = new byte[1024];
        stringbuilder = new StringBuilder();
_L13:
        int i1;
        do
        {
            i1 = f.read(abyte0, 0, abyte0.length);
        } while (i1 <= 0);
        Object obj;
        obj = new byte[i1];
        System.arraycopy(abyte0, 0, obj, 0, i1);
        Object obj1;
        boolean flag;
        if (obj.length == 9 && Arrays.equals(a, ((byte []) (obj))))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (!i1)
        {
            break MISSING_BLOCK_LABEL_1297;
        }
        obj1 = stringbuilder.toString();
        obj = obj1;
        if (n.ab)
        {
            obj = n.ag.b(((String) (obj1)));
        }
        obj1 = ((String) (obj)).split(":!:", -1);
        if (obj1.length == 0) goto _L6; else goto _L5
_L5:
        obj = obj1[0];
        if (!((String) (obj)).equals("RDY")) goto _L8; else goto _L7
_L7:
        if (bn.b("isLogin", "0").equals("1"))
        {
            n.z = true;
        }
        obj = new StringBuilder();
        if (n.z) goto _L10; else goto _L9
_L9:
        obj1 = r.a(new String[] {
            n.O, n.az, n.aL, (String)n.aE.a(1), n.aq, n.H, n.N
        }, ":@:");
        obj1 = (new e(com.utilities.f.a(j, n.A))).a(((String) (obj1)));
        obj1 = n.ah.a(((String) (obj1)));
        ((StringBuilder) (obj)).append("NPROVIS");
        ((StringBuilder) (obj)).append(":!:");
        ((StringBuilder) (obj)).append(n.A);
        ((StringBuilder) (obj)).append(((String) (obj1)));
        ((StringBuilder) (obj)).append(":!:");
        ((StringBuilder) (obj)).append("AD");
_L15:
        b(((StringBuilder) (obj)).toString());
        b = Long.parseLong(com.utilities.d.a());
        if (bn.b("isProvision", "0").equals("1"))
        {
            bn.a("color", "1");
            n.l = 0x7f0200a7;
            i.c(n.l);
        }
_L16:
        if (n.ax) goto _L6; else goto _L11
_L11:
        flag = bn.b("isLogin", "0").equals("1");
        if (!flag) goto _L6; else goto _L12
_L12:
        String s;
        try
        {
            Thread.sleep(500L);
            n.l = 0x7f0200a8;
            i.c(n.l);
        }
        catch (InterruptedException interruptedexception) { }
_L6:
        stringbuilder.setLength(0);
          goto _L13
        obj;
          goto _L13
_L2:
        e = (SSLSocket)SSLSocketFactory.getDefault().createSocket(c, d);
          goto _L14
        obj;
          goto _L14
_L10:
        ((StringBuilder) (obj)).append("NLGIA");
        ((StringBuilder) (obj)).append(":!:");
        ((StringBuilder) (obj)).append(n.ak[0]);
        ((StringBuilder) (obj)).append(":@:");
        ((StringBuilder) (obj)).append(n.af.a(n.ak[13]));
        ((StringBuilder) (obj)).append(":@:");
        ((StringBuilder) (obj)).append("10");
        ((StringBuilder) (obj)).append(":@:");
        ((StringBuilder) (obj)).append("0");
        ((StringBuilder) (obj)).append(":@:");
        ((StringBuilder) (obj)).append("0");
        ((StringBuilder) (obj)).append(":@:");
        ((StringBuilder) (obj)).append(n.ak[11]);
        ((StringBuilder) (obj)).append(":@:");
        ((StringBuilder) (obj)).append(n.ak[12]);
        ((StringBuilder) (obj)).append(":@:");
        ((StringBuilder) (obj)).append(n.aq);
        ((StringBuilder) (obj)).append(":@:");
        ((StringBuilder) (obj)).append(n.ak[7]);
        ((StringBuilder) (obj)).append(":@:");
        ((StringBuilder) (obj)).append(n.ak[8]);
          goto _L15
        obj;
        a(true);
        e();
_L4:
        return;
_L8:
        if (!((String) (obj)).equals("NPROVISOk"))
        {
            break MISSING_BLOCK_LABEL_918;
        }
        n.ab = true;
        String as[];
        e e1;
        if (obj1.length > 2)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (!i1)
        {
            break MISSING_BLOCK_LABEL_831;
        }
        as = new String[obj1.length - 2];
        System.arraycopy(obj1, 2, as, 0, obj1.length - 2);
        n.V = r.a(as, ":!:");
        e1 = new e(com.utilities.f.a(n.A, n.az));
        n.ag = e1;
        obj1 = r.a(e1.b(obj1[1]), ":@:");
        n.q = Integer.parseInt(obj1[16]);
        h.a(((String) (obj)), ((String []) (obj1)));
        f();
        d();
          goto _L16
        obj;
        a(false);
        e();
        return;
        if (!((String) (obj)).equals("NLGIAOk"))
        {
            break MISSING_BLOCK_LABEL_1012;
        }
        n.ab = true;
        obj1 = n.af.b(obj1[1]).split(":@:", -1);
        n.q = Integer.parseInt(obj1[3]);
        h.a(((String) (obj)), ((String []) (obj1)));
        f();
        d();
        try
        {
            Thread.sleep(1000L);
            n.ax = false;
            n.l = 0x7f0200a8;
            i.c(n.l);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
          goto _L16
        if (((String) (obj)).compareTo("PEML") != 0)
        {
            break MISSING_BLOCK_LABEL_1261;
        }
        i1 = Integer.parseInt(obj1[1]);
        s = obj1[2].replaceAll(":@:", "\n");
        obj1 = obj1[3].replaceAll(":@:", "\n");
        obj = new com.c.a(j);
        i1;
        JVM INSTR tableswitch 8 12: default 1320
    //                   8 1176
    //                   9 1198
    //                   10 1219
    //                   11 1233
    //                   12 1247;
           goto _L17 _L18 _L19 _L20 _L21 _L22
_L17:
        break; /* Loop/switch isn't completed */
_L22:
        break MISSING_BLOCK_LABEL_1247;
_L23:
        ((com.c.a) (obj)).b();
_L24:
        MediaPlayer.create(j, 0x7f0200d4).start();
        n.k = true;
        if (bn.b("isLogin", "0").equals("1") && bn.b("color", "0").equals("1"))
        {
            n.l = 0x7f0200a8;
            i.c(n.l);
        }
          goto _L16
_L18:
        ((com.c.a) (obj)).a(s, ((String) (obj1)), "inbox_info");
          goto _L23
        obj1;
        ((com.c.a) (obj)).b();
          goto _L24
_L19:
        ((com.c.a) (obj)).a(s, ((String) (obj1)), "inbox_transfer");
          goto _L23
        obj1;
        ((com.c.a) (obj)).b();
        throw obj1;
_L20:
        ((com.c.a) (obj)).a(s, ((String) (obj1)), "inbox_payment");
          goto _L23
_L21:
        ((com.c.a) (obj)).a(s, ((String) (obj1)), "inbox_commerce");
          goto _L23
        ((com.c.a) (obj)).a(s, ((String) (obj1)), "inbox_admin");
          goto _L23
label0:
        {
            if (((String) (obj)).compareTo("HB") != 0)
            {
                break label0;
            }
            b = Long.parseLong(com.utilities.d.a());
        }
          goto _L16
        h.a(((String) (obj)), ((String []) (obj1)));
          goto _L16
        stringbuilder.append(new String(((byte []) (obj)), "UTF-8"));
          goto _L13
    }

}
