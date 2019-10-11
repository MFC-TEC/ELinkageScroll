package com.baidu.elinkagescroll;

import android.view.View;

/**
 * 提供LinkageScrollHandler接口的缺省实现
 */
public class LinkageScrollHandlerAdapter implements LinkageScrollHandler {
    @Override
    public void flingContent(View target, int velocityY) {

    }

    @Override
    public void scrollContentToTop() {

    }

    @Override
    public void scrollContentToBottom() {

    }

    @Override
    public void stopContentScroll(View target) {

    }

    @Override
    public boolean canScrollVertically(int direction) {
        return false;
    }

    @Override
    public boolean isScrollable() {
        return false;
    }

    @Override
    public int getVerticalScrollExtent() {
        return 0;
    }

    @Override
    public int getVerticalScrollOffset() {
        return 0;
    }

    @Override
    public int getVerticalScrollRange() {
        return 0;
    }
}
