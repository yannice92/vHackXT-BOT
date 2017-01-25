// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a;


public class d extends Exception
{

    private Throwable a;

    public d()
    {
    }

    public d(String s)
    {
        super(s);
    }

    public Throwable getCause()
    {
        return a;
    }
}
