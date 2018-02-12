package com.example.user.youtubeapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    public final static String url = "http://www.leado.co.il/clients/shahak/json.json";
    WebView playlistView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playlistView = findViewById(R.id.playlist_view);
        playlistView.loadUrl(url);
    }
}
