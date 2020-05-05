package com.example.networking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.webkit.WebView;

import java.io.BufferedReader;
import java.net.HttpURLConnection;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HttpURLConnection urlConnection=null;
        BufferedReader reader=null;

        String forecastJsonStr=null;
    }
    
}