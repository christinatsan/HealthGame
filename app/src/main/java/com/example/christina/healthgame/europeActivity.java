package com.example.christina.healthgame;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class europeActivity extends ActionBarActivity {

    public ImageView europeView;
    public Button europeEasyButton;
    public Button europeInterButton;
    public Button europeHardButton;
    public Button europeExtraButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_europe);

        europeView = (ImageView) findViewById(R.id.europeView);
        Drawable temp = getResources().getDrawable(R.drawable.europe);
        europeView.setImageDrawable(temp);

        europeEasyButton = (Button) findViewById(R.id.europeEasyButton);
        europeEasyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                choosePacePage();

            }
        });


        europeInterButton = (Button) findViewById(R.id.europeInterButton);
        europeInterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choosePacePage2();

            }
        });

        europeHardButton = (Button) findViewById(R.id.europeHardButton);
        europeHardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choosePacePage3();

            }
        });

        europeExtraButton = (Button) findViewById(R.id.europeExtraButton);
        europeExtraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choosePacePage4();

            }
        });


    }


    public void choosePacePage(){

        Intent intent = new Intent(this, PaceEuropeActivity.class);
        startActivity(intent);
    }

    public void choosePacePage2(){

        Intent intent = new Intent(this, PaceEuropeActivity2.class);
        startActivity(intent);
    }

    public void choosePacePage3(){

        Intent intent = new Intent(this, PaceEuropeActivity3.class);
        startActivity(intent);
    }

    public void choosePacePage4(){

        Intent intent = new Intent(this, PaceEuropeActivity4.class);
        startActivity(intent);
    }


}
