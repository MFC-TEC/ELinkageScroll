package com.baidu.elinkagescroll.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import com.baidu.elinkagescroll.ILinkageScroll;
import com.baidu.elinkagescroll.ChildLinkageEvent;
import com.baidu.elinkagescroll.LinkageScrollHandler;

public class LRecyclerView extends RecyclerView implements ILinkageScroll {

    private ChildLinkageEvent mLinkageEvent;

    public LRecyclerView(@NonNull Context context) {
        this(context, null);
    }

    public LRecyclerView(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, -1);
    }

    public LRecyclerView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        // 滚动监听，将必要事件传递给联动容器
        addOnScrollListener(new OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                if (!canScrollVertically(-1)) {
                    if (mLinkageEvent != null) {
                        mLinkageEvent.onContentScrollToTop(LRecyclerView.this);
                    }
                }

                if (!canScrollVertically(1)) {
                    if (mLinkageEvent != null) {
                        mLinkageEvent.onContentScrollToBottom(LRecyclerView.this);
                    }
                }

                if (mLinkageEvent != null) {
                    mLinkageEvent.onContentScroll(LRecyclerView.this);
                }
            }
        });
    }

    @Override
    public void setChildLinkageEvent(ChildLinkageEvent event) {
        mLinkageEvent = event;
    }

    @Override
    public LinkageScrollHandler provideScrollHandler() {
        return new LinkageScrollHandler() {
            @Override
            public void flingContent(View target, int velocityY) {
                LRecyclerView.this.fling(0, velocityY);
            }

            @Override
            public void scrollContentToTop() {
                LRecyclerView.this.scrollToPosition(0);
            }

            @Override
            public void scrollContentToBottom() {
                Adapter adapter = LRecyclerView.this.getAdapter();
                if (adapter != null && adapter.getItemCount() > 0) {
                    LRecyclerView.this.scrollToPosition(adapter.getItemCount() - 1);
                }
            }

            @Override
            public void stopContentScroll(View target) {
                LRecyclerView.this.stopScroll();
            }

            @Override
            public boolean canScrollVertically(int direction) {
                return LRecyclerView.this.canScrollVertically(direction);
            }

            @Override
            public boolean isScrollable() {
                return true;
            }

            @Override
            public int getVerticalScrollExtent() {
                return computeVerticalScrollExtent();
            }

            @Override
            public int getVerticalScrollOffset() {
                return computeVerticalScrollOffset();
            }

            @Override
            public int getVerticalScrollRange() {
                return computeVerticalScrollRange();
            }
        };
    }
}
