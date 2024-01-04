package oop.InterfaceTest;

public class Chicken extends Animal implements Cheatable{
    public Chicken(int speed) {
        super(speed);
    }

    @Override
    void run(int hours) {
        distance += hours*speed;
        System.out.println("닭의 이동거리 = "+distance);
    }

    @Override
    public void fly() {
        speed = speed*2;
    }
}
