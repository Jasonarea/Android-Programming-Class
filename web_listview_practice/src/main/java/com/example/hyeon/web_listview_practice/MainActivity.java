package com.example.hyeon.web_listview_practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView browser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        browser = (WebView) findViewById(R.id.webkit);
        browser.getSettings().setJavaScriptEnabled(true); // allow scripts
        browser.setWebViewClient(new WebViewClient() ); // page navigation
        browser.loadUrl("http://www.ebay.com");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }// onCreateOptionsMenu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String option = item.getTitle().toString();
        if (option.equals("Forward Page"))
            browser.goForward();
        if (option.equals("Back Page"))
            browser.goBack();
        return true;
    }
}