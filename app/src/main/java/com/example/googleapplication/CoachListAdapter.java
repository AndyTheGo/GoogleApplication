package com.example.googleapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CoachListAdapter extends ArrayAdapter<CoachPage> {

    private static final String TAG = "CoachListAdapter";
    private Context myContext;
    int myResource;


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String name = getItem(position).getName();
        String email = getItem(position).getEmail();

        CoachPage coach = new CoachPage(name, email);
        LayoutInflater inflater = LayoutInflater.from(myContext);
        convertView = inflater.inflate(myResource, parent, false);

        TextView coachName = (TextView) convertView.findViewById(R.id.name);
        TextView coachEmail = (TextView) convertView.findViewById(R.id.email);

        coachName.setText(name);
        coachEmail.setText(email);

        return convertView;

    }

    public CoachListAdapter(@NonNull Context context, int resource, ArrayList<CoachPage> objects) {
        super(context, resource, objects);
        myContext = context;
        myResource = resource;

    }
}
