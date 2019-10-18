package sk.itsovy.project;

public class Main {
    public static void main(String[] args) {

        Fragment f1=new Fragment(9,3);
        Fragment f2=new Fragment(3,5);
        Fragment f3=new Fragment(2,5);
        Fragment f4=f2.copy();
        Fragment f5=new Fragment(f1);
        Fragment f6=new Fragment(28,10);

        MixedNumber mn1=new MixedNumber(4, f5);

        MyMath mm1=new MyMath();

        f6.getMixedNumber();
    }
}
