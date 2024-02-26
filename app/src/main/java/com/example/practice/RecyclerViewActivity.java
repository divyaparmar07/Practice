package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RecyclerViewActivity extends AppCompatActivity {

    ArrayList personName = new ArrayList(Arrays.asList("Person1", "Person2", "Person3", "Person4", "Person5"));
    ArrayList personCity = new ArrayList(Arrays.asList("Rajkot", "Jamnagar", "Junagadh", "Surat", "Morbi"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        setTitle("RecyclerView");

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView1);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        CustomAdapter customAdapter = new CustomAdapter(RecyclerViewActivity.this, personName, personCity);
        recyclerView.setAdapter(customAdapter);
    }
}