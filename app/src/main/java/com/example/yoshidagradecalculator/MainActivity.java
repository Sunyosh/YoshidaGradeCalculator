package com.example.yoshidagradecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText prelimgrade, midtermgrade, endtermgrade, studentname;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentname = (EditText) findViewById(R.id.studentname);
        prelimgrade = (EditText) findViewById(R.id.prelimgrade);
        midtermgrade = (EditText) findViewById(R.id.midtermgrade);
        endtermgrade = (EditText) findViewById(R.id.endtermgrade);
        button = (Button) findViewById(R.id.button);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String final_studentname = studentname.getText().toString().trim();
                int final_prelimgrade = Integer.parseInt(prelimgrade.getText().toString().trim());
                int final_midtermgrade = Integer.parseInt(midtermgrade.getText().toString().trim());
                int final_endtermgrade = Integer.parseInt(endtermgrade.getText().toString().trim());
                int final_grade = (final_prelimgrade + final_midtermgrade + final_endtermgrade) / 3;

                switch(final_grade){
                    case  90:
                    case  91:
                    case  92:
                    case  93:
                    case  94:
                    case  95:
                    case  96:
                    case  97:
                    case  98:
                    case  99:
                    case  100:
                        Intent i = new Intent(MainActivity.this,Outstanding.class);
                        i.putExtra("name",final_studentname);
                        i.putExtra("final_grade",final_grade);
                        startActivity(i);
                        break;

                    case  85:
                    case  86:
                    case  87:
                    case  88:
                    case  89:
                        Intent i2 = new Intent(MainActivity.this,VerySatisfactory.class);
                        i2.putExtra("name",final_studentname);
                        i2.putExtra("final_grade",final_grade);
                        startActivity(i2);
                        break;

                    case  80:
                    case  81:
                    case  82:
                    case  83:
                    case  84:
                        Intent i3 = new Intent(MainActivity.this,Satisfactory.class);
                        i3.putExtra("name",final_studentname);
                        i3.putExtra("final_grade",final_grade);
                        startActivity(i3);
                        break;
                    case  75:
                    case  76:
                    case  77:
                    case  78:
                    case  79:
                        Intent i4 = new Intent(MainActivity.this,FairlySatisfactory.class);
                        i4.putExtra("name",final_studentname);
                        i4.putExtra("final_grade",final_grade);
                        startActivity(i4);
                        break;
                    default:
                        Intent i5 = new Intent(MainActivity.this,DidNotMeetExpectations.class);
                        i5.putExtra("name",final_studentname);
                        i5.putExtra("final_grade",final_grade);
                        startActivity(i5);
                        break;


                }
            }
        });
    }
}