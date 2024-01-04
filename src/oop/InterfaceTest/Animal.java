package oop.InterfaceTest;

public abstract class Animal {
    int speed; //속도 km/h

    double distance; //이동거리 km

    public Animal(int speed) {
        this.speed = speed;
    }
    abstract void run(int hours);

    public double getDistance() {
        return distance;
    }
}
