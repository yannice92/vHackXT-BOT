// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.RemoteInput;

// Referenced classes of package android.support.v4.app:
//            ck

final class ci
{

    static RemoteInput[] a(ck ack[])
    {
        if (ack == null)
        {
            return null;
        }
        RemoteInput aremoteinput[] = new RemoteInput[ack.length];
        for (int i = 0; i < ack.length; i++)
        {
            ck ck1 = ack[i];
            aremoteinput[i] = (new android.app.RemoteInput.Builder(ck1.a())).setLabel(ck1.b()).setChoices(ck1.c()).setAllowFreeFormInput(ck1.d()).addExtras(ck1.e()).build();
        }

        return aremoteinput;
    }
}
