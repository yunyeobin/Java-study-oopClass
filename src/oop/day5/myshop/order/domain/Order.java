package oop.day5.myshop.order.domain;

import java.util.List;
//주문
//(상품명, 상품가격, 구매개수, 각 구매항목 별 구매가격)
//-상품 종류 및 수량 선택
//-배송지 지정(이름, 번호, 주소 입력)
//-총 주문금액 표시(상품 가격 * 상품 수량)
//-주문 취소
//-결제하기
//-출고 상태로 변경


public class Order {
    private List<OrderLine> orderLines;
    private Money totalAmounts;
    private ShippingInfo shippingInfo;
    private OrderState state;

    public Order(List<OrderLine>orderLines, ShippingInfo shippingInfo){
        setOrderLines(orderLines);
        setShippingInfo(shippingInfo);
    }

    private void setOrderLines(List<OrderLine> orderLines){
        verifyAtlestOneorMoreOrderLines(orderLines);
        this.orderLines = orderLines;
        calculateTotalAmounts();
    }
    public void setShippingInfo(ShippingInfo shippingInfo) {
        if (shippingInfo == null) throw new IllegalArgumentException("no ShippingInfo");
        this.shippingInfo = shippingInfo;
    }


    //veri
    private void verifyAtlestOneorMoreOrderLines(List<OrderLine>orderLines){
        if(orderLines == null || orderLines.isEmpty()){
            throw new IllegalArgumentException("no OrderLine");
        }//throw 예외처리 -> 이러한 예외가 있다. 그래서 그냥-> "no OrderLine" 출력...^^;;
    }

    private void calculateTotalAmounts(){
        int sum = orderLines.stream().mapToInt(x->x.getAmounts()).sum(); //mapToInt...for문 처럼 x를 이게.. 반복 돈다.. 요소를 하나씩 읽는다.. map으로 가져오는건 무조건 object타입이라 int붙여줌. 왜냐면 가격이거든^^
        this.totalAmounts = new Money(sum);
    }

    public void changeShipped(ShippingInfo shippingInfo){
        verifyNotYetShipped();
        setShippingInfo(shippingInfo);
    }
    private void verifyNotYetShipped(){
        if (state != OrderState.PAYMENT_WAITING && state != OrderState.PREPARING)
            throw  new IllegalArgumentException("already shipped");
    }

    public void changeShippingInfo(ShippingInfo newShipping){}
    public void cancel(){
        verifyNotYetShipped();
        this.state = OrderState.CANCELED;
    }

    public void productChoice(){}
    public void shippingInfo(){}
    public void totalOrderAmount(){}
    public void OrderCancel(){}
    public void payment(){}
    public void changeOrderStatement(){}
}
