package oop.day4.inher;

public class SubFather extends GrandFather {
    private String familyName;
    private String houseAddress;

    public SubFather(String familyName, String houseAddress) {

        this.familyName = familyName;
        this.houseAddress = houseAddress;
    }

    public void FamilyName() {
        System.out.println("나는 아버지로부터 상속받습니다.");
        System.out.println("나의 아버지는 "+familyName);
    }

    public void HouseAddress() {
        System.out.println("나의 집은 "+ houseAddress);
    }

    public void printFather(){
        System.out.println("나는 아버지입니다!");

    }
}
