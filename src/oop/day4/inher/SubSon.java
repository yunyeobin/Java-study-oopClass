package oop.day4.inher;

public class SubSon extends SubFather {

    SubSon(String familyName, String houseAddress){
        super(familyName, houseAddress);
    }

    public void printSon(){
        System.out.println("나는 아들입니다.");

    }
}
