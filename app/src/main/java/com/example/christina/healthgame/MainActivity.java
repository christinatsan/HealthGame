package com.example.christina.healthgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        Button accountButton = (Button) findViewById(R.id.accountButton);
        accountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newPage();
            }
        });

        Button signInButton = (Button) findViewById(R.id.signInButton);
        signInButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                signInPage();
            }
        });
    }


    public void newPage(){
        Intent intent = new Intent(this, ReportActivity.class);
        startActivity(intent);
    }

    public void signInPage(){
        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);
    }


}



