// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

// Referenced classes of package android.support.v7.app:
//            AlertController

public class mInflater
{

    public ListAdapter mAdapter;
    public boolean mCancelable;
    public int mCheckedItem;
    public boolean mCheckedItems[];
    public final Context mContext;
    public Cursor mCursor;
    public View mCustomTitleView;
    public boolean mForceInverseBackground;
    public Drawable mIcon;
    public int mIconAttrId;
    public int mIconId;
    public final LayoutInflater mInflater;
    public String mIsCheckedColumn;
    public boolean mIsMultiChoice;
    public boolean mIsSingleChoice;
    public CharSequence mItems[];
    public String mLabelColumn;
    public CharSequence mMessage;
    public android.content.ner mNegativeButtonListener;
    public CharSequence mNegativeButtonText;
    public android.content.ner mNeutralButtonListener;
    public CharSequence mNeutralButtonText;
    public android.content.ener mOnCancelListener;
    public android.content.eClickListener mOnCheckboxClickListener;
    public android.content.ner mOnClickListener;
    public android.content.tener mOnDismissListener;
    public android.widget.stener mOnItemSelectedListener;
    public android.content.r mOnKeyListener;
    public OnPrepareListViewListener mOnPrepareListViewListener;
    public android.content.ner mPositiveButtonListener;
    public CharSequence mPositiveButtonText;
    public boolean mRecycleOnMeasure;
    public CharSequence mTitle;
    public View mView;
    public int mViewLayoutResId;
    public int mViewSpacingBottom;
    public int mViewSpacingLeft;
    public int mViewSpacingRight;
    public boolean mViewSpacingSpecified;
    public int mViewSpacingTop;

    private void createListView(final AlertController dialog)
    {
        final ListView listView = (ListView)mInflater.inflate(AlertController.access$800(dialog), null);
        class _cls1 extends ArrayAdapter
        {

            final AlertController.AlertParams this$0;
            final ListView val$listView;

            public View getView(int j, View view, ViewGroup viewgroup)
            {
                view = super.getView(j, view, viewgroup);
                if (mCheckedItems != null && mCheckedItems[j])
                {
                    listView.setItemChecked(j, true);
                }
                return view;
            }

            _cls1(int i, int j, CharSequence acharsequence[], ListView listview)
            {
                this$0 = AlertController.AlertParams.this;
                listView = listview;
                super(final_context, i, j, acharsequence);
            }
        }

        class OnPrepareListViewListener
        {

            public abstract void onPrepareListView(ListView listview);
        }

        class _cls3
            implements android.widget.AdapterView.OnItemClickListener
        {

            final AlertController.AlertParams this$0;
            final AlertController val$dialog;

            public void onItemClick(AdapterView adapterview, View view, int j, long l)
            {
                mOnClickListener.onClick(AlertController.access$600(dialog), j);
                if (!mIsSingleChoice)
                {
                    AlertController.access$600(dialog).dismiss();
                }
            }

            _cls3()
            {
                this$0 = AlertController.AlertParams.this;
                dialog = alertcontroller;
                super();
            }
        }

        class _cls2 extends CursorAdapter
        {

            private final int mIsCheckedIndex;
            private final int mLabelIndex;
            final AlertController.AlertParams this$0;
            final AlertController val$dialog;
            final ListView val$listView;

            public void bindView(View view, Context context, Cursor cursor)
            {
                ((CheckedTextView)view.findViewById(0x1020014)).setText(cursor.getString(mLabelIndex));
                view = listView;
                int j = cursor.getPosition();
                boolean flag;
                if (cursor.getInt(mIsCheckedIndex) == 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view.setItemChecked(j, flag);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
            {
                return mInflater.inflate(AlertController.access$900(dialog), viewgroup, false);
            }

            _cls2(boolean flag, ListView listview, AlertController alertcontroller)
            {
                this$0 = AlertController.AlertParams.this;
                listView = listview;
                dialog = alertcontroller;
                super(final_context, final_cursor, flag);
                alertparams = getCursor();
                mLabelIndex = getColumnIndexOrThrow(mLabelColumn);
                mIsCheckedIndex = getColumnIndexOrThrow(mIsCheckedColumn);
            }
        }

        Object obj;
        if (mIsMultiChoice)
        {
            if (mCursor == null)
            {
                obj = new _cls1(AlertController.access$900(dialog), 0x1020014, mItems, listView);
            } else
            {
                obj = new _cls2(false, listView, dialog);
            }
        } else
        {
            int i;
            if (mIsSingleChoice)
            {
                i = AlertController.access$1000(dialog);
            } else
            {
                i = AlertController.access$1100(dialog);
            }
            if (mCursor == null)
            {
                if (mAdapter != null)
                {
                    obj = mAdapter;
                } else
                {
                    obj = new dapter(mContext, i, 0x1020014, mItems);
                }
            } else
            {
                obj = new SimpleCursorAdapter(mContext, i, mCursor, new String[] {
                    mLabelColumn
                }, new int[] {
                    0x1020014
                });
            }
        }
        if (mOnPrepareListViewListener != null)
        {
            mOnPrepareListViewListener.onPrepareListView(listView);
        }
        AlertController.access$1202(dialog, ((ListAdapter) (obj)));
        AlertController.access$1302(dialog, mCheckedItem);
        class _cls4
            implements android.widget.AdapterView.OnItemClickListener
        {

            final AlertController.AlertParams this$0;
            final AlertController val$dialog;
            final ListView val$listView;

            public void onItemClick(AdapterView adapterview, View view, int j, long l)
            {
                if (mCheckedItems != null)
                {
                    mCheckedItems[j] = listView.isItemChecked(j);
                }
                mOnCheckboxClickListener.onClick(AlertController.access$600(dialog), j, listView.isItemChecked(j));
            }

            _cls4()
            {
                this$0 = AlertController.AlertParams.this;
                listView = listview;
                dialog = alertcontroller;
                super();
            }
        }

        if (mOnClickListener != null)
        {
            listView.setOnItemClickListener(new _cls3());
        } else
        if (mOnCheckboxClickListener != null)
        {
            listView.setOnItemClickListener(new _cls4());
        }
        if (mOnItemSelectedListener != null)
        {
            listView.setOnItemSelectedListener(mOnItemSelectedListener);
        }
        if (mIsSingleChoice)
        {
            listView.setChoiceMode(1);
        } else
        if (mIsMultiChoice)
        {
            listView.setChoiceMode(2);
        }
        AlertController.access$1402(dialog, listView);
    }

    public void apply(AlertController alertcontroller)
    {
        if (mCustomTitleView == null) goto _L2; else goto _L1
_L1:
        alertcontroller.setCustomTitle(mCustomTitleView);
_L10:
        if (mMessage != null)
        {
            alertcontroller.setMessage(mMessage);
        }
        if (mPositiveButtonText != null)
        {
            alertcontroller.setButton(-1, mPositiveButtonText, mPositiveButtonListener, null);
        }
        if (mNegativeButtonText != null)
        {
            alertcontroller.setButton(-2, mNegativeButtonText, mNegativeButtonListener, null);
        }
        if (mNeutralButtonText != null)
        {
            alertcontroller.setButton(-3, mNeutralButtonText, mNeutralButtonListener, null);
        }
        if (mItems != null || mCursor != null || mAdapter != null)
        {
            createListView(alertcontroller);
        }
        if (mView == null) goto _L4; else goto _L3
_L3:
        if (!mViewSpacingSpecified) goto _L6; else goto _L5
_L5:
        alertcontroller.setView(mView, mViewSpacingLeft, mViewSpacingTop, mViewSpacingRight, mViewSpacingBottom);
_L8:
        return;
_L2:
        if (mTitle != null)
        {
            alertcontroller.setTitle(mTitle);
        }
        if (mIcon != null)
        {
            alertcontroller.setIcon(mIcon);
        }
        if (mIconId != 0)
        {
            alertcontroller.setIcon(mIconId);
        }
        if (mIconAttrId != 0)
        {
            alertcontroller.setIcon(alertcontroller.getIconAttributeResId(mIconAttrId));
        }
        continue; /* Loop/switch isn't completed */
_L6:
        alertcontroller.setView(mView);
        return;
_L4:
        if (mViewLayoutResId == 0) goto _L8; else goto _L7
_L7:
        alertcontroller.setView(mViewLayoutResId);
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public OnPrepareListViewListener(Context context)
    {
        mIconId = 0;
        mIconAttrId = 0;
        mViewSpacingSpecified = false;
        mCheckedItem = -1;
        mRecycleOnMeasure = true;
        mContext = context;
        mCancelable = true;
        mInflater = (LayoutInflater)context.getSystemService("layout_inflater");
    }
}
