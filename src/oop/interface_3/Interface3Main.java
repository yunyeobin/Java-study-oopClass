package oop.interface_3;

public class Interface3Main {
    public static void main(String[] args) {
        //구현객체 생성
        B b = new B();
        C c = new C();
        B bd = new D();
        System.out.println("=================");

        D d = new D();
        E e = new E();
        C ce = new E();
        System.out.println("==================");

        //인터페이스 변수 선언
        A a;
        System.out.println("==================");

        //변수에 구현 객체 대입
        a = b; //A <--  B  자동타입변환(promotion)
        B b1 = (B)a;   //A ---> B 강제타입변환(casting)
        a=c;   //A <--  C  자동타입변환(promotion)
        C c1 = (C)a;   //A ---> C 강제타입변환(casting)
        a=d;   //A <--  D  자동타입변환(promotion)
        D d1 = (D)a;   //A ---> D 강제타입변환(casting)
        a=e;   //A <--  E  자동타입변환(promotion)
        E e1 = (E)a;   //A ---> E 강제타입변환(casting)

    }
}
