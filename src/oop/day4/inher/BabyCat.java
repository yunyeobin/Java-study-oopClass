package oop.day4.inher;

public class BabyCat extends ParentCat{
    private String color;
    public void meow(){

        System.out.println("니야아앙아아옹");
    }

    public void printInfo(){
        getBreed();
        System.out.println(this.color);
    }

    BabyCat(){}
    BabyCat(String color){
        super("샴고양이"); // super->내 부모의 생성자 호출
        this.color = color;

    }
}
