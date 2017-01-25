// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            ck

final class cm
{

    static Bundle[] a(ck ack[])
    {
        if (ack == null)
        {
            return null;
        }
        Bundle abundle[] = new Bundle[ack.length];
        for (int i = 0; i < ack.length; i++)
        {
            ck ck1 = ack[i];
            Bundle bundle = new Bundle();
            bundle.putString("resultKey", ck1.a());
            bundle.putCharSequence("label", ck1.b());
            bundle.putCharSequenceArray("choices", ck1.c());
            bundle.putBoolean("allowFreeFormInput", ck1.d());
            bundle.putBundle("extras", ck1.e());
            abundle[i] = bundle;
        }

        return abundle;
    }
}
