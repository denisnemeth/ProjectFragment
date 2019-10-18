package sk.itsovy.project;

public class Fragment {

    private int numerator;
    private int denominator;

    public Fragment() {
    }

    public Fragment(int numerator, int denominator) {
        if (numerator==0) {
            denominator=1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fragment(Fragment otherFragment) {
        numerator=otherFragment.getNumerator();
        denominator=otherFragment.getDenominator();
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public boolean isFragmentInBasicShape(){
        if(getLargestComDivisor()==1){
            return true;
        }
        else {
            return false;
        }
    }

    public void extendFragment(int value){
        if(value!=0){
            numerator*=value;
            denominator*=value;
        }
    }

    public double getRealValue() {
        return (double) numerator/denominator;
    }

    public MixedNumber getMixedNumber() {
        int value=numerator/denominator;
                Fragment f=new Fragment(numerator%denominator, denominator);
        return new MixedNumber(value,f);
    }

    public void reverse() {
        int temp=numerator;
        numerator=denominator;
        denominator=temp;
    }

    public void opposite() {
        numerator*=-1;
    }

    public Fragment copy() {
        Fragment newFragment=new Fragment(numerator, denominator);
        return newFragment;
    }

    private int getLargestComDivisor() {
        int absNumerator= Math.abs(numerator);
        int absDenominator= Math.abs(denominator);
        int comDivisor=absNumerator>absDenominator?absNumerator:absDenominator;
        while (numerator%comDivisor!=0 || denominator%comDivisor!=0) {
            comDivisor--;
        }
        return comDivisor;
    }

    public void changeToBasicShape(){
        int commonDividisor=getLargestComDivisor();
        numerator=numerator/commonDividisor;
        denominator=denominator/commonDividisor;
    }

    @Override
    public String toString() {
        return numerator+" / "+denominator;
    }
}
