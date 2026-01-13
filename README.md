# BMI Calculator Android Application

This is an Android application designed to calculate the Body Mass Index (BMI) based on user input for weight (in kilograms) and height (in meters).

## Features
- Input fields for weight and height.
- Computation of BMI using the standard formula.
- Classification of BMI into categories: Underweight, Normal, Overweight, and Obese.
- User-friendly interface.

## How to Run
1. Clone this repository.
2. Open the project in Android Studio.
3. Build and run the application on an emulator or a physical Android device.

## Logic
The application uses the following formula for BMI calculation:
`BMI = weight(kg) / (height(m) * height(m))`

The classification is based on the following ranges:
- **Underweight**: BMI < 18.5
- **Normal**: 18.5 <= BMI < 25
- **Overweight**: 25 <= BMI < 30
- **Obese**: BMI >= 30

