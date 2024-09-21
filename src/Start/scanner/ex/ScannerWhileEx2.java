// 문제 - 상품 가격 계산
// - 사용자로부터 상품의 가격(Price)과 수량(Quantity)을 입력받고, 총 비용을 출력하는 프로그램을 작성하세요.
// - 가격과 수량을 입력받은 후에는 이들의 곱을 출력하세요. 출력 형태는 "총 비용: [곱한 결과]"이어야 합니다.
// - -1을 입력하여 가격 입력을 종료합니다.

package Start.scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("상품의 가격을 입력하세요. (-1을 입력하면 종료): ");
            int price = scanner.nextInt();

            if (price == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("구매하려는 수량을 입력하세요: ");
            int quantity = scanner.nextInt();

            int sum = price * quantity;
            System.out.println("총 비용: " + sum);
        }
    }
}
