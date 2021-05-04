package com.example.miyuu;


import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent; //追加☆
import android.os.Handler; //☆
import android.preference.PreferenceManager;
import android.util.Log;


public class SplashActivity extends AppCompatActivity {

    final Handler mHandler = new Handler(); //☆

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        //プリファレンスの準備
        //プリファレンス
        SharedPreferences preference = getSharedPreferences("Preference Name", MODE_PRIVATE);
        SharedPreferences.Editor editor = preference.edit();

        if (!preference.getBoolean("Launched", false)) {
            Log.d("AppLaunchChecker","はじめてアプリを起動した");


            //初回起動時の処理

            //プリファレンスの書き変え
            editor.putBoolean("Launched", true);
            editor.apply();
        } else {
            //二回目以降の処理
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash);
            mHandler.postDelayed(mSplashTask, 1000); //☆
        }}

    //以下☆
    @Override
    protected void onStop() {
        super.onStop();
        mHandler.removeCallbacks(mSplashTask);
    }
    private final Runnable mSplashTask = new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);//画面遷移のためのIntentを準備
            startActivity(intent);//実際の画面遷移を開始
            finish();//現在のActivityを削除
        }
    };
}