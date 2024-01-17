package com.example.webvew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class WebActivity extends AppCompatActivity {
    WebView webView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WebActivity.this, MainActivity.class);
                startActivity(i);

            }
        });

        webView=findViewById(R.id.webView2);
        webView.setWebViewClient(new WebViewClient(){
        @Override
        public boolean shouldOverrideUrlLoading(WebView view,String url){
            if (url.startsWith("tel:")){
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(url));
                startActivity(intent);
                return true;
            }
            else if(url.startsWith("mailto:")){
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(url));
                startActivity(intent);
                return true;
            }
            else{
                view.loadUrl(url);
                return true;
            }
        }

    });
                //loading url by default
        webView.loadUrl("https://about.google/contact-google/");

        //enable js
        WebSettings webSettings=webView.getSettings();
        webSettings.getJavaScriptEnabled();

    }
    //can go back to previous pages using back
@Override
public void onBackPressed(){
    if(webView.canGoBack()){
    webView.goBack();
    }
}
}
