package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView HeightET, WeightET ;
    private String BmiResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HeightET = findViewById(R.id.HeightET);
        WeightET = findViewById(R.id.WeightET);

    }

    public void BmiCalculate(View view) {

        String height = HeightET.getText().toString();
        String weight = WeightET.getText().toString();

        float heightval = Float.parseFloat(height)/100;
        float weightval = Float.parseFloat(weight);

        float bmi = weightval / (heightval * heightval);

        if (bmi < 18.5){
            BmiResult = "Underweight";
        }
        else if(bmi >= 18.5 && bmi <= 24.9){
            BmiResult = "Normal weight";
        }
        else if(bmi >= 25 && bmi <= 29.9){
            BmiResult = "Overweight";
        }
        else{
            BmiResult  = "Obesity";
        }

        String FinalResult  = "BMI RESULT"+"\n\n"+bmi+"\n\n"+BmiResult;

        Intent i = new Intent(MainActivity.this, BmiResult.class);

        i.putExtra("FResult",FinalResult);
        startActivity(i);

    }
}
