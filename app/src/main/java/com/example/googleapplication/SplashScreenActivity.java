package com.example.googleapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SplashScreenActivity extends AppCompatActivity {
    Button news;
    Button about;
    Button offers;
    Button coaches;
    ListView coachList;
    private CoachListAdapter adapter;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        news = findViewById(R.id.button);
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newsPage();
            }
        });
        about = findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aboutPage();
            }
        });
        offers = findViewById(R.id.offers);
        offers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                offersPage();
            }
        });
        coaches = findViewById(R.id.button2);
        coaches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coachesPage();
            }
        });


    }

    public void openActivity2(View view) {
        Intent intent = new Intent(SplashScreenActivity.this, NewsActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void newsPage(){
        Intent intent = new Intent(SplashScreenActivity.this, NewsActivity.class);
        startActivity(intent);
    }

    public void aboutPage(){
        Intent intent = new Intent(SplashScreenActivity.this, AboutActivity.class);
        startActivity(intent);
    }

    public void offersPage(){
        Intent intent = new Intent(SplashScreenActivity.this, OfferActivity.class);
        startActivity(intent);
    }

    public void coachesPage(){
        Intent intent = new Intent(SplashScreenActivity.this, CoachesActivity.class);
        startActivity(intent);
    }

}
