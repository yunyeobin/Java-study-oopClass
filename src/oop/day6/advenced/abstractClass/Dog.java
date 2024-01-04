package oop.day6.advenced.abstractClass;

public class Dog extends AbstractDog{
    @Override
    public void printSound() {
        System.out.println("멍멍멍멍");
    }
    public void tailing(){
        System.out.println("꼬리샥샥");
    }
}
