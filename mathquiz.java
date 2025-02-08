package com.mathquiz;

import java.util.Scanner;

public class MathQuiz {
    private Scanner scanner;
    private ScoreManager scoreManager;

    public MathQuiz() {
        this.scanner = new Scanner(System.in);
        this.scoreManager = new ScoreManager();
    }

    public void start() {
        System.out.println("Welcome to the Math Quiz!");
        int score = 0;

        for (int i = 0; i < 5; i++) {
            if (QuestionGenerator.askQuestion(scanner)) {
                score++;
            }
        }

        System.out.println("Your final score: " + score + "/5");
        scoreManager.saveScore(score);
        scoreManager.showScores();
    }
}
