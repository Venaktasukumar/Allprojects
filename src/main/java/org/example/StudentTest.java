package org.example;

class StudentTest {
    String name;
    int age;
    double gpa;

    public StudentTest(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getStudentname() {
        return name;
    }

    public void setStudentname(String name) {
        this.name = name;
    }

    public int getStudentage() {
        return age;
    }

    public void setStudentage(int age) {
        this.age = age;
    }

    public double getStudentgpa() {
        return gpa;
    }

    public void setStudentgpa(double gpa) {
        this.gpa = gpa;
    }
}
