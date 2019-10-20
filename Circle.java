package sk.itsovy.project;

public class Circle {

    private int r;

    public Circle() {
    }

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public double calcArea() {
        return Math.PI*r*r;
    }

    public double calcPerimeter() {
        return 2*Math.PI*r;
    }

    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Circle: r = "+r;
    }
}
