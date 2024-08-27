package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자와 두 번째 숫자 모두 0을 입력하면 프로그램을 종료합니다.");

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세여: ");
            int num1 = scanner.nextInt();

            System.out.print("두 번째 숫자를 입력하세여: ");
            int num2 = scanner.nextInt();

            if (num1 == 0 && num2 == 0) {
                System.out.println("프로그램 종료");
                break;
            }

            int sum = num1 + num2;
            System.out.println("두 수의 합: " + sum);
        }
    }
}

// - 입력 받은 num1, num2 둘다 함께 0일 때 "프로그램 종료" 를 호출하고 break 을 통해 while 문을 빠져나간다.
// - 비교 연산자를 사용했다. true && true -> true 이다. 따라서 두 조건이 모두 참이어야 if 문의 코드 블럭이 실행된다.
