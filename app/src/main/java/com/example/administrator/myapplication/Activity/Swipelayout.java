package com.example.administrator.myapplication.Activity;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2017/3/22.
 */

public class Swipelayout extends LinearLayout{
    private ViewDragHelper viewDragHelper;
    private View contentView;
    private View actionView;
    private int dragDistance;
    private final double AUTO_OPEN_SPEED_LIMIT = 800.0;
    private int draggedX;
    private boolean settleToOpen;
    private static final String TAG = "zzz";

    public Swipelayout(Context context) {
        this(context, null);
    }

    public Swipelayout(Context context, AttributeSet attrs) {
        this(context, attrs, -1);
    }

    public Swipelayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        viewDragHelper = ViewDragHelper.create(this, new DragHelperCallback());
    }

    @Override
    protected void onFinishInflate() {
        contentView = getChildAt(0);
        actionView = getChildAt(1);
        actionView.setVisibility(GONE);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        dragDistance = actionView.getMeasuredWidth();
    }

    private class DragHelperCallback extends ViewDragHelper.Callback {

        @Override
        public boolean tryCaptureView(View view, int i) {
            return view == contentView || view == actionView;
        }

        @Override
        public void onViewPositionChanged(View changedView, int left, int top, int dx, int dy) {
            draggedX = left;
            if (changedView == contentView) {
                actionView.offsetLeftAndRight(dx);
            } else {
                contentView.offsetLeftAndRight(dx);
            }
            if (actionView.getVisibility() == View.GONE) {
                actionView.setVisibility(View.VISIBLE);
            }
            invalidate();
        }

        @Override
        public int clampViewPositionHorizontal(View child, int left, int dx) {
            if (child == contentView) {
                final int leftBound = getPaddingLeft();
                final int minLeftBound = -leftBound - dragDistance;
                final int newLeft = Math.min(Math.max(minLeftBound, left), 0);
                return newLeft;
            } else {
                final int minLeftBound = getPaddingLeft() + contentView.getMeasuredWidth() - dragDistance;
                final int maxLeftBound = getPaddingLeft() + contentView.getMeasuredWidth() + getPaddingRight();
                final int newLeft = Math.min(Math.max(left, minLeftBound), maxLeftBound);
                return newLeft;
            }
        }

        @Override
        public int getViewHorizontalDragRange(View child) {
            return dragDistance;
        }

        @Override
        public void onViewReleased(View releasedChild, float xvel, float yvel) {
            super.onViewReleased(releasedChild, xvel, yvel);
            settleToOpen = false;
            if (xvel > AUTO_OPEN_SPEED_LIMIT) {
                settleToOpen = false;
            } else if (xvel < -AUTO_OPEN_SPEED_LIMIT) {
                settleToOpen = true;
            } else if (draggedX <= -dragDistance / 2) {
                settleToOpen = true;
            } else if (draggedX > -dragDistance / 2) {
                settleToOpen = false;
            }

            final int settleDestX = settleToOpen ? -dragDistance : 0;
            viewDragHelper.smoothSlideViewTo(contentView, settleDestX, 0);
            ViewCompat.postInvalidateOnAnimation(Swipelayout.this);
        }
    }


    /**在onInterceptTouchEvent方法中返回false，就会让第二个值为true，从而进入到条件判断的内部，
     * 如果我们在onInterceptTouchEvent方法中返回true，就会让第二个值为false，从而跳出了这个条件判断
     * 重写了onInterceptTouchEvent方法，让这个方法返回true，导致所有按钮的点击事件都被屏蔽了
     * @param ev
     * @return
     */
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if(viewDragHelper.shouldInterceptTouchEvent(ev)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        viewDragHelper.processTouchEvent(event);
//        if(settleToOpen){
//            return false;
//        }
//        Log.i(TAG, "onTouchEvent:   "+event);
        return true;
    }


    @Override
    public void computeScroll() {
        super.computeScroll();
        if(viewDragHelper.continueSettling(true)) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }
}
