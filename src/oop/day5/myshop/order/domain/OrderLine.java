package oop.day5.myshop.order.domain;

public class OrderLine {
    /*
주문항목 표현 클래스  : 주문할 상품, 상품의 가격, 구매 개수, 각 구매 항목의 구매 가격 제공
한 상품(Product)을 얼마에(price) 몇 개 살지(quantity) 담고, CalculateTotalAmounts
* */
    private Product product;
    private int price;
    private int quantity;
    private int amounts;

    public int getAmounts() {
        return amounts;
    }

    OrderLine(){}

    public OrderLine(Product product, int price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.amounts = this.calculateAmounts();
    }

    private int calculateAmounts() {
        return this.price * quantity;
    }
}
