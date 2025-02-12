package com.mathquiz;

import java.util.Random;
import java.util.Scanner;

public class QuestionGenerator {
    public static boolean askQuestion(Scanner scanner) {
        Random rand = new Random();
        int num1 = rand.nextInt(10) + 1;
        int num2 = rand.nextInt(10) + 1;
        char[] operators = {'+', '-', '*', '/'};
        char operator = operators[rand.nextInt(4)];

        int correctAnswer = switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num2 != 0 ? num1 / num2 : 0;
            default -> 0;
        };

        System.out.print("Solve: " + num1 + " " + operator + " " + num2 + " = ");
        int userAnswer = scanner.nextInt();

        if (userAnswer == correctAnswer) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("Wrong! The correct answer is: " + correctAnswer);
            return false;
        }
    }
}
