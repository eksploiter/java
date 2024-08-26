// Scanner - 기본 예제
// Scanner 예제2
// 이번에는 Scanner 를 활용하는 간단한 예제를 만들어보자.
// 두 수를 입력받고 그 합을 출력하는 예제이다.

package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 압력하세요: ");
        int num1 = scanner.nextInt();

        System.out.println("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("두 수의 합: " + sum);
    }
}

// 이해하는데 어려움은 없을 것이다.
