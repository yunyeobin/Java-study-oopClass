package oop.day2.basic.classEx.sec05.exam01;

public class Calculator {

    boolean power = false;

    public Calculator(){}
    public Calculator(boolean power){
        this.power = power;
        if (this.power == true){powerOn();}
        else{powerOff();}
    }

	//리턴값이 없는 powerOn() 메소드 선언
    public void powerOn(){
        this.power = true;
        System.out.println("전원이 켜졌습니다. ");
    }


	//리턴값이 없는 메소드 선언
    public void powerOff(){
        this.power = false;
        System.out.println("전원이 꺼졌습니다. ");
    }


	//호출 시 두 정수 값을 전달받고,divided 메소드를 생성합니다. 두 수를 나누기 연산하여
	//호출한 곳으로 결과값 int를 리턴하는 메소드 선언

    public double divided(int a, int b){
        return (double)a/(double)b;

    }

    public int plus(int a, int b){
        return a+b;

    }


	//호출 시 두 정수 값을 전달받고,
	//호출한 곳으로 결과값 double을 리턴하는 메소드 선언

}