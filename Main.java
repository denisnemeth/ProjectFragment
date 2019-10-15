package sk.itsovy.project;

public class Main {
    public static void main(String[] args) {
        Fragment f1=new Fragment(32,48);
        Fragment f2=new Fragment(7,28);
        Fragment f4=f2.copy();
        Fragment f5=new Fragment(f1);

        System.out.println(f1.toString());
        f1.changeToBasicShape();

        System.out.println(f2.toString());
        f2.changeToBasicShape();
    }
}
