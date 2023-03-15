package com.elijah.Student;

import java.util.Random;
import com.elijah.Quiz.*;

public class Student {
    public String name;
    private byte quizScore;
    public boolean passedQuiz;

    public Student(String name) {
        this.name = name;
    }

    public void TakeQuiz(Quiz quiz) {
        Random random = new Random();

        this.quizScore = (byte)(random.nextInt(100) + 1);

        if (this.quizScore >= quiz.difficulty) {
            this.passedQuiz = true;
        } else {
            this.passedQuiz = false;
        }
    }
}