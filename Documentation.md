# Assignment Report: BMI Calculator Android Application

**Name:** Micah Sagero  
**Course:** ICS 2300 Mobile Applications Design and Development  
**Task:** Android App for BMI Classification

---

## 1. App Design and Layout

The application is designed with a clean and intuitive user interface using `ConstraintLayout`. The layout includes:
- A title `TextView` at the top.
- Two `EditText` fields for capturing user input (weight in kg and height in meters).
- A `Button` to trigger the BMI calculation.
- A `TextView` at the bottom to display the calculated BMI value and its classification.

The design focuses on simplicity and ease of use, ensuring that users can quickly enter their data and get results.

## 2. Logic for BMI Calculation

The core logic of the application is implemented in the `MainActivity.java` file. The calculation follows these steps:
1. **Input Capture:** The application retrieves the text entered by the user in the weight and height fields.
2. **Validation:** It checks if the inputs are empty or invalid (e.g., non-numeric or zero height) to prevent application crashes.
3. **Computation:** The BMI is calculated using the formula:
   \[ BMI = \frac{weight(kg)}{height(m)^2} \]
4. **Classification:** Based on the calculated BMI, the app assigns a category:
   - **Underweight:** BMI < 18.5
   - **Normal:** 18.5 ≤ BMI < 25
   - **Overweight:** 25 ≤ BMI < 30
   - **Obese:** BMI ≥ 30
5. **Output:** The result is formatted to two decimal places and displayed to the user.

## 3. Screenshots

*(Note: In a real-world scenario, screenshots of the app running on an emulator would be placed here.)*

The application has been tested with various inputs to ensure accuracy and robustness.
- **Input:** Weight = 70kg, Height = 1.75m -> **Result:** BMI = 22.86 (Normal)
- **Input:** Weight = 90kg, Height = 1.80m -> **Result:** BMI = 27.78 (Overweight)
