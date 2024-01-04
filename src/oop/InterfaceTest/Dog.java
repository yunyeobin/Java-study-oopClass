package oop.InterfaceTest;

public class Dog extends Animal{
    public Dog(int speed) {
        super(speed);
    }

    @Override
    void run(int hours) {
        distance += hours*speed/2;
        System.out.println("개의 이동거리 = "+distance);

    }
}