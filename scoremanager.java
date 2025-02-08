package com.mathquiz;

import java.sql.*;

public class ScoreManager {
    private static final String DB_URL = "jdbc:sqlite:math_quiz.db";
    private Connection conn;

    public ScoreManager() {
        setupDatabase();
    }

    private void setupDatabase() {
        try {
            conn = DriverManager.getConnection(DB_URL);
            Statement stmt = conn.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS scores (id INTEGER PRIMARY KEY AUTOINCREMENT, score INTEGER)");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void saveScore(int score) {
        try {
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO scores (score) VALUES (?)");
            pstmt.setInt(1, score);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void showScores() {
        System.out.println("Previous Scores:");
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM scores");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + " - Score: " + rs.getInt("score"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
