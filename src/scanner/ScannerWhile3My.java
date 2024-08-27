// Scanner 반복 예제3
// 사용자 입력을 받아 그 합계를 계산하는 프로그램을 작성해야 한다.
// 사용자는 한 번에 한 개의 정수를 입력할 수 있으며, 사용자가 0을 입력하면 프로그램은 종료된다.
// 이 때, 프로그램이 종료될 때까지 사용자가 입력한 모든 정수의 합을 출력해야한다.

package scanner;

import java.util.Scanner;

public class ScannerWhile3My {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.println("0을 입력하면 프로그램이 종료됩니다.");

        while (true) {
            System.out.print("정수를 입력하세요: ");
            int num = scanner.nextInt();
            if (num == 0) {
                System.out.println("프로그램 종료");
                break;
            }
            sum += num;
        }
        System.out.println("모든 정수의 합: " + sum);

        scanner.close();
    }
}
