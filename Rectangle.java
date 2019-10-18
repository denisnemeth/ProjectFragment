package sk.itsovy.project;

public class Rectangle {

    private int a;
    private int b;
    private char character;
    private boolean fill;

    public Rectangle() {
    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
        character='#';
        fill=false;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public int calcArea() {
        return a*b;
    }

    public int calcPerimeter() {
        return 2*(a+b);
    }

    public double calcDiagonal() {
        return Math.sqrt((a*a)+(b*b));
    }
    public void showRectangle() {
        if (fill=false) {
            for (int rows=0; rows<b; rows++) {
                for (int columns=0; columns<a; columns++) {
                    if (rows==0 || rows==b || columns==0 || columns==a) {
                        System.out.print(character+" ");
                    } else if (fill=true) {
                        System.out.print(character + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }

    public void print() {
        System.out.println(toString());
    }

    public String toString() {
        return "Rectangle: a = "+a+", b = "+b;
    }
}
