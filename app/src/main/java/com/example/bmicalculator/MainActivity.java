package com.example.bmicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etWeight = findViewById(R.id.etWeight);
        EditText etHeight = findViewById(R.id.etHeight);
        Button btnCalculate = findViewById(R.id.btnCalculate);
        LinearLayout resultCard = findViewById(R.id.resultCard);
        TextView tvBMIValue = findViewById(R.id.tvBMIValue);
        TextView tvCategory = findViewById(R.id.tvCategory);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String w = etWeight.getText().toString();
                String h = etHeight.getText().toString();

                if (!w.isEmpty() && !h.isEmpty()) {
                    float weight = Float.parseFloat(w);
                    float height = Float.parseFloat(h);

                    if (height > 0) {
                        float bmi = weight / (height * height);

                        // TASK 4: Format to 2 decimal places
                        tvBMIValue.setText(String.format("%.2f", bmi));

                        // TASK 4: UI/UX Category and Color Logic
                        String category;
                        int color;

                        if (bmi < 18.5) {
                            category = "UNDERWEIGHT";
                            color = android.R.color.holo_blue_dark;
                        } else if (bmi < 25) {
                            category = "NORMAL";
                            color = android.R.color.holo_green_dark;
                        } else if (bmi < 30) {
                            category = "OVERWEIGHT";
                            color = android.R.color.holo_orange_dark;
                        } else {
                            category = "OBESE";
                            color = android.R.color.holo_red_dark;
                        }

                        tvCategory.setText(category);
                        tvCategory.setTextColor(ContextCompat.getColor(MainActivity.this, color));
                        resultCard.setVisibility(View.VISIBLE);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Please enter values", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}