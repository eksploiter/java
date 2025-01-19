// 내 풀이

package javaBasic.ref.ex;

public class ProductOrderMain2_My {

    public static void main(String[] args) {
        ProductOrder order1 = createOrder("두부", 2000, 2);
        ProductOrder order2 = createOrder("김치", 5000, 1);
        ProductOrder order3 = createOrder("콜라", 1500, 2);

        printOrder(order1);
        printOrder(order2);
        printOrder(order3);
    }

    static ProductOrder createOrder(String productName, int Price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = Price;
        order.quantity = quantity;
        return order;
    }

    static void printOrder(ProductOrder order) {
        System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
    }
}
