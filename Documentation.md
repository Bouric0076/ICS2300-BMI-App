# Assignment Report: BMI Calculator Android Application

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

## **App Design Description**

- **Purpose:** Mobile app to calculate Body Mass Index (BMI) and show a user-friendly classification.
- **Platform:** Android (single-activity app). See the activity implementation at [app/src/main/java/com/ics2300/bmi/MainActivity.java](app/src/main/java/com/ics2300/bmi/MainActivity.java).
- **UI Layout:** Implemented using `ConstraintLayout` in [app/src/main/res/layout/activity_main.xml](app/src/main/res/layout/activity_main.xml).
   - Top: title `TextView`.
   - Middle: two `EditText` fields for weight (kg) and height (m).
   - Action: `Button` labeled "Calculate".
   - Bottom: result `TextView` that shows BMI and classification.
- **User Flow:** Enter weight and height → tap Calculate → display BMI (two decimal places) and category.

## **BMI Logic Explanation**

- **Formula:** $BMI = \\\dfrac{weight\\\ (kg)}{height\\\ (m)^2}$.
- **Units:** Weight in kilograms, height in metres. If your UI collects height in centimetres, convert to metres: `height_m = height_cm / 100.0`.
- **Implementation notes:**
   - Validate inputs: non-empty, numeric, height > 0.
   - Calculate as `double bmi = weight / (height * height);` and format with `String.format("%.2f", bmi)` for display.
   - Handle extreme or nonsensical values by showing a friendly error message.

- **Classification (standard ranges):**
   - **Underweight:** BMI &lt; 18.5
   - **Normal weight:** 18.5 ≤ BMI &lt; 25
   - **Overweight:** 25 ≤ BMI &lt; 30
   - **Obesity:** BMI ≥ 30

## **Emulator / Device Screenshots**

- The report includes screenshots of the running app. Replace the placeholders in `docs/screenshots/` with actual PNGs named `screen1.png`, `screen2.png`, etc.
- Embedded placeholders (replace with real images):

![App Home / Input Screen](docs/screenshots/screen1.png)

![Result Screen (Normal)](docs/screenshots/screen2.png)

**How to capture screenshots**
- From Android Studio: Run the app on emulator → `Screen Capture` (Device File Explorer or Run > Capture Screenshot).
- Using `adb` (connected device or emulator):
```
adb shell screencap -p /sdcard/screen1.png
adb pull /sdcard/screen1.png docs/screenshots/screen1.png
```

## **Example Commits and Commands**

- Initialising the project (example):
```
git init
git add .
git commit -m "Initial commit: project skeleton and gradle files"
```
- Adding BMI logic and UI:
```
git add app/src/main/java/com/ics2300/bmi/MainActivity.java app/src/main/res/layout/activity_main.xml
git commit -m "Add MainActivity and layout for BMI input and calculation"
```
- Add documentation and screenshots placeholder:
```
git add Documentation.md docs/screenshots/.gitkeep
git commit -m "Add project documentation and screenshots folder"
```

## **Add Project Documentation**

- This `Documentation.md` file is the project report. It contains app design, BMI logic, screenshot placeholders, and example commit messages.

## **Include App Screenshots in Report**

- Place PNG screenshots in `docs/screenshots/` with names used above (`screen1.png`, `screen2.png`). After adding them, commit with:
```
git add docs/screenshots/screen1.png docs/screenshots/screen2.png
git commit -m "Add emulator/device screenshots to Documentation"
```

---

**Testing notes:** Run the app on an emulator or device and validate a few cases (underweight, normal, overweight, obese) to ensure classification mapping matches the BMI ranges.

