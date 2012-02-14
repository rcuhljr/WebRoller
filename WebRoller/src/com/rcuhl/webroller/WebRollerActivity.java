package com.rcuhl.webroller;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebRollerActivity extends Activity {
	
	private final String rollerUrl = "file:///android_asset/L5RDiceRoller.htm";
	private WebView mWebView;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mWebView = (WebView) findViewById(R.id.webview);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.loadUrl(rollerUrl);
    }
}