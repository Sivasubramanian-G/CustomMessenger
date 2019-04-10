package com.androdev.custommessenger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Intent intent =  new Intent(MainActivity.this,Signin.class);
        startActivity(intent);*/

        /*Intent intent =  new Intent(MainActivity.this,ProfileView.class);
        startActivity(intent);*/

        Intent intent = new Intent(MainActivity.this, PrivacySecuritySettings.class);
        startActivity(intent);

    }
}
