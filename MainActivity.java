package com.example.bmicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Name: Micah Sagero
 * Student Number: [As per assignment requirement]
 * 
 * This activity handles the user interface and logic for calculating the Body Mass Index (BMI).
 * It captures weight and height inputs, performs the calculation, and displays the result
 * along with the corresponding BMI classification.
 */
public class MainActivity extends AppCompatActivity {

    private EditText etWeight;
    private EditText etHeight;
    private Button btnCompute;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI components
        etWeight = findViewById(R.id.et_weight);
        etHeight = findViewById(R.id.et_height);
        btnCompute = findViewById(R.id.btn_compute);
        tvResult = findViewById(R.id.tv_result);

        // Set click listener for the compute button
        btnCompute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateBMI();
            }
        });
    }

    /**
     * Method to calculate BMI based on user input.
     * Formula: BMI = weight(kg) / (height(m) * height(m))
     */
    private void calculateBMI() {
        String weightStr = etWeight.getText().toString();
        String heightStr = etHeight.getText().toString();

        // Validate inputs
        if (weightStr.isEmpty() || heightStr.isEmpty()) {
            Toast.makeText(this, "Please enter both weight and height", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            float weight = Float.parseFloat(weightStr);
            float height = Float.parseFloat(heightStr);

            if (height <= 0) {
                Toast.makeText(this, "Height must be greater than zero", Toast.LENGTH_SHORT).show();
                return;
            }

            // Perform BMI calculation
            float bmi = weight / (height * height);

            // Determine classification category
            String category;
            if (bmi < 18.5) {
                category = "Underweight";
            } else if (bmi >= 18.5 && bmi < 25) {
                category = "Normal";
            } else if (bmi >= 25 && bmi < 30) {
                category = "Overweight";
            } else {
                category = "Obese";
            }

            // Display the result
            String resultText = String.format("BMI: %.2f\nCategory: %s", bmi, category);
            tvResult.setText(resultText);

        } catch (NumberFormatException e) {
            Toast.makeText(this, "Invalid input format", Toast.LENGTH_SHORT).show();
        }
    }
}
