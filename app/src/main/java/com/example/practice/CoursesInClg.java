package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class CoursesInClg extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton r1, r2, r3, r4, r5;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses_in_clg);

        r1 = (RadioButton) findViewById(R.id.r1);
        r2 = (RadioButton) findViewById(R.id.r2);
        r3 = (RadioButton) findViewById(R.id.r3);
        r4 = (RadioButton) findViewById(R.id.r4);
        r5 = (RadioButton) findViewById(R.id.r5);
        t1 = (TextView) findViewById(R.id.t1);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String eng = "Engineering Course Description";
                t1.setText(eng);
            }
        });
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dip = "Diploma Course Description";
                t1.setText(dip);
            }
        });
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String law = "Law Course Description";
                t1.setText(law);
            }
        });
        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String science = "Science Course Description";
                t1.setText(science);
            }
        });
        r5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String commerce = "Commerce Course Description";
                t1.setText(commerce);
            }
        });
        radioGroup.clearCheck();
    }
}