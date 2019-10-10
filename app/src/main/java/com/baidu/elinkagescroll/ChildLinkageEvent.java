package com.baidu.elinkagescroll;

import android.view.View;

/**
 * Interface definition for a callback to be invoked
 * when the children in LinkageScrollLayout {@link ELinkageScrollLayout} trigger some important event.
 *
 * @author zhanghao43
 * @since 2019/04/16.
 */
public interface ChildLinkageEvent {
    /**
     * Callback method to be invoked when the children in LinkageScrollLayout {@link ELinkageScrollLayout}
     * has been scrolled to top.</p>
     */
    void onContentScrollToTop(View target);

    /**
     * Callback method to be invoked when the children in LinkageScrollLayout {@link ELinkageScrollLayout}
     * has been scrolled to bottom.</p>
     */
    void onContentScrollToBottom(View target);

    /**
     * Callback method to be invoked when the children in LinkageScrollLayout {@link ELinkageScrollLayout}
     * has been scrolled.</p>
     *
     * @param scrollExtent  aim to draw scrollbar
     * @param scrollOffset  aim to draw scrollbar
     * @param scrollRange   aim to draw scrollbar
     */
    void onContentScroll(View view, int scrollExtent, int scrollOffset, int scrollRange);

    /**
     * if children's content refreshed, need to notify LinkageScrollLayout.
     * So, LinkageScrollLayout can adjust layout.
     *
     * @param changedHeight changed height
     */
//    void onContentRefresh(int changedHeight);
}
