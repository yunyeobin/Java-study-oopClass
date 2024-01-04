package oop.day4.inher;

public class ParentCat {

    private String breed;
    public void eat(){
        System.out.println("먹이를 먹다");
    }
    ParentCat(){}
    ParentCat(String breed){
        this.breed = breed;
    }
    public String getBreed(){
        return breed;
    }
}
