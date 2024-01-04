package oop.day7.application;

import oop.day3.modifier.publicex1.AccesModifier01;

public class Application {
    public static void main(String[] args) {
        Acount acount1 = new Acount();
        acount1.deposit(10000);

        Acount acount2 = new Acount("12341234", "신세계", "123123");
    }
}
