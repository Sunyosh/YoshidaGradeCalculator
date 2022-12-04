package com.example.yoshidagradecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DidNotMeetExpectations extends AppCompatActivity {
    private TextView name6, didnotmeetexpectations;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_did_not_meet_expectations);
        i = getIntent();

        name6 = (TextView) findViewById(R.id.name6);
        didnotmeetexpectations = (TextView) findViewById(R.id.didnotmeetexpectations);
        name6.setText("Student name: " + i.getStringExtra("name"));
        didnotmeetexpectations.setText("Your final grade is " + i.getIntExtra("final_grade", 0));


    }
}