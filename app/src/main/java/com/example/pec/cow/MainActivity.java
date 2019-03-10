package com.example.pec.cow;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);     //传入MainActivity的布局并显示
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);      //从缓存中读取数据,如果有则直接显示,
        if (prefs.getString("weather", null) != null) {                              //避免每次开启都要从服务器读取数据
            Intent intent = new Intent(this, WeatherActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
