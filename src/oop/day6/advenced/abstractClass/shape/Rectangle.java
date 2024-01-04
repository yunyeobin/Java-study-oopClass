package oop.day6.advenced.abstractClass.shape;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color); //10
        this.length = length; //13
        this.width = width;  //14
        this.area();  //15
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public String tostring() {
        return "사각형 색상은" + super.getColor() + "그리고 면적은 : " + this.area();
    }  //18
}
