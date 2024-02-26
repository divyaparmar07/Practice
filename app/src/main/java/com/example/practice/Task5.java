package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.widget.TextView;

public class Task5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task5);
        setTitle("VITAMINS");

        TextView textView = findViewById(R.id.b1);

        String b = textView.getText().toString(); // Example text with subscript and superscript

        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(b);

// Apply subscript formatting to "2"
        spannableStringBuilder.setSpan(new SubscriptSpan(), 1, 2, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);

// Apply superscript formatting to "O"
//        spannableStringBuilder.setSpan(new SuperscriptSpan(), 2, 3, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView.setText(spannableStringBuilder);

        TextView textView1 = findViewById(R.id.b2);
        String b2 = textView1.getText().toString();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(b2);
        spannableStringBuilder2.setSpan(new SubscriptSpan(), 1, 2, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        textView1.setText(spannableStringBuilder2);

        TextView textView3 = findViewById(R.id.b3);
        String b3 = textView3.getText().toString();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(b2);
        spannableStringBuilder3.setSpan(new SubscriptSpan(), 1, 2, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        textView3.setText(spannableStringBuilder3);

        TextView textView5 = findViewById(R.id.b5);
        String b5 = textView5.getText().toString();
        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(b5);
        spannableStringBuilder5.setSpan(new SubscriptSpan(), 1, 2, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        textView5.setText(spannableStringBuilder5);

        TextView textView6 = findViewById(R.id.b6);
        String b6 = textView6.getText().toString();
        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(b6);
        spannableStringBuilder6.setSpan(new SubscriptSpan(), 1, 2, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        textView6.setText(spannableStringBuilder6);

        TextView textView7 = findViewById(R.id.b7);
        String b7 = textView7.getText().toString();
        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(b7);
        spannableStringBuilder7.setSpan(new SubscriptSpan(), 1, 2, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        textView7.setText(spannableStringBuilder7);

        TextView textView9 = findViewById(R.id.b9);
        String b9 = textView9.getText().toString();
        SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder(b9);
        spannableStringBuilder9.setSpan(new SubscriptSpan(), 1, 2, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        textView9.setText(spannableStringBuilder9);

        TextView textView12 = findViewById(R.id.b12);
        String b12 = textView12.getText().toString();
        SpannableStringBuilder spannableStringBuilder12 = new SpannableStringBuilder(b12);
        spannableStringBuilder12.setSpan(new SubscriptSpan(), 1, 3, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        textView12.setText(spannableStringBuilder12);
    }
}