// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer.a;

import android.content.Context;
import android.util.Log;
import com.appsflyer.i;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.appsflyer.a:
//            b

public final class a
{

    private static a a = new a();

    private a()
    {
    }

    public static a a()
    {
        return a;
    }

    private static b a(File file)
    {
        Object obj = new FileReader(file);
        b b1;
        char ac[] = new char[(int)file.length()];
        ((FileReader) (obj)).read(ac);
        b1 = new b(ac);
        b1.a(file.getName());
        try
        {
            ((FileReader) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return b1;
        }
        return b1;
        file;
        file = null;
_L4:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        return null;
        file;
        obj = null;
_L2:
        if (obj != null)
        {
            try
            {
                ((FileReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw file;
        file;
        if (true) goto _L2; else goto _L1
_L1:
        file;
        file = ((File) (obj));
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(Context context)
    {
        try
        {
            if (!c(context).exists())
            {
                c(context).mkdir();
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.i(i.c, "Could not create cache directory");
        }
    }

    public static void a(b b1, Context context)
    {
        Object obj = null;
        File file;
        file = c(context);
        if (!file.exists())
        {
            file.mkdir();
            return;
        }
        File afile[] = file.listFiles();
        if (afile == null) goto _L2; else goto _L1
_L1:
        if (afile.length > 40)
        {
            Log.i(i.c, "reached cache limit, not caching request");
            return;
        }
          goto _L2
        b1;
        b1 = obj;
_L6:
        Log.i(i.c, "Could not cache request");
        Exception exception;
        if (b1 != null)
        {
            try
            {
                b1.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (b b1)
            {
                return;
            }
        } else
        {
            return;
        }
_L2:
        Log.i(i.c, "caching request...");
        context = new File(c(context), Long.toString(System.currentTimeMillis()));
        context.createNewFile();
        context = new OutputStreamWriter(new FileOutputStream(context.getPath(), true));
        context.write("version=");
        context.write(b1.a());
        context.write(10);
        context.write("url=");
        context.write(b1.c());
        context.write(10);
        context.write("data=");
        context.write(b1.b());
        context.write(10);
        context.flush();
        try
        {
            context.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (b b1)
        {
            return;
        }
        b1;
        context = null;
_L4:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        throw b1;
        b1;
        continue; /* Loop/switch isn't completed */
        exception;
        context = b1;
        b1 = exception;
        if (true) goto _L4; else goto _L3
_L3:
        b1;
        b1 = context;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static void a(String s, Context context)
    {
        context = new File(c(context), s);
        Log.i(i.c, (new StringBuilder("Deleting ")).append(s).append(" from cache").toString());
        if (!context.exists())
        {
            break MISSING_BLOCK_LABEL_53;
        }
        context.delete();
        return;
        context;
        Log.i(i.c, (new StringBuilder("Could not delete ")).append(s).append(" from cache").toString(), context);
        return;
    }

    public static List b(Context context)
    {
        ArrayList arraylist = new ArrayList();
        context = c(context);
        if (context.exists())
        {
            break MISSING_BLOCK_LABEL_27;
        }
        context.mkdir();
        return arraylist;
        int k;
        context = context.listFiles();
        k = context.length;
        int j = 0;
_L2:
        File file;
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        file = context[j];
        Log.i(i.c, (new StringBuilder("Found cached request")).append(file.getName()).toString());
        arraylist.add(a(file));
        j++;
        if (true) goto _L2; else goto _L1
        context;
        Log.i(i.c, "Could not cache request");
_L1:
        return arraylist;
    }

    private static File c(Context context)
    {
        return new File(context.getFilesDir(), "AFRequestCache");
    }

}
