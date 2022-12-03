package com.example.yoshidagradecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FairlySatisfactory extends AppCompatActivity {
    private TextView name5, fairlysatisfactory;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fairly_satisfactory);
        i = getIntent();

        name5 = (TextView) findViewById(R.id.name5);
        fairlysatisfactory = (TextView) findViewById(R.id.fairlysatisfactory);
        name5.setText("Student name: " + i.getStringExtra("name"));
        fairlysatisfactory.setText("Your grade is " + i.getIntExtra("final_grade", 0));


    }
}