# BMI Calculator Android Application

This is an Android application designed to calculate the Body Mass Index (BMI) based on user input for weight (kilograms) and height (meters), and classifies the result into BMI Categories.

## Features
- Input fields for weight and height.
- Computation of BMI using the standard formula.
- Classification of BMI into categories: (Underweight, Normal, Overweight, and Obese) based on the BMI result. 
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

## Language
The project has been developed using Java. 
The IDE to be used is Android Studio. 

## User Interface
Labeled input fields for weight and height.
A "Calculate BMI" button.
TextViews to display: (BMI value, BMI classification)
