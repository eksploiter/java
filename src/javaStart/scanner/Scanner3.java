// Scanner 예제3
// 사용자로부터 두 개의 정수를 입력받고, 더 큰 수를 출력하는 프로그램을 작성해보자.
// 두 숫자가 같은 경우 두 숫자는 같다고 출력하면 된다.
// 조건문을 사용해서 처리할 수 있다.

package javaStart.scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int a = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("더 큰 숫자: " + a);
        } else if (a < b) {
            System.out.println("더 큰 숫자: " + b);
        } else {
            System.out.println("두 숫자는 같다.");
        }

        scanner.close();
    }
}
