package oop.teamShoppingMallEx.entityEx;

public class PersonEx {

    private String name;
    private String userMobile;
    private String address;

    PersonEx(){}

    public PersonEx(String name, String userMobile) {
        this.name = name;
        this.userMobile = userMobile;
    }

    public PersonEx(String name, String userMobile, String address) {
        this.name = name;
        this.userMobile = userMobile;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public String getAddress() {
        return address;
    }
}
