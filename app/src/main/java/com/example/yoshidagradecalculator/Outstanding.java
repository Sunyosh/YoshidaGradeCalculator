package com.example.yoshidagradecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Outstanding extends AppCompatActivity {
    private TextView name2, outstandinggrade;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outstanding);
        i = getIntent();

        name2 = (TextView) findViewById(R.id.name2);
        outstandinggrade = (TextView) findViewById(R.id.outstandinggrade);
        name2.setText("Student name: " + i.getStringExtra("name"));
        outstandinggrade.setText("Your final grade is " + i.getIntExtra("final_grade", 0));


    }
}