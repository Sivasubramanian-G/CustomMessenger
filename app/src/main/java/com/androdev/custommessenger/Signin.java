package com.androdev.custommessenger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class Signin extends AppCompatActivity {

    private TextView emailtxt, passtxt, createacc, forgorpass;
    private EditText emailedit, passedit;
    private ScrollView scr1;
    private RelativeLayout r1, r2, google, facebook, twitter;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        initialize();
        createacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Signin.this,Signup.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);//Simple Transition
                //overridePendingTransition(0,R.anim.slide_out_left);//Wipe Transition
                //overridePendingTransition(R.anim.accordination_enter,R.anim.accordination_exit);//Accordination incomplete
            }
        });

    }


    private void initialize() {

        emailtxt = (TextView) findViewById(R.id.emailtxt);
        emailedit = (EditText) findViewById(R.id.emaileidt);
        passtxt = (TextView) findViewById(R.id.passtxt);
        passedit = (EditText) findViewById(R.id.passeidt);
        scr1 = (ScrollView) findViewById(R.id.scr1);
        r1 = (RelativeLayout) findViewById(R.id.r1);
        r2 = (RelativeLayout) findViewById(R.id.r2);
        google = (RelativeLayout) findViewById(R.id.google);
        facebook = (RelativeLayout) findViewById(R.id.facebook);
        twitter = (RelativeLayout) findViewById(R.id.twitter);
        login = (Button) findViewById(R.id.login);
        createacc = (TextView) findViewById(R.id.createacc);

    }

}
