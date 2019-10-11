package com.baidu.elinkagescroll;

import android.view.View;

/**
 * Interface definition that Children in LinkageScrollLayout {@link LinkageScrollLayout} have to implement
 * or the LinkageScrollLayout will not work properly.
 *
 * @author zhanghao43
 * @since 2019/04/16.
 */
public interface LinkageScrollHandler {

    /**
     * fling target with a velocity
     *
     * @param target
     * @param velocityY
     */
    void flingContent(View target, int velocityY);

    /**
     * scroll content to top
     */
    void scrollContentToTop();

    /**
     * scroll content to bottom
     */
    void scrollContentToBottom();

    /**
     * stop content scroll
     *
     * @param target
     */
    void stopContentScroll(View target);

    /**
     * can scroll vertically with a direction
     *
     * @param direction
     * @return
     */
    boolean canScrollVertically(int direction);

    /**
     * inform LinkageScrollLayout child view is scrollable
     *
     * @return
     */
    boolean isScrollable();

    /**
     * get scrollbar extent value
     *
     * @return extent
     */
    int getVerticalScrollExtent();

    /**
     * get scrollbar offset value
     *
     * @return extent
     */
    int getVerticalScrollOffset();

    /**
     * get scrollbar range value
     *
     * @return extent
     */
    int getVerticalScrollRange();
}
