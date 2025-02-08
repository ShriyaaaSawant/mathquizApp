# MathQuizApp

## Description
MathQuizApp is a Java-based application that generates random math problems for users to solve. It tracks user answers, stores scores in an SQLite database, and displays past results. The application provides a simple and interactive way to test and improve mathematical skills.

## Features
- Generates random math problems with addition, subtraction, multiplication, and division.
- Accepts user input and validates answers.
- Tracks and stores user scores in an SQLite database.
- Displays previous scores for performance tracking.
- Implements modular Java code for better maintainability.
- Includes robust error handling for smooth operation.

## Technologies Used
- **Java**: Core programming language for application development.
- **JDBC & SQLite**: For database management and storing user scores.
- **Maven** *(optional)*: For dependency management and project build.

## Installation & Setup
 1. **Navigate to the Project Directory**
   
   cd MathQuizApp
   ```
2. **Compile and Run the Application**
   ```
   javac -d bin src/main/java/com/mathquiz/*.java
   java -cp bin com.mathquiz.Main
   ```

## Usage
- The application prompts users with randomly generated math questions.
- Users enter their answers via the console.
- Correct answers increase the score, and incorrect answers display the correct result.
- At the end of the session, the final score is saved and displayed along with past scores.


