package com.example.christina.healthgame;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class PaceEuropeActivity2 extends ActionBarActivity {

    public Button tenButton;
    public Button fiveButton;
    public Button threeButton;
    public ImageView joggingClip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pace_europe_activity2);

        tenButton = (Button) findViewById(R.id.tenButton);
        tenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        fiveButton = (Button) findViewById(R.id.fiveButton);
        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        threeButton = (Button) findViewById(R.id.threeButton);
        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        joggingClip = (ImageView) findViewById(R.id.joggingClip);
        Drawable temp = getResources().getDrawable(R.drawable.jogging);
        joggingClip.setImageDrawable(temp);

    }
}
