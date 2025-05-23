📱 Overview
Healthy Habits Tracker is an Android app designed to help students manage, track, and optimize their daily healthy habits. The app allows users to log daily entries of water intake, exercise, and sleep duration, with detailed views and summaries for reflection and improvement.

✨ Features
Splash Screen

Displays app name, student name, student number, and logo.

Navigation to main screen or exit option.

Main Screen

Input daily values for:

Water Intake (cups)

Exercise Duration (minutes)

Sleep Duration (hours)

Save data using parallel arrays.

Buttons:

Detailed View – View entered data.

Clear Data – Reset all data inputs.

Detailed View Screen

Lists all daily entries in detail.

Shows optional statistics:

Day with highest water intake.

Day with most exercise.

Average sleep duration.

Navigation back to the main screen.

Error Handling

Input validation for non-numeric entries.

Range checks with user feedback using Toast messages.

🛠 Tech Stack
Language: Kotlin

IDE: Android Studio

UI Framework: XML-based layout

Data Storage: Parallel arrays in memory

📈 Example Data (Input)
Date	Water (cups)	Exercise (min)	Sleep (hrs)	Notes
2024-04-02	8	30	7	Went for a morning jog.
2024-04-03	6	15	6	Had a busy day, less exercise.
2024-04-08	–	–	–	Forgot to track water intake.

🔍 Flowchart / Pseudocode
plaintext
Copy
Edit
START
↓
Splash Screen → Button (Main Screen) or Exit
↓
Main Screen → Input Data + Save to Arrays
   ↓
   → Button (Detailed View Screen)
       ↓
       Show All Entries + Stats
       ↓
       Button (Back to Main)
↓
END
💾 Installation
Clone the repository:

bash
Copy
Edit
git clone https://github.com/yourusername/HealthyHabitsTracker.git
Open the project in Android Studio.

Run the app on an emulator or Android device (minimum SDK 21).

✅ Evaluation Criteria Checklist
Criteria	Implemented
Variable Declarations	✅
Array and Loop Usage	✅
Data Calculations	✅
Navigation & UI	✅
Aesthetics & Layout	✅
Error Handling	✅
GitHub Integration	✅
Documentation	✅

🧠 License
This project is created as part of the IMAD5112 coursework and is intended for educational use only.
