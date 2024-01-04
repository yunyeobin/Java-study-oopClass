package oop.day4.inher;

public class Calculation {

    protected int a;
    protected int b;

    Calculation(){}

    public Calculation(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void addition(){
        System.out.println("두 수의 덧셈 : "+(a+b));
    }
    public void substraction(){
        System.out.println("두 수의 뺄셈 : "+(a-b));
    }
}
