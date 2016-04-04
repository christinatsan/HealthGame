package com.example.christina.healthgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class SignInActivity extends ActionBarActivity {

    public TextView text;
    public Button europeButton;
    public Button africaButton;
    public Button northAmericaButton;
    public Button southAmericaButton;
    public Button asiaButton;
    public Button australiaButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        text = (TextView) findViewById(R.id.textsign);

        europeButton = (Button) findViewById(R.id.europeButton);
        europeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseLevel();
            }
        });

        africaButton = (Button) findViewById(R.id.africaButton);
        africaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseLevel2();

            }
        });

        northAmericaButton = (Button) findViewById(R.id.northAmericaButton);
        northAmericaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseLevel3();

            }
        });

        southAmericaButton = (Button) findViewById(R.id.SouthAmericaButton);
        southAmericaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseLevel4();

            }
        });

        asiaButton = (Button) findViewById(R.id.asiaButton);
        asiaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseLevel5();

            }
        });

        australiaButton = (Button) findViewById(R.id.australiaButton);
        australiaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseLevel6();

            }
        });

        //ImageView mapView = (ImageView) findViewById(R.id.mapBackground);
        //Drawable temp = getResources().getDrawable(R.drawable.map2);
        //mapView.setImageDrawable(temp);
        //mapView.setScaleType(ScaleType.FIT_XY);
    }

    public void chooseLevel() {

            Intent intent = new Intent(this, europeActivity.class);
            startActivity(intent);

    }

    public void chooseLevel2(){

        Intent intent = new Intent(this, africaActivity.class);
        startActivity(intent);
    }

    public void chooseLevel3(){
        Intent intent = new Intent(this, northAmericaActivity.class);
        startActivity(intent);
    }

    public void chooseLevel4(){
        Intent intent = new Intent(this, southAmericaActivity.class);
        startActivity(intent);
    }

    public void chooseLevel5(){
        Intent intent = new Intent(this, asiaActivity.class);
        startActivity(intent);
    }

    public void chooseLevel6(){
        Intent intent = new Intent(this, australiaActivity.class);
        startActivity(intent);
    }


}
