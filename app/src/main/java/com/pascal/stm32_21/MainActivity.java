package com.pascal.stm32_21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView webView1;
    private WebView webView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView1 =findViewById(R.id.webview1);
        webView2 =findViewById(R.id.webview2);

        //Temperature
        webView1.getSettings().setJavaScriptEnabled(true);
        // Force links and redirects to open in the WebView instead of in a browser
        webView1.setWebViewClient(new WebViewClient());

        /* Load web page in webView
         */
        webView1.loadUrl("https://thingspeak.com/channels/1354241/charts/1?bgcolor=%23ffffff&color=%23d62020&dynamic=true&results=20&title=TEMPERATURE&type=line&xaxis=Time&yaxis=Temperature+C");


        //Humidity

        webView2.getSettings().setJavaScriptEnabled(true);
        // Force links and redirects to open in the WebView instead of in a browser
        webView2.setWebViewClient(new WebViewClient());

        /* Load web page in webView
         */
        webView2.loadUrl("https://thingspeak.com/channels/1354241/charts/2?bgcolor=%23ffffff&color=%23d62020&dynamic=true&results=20&title=HUMIDITY&type=line&xaxis=Time&yaxis=Relative+Humidity");

    }
}