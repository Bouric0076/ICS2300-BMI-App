package com.example.bmicalculator; // <--- MAKE SURE THIS MATCHES YOUR PACKAGE NAME

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

        // Initialize Views
        EditText etWeight = findViewById(R.id.etWeight);
        EditText etHeight = findViewById(R.id.etHeight);
        Button btnCalculate = findViewById(R.id.btnCalculate);

        LinearLayout resultCard = findViewById(R.id.resultCard);
        TextView tvBMIValue = findViewById(R.id.tvBMIValue);
        TextView tvCategory = findViewById(R.id.tvCategory);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String weightStr = etWeight.getText().toString();
                String heightStr = etHeight.getText().toString();

                if (!weightStr.isEmpty() && !heightStr.isEmpty()) {
                    try {
                        float weight = Float.parseFloat(weightStr);
                        float height = Float.parseFloat(heightStr);

                        if (height > 0) {
                            // 1. Computation Logic
                            float bmi = weight / (height * height);

                            // 2. Format to 2 decimal places (Task 4 requirement)
                            tvBMIValue.setText(String.format("%.2f", bmi));

                            // 3. Classification and UX Improvement (Color Coding)
                            String category;
                            int colorRes;

                            if (bmi < 18.5) {
                                category = "UNDERWEIGHT";
                                colorRes = android.R.color.holo_blue_dark;
                            } else if (bmi < 25) {
                                category = "NORMAL";
                                colorRes = android.R.color.holo_green_dark;
                            } else if (bmi < 30) {
                                category = "OVERWEIGHT";
                                colorRes = android.R.color.holo_orange_dark;
                            } else {
                                category = "OBESE";
                                colorRes = android.R.color.holo_red_dark;
                            }

                            // Update UI
                            tvCategory.setText(category);
                            tvCategory.setTextColor(ContextCompat.getColor(MainActivity.this, colorRes));
                            resultCard.setVisibility(View.VISIBLE);

                        } else {
                            Toast.makeText(MainActivity.this, "Height must be greater than 0", Toast.LENGTH_SHORT).show();
                        }
                    } catch (NumberFormatException e) {
                        Toast.makeText(MainActivity.this, "Invalid input", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}