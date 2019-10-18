package sk.itsovy.project;

public class Main {
    public static void main(String[] args) {

        /*Fragment f1=new Fragment(32, 48);
        System.out.println(f1.toString());
        f1.changeToBasicShape();
        System.out.println(f1.toString());
        f1.extendFragment(-5);
        System.out.println(f1.toString());
        System.out.println(f1.getRealValue());

        Fragment f2=new Fragment(7,28);
        f2.changeToBasicShape();
        System.out.println(f2.toString());
        System.out.println(f2.isFragmentInBasicShape());

        Fragment f3=new Fragment(7,0);

        Fragment f4= f2.copy();

        Fragment f5=new Fragment(f1);*/

        /*Rectangle r1=new Rectangle(12,5);
        r1.print();
        System.out.println(r1.calcArea());
        System.out.println(r1.calcPerimeter());
        System.out.println(r1.calcDiagonal());
        r1.setCharacter('*');
        r1.setFill(true);
        r1.showRectangle();*/

        Circle c1=new Circle(10);
        System.out.println(c1.calcArea());
        System.out.println(c1.calcPerimeter());
        c1.print();
    }
}
