package org.example;

class Basicshape {
    double length;
    double breadth;
    double radius;
    double sidelength1;
    double sidelength2;
    double sidelength3;
    double base;
    double height;
    double area;
    double perimeter;
    String tr = "triangle";
    String rec = "rectangle";
    String cir = "circle";

    Basicshape(double l, double br) {
        length = l;
        breadth = br;
    }

    Basicshape(double r) {

        radius = r;
    }

    Basicshape(double s1, double s2, double s3, double b, double h) {
        sidelength1 = s1;
        sidelength2 = s2;
        sidelength3 = s3;
        base = b;
        height = h;
    }

    public double areA(String s) {
        if (s.equals(tr)) {
            area = 0.5 * base * height;
            return area;
        } else if (s.equals(rec)) {
            area = length * breadth;
            return area;
        } else if (s.equals(cir)) {
            area = (3.14) * radius * radius;
            return area;
        }
        return 0.0;
    }

    public double perimeteR(String h) {
        if (h.equals(tr)) {
            perimeter = sidelength1 + sidelength2 + sidelength3;
            return perimeter;
        } else if (h.equals(rec)) {
            perimeter = 2 * (length + breadth);
            return perimeter;
        } else if (h.equals(cir)) {
            perimeter = 2 * 3.14 * radius;
            return perimeter;
        }
        return 0.0;

    }
}

