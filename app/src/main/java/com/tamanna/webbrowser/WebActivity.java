package com.tamanna.webbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        web = findViewById(R.id.web);

        String getURL = getIntent().getExtras().getString("URL");

        web.getSettings().setJavaScriptEnabled(true); //for enable js in webpage

        web.getSettings().setBuiltInZoomControls(true);
        web.setWebViewClient(new WebViewClient());
        //online page er jnno
       // web.loadUrl("http://" + getURL);

        //for offline webpage
        web.loadUrl("file:///android_asset/hello.html");
    }


    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if(keyCode==KeyEvent.KEYCODE_BACK && web.canGoBack())
        {
            web.goBack();
            return true;
        }
        else
        {
            return super.onKeyDown(keyCode,event);
    }
//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//        if (web.canGoBack())
//        {
//            web.goBack();
//            return true;
//        }



//        else
//        {
//            super.onBackPressed();
//        }
    }
}
