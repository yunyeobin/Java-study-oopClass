package oop.day7.application;

public class Acount {
    private int balance;
    private String name;
    private String accountNumber;
    private String password;

    public String getPassword() {
        return password;
    }

    Acount(){}

    public Acount(String accountNumber, String name, String password) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.password = password;
    }


    public int deposit(int money) {
        balance += money;
        balancePrint();
        return this.balance;
    }

    public void balancePrint() {
        System.out.println("잔고 : " + balance);
    }
}
