package com.baidu.elinkagescroll;

/**
 * Interface definition which LinkageScrollLayout {@link ELinkageScrollLayout}'s children
 * has to implements. Make sure the layout container work properly.
 *
 * @author zhanghao43
 * @since 2019/04/16
 */
public interface ILinkageScroll {
    /**
     * <p>children in ELinkageScrollLayout {@link ELinkageScrollLayout} must implements this method
     * to hold ChildLinkageEvent interface.</p>
     *
     * @param event ChildLinkageEvent that the top/bottom view holds
     */
    void setChildLinkageEvent(ChildLinkageEvent event);

    /**
     * <p>children in ELinkageScrollLayout {@link ELinkageScrollLayout} must implements this method
     * to offer LinkageScrollHandler to LinkageScrollLayout.</p>
     */
    LinkageScrollHandler provideScrollHandler();
}
