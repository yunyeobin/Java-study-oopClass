package oop.day2.basic.classEx.sec03.exam01;

public class Car {
	//필드 선언
    String model; //앞에 접근제한자 없으면 default. 같은 패키지 안에서는 public느낌.객체
    boolean start;

    int speed;


    int maxspeed = 350;

    Car(){}
   public Car(String model, boolean start, int speed){  //model,start,speed 얘네가 매개변수
        this.model = model;
        this.start = start;
        this.speed = speed;         //여기서 이렇게.. 생성자 만들어 놓으면..

    }//===========>> 이걸 통틀어 생성자!

public void print(){
    System.out.println(this.model+" "+this.start+" "+this.speed);
}



}