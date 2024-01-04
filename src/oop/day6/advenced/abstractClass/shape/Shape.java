package oop.day6.advenced.abstractClass.shape;

public abstract class Shape {
    private String color;
    public abstract double area();
    public abstract String tostring();
    public Shape(String color){
        System.out.println("Shape 클래스 생성자 호출"); //3  //11
        this.color = color; //4  //12
    }
    public String getColor(){
       return color;
    }; //7  //17
}
