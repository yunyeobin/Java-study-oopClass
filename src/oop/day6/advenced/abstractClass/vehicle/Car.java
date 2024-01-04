package oop.day6.advenced.abstractClass.vehicle;

public class Car extends FourWheeler{
    @Override
    public void printPrice() {
        System.out.println("가격 : 50,000,000");
    }
    public void printType(){
        System.out.println("이것은 자동차입니다.");
    }
    public void printBrand(){
        System.out.println("브랜드 : BMW");
    }
}
