package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ShoppingDiscount extends AppCompatActivity {

    TextView t1;
    RadioGroup radioGroup;
    RadioButton r1, r2, r3;
    EditText e1;
    double num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_discount);

        e1 = (EditText) findViewById(R.id.amount);
        t1 = (TextView) findViewById(R.id.t1);
        r1 = (RadioButton) findViewById(R.id.r1);
        r2 = (RadioButton) findViewById(R.id.r2);
        r3 = (RadioButton) findViewById(R.id.r3);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        String amount = e1.getText().toString();

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.getText().toString().isEmpty()) {
                    Toast.makeText(ShoppingDiscount.this, "Enter bill amount", Toast.LENGTH_SHORT).show();
                    e1.requestFocus();
                } else {
                    double bill = Double.parseDouble(e1.getText().toString());
                    bill *= 0.1;
                    String parseBill = String.valueOf(bill);
                    t1.setText(parseBill);
                }
            }
        });

        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.getText().toString().isEmpty()) {
                    Toast.makeText(ShoppingDiscount.this, "Enter bill amount", Toast.LENGTH_SHORT).show();
                    e1.requestFocus();
                } else {
                    double bill = Double.parseDouble(e1.getText().toString());
                    bill *= 0.15;
                    String parseBill = String.valueOf(bill);
                    t1.setText(parseBill);
                }
            }
        });

        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.getText().toString().isEmpty()) {
                    Toast.makeText(ShoppingDiscount.this, "Enter bill amount", Toast.LENGTH_SHORT).show();
                    e1.requestFocus();
                } else {
                    double bill = Double.parseDouble(e1.getText().toString());
                    bill *= 0.2;
                    String parseBill = String.valueOf(bill);
                    t1.setText(parseBill);
                }
            }
        });
        radioGroup.clearCheck();

//        radioGroup.setOnClickListener(new  {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                // Get the selected Radio Button
//                RadioButton radioButton = group.findViewById(checkedId);
//                num = Double.parseDouble(amount);
//                int ds = Integer.parseInt(String.valueOf(checkedId));
//                double dsAmount=0;
//                if(ds == 10){
//                    dsAmount = num * 0.1;
//                }else if(ds == 15){
//                    dsAmount = num * 0.15;
//                }else if(ds == 20){
//                    dsAmount = num * 0.2;
//                }
//                String displayDs = String.valueOf(dsAmount);
//                t1.setText(amount);
//            }
//        });

    }

}