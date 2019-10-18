package sk.itsovy.project;

public class MyMath {

    public Fragment add(Fragment a, Fragment b) {
        Fragment result=null;
        result=
                new Fragment(a.getNumerator()*b.getDenominator()+a.getDenominator()*b.getNumerator(),
                        a.getDenominator()*b.getDenominator());
        result.changeToBasicShape();
        return result;
    }

    public Fragment sub(Fragment a, Fragment b) {
        Fragment result=null;
        result=
                new Fragment(a.getNumerator()*b.getDenominator()-a.getDenominator()*b.getNumerator(),
                        a.getDenominator()*b.getDenominator());
        result.changeToBasicShape();
        return result;
    }

    public Fragment mul(Fragment a, Fragment b) {
        Fragment result=null;
        result=
                new Fragment(a.getNumerator()*b.getNumerator(), a.getDenominator()*b.getDenominator());
        result.changeToBasicShape();
        return result;
    }

    public Fragment div(Fragment a, Fragment b) {
        Fragment result = null;
        result =
                new Fragment(a.getNumerator() * b.getDenominator(), a.getDenominator() * b.getNumerator());
        result.changeToBasicShape();
        return result;
    }

    public static Fragment add(int value, Fragment a) {
        Fragment result=null;
        result =
                new Fragment(value*a.getDenominator()+1*a.getNumerator(),1*a.getDenominator());
        result.changeToBasicShape();
        return result;
    }

    public static Fragment sub(int value, Fragment a) {
        Fragment result=null;
        result =
                new Fragment(value*a.getDenominator()-a.getNumerator(),a.getDenominator()*1);
        result.changeToBasicShape();
        return result;
    }

    public static Fragment mul(int value, Fragment a) {
        Fragment result=null;
        result =
                new Fragment(a.getNumerator()*value, a.getDenominator()*1);
        result.changeToBasicShape();
        return result;
    }

    public static Fragment div(int value, Fragment a) {
        Fragment result=null;
        result =
                new Fragment(value*a.getDenominator(),a.getNumerator()*1);
        result.changeToBasicShape();
        return result;
    }
}
