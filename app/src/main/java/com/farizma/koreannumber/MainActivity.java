package com.farizma.koreannumber;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
    }

    public void play(View view) {
        switch (view.getId()) {
            case R.id.one: mediaPlayer = MediaPlayer.create(this, R.raw.one);
                           mediaPlayer.start();
                           break;
            case R.id.two: mediaPlayer = MediaPlayer.create(this, R.raw.two);
                            mediaPlayer.start();
                            break;
            case R.id.three: mediaPlayer = MediaPlayer.create(this, R.raw.three);
                             mediaPlayer.start();
                             break;
            case R.id.four: mediaPlayer = MediaPlayer.create(this, R.raw.four);
                            mediaPlayer.start();
                            break;
            case R.id.five: mediaPlayer = MediaPlayer.create(this, R.raw.five);
                            mediaPlayer.start();
                            break;
            case R.id.six: mediaPlayer = MediaPlayer.create(this, R.raw.six);
                           mediaPlayer.start();
                            break;
            case R.id.seven: mediaPlayer = MediaPlayer.create(this, R.raw.seven);
                            mediaPlayer.start();
                            break;
            case R.id.eight: mediaPlayer = MediaPlayer.create(this, R.raw.eight);
                            mediaPlayer.start();
                            break;
            case R.id.nine: mediaPlayer = MediaPlayer.create(this, R.raw.nine);
                            mediaPlayer.start();
                            break;
            case R.id.ten: mediaPlayer = MediaPlayer.create(this, R.raw.ten);
                            mediaPlayer.start();
                            break;
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.release();
    }
}
