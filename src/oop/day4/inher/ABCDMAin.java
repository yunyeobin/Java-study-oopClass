package oop.day4.inher;


class A{
    private int numberA;
    A(){}

    public int getNumberA() {
        return numberA;
    }

    public void printNumberA(){
        System.out.println(getNumberA());
    }
}
class B extends A{ //A클래스의 주소값을 바인딩.
    private int numberB;

    B(){
        //super(); -> extends 요청한 부모클래스의 생성자 호출.
        printNumberB();
    }

    public int getNumberB(){
        return numberB;
    }

    public void printNumberB(){
        System.out.println(getNumberB());
    }

}
class C extends B{
    private int numberC;

    public int getNumberC() {
        return numberC;
    }
    public void printNumberC(){
        System.out.println(getNumberC());
    }
}

class D extends C{
    private int numberD;

    public int getNumberD() {
        return numberD;
    }

    public void getAllInfo(){
        super.printNumberA();
        super.printNumberB();
        super.printNumberC();
    }


}
class E{private int numberE;
}


public class ABCDMAin {
    public static void main(String[] args) {
        B b = new B();
        b.getNumberA();
        b.getNumberB();
        b.printNumberA();
        b.printNumberB();

        A a = new B();
        a.getNumberA();
        a.printNumberA();

        D d = new D();
        d.getAllInfo();

        C c = new C();
    }
}
