// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.g;

import a.b;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bca.mobile.bn;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.g:
//            h, a

public final class g extends Fragment
{

    private ListView aa;
    private a ab;
    private View ac;
    private RelativeLayout ad;
    private RelativeLayout ae;
    private TextView af;

    public g()
    {
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        super.m();
        ac = layoutinflater.inflate(0x7f03002b, viewgroup, false);
        aa = (ListView)ac.findViewById(0x7f0b00be);
        ad = (RelativeLayout)ac.findViewById(0x7f0b00bb);
        ae = (RelativeLayout)ac.findViewById(0x7f0b00bc);
        af = (TextView)ae.findViewById(0x7f0b00bd);
        aa.setEmptyView(null);
        ad.setVisibility(0);
        ae.setVisibility(8);
        return ac;
    }

    public final void a(Activity activity)
    {
        super.a(activity);
    }

    public final void a(List list)
    {
        int j;
        int k;
label0:
        {
            ad.setVisibility(0);
            ae.setVisibility(8);
            if (list != null && list.size() > 0)
            {
                ad.setVisibility(8);
                k = list.size();
                int i = 0;
                while (k > 0 && (((b)list.get(k - 1)).i().equals(bn.a(0x7f0c003b)) && ((b)list.get(k - 1)).k().equals(bn.a(0x7f0c0039)))) 
                {
                    i++;
                    k--;
                }
                k = i;
                if (k != 10)
                {
                    break label0;
                }
                ae.setVisibility(0);
                af.setText(bn.a(0x7f0c0049));
            }
            return;
        }
        j = list.size();
_L6:
        if (j > 0) goto _L2; else goto _L1
_L1:
        j = 0;
_L4:
        if (j != 0)
        {
            Collections.sort(list, new h(this));
        }
        ab = new a(c(), list, k);
        aa.setAdapter(ab);
        return;
_L2:
        if (!((b)list.get(j - 1)).m().equals(bn.a(0x7f0c0038)) || ((b)list.get(j - 1)).h().equals(bn.a(0x7f0c003a)))
        {
            break; /* Loop/switch isn't completed */
        }
        j = 1;
        if (true) goto _L4; else goto _L3
_L3:
        j--;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void p()
    {
        super.p();
    }

    public final void q()
    {
        super.q();
        aa.setEmptyView(null);
        ad.setVisibility(0);
        ae.setVisibility(8);
    }
}
