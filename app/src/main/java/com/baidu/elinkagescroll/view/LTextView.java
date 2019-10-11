package com.baidu.elinkagescroll.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.baidu.elinkagescroll.ChildLinkageEvent;
import com.baidu.elinkagescroll.ILinkageScroll;
import com.baidu.elinkagescroll.LinkageScrollHandler;
import com.baidu.elinkagescroll.LinkageScrollHandlerAdapter;

/**
 * 置于联动容器的TextView
 */
public class LTextView extends TextView implements ILinkageScroll {

    public LTextView(Context context) {
        this(context, null);
    }

    public LTextView(Context context, AttributeSet attrs) {
        this(context, attrs, -1);
    }

    public LTextView(Context context, AttributeSet attrs, int defStyleAttr) {
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

            @Override
            public int getVerticalScrollExtent() {
                return getHeight();
            }

            @Override
            public int getVerticalScrollOffset() {
                return 0;
            }

            @Override
            public int getVerticalScrollRange() {
                return getHeight();
            }
        };
    }
}
