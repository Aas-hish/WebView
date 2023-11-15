package com.example.webview;


import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    ProgressBar pbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView=findViewById(R.id.webView);
        pbar=findViewById(R.id.pbar);

        webView.setWebViewClient(new WebViewClient(){

//            LOADING PROGRESS BAR WHILE SEARCHING

           /* @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                pbar.setVisibility(View.VISIBLE);
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                pbar.setVisibility(View.GONE);
                super.onPageFinished(view, url);
            }*/
        });

        webView.loadUrl("https://www.google.com");
        webView.getSettings().setJavaScriptEnabled(true);



    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}