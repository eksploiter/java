// 문제: 상품 주문 시스템 개발 - 사용자 입력
// 문제 설명
// 앞서 만든 상품 주문 시스템을 사용자 입력을 받도록 개선해보자.

package javaBasic.ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int N = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[N];

        for (int i = 0; i < N; i++) {
            System.out.println((i + 1) + "번쨰 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = scanner.next();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();

            scanner.nextLine();
            orders[i] = createOrder(productName, price, quantity);
        }

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);

        scanner.close();
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
