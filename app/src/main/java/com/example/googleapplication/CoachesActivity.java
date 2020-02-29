package com.example.googleapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static android.util.Log.*;

public class CoachesActivity extends AppCompatActivity {
    private static final String TAG = "CoachesActivity";
    Button coaches;
    ListView coachList;
    ArrayList<CoachPage> coach = new ArrayList<>();

    //int[] IMAGES = {R.drawable.googlelogo, };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coaches);
        Log.d(TAG,"onCreate: Started");
        ArrayList<CoachPage> coach = new ArrayList<>();
        coachList = findViewById(R.id.coaches);
        CoachPage jason = new CoachPage("Coach Jason","jthigpen@csedge.org");
        CoachPage alyssa = new CoachPage("Coach Alyssa", "alyssa@csedge.org");
        CoachPage natalie = new CoachPage("Coach Natalie","nataliebh@google.com");
        CoachPage donna = new CoachPage("Coach Donna","donna@csedge.org ");
        CoachPage blanca = new CoachPage("Coach Blanca","morerecinos@google.com");
        coach.add(jason);
        coach.add(alyssa);
        coach.add(natalie);
        coach.add(donna);
        coach.add(blanca);
        CoachListAdapter arrayAdapter= new CoachListAdapter(this, R.layout.coach, coach);
        coachList.setAdapter(arrayAdapter);
    }

}
