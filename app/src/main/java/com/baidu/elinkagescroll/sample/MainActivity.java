package com.baidu.elinkagescroll.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.baidu.elinkagescroll.ELinkageScrollLayout;
import com.baidu.elinkagescroll.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    private WebView mWebView;

    private ELinkageScrollLayout mElink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mElink = findViewById(R.id.elink);

        mWebView = findViewById(R.id.webview);
        initWebView();

        mRecyclerView = findViewById(R.id.recycler1);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        LinkageRecyclerAdapter rvAdapter = new LinkageRecyclerAdapter(getRVData(20), 0x6600ffff);
        mRecyclerView.setAdapter(rvAdapter);

        mRecyclerView = findViewById(R.id.recycler2);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        LinkageRecyclerAdapter rvAdapter2 = new LinkageRecyclerAdapter(getRVData(5), 0x66ff00ff);
        mRecyclerView.setAdapter(rvAdapter2);

        mRecyclerView = findViewById(R.id.recycler_in_framelayout);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        LinkageRecyclerAdapter rvAdapter3 = new LinkageRecyclerAdapter(getRVInFrameData(20), 0x66ff0000);
        mRecyclerView.setAdapter(rvAdapter3);
    }

    private void initWebView() {
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new WebViewClient());
        mWebView.setWebChromeClient(new WebChromeClient());
        mWebView.loadUrl("https://xw.qq.com/partner/hwbrowser/20190731A0HV99/20190731A0HV9900?ADTAG=hwb&pgv_ref=hwb&appid=hwbrowser&ctype=news");
    }

    private ArrayList<String> getRVData(int count) {
        ArrayList<String> data = new ArrayList<>();
        String temp = "RecyclerView - ";
        for(int i = 0; i < count; i++) {
            data.add(temp + i);
        }
        return data;
    }

    private ArrayList<String> getRVInFrameData(int count) {
        ArrayList<String> data = new ArrayList<>();
        String temp = "RecyclerInFrameLayout - ";
        for(int i = 0; i < count; i++) {
            data.add(temp + i);
        }
        return data;
    }

    public void onLLButtonClick(View view) {
        Toast.makeText(this, "Button Click", Toast.LENGTH_SHORT).show();
    }

    public void gotoTarget(View view) {
        mElink.gotoChild(3);
    }
}
