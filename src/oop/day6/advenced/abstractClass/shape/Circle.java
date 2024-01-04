package oop.day6.advenced.abstractClass.shape;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color); //2
        this.radius = radius; //5
    }
    @Override
    public double area() {
        return radius * radius * Math.PI;
    }
    @Override
    public String tostring() {
        return "원 색상은" + super.getColor() + "그리고 면적은 : " + this.area(); //8
    }
    public Circle(String color) {
        super(color);
    }
}
