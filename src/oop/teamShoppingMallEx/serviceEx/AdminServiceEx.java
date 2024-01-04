package oop.teamShoppingMallEx.serviceEx;

import oop.day3.modifier.bookPocket.Admin;
import oop.teamShoppingMallEx.entityEx.UserEx;

import java.util.Scanner;

public class AdminServiceEx {
    private Scanner sc;
    private Admin admin;

    public AdminServiceEx(Scanner sc) {
        this.sc = sc;
    }

    public boolean authenticate(UserEx uesr, String id, String password) {
        return true;

    }

}
