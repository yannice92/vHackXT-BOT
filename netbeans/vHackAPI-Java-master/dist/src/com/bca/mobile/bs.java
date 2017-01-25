// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

final class bs
    implements TextWatcher
{

    private final EditText a;

    bs(EditText edittext)
    {
        a = edittext;
        super();
    }

    public final void afterTextChanged(Editable editable)
    {
        editable = editable.toString();
        if (editable.length() <= 1)
        {
            if (editable.equals("0"))
            {
                a.setText("");
            }
        } else
        if (editable.charAt(0) == '0')
        {
            editable = editable.substring(1, editable.length());
            a.setText(editable);
            return;
        }
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
