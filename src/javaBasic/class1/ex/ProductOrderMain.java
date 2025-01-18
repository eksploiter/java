// 문제: 상품 주문 시스템 개발

// 문제 설명
// 당신은 온라인 상점의 주문 관리 시스템을 만들려고 한다.
// 먼저 상품 주문 정보를 담을 수 있는 ProductOrder 클래스를 만들어보자.

package javaBasic.class1.ex;

public class ProductOrderMain {
    // 여러 상품 주문 정보를 담는 배열 생성
    // 상품 주문 정보를 'ProductOrder' 타입의 변수로 받아 저장
    // 상품 주문 정보와 최종 금액 출력
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];

        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.productName = "두부";
        productOrder1.price = 2000;
        productOrder1.quantity = 2;
        productOrders[0] = productOrder1;

        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.productName = "김치";
        productOrder2.price = 5000;
        productOrder2.quantity = 1;
        productOrders[1] = productOrder2;

        ProductOrder productOrder3 = new ProductOrder();
        productOrder3.productName = "콜라";
        productOrder3.price = 1500;
        productOrder3.quantity = 2;
        productOrders[2] = productOrder3;

        int priceSum = 0;
        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명: " + productOrder.productName + " , 가격: " + productOrder.price + " , 수량: " + productOrder.quantity);
            priceSum += productOrder.price * productOrder.quantity;
        }
        System.out.println("총 결제 금액: " + priceSum);
    }
}
