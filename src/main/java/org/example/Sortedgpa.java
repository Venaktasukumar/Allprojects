package org.example;

import java.util.Comparator;

class Sortedgpa implements Comparator<StudentTest> {
    public int compare(StudentTest s1, StudentTest s2) {
        if (s2.getStudentgpa() - s1.getStudentgpa() < 0) {
            return -1;
        } else if (s2.getStudentgpa() - s1.getStudentgpa() > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
