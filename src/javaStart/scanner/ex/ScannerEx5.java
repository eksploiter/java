// 문제 - 사이 숫자
// 사용자로부터 두 개의 정수를 입력받고, 아 두 정수 사이의 모든 정수를 출력하는 프로그램을 작성하세요.
// - 사용자에게 첫 번째 숫자를 입력받으세요. 변수의 이름은 num1 이어야 합니다.
// - 사용자에게 두 번째 숫자를 입력받으세요. 변수의 이름은 num2 이어야 합니다.
// - 만약 첫 번째 숫자 num1 이 두 번째 숫자 num2 보다 크다면, 두 숫자를 교환하세요.
// - num1 부터 num2 까지 각 숫자를 출력하세요.
// - 출력 결과에 유의하세요. 다음 예시와 같이 2, 3, 4, 5 처럼 , 로 구분해서 출력해야 합니다.

package javaStart.scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            int temp;
            temp = num1;  // int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.print("두 숫자 사이의 모든 정수: ");
        for (int i = num1; i <= num2; i++) { // * 이 부분 헷갈렸음 *
            System.out.print(i);
            if (i != num2) {
                System.out.print(",");
            }
        }
    }
}
