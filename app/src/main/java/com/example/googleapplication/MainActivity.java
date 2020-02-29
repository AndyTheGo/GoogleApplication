package com.example.googleapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Animation topAmin, bottomAmin;
    ImageView logo;
    TextView slogan;

    private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        topAmin = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAmin = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        logo = findViewById(R.id.imageView2);
        slogan = findViewById(R.id.textView41);

        logo.setAnimation(topAmin);
        slogan.setAnimation(bottomAmin);
        new Handler().postDelayed( new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, SplashScreenActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}