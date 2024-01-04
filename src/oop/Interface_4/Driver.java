package oop.Interface_4;

public class Driver {
    void drive(Vehicle v){ // 인터페이스 타입에서 객체 v! 구현객체가 대입될 수 있도록 매개변수를 인터페이스 타입으로 선언
        v.run(); //인터페이스를 메소드로 호출
    }
}
