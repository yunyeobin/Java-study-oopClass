package oop.day7.application;

public class Gcompany extends Car{
    private int number;


    public Gcompany(int year, String name, int number) {
        super(year, name);
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void local_number(){
        System.out.println("서울"+getYear());
    }
}
