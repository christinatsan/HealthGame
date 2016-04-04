package com.example.christina.healthgame;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;


public class ReportActivity extends ActionBarActivity {


    public NumberPicker weightPick;
    public NumberPicker heightPick;
    public Button reportButton;
    public TextView bmiScore;
    public int weight;
    public int height;
    public TextView fatScore;
    public NumberPicker bodyFat;
    public int fat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        bmiScore = (TextView) findViewById(R.id.bmiScore);

        fatScore = (TextView) findViewById(R.id.fatScore);

        NumberPicker weightPick = (NumberPicker) findViewById(R.id.weightPick);
        weightPick.setMaxValue(300);
        weightPick.setMinValue(10);
        weightPick.setWrapSelectorWheel(false);
        weightPick.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {

                weight = newVal;

            }
        });
        NumberPicker heightPick = (NumberPicker) findViewById(R.id.heightPick);
        heightPick.setMaxValue(100);
        heightPick.setMinValue(10);
        heightPick.setWrapSelectorWheel(false);
        heightPick.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {

                height = newVal;

            }
        });

        NumberPicker bodyFat = (NumberPicker) findViewById(R.id.bodyFat);
        bodyFat.setMaxValue(100);
        bodyFat.setMinValue(10);
        bodyFat.setWrapSelectorWheel(false);
        bodyFat.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                fat = newVal;
            }
        });

        Button reportButton = (Button) findViewById(R.id.reportButton);
        reportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showReport();
            }
        });




    }

    public void showReport(){




        double m_weight = weight * 0.45;
        double m_height = height * 0.025;

        Log.e("Debug", "report weight" + m_weight);

        double bmi = m_weight/Math.pow(m_height, 2);

        Log.e("Debug", "Result report:" + bmi);

        if((bmi == 24.9 || bmi < 24.9) && (bmi > 18.5 || bmi == 18.5))
            bmiScore.setText("20/20  Great Health!");
            //healthy - 20/20

        if(bmi < 18.5)
            bmiScore.setText("15/20  Underweight");
            // underweight

        if((bmi == 29.9 || bmi <29.9) && (bmi > 25 || bmi == 25))
            bmiScore.setText("10/20  Overweight");
            // overweight

        if(bmi >30)
            bmiScore.setText("5/20 Below Average");
            //obese

        // Body fat

        if((fat == 10 || fat > 10) && (fat == 12 || fat < 12))
            fatScore.setText("20/20 Essential Fat");

        if((fat == 14 || fat >14) && (fat == 20 || fat < 20))
            fatScore.setText("15/20 Athlete");

        if((fat == 21 || fat >21) && (fat == 24 || fat <24))
            fatScore.setText("15/20 Fit");

        if((fat == 25 || fat >25) && (fat ==31 || fat <31))
            fatScore.setText("15/20 Acceptable");

        if(fat > 32)
            fatScore.setText("5/20 Obese");
    }



}
