package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    EditText email, password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.editTextTextPersonName);
        password = (EditText) findViewById(R.id.editTextTextPersonName2);
        login = (Button) findViewById(R.id.button2);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String e = email.getText().toString();
                String p = password.getText().toString();
                Intent i = new Intent(getApplicationContext(), Dashboard.class);
                i.putExtra("email", e);
                i.putExtra("pass", p);
                startActivity(i);
//                startActivity(new Intent(getApplicationContext(),Dashboard.class));
//                Toast.makeText(getApplicationContext(),"Login Successfully",Toast.LENGTH_SHORT).show();
//                Snackbar snackbar = Snackbar.make(view,"Login Successfully",Snackbar.LENGTH_SHORT);
//                snackbar.show();
            }
        });
    }
}