package oop.day6.advenced.abstractClass;

public class AnimialMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printSound();
        Cat cat = new Cat();
        cat.printSound();
        Animal dog2 = new Dog();
        Animal cat2 = new Cat();

        Animal animal = new Animal() {
            @Override
            public void printSound() {

            }
        };

    }
}
