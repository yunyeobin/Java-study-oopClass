package oop.day4.inher;

public class Inherintance01 extends Calculation{
    Inherintance01(){}

    public Inherintance01(int a, int b) {
        super(a, b);
    }

    public void multiplication(){
        System.out.println("두 수의 곱셈 : "+(a*b));
    }
}
