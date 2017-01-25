// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.utilities;

import android.content.Context;
import com.appsflyer.i;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

// Referenced classes of package com.utilities:
//            a

public final class r
{

    public static a a(String s)
    {
        a a1 = new a();
        if (s == null)
        {
            return null;
        }
        if (s.length() == 0) goto _L2; else goto _L1
_L1:
        StringBuilder stringbuilder;
        StringBuilder stringbuilder1;
        int k;
        k = s.length();
        stringbuilder = new StringBuilder();
        stringbuilder1 = new StringBuilder();
        int j = 0;
_L7:
        if (j < k)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        a1.a(stringbuilder.toString());
        a1.a(stringbuilder1.toString());
        return a1;
        char c1 = s.charAt(j);
        if (!Character.isLowerCase(c1)) goto _L4; else goto _L3
_L3:
        stringbuilder.append(Character.toUpperCase(c1));
        stringbuilder1.append("1");
          goto _L5
_L4:
        stringbuilder.append(c1);
        stringbuilder1.append("0");
          goto _L5
        s;
_L2:
        return null;
_L5:
        j++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static String a(String as[], String s)
    {
        StringBuilder stringbuilder = new StringBuilder(as[0]);
        int j = 1;
        do
        {
            if (j >= as.length)
            {
                return stringbuilder.toString();
            }
            stringbuilder.append(s);
            stringbuilder.append(as[j]);
            j++;
        } while (true);
    }

    public static void a(Context context, String s, int j)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("af_level", Integer.valueOf(9));
        hashmap.put("af_score", Integer.valueOf(j));
        i.a().a(context, s, hashmap);
    }

    public static String[] a(String s, String s1)
    {
        Vector vector;
        int j;
        try
        {
            vector = new Vector();
            j = s.indexOf(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
_L6:
        if (j >= 0) goto _L2; else goto _L1
_L1:
        vector.addElement(s);
        s = new String[vector.size()];
        if (vector.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        j = 0;
_L4:
        int k;
        try
        {
            k = vector.size();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return s;
        }
        if (j >= k)
        {
            return s;
        }
          goto _L3
_L2:
        vector.addElement(s.substring(0, j));
        s = s.substring(j + s1.length());
        j = s.indexOf(s1);
        continue; /* Loop/switch isn't completed */
_L3:
        s[j] = (String)vector.elementAt(j);
        j++;
          goto _L4
        return s;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static String b(String s)
    {
        String s1;
        if (s == null)
        {
            s1 = null;
        } else
        {
            if (s.length() == 0)
            {
                return "";
            }
            s1 = s;
            if (s.length() == 15)
            {
                StringBuilder stringbuilder = new StringBuilder();
                stringbuilder.append(s.substring(0, 6));
                stringbuilder.append('.');
                stringbuilder.append(s.substring(6, 8));
                stringbuilder.append('.');
                stringbuilder.append(s.substring(8, 14));
                stringbuilder.append('.');
                stringbuilder.append(s.substring(14));
                return stringbuilder.toString();
            }
        }
        return s1;
    }

    public static boolean c(String s)
    {
        boolean flag = true;
        if (s.length() == 6) goto _L2; else goto _L1
_L1:
        flag = false;
_L6:
        return flag;
_L2:
        int j;
        int k;
        k = s.length();
        j = 0;
_L7:
        int i1;
        if (j >= k)
        {
            j = 1;
        } else
        {
label0:
            {
                char c1 = s.toUpperCase().charAt(j);
                if (c1 >= 'A' && c1 <= 'Z' || c1 >= '0' && c1 <= '9')
                {
                    break label0;
                }
                j = 0;
            }
        }
        if (j == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = s.length();
        j = 0;
        k = 0;
_L8:
        if (j < i1) goto _L4; else goto _L3
_L3:
        if (k == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        k = s.length();
        j = 0;
_L9:
        if (j >= k)
        {
            j = 0;
        } else
        {
label1:
            {
                char c2 = s.charAt(j);
                if (c2 < '0' || c2 > '9')
                {
                    break label1;
                }
                j = 1;
            }
        }
        if (j != 0) goto _L6; else goto _L5
_L5:
        return false;
        j++;
          goto _L7
_L4:
        char c3 = s.toUpperCase().charAt(j);
        int l = k;
        if (c3 >= 'A')
        {
            l = k;
            if (c3 <= 'Z')
            {
                l = 1;
            }
        }
        j++;
        k = l;
          goto _L8
        j++;
          goto _L9
    }

    public static String d(String s)
    {
        String s1 = "";
        do
        {
            if (s.length() <= 3)
            {
                return (new StringBuilder(String.valueOf(s))).append(s1).toString();
            }
            s1 = (new StringBuilder(",")).append(s.substring(s.length() - 3)).append(s1).toString();
            s = s.substring(0, s.length() - 3);
        } while (true);
    }

    public static String e(String s)
    {
        int j = 0;
_L2:
        if (j >= 2)
        {
            return s;
        }
        char ac[] = s.toCharArray();
        int l = ac.length;
        s = "";
        int k = 0;
        do
        {
label0:
            {
                if (k < l / 2)
                {
                    break label0;
                }
                j++;
            }
            if (true)
            {
                continue;
            }
            s = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s))).append(ac[k]).toString()))).append(ac[l - 1 - k]).toString();
            k++;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }
}
