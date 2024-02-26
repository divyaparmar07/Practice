package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class WifiActivity extends AppCompatActivity {

    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi);
        b1 = (Button) findViewById(R.id.wifienable);
        b2 = (Button) findViewById(R.id.wifidisable);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                //wifi.setWifiEnabled(true);
                if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q)
                    wifi.setWifiEnabled(true);
                else {
                    Intent panelIntent = new Intent(Settings.Panel.ACTION_WIFI);
                    startActivityForResult(panelIntent, 1);
                }
                Toast.makeText(getApplicationContext(), "WIFI Enabled", Toast.LENGTH_LONG).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                //wifi.setWifiEnabled(false);
                if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q)
                    wifi.setWifiEnabled(false);
                else {
                    Intent panelIntent = new Intent(Settings.Panel.ACTION_WIFI);
                    startActivityForResult(panelIntent, 0);
                }
                Toast.makeText(getApplicationContext(), "WIFI Disabled", Toast.LENGTH_LONG).show();
            }
        });
    }
}