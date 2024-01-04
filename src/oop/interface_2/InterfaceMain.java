package oop.interface_2;

public class InterfaceMain {
    public static void main(String[] args) {
        InterfaceImpl impl = new InterfaceImpl();
        System.out.println();
        InterfaceA interfaceA = impl;

        InterfaceB interfaceB = impl;
        InterfaceC interfaceC = impl;

        interfaceA.methodA();

        interfaceB.methodB();

        interfaceC.methodA(); //interfaceC는 A랑 B를 상속받았기 때문에 다 구현할 수 있다.
        interfaceC.methodB();
        interfaceC.methodC();
    }
}
