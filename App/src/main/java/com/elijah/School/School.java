package com.elijah.School;

import com.elijah.Student.*;

public class School {
    public Student[] students = new Student[8];

    public School() {
        this.students[0] = new Student("Bob");
        this.students[1] = new Student("Sally");
        this.students[2] = new Student("Joe");
        this.students[3] = new Student("Martin");
        this.students[4] = new Student("Emily");
        this.students[5] = new Student("Sam");
        this.students[6] = new Student("Jhon");
        this.students[7] = new Student("Rebecca");
    }
}