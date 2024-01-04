package oop.interface_2;

public class InterfaceImpl implements InterfaceC{//인터페이스를 그룹핑해서 하나만 implements해버리면 깔끔~
    @Override
    public void methodA() {
        System.out.println("methodA()");
    }

    @Override
    public void methodB() {
        System.out.println("methodB()");

    }

    @Override
    public void methodC() {
        System.out.println("methodC()");

    }
}
