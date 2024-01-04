package oop.day6.advenced.abstractClass.shape;

public class ShapeExample {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 3.5); //1
        System.out.println(circle.tostring());  //6
        Rectangle rectangle = new Rectangle("Blue", 5.0, 5.5); //9
        System.out.println(rectangle.tostring());  //16

    }

}
