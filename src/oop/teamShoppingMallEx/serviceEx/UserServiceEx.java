package oop.teamShoppingMallEx.serviceEx;

import oop.teamShoppingMallEx.entityEx.UserEx;

public class UserServiceEx {
    private UserEx userEx;

    public UserServiceEx(UserEx userEx) {
        this.userEx = userEx;
    }

    public UserEx getUserEx() {
        return userEx;
    }
    public void displayUser(){
        System.out.println(userEx.toString());
    }
}
