package oop.day4.inher;

public class CalculaterMain {
    public static void main(String[] args) {
        Inherintance01 calculater = new Inherintance01(20,10);
        calculater.addition(); //부모
        calculater.substraction(); //부모
        calculater.multiplication(); //자식
    }
}
