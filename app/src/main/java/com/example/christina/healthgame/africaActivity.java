package com.example.christina.healthgame;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class africaActivity extends ActionBarActivity {

    public ImageView africaView;
    public Button africaEasyButton;
    public Button africaInterButton;
    public Button africaHardButton;
    public Button africaExtraButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_africa);

        africaView = (ImageView) findViewById(R.id.africaView);
        Drawable temp = getResources().getDrawable(R.drawable.africa);
        africaView.setImageDrawable(temp);

        africaEasyButton = (Button) findViewById(R.id.africaEasyButton);
        africaEasyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseAfricaPace();

            }
        });
        africaInterButton = (Button) findViewById(R.id.africaInterButton);
        africaInterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseAfricaPace();

            }
        });
        africaHardButton = (Button) findViewById(R.id.africaHardButton);
        africaHardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseAfricaPace();

            }
        });
        africaExtraButton = (Button) findViewById(R.id.africaExtraButton);
        africaExtraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseAfricaPace();

            }
        });

    }

    public void chooseAfricaPace(){
        Intent intent = new Intent(this, PaceAfricaAcitivity.class);
        startActivity(intent);
    }


}
