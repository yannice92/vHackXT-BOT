// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bca.mobile.transaction;

import android.widget.Button;
import android.widget.CompoundButton;
import java.util.ArrayList;

// Referenced classes of package com.bca.mobile.transaction:
//            M_Admin_Hapus_Trans_Ant_Rek

final class y
    implements android.widget.CompoundButton.OnCheckedChangeListener
{

    final M_Admin_Hapus_Trans_Ant_Rek a;

    y(M_Admin_Hapus_Trans_Ant_Rek m_admin_hapus_trans_ant_rek)
    {
        a = m_admin_hapus_trans_ant_rek;
        super();
    }

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (a.e) goto _L2; else goto _L1
_L1:
        int i = 0;
_L10:
        if (i < a.b.size()) goto _L3; else goto _L2
_L2:
        int j;
        int k;
        if (M_Admin_Hapus_Trans_Ant_Rek.a(a) == 0)
        {
            a.d.setText("Delete");
            return;
        } else
        {
            a.d.setText((new StringBuilder("Delete (")).append(M_Admin_Hapus_Trans_Ant_Rek.a(a)).append(")").toString());
            return;
        }
_L3:
        if (i != ((Integer)compoundbutton.getTag()).intValue()) goto _L5; else goto _L4
_L4:
        if (!flag) goto _L7; else goto _L6
_L6:
        if (a.a.size() != 0) goto _L9; else goto _L8
_L8:
        a.a.add(Integer.valueOf(i));
        M_Admin_Hapus_Trans_Ant_Rek m_admin_hapus_trans_ant_rek = a;
        M_Admin_Hapus_Trans_Ant_Rek.a(m_admin_hapus_trans_ant_rek, M_Admin_Hapus_Trans_Ant_Rek.a(m_admin_hapus_trans_ant_rek) + 1);
_L5:
        i++;
          goto _L10
_L9:
        j = 0;
_L12:
        if (j >= a.a.size())
        {
            j = 0;
        } else
        {
label0:
            {
                if (((Integer)a.a.get(j)).intValue() != i)
                {
                    break label0;
                }
                j = 1;
            }
        }
        if (j != 0) goto _L5; else goto _L11
_L11:
        k = a.a.size();
        j = 0;
_L13:
        if (j < k)
        {
            if (i <= ((Integer)a.a.get(j)).intValue())
            {
                break MISSING_BLOCK_LABEL_267;
            }
            a.a.add(j, Integer.valueOf(i));
            M_Admin_Hapus_Trans_Ant_Rek m_admin_hapus_trans_ant_rek1 = a;
            M_Admin_Hapus_Trans_Ant_Rek.a(m_admin_hapus_trans_ant_rek1, M_Admin_Hapus_Trans_Ant_Rek.a(m_admin_hapus_trans_ant_rek1) + 1);
        }
          goto _L5
        j++;
          goto _L12
        if (j == k - 1)
        {
            M_Admin_Hapus_Trans_Ant_Rek m_admin_hapus_trans_ant_rek2 = a;
            M_Admin_Hapus_Trans_Ant_Rek.a(m_admin_hapus_trans_ant_rek2, M_Admin_Hapus_Trans_Ant_Rek.a(m_admin_hapus_trans_ant_rek2) + 1);
            a.a.add(Integer.valueOf(i));
        }
        j++;
          goto _L13
_L7:
        j = 0;
_L14:
        if (j < a.a.size())
        {
label1:
            {
                if (((Integer)a.a.get(j)).intValue() != i)
                {
                    break label1;
                }
                a.a.remove(j);
                M_Admin_Hapus_Trans_Ant_Rek m_admin_hapus_trans_ant_rek3 = a;
                M_Admin_Hapus_Trans_Ant_Rek.a(m_admin_hapus_trans_ant_rek3, M_Admin_Hapus_Trans_Ant_Rek.a(m_admin_hapus_trans_ant_rek3) - 1);
            }
        }
          goto _L5
        j++;
          goto _L14
    }
}
