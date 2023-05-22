package main.java.Lab3.controller;

import main.java.Lab3.model.Student;

public class StudentCreator {

    public Student createRandomStudent(){
        HumanCreator humanCreator = new HumanCreator();
        Student student = new Student(humanCreator.createRandomHuman());
        return student;
    }
}
