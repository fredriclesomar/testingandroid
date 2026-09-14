package com.example.hospitalmaps;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);

        getWindow().setStatusBarColor(0xFF4D55E5);
        getWindow().setNavigationBarColor(0xFFFFFFFF);

        WebView webView = new WebView(this);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        webView.setBackgroundColor(0xFFF5F7FF);
        webView.loadUrl("file:///android_asset/index.html");
        setContentView(webView);
    }
}
