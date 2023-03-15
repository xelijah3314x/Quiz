package com.elijah;

import java.util.Random;
import com.elijah.Student.*;
import com.elijah.Quiz.*;
import com.elijah.School.*;

public class Main {
    public static void main(String[] args) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_BLUE = "\u001B[34m";

        final School school = new School();
        final Random random = new Random();
        final Quiz quiz = new Quiz((byte)(random.nextInt(100) + 1));

        System.out.println(ANSI_BLUE + "The quiz difficulty is: " + quiz.difficulty + ANSI_BLUE);

        for (int i = 0; i < school.students.length; i++) {
            final Student currentStudent = school.students[i];
            currentStudent.TakeQuiz(quiz);

            if (currentStudent.passedQuiz) {
                System.out.println(ANSI_GREEN + currentStudent.name + " Has passed the quiz!" + ANSI_GREEN);
            } else {
                System.out.println(ANSI_RED + currentStudent.name + " Has failed the quiz." + ANSI_RED);
            }
        }

        System.out.println(ANSI_RESET);
    }
}