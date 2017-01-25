// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;

// Referenced classes of package android.support.v4.widget:
//            l

final class k extends Filter
{

    l a;

    k(l l1)
    {
        a = l1;
    }

    public final CharSequence convertResultToString(Object obj)
    {
        return a.convertToString((Cursor)obj);
    }

    protected final android.widget.Filter.FilterResults performFiltering(CharSequence charsequence)
    {
        charsequence = a.runQueryOnBackgroundThread(charsequence);
        android.widget.Filter.FilterResults filterresults = new android.widget.Filter.FilterResults();
        if (charsequence != null)
        {
            filterresults.count = charsequence.getCount();
            filterresults.values = charsequence;
            return filterresults;
        } else
        {
            filterresults.count = 0;
            filterresults.values = null;
            return filterresults;
        }
    }

    protected final void publishResults(CharSequence charsequence, android.widget.Filter.FilterResults filterresults)
    {
        charsequence = a.getCursor();
        if (filterresults.values != null && filterresults.values != charsequence)
        {
            a.changeCursor((Cursor)filterresults.values);
        }
    }
}
