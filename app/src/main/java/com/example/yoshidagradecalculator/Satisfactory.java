package com.example.yoshidagradecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Satisfactory extends AppCompatActivity {
    private TextView name4, satisfactory;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satisfactory);
        i = getIntent();

        name4 = (TextView) findViewById(R.id.name4);
        satisfactory = (TextView) findViewById(R.id.satisfactory);
        name4.setText("Student name: " + i.getStringExtra("name"));
        satisfactory.setText("Your final grade is " + i.getIntExtra("final_grade", 0));


    }
}