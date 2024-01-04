package oop.day4.inher;

public class AA {

    AA(){}
    int aa = 10;
    //메소드 오버라이딩  : 실행문 재정의
    void aa(){
        System.out.println("AA클래스의 aa()");
    }
}

class BB extends AA{
    BB() {
        super();
    }

    int bb= 20;
    void aa(){
        System.out.println("BB클래스의 aa()");
    }
}

class CC extends BB{
    void aa(){
        System.out.println("BB클래스의 aa()");
    }
}

class ABMain{
    public static void main(String[] args) {
        BB ab = new BB();
        ab.aa();
        System.out.println(ab.aa + " " + ab.bb);
        AA aa = new AA();
        aa.aa();
        System.out.println(aa.aa);
        AA ab1 = new BB();
        ab1.aa();
        System.out.println(ab1.aa);
        AA cc = new CC();
        cc.aa();



    }
}




