// Scanner 반복 예제2
// - 첫 번째 숫자와 두 번째 숫자를 더해서 출력하는 프로그램을 개발하자.
// - 첫 번째 숫자와 두 번째 숫자 모두 0을 입력하면 프로그램을 종료한다.
// - 프로그램은 반복해서 실행된다.

package Start.scanner;

import java.util.Scanner;

public class ScannerWhile2My {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // 무한 반복
            System.out.print("첫 번째 숫자: ");
            int num1 = scanner.nextInt();
            System.out.print("두 번째 숫자: ");
            int num2 = scanner.nextInt();
            if (num1 == 0 && num2 == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("num1 + num2 = " + (num1 + num2));
        }

        scanner.close();
    }
}
