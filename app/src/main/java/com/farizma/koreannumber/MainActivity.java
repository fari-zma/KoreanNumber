package com.farizma.koreannumber;

import androidx.appcompat.app.AppCompatActivity;
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

    @Override
    protected void onStart() {
        super.onStart();
        mediaPlayer = MediaPlayer.create(this, R.raw.one);
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlaying();
    }

    public void play(View view) {
        switch (view.getId()) {
            case R.id.one: stopPlaying();
                           mediaPlayer = MediaPlayer.create(this, R.raw.one);
                           mediaPlayer.start();
                           break;
            case R.id.two: stopPlaying();
                            mediaPlayer = MediaPlayer.create(this, R.raw.two);
                            mediaPlayer.start();
                            break;
            case R.id.three: stopPlaying();
                             mediaPlayer = MediaPlayer.create(this, R.raw.three);
                             mediaPlayer.start();
                             break;
            case R.id.four: stopPlaying();
                            mediaPlayer = MediaPlayer.create(this, R.raw.four);
                            mediaPlayer.start();
                            break;
            case R.id.five: stopPlaying();
                            mediaPlayer = MediaPlayer.create(this, R.raw.five);
                            mediaPlayer.start();
                            break;
            case R.id.six: stopPlaying();
                            mediaPlayer = MediaPlayer.create(this, R.raw.six);
                            mediaPlayer.start();
                            break;
            case R.id.seven: stopPlaying();
                            mediaPlayer = MediaPlayer.create(this, R.raw.seven);
                            mediaPlayer.start();
                            break;
            case R.id.eight: stopPlaying();
                            mediaPlayer = MediaPlayer.create(this, R.raw.eight);
                            mediaPlayer.start();
                            break;
            case R.id.nine: stopPlaying();
                            mediaPlayer = MediaPlayer.create(this, R.raw.nine);
                            mediaPlayer.start();
                            break;
            case R.id.ten: stopPlaying();
                            mediaPlayer = MediaPlayer.create(this, R.raw.ten);
                            mediaPlayer.start();
                            break;
        }
    }

    void stopPlaying() {
        if(mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
