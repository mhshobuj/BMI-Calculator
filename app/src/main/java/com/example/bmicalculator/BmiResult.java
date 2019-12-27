package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BmiResult extends AppCompatActivity {

    TextView ResultTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_result);

        ResultTV = findViewById(R.id.Result);

        Intent rci = getIntent();
        String BmiResult = rci.getStringExtra("FResult");

        ResultTV.setText(BmiResult);


    }
}
