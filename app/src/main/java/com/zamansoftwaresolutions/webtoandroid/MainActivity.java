package com.zamansoftwaresolutions.webtoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
        WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView=findViewById(R.id.myWebView);

        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.loadUrl("https://ecommerce.bongotech.xyz/");
    }
}