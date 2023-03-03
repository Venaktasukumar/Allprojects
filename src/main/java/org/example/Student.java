package org.example;
import java.util.logging.*;
class Student {
    Logger l = Logger.getLogger("com.api.jar");
    String name;
    char grade;
    float gPA;

    Student(String s, char g, float gpa) {
        name = s;
        grade = g;
        gPA = gpa;
    }

    public void updateGPA(float gPa) {
        gPA = gPa;
        l.info("Your cgpa is updated");
    }

    public String displayGPa() {
        return name + " has a gpa is " + gPA;
    }
}