package com.baidu.elinkagescroll.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.baidu.elinkagescroll.ChildLinkageEvent;
import com.baidu.elinkagescroll.ILinkageScroll;
import com.baidu.elinkagescroll.LinkageScrollHandler;
import com.baidu.elinkagescroll.LinkageScrollHandlerAdapter;

/**
 * 置于联动容器的LinearLayout
 */
public class LLinearLayout extends LinearLayout implements ILinkageScroll {
    public LLinearLayout(Context context) {
        this(context, null);
    }

    public LLinearLayout(Context context, AttributeSet attrs) {
        this(context, attrs, -1);
    }

    public LLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setChildLinkageEvent(ChildLinkageEvent event) {

    }

    @Override
    public LinkageScrollHandler provideScrollHandler() {
        return new LinkageScrollHandlerAdapter() {
            @Override
            public boolean isScrollable() {
                return false;
            }
        };
    }
}
