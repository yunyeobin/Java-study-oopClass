package oop.teamShoppingMallEx.serviceEx;

import java.util.Scanner;

public class OrderServiceEx {
    private Scanner sc;
    private UserServiceEx userServiceEx;
    private BookServiceEx bookServiceEx;

    public OrderServiceEx(Scanner sc, UserServiceEx us) {
        this.sc = sc;
        this.userServiceEx = us;
    }

    public void resetCart(){}
    public void addCart(){}
    public void decreaseAmount(){}
    public void deleteCartProduct(){}
    public void getCartProductList(){}
    public void showReceipt(){}
}
