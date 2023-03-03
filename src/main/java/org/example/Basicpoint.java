package org.example;
class Basicpoint implements Cloneable {
    int x;
    int y;

    public Basicpoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String eqqual(int x1, int y1) {

        if (x == x1 && y == y1) {
            return "true";
        }
        return "false";
    }
}