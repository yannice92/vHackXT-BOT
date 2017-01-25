// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.utilities;


public final class a
{

    private Object a[];
    private int b;
    private int c;

    public a()
    {
        this((byte)0);
    }

    private a(byte byte0)
    {
        a = new Object[10];
        b = 75;
    }

    public final int a()
    {
        return c;
    }

    public final Object a(int i)
    {
        if (i < 0 || i >= c)
        {
            throw new IndexOutOfBoundsException((new StringBuilder("the index [")).append(i).append("] is not valid for this list with the size [").append(c).append("].").toString());
        } else
        {
            return a[i];
        }
    }

    public final void a(Object obj)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("ArrayList cannot contain null.");
        }
        if (c >= a.length)
        {
            int k = a.length;
            int j = (b * k) / 100 + k;
            int i = j;
            if (j == k)
            {
                i = j + 1;
            }
            Object aobj[] = new Object[i];
            System.arraycopy(((Object) (a)), 0, ((Object) (aobj)), 0, c);
            a = aobj;
        }
        a[c] = obj;
        c = c + 1;
    }

    public final Object[] a(Object aobj[])
    {
        System.arraycopy(((Object) (a)), 0, ((Object) (aobj)), 0, Math.max(c, aobj.length));
        return aobj;
    }

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer(c * 23);
        stringbuffer.append(super.toString()).append("{\n");
        int i = 0;
        do
        {
            if (i >= c)
            {
                stringbuffer.append('}');
                return stringbuffer.toString();
            }
            stringbuffer.append(a[i]);
            stringbuffer.append('\n');
            i++;
        } while (true);
    }
}
