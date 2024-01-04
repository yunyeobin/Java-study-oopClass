package oop.InterfaceTest;

public class AnimalTestMain{
    public static void main(String[] args) {
        Dog dog = new Dog(8);
        Chicken chicken = new Chicken(3);
        Chicken cheatablechicken = new Chicken(5);
        if (cheatablechicken instanceof Cheatable){
            cheatablechicken.fly();
        }
        for (int i = 0; i < 3; i++) {
        dog.run(1);
        chicken.run(1);
        cheatablechicken.run(1);
        }

    }
}
