package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    EditText n1, n2;
    Button add, sub, multi, div;
    TextView t1;
    double num1, num2, sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        n1 = (EditText) findViewById(R.id.e1);
        n2 = (EditText) findViewById(R.id.e2);
        t1 = (TextView) findViewById(R.id.result);

        String number1 = n1.getText().toString();
        String number2 = n2.getText().toString();

        add = (Button) findViewById(R.id.b1);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(number1);
                num2 = Double.parseDouble(number2);
                sum = num1 + num2;
                t1.setText(Double.toString(sum));
            }
        });

        sub = (Button) findViewById(R.id.b2);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(number1);
                num2 = Double.parseDouble(number2);
                sum = num1 - num2;
                t1.setText(Double.toString(sum));
            }
        });

        multi = (Button) findViewById(R.id.b3);
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(number1);
                num2 = Double.parseDouble(number2);
                sum = num1 * num2;
                t1.setText(Double.toString(sum));
            }
        });
        div = (Button) findViewById(R.id.b4);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(number1);
                num2 = Double.parseDouble(number2);
                sum = num1 / num2;
                t1.setText(Double.toString(sum));
            }
        });
    }
}