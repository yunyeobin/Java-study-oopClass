package oop.day5.myshop.order.domain;
//열거타입 : 상태 정보를 표현
public enum OrderState {
    PAYMENT_WAITING,
    PREPARING,
    SHIPPED,
    DELIVERING,
    DELIVERY_COMPLETED,
    CANCELED;
}
