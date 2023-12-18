package oop.day3.modifier.publicex1;

public class AccesModifier02 {
    public static void main(String[] args) {
        Dog1 dogObj1 = new Dog1();
        dogObj1.breed = "포메";
        dogObj1.color = "흰색";
        dogObj1.age = 5;
        System.out.println(dogObj1.breed +" "+ dogObj1.color + " "+dogObj1.age);
        dogObj1.bowwow();
        dogObj1.run();
    }
}
