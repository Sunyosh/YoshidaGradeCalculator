package com.example.yoshidagradecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class VerySatisfactory extends AppCompatActivity {
    private TextView name3, verysatisfactory;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_very_satisfactory);
        i = getIntent();

        name3 = (TextView) findViewById(R.id.name3);
        verysatisfactory = (TextView) findViewById(R.id.verysatisfactory);
        name3.setText("Student name: " + i.getStringExtra("name"));
        verysatisfactory.setText("Your grade is " + i.getIntExtra("final_grade", 0));


    }
}