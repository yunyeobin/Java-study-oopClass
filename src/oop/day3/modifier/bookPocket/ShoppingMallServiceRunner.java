package oop.day3.modifier.bookPocket;

import java.util.Scanner;

/*
        BookMarketService (displayMenu)
        OrderService (getCartProduct, resetCart, showReceipt, addCartProduct, decreaseAmount, deleteCartProduct)
        UserService (getCustomer)
 */

public class ShoppingMallServiceRunner {
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.print("당신의 이름을 입력하세요 : ");
        String nameUser = sc.nextLine();
        System.out.print("연락처를 입력하세요 : ");
        String phoneUser = sc.nextLine();
        ShoppingMallService shoppingMallService = new ShoppingMallService(sc, nameUser, phoneUser);
        boolean flagLoop = true; //flagLoop를 true로 초기화. cms가 8이면 false를 리턴.
        while(flagLoop) {
            System.out.println("메뉴 번호를 선택해주세요 ");
            flagLoop = shoppingMallService.displayMenu(); //메뉴가 출력되는 displayMene 메소드. switch문 case1부터 8까지. case8 : false
        }
        sc.close(); //입력 그만
    }
}