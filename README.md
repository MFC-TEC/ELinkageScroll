# ELinkageScroll
多子view嵌套滚动通用解决方案

### Demo运行效果
<img src='https://github.com/baiduapp-tec/ELinkageScroll/blob/master/elinkagescroll.gif' width="300px" style='border: #f1f1f1 solid 1px'/><br>
    
# 使用方法
#### xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<com.baidu.elinkagescroll.ELinkageScrollLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <!-- 第1个子view -->
    <com.baidu.elinkagescroll.view.LWebView
        android:id="@+id/webview"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>

    <!-- 第2个子view -->
    <com.baidu.elinkagescroll.view.LLinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical">
        <TextView
            android:layout_width="match_parent"
            android:layout_height="100dp"
            android:textSize="22dp"
            android:gravity="center"
            android:background="#22ff0000"
            android:text="LinearLayout"/>
        <Button
            android:layout_width="match_parent"
            android:layout_height="200dp"
            android:text="LinearLayout"
            android:onClick="onLLButtonClick"/>
        <TextView
            android:layout_width="match_parent"
            android:layout_height="150dp"
            android:textSize="22dp"
            android:gravity="center"
            android:background="#22ff0000"
            android:text="LinearLayout"/>
    </com.baidu.elinkagescroll.view.LLinearLayout>

    <!-- 第3个子view -->
    <com.baidu.elinkagescroll.view.LRecyclerView
        android:id="@+id/recycler1"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>

    <!-- 第4个子view -->
    <com.baidu.elinkagescroll.view.LTextView
        android:layout_width="match_parent"
        android:layout_height="300dp"
        android:background="@color/colorPrimary"
        android:text="TextView"
        android:clickable="true"
        android:textColor="#ffffff"
        android:textSize="28dp"
        android:gravity="center"/>

    <!-- 第5个子view -->
    <com.baidu.elinkagescroll.view.LRecyclerView
        android:id="@+id/recycler2"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"/>

    <!-- 第6个子view -->
    <com.baidu.elinkagescroll.view.LScrollView
        android:layout_width="match_parent"
        android:layout_height="wrap_content">
        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical">
            <TextView
                android:layout_width="match_parent"
                android:layout_height="200dp"
                android:text="ScrollView - 1"
                android:textSize="22dp"
                android:background="#22ff0000"
                android:gravity="center"/>
            <View
                android:layout_width="match_parent"
                android:layout_height="1px"
                android:background="#000000"/>
            <TextView
                android:layout_width="match_parent"
                android:layout_height="200dp"
                android:text="ScrollView - 2"
                android:textSize="22dp"
                android:background="#22ff0000"
                android:gravity="center"/>
            <View
                android:layout_width="match_parent"
                android:layout_height="1px"
                android:background="#000000"/>
            <TextView
                android:layout_width="match_parent"
                android:layout_height="200dp"
                android:text="ScrollView - 3"
                android:textSize="22dp"
                android:background="#22ff0000"
                android:gravity="center"/>
            <View
                android:layout_width="match_parent"
                android:layout_height="1px"
                android:background="#000000"/>
            <TextView
                android:layout_width="match_parent"
                android:layout_height="200dp"
                android:text="ScrollView - 4"
                android:textSize="22dp"
                android:background="#22ff0000"
                android:gravity="center"/>
            <View
                android:layout_width="match_parent"
                android:layout_height="1px"
                android:background="#000000"/>
            <TextView
                android:layout_width="match_parent"
                android:layout_height="200dp"
                android:text="ScrollView - 5"
                android:textSize="22dp"
                android:background="#22ff0000"
                android:gravity="center"/>
        </LinearLayout>
    </com.baidu.elinkagescroll.view.LScrollView>

    <!-- 第7个子view -->
    <com.baidu.elinkagescroll.sample.LFrameLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent">
        <android.support.v7.widget.RecyclerView
            android:id="@+id/recycler_in_framelayout"
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>
    </com.baidu.elinkagescroll.sample.LFrameLayout>

</com.baidu.elinkagescroll.ELinkageScrollLayout>
```

# 联系方式 
如果你在使用ELinkageScrollLayout过程中发现任何问题，你可以通过如下方式联系我：
* 邮箱: 
* 微博：https://weibo.com/u/5894400455

