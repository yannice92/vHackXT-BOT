// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;

public class i extends URLClassLoader
{

    public i(ClassLoader classloader, File file)
    {
        super(new URL[] {
            file.toURL()
        }, classloader);
        if (classloader == null)
        {
            throw new IllegalArgumentException("MyClassLoader requires a non-null delegation parent");
        } else
        {
            return;
        }
    }

    public static int a(char c1)
    {
        if (c1 >= '0' && c1 <= '9')
        {
            return c1 - 48;
        }
        if (c1 >= 'A' && c1 <= 'F')
        {
            return (c1 - 65) + 10;
        }
        if (c1 >= 'a' && c1 <= 'f')
        {
            return (c1 - 97) + 10;
        } else
        {
            return 0;
        }
    }

    public static String a(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        s = c(s);
        for (int j = 0; j < s.length; j++)
        {
            stringbuilder.append((char)s[j]);
        }

        return stringbuilder.toString();
    }

    public static byte[] a(InputStream inputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        byte abyte0[] = new byte[8192];
        do
        {
            int j = inputstream.read(abyte0);
            if (j > 0)
            {
                bytearrayoutputstream.write(abyte0, 0, j);
            } else
            {
                return bytearrayoutputstream.toByteArray();
            }
        } while (true);
    }

    public static byte[] a(byte abyte0[])
    {
        for (int j = 16; j < abyte0.length; j++)
        {
            abyte0[j] = (byte)(abyte0[j] ^ 0x5a);
        }

        return abyte0;
    }

    public static String b(String s)
    {
        String s1 = s;
        if (s.length() % 2 == 1)
        {
            s1 = (new StringBuilder()).append(s).append("0").toString();
        }
        s = new StringBuilder(s1.length());
        for (int j = 0; j < s1.length() / 2; j++)
        {
            s.append((new StringBuilder()).append(s1.substring(j * 2 + 1, j * 2 + 2)).append(s1.substring(j * 2, j * 2 + 1)).toString());
        }

        return s.toString();
    }

    public static byte[] c(String s)
    {
        int j = 1;
        int l = s.length();
        byte abyte0[] = new byte[(l + 1) / 2];
        int k;
        if (l % 2 == 1)
        {
            abyte0[0] = (byte)a(s.charAt(0));
            k = 1;
        } else
        {
            j = 0;
            k = 0;
        }
        while (k < l) 
        {
            int i1 = k + 1;
            int j1 = a(s.charAt(k));
            k = i1 + 1;
            abyte0[j] = (byte)(a(s.charAt(i1)) | j1 << 4);
            j++;
        }
        return abyte0;
    }

    public Class d(InputStream inputstream, String s, boolean flag)
    {
        Object obj;
        Object obj1;
        obj = findLoadedClass(s);
        obj1 = obj;
        if (obj != null) goto _L2; else goto _L1
_L1:
        Object obj2;
        Object obj3;
        obj3 = null;
        obj2 = null;
        obj1 = getParent().loadClass(s);
        obj2 = obj1;
        obj3 = obj1;
        ClassLoader classloader = ((Class) (obj1)).getClassLoader();
        obj2 = obj1;
        obj3 = obj1;
        ClassLoader classloader1 = getParent();
        if (classloader != classloader1)
        {
            obj = obj1;
        }
        obj2 = obj1;
        obj1 = obj;
        obj = obj2;
_L3:
        if (obj1 == null)
        {
            try
            {
                obj1 = e(inputstream, s);
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                obj1 = obj;
            }
        }
_L2:
        if (obj1 == null)
        {
            throw new ClassNotFoundException(s);
        }
        break MISSING_BLOCK_LABEL_137;
        obj1;
        obj1 = obj;
        obj = obj2;
          goto _L3
        obj1;
        obj1 = obj;
        obj = obj3;
          goto _L3
        if (flag)
        {
            resolveClass(((Class) (obj1)));
        }
        return ((Class) (obj1));
    }

    public Class d(String s, String s1, boolean flag)
    {
        Object obj;
        Object obj1;
        obj = findLoadedClass(s1);
        obj1 = obj;
        if (obj != null) goto _L2; else goto _L1
_L1:
        Object obj2;
        Object obj3;
        obj3 = null;
        obj2 = null;
        obj1 = getParent().loadClass(s1);
        obj2 = obj1;
        obj3 = obj1;
        ClassLoader classloader = ((Class) (obj1)).getClassLoader();
        obj2 = obj1;
        obj3 = obj1;
        ClassLoader classloader1 = getParent();
        if (classloader != classloader1)
        {
            obj = obj1;
        }
        obj2 = obj1;
        obj1 = obj;
        obj = obj2;
_L3:
        if (obj1 == null)
        {
            try
            {
                obj1 = e(s, s1);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                obj1 = obj;
            }
        }
_L2:
        if (obj1 == null)
        {
            throw new ClassNotFoundException(s1);
        }
        break MISSING_BLOCK_LABEL_137;
        obj1;
        obj1 = obj;
        obj = obj2;
          goto _L3
        obj1;
        obj1 = obj;
        obj = obj3;
          goto _L3
        if (flag)
        {
            resolveClass(((Class) (obj1)));
        }
        return ((Class) (obj1));
    }

    protected Class e(InputStream inputstream, String s)
    {
        try
        {
            inputstream = a(a(inputstream));
            inputstream = defineClass(s, inputstream, 0, inputstream.length);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new ClassNotFoundException(s);
        }
        return inputstream;
    }

    protected Class e(String s, String s1)
    {
        Object obj;
        obj = getResource(s);
        if (obj == null)
        {
            throw new ClassNotFoundException(s1);
        }
        s = null;
        InputStream inputstream = ((URL) (obj)).openStream();
        s = inputstream;
        obj = inputstream;
        byte abyte0[] = a(a(inputstream));
        s = inputstream;
        obj = inputstream;
        Class class1 = defineClass(s1, abyte0, 0, abyte0.length);
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return class1;
            }
        }
        return class1;
        obj;
        obj = s;
        throw new ClassNotFoundException(s1);
        s;
_L2:
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        throw s;
        s;
        obj = null;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
