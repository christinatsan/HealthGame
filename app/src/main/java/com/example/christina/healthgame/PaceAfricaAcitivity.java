package com.example.christina.healthgame;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class PaceAfricaAcitivity extends ActionBarActivity {

    public Button tenButton;
    public Button fiveButton;
    public Button threeButton;
    public ImageView joggingClip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_africa_pace);

        tenButton = (Button) findViewById(R.id.tenButton);
        tenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tenPace();

            }
        });

        fiveButton = (Button) findViewById(R.id.fiveButton);
        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fivePace();

            }
        });

        threeButton = (Button) findViewById(R.id.threeButton);
        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                threePace();

            }
        });

        joggingClip = (ImageView) findViewById(R.id.joggingClip);
        Drawable temp = getResources().getDrawable(R.drawable.jogging);
        joggingClip.setImageDrawable(temp);

    }

    public void tenPace(){
        //go to ten pace - africa - easy level

        Intent intent = new Intent(this, easyTenAfrica.class);
        startActivity(intent);
    }

    public void fivePace(){
        // go to five pace - africa - easy level
        Intent intent = new Intent(this, easyFiveAfrica.class);
        startActivity(intent);
    }

    public void threePace(){
        // go to three pace - africa - easy level
        Intent intent = new Intent(this, easyThreeAfrica.class);
        startActivity(intent);
    }
}
