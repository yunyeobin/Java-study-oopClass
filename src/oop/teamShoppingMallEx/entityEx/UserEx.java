package oop.teamShoppingMallEx.entityEx;

import oop.teamShoppingMallEx.entityEx.PersonEx;

public class UserEx extends PersonEx {
    public UserEx(String name, String userMobile) {
        super(name, userMobile);

    }

    public UserEx(String name, String userMobile, String address) {
        super(name, userMobile, address);
    }

    public String toString(){
        return "이름이랑 전번";
    }
}
