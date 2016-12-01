package com.curry.stephen.viewtest.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

import com.curry.stephen.viewtest.R;

/**
 * Created by lingchong on 16/11/30.
 */

public class PieChartView extends ViewGroup {

    private boolean mShowText;
    private int mTextPosition;

    public PieChartView(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray typedArray = context.getTheme().obtainStyledAttributes(attrs, R.styleable.PieChartView, 0, 0);
        try {
            mShowText = typedArray.getBoolean(R.styleable.PieChartView_showText, false);
            mTextPosition = typedArray.getInteger(R.styleable.PieChartView_labelPosition, 0);
        } finally {
            typedArray.recycle();
        }
    }

    @Override
    protected void onLayout(boolean b, int i, int i1, int i2, int i3) {

    }
}
