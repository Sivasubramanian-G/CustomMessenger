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

public class Signup extends AppCompatActivity {

    private TextView semailtxt, spasstxt, shaveacc;
    private EditText semailedit, spassedit;
    private ScrollView sscr1;
    private RelativeLayout sr1, sr2, sgoogle, sfacebook, stwitter;
    private Button snext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        initialize();
        shaveacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Signup.this,MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);//Simple Transition
                //overridePendingTransition(R.anim.slide_in_left,R.anim.nothing);//Wipe Transition
            }
        });

    }

    private void initialize() {

        semailtxt = (TextView) findViewById(R.id.semailtxt);
        semailedit = (EditText) findViewById(R.id.semaileidt);
        spasstxt = (TextView) findViewById(R.id.spasstxt);
        spassedit = (EditText) findViewById(R.id.spasseidt);
        sscr1 = (ScrollView) findViewById(R.id.sscr1);
        sr1 = (RelativeLayout) findViewById(R.id.sr1);
        sr2 = (RelativeLayout) findViewById(R.id.sr2);
        sgoogle = (RelativeLayout) findViewById(R.id.sgoogle);
        sfacebook = (RelativeLayout) findViewById(R.id.sfacebook);
        stwitter = (RelativeLayout) findViewById(R.id.stwitter);
        snext = (Button) findViewById(R.id.snext);
        shaveacc = (TextView) findViewById(R.id.shaveacc);

    }

}