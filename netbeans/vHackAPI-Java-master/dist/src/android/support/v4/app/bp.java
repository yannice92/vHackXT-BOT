// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;


// Referenced classes of package android.support.v4.app:
//            bu, ci

final class bp
{

    public static void a(android.app.Notification.Builder builder, bu bu1)
    {
        android.app.Notification.Action.Builder builder1 = new android.app.Notification.Action.Builder(bu1.a(), bu1.b(), bu1.c());
        if (bu1.e() != null)
        {
            android.app.RemoteInput aremoteinput[] = ci.a(bu1.e());
            int j = aremoteinput.length;
            for (int i = 0; i < j; i++)
            {
                builder1.addRemoteInput(aremoteinput[i]);
            }

        }
        if (bu1.d() != null)
        {
            builder1.addExtras(bu1.d());
        }
        builder.addAction(builder1.build());
    }
}
